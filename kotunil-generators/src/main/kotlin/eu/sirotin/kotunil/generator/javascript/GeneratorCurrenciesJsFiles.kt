package eu.sirotin.kotunil.generator.javascript


import eu.sirotin.kotunil.generator.CurrencyDescription
import eu.sirotin.kotunil.generator.currencyDescriptions
import java.io.File
import java.nio.file.Files


fun generateCurrenciesJsFile() {

    val dirPath = "${ROOT_JS_LIB}currency"
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())

    val fileName = "Currencies.js"

    val file = dir.resolve(fileName)
    file.delete()

    currencyDescriptions.forEach { file.appendText(generateCurrencyDefinition(it))}
}


private fun generateCurrencyDefinition(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val code = currencyDescription.code
    val desc = currencyDescription.description
    return """
//Definition of $desc
const $name =  KotUniL.eu.sirotin.kotunil.currency.$name;
const $code = new $name(1);
"""
}