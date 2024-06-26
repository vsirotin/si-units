package eu.sirotin.kotunil.generator.commonscripts

import eu.sirotin.kotunil.generator.SiPrefix
import eu.sirotin.kotunil.generator.SiUnitDescription
import eu.sirotin.kotunil.generator.generateBaseClassFile
import eu.sirotin.kotunil.generator.generateClassFiles
import eu.sirotin.kotunil.generator.generateClassName
import eu.sirotin.kotunil.generator.problematicSymbols
import eu.sirotin.kotunil.generator.siUnitDescriptions
import eu.sirotin.kotunil.generator.transformPrefixes
import java.io.File



fun generateBaseTestScriptFiles(dir: File, fileExtension: String) {
    if (!dir.exists()) {
        dir.mkdirs()
    }
    generatePackageMainFile(siUnitDescriptions, dir, fileExtension)
    generateClassFiles(dir, ::generateSiUnitTestBaseTsFiles, fileExtension)
}

private const val suffixMain =
"""   console.log("Fin testBase")
}"""

private fun generatePackageMainFile(siUnitDescription: List<SiUnitDescription>, dir: File, fileExtension: String) {
    val fileName = "BaseTest.$fileExtension"
    val file = dir.resolve(fileName)
    file.delete()
    val text =siUnitDescription.joinToString(System.lineSeparator()) { generateMainFileLine(it.name) }

   val prefixMain  = """
${generateImports(siUnitDescription)}

export function testBase() {
   console.log("Start testBase")"""

    file.writeText(prefixMain + System.lineSeparator() + text + System.lineSeparator() + suffixMain)

}

private fun generateImports(siUnitDescription: List<SiUnitDescription>): String {
    return siUnitDescription.joinToString(System.lineSeparator()) { generateImportLine(it.name) }
}

private fun generateImportLine(name: String): String {
    val className = generateClassName(name)
    return "import {test$className} from './${className}Test$fileExtensionByImport'"
}

private fun generateMainFileLine(name: String): String {
    return "   test${generateClassName(name)}()"
}

private fun generateSiUnitTestBaseTsFiles(siUnitDescription: SiUnitDescription, dir: File, fileExtension: String) {

    val generatorHeadPart = ::generateHeadPart
    val generatorPrefixesPart = ::generatePrefixes
    generateBaseClassFile(siUnitDescription,
        fileExtension,
        dir,
        generatorHeadPart,
        generatorPrefixesPart,
        ::generateFileName)
}

private fun generateFileName(className: String, fileExtension: String): String =
    "${className}Test.$fileExtension"

@Suppress("UNUSED_PARAMETER")
private fun generateHeadPart(
    className: String,
    unitSymbol: String,
    dimensionSymbol: String,
    presentationPriority: Int,
    quantityName: String): String {
    return """  
import {checkObjects, checkValues, checkBoolean} from $checkerPath;
$euImport 
${generateObjectNames(className, unitSymbol)}            
export function test$className() {
   console.log("-Start test$className");      
    """}


private fun generateObjectNames(className: String, unitSymbol: String): String {
    val objectNamesPrefix = "const {sirotin: {kotunil: {base: {$className, "
    val unitName = className.lowercase()
    val prefixes = transformPrefixes(className)
    val midPart = prefixes
        .filter{!problematicSymbols.contains(it.symbol)}
        .joinToString(", ") { generateObjectNamesPair(it, unitName, unitSymbol) }
    val tail = " }}}} = eu;"
    return objectNamesPrefix + midPart + tail
}

private fun generateObjectNamesPair(siPrefix: SiPrefix, unitName: String, unitSymbol: String): String {
    return "${siPrefix.name}${unitName}, ${siPrefix.symbol}$unitSymbol"
}

private fun generatePrefixes(className: String, name: String, unitSymbol: String, prefixes: List<SiPrefix>): String {
    val postfix = """
    console.log("-Fin test$className");
}"""
    return prefixes
        .filter{!problematicSymbols.contains(it.symbol)}
        .joinToString(separator = System.lineSeparator(),
        postfix = postfix) { generateTextForPrefix(it, className, name, unitSymbol) }
}


private fun generateTextForPrefix(siPrefix: SiPrefix, className: String, name: String, unitSymbol: String): String {
    val symbol = "${siPrefix.symbol}$unitSymbol"
    return """
    checkObjects($symbol, new $className(10**${siPrefix.degree}));
    checkObjects(${siPrefix.name}$name, $symbol);"""
}
