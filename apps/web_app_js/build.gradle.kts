plugins {
    kotlin("js") //version "1.8.10"
    //kotlin("js") version "1.7.10"
  //  kotlin("plugin.serialization") version "1.7.10"
}

group = "eu.sirotin.kotunil.app.js"
version = "1.0-SNAPSHOT"

repositories {
    //mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.354"))
//        implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
//
//    //Kotlin React Emotion (CSS) (chapter 3)
//    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion")
//
//    //Video Player (chapter 7)
//    implementation(npm("react-player", "2.10.1"))
//
//    //Share Buttons (chapter 7)
//    implementation(npm("react-share", "4.4.0"))
//
//    //Coroutines & serialization (chapter 8)
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")
//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
}

kotlin {
    js {
        browser {
            commonWebpackConfig {
      //          cssSupport.enabled = true
            }
        }
        binaries.executable()
    }
}

// Heroku Deployment (chapter 9)
tasks.register("stage") {
    dependsOn("build")
}

//apps.web_app_js.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
//    versions.webpackCli.version = "4.10.0"
//}

