allprojects {
    group = "eu.sirotin.kotunil"

    repositories {
        mavenCentral()
    }
    extra.apply {
        set("kotunil-version", "4.2.1")
        set("kotunil-js-lib-version", "4.2.1")
    }
}


plugins {
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.dokka) apply false
}

tasks.register("cleanAll"){
    dependsOn(":kotunil-generators:clean")
    dependsOn(":kotunil:clean")
    dependsOn(":js-lib:clean")
    dependsOn(":apps:node_ts_app:clean")
    dependsOn(":apps:web_app_js:clean")
}

tasks.register("buildAll"){
    dependsOn(":kotunil-generators:build")
    dependsOn(":kotunil:build")
    dependsOn(":js-lib:build")
    dependsOn(":apps:node_ts_app:build")
    dependsOn(":apps:web_app_js:build")
}

//
////TODO make compatible with other Dokka's configurations
//// Configure all single-project Dokka tasks at the same time,
//// such as dokkaHtml, dokkaJavadoc and dokkaGfm.
//tasks.withType<DokkaTask>().configureEach {
//    dokkaSourceSets.configureEach {
//        documentedVisibilities.set(
//            setOf(
//                DokkaConfiguration.Visibility.PUBLIC,
//                DokkaConfiguration.Visibility.PROTECTED,
//            )
//        )
//
//        perPackageOption {
//            matchingRegex.set(".*internal.*")
//            suppress.set(true)
//        }
//    }
//}


