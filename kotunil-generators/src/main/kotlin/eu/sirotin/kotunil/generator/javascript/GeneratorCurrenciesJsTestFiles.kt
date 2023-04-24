package eu.sirotin.kotunil.generator.javascript


import eu.sirotin.kotunil.generator.CurrencyDescription
import eu.sirotin.kotunil.generator.currencyDescriptions
import java.io.File
import java.nio.file.Files

private const val HEAD = """
function testCurrencies() {
    console.log("Start testCurrencies");    
"""

private const val TAIL = """
    console.log("Fin testCurrencies");
}"""

fun generateCurrenciesTestJsFile() {

    val dirPath = "${ROOT_JS_TESTS}currency"
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())

    val fileName = "CurrenciesTest.js"

    val file = dir.resolve(fileName)
    file.delete()

    file.appendText(HEAD)
    currencyDescriptions.forEach { file.appendText(generateCurrencyDefinition(it))}
    file.appendText(TAIL)
}


private fun generateCurrencyDefinition(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val code = currencyDescription.code
    val desc = currencyDescription.description
    return """
//Test of $desc
var c1$code = $code.times(16.1);
var c2$code = new $name(16.1);
checkObjects(c1$code, c2$code);
"""
}
