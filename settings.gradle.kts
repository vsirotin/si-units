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
include(":js-lib")
include(":apps:jvm:kotlin-console")
include(":apps:jvm:java-console")
include(":apps:web_app_js")
include("apps:node_ts_app")
