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


class SiUnitProduct(vararg siUnits: SiUnit): Comparable<SiUnit>, SiDimension {


    var value: Double = 0.0

    private var factors: MutableList<PoweredSiUnit>  = mutableListOf()
     init {
         siUnits.forEachIndexed { index, siUnit ->
             run {
                 if (index == 0) {
                     value = siUnit.value
                     val p = PoweredSiUnit(siUnit, 1.0)
                     factors.add(p)
                 } else {
                     value *= siUnit.value
                     var pNewPowerValue = 1.0
                     factors.find { it.description == siUnit.description }?.let {
                         pNewPowerValue = it.powerValue++
                         factors.remove(it)
                     }
                     val pNew = PoweredSiUnit(siUnit, pNewPowerValue)
                     factors.add(pNew)
                 }
             }


         }

     }

    fun inverse() : SiUnitProduct {
        val res = SiUnitProduct()
        res.value = 1.0/value
        factors.forEach {
            val p = it.copy()
            p.powerValue = -p.powerValue
            res.factors.add(p)
        }
        return res
    }

    fun <T: SiUnit> toSiUnit(): T {
        if(factors.size != 1) throw IllegalStateException("TODO")
        val p = factors.first()
        @Suppress("UNCHECKED_CAST")
        return p.description.creator(value) as T
    }

    fun processTimes(u: SiUnit): SiUnitProduct {

        if(factors.isEmpty())return SiUnitProduct(u)

        val p: PoweredSiUnit? = factors.find { it.description == u.description }
        val newFactors = factors.toMutableList()
        if(p != null){
            val pNew = PoweredSiUnit( p.powerValue + 1, p.description)
            newFactors.remove(p)
            newFactors.add(pNew)
        }else{
            val pNew = PoweredSiUnit(u)
            newFactors.add(pNew)
        }
        val res = SiUnitProduct()
        res.factors = newFactors
        res.value = this.value * u.value
        return res

    }

    fun processDiv(u: SiUnit): SiUnitProduct {

        //TODO check
        val p: PoweredSiUnit = factors.first { it.description == u.description }
        value /= u.value
        p.powerValue -=1
        return this
    }


    fun processDiv(u: SiUnitProduct): SiUnitProduct {

        val p1: PoweredSiUnit = factors.first()
        val p2: PoweredSiUnit = u.factors.first()

        value /= u.value
        p1.powerValue -= p2.powerValue
        return this
    }

    override fun compareTo(other: SiUnit): Int {
        TODO("Not yet implemented")
    }

    override fun dim(): String {
        var top = ""
        factors.filter { it.powerValue > 0.0 }.forEach{top += it.description.unitSymbol }

        var down = ""
        factors.filter { it.powerValue < 0.0 }.forEach{down += it.description.unitSymbol }

        if(top.isEmpty())top = "1"

        return "$top/$down"

    }

    override fun toString(): String {
        return "$value ${dim()}"
    }


}

operator fun SiUnit.times(b: SiUnit): SiUnitProduct = SiUnitProduct(this, b)

operator fun SiUnit.times(p: SiUnitProduct): SiUnitProduct = p * this
operator fun SiUnitProduct.times(u: SiUnit): SiUnitProduct = this.processTimes(u)
operator fun SiUnitProduct.div(u: SiUnit): SiUnitProduct = this.processDiv(u)
operator fun SiUnitProduct.div(u: SiUnitProduct): SiUnitProduct = this.processDiv(u)

operator fun SiUnit.div(u: SiUnitProduct): SiUnitProduct  = u.inverse() * this
operator fun SiUnit.div(u: SiUnit): SiUnitProduct = SiUnitProduct(u).inverse() * this


