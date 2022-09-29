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

class Product<A: Unit, B: Unit>(val a: A, val b: B): Unit(a.value * b.value){
    override fun <T : Unit> newInstance(value: Double): T {
        TODO("Not yet implemented")
    }

    override val symbol: String = a.symbol + b.symbol

}

operator fun<A: Unit, B: Unit> A.times(b: B): Product<A, B> = Product(this, b)

operator fun<T: Unit, D: Unit> Product<T, D>.div(x: D): T {
    return this.a.newInstance(this.a.value * this.b.value / x.value)
}

@JvmName("div2")
operator fun<T: Unit, D: Unit> Product<T, D>.div(x: T): D {
    return this.b.newInstance(this.a.value * this.b.value / x.value)
}