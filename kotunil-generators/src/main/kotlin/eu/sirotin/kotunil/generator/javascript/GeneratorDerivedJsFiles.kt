package eu.sirotin.kotunil.generator.javascript

import eu.sirotin.kotunil.generator.SiDerivedUnitDescription
import eu.sirotin.kotunil.generator.SiPrefix
import eu.sirotin.kotunil.generator.generateDerivedClassFile
import eu.sirotin.kotunil.generator.generateDerivedClassFiles
import eu.sirotin.kotunil.generator.getClassName
import java.io.File

fun generateSiUnitsDerivedJsFiles() {
    //Generate package directory if not exists
    val dir = File("${ROOT_JS}derived")
    generateDerivedClassFiles(dir, ::generateSiUnitDerivedClass)
}

var className = ""
private fun generateSiUnitDerivedClass(siUnitDescription: SiDerivedUnitDescription, dir: File) {
    className = getClassName(siUnitDescription)
    val fileName = "$className.js"
    val generatorHeadPart = ::generateDerivedUnitClassHead
    val generatorPrefixes = ::generateDerivedClassPrefixes

    generateDerivedClassFile(dir, fileName, generatorHeadPart, className, siUnitDescription, generatorPrefixes)
}

private fun generateDerivedUnitClassHead(
    className: String,
    unitSymbol: String,
    formula: String,
    quantityName: String
): String {
    return """
    const $className =  KotUniL.eu.sirotin.kotunil.derived.$className;   
    const $unitSymbol = new $className(1);
    """}

private fun generateDerivedClassPrefixes(name: String,
                                         unitSymbol: String,
                                         formula: String,
                                         quantity: String,
                                         prefixes: List<SiPrefix>): String {
    return prefixes.joinToString(System.lineSeparator()) {
        generateTextOfDerivedUnitClassForPrefix(
            it,
            name,
            unitSymbol,
            formula,
            quantity
        )
    }
}

private fun generateTextOfDerivedUnitClassForPrefix(
    prefix: SiPrefix,
    name: String,
    unitSymbol: String,
    formula: String,
    quantityName: String
): String {
    val symbol = "${prefix.symbol}$unitSymbol"
    return """
    const $symbol = new $className(10**${prefix.degree}).expression;
    const ${prefix.name}$unitSymbol = $symbol;"""}