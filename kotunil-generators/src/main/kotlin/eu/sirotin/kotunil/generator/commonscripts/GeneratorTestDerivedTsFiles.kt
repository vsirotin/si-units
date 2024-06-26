package eu.sirotin.kotunil.generator.commonscripts

import eu.sirotin.kotunil.generator.SiDerivedUnitDescription
import eu.sirotin.kotunil.generator.SiPrefix
import eu.sirotin.kotunil.generator.generateClassName
import eu.sirotin.kotunil.generator.generateDerivedClassFiles
import eu.sirotin.kotunil.generator.getClassName
import eu.sirotin.kotunil.generator.problematicSymbols
import eu.sirotin.kotunil.generator.siDerivedUnitDescriptions
import eu.sirotin.kotunil.generator.siPrefixes
import java.io.File


fun generateDerivedTestScriptFiles(dir: File, fileExtension: String) {
    if (!dir.exists()) {
        dir.mkdirs()
    }
    generatePackageMainFile(siDerivedUnitDescriptions, dir)
    generateDerivedClassFiles(dir, ::generateSiUnitDerivedClass, fileExtension)
}

private const val suffixMain =
    """   console.log("Fin testDerived")
}"""

private fun generatePackageMainFile(siUnitDescription: List<SiDerivedUnitDescription>, dir: File) {
    val fileName = "DerivedTest.$fileExtension"
    val file = dir.resolve(fileName)
    file.delete()
    val text =siUnitDescription.joinToString(System.lineSeparator()) { generateMainFileLine(it.name) }

    val prefixMain  = """
${generateImports(siUnitDescription)}

export function testDerived() {
   console.log("Start testDerived")"""

    file.writeText(prefixMain + System.lineSeparator() + text + System.lineSeparator() + suffixMain)

}

private fun generateImports(siUnitDescription: List<SiDerivedUnitDescription>): String {
    return siUnitDescription.joinToString(System.lineSeparator()) { generateImportLine(it.name) }
}

private fun generateImportLine(name: String): String {
    val className = generateClassName(name)
    return "import {test$className} from './${className}Test$fileExtensionByImport';"
}

private fun generateMainFileLine(name: String): String {
    return "   test${generateClassName(name)}()"
}
private var className = ""
private fun generateSiUnitDerivedClass(siUnitDescription: SiDerivedUnitDescription, dir: File, fileExtension: String) {
    className = getClassName(siUnitDescription)
    val fileName = "${className}Test.$fileExtension"
    val generatorHeadPart = ::generateDerivedUnitClassHead
    val generatorPrefixes = ::generateDerivedClassPrefixes

    generateDerivedTestClassFile(dir, fileName, generatorHeadPart, className, siUnitDescription, generatorPrefixes)
}


private fun generateDerivedTestClassFile(
    dir: File,
    fileName: String,
    generatorHeadPart: (String, String, String) -> String,
    className: String,
    siUnitDescription: SiDerivedUnitDescription,
    generatorPrefixes: (String, String, List<SiPrefix>)-> String
) {
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generatorHeadPart(
        className,
        siUnitDescription.name,
        siUnitDescription.unitSymbol
    ) +
            generatorPrefixes(
                siUnitDescription.name,
                siUnitDescription.unitSymbol,
                siPrefixes
            )

    file.writeText(classText)
}

private fun generateDerivedUnitClassHead(
    className: String,
    name: String,
    unitSymbol: String
): String {
val headImports = """    
import {checkObjects, checkValues, checkBoolean} from $checkerPath;
$euImport 
${generateObjectNames(className, name, unitSymbol)} 
"""
val headFunStart =    """        
export function test$className() {
   console.log("-Start test$className");      
    """
    return "$headImports$headFunStart"
}

private fun generateObjectNames(className: String, name: String, unitSymbol: String): String {
    val objectNamesPrefix = "const {sirotin: {kotunil: {derived: {$className, "
    val midPart = siPrefixes
        .filter{!problematicSymbols.contains(it.symbol)}
        .joinToString(", ") { generateObjectNamesPair(it, name, unitSymbol) }
    val tail = " }}}} = eu;"
    return objectNamesPrefix + midPart + tail
}

private fun generateObjectNamesPair(siPrefix: SiPrefix, name: String, unitSymbol: String): String {
    return "${siPrefix.name}${name}, ${siPrefix.symbol}$unitSymbol"
}

private fun generateDerivedClassPrefixes(name: String,
                                         unitSymbol: String,
                                         prefixes: List<SiPrefix>): String {
    val postfix = """
    console.log("-Fin test$className");
}
"""
    return prefixes
        .filter{!problematicSymbols.contains(it.symbol)}
        .joinToString(separator = System.lineSeparator(),
            postfix = postfix) {
            generateTextOfDerivedUnitClassForPrefix(
                it,
                name,
                unitSymbol
        )
    }
}

private fun generateTextOfDerivedUnitClassForPrefix(
    prefix: SiPrefix,
    name: String,
    unitSymbol: String
): String {
    val symbol = "${prefix.symbol}$unitSymbol"
    return """
    checkObjects($symbol, new $className(10**${prefix.degree}));
    checkObjects(${prefix.name}$name, $symbol);"""
}
