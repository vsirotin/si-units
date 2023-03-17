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

import eu.sirotin.kotunil.generator.SiDerivedUnitDescription
import eu.sirotin.kotunil.generator.SiPrefix
import eu.sirotin.kotunil.generator.generateDerivedTest
import eu.sirotin.kotunil.generator.getDerivedClassName

private val testClasses = mutableListOf<String>()
fun generateSiUnitsDerivedClassesTests() {
    generateDerivedTest("${ROOT_JAVA_CONSOLE_PATH}derived",
        ::generateTestClassHeadPart,
        ::generateUnitTestForPrefix,
        "JavaConsoleTest.java",
            "   }${System.lineSeparator()}}"
    )

    generateCaller("${ROOT_JAVA_CONSOLE_PATH}derived",
        "DerivedJavaConsoleTest.java",
        testClasses,
        ::generateJavaConsoleTestCaller,
        "derived"
    )
}

private fun generateTestClassHeadPart(description: SiDerivedUnitDescription): String {
    val className = getDerivedClassName(description)
    testClasses += className
    val unitSymbol = description.unitSymbol
    return """        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.Java.check
import Java.math.pow

object ${className}JavaConsoleTest {

    fun JavaConsoleTest() {
        check(1.$unitSymbol , $unitSymbol)
    """
}

private fun generateUnitTestForPrefix(siPrefix: SiPrefix, description: SiDerivedUnitDescription): String {
    val name = description.name
    val unitSymbol = description.unitSymbol
    val powName = generatePowName(siPrefix.degree)
    return """          
        val $powName = 10.0.pow(${siPrefix.degree})
        check(1.${siPrefix.symbol}$unitSymbol.value, ${unitSymbol}.value*$powName)
        check(1.${siPrefix.name}$name.value, ${unitSymbol}.value*$powName)
        check(1.${siPrefix.symbol}$unitSymbol , ${siPrefix.symbol}$unitSymbol)
        check(${siPrefix.name}$name, ${siPrefix.symbol}$unitSymbol)"""
}



