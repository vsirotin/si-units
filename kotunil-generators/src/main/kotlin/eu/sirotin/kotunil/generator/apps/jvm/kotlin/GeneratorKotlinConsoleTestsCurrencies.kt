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

package eu.sirotin.kotunil.generator.apps.jvm.kotlin

import eu.sirotin.kotunil.generator.currency.CurrencyDescription
import eu.sirotin.kotunil.generator.currency.currencyDescriptions
import eu.sirotin.kotunil.generator.generateFiles

private val testClasses = mutableListOf<String>()
/**
 * Generates common and jvm-specific currency tests.
 */
fun generateKotlinConsoleTestsCurrencies() {
    //Generate common part
    val generatorCommonName = fun(cd: CurrencyDescription): String = "${cd.name}KotlinConsoleTest.kt"
    val dirPath = "${ROOT_KOTLIN_CONSOLE_PATH}currency"
    generateFiles(
        dirPath,
        currencyDescriptions,
        ::generateCurrencyTestClass,
        generatorCommonName
    )

    generateCaller(dirPath,
        "CurrenciesKotlinConsoleTest.kt",
        testClasses,
        ::generateKotlinConsoleTestCaller,
        "currency"
    )
}

private fun generateCurrencyTestClass(currencyDescription: CurrencyDescription): String {
    var res = "package eu.sirotin.kotunil.currency" + System.lineSeparator()
    res += generateCurrencyTestClassBody(currencyDescription)
    res += "}"
    return res
}

private fun generateCurrencyTestClassBody(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    testClasses += name
    val code = currencyDescription.code
    val symbol = currencyDescription.symbol
    return  """   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object ${name}KotlinConsoleTest {


    fun kotlinConsoleTest() {
        check($code, $name())
        check(12.$code, $name(12.0))

        val s = $code.unitSymbols()
        check("$code", s)

        val s1 = $code.categorySymbols()
        check("$symbol", s1)

        val s2 = $code.dimensions.factors.first().specification.unitSymbol
        check("$code", s2)
        check($symbol, $name())
        check(123.$symbol, 123.$code)

        val c = 12*m3/$symbol
        check("m3/$code", c.unitSymbols())
    }
"""
}






