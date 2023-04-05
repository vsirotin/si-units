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

@file:Suppress("NonAsciiCharacters")

package eu.sirotin.kotunil.specialunits

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.derived.*
import kotlin.js.JsExport
import kotlin.js.JsName
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName
import kotlin.math.E
import kotlin.math.PI

import kotlin.math.pow

/**
 * Square metre
 */
@JsExport
@JsName("m2")
//@get:JvmName("m2")
@JvmField()
val m2 = m * m

/**
 * Cubic metre (volume)
 */
@JsExport
@JsName("m3")
//@get:JvmName("m3")
@JvmField()
val m3 = m2 * m

/**
 * Minute (time)
 */
val Number.min: Second
    /**
     * Get time in minutes for this value
     */
    get()  = Second(this.toDouble()*60)

/**
 * Minute (time)
 */
@JsExport
@JsName("min")
//@get:JvmName("min")
@JvmField()
val min = Second(60.0)

/**
 * Hour (time)
 */
val Number.h: Second
    /**
     * Get time in hours for this value
     */
    get()  = Second(this.toDouble()*3600)

/**
 * Hour (time)
 */
@JsExport
@JsName("h")
//@get:JvmName("h")
@JvmField()
val h = Second(3600.0)

/**
 * Day (time)
 */
val Number.d: Second
    /**
     * Get time in days for this value
     */
    get()  = Second(this.toDouble()*24*3600)

/**
 * Day (time)
 */
@JsExport
@JsName("d")
//@get:JvmName("d")
@JvmField()
val d = Second(24*3600.0)

/**
 * Astronomical unit 149597870700 metre
 */
val Number.au: Metre
    get()  = Metre(this.toDouble()*149597870700)

/**
 * Astronomical unit 149597870700 metre
 */
@JsExport
@JsName("au")
//@get:JvmName("au")
@JvmField()
val au = 1.0.au

/**
 * Mathematical constant (Archimedes' constant π). The numeric value of π is approximately 3.1415926536
 */
const val π = PI

/**
 * Euler's number e. The numeric value of e is approximately 2.7182818284
 */
const val e = E


/**
 * hectare
 */
val Number.ha: Expression
    get() = this.toDouble() * (10 `^` 4) * m2

/**
 * hectare
 */
@JsExport
@JsName("ha")
//@get:JvmName("ha")
@JvmField()
val ha = 1.0.ha

/**
 * Litre
 */
val Number.l: Expression
    /**
     * get litre
     */
    get() = Metre(this.toDouble()/10.0) * (Metre(0.1) * Metre(0.1))

/**
 * Litre
 */
//@JsExport
@JvmField
//@JsName("l")
//@get:JvmName("l")
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

@JsExport
@JvmField
@JsName("L")
//@get:JvmName("L")
val L = l

/**
 * tonne
 */
val Number.t: Kilogram
    /**
     * get tonne
     */
    get() = Kilogram(this.toDouble()*1000.0)

/**
 * tonne
 */
@JsExport
@JvmField()
@JsName("t")
//@get:JvmName("t")
val t = 1000.kg

/**
 * dalton
 */
val Number.Da: Kilogram
    /**
     * get dalton
     */
    get() = Kilogram(this.toDouble() * 1.660539040 * (10.0.pow(-27)))

/**
 * dalton
 */
@JsExport
@JsName("Da")
//@get:JvmName("Da")
@JvmField()
val Da = 1.Da

/**
 * electronvolt
 */
val Number.eV: Expression
    /**
     * get electronvolt
     */
    get() = Expression(1.602176634*(10.0.pow(-19)) , 1.J.dimensions)

/**
 * electronvolt
 */
@JsExport
@JsName("ev")
//@get:JvmName("ev")
@JvmField()
val eV = 1.eV


/**
 * Percentage
 */
val Number.percentage: Double
    /**
     * get Percentage
     */
  get()  = this.toDouble()*0.01

/**
 * Percentage
 */
@JsExport
@JsName("percentage")
//@get:JvmName("percentage")
@JvmField()
val percentage = 0.01

/**
 * Percentage as double
 */
val Expression.asPercentage : Double
    /**
     * get percentage as double
     */
    get()  = this.value*100.0








