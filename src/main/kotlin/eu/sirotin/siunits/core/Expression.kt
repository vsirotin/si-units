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
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 */

package eu.sirotin.siunits.core

import java.lang.IllegalArgumentException
import kotlin.math.abs
import kotlin.math.pow


const val ERR_CONVERSION_PREFIX = "Can't convert a multi-dimensional expression with dimensions "
const val ERR_CONVERSION_SUFFIX = " in simply unit"

const val ERR_CONVERSION_DIMENSIONLESS = "Can't convert dimensionless expression in some unit"

class Expression(val value: Double, val dimensions: Dimensions): Comparable<Expression>, DimensionsPresentation {

    companion object Factory {
        fun createFromSiUnit(siu: TermUnit): Expression {
            return Expression(siu.value, Dimensions(setOf(Factor(siu.description))))
        }

    }

    fun <T: TermUnit> toTermUnit(): T {
        if(dimensions.factors.isEmpty())
            throw IllegalStateException(ERR_CONVERSION_DIMENSIONLESS)

        if((dimensions.factors.size != 1) || (abs(dimensions.factors.first().powerValue - 1.0) > EPS))
                throw IllegalStateException("$ERR_CONVERSION_PREFIX${this.dimensionSymbols()}$ERR_CONVERSION_SUFFIX")
        val p = dimensions.factors.first()
        @Suppress("UNCHECKED_CAST")
        return p.specification.creator(value) as T
    }

    override fun compareTo(other: Expression): Int {
        checkCompatibility(other)
        return value.compareTo(other.value)
    }

    private fun checkCompatibility(other: Expression) {
        if (this.unitSymbols() != other.unitSymbols())
            throw IllegalArgumentException("$COMPATIBILITY_ERR_PREFIX '${unitSymbols()}' and ${other.unitSymbols()}")
    }

    override fun unitSymbols() : String = dimensions.unitSymbols()
    override fun dimensionSymbols(): String = dimensions.dimensionSymbols()
    fun show(format: String): String = "${String.format(format, value)} ${unitSymbols()}"

    override fun toString(): String {
        return "$value ${unitSymbols()}"
    }
}

//Operators
fun Expression.pow(degree: Number): Expression {
    return Expression(this.value.pow(degree.toDouble()), this.dimensions.pow(degree))
}

fun TermUnit.pow(degree: Number): Expression = Expression.createFromSiUnit(this).pow(degree)
operator fun Number.div(u: TermUnit): Expression =
    Expression(this.toDouble()/u.value, Dimensions(setOf(Factor(u.description, -1.0))))

operator fun Expression.plus(u: TermUnit): Expression = this + Expression.createFromSiUnit(u)

operator fun Expression.plus(other: Expression): Expression =
    Expression(this.value + other.value, this.dimensions + other.dimensions)
operator fun TermUnit.plus(p: Expression): Expression = p + this


operator fun Expression.times(other: Expression): Expression =
    Expression(this.value * other.value, this.dimensions * other.dimensions)
operator fun Expression.times(u: TermUnit): Expression =
   this * Expression.createFromSiUnit(u)
operator fun TermUnit.times(u: TermUnit): Expression = this *  Expression.createFromSiUnit(u)

operator fun TermUnit.times(p: Expression): Expression = p * this
operator fun Expression.times(multiplicative: Number): Expression =
    Expression(this.value * multiplicative.toDouble(), this.dimensions)

operator fun Number.times(p: Expression): Expression = p * this

operator fun Expression.minus(p: Expression): Expression = this + (-1 * p)
operator fun Expression.minus(u: TermUnit): Expression = this + (-1 * Expression.createFromSiUnit(u))
operator fun TermUnit.minus(p: Expression): Expression = p + this


operator fun Expression.div(p: Expression): Expression = this * (p.pow(-1))
operator fun Number.div(p: Expression): Expression = this.toDouble() * (p.pow(-1))
operator fun Expression.div(x: Number): Expression = 1 / (x.toDouble() / this)
operator fun Expression.div(u: TermUnit): Expression = this / Expression.createFromSiUnit(u)
operator fun TermUnit.div(p: Expression): Expression = 1 / (p / Expression.createFromSiUnit(this))
operator fun TermUnit.div(u: TermUnit): Expression = this / Expression.createFromSiUnit(u)



