package eu.sirotin.kotunil.app.kotlin

import eu.sirotin.kotunil.core.Expression
import kotlin.math.abs

val objectTypes = mutableSetOf<String>()
val objects = mutableSetOf<Expression>()
var numberTests: Int = 0
fun <T1: Expression, T2: Expression> check(a:T1, b:T2) {
    numberTests++
    tryAddObject(a)
    tryAddObject(b)
    if(a == b)return
    throw AssertionError("Expected '$a' but is '$b'")
}

fun  check(a:Double, b:Double, maxDif: Double = 0.0000001) {
    numberTests++
    if(abs(a - b) < maxDif)return
    throw AssertionError("Expected '$a' but is '$b'")
}

fun  check(a:String, b:String,) {
    numberTests++
    if(a == b)return
    throw AssertionError("Expected '$a' but is '$b'")
}


private fun tryAddObject(e1: Expression) {
    objects.add(e1)
    objectTypes.add(e1.unitSymbols())
}

fun  check(a: Boolean) {
    numberTests++
    if(a)return
    throw AssertionError("Expected True but is False")
}

