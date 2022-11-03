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

val siUnitDescriptions = listOf(
    SiUnitDescription("second", "s", "T",  0),
    SiUnitDescription("metre", "m", "L",  80),
    SiUnitDescription("kilogram", "kg", "M",  90),
    SiUnitDescription("ampere", "A", "I",  70),
    SiUnitDescription("kelvin", "K", "Θ",  60),
    SiUnitDescription("mole", "mol", "N",  50),
    SiUnitDescription("candela", "cd", "J",  40)
)

data class SiUnitDescription(val name: String,
                             val unitSymbol: String,
                             val dimensionSymbol: String,
                             val presentationPriority: Int)


val siDerivedUnitDescriptions = listOf(
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
    SiDerivedUnitDescription("degreeCelsius", "Celsius",  "(K `^` 1)"),
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