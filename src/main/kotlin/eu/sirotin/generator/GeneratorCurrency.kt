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
 *  *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 */

package eu.sirotin.generator

import java.io.File
import java.nio.file.Files

val currencyDescriptions = listOf(
    CurrencyDescription("UnitedStatesDollar", "USD", "`US$`"),
    CurrencyDescription("Euro", "EUR", "`€`"),
    CurrencyDescription("JapaneseYen", "JPY",  "`¥`"),
    CurrencyDescription("PoundSterling", "GBP", "`£`"),
    CurrencyDescription("Renminbi", "CNY", "`人民币`"),
    CurrencyDescription("AustralianDollar", "AUD", "`A$`"),
    CurrencyDescription("CanadianDollar", "CAD", "`C$`"),
    CurrencyDescription("SwissFranc", "CHF", "SCHF"), //To avoid name conflict for CHF
    CurrencyDescription("HongKongDollar", "HKD", "`HK$`"),
    CurrencyDescription("SingaporeDollar", "SGD", "`S$`"),
    CurrencyDescription("SwedishKrona", "SEK", "skr"), //To avoid name conflict for symbol 'kr'
    CurrencyDescription("SouthKoreanWon", "KRW", "`₩`"),
    CurrencyDescription("NorwegianKrone", "NOK", "nkr"), //To avoid name conflict for symbol 'kr'
    CurrencyDescription("NewZealandDollar", "NZD", "`NZ$`"),
    CurrencyDescription("IndianRupee", "INR", "`₹`"),
    CurrencyDescription("MexicanPeso", "MXN", "`$`"),
    CurrencyDescription("NewTaiwanDollar", "TWD", "`NT$`"),
    CurrencyDescription("SouthAfricanRand", "ZAR", "R"),
    CurrencyDescription("BrazilianReal", "BRL", "`R$`"),
    CurrencyDescription("DanishKrone", "DKK", "dkr"), //To avoid name conflict for symbol 'kr'
    CurrencyDescription("PolishZłoty", "PLN", "`zł`"),
    CurrencyDescription("ThaiBaht", "THB", "`฿`"),
    CurrencyDescription("IsraeliNewShekel", "ILS", "`₪`"),
    CurrencyDescription("IndonesianRupiah", "IDR", "Rp"),
    CurrencyDescription("CzechKoruna", "CZK", "`Kč`"),
    CurrencyDescription("UAEDirham", "AED", "Dh"),
    CurrencyDescription("TurkishLira", "TRY", "`₺`"),
    CurrencyDescription("HungarianForint", "HUF", "Ft"),
    CurrencyDescription("ChileanPeso", "CLP", "`CLP$`"),
    CurrencyDescription("SaudiRiyal", "SAR", "`﷼ `"),
    CurrencyDescription("PhilippinePeso", "PHP", "`₱`"),
    CurrencyDescription("MalaysianRinggit", "MYR", "RM"),
    CurrencyDescription("ColombianPeso", "COP", "`COL$`"),
    CurrencyDescription("RussianRuble", "RUB", "`₽`"),
    CurrencyDescription("RomanianLeu", "RON", "L")

)

data class CurrencyDescription(val name: String,
                             val code: String,
                             val symbol: String)

fun generateCurrencies() {
    //Generate package directory if not exists
    val dir = File("src/main/kotlin/eu/sirotin/currency")
    if(!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    currencyDescriptions.forEach { generateCurrency(it, dir) }
}

private fun generateCurrency(currencyDescription: CurrencyDescription, dir: File) {
    val className = currencyDescription.name

    val fileName = "$className.kt"
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generateCurrencyClass(currencyDescription)

    file.writeText(classText)
}

fun generateCurrencyClass(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val code = currencyDescription.code
    val symbol = currencyDescription.symbol
    val res = """
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val description$name = UnitSpecification(
    "$code",
    "$symbol"
) { v: Double -> $name(v) }

class $name(value : Double = 1.0) : TermUnit(value, description = description$name)
    val Number.$code : $name
        get() = $name(this.toDouble())
    
    val $code = $name()

    val Number.$symbol : $name
        get() = $name(this.toDouble())

    val $symbol = $name()
    """
    return res
}
