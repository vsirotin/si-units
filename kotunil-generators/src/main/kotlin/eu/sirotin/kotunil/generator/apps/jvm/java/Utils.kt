package eu.sirotin.kotunil.generator.apps.jvm.java

import kotlin.math.abs

fun capitalizeFirst(s: String): String {
    return s.replaceFirstChar { it.uppercase() }
}

fun generatePowName(degree: Int): String {
    return "pow" + if(degree >= 0) degree else "M${abs(degree)}"
}