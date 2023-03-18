package eu.sirotin.kotunil.generator.apps

import eu.sirotin.kotunil.generator.apps.jvm.java.GeneratorJavaConsoleApp
import eu.sirotin.kotunil.generator.apps.jvm.kotlin.GeneratorKotlinConsoleApp

const val ROOT_PATH_APPS = "apps/"

object GeneratorApps {
    fun generateApplications() {
        GeneratorKotlinConsoleApp.generateApp()
        GeneratorJavaConsoleApp.generateApp()
    }
}