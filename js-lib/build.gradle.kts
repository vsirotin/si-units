
group = "eu.sirotin.kotunil"

plugins {
    id("java") //To available dependencies
}

dependencies {
    implementation(project(":kotunil"))
}

//TODO tasks.register("publishJavaScriptLibLocally") {
//
//    doLast {
//        exec {
//            executable("npm")
//            args("version 4.1.1")
//        }
//        println("Please see installed KotUniL lib in directory 'apps/web_app_js/node_modules/kotunil-js-lib'")
//    }
//}
//
//tasks.register("publishJavaScriptLibGlobally") {
//    doLast {
//        exec {
//            executable("npm")
//            args("i")
//        }
//        println("Please see installed KotUniL lib in directory 'apps/web_app_js/node_modules/kotunil-js-lib'")
//    }
//}

