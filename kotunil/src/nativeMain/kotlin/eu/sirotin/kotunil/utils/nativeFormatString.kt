package eu.sirotin.kotunil.utils

import kotlin.math.pow
import kotlin.math.roundToInt

//actual fun formatValue(format: String, value: Double, decimalSeparator: Char): String {
//    val regex = """([.,])""".toRegex()
//    val decimalPoints = if (format.contains('.') || format.contains(',')) {
//        val normalized = regex.replace(format, ".")
//        normalized.substringAfterLast('.').length
//    } else {
//        1
//    }
//
//    val factor = 10.0.pow(decimalPoints.toDouble())
//    val formatted = ((value * factor).roundToInt() / factor).toString()
//    return regex.replace(formatted, "$decimalSeparator")
//}
