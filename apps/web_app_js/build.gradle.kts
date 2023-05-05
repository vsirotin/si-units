plugins {
    kotlin("js")
}

group = "eu.sirotin.kotunil.app.js"
version = "1.0-SNAPSHOT"

tasks.register("npmInstall") {
    doLast {
        exec {
            executable("npm")
            args("i")
        }
        println("Please see installed KotUniL lib in directory 'apps/web_app_js/node_modules/kotunil-js-lib'")
    }
}



