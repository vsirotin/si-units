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

package eu.sirotin.kotunil.app.kotlin

import eu.sirotin.kotunil.base.m
import kotlin.math.abs
import kotlin.system.exitProcess


fun main() {
    println("Welcome in KotUniL console test!")
    val v1 = 2.42.m
    println("v1=${v1}")

    try {
        test(2.41,v1.value)
    } catch (e: Throwable) {
        print(e.stackTraceToString())
        exitProcess(1)
    }
}

fun <T:Comparable<T>> test(a:T, b:T) {
    if(a.compareTo(b) == 0)return
    throw AssertionError("Expected '$a' but is '$b'")
}

fun  test(a:Double, b:Double, maxDif: Double = 0.0000001) {
    if(abs(a - b) < maxDif)return
    throw AssertionError("Expected '$a' but is '$b'")
}


