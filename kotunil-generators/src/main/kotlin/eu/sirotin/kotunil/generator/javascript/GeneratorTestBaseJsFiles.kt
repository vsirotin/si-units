package eu.sirotin.kotunil.generator.javascript

import eu.sirotin.kotunil.generator.SiPrefix
import eu.sirotin.kotunil.generator.SiUnitDescription
import eu.sirotin.kotunil.generator.generateBaseClassFile
import eu.sirotin.kotunil.generator.generateClassFiles
import java.io.File

fun generateSiUnitsTestBaseJsFiles() {
    //Generate package directory if not exists
    val dir = File("${ROOT_JS_TESTS}base")
    generateClassFiles(dir, ::generateSiUnitTestBaseJsFiles)
}

private fun generateSiUnitTestBaseJsFiles(siUnitDescription: SiUnitDescription, dir: File) {
    val fileExtension = "js"
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
function test$className() {
   console.log("-Start test$className");      
    """}

private fun generatePrefixes(className: String, name: String, unitSymbol: String, prefixes: List<SiPrefix>): String {
    val postfix = """
    console.log("-Fin test$className");
}"""
    return prefixes.joinToString(separator = System.lineSeparator(),
        postfix = postfix) { generateTextForPrefix(it, className, name, unitSymbol) }
}


private fun generateTextForPrefix(siPrefix: SiPrefix, className: String, name: String, unitSymbol: String): String {
    val symbol = "${siPrefix.symbol}$unitSymbol"
    return """
    checkObjects($symbol, new $className(10**${siPrefix.degree}));
    checkObjects(${siPrefix.name}$name, $symbol);"""
}
