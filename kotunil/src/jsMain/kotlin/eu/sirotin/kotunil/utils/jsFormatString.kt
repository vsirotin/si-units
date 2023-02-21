package eu.sirotin.kotunil.utils

import kotlin.math.pow
import kotlin.math.roundToInt

// TODO there has to be a better way to do this
actual fun formatValue(format: String, value: Double, decimalSeparator: Char): String {
    val decimalPoints = format.substringAfterLast('.').length

    val factor = 10.0.pow(decimalPoints.toDouble())
    val formatted = ((value * factor).roundToInt() / factor).toString()
    val regex = """([.,])""".toRegex()
    return regex.replace(formatted, "$decimalSeparator")
}