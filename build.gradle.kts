import java.io.File
import java.io.FileInputStream
import java.util.*

plugins {
    kotlin("multiplatform") version "1.8.10" apply false
    id("org.jetbrains.dokka") version "1.8.10"
}

val propertiesFile = File(rootProject.rootDir, "local.properties")
val gradleLocalProperties: Properties? = if(propertiesFile.exists()){
        Properties().apply {load(FileInputStream(propertiesFile)) }
    }else null //TODO set values for case of GitHub actions

allprojects {
    repositories {
        google()
        mavenCentral()
    }

    apply(plugin = "org.jetbrains.dokka")
    apply(plugin = "maven-publish")
    apply(plugin = "signing")

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


