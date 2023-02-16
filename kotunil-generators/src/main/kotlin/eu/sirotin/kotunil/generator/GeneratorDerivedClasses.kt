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
 * Descriptions of derived SI units.
 */
val siDerivedUnitDescriptions = listOf(
    SiDerivedUnitDescription("radian", "rad",	 "m/m", "plane angle"),
    SiDerivedUnitDescription("steradian", "sr",	 "m2/m2", "solid angle"),
    SiDerivedUnitDescription("hertz", "Hz",	 "1/s", "frequency"),
    SiDerivedUnitDescription("newton", "N",  "kg*m/(s `^` 2)", "force, weight"),
    SiDerivedUnitDescription("pascal", "Pa",  "kg/(m * (s `^` 2))", "pressure, stress"),
    SiDerivedUnitDescription("joule", "J",  "kg*(m2)/(s `^` 2)", "energy, work, heat"),
    SiDerivedUnitDescription("watt", "W",  "kg*(m2)/(s `^` 3)", "power, radiant flux"),
    SiDerivedUnitDescription("coulomb", "C",  "s*A", "electric charge"),
    SiDerivedUnitDescription("volt", "V",  "kg*m2*(s `^` -3) * (A `^` -1)", "electric potential, voltage, emf"),
    SiDerivedUnitDescription("farad", "F",  "(kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2)", "capacitance"),
    SiDerivedUnitDescription("ohm", "Ω",  "kg*m2 * (s `^` -3) * (A `^` -2)", "resistance, impedance, reactance"),
    SiDerivedUnitDescription("siemens", "S", "(kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2)", "electrical conductance"),
    SiDerivedUnitDescription("weber", "Wb",  "kg*(m2) * (s `^` -2) * (A `^` -1)", "magnetic flux"),
    SiDerivedUnitDescription("tesla", "T",  "kg* (s `^` -2) * (A `^` -1)", "magnetic flux density"),
    SiDerivedUnitDescription("henry", "H",  "kg* (m2)*(s `^` -2)*(A `^` -2)", "inductance"),
    SiDerivedUnitDescription("lumen", "lm", "((cd `^` 1)*sr)", "luminous flux"),
    SiDerivedUnitDescription("lux", "lx",  "cd*sr*(m `^` -2)", "illuminance"),
    SiDerivedUnitDescription("becquerel", "Bq",  "(s `^` -1)", "activity referred to a radionuclide (decays per unit time)"),
    SiDerivedUnitDescription("gray", "Gy", "(m2)*(s `^` -2)", "absorbed dose (of ionising radiation)"),
    SiDerivedUnitDescription("sievert", "Sv",  "(m2)*(s `^` -2)", "equivalent dose (of ionising radiation)"),
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
fun generateSiUnitsDerivedClasses() {
    //Generate package directory if not exists
    val dir = File("${ROOT_PATH_SOURCE}derived")
    if(!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate classes
    siDerivedUnitDescriptions.forEach { generateSiUnitDerivedClass(it, dir) }

}

private fun generateSiUnitDerivedClass(siUnitDescription: SiDerivedUnitDescription, dir: File) {
    val className = siUnitDescription.name.first().uppercaseChar() + siUnitDescription.name.drop(1)

    val fileName = "$className.kt"
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generateDerivedUnitClassHead(
        className,
        siUnitDescription.unitSymbol,
        siUnitDescription.formula,
        siUnitDescription.quantity) +
            generateDerivedClassPrefixes(siUnitDescription.name,
                siUnitDescription.unitSymbol,
                siUnitDescription.formula,
                siUnitDescription.quantity,
                siPrefixes
            )
    
    file.writeText(classText)
}

private fun generateDerivedUnitClassHead(
    className: String,
    unitSymbol: String,
    formula: String,
    quantityName: String
): String {
    return """
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.math.pow

private val unit =  $formula

/**
* System International Unit for $quantityName.
*/
val $unitSymbol = unit

/**
* Creates $className-Object for current number value. $className is a System International Unit for $quantityName.
*/
val Number.$unitSymbol : Expression
   /**
   * Returns $className-Object for current number value. $className is a System International Unit for $quantityName.
   */
    get() = this.toDouble() * unit

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
    return """
/**
* ${prefix.symbol}$unitSymbol, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
*/    
val Number.${prefix.symbol}$unitSymbol : Expression
    @JvmName("get${jvmName}_prop")
    /**
    * Returns ${prefix.symbol}$unitSymbol, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
    */  
    get() = this.toDouble() * 10.0.pow(${prefix.degree}) * unit

/**
* ${prefix.name}$name, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
*/ 
val Number.${prefix.name}$name : Expression
    /**
    * Returns ${prefix.name}$name, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
    */  
    get() = this.toDouble() * 10.0.pow(${prefix.degree}) * unit


@JvmField  
/**
* ${prefix.symbol}$unitSymbol, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
*/        
val ${prefix.symbol}$unitSymbol = 10.0.pow(${prefix.degree}) * ($formula)

/**
* ${prefix.name}$name, 10^${prefix.degree} of $name, derived SI-Unit for measurement of $quantityName
*/ 
val ${prefix.name}$name = ${prefix.symbol}$unitSymbol
    """
}

