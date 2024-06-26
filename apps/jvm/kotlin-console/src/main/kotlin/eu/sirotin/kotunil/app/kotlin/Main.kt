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

package eu.sirotin.kotunil.app.kotlin

import eu.sirotin.kotunil.base.baseKotlinConsoleTests
import eu.sirotin.kotunil.currency.currencyKotlinConsoleTests
import eu.sirotin.kotunil.derived.derivedKotlinConsoleTests
import kotlin.system.exitProcess


fun main() {
    println("Welcome in KotUniL console test!")
    try {
        testAll()
    } catch (e: Throwable) {
        print(e.stackTraceToString())
        exitProcess(1)
    }
    println("")
    println("Test successfully completed!")

    println("-------------------------------------------------------------------------------------------------")
    println("|             |Test number|Number tested KotUniL's objects|Number tested KotUniL's objects types|")
    println("-------------------------------------------------------------------------------------------------")
    println("|Expectation: |     3367  |          741                  |          60                         |")
    println("-------------------------------------------------------------------------------------------------")
    println("|Test results:|     $numberTests  |          ${objects.size}                  |          ${objectTypes.size}                         |")
    println("-------------------------------------------------------------------------------------------------")

}

fun testAll() {
    TutorialTest.testTutorial()
    baseKotlinConsoleTests()
    derivedKotlinConsoleTests()
    currencyKotlinConsoleTests()
}



