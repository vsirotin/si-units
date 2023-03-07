package eu.sirotin.kotunil.generator.apps.jvm.kotlin

import eu.sirotin.kotunil.generator.apps.ROOT_PATH_APPS

const val ROOT_KOTLIN_CONSOLE_PATH = "${ROOT_PATH_APPS}jvm/kotlin-console/src/main/kotlin/eu/sirotin/kotunil/"
object GeneratorKotlinConsoleApp {
    fun generateApp() {
        generateSiUnitsBaseClassesTests()
        generateSiUnitsDerivedClassesTests()
    }
}