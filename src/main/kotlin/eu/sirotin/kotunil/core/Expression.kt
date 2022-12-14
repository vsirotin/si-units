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

import java.lang.IllegalArgumentException
import kotlin.math.pow

/**
 * Prefix for mostly run-time errors.
 */
const val COMPATIBILITY_ERR_PREFIX = "Can't process objects with different dimensions:"

/**
 * Tolerance by double comparison
 */
const val ε = 1.0E-12

/**
 * Implements expression of unit with given [value] and [dimensions]
 * @constructor Creates expression of unit with given [value] and [dimensions]
 */
open class Expression(val value: Double, val dimensions: Dimensions): Comparable<Expression>, UnitPresentation {

    constructor(value: Double = 1.0, description: UnitSpecification<*>)
            : this(value, Dimensions(setOf(Factor(description))))

    /**
     * Compares expressions
     */
    override fun compareTo(other: Expression): Int {
        checkCompatibility(other)
        return value.compareTo(other.value)
    }

    private fun checkCompatibility(other: Expression) {
        if (this.unitSymbols() != other.unitSymbols())
            throw IllegalArgumentException("$COMPATIBILITY_ERR_PREFIX '${unitSymbols()}' and ${other.unitSymbols()}")
    }

    /**
     * Returns representation of unit as sequence of separate union symbols
     * and their powers according SI-Standard recommendations.
     */
    override fun unitSymbols() : String = dimensions.unitSymbols()

    /**
     * Returns representation of unit as sequence of separate category symbols
     * and their powers according SI-Standard recommendations.
     */
    override fun categorySymbols(): String = dimensions.categorySymbols()

    /**
     * Generate pretty formatted representation of unit
     * with help of [format] according Kotlin's rules for string-formatting.
     */
    fun show(format: String): String = "${String.format(format, value)} ${unitSymbols()}"

    override fun toString(): String {
        return "$value ${unitSymbols()}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
   //     if (javaClass != other?.javaClass) return false

        try {other as Expression} catch(e: Throwable){return false}

        if (value != other.value) return false
        if (dimensions != other.dimensions) return false

        return true
    }

    override fun hashCode(): Int {
        var result = value.hashCode()
        result = 31 * result + dimensions.hashCode()
        return result
    }
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
infix fun Number.`^`(degree: Number) = this.toDouble().pow(degree.toDouble())

/**
 * Allows to power an expression to given [degree]
 */
infix fun Expression.`^`(degree: Number) = this.pow(degree)

/**
 * Allows to add expressions.
 */
operator fun Expression.plus(other: Expression): Expression =
    Expression(this.value + other.value, this.dimensions + other.dimensions)

/**
 * Allows to multiply expressions.
 */
operator fun Expression.times(other: Expression): Expression =
    Expression(this.value * other.value, this.dimensions * other.dimensions)

/**
 * Allows to multiply expression and number.
 */
operator fun Expression.times(multiplicative: Number): Expression =
    Expression(this.value * multiplicative.toDouble(), this.dimensions)

/**
 * Allows to multiply number and expressions.
 */
operator fun Number.times(p: Expression): Expression = p * this

/**
 * Allows to subtract expressions.
 */
operator fun Expression.minus(p: Expression): Expression = this + (-1 * p)

/**
 * Allows to divide expressions.
 */
operator fun Expression.div(p: Expression): Expression = this * (p.pow(-1))

/**
 * Allows to divide number to expression.
 */
operator fun Number.div(p: Expression): Expression = this.toDouble() * (p.pow(-1))

/**
 * Allows to divide expression to number.
 */
operator fun Expression.div(x: Number): Expression = 1 / (x.toDouble() / this)




