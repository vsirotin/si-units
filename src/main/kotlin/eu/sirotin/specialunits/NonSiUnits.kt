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

@file:Suppress("NonAsciiCharacters")

package eu.sirotin.specialunits

import eu.sirotin.siunits.base.*
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.derived.*
import java.lang.Math.PI
import kotlin.math.pow

val m2 = m * m
val m3 = m2 * m

val Number.min: Second
    get()  = 60.s

val min = 60.s

val Number.h: Second
    get()  = 60.min

val h = 60.min

val Number.d: Second
    get()  = 24.h

val d = 24.h

//astronomical unit

val Number.au: Metre
    get()  = 149597870700.m

val au = 149597870700.m

//degree
val `°` = (PI/180)*rad

//arcminute
val `′` = `°` / 60.0

//arcsecond
val `″` = `′` / 60.0

//hectare
val ha = (10 `^` 4) * m2

//Litre
val Number.l: Expression
    get() = Metre(this.toDouble()/10.0) * (Metre(0.1) * Metre(0.1))

val l = 1.0.l

val Number.L: Expression
    @JvmName("getL_prop")
    get() = this.l

@JvmField()
val L = l

//tonne
val Number.t: Kilogram
    get() = Kilogram(this.toDouble()*1000.0)

val t = 1000.kg

//dalton
val Number.Da: Kilogram
    get() = Kilogram(this.toDouble() * 1.660539040 * (10.0.pow(-27)))

val Da = 1.Da

//electronvolt
val Number.eV: Expression
    get() = Expression(1.602176634*(10.0.pow(-19)) , 1.J.dimensions)

val eV = 1.eV



//Percentage
@Suppress("DANGEROUS_CHARACTERS")
val Number.`%`: Double
    get()  = this.toDouble()*0.01

@Suppress("DANGEROUS_CHARACTERS")
val `%` = 0.01





