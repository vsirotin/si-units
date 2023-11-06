
import java.io.FileInputStream
import java.util.*


version = "4.1.1"

plugins {
    kotlin("multiplatform") version "1.9.10"
    id("maven-publish")
    id("signing")
    id("org.jetbrains.dokka") version "1.8.10"
}

//kotlin.mpp.applyDefaultHierarchyTemplate=false

dependencies {
    project(":kotunil-generators")
}

val docsDir = "build/docs"

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }
    mingwX64()
    linuxX64()
    macosX64()
    macosArm64()
    iosArm64()
    iosSimulatorArm64()
    iosX64()
    js(IR) {
        binaries.executable()
        binaries.library()
        val timeoutMs = "1000000"
        browser {
            testTask {
                useMocha {
                    timeout = timeoutMs
                }
            }
            generateTypeScriptDefinitions()
        }
        nodejs {
            testTask {
                useMocha {
                    timeout = timeoutMs
                }
            }
        }
    }

    targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget> {
        binaries.all {
            freeCompilerArgs = freeCompilerArgs + "-Xallocator=std"
        }
    }

    sourceSets {
        all {
            languageSettings.apply {
                optIn("kotlin.js.ExperimentalJsExport")
            }
        }

        val commonMain by getting

//        val jvmMain by getting
//
//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test"))
//            }
//        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val nativeMain by creating {
            dependsOn(commonMain)
        }
        names.forEach { n ->
            if (n.contains("X64Main") || n.contains("Arm64Main")) {
                this@sourceSets.getByName(n).apply {
                    dependsOn(nativeMain)
                }
            }
        }
    }
}



val propertiesFile = File(rootProject.rootDir, "local.properties")
val gradleLocalProperties: Properties? = if(propertiesFile.exists()){
        Properties().apply {load(FileInputStream(propertiesFile)) }
    }else null //TODO set values for case of GitHub actions

extensions.configure<PublishingExtension> {
    repositories {
        maven {
            val isSnapshot = version.toString().endsWith("SNAPSHOT")
            url = uri(
                if (!isSnapshot) "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2"
                else "https://s01.oss.sonatype.org/content/repositories/snapshots"
            )

            credentials {
                username = gradleLocalProperties?.getProperty("sonatypeUsername")
                password = gradleLocalProperties?.getProperty("sonatypePassword")


            }
        }
    }

    val javadocJar = tasks.register<Jar>("javadocJar") {
        dependsOn(tasks.dokkaHtml)
        archiveClassifier.set("javadoc")
        from("$buildDir/dokka")
    }

    publications {
        withType<MavenPublication> {
            artifact(javadocJar)

            pom {
                name.set("KotUniL")
                description.set("\"KotUniL (Kotlin Units Library) is a library for processing all units of SI base and derived units (see https://en.wikipedia.org/wiki/International_System_of_Units), currencies, etc.")
                licenses {
                    license {
                        name.set("Apache-2.0")
                        url.set("https://opensource.org/licenses/Apache-2.0")
                    }
                }
                url.set("https://github.com/vsirotin/")
                issueManagement {
                    system.set("Github")
                    url.set("https://github.com/vsirotin/si-units/issues")
                }
                scm {
                    connection.set("scm:https://github.com/vsirotin/si-units.git")
                    developerConnection.set("scm:git@github.com:vsirotin/si-units.git")
                    url.set("https://github.com/vsirotin/si-units")
                }
                developers {
                    developer {
                        id.set("vsirotin")
                        name.set("Dr. Viktor Sirotin")
                    }
                }
            }
        }
    }
}

val fromDir = "../build/js/packages/si-units-kotunil/kotlin"
tasks.register<Copy>("copyOwnJsLib") {
    from(layout.projectDirectory.file("${fromDir}/si-units-kotunil.js"),
        layout.projectDirectory.file("${fromDir}/si-units-kotunil.js.map"))
    into(layout.projectDirectory.file("js_dist"))
}

tasks.register<Copy>("copyStdJsLib") {
    from(layout.projectDirectory.file("${fromDir}/kotlin-kotlin-stdlib-js-ir.js"),
        layout.projectDirectory.file("${fromDir}/kotlin-kotlin-stdlib-js-ir.js.map"))
    into(layout.projectDirectory.file("js_dist"))
}

tasks.build {
    finalizedBy("copyOwnJsLib", "copyStdJsLib")
}


val publishing = extensions.getByType<PublishingExtension>()
extensions.configure<SigningExtension> {
//        useInMemoryPgpKeys(
//            //TODO
//            //gradleLocalProperties.getProperty("gpgKeySecret"),
//            //gradleLocalProperties.getProperty("gpgKeyPassword"),
//
//        )

    sign(publishing.publications)
}