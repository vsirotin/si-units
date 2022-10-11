/*
 * Copyright (c) 2022 Dr. Viktor Sirotin
 *  *
 *   * Permission is hereby granted, free of charge, to any person obtaining a copy
 *   * of this software and associated documentation files (the "Software"), to deal
 *   * in the Software without restriction, including without limitation the rights
 *   * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   * copies of the Software, and to permit persons to whom the Software is
 *   * furnished to do so, subject to the following conditions:
 *   * This Copyright header should still in file if you use it file without changes or with changes or if you copy essential part of this file in some new file.
 *  *
 *   * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 */

package eu.sirotin.siunits.core

const val COMPARING_ERROR = "Compared elements have different types:"
const val EPS = 1.0E-12

abstract class SiUnit(var value: Double, val description: SiUnitDescription<*> ) : Comparable<SiUnit>, SiDimension {

    override fun compareTo(other: SiUnit): Int {
        if(this.javaClass != other.javaClass)
            throw IllegalArgumentException("$COMPARING_ERROR 'this' is '${this.javaClass} but 'other' is '${other.javaClass}'")
        return value.compareTo(other.value)
    }

    override fun dim(): String {
        return "${this.description.unitSymbol}"
    }

    override fun toString(): String {
        return "${this.value} ${dim()}"
    }



}

