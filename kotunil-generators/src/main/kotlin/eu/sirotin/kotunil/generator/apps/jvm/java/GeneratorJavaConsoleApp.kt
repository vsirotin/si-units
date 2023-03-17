package eu.sirotin.kotunil.generator.apps.jvm.java

import eu.sirotin.kotunil.generator.apps.ROOT_PATH_APPS

const val ROOT_JAVA_CONSOLE_PATH = "${ROOT_PATH_APPS}jvm/java-console/src/main/java/eu/sirotin/kotunil/"
object GeneratorJavaConsoleApp {
    fun generateApp() {
        generateSiUnitsBaseClassesTests()
     //   generateSiUnitsDerivedClassesTests()
     //   generateJavaConsoleTestsCurrencies()
    }
}