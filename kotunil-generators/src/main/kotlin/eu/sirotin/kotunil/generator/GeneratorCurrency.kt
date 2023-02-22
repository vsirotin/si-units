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

import java.io.File
import java.nio.file.Files

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
    CurrencyDescription("RomanianLeu", "RON", "L", "Romanian leu")
)

data class CurrencyDescription(val name: String,
                               val code: String,
                               val symbol: String,
                               val description: String)

fun generateCurrencies(
    dirPath: String,
    unitDescriptions: List<CurrencyDescription>,
    generator: (CurrencyDescription) -> String
) {
    //Generate package directory if not exists
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    unitDescriptions.forEach { generateCurrencyClass(it, dir, generator) }
}

private fun generateCurrencyClass(description: CurrencyDescription, dir: File, generator: (CurrencyDescription) -> String) {
    val className = description.name

    val fileName = "$className.kt"
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generator.invoke(description)

    file.writeText(classText)
}

/**
 * Generates currency classes.
 */
fun generateCurrencies() {
    generateCurrencies("${ROOT_PATH_SOURCE}currency",
        currencyDescriptions,
        ::generateCurrencyClass
    )
}

private fun generateCurrencyClass(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val code = currencyDescription.code
    val symbol = currencyDescription.symbol
    val desc = currencyDescription.description
    return """
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val description$name = UnitSpecification(
    "$code",
    "$symbol"
) { v: Double -> $name(v) }

/**
* Class for hold of $desc
* @constructor Creates a class for hold of $desc with given [value]
*/
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
    val $code = $name()

    
    
    """
}

