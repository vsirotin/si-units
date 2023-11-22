package eu.sirotin.kotunil.generator.typescript


import eu.sirotin.kotunil.generator.currency.CurrencyDescription
import eu.sirotin.kotunil.generator.currency.currencyDescriptions
import java.io.File
import java.nio.file.Files


private const val TAIL = """
    console.log("Fin testCurrencies");
}"""

fun generateCurrenciesTestTsFile() {

    val head = """
import {checkObjects} from '../../checker'
import {eu} from 'kotunil-js-lib'
const {sirotin: {kotunil: {currency: {${generateCurrencyPairs(currencyDescriptions)}}}}} = eu
    
export function testCurrencies() {
    console.log("Start testCurrencies");    
"""

    val dirPath = "${ROOT_TS_TESTS}currency"
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())

    val fileName = "CurrenciesTest.ts"

    val file = dir.resolve(fileName)
    file.delete()

    file.appendText(head)
    currencyDescriptions.forEach { file.appendText(generateCurrencyDefinition(it))}
    file.appendText(TAIL)
}

private fun generateCurrencyPairs(currencyDescriptions: List<CurrencyDescription>): String {
    return currencyDescriptions.joinToString(", ") { "${it.name}, ${it.code}" }
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
