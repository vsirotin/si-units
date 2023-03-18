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

package eu.sirotin.kotunil.generator.apps.jvm.java

import eu.sirotin.kotunil.generator.CurrencyDescription
import eu.sirotin.kotunil.generator.SiDerivedUnitDescription
import eu.sirotin.kotunil.generator.currencyDescriptions
import eu.sirotin.kotunil.generator.generateFiles

private val testClasses = mutableListOf<String>()
/**
 * Generates common and jvm-specific currency tests.
 */
fun generateJavaConsoleTestsCurrencies() {
    //Generate common part
    val generatorCommonName = fun(cd: CurrencyDescription): String = "${cd.name}JavaConsoleTest.java"
    val dirPath = "${ROOT_JAVA_CONSOLE_PATH}currency"
    generateFiles(
        dirPath,
        currencyDescriptions,
        ::generateCurrencyTestClass,
        generatorCommonName
    )

    generateCaller(dirPath,
        "CurrencyJavaConsoleTest.java",
        testClasses,
        ::generateJavaConsoleTestCaller,
        "currency"
    )
}

private fun generateCurrencyTestClass(currencyDescription: CurrencyDescription): String {
    var res = "package eu.sirotin.kotunil.currency;" + System.lineSeparator()
    res += generateCurrencyTestClassBody(currencyDescription)
    res += "}"
    return res
}

private fun generateCurrencyTestClassBody(currencyDescription: CurrencyDescription): String {
    val name = currencyDescription.name
    val className = name.first().uppercaseChar() + name.drop(1)
    testClasses += name
    val code = currencyDescription.code
    val symbol = currencyDescription.symbol
    return  """   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.${className}Kt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  ${className}JavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check($code, new $name());
        Checker.check($code.times(12), new $name(12.0));

        String s = $code.unitSymbols();
        Checker.check("$code", s);

        String s1 = $code.categorySymbols();
        Checker.check("$symbol", s1);
        
        Expression c = m3.times(23).div($code);
        Checker.check("m3/$code", c.unitSymbols());
    }
"""
}






