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


import kotlin.js.JsExport
import kotlin.math.abs

/**
 * Describes dimensions of a unit with help of [factors].
 * A factor describes one separate dimension.
 * @constructor Creates dimensions of a unit with help of [factors].
 */
@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
data class Dimensions(val factors: Set<Factor>) : UnitPresentation {

    /**
     * Check compatibility for algebraic operations for dimension objects.
     */
    fun checkCompatibility(other: Dimensions) {
        if (this.unitSymbols() != other.unitSymbols())
            throw IllegalArgumentException("$COMPATIBILITY_ERR_PREFIX '${unitSymbols()}' and '${other.unitSymbols()}'")
    }

    /**
     * Returns representation of unit as sequence of separate union symbols
     * and their powers according to SI-Standard recommendations.
     */
    override fun unitSymbols() : String {
        var top = ""
        factors.sorted().filter { it.powerValue > 0.0 }.forEach{top += dimOf(it) }

        var down = ""
        factors.sorted().filter { it.powerValue < 0.0 }.forEach{down += dimOf(it, true) }

        if(top.isEmpty() && down.isNotEmpty())top = "1"

        val mid = if(down.isEmpty()) "" else "/"
        return "$top$mid$down"
    }

    /**
     * Returns representation of unit as sequence of separate category symbols
     * and their powers according to SI-Standard recommendations.
     */
    override fun categorySymbols(): String = factors
        .sorted()
        .joinToString("") {it.specification.categorySymbol + tryFormatToIntNotOne(it.powerValue) }

    private fun dimOf(p: Factor, invert: Boolean = false): String {
        val pv = if(invert) -p.powerValue else p.powerValue
        return p.specification.unitSymbol  + tryFormatToIntNotOne(pv)
    }


    private fun tryFormatToIntNotOne(v: Double): String  {
        if(roundedToInt(v)){
            val r = v.toInt()
            return if(r == 1) ""  else r.toString()
        }
        return v.toString()
    }

}

/**
 * Describes one dimension of unit as logical pair of [specification] and [powerValue].
 */
@JsExport
data class Factor(val specification: UnitSpecification<*>, val powerValue: Double = 1.0) : Comparable<Factor> {

    /**
     * Compares two factor objects
     */
    override fun compareTo(other: Factor): Int  =
        -this.specification.presentationPriority.compareTo(other.specification.presentationPriority)

}

/**
 * Allows to add dimensions.
 */
operator fun Dimensions.plus(other: Dimensions): Dimensions {
    checkCompatibility(other)
    return Dimensions(this.factors.toSet())
}

/**
 * Allows to multiply dimensions.
 */
operator fun Dimensions.times(other: Dimensions): Dimensions {
    val thisDimensionSymbols = this.factors.map { it.specification.categorySymbol }.toSet()
    val otherDimensionSymbols = other.factors.map { it.specification.categorySymbol }.toSet()
    val commonDimensionSymbols = thisDimensionSymbols.intersect(otherDimensionSymbols)
    val commonFactors = this.factors.filter { commonDimensionSymbols.contains(it.specification.categorySymbol)}.toSet()
    val newCommonFactors = commonFactors.mapNotNull { plusCommonFactors(it, this.factors, other.factors) }.toSet()
    val restThisFactors = this.factors.filter { !commonDimensionSymbols.contains(it.specification.categorySymbol)}.toSet()
    val restOtherFactors = other.factors.filter { !commonDimensionSymbols.contains(it.specification.categorySymbol)}.toSet()

    val newFactors: Set<Factor> = newCommonFactors + restThisFactors + restOtherFactors
    return Dimensions(newFactors)

}

/**
 * Allows to calculate dimension's power.
 */
fun Dimensions.pow(degree: Number): Dimensions {
    val resFactors = this.factors
        .map { Factor(it.specification, it.powerValue * degree.toDouble())  }
        .toSet()
    return Dimensions(resFactors)
}
private fun roundedToInt(v: Double): Boolean = abs(v.toInt() - v) < ε

private fun plusCommonFactors(f: Factor, set1: Set<Factor>, set2: Set<Factor>) : Factor? {
    val f1 = set1.find { it.specification == f.specification } ?: return null
    val f2 = set2.find { it.specification == f.specification } ?: return null
    val powerValue = f1.powerValue + f2.powerValue
    return if(abs(powerValue) > ε) Factor(f.specification, powerValue) else null
}