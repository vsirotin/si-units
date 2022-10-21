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

package eu.sirotin.siunits.physics

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import eu.sirotin.siunits.core.times


private val descriptionMeter = DimensionSpecification("metre",
    "m",
    "L",
    "length"
) { v: Double -> Meter(v) }


class Meter(value: Double) : TermUnit(value, description = descriptionMeter)
val Number.m : Meter
    get() = Meter(this.toDouble())

val Meter.mm : Double
    get() = this.value * 1000.0


val Number.l: Expression
    get() = Meter(this.toDouble()/10.0) * (Meter(0.1) * Meter(0.1))

val m = Meter(1.0)

val Expression.mm : Double
    get() = (this.toTermUnit() as Meter).mm


