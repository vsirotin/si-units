package eu.sirotin.kotunil.generator.javascript

import eu.sirotin.kotunil.generator.SiPrefix
import eu.sirotin.kotunil.generator.SiUnitDescription
import eu.sirotin.kotunil.generator.generateBaseClassFile
import eu.sirotin.kotunil.generator.generateClassFiles
import java.io.File

fun generateSiUnitsBaseJsFiles() {
    //Generate package directory if not exists
    val dir = File("${ROOT_JS}base")
    generateClassFiles(dir, ::generateSiUnitBaseJsFiles)
}

private fun generateSiUnitBaseJsFiles(siUnitDescription: SiUnitDescription, dir: File) {
    val fileExtension = "js"
    val generatorHeadPart = ::generateHeadPart
    val generatorPrefixesPart = ::generatePrefixes
    generateBaseClassFile(siUnitDescription, fileExtension, dir, generatorHeadPart, generatorPrefixesPart)
}

private fun generateHeadPart(
    className: String,
    unitSymbol: String,
    dimensionSymbol: String,
    presentationPriority: Int,
    quantityName: String): String {
    return """
        const $className = KotUniL.eu.sirotin.kotunil.base.$className;
        const $unitSymbol = new $className(1); 
        """}

private fun generatePrefixes(className: String, name: String, unitSymbol: String, prefixes: List<SiPrefix>): String {
    return prefixes.joinToString(System.lineSeparator()) { generateTextForPrefix(it, className, name, unitSymbol) }
}


private fun generateTextForPrefix(siPrefix: SiPrefix, className: String, name: String, unitSymbol: String): String {
    val symbol = "${siPrefix.symbol}$unitSymbol"
    return """
        const $symbol = new $className(10**${siPrefix.degree});
        const ${siPrefix.name}$name = $symbol;"""
}
