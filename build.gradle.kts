plugins {
    kotlin("multiplatform") version "1.8.0"
    id("maven-publish")
    id("signing")
    id("org.jetbrains.dokka") version "1.7.20"
}

group = "eu.sirotin.kotunil"
version = "3.0.0"

val projectName = "kotunil"
val docsDir = "build/docs"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all { kotlinOptions.jvmTarget = "11" }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    sourceSets {
        val commonMain by getting

        val jvmMain by getting

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
            dependencies {
            }
        }
    }
}
