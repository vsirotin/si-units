/*
 * Copyright (c) 2022.  Viktor Sirotin
 *
 *  *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  *  furnished to do so, subject to the following conditions:
 *  *  This Copyright header should still in file if you use it file without changes or
 *  * with changes or if you copy essential part of this file in some new file.
 *  *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 */

package eu.sirotin.kotunil.generator

const val TEST_SYMBOL_IMPORTS = """
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
"""

/**
 * List of most traded currencies
 */
val currencyDescriptions = listOf(
    CurrencyDescription("UnitedStatesDollar", "USD", "`US$`", "United States dollar"),
    CurrencyDescription("Euro", "EUR", "`€`", "Euro"),
    CurrencyDescription("JapaneseYen", "JPY",  "`¥`", "Japanese yen"),
    CurrencyDescription("PoundSterling", "GBP", "`£`", "Sterling"),
    CurrencyDescription("Renminbi", "CNY", "`人民币`", "Renminbi"),
    CurrencyDescription("AustralianDollar", "AUD", "`A$`", "Australian dollar"),
    CurrencyDescription("CanadianDollar", "CAD", "`C$`", "Canadian dollar"),
    CurrencyDescription("SwissFranc", "CHF", "SCHF", "Swiss franc"), //To avoid name conflict for CHF
    CurrencyDescription("HongKongDollar", "HKD", "`HK$`", "Hong Kong dollar"),
    CurrencyDescription("SingaporeDollar", "SGD", "`S$`", "Singapore dollar"),
    CurrencyDescription("SwedishKrona", "SEK", "skr", "Swedish krona"), //To avoid name conflict for symbol 'kr'
    CurrencyDescription("SouthKoreanWon", "KRW", "`₩`", " South Korean won"),
    CurrencyDescription("NorwegianKrone", "NOK", "nkr", "Norwegian krone"), //To avoid name conflict for symbol 'kr'
    CurrencyDescription("NewZealandDollar", "NZD", "`NZ$`", "New Zealand dollar"),
    CurrencyDescription("IndianRupee", "INR", "`₹`", "Indian rupee"),
    CurrencyDescription("MexicanPeso", "MXN", "`$`", "Mexican peso"),
    CurrencyDescription("NewTaiwanDollar", "TWD", "`NT$`", "New Taiwan dollar"),
    CurrencyDescription("SouthAfricanRand", "ZAR", "R", "South African rand"),
    CurrencyDescription("BrazilianReal", "BRL", "`R$`", "Brazilian real"),
    CurrencyDescription("DanishKrone", "DKK", "dkr", "Danish krone"), //To avoid name conflict for symbol 'kr'
    CurrencyDescription("PolishZłoty", "PLN", "`zł`", "Polish złoty"),
    CurrencyDescription("ThaiBaht", "THB", "`฿`", "Thai baht"),
    CurrencyDescription("IsraeliNewShekel", "ILS", "`₪`", "Israeli new shekel"),
    CurrencyDescription("IndonesianRupiah", "IDR", "Rp", "Indonesian rupiah"),
    CurrencyDescription("CzechKoruna", "CZK", "`Kč`", " Czech koruna"),
    CurrencyDescription("UAEDirham", "AED", "Dh", "UAE dirham"),
    CurrencyDescription("TurkishLira", "TRY", "`₺`", "Turkish lira"),
    CurrencyDescription("HungarianForint", "HUF", "Ft", "Hungarian forint"),
    CurrencyDescription("ChileanPeso", "CLP", "`CLP$`", "Chilean peso"),
    CurrencyDescription("SaudiRiyal", "SAR", "`﷼ `", "Saudi riyal"),
    CurrencyDescription("PhilippinePeso", "PHP", "`₱`", "Philippine peso"),
    CurrencyDescription("MalaysianRinggit", "MYR", "RM", "Malaysian ringgit"),
    CurrencyDescription("ColombianPeso", "COP", "`COL$`", "Colombian peso"),
    CurrencyDescription("RussianRuble", "RUB", "`₽`", "Russian ruble"),
    CurrencyDescription("RomanianLeu", "RON", "RL", "Romanian leu") //to avoid conflict with liter
)

data class CurrencyDescription(val name: String,
                               val code: String,
                               val symbol: String,
                               val description: String)


/**
 * Generates currency classes and their Jvm parts.
 */
fun generateCurrencies() {
    val targetDirPath = "${ROOT_PATH_SOURCE_COMMON}currency"
    val fileExtension = "kt"
    val generatorCurrencyFileContent = ::generateCurrencyClass
    generateCurrenciesFiles(fileExtension, targetDirPath, generatorCurrencyFileContent)

    //Generate JVM part
    val generatorJvmName = fun(cd:CurrencyDescription): String = "${cd.name}Jvm.kt"
    generateFiles("${ROOT_PATH_SOURCE_JVM}currency",
        currencyDescriptions,
        ::generateCurrencyJvmPart,
        generatorJvmName
    )
}

