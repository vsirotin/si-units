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

fun generateSiUnitsBaseClasses() {
    //Generate package directory if not exists
    val dir = File("src/main/kotlin/eu/sirotin/siunits/base")
    if(!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    siUnitDescriptions.forEach { generateSiUnitBaseClass(it, dir) }
}

private fun generateSiUnitBaseClass(siUnitDescription: SiUnitDescription, dir: File) {
    val className = siUnitDescription.name.first().uppercaseChar() + siUnitDescription.name.drop(1)
    val prefixes = if(className != "Kilogram") siPrefixes else generatePrefixesForKilogram()

    val fileName = "$className.kt"
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generateHeadPart(className,
        siUnitDescription.unitSymbol,
        siUnitDescription.dimensionSymbol,
        siUnitDescription.presentationPriority) +
        generatePrefixes(className, siUnitDescription.name, siUnitDescription.unitSymbol, prefixes)
    
    file.writeText(classText)
}

private fun generatePrefixesForKilogram(): List<SiPrefix> {
    return siPrefixes
        .map { SiPrefix(it.name, it.symbol, it.degree - 3) }
        .filter { it.name != "kilo" }
}

private fun generateHeadPart(
    className: String,
    unitSymbol: String,
    dimensionSymbol: String,
    presentationPriority: Int
): String {
    return """
package eu.sirotin.siunits.base

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification
import kotlin.math.pow
private val description$className = UnitSpecification(
    "$unitSymbol",
    "$dimensionSymbol",
    $presentationPriority
) { v: Double -> $className(v) }

class $className(value: Double) : TermUnit(value, description = description$className)
    val Number.$unitSymbol : $className
        get() = $className(this.toDouble())
    
    val $unitSymbol = $className(1.0)       
    """
}


private fun generatePrefixes(className: String, name: String, unitSymbol: String, prefixes: List<SiPrefix>): String {
    return prefixes.joinToString(System.lineSeparator()) { generateTextForPrefix(it, className, name, unitSymbol) }
}


private fun generateTextForPrefix(siPrefix: SiPrefix, className: String, name: String, unitSymbol: String): String {

    return """
    val Number.${correctSpecialCases(siPrefix.symbol, unitSymbol)} : $className
        ${generateJVMName(siPrefix.symbol, unitSymbol)}get() = $className(10.0.pow(${siPrefix.degree}))
    
    val Number.${siPrefix.name}$name : $className
        get() = $className(10.0.pow(${siPrefix.degree}))
    
    val $className.${correctSpecialCases(siPrefix.symbol, unitSymbol)}  : Double
        ${generateJVMName(siPrefix.symbol, unitSymbol)}get() = this.value / 10.0.pow(${siPrefix.degree})
    
    val $className.${siPrefix.name}$name  : Double
        get() = this.value / 10.0.pow(${siPrefix.degree})
    
    @JvmField()         
    val ${correctSpecialCases(siPrefix.symbol, unitSymbol)} = $className(10.0.pow(${siPrefix.degree}))
    val ${siPrefix.name}$name = ${correctSpecialCases(siPrefix.symbol, unitSymbol)}          """
}

fun generateJVMName(symbol: String, unitSymbol: String): String{
    if(symbol.first().isLowerCase())return ""

    return "@JvmName(\"get${symbol}${unitSymbol}_prop\")${System.lineSeparator()}        "
}

fun correctSpecialCases(symbol: String, unitSymbol: String): String {
    val s = "$symbol$unitSymbol"
    return  if(s != "as") s else "`as`"  // To avoid conflict with keyword 'as'
}