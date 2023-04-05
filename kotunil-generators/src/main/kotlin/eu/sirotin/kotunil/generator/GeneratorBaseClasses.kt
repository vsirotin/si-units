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

/**
 * Descriptions of base SI-Units.
 */
val siUnitDescriptions = listOf(
    SiUnitDescription("second", "s", "T",  0, "time"),
    SiUnitDescription("metre", "m", "L",  80, "length"),
    SiUnitDescription("kilogram", "kg", "M",  90, "mass"),
    SiUnitDescription("ampere", "A", "I",  70, "electric current"),
    SiUnitDescription("kelvin", "K", "Θ",  60, "thermodynamic temperature"),
    SiUnitDescription("mole", "mol", "N",  50, "amount of substance"),
    SiUnitDescription("candela", "cd", "J",  40, "luminous intensity")
)

/**
 * Describes base SI unit as [name] as 'metre', [unitSymbol] e.g. 'm', [dimensionSymbol] as 'L',
 * [presentationPriority] for pretty printing e.g. by metre and second should be 'ms' ans not 'sm' and
 * [quantityName] e.g. 'length'.
 */
data class SiUnitDescription(val name: String,
                             val unitSymbol: String,
                             val dimensionSymbol: String,
                             val presentationPriority: Int,
                             val quantityName: String)

/**
 * Generates base unit classes. Not relevant for library users.
 */
fun generateSiUnitsBaseClasses() {
    //Generate package directory if not exists
    val dir = File("${ROOT_PATH_SOURCE_COMMON}base")
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
        siUnitDescription.presentationPriority,
        siUnitDescription.quantityName) +
        generatePrefixes(className, siUnitDescription.name, siUnitDescription.unitSymbol, prefixes)
    
    file.writeText(classText)
}

fun generatePrefixesForKilogram(): List<SiPrefix> {
    return siPrefixes
        .map { SiPrefix(it.name, it.symbol, it.degree - 3) }
        .filter { it.name != "kilo" }
}

private fun generateHeadPart(
    className: String,
    unitSymbol: String,
    dimensionSymbol: String,
    presentationPriority: Int,
    quantityName: String): String {
    return """
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val description$className = UnitSpecification(
    "$unitSymbol",
    "$dimensionSymbol",
    $presentationPriority
) { v: Double -> $className(v) }

/**
 * System International Unit for $quantityName.
 *
 * @constructor Creates the unit with given [value].
 */
@JsExport
class $className(value: Double) : Expression(value, description = description$className)
    /**
     * Creates $className-Object for current number value. $className is a System International Unit for $quantityName.
     */
    val Number.$unitSymbol : $className
        /**
         * Returns $className-Object for current number value. $className is a System International Unit for $quantityName.
         */
        get() = $className(this.toDouble())
    
    /**
     * System International Unit for $quantityName.
     */
    @JsExport
    @JvmField
    val $unitSymbol = $className(1.0)       
    """
}


private fun generatePrefixes(className: String, name: String, unitSymbol: String, prefixes: List<SiPrefix>): String {
    return prefixes.joinToString(System.lineSeparator()) { generateTextForPrefix(it, className, name, unitSymbol) }
}


private fun generateTextForPrefix(siPrefix: SiPrefix, className: String, name: String, unitSymbol: String): String {

    val correctedSymbol = correctSpecialCases(siPrefix.symbol, unitSymbol)
    val mayBeJsExport = conditionalPush(siPrefix.symbol, "@JsExport")
    return """
    /**
     * $correctedSymbol, (10^${siPrefix.degree} of $name)
     */    
    val Number.${correctedSymbol} : $className
        /**
         * Returns $correctedSymbol, (10^${siPrefix.degree} of $name)
         */ 
        ${generateJVMName(siPrefix.symbol, unitSymbol)}get() = $className(this.toDouble()*10.0.pow(${siPrefix.degree}))
    
    /**
     * $correctedSymbol, (10^${siPrefix.degree} of $name)
     */ 
    val Number.${siPrefix.name}$name : $className
        /**
         * Returns $correctedSymbol (10^${siPrefix.degree} of $name)
         */
        get() = $className(this.toDouble()*10.0.pow(${siPrefix.degree}))
    
    /**
     * Returns numerical value of $correctedSymbol, (10^${siPrefix.degree} of $name)
     */
    val $className.${correctedSymbol}  : Double
        /**
         * Returns numerical value of $correctedSymbol, (10^${siPrefix.degree} of $name)
         */
        ${generateJVMName(siPrefix.symbol, unitSymbol)}get() = this.value / 10.0.pow(${siPrefix.degree})
    
    /**
     * Returns numerical value of $correctedSymbol (10^${siPrefix.degree} of $name)
     */
    val $className.${siPrefix.name}$name  : Double
        /**
         * Returns numerical value of $correctedSymbol, (10^${siPrefix.degree} of $name)
         */
        get() = this.value / 10.0.pow(${siPrefix.degree})
    
    $mayBeJsExport
    @JvmField
    /**
     * $correctedSymbol (10^${siPrefix.degree} of $name)
     */
    val $correctedSymbol = $className(10.0.pow(${siPrefix.degree}))
    
    @JsExport
    @JvmField
    /**
     * $correctedSymbol, (10^${siPrefix.degree} of $name)
     */
    val ${siPrefix.name}$name = $correctedSymbol          """
}

private fun generateJVMName(symbol: String, unitSymbol: String): String{
    if(symbol.first().isLowerCase())return ""

    return "@JvmName(\"get${symbol}${unitSymbol}_prop\")${System.lineSeparator()}        "
}

private fun correctSpecialCases(symbol: String, unitSymbol: String): String {
    val s = "$symbol$unitSymbol"
    return  if(s != "as") s else "`as`"  // To avoid conflict with keyword 'as'
}