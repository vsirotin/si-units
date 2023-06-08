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

package eu.sirotin.kotunil.specialunits
import eu.sirotin.kotunil.base.Metre
import eu.sirotin.kotunil.base.m
import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.times
import kotlin.js.JsExport
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName

/**
 * Square metre
 */
@JsExport
@JvmField
val m2 = m * m

/**
 * Cubic metre (volume)
 */
@JsExport
@JvmField
val m3 = m2 * m

/**
 * hectare
 */
val Number.ha: Expression
    get() = 10000*this.toDouble()  * m2

/**
 * hectare
 */
@JsExport
@JvmField
val ha = 1.0.ha

/**
 * Litre
 */
val Number.l: Expression
    /**
     * get litre
     */
    get() = Metre(this.toDouble()/10.0) * Metre(0.1) * Metre(0.1)

/**
 * Litre
 */
@JsExport
@JvmField
val l = 1.0.l

/**
 * Litre
 */
val Number.L: Expression
    @JvmName("getL_prop")
    /**
     * get litre
     */
    get() = this.l

@JvmField
val L = l


/**
 * Astronomical unit 149597870700 metre
 */
val Number.au: Metre
    get()  = Metre(this.toDouble()*149597870700.0)

/**
 * Astronomical unit 149597870700 metre
 */
@JsExport
@JvmField
val au = 1.0.au

