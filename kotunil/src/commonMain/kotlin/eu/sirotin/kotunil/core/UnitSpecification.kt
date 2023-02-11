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

package eu.sirotin.kotunil.core

/**
 * Specifies unit with properties as [unitSymbol] e.g. 'm', [categorySymbol] as 'L',
 * [presentationPriority] for pretty printing e.g. by metre and second should be 'ms' ans not 'sm'.
 * and creation function [creator].
 */
data class UnitSpecification<T : Expression>(val unitSymbol: String,
                                           val categorySymbol: String,
                                           val presentationPriority: Int = 0,
                                           val creator: (v : Double) -> T)

/**
 * Defines functions for pretty printing and dimensional analysis of measured units.
 */
interface UnitPresentation {
    /**
     * Returns unit symbol of measured units, e.g. 'm/s'
     */
    fun unitSymbols() : String

    /**
     * Returns category symbol of measured units, e.g. 'L3S-1'
     */
    fun categorySymbols(): String
}