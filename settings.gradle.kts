pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "si-units"

include(":kotunil")
include(":kotunil-generators")
include(":apps:jvm:kotlin-console")
include(":apps:jvm:java-console")
