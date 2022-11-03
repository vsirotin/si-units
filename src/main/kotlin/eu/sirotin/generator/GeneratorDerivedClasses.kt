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
 *  *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 */

package eu.sirotin.generator

import java.io.File
import java.nio.file.Files

fun generateSiUnitsDerivedClasses() {
    //Generate package directory if not exists
    val dir = File("src/main/kotlin/eu/sirotin/siunits/derived")
    if(!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    siDerivedUnitDescriptions.forEach { generateSiUnitDerivedClass(it, dir) }

}

fun generateSiUnitDerivedClass(siUnitDescription: SiDerivedUnitDescription, dir: File) {
    val className = siUnitDescription.name.first().uppercaseChar() + siUnitDescription.name.drop(1)

    val fileName = "$className.kt"
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generateDerivedUnitClassHead(
        siUnitDescription.unitSymbol,
        siUnitDescription.quantityName,
        siUnitDescription.formula) +
            generateDerivedClassPrefixes(siUnitDescription.name,
                siUnitDescription.unitSymbol,
                siUnitDescription.formula,
                siPrefixes)
    
    file.writeText(classText)
}


fun generateDerivedUnitClassHead(unitSymbol: String,
                                 quantityName: String,
                                 formula: String): String {
    val res = """
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    //Unit of $quantityName
    val $unitSymbol = $formula

    val Number.$unitSymbol : Expression
        get() = this.toDouble() * ($formula)

    """
    return res
}

private fun generateDerivedClassPrefixes(name: String, unitSymbol: String, formula: String, prefixes: List<SiPrefix>): String {
    return prefixes.joinToString(System.lineSeparator()) { generateTextOfDerivedUnitClassForPrefix(it, name, unitSymbol, formula) }
}

fun generateTextOfDerivedUnitClassForPrefix(prefix: SiPrefix, name: String, unitSymbol: String, formula: String): String {
      val jvmName = "${prefix.symbol}$unitSymbol"
    val res = """
    val Number.${prefix.symbol}$unitSymbol : Expression
        @JvmName("get${jvmName}_prop")
        get() = this.toDouble() * 10.0.pow(${prefix.degree}) * ($formula)

    val Number.${prefix.name}$name : Expression
        get() = this.toDouble() * 10.0.pow(${prefix.degree}) * ($formula)


    @JvmField()         
    val ${prefix.symbol}$unitSymbol = 10.0.pow(${prefix.degree}) * ($formula)
    val ${prefix.name}$name = ${prefix.symbol}$unitSymbol
    """
    return res
}

