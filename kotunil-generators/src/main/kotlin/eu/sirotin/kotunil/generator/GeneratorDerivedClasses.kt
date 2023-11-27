/*
 * Copyright (c) 2022-23.  Viktor Sirotin
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
 * Descriptions of derived SI units.
 */
val siDerivedUnitDescriptions = listOf(
    SiDerivedUnitDescription("radian", "rad",	 "m/m", "plane angle"),
    SiDerivedUnitDescription("steradian", "sr",	 "m*m/m*m", "solid angle"),
    SiDerivedUnitDescription("hertz", "Hz",	 "1/s", "frequency"),
    SiDerivedUnitDescription("newton", "N",  "kg*m/(s `^` 2)", "force, weight"),
    SiDerivedUnitDescription("pascal", "Pa",  "kg/(m * (s `^` 2))", "pressure, stress"),
    SiDerivedUnitDescription("joule", "J",  "kg*(m*m)/(s `^` 2)", "energy, work, heat"),
    SiDerivedUnitDescription("watt", "W",  "kg*(m*m)/(s `^` 3)", "power, radiant flux"),
    SiDerivedUnitDescription("coulomb", "C",  "s*A", "electric charge"),
    SiDerivedUnitDescription("volt", "V",  "kg*m*m*(s `^` -3) * (A `^` -1)", "electric potential, voltage, emf"),
    SiDerivedUnitDescription("farad", "F",  "(kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2)", "capacitance"),
    SiDerivedUnitDescription("ohm", "Ω",  "kg*m*m * (s `^` -3) * (A `^` -2)", "resistance, impedance, reactance"),
    SiDerivedUnitDescription("siemens", "S", "(kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2)", "electrical conductance"),
    SiDerivedUnitDescription("weber", "Wb",  "kg*(m*m) * (s `^` -2) * (A `^` -1)", "magnetic flux"),
    SiDerivedUnitDescription("tesla", "T",  "kg* (s `^` -2) * (A `^` -1)", "magnetic flux density"),
    SiDerivedUnitDescription("henry", "H",  "kg* (m*m)*(s `^` -2)*(A `^` -2)", "inductance"),
    SiDerivedUnitDescription("lumen", "lm", "((cd `^` 1)*sr)", "luminous flux"),
    SiDerivedUnitDescription("lux", "lx",  "cd*sr*(m `^` -2)", "illuminance"),
    SiDerivedUnitDescription("becquerel", "Bq",  "(s `^` -1)", "activity referred to a radionuclide (decays per unit time)"),
    SiDerivedUnitDescription("gray", "Gy", "(m*m)*(s `^` -2)", "absorbed dose (of ionising radiation)"),
    SiDerivedUnitDescription("sievert", "Sv",  "(m*m)*(s `^` -2)", "equivalent dose (of ionising radiation)"),
    SiDerivedUnitDescription("katal", "kat",  "(mol * (s `^` -1))", "catalytic activity")
)

/**
 * Describes derived SI unit as [name] as 'volt', [unitSymbol] e.g. 'V', 
 * [formula] for calculation this unit from base SI-units.
 */
data class SiDerivedUnitDescription(val name: String,
                                    val unitSymbol: String,
                                    val formula: String,
                                    val quantity: String)

/**
 * Generates classes for derived SI-units.
 */
fun generateSiUnitsDerivedClasses(fileExtension: String = "kt") {
    //Generate package directory if not exists
    val dir = File("${ROOT_PATH_SOURCE_COMMON}derived")
    generateDerivedClassFiles(dir, ::generateSiUnitDerivedClass, fileExtension)

}

fun generateDerivedClassFiles(
    dir: File,
    generatorDerivedClass: (SiDerivedUnitDescription, File, String) -> Unit,
    fileExtension: String
) {
    if (!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    siDerivedUnitDescriptions.forEach { generatorDerivedClass(it, dir, fileExtension) }
}

private fun generateSiUnitDerivedClass(siUnitDescription: SiDerivedUnitDescription, dir: File, fileExtension: String) {
    val className = getClassName(siUnitDescription)
    val fileName = "$className.$fileExtension"
    val generatorHeadPart = ::generateDerivedUnitClassHead
    val generatorPrefixes = ::generateDerivedClassPrefixes

    generateDerivedClassFile(dir, fileName, generatorHeadPart, className, siUnitDescription, generatorPrefixes)
}

fun generateDerivedClassFile(
    dir: File,
    fileName: String,
    generatorHeadPart: (String, String, String, String) -> String,
    className: String,
    siUnitDescription: SiDerivedUnitDescription,
    generatorPrefixes: (String, String, String, String, List<SiPrefix>)-> String
) {
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generatorHeadPart(
        className,
        siUnitDescription.unitSymbol,
        siUnitDescription.formula,
        siUnitDescription.quantity
    ) +
            generatorPrefixes(
                siUnitDescription.name,
                siUnitDescription.unitSymbol,
                siUnitDescription.formula,
                siUnitDescription.quantity,
                siPrefixes
            )

    file.writeText(classText)
}

fun getClassName(siUnitDescription: SiDerivedUnitDescription): String {
    val name = siUnitDescription.name
    return createClassName(name)
}

private fun createClassName(name: String): String {
    return name.first().uppercaseChar() + name.drop(1)
}

private fun generateDerivedUnitClassHead(
    className: String,
    unitSymbol: String,
    formula: String,
    quantityName: String
): String {
    return """
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  $formula

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for $quantityName.
*/
class $className(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for $quantityName.
*/
@JsExport
@JvmField
val $unitSymbol = $className(1.0)

/**
* Creates $className-Object for current number value. $className is a System International Unit for $quantityName.
*/
val Number.$unitSymbol : $className
   /**
   * Returns $className-Object for current number value. $className is a System International Unit for $quantityName.
   */
    get() = $className(this.toDouble())

    """
}

private fun generateDerivedClassPrefixes(name: String,
                                         unitSymbol: String,
                                         formula: String,
                                         quantity: String,
                                         prefixes: List<SiPrefix>): String {
    return prefixes.joinToString(System.lineSeparator()) { generateTextOfDerivedUnitClassForPrefix(it, name, unitSymbol, formula, quantity) }
}

private fun generateTextOfDerivedUnitClassForPrefix(
    prefix: SiPrefix,
    name: String,
    unitSymbol: String,
    formula: String,
    quantityName: String
): String {
    val jvmName = "${prefix.symbol}$unitSymbol"
    val mayBeJsExport = conditionalPush(prefix.symbol, "@JsExport")
    val className = createClassName(name)
    return """
/**
* ${prefix.symbol}$unitSymbol, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
*/    
val Number.${prefix.symbol}$unitSymbol : $className
    @JvmName("get${jvmName}_prop")
    /**
    * Returns ${prefix.symbol}$unitSymbol, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
    */  
    get() = ${className}(this.toDouble() * 10.0.pow(${prefix.degree}))

/**
* ${prefix.name}$name, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
*/ 
val Number.${prefix.name}$name : $className
    /**
    * Returns ${prefix.name}$name, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
    */  
    get() = $className(this.toDouble() * 10.0.pow(${prefix.degree}))

$mayBeJsExport
@JvmField
/**
* ${prefix.symbol}$unitSymbol, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
*/        
val ${prefix.symbol}$unitSymbol = 10.0.pow(${prefix.degree}) * ($formula)

/**
* ${prefix.name}$name, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
*/ 

@JsExport
@JvmField
val ${prefix.name}$name = ${prefix.symbol}$unitSymbol
    """
}

