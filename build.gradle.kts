import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.gradle.DokkaTaskPartial
import org.jetbrains.dokka.DokkaConfiguration.Visibility

group = "eu.sirotin.kotunil"


plugins {
    kotlin("multiplatform") version "1.8.10" apply false
    id("com.vanniktech.maven.publish") version "0.24.0"
    id("org.jetbrains.dokka")
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
                Visibility.PUBLIC,
                Visibility.PROTECTED,
            )
        )

        perPackageOption {
            matchingRegex.set(".*internal.*")
            suppress.set(true)
        }
    }
}
