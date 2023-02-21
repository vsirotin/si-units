package eu.sirotin.kotunil.utils

actual fun formatValue(format: String, value: Double, decimalSeparator: Char): String {
    val decimalPoints = format.substringAfterLast('.').length
    val formatted = "%.${decimalPoints}f".format(value)
    val regex = """([.,])""".toRegex()
    val grim = regex.replace(formatted, "$decimalSeparator")
    return grim
}