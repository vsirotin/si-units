version = project.extra["kotunil-version"]!!

plugins {
    kotlin("multiplatform") version "2.0.21"
    id("maven-publish")
    id("signing")
    id("org.jetbrains.dokka") version "2.0.0"
}

dependencies {
    project(":kotunil-generators")
}

val docsDir = "build/docs"

kotlin {
    jvm {
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }
    js(IR) {
        this.moduleName = "kotunil-js-lib"
        this.mavenPublication { version = project.extra["kotunil-js-version"]!! as String }
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

    sourceSets {
        all {
            languageSettings.apply {
                optIn("kotlin.js.ExperimentalJsExport")
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            isStatic = true
        }
    }
}

extensions.configure<PublishingExtension> {

 repositories {
        maven {

            credentials {
                //Reading secret parameters from .gradle\gradle.properties file
                //Can be used only locally
                username = (findProperty("ossrhToken") ?: "" ) as String
                password = (findProperty("ossrhTokenPassword") ?: "") as String
            }
        }
    }

    val javadocJar = tasks.register<Jar>("javadocJar") {
        dependsOn(tasks.dokkaHtml)
        archiveClassifier.set("javadoc")
        from(layout.buildDirectory.dir("dokka"))
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
    //Signing secret parameters will be set in .gradle\gradle.properties file
    sign(publishing.publications)
}
