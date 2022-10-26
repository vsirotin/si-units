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