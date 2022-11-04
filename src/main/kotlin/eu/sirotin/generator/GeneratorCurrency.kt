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

val currencyDescriptions = listOf(
    SpecialUnitDescription("UnitedStatesDollar", "USD", "`US$`"),
    SpecialUnitDescription("Euro", "EUR", "`€`"),
    SpecialUnitDescription("JapaneseYen", "JPY",  "`¥`"),
    SpecialUnitDescription("PoundSterling", "GBP", "`£`"),
    SpecialUnitDescription("Renminbi", "CNY", "`人民币`"),
    SpecialUnitDescription("AustralianDollar", "AUD", "`A$`"),
    SpecialUnitDescription("CanadianDollar", "CAD", "`C$`"),
    SpecialUnitDescription("SwissFranc", "CHF", "SCHF"), //To avoid name conflict for CHF
    SpecialUnitDescription("HongKongDollar", "HKD", "`HK$`"),
    SpecialUnitDescription("SingaporeDollar", "SGD", "`S$`"),
    SpecialUnitDescription("SwedishKrona", "SEK", "skr"), //To avoid name conflict for symbol 'kr'
    SpecialUnitDescription("SouthKoreanWon", "KRW", "`₩`"),
    SpecialUnitDescription("NorwegianKrone", "NOK", "nkr"), //To avoid name conflict for symbol 'kr'
    SpecialUnitDescription("NewZealandDollar", "NZD", "`NZ$`"),
    SpecialUnitDescription("IndianRupee", "INR", "`₹`"),
    SpecialUnitDescription("MexicanPeso", "MXN", "`$`"),
    SpecialUnitDescription("NewTaiwanDollar", "TWD", "`NT$`"),
    SpecialUnitDescription("SouthAfricanRand", "ZAR", "R"),
    SpecialUnitDescription("BrazilianReal", "BRL", "`R$`"),
    SpecialUnitDescription("DanishKrone", "DKK", "dkr"), //To avoid name conflict for symbol 'kr'
    SpecialUnitDescription("PolishZłoty", "PLN", "`zł`"),
    SpecialUnitDescription("ThaiBaht", "THB", "`฿`"),
    SpecialUnitDescription("IsraeliNewShekel", "ILS", "`₪`"),
    SpecialUnitDescription("IndonesianRupiah", "IDR", "Rp"),
    SpecialUnitDescription("CzechKoruna", "CZK", "`Kč`"),
    SpecialUnitDescription("UAEDirham", "AED", "Dh"),
    SpecialUnitDescription("TurkishLira", "TRY", "`₺`"),
    SpecialUnitDescription("HungarianForint", "HUF", "Ft"),
    SpecialUnitDescription("ChileanPeso", "CLP", "`CLP$`"),
    SpecialUnitDescription("SaudiRiyal", "SAR", "`﷼ `"),
    SpecialUnitDescription("PhilippinePeso", "PHP", "`₱`"),
    SpecialUnitDescription("MalaysianRinggit", "MYR", "RM"),
    SpecialUnitDescription("ColombianPeso", "COP", "`COL$`"),
    SpecialUnitDescription("RussianRuble", "RUB", "`₽`"),
    SpecialUnitDescription("RomanianLeu", "RON", "L")
)

fun generateCurrencies() {
    generateSpecialUnits("src/main/kotlin/eu/sirotin/currency", currencyDescriptions, ::generateCurrencyClass)
}

fun generateCurrencyClass(currencyDescription: SpecialUnitDescription): String {
    val name = currencyDescription.name
    val code = currencyDescription.code
    val symbol = currencyDescription.symbol
    return """
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
}

