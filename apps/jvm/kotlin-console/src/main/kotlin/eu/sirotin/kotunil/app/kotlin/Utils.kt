package eu.sirotin.kotunil.app.kotlin

import kotlin.math.abs

fun <T:Comparable<T>> test(a:T, b:T) {
    TestStatistics.numberTests++
    if(a.compareTo(b) == 0)return
    throw AssertionError("Expected '$a' but is '$b'")
}

fun  test(a:Double, b:Double, maxDif: Double = 0.0000001) {
    if(abs(a - b) < maxDif)return
    throw AssertionError("Expected '$a' but is '$b'")
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