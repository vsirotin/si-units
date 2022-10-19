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
 *  *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 */

package eu.sirotin.siunits.core

import java.lang.IllegalArgumentException
import kotlin.math.abs

data class Dimensions(val factors: Set<Factor>) : DimensionsPresentation {

    fun checkCompatibility(other: Dimensions) {
        if (this.unitSymbols() != other.unitSymbols())
            throw IllegalArgumentException("$COMPATIBILITY_ERR_PREFIX '${unitSymbols()}' and ${other.unitSymbols()}")
    }

    override fun unitSymbols() : String {
        var top = ""
        factors.sorted().filter { it.powerValue > 0.0 }.forEach{top += dimOf(it) }

        var down = ""
        factors.sorted().filter { it.powerValue < 0.0 }.forEach{down += dimOf(it, true) }

        if(top.isEmpty() && down.isNotEmpty())top = "1"

        val mid = if(down.isEmpty()) "" else "/"
        return "$top$mid$down"
    }

    override fun dimensionSymbols(): String = factors
        .sorted()
        .joinToString("") {it.specification.dimensionSymbol + tryFormatToIntNotOne(it.powerValue) }

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

data class Factor(val specification: DimensionSpecification<*>, val powerValue: Double = 1.0) : Comparable<Factor> {
    override fun compareTo(other: Factor): Int  =
        -this.specification.presentationPriority.compareTo(other.specification.presentationPriority)

}

operator fun Dimensions.plus(other: Dimensions): Dimensions  {
    checkCompatibility(other)
    return Dimensions(this.factors.toSet())
}

operator fun Dimensions.times(other: Dimensions): Dimensions  {
    val thisDimensionSymbols = this.factors.map { it.specification.dimensionSymbol }.toSet()
    val otherDimensionSymbols = other.factors.map { it.specification.dimensionSymbol }.toSet()
    val commonDimensionSymbols = thisDimensionSymbols.intersect(otherDimensionSymbols)
    val commonFactors = this.factors.filter { commonDimensionSymbols.contains(it.specification.dimensionSymbol)}.toSet()
    val newCommonFactors = commonFactors.mapNotNull { plusCommonFactors(it, this.factors, other.factors) }.toSet()
    val restThisFactors = this.factors.filter { !commonDimensionSymbols.contains(it.specification.dimensionSymbol)}.toSet()
    val restOtherFactors = other.factors.filter { !commonDimensionSymbols.contains(it.specification.dimensionSymbol)}.toSet()

    val newFactors: Set<Factor> = newCommonFactors + restThisFactors + restOtherFactors
    return Dimensions(newFactors)

}
fun Dimensions.pow(degree: Number): Dimensions {
    val resFactors = this.factors
        .map { Factor(it.specification, it.powerValue * degree.toDouble())  }
        .toSet()
    return Dimensions(resFactors)
}
private fun roundedToInt(v: Double): Boolean = abs(v.toInt() - v) < EPS

private fun plusCommonFactors(f: Factor, set1: Set<Factor>, set2: Set<Factor>) : Factor? {
    val f1 = set1.find { it.specification == f.specification }
    val f2 = set2.find { it.specification == f.specification }
    val powerValue = f1!!.powerValue + f2!!.powerValue
    return if(abs(powerValue) > EPS) Factor(f.specification, powerValue) else null
}