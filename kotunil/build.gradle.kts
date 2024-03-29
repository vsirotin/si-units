
import java.io.FileInputStream
import java.util.*


version = project.extra["kotunil-version"]!!

plugins {
    kotlin("multiplatform") version "1.9.10"
    id("maven-publish")
    id("signing")
    id("org.jetbrains.dokka") version "1.8.10"
}

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
        moduleName = "kotunil-js-lib"
        version = project.extra["kotunil-js-lib-version"]!!
        binaries.executable()
        binaries.library()

        compilations["main"].packageJson {
            customField("description", "KotUniL JavaScript/TypeScript library covers all units of International System of Units (SI)  like meter, second etc. (see Wikipedia: https://en.wikipedia.org/wiki/International_System_of_Units) as well as SI- Prefixes (micro, nano etc.) and some other common units like currencies, percentages etc.")
            customField("repository", mapOf("type" to "git",
                "url" to "https://github.com/vsirotin/si-units/blob/26e2e890fa01cebdca93f48332bab0a0fa6c6255/js-lib"))
            customField("keywords", arrayOf("si-units",
                "kotunil"))
            customField("author", "Dr. Viktor Sirotin. www.sirotin.eu")
            customField("license", "Apache-2.0")

        }

        browser {
            generateTypeScriptDefinitions()

        }
        nodejs {
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