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

import eu.sirotin.kotunil.base.Second
import kotlin.js.JsExport
import kotlin.jvm.JvmField

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
@JvmField
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
@JvmField
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
@JvmField
val d = Second(24*3600.0)














