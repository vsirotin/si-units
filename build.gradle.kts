allprojects {
    group = "eu.sirotin.kotunil"

    repositories {
        mavenCentral()
    }
    extra.apply {
        set("kotunil-js-dev-version", "4.1.2")
    }
}


val v: String = ""
plugins {
    kotlin("multiplatform") version "1.9.10" apply false
//    id("org.jetbrains.dokka") version "1.8.10"
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


