package eu.sirotin.kotunil.app.kotlin

import eu.sirotin.kotunil.core.Expression
import kotlin.math.abs

fun <T1: Expression, T2: Expression> check(a:T1, b:T2) {
    TestStatistics.numberTests++
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

fun  check(a: Boolean) {
    TestStatistics.numberTests++
    if(a)return
    throw AssertionError("Expected True but is False")
}

object TestStatistics {
    var numberTestedObjects: Int = 0
        set(value) {
            print("+")
            field = value
        }
    var numberTests: Int = 0
        set(value) {
            print(".")
            field = value
        }
}