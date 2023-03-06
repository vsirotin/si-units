/*
 * Copyright (c) 2023.  Viktor Sirotin
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

import eu.sirotin.kotunil.generator.SiPrefix
import eu.sirotin.kotunil.generator.SiUnitDescription
import eu.sirotin.kotunil.generator.generateSiUnitBaseTestFiles
import eu.sirotin.kotunil.generator.getClassName
import java.io.File
import kotlin.math.abs

fun generateSiUnitsBaseClassesTests() {
    //Generate package directory if not exists
    val dir = File("${ROOT_KOTLIN_CONSOLE_PATH}base")
    generateSiUnitBaseTestFiles("${ROOT_KOTLIN_CONSOLE_PATH}base",
        "KotlinConsoleTest.kt",
        ::generateTestClassHeadPart,
        ::generateTestPartForPrefix,
        "   }${System.lineSeparator()}}"
    )
}

private fun generateTestClassHeadPart(
    siUnitDescription: SiUnitDescription): String {
    val className = getClassName(siUnitDescription)
    val unitSymbol = siUnitDescription.unitSymbol
    return """        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object ${className}KotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++

        check(${className}(1.0), $unitSymbol)
        check(1.$unitSymbol , $unitSymbol)

        //Serialization
        val v1 = ${className}(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = ${className}(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        check(v1 , v2)
"""
}

val exclusions = listOf("as", "kkg") //Name conflicts
private fun generateTestPartForPrefix( siPrefix: SiPrefix,
                                       siUnitDescription: SiUnitDescription): String {
    val className = getClassName(siUnitDescription)
    val  name = siUnitDescription.name
    val unitSymbol = siUnitDescription.unitSymbol

    if("${siPrefix.symbol}$unitSymbol" in  exclusions)return "" //Special case with kilogram

    val symbolForTestName = if(siPrefix.symbol.first().isLowerCase()) siPrefix.symbol.uppercase() + "1" else siPrefix.symbol
    val powName = generatePowName(siPrefix.degree)
    return """   
        val $powName = 10.0.pow(${siPrefix.degree})
        check($powName * $className(1.0), 1.${siPrefix.symbol}$unitSymbol)
        check($powName * $className(1.0), 1.${siPrefix.name}$name)
        check(1.${unitSymbol}.${siPrefix.symbol}$unitSymbol , ${unitSymbol}.value/$powName)
        check(1.${unitSymbol}.${siPrefix.name}$name , ${unitSymbol}.value/$powName)
        check(1.${siPrefix.symbol}$unitSymbol , ${siPrefix.symbol}$unitSymbol)
        check(${siPrefix.name}$name , ${siPrefix.symbol}$unitSymbol) 
"""
}
fun generatePowName(degree: Int): String {
    return "pow" + if(degree >= 0) degree else "M${abs(degree)}"
}