fun generateCurrenciesFiles(
    fileExtension: String,
    targetDirPath: String,
    generatorCurrencyFileContent: (CurrencyDescription) -> String
) {
    val generatorFileName = fun(cd: CurrencyDescription): String = "${cd.name}.$fileExtension"
    generateFiles(
        targetDirPath,
        currencyDescriptions,
        generatorCurrencyFileContent,
        generatorFileName
    )
}

/**
 * Generates common and jvm-specific currency tests.
 */
fun generateTestsCurrencies() {
    //Generate common part
    val generatorCommonName = fun(cd:CurrencyDescription): String = "${cd.name}Test.kt"
    generateFiles("${ROOT_PATH_TEST_COMMON}currency",
        currencyDescriptions,
        ::generateCurrencyTestClass,
        generatorCommonName
    )

    //Generate JVM part
    val generatorJvmName = fun(cd:CurrencyDescription): String = "${cd.name}JvmTest.kt"
    generateFiles("${ROOT_PATH_TEST_JVM}currency",
        currencyDescriptions,
        ::generateCurrencyTestJvmPart,
        generatorJvmName
    )
}

private fun generateCurrencyClass(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val code = currencyDescription.code
    val symbol = currencyDescription.symbol
    val desc = currencyDescription.description
    var res = """
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val description$name = UnitSpecification(
    "$code",
    "$symbol"
) { v: Double -> $name(v) }

/**
* Class for hold of $desc
* @constructor Creates a class for hold of $desc with given [value]
*/
@JsExport
class $name(value : Double = 1.0) : Expression(value, description = description$name)
    
    /**
    * Creates object for hold of $desc
    */
    val Number.$code : $name
        /**
        * Returns value of object for hold of $desc
        */
        get() = $name(this.toDouble())

    /**
    * Holder for  of $desc
    */
    @JsExport
    @JsName("$code")
    @JvmField
    val $code = $name()   
    """
    if(!currencyDescription.isJvmSpecific()){
        res += generateSymbolPart(currencyDescription)
    }
    return res
}

private fun generateCurrencyJvmPart(currencyDescription: CurrencyDescription): String {
    if(!currencyDescription.isJvmSpecific())return ""

    return "package eu.sirotin.kotunil.currency" +
            System.lineSeparator() +
            generateSymbolPart(currencyDescription)
}

private fun generateSymbolPart(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val symbol = currencyDescription.symbol
    val desc = currencyDescription.description
    return """

/**
* Creates object for hold of $desc
*/
val Number.$symbol : $name
    /**
    * Returns value of object for hold of $desc
    */
    get() = $name(this.toDouble())

/**
* One unit of $desc
*/
val $symbol = $name()
"""
}

private fun generateCurrencyTestClass(currencyDescription: CurrencyDescription): String {
    var res = "package eu.sirotin.kotunil.currency" + System.lineSeparator()

    if(!currencyDescription.isJvmSpecific()) {
        res += TEST_SYMBOL_IMPORTS
    }

    res += generateCurrencyTestClassBody(currencyDescription)

    if(!currencyDescription.isJvmSpecific()) {
        res += generateSymbolTestPart(currencyDescription)
    }
    res += "}"
    return res
}

private fun generateCurrencyTestClassBody(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val code = currencyDescription.code
    val symbol = currencyDescription.symbol
    return  """   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ${name}Test {

    @Test
    fun testCreation() {
        assertEquals($code, $name())
        assertEquals(12.$code, $name(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = $code.unitSymbols()
        assertEquals("$code", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = $code.categorySymbols()
        assertEquals("$symbol", s)
    }

    @Test
    fun getDimensions() {
        val s = $code.dimensions.factors.first().specification.unitSymbol
        assertEquals("$code", s)
    }
"""
}

private fun generateCurrencyTestJvmPart(currencyDescription: CurrencyDescription): String {
    if(currencyDescription.isJvmSpecific())return ""
    val name = currencyDescription.name
    return """
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class ${name}TestJvm {

""" +
    generateSymbolTestPart(currencyDescription) +
    "}"

}

private fun generateSymbolTestPart(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val symbol = currencyDescription.symbol
    val code = tuneRegexSymbols(currencyDescription.code)
    return """
    @Test
    fun testCreationJvm() {
        assertEquals($symbol, $name())
        assertEquals(123.$symbol, 123.$code)
    }

    @Test
    fun testCost() {
        val c = 12*m3/$symbol
        assertEquals("m3/$code", c.unitSymbols())
    }
"""
}

private fun tuneRegexSymbols(s: String): String {
    return s.replace("$", "${'$'}")
}

private fun CurrencyDescription.isJvmSpecific(): Boolean = this.symbol.contains('`')





