package eu.sirotin.kotunil.app.kotlin

import eu.sirotin.kotunil.core.Expression
import kotlin.math.abs

private val objects = mutableSetOf<String>()
fun <T1: Expression, T2: Expression> check(a:T1, b:T2) {
    tryAddObj(a, b)
    if(a == b)return
    throw AssertionError("Expected '$a' but is '$b'")
}

fun  check(a:Double, b:Double, maxDif: Double = 0.0000001) {
    TestStatistics.numberTests++
    if(abs(a - b) < maxDif)return
    throw AssertionError("Expected '$a' but is '$b'")
}

fun  check(a:String, b:String,) {
    TestStatistics.numberTests++
    if(a == b)return
    throw AssertionError("Expected '$a' but is '$b'")
}

private fun tryAddObj(e1: Expression, e2: Expression? = null) {
    TestStatistics.numberTests++
    val u1 = e1.dimensions.unitSymbols()
    if(objects.contains(u1))return;

    objects.add(u1)
    TestStatistics.numberTestedObjects++

    if(e2 == null)return
    val u2 = e2.dimensions.unitSymbols()
    if(objects.contains(u2))return;
    objects.add(u2)
    TestStatistics.numberTestedObjects++
}

fun  check(a: Boolean) {
    TestStatistics.numberTests++
    if(a)return
    throw AssertionError("Expected True but is False")
}

object TestStatistics {
    var numberTestedObjects: Int = 0
    var numberTests: Int = 0
}