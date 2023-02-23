package eu.sirotin.kotunil.utils

import kotlin.math.abs
import kotlin.math.pow

fun Number.simpleFormat(numberDigitsAfterSeparator: Int = 0, decimalSeparator: Char = ','): String {
    if(numberDigitsAfterSeparator < 0)
        throw IllegalArgumentException("numberDigitsAfterSeparator should be >= 0 but is $numberDigitsAfterSeparator")

    val prefix = this.toInt()
    if(numberDigitsAfterSeparator == 0)return "$prefix"

    val sign = if(this.toDouble() >= 0.0) "" else "-"

    val afterSeparatorPart = abs(this.toDouble() - prefix)
    val suffixInt = (10.0.pow(numberDigitsAfterSeparator) * afterSeparatorPart).toInt()
    val suffix = if(afterSeparatorPart >= 1.0) "$suffixInt" else addNullsBefore(suffixInt, numberDigitsAfterSeparator)
    return "$sign${abs(prefix)}$decimalSeparator$suffix"
}

fun addNullsBefore(suffixInt: Int, numberDigitsAfterSeparator: Int): String {
    var s = "$suffixInt"
    val len = s.length
    repeat(numberDigitsAfterSeparator - len) { _ -> s = "0$s" }
    return s
}