
group = "eu.sirotin.kotunil.app.js"
version = "4.1.1"

tasks.register("npmInstall") {
    doLast {
        exec {
            executable("npm")
            args("i")
        }
        println("Please see installed KotUniL lib in directory 'apps/web_app_js/node_modules/kotunil-js-lib'")
    }
}



