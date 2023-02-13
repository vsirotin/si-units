plugins {
    kotlin("multiplatform")
    id("com.vanniktech.maven.publish")
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget> {
        binaries.all {
            freeCompilerArgs = freeCompilerArgs + "-Xallocator=std"
        }
    }
    sourceSets {
        val commonMain by getting

        val jvmMain by getting

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
