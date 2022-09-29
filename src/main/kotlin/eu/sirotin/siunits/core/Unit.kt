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
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 */

package eu.sirotin.siunits.core

const val COMPARING_ERROR = "Compared elements have different types:"

abstract class Unit(val value: Double) : Comparable<Unit>{

    abstract fun<T: Unit> newInstance(value: Double)  : T
    abstract val symbol : String

    override fun toString(): String {
        return "${this.value} ${this.symbol}"
    }

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Unit -> other.value == value
            else -> false
        }
    }

    override fun hashCode(): Int {
        var result = value.hashCode()
        result = 31 * result + symbol.hashCode()
        return result
    }

    override fun compareTo(other: Unit): Int {
        if(this.javaClass != other.javaClass)
            throw IllegalArgumentException("$COMPARING_ERROR 'this' is '${this.javaClass} but 'other' is '${other.javaClass}'")
        return value.compareTo(other.value)
    }



}

operator fun<U: Unit> U.plus(x: U): U = this.newInstance(this.value + x.value)
operator fun<U: Unit> U.minus(x: U): U = this.newInstance(this.value - x.value)
operator fun<U: Unit> U.times(x: Number): U = this.newInstance(this.value * x.toDouble())
operator fun<U: Unit> Number.times(x: U): U = x * this