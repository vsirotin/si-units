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
import kotlin.js.JsName
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.pow

/**
 * Prefix for mostly run-time errors.
 */
const val COMPATIBILITY_ERR_PREFIX = "Can't process objects with different dimensions:"

@JsExport
/**
 * Tolerance by double comparison
 */
const val ε = 1.0E-12

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
 * Implements expression of unit with given [value] and [dimensions]
 * @constructor Creates expression of unit with given [value] and [dimensions]
 */
open class Expression(var value: Double, val dimensions: Dimensions) : Comparable<Expression>, UnitPresentation {

    @JsName("create")
    constructor(value: Double = 1.0, description: UnitSpecification<*>)
            : this(value, Dimensions(setOf(Factor(description))))

    /**
     * Compares expressions. With small relative difference of values
     * both objects can be recognised as equal.
     */
    fun compare(other: Expression): Int{ //to make it available in JS.
        return this.compareTo(other)
    }

    /**
     * Compares expressions. With small relative difference of values
     * both objects can be recognised as equal.
     */
    override fun compareTo(other: Expression): Int {
        checkCompatibility(other)
        val d = value - other.value
        val m = max(abs(value), abs(other.value))
        if(m == 0.0)return 0
        if(abs(d)/m < ε)return 0
        return value.compareTo(other.value)
    }

    private fun checkCompatibility(other: Expression) {
        if (this.unitSymbols() != other.unitSymbols())
            throw IllegalArgumentException("$COMPATIBILITY_ERR_PREFIX '${unitSymbols()}' and ${other.unitSymbols()}")
    }

    /**
     * Returns representation of unit as sequence of separate union symbols
     * and their powers according to SI-Standard recommendations.
     */
    override fun unitSymbols(): String = dimensions.unitSymbols()

    /**
     * Returns representation of unit as sequence of separate category symbols
     * and their powers according to SI-Standard recommendations.
     */
    override fun categorySymbols(): String = dimensions.categorySymbols()

    /**
     * Represents value as string with two digits after point as decimal separator.
     * Please pay attention: representation of value depends on platform local settings on used computer!
     */
    override fun toString(): String {
        return "$value ${unitSymbols()}"
    }

    /**
     * With small relative difference of values
     * both objects can be recognised as equal.
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        try {
            other as Expression
            if(compareTo(other) == 0)return true
        } catch (e: Throwable) {
            return false
        }
        return false
    }

    override fun hashCode(): Int {
        var result = value.hashCode()
        result = 31 * result + dimensions.hashCode()
        return result
    }

    /**
     * Allows to add expressions.
     */
    @JsName("plus")
    fun plus(other: Expression) = this + other

    /**
     * Allows to subtract expressions.
     */
    fun minus(other: Expression) = this - other


    /**
     * Allows to multiply expressions.
     */
    @JsName("timesExp")
    fun times(other: Expression) = this * other

    /**
     * Allows to multiply expression and number.
     */
    fun times(other: Number) = this * other


    /**
     * Allows to divide expressions.
     */
    @JsName("divExp")
    fun div(other: Expression) = this /other

    /**
     * Allows to divide expression on number.
     */
    fun div(other: Number) =  this /other

    /**
     * Allows to divide number on expression.
     */
    fun numberDivOn(other: Number) =  other/this

    /**
     * Allows to power an expression to given [degree]
     */
    fun pw(degree: Number): Expression = this.pow(degree)
}

/**
 * Allows to power an expression to given [degree]
 */
fun Expression.pow(degree: Number): Expression {
    return Expression(this.value.pow(degree.toDouble()), this.dimensions.pow(degree))
}

/**
 * Allows to power an number to given [degree]
 */
@JsName("powNumber")
infix fun Number.`^`(degree: Number): Number = this.toDouble().pow(degree.toDouble())

/**
 * Allows to power an expression to given [degree]
 */
@JsName("powExpression")
infix fun Expression.`^`(degree: Number) = this.pow(degree)

/**
 * Allows to add expressions.
 */
operator fun Expression.plus(other: Expression) =
    Expression(this.value + other.value, this.dimensions + other.dimensions)

/**
 * Allows to multiply expressions.
 */
operator fun Expression.times(other: Expression) =
    Expression(this.value * other.value, this.dimensions * other.dimensions)

/**
 * Allows to multiply expression and number.
 */
operator fun Expression.times(multiplicative: Number) =
    Expression(this.value * multiplicative.toDouble(), this.dimensions)

/**
 * Allows to multiply number and expressions.
 */
operator fun Number.times(p: Expression) = p * this

/**
 * Allows to subtract expressions.
 */
operator fun Expression.minus(p: Expression) = this + (-1 * p)

/**
 * Allows to divide expressions.
 */
operator fun Expression.div(p: Expression) = this * (p.pow(-1))

/**
 * Allows to divide number to expression.
 */
operator fun Number.div(p: Expression) = this.toDouble() * (p.pow(-1))

/**
 * Allows to divide expression to number.
 */
operator fun Expression.div(x: Number): Expression = 1 / (x.toDouble() / this)

/**
 * Allows to calculate the remainder of truncating division of this value by the other value.
 */
operator fun Expression.rem(other: Expression): Expression {
    val v1 = this.value
    val v2 = other.value
    val res = this / other
    res.value *= (v2 / v1) * (v1 % v2)
    return res
}

/**
 * Implementation of `+=`
 */
operator fun Expression.unaryPlus() = Expression(this.value.unaryPlus(), this.dimensions)

/**
 * Implementation of `-=`
 */
operator fun Expression.unaryMinus() = Expression(this.value.unaryMinus(), this.dimensions)
