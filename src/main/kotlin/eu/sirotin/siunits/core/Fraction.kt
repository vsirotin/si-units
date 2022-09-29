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

class Fraction<U: Unit, D: Unit>(val up: U, val down: D): Unit(up.value/down.value){
    override fun <T : Unit> newInstance(value: Double): T {
        TODO("Not yet implemented")
    }

    override val symbol: String = up.symbol + "/" + down.symbol


}


operator fun<U: Unit, D: Unit> U.div(x: D): Fraction<U, D> = Fraction(this, x)

operator fun<T: Unit, M: Unit> Fraction<T, M>.times(x: M): T = this.up.newInstance<T>(this.up.value/this.down.value * x.value)

operator fun<T: Unit, M: Unit> M.times(x: Fraction<T, M>): T =  x * this

