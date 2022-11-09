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


val siDerivedUnitDescriptions = listOf(
    SiDerivedUnitDescription("radian", "rad",	 "m/m"),
    SiDerivedUnitDescription("steradian", "sr",	 "m2/m2"),
    SiDerivedUnitDescription("hertz", "Hz",	 "1/s"),
    SiDerivedUnitDescription("newton", "N",  "kg*m/(s `^` 2)"),
    SiDerivedUnitDescription("pascal", "Pa",  "kg/(m * (s `^` 2))"),
    SiDerivedUnitDescription("joule", "J",  "kg*(m2)/(s `^` 2)"),
    SiDerivedUnitDescription("watt", "W",  "kg*(m2)/(s `^` 3)"),
    SiDerivedUnitDescription("coulomb", "C",  "s*A"),
    SiDerivedUnitDescription("volt", "V",  "kg*m2*(s `^` -3) * (A `^` -1)"),
    SiDerivedUnitDescription("farad", "F",  "(kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2)"),
    SiDerivedUnitDescription("ohm", "Ω",  "kg*m2 * (s `^` -3) * (A `^` -2)"),
    SiDerivedUnitDescription("siemens", "S", "(kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2)"),
    SiDerivedUnitDescription("weber", "Wb",  "kg*(m2) * (s `^` -2) * (A `^` -1)"),
    SiDerivedUnitDescription("tesla", "T",  "kg* (s `^` -2) * (A `^` -1)"),
    SiDerivedUnitDescription("henry", "H",  "kg* (m2)*(s `^` -2)*(A `^` -2)"),
    SiDerivedUnitDescription("lumen", "lm", "((cd `^` 1)*sr)"),
    SiDerivedUnitDescription("lux", "lx",  "cd*sr*(m `^` -2)"),
    SiDerivedUnitDescription("becquerel", "Bq",  "(s `^` -1)"),
    SiDerivedUnitDescription("gray", "Gy", "(m2)*(s `^` -2)"),
    SiDerivedUnitDescription("sievert", "Sv",  "(m2)*(s `^` -2)"),
    SiDerivedUnitDescription("katal", "kat",  "(mol * (s `^` -1))")
)

data class SiDerivedUnitDescription(val name: String,
                                    val unitSymbol: String,
                                    val formula: String)
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
        siUnitDescription.formula) +
            generateDerivedClassPrefixes(siUnitDescription.name,
                siUnitDescription.unitSymbol,
                siUnitDescription.formula,
                siPrefixes)
    
    file.writeText(classText)
}


fun generateDerivedUnitClassHead(
    unitSymbol: String,
    formula: String
): String {
    return """
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val $unitSymbol = $formula

    val Number.$unitSymbol : Expression
        get() = this.toDouble() * ($formula)

    """
}

private fun generateDerivedClassPrefixes(name: String, unitSymbol: String, formula: String, prefixes: List<SiPrefix>): String {
    return prefixes.joinToString(System.lineSeparator()) { generateTextOfDerivedUnitClassForPrefix(it, name, unitSymbol, formula) }
}

fun generateTextOfDerivedUnitClassForPrefix(
    prefix: SiPrefix,
    name: String,
    unitSymbol: String,
    formula: String
): String {
    val jvmName = "${prefix.symbol}$unitSymbol"
    return """
    val Number.${prefix.symbol}$unitSymbol : Expression
        @JvmName("get${jvmName}_prop")
        get() = this.toDouble() * 10.0.pow(${prefix.degree}) * ($formula)

    val Number.${prefix.name}$name : Expression
        get() = this.toDouble() * 10.0.pow(${prefix.degree}) * ($formula)


    @JvmField()         
    val ${prefix.symbol}$unitSymbol = 10.0.pow(${prefix.degree}) * ($formula)
    val ${prefix.name}$name = ${prefix.symbol}$unitSymbol
    """
}

