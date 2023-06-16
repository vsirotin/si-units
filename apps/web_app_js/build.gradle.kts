
group = "eu.sirotin.kotunil.app.js"
version = "4.1.1"


dependencies {
    project(":kotunil-generators")
    project(":kotunil")
    project(":js-lib")
}

tasks.register("installFromNpmGlobal") {
    doLast {
        exec {
            executable("npm")
            args("i")
        }
        logger.quiet("Please see installed KotUniL lib in directory 'apps/web_app_js/node_modules/kotunil-js-lib'")
    }
}

tasks.register("installFromLocalDirectory") {
    doLast {
        exec {
            executable("npm")
            args("install", "../../js-lib")
        }
        logger.quiet("Please see installed KotUniL lib in directory 'apps/web_app_js/node_modules/kotunil-js-lib'")
    }
}



