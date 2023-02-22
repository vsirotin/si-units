package eu.sirotin.kotunil.utils

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

actual fun formatValue(format: String, value: Double, decimalSeparator: Char): String {
    val df = DecimalFormat(format)
    val dfs = DecimalFormatSymbols.getInstance()
    dfs.decimalSeparator = decimalSeparator
    df.decimalFormatSymbols = dfs
    return df.format(value)
}