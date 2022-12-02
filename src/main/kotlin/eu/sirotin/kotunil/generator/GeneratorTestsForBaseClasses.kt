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


fun generateTestsSiUnitsBaseClasses() {
    //Generate package directory if not exists
    val dir = File("src/test/kotlin/eu/sirotin/kotunil/base")
    if(!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    siUnitDescriptions.forEach { generateTestForSiUnitBaseClass(it, dir) }
}

private fun generateTestForSiUnitBaseClass(siUnitDescription: SiUnitDescription, dir: File) {
    val className = siUnitDescription.name.first().uppercaseChar() + siUnitDescription.name.drop(1)
    val prefixes = if(className != "Kilogram") siPrefixes else generatePrefixesForKilogram()

    val fileName = "${className}Test.kt"
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generateTestClassHeadPart(className,
        siUnitDescription.unitSymbol) +
        generateTestsForPrefixes(className, siUnitDescription.name, siUnitDescription.unitSymbol, prefixes) +
        "}"
    
    file.writeText(classText)
}

private fun generateTestClassHeadPart(
    className: String,
    unitSymbol: String
): String {
    return """        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.EPS
import eu.sirotin.kotunil.core.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class ${className}Test {

    @Test
    fun test${className}MainTest() {
        assertEquals(${className}(1.0), $unitSymbol)
        assertEquals(1.$unitSymbol , $unitSymbol)
    }
    """
}


private fun generateTestsForPrefixes(className: String, name: String, unitSymbol: String, prefixes: List<SiPrefix>): String {
    return prefixes.joinToString(System.lineSeparator()) { generateUnitTestForPrefix(it, className, name, unitSymbol) }
}

val exclusions = listOf("as", "kkg") //Name conflicts
private fun generateUnitTestForPrefix(siPrefix: SiPrefix, className: String, name: String, unitSymbol: String): String {

    if("${siPrefix.symbol}$unitSymbol" in  exclusions)return "" //Special case with kilogram

    val symbolForTestName = if(siPrefix.symbol.first().isLowerCase()) siPrefix.symbol.uppercase() + "1" else siPrefix.symbol

    return """          
    @Test
    fun test$className$symbolForTestName${unitSymbol}Test() {
        val myPow = 10.0.pow(${siPrefix.degree})
        assertEquals(myPow * $className(1.0), 1.${siPrefix.symbol}$unitSymbol)
        assertEquals(myPow * $className(1.0), 1.${siPrefix.name}$name)
        assertEquals(1.${unitSymbol}.${siPrefix.symbol}$unitSymbol , ${unitSymbol}.value/myPow, EPS)
        assertEquals(1.${unitSymbol}.${siPrefix.name}$name , ${unitSymbol}.value/myPow, EPS)
        assertEquals(1.${siPrefix.symbol}$unitSymbol , ${siPrefix.symbol}$unitSymbol)
        assertEquals(${siPrefix.name}$name , ${siPrefix.symbol}$unitSymbol)
    }    
    """
}



