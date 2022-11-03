/*
 * Copyright (c) 2022 Dr. Viktor Sirotin
 *  *
 *   * Permission is hereby granted, free of charge, to any person obtaining a copy
 *   * of this software and associated documentation files (the "Software"), to deal
 *   * in the Software without restriction, including without limitation the rights
 *   * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   * copies of the Software, and to permit persons to whom the Software is
 *   * furnished to do so, subject to the following conditions:
 *   * This Copyright header should still in file if you use it file without changes or
 *   * with changes or if you copy essential part of this file in some new file.
 *
 *   * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 */

package eu.sirotin.siunits.core

import eu.sirotin.siunits.base.Kilogram
import eu.sirotin.siunits.base.Metre
import eu.sirotin.siunits.base.m
import eu.sirotin.siunits.derived.Celsius

val Number.g: Kilogram
    get()  = Kilogram(0.001)

val g = Kilogram(0.001)

val Number.l: Expression
    get() = Metre(this.toDouble()/10.0) * (Metre(0.1) * Metre(0.1))

val rad = 1.0 //radian, plane angle
val sr = 1.0 //steradian, solid angle
val m2 = m * m
val m3 = m2 * m

//Celsius
val Number.`°C`: Expression
    get()  = Celsius

val Number.`℃`: Expression
    get()  = Celsius

val `°C` = Celsius
val `℃` = Celsius

//Percentage
val Number.`%`: Double
    get()  = this.toDouble()*0.01

val `%` = 0.01





