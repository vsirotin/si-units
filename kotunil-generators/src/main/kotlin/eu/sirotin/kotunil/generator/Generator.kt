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

const val ROOT_PATH_SOURCE = "kotunil/src/commonMain/kotlin/eu/sirotin/kotunil/"
const val ROOT_PATH_TEST = "kotunil/src/commonTest/kotlin/eu/sirotin/kotunil/"

/**
 * Generates production and test unit classes. Not relevant for library users.
 */
fun main() {
    generateSiUnitsClasses()
    generateCurrencies()
    generateTestClasses()
}

private fun generateSiUnitsClasses() {
    generateSiUnitsBaseClasses()
    generateSiUnitsDerivedClasses()
}

private fun generateTestClasses() {
    generateTestsSiUnitsBaseClasses()
    generateTestsSiUnitsDerivedClasses()
}
