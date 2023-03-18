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
import java.nio.file.Files
import kotlin.math.abs

private val testClasses = mutableListOf<String>()
fun generateSiUnitsBaseClassesTests() {
    //Generate tester classes
    generateSiUnitBaseTestFiles("${ROOT_KOTLIN_CONSOLE_PATH}base",
        "KotlinConsoleTest.kt",
        ::generateTestClassHeadPart,
        ::generateTestPartForPrefix,
        "   }${System.lineSeparator()}}"
    )

    generateCaller("${ROOT_KOTLIN_CONSOLE_PATH}base",
        "BaseKotlinConsoleTest.kt",
        testClasses,
        ::generateKotlinConsoleTestCaller
    )
}

fun generateKotlinConsoleTestCaller(testClassNames: List<String>, typeName: String): String {
    return """
package eu.sirotin.kotunil.$typeName

fun ${typeName}KotlinConsoleTests() {

    """.trimIndent() +
    testClassNames.joinToString(System.lineSeparator()) { "     ${it}KotlinConsoleTest.kotlinConsoleTest()" } +
"${System.lineSeparator()}}"
}

fun generateCaller(dirPath: String,
        fileName: String,
        testClassNames: List<String>,
        generator: (List<String>, String) -> String,
        typeName: String = "base"
) {
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generator(testClassNames, typeName)

    file.writeText(classText)
}

private fun generateTestClassHeadPart(
    siUnitDescription: SiUnitDescription): String {
    val className = getClassName(siUnitDescription)
    testClasses += className
    val unitSymbol = siUnitDescription.unitSymbol
    return """        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object ${className}KotlinConsoleTest {

    fun kotlinConsoleTest() {

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

val EXCLUDED_ABBREVIATIONS = listOf("as", "kkg") //Name conflicts
private fun generateTestPartForPrefix( siPrefix: SiPrefix,
                                       siUnitDescription: SiUnitDescription): String {
    val className = getClassName(siUnitDescription)
    val  name = siUnitDescription.name
    val unitSymbol = siUnitDescription.unitSymbol

    if("${siPrefix.symbol}$unitSymbol" in  EXCLUDED_ABBREVIATIONS)return "" //Special case with kilogram

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
