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

val siPrefixes: List<SiPrefix> = listOf(
    SiPrefix("quetta", "Q", 30),
    SiPrefix("ronna", "R", 27),
    SiPrefix("yotta", "Y", 24),
    SiPrefix("zetta", "Z", 21),
    SiPrefix("exa", "E", 18),
    SiPrefix("peta", "P", 15),
    SiPrefix("tera", "T", 12),
    SiPrefix("giga", "G", 9),
    SiPrefix("mega", "M", 6),
    SiPrefix("kilo", "k", 3),
    SiPrefix("hecto", "h", 2),
    SiPrefix("deca", "da", 1),
    SiPrefix("deci", "d", -1),
    SiPrefix("centi", "c", -2),
    SiPrefix("milli", "m", -3),
    SiPrefix("micro", "μ", -6),
    SiPrefix("nano", "n", -9),
    SiPrefix("pico", "p", -12),
    SiPrefix("femto", "f", -15),
    SiPrefix("atto", "a", -18),
    SiPrefix("zepto", "z", -21),
    SiPrefix("yocto", "y", -24),
    SiPrefix("ronto", "r", -27),
    SiPrefix("quecto", "q", -30)
)


data class SiPrefix(val name: String, val symbol: String, val degree: Int)

//These symbols cases problems by generation of JS code because they have their uppercase counterparts, e.g. z vs Z
//We wait up to this problem will be solved. At the moment they will be by JS ignored.
//Workaround: to use "full name", e.g. millimetre instead mm.
val problematicSymbols = listOf("z", "y", "r", "q", "p", "m")
fun conditionalPush(prefix: String, s: String): String {
    if(problematicSymbols.contains(prefix))return ""
    return s
}