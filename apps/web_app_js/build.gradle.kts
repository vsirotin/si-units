
group = "eu.sirotin.kotunil.app.js"
version = "4.1.1"

plugins {
    id("java") //To enable project dependencies
}

dependencies {
    implementation(project(":kotunil"))
    implementation(project(":js-lib"))
}

tasks.register("npmInstall") {
    doLast {
        exec {
            executable("npm")
            args("i")
        }
        println("Please see installed KotUniL lib in directory 'apps/web_app_js/node_modules/kotunil-js-lib'")
    }
}



