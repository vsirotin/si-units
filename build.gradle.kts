import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.gradle.DokkaTask

group = "eu.sirotin.kotunil"


plugins {
    kotlin("multiplatform") version "1.8.20" apply false
    id("org.jetbrains.dokka") version "1.7.20"
}


allprojects {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}


// Configure all single-project Dokka tasks at the same time,
// such as dokkaHtml, dokkaJavadoc and dokkaGfm.
tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets.configureEach {
        documentedVisibilities.set(
            setOf(
                DokkaConfiguration.Visibility.PUBLIC,
                DokkaConfiguration.Visibility.PROTECTED,
            )
        )

        perPackageOption {
            matchingRegex.set(".*internal.*")
            suppress.set(true)
        }
    }
}
