package eu.sirotin.siunits.core

import java.lang.IllegalArgumentException
import kotlin.math.abs


data class Dimensions(val factors: Set<Factor>) {

    fun checkCompatibility(other: Dimensions) {
        if (this.units() != other.units())
            throw IllegalArgumentException("$COMPATIBILITY_ERR_PREFIX '${units()}' and ${other.units()}")
    }

    fun units() : String {
        var top = ""
        factors.sorted().filter { it.powerValue > 0.0 }.forEach{top += dimOf(it) }

        var down = ""
        factors.sorted().filter { it.powerValue < 0.0 }.forEach{down += dimOf(it, true) }

        if(top.isEmpty() && down.isNotEmpty())top = "1"

        val mid = if(down.isEmpty()) "" else "/"
        return "$top$mid$down"
    }

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
    return if(abs(powerValue.toInt() - powerValue) < EPS) Factor(f.specification, powerValue) else null
}