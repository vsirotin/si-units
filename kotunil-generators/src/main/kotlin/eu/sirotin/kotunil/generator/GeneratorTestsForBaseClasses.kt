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
    generateSiUnitBaseTestFiles("${ROOT_PATH_TEST_COMMON}base",
        "Test.kt",
        ::generateClassHeadPart,
        ::generatePrefixesTestPart
    )
}

fun generateSiUnitBaseTestFiles(dirPath: String,
        fileNameSuffix: String,
        generatorTestClassHeadPart: (SiUnitDescription) -> String,
        generatorUnitTestForPrefix: (SiPrefix, SiUnitDescription)->String,
        fileEnd: String= "}"
) {
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    siUnitDescriptions.forEach {
        generateTestForSiUnitBaseClass(
            it,
            dir,
            fileNameSuffix,
            generatorTestClassHeadPart,
            generatorUnitTestForPrefix,
            fileEnd
        )
    }
}

private fun generateTestForSiUnitBaseClass(siUnitDescription: SiUnitDescription,
           dir: File,
           fileNameSuffix: String,
           generatorTestClassHeadPart: (SiUnitDescription) -> String,
           generatorUnitTestForPrefix: (SiPrefix, SiUnitDescription)->String,
           fileEnd: String) {
    val className = getClassName(siUnitDescription)
    val prefixes = if(className != "Kilogram") siPrefixes else generatePrefixesForKilogram()

    val fileName = "${className}$fileNameSuffix"
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generatorTestClassHeadPart(siUnitDescription) +
        //generateTestsForPrefixes(className, siUnitDescription.name, siUnitDescription.unitSymbol, prefixes) +
        prefixes.joinToString(System.lineSeparator()) { generatorUnitTestForPrefix(it, siUnitDescription) } + fileEnd
    
    file.writeText(classText)
}

fun getClassName(siUnitDescription: SiUnitDescription) =
    siUnitDescription.name.first().uppercaseChar() + siUnitDescription.name.drop(1)

private fun generateClassHeadPart(
    siUnitDescription: SiUnitDescription): String {
    val className = getClassName(siUnitDescription)
    val unitSymbol = siUnitDescription.unitSymbol
    return """        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.EPS
import eu.sirotin.kotunil.core.*
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class ${className}Test {

    @Test
    fun test${className}MainTest() {
        assertEquals(${className}(1.0), $unitSymbol)
        assertEquals(1.$unitSymbol , $unitSymbol)
    }
    
       @Test
    fun test${className}SerializationTest() {
        //Serialization
        val v1 = ${className}(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = ${className}(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        assertEquals(v1 , v2)
    }
    
    """
}


val exclusions = listOf("as", "kkg") //Name conflicts
private fun generatePrefixesTestPart(
    siPrefix: SiPrefix,
    siUnitDescription: SiUnitDescription): String {
    val className = getClassName(siUnitDescription)
    val name = siUnitDescription.name
    val unitSymbol = siUnitDescription.unitSymbol

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





