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


fun generateTestsSiUnitsDerivedClasses() {
    generateDerivedTest("${ROOT_PATH_TEST_COMMON}derived",
        ::generateTestClassHeadPart,
        ::generateUnitTestForPrefix,
        "Test.kt"
    )
}

fun generateDerivedTest(dirPath: String,
                                generatorHeader: (SiDerivedUnitDescription) -> String,
                                generatorPrefixes: (SiPrefix, SiDerivedUnitDescription)->String,
                                fileNameSuffix: String,
                                fileEnd: String = "}"
) {
    //Generate package directory if not exists
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    siDerivedUnitDescriptions.forEach {
        generateTestForDerivedClass(
            dir,
            it,
            generatorHeader,
            generatorPrefixes,
            fileNameSuffix,
            fileEnd
        )
    }
}

private fun generateTestForDerivedClass(dir: File,
      description: SiDerivedUnitDescription,
      generatorHeader: (SiDerivedUnitDescription) -> String,
      generatorPrefixes: (SiPrefix, SiDerivedUnitDescription)->String,
      fileNameSuffix: String,
      fileEnd: String = "}"
        ) {
    val className = getDerivedClassName(description)
    val prefixes = if(className != "Kilogram") siPrefixes else generatePrefixesForKilogram()

    val fileName = "${className}$fileNameSuffix"
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generatorHeader(description) +
            prefixes.joinToString(System.lineSeparator()) { generatorPrefixes(it, description) } +
            fileEnd
    
    file.writeText(classText)
}

fun getDerivedClassName(description: SiDerivedUnitDescription) =
    description.name.first().uppercaseChar() + description.name.drop(1)

private fun generateTestClassHeadPart(description: SiDerivedUnitDescription): String {
    val className = getDerivedClassName(description)
    val unitSymbol = description.unitSymbol
    return """        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class ${className}Test {

    @Test
    fun test${className}MainTest1() {
        assertEquals(1.$unitSymbol , $unitSymbol)
    }
    
     @Test
    fun test${className}MainTest2() {
        assertEquals(12.3.$unitSymbol , $className(12.3))
    }
    """
}


private fun generateUnitTestForPrefix(siPrefix: SiPrefix, description: SiDerivedUnitDescription): String {
    val className = getDerivedClassName(description)
    val name = description.name
    val unitSymbol = description.unitSymbol
    val symbolForTestName = if(siPrefix.symbol.first().isLowerCase()) siPrefix.symbol.uppercase() + "1" else siPrefix.symbol

    return """          
    @Test
    fun test$className$symbolForTestName${unitSymbol}Test() {
        val myPow = 10.0.pow(${siPrefix.degree})
        assertEquals(1.${siPrefix.symbol}$unitSymbol.value, ${unitSymbol}.value*myPow, EPS)
        assertEquals(1.${siPrefix.name}$name.value, ${unitSymbol}.value*myPow)
        assertEquals(1.${siPrefix.symbol}$unitSymbol , ${siPrefix.symbol}$unitSymbol)
        assertEquals(${siPrefix.name}$name, ${siPrefix.symbol}$unitSymbol)
    }    
    """
}



