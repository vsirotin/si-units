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
    SiUnitDescription("second", "s", "T", "time", 0),
    SiUnitDescription("metre", "m", "L", "length", 80),
    SiUnitDescription("kilogram", "kg", "M", "mass", 90),
    SiUnitDescription("ampere", "A", "I", "electric current", 70),
    SiUnitDescription("kelvin", "K", "Θ", "thermodynamic temperature", 60),
    SiUnitDescription("mole", "mol", "N", "amount of substance", 50),
    SiUnitDescription("candela", "cd", "J", "luminous intensity", 40)
)

data class SiUnitDescription(val name: String,
                             val unitSymbol: String,
                             val dimensionSymbol: String,
                             val quantityName: String,
                             val presentationPriority: Int)


val siDerivedUnitDescriptions = listOf(
    SiDerivedUnitDescription("hertz", "Hz",	"frequency", "1/s"),
    SiDerivedUnitDescription("newton", "N", "force, weight", "kg*m/(s `^` 2)"),
    SiDerivedUnitDescription("pascal", "Pa", "pressure, stress", "kg/(m * (s `^` 2))"),
    SiDerivedUnitDescription("joule", "J", "energy, work, heat", "kg*(m2)/(s `^` 2)"),
    SiDerivedUnitDescription("watt", "W", "power, radiant flux", "kg*(m2)/(s `^` 3)"),
    SiDerivedUnitDescription("coulomb", "C", "electric charge", "s*A"),
    SiDerivedUnitDescription("volt", "V", "electric potential, voltage, emf", "kg*m2*(s `^` -3) * (A `^` -1)"),
    SiDerivedUnitDescription("farad", "F", "capacitance", "(kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2)"),
    SiDerivedUnitDescription("ohm", "Ω", "resistance, impedance, reactance", "kg*m2 * (s `^` -3) * (A `^` -2)"),
    SiDerivedUnitDescription("siemens", "S", "electrical conductance", "(kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2)"),
    SiDerivedUnitDescription("weber", "Wb", "magnetic flux", "kg*(m2) * (s `^` -2) * (A `^` -1)"),
    SiDerivedUnitDescription("tesla", "T", "magnetic flux density", "kg* (s `^` -2) * (A `^` -1)"),
    SiDerivedUnitDescription("henry", "H", "inductance", "kg* (m2)*(s `^` -2)*(A `^` -2)"),
    SiDerivedUnitDescription("degreeCelsius", "Celsius", "°C or ℃: temperature relative to 273.15 K", "(K `^` 1)"),
    SiDerivedUnitDescription("lumen", "lm", "luminous flux", "((cd `^` 1)*sr)"),
    SiDerivedUnitDescription("lux", "lx", "illuminance", "cd*sr*(m `^` -2)"),
    SiDerivedUnitDescription("becquerel", "Bq", "activity referred to a radionuclide (decays per unit time)", "(s `^` -1)"),
    SiDerivedUnitDescription("gray", "Gy", "absorbed dose (of ionising radiation)", "(m2)*(s `^` -2)"),
    SiDerivedUnitDescription("sievert", "Sv", "equivalent dose (of ionising radiation)", "(m2)*(s `^` -2)"),
    SiDerivedUnitDescription("katal", "kat", "catalytic activity", "(mol * (s `^` -1))")
)

data class SiDerivedUnitDescription(val name: String,
                             val unitSymbol: String,
                             val quantityName: String,
                             val formula: String)