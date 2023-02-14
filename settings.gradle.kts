pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        kotlin("multiplatform") version "1.8.10" apply false
        id("com.vanniktech.maven.publish") version "0.24.0" apply false
    }
}

rootProject.name = "si-units"

include(":kotunil")
