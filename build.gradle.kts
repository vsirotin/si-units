
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("java-library")
    id("maven-publish")
    id("signing")
    id("org.jetbrains.dokka") version "1.7.20"
}

group = "eu.sirotin.kotunil"
version = "2.0.1"

val projectName = "kotunil"
val docsDir = "build/docs"

subprojects {
    apply<JavaPlugin>()

    configure<JavaPluginExtension> {
        withSourcesJar()
        withJavadocJar()
    }
}

repositories {
    mavenCentral()
}

java {
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    testImplementation(kotlin("test"))
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.7.20")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = project.group as String?
            artifactId = "all"
            version = project.version as String?

            from(components["java"])
            pom {
                packaging = "jar"
                name.set("KotUniL (Kotlin Units Library)")
                url.set("https://github.com/vsirotin/si-units")
                description.set("KotUniL (Kotlin Units Library) is a library for processing all units of SI base and derived units (see https://en.wikipedia.org/wiki/International_System_of_Units), currencies, etc.")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
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
                        email.set("vxod@sirotin.eu")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            val releasesUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            val snapshotsUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsUrl else releasesUrl
            credentials {
                username = project.properties["ossrhUsername"].toString()
                password = project.properties["ossrhPassword"].toString()
                println("username = " + username)
                println("password = " + password)
            }
        }
    }
}

signing {
    sign(publishing.publications["mavenJava"])
}



tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to projectName,
            "Implementation-Version" to project.version))
    }

    exclude("eu/sirotin/generator/**")
    from("README.md")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.dokkaJavadoc.configure {
    dokkaSourceSets {
        configureEach {
            suppressedFiles.from(file("src/main/kotlin/eu/sirotin/kotunil/generator"))
            reportUndocumented.set(true)

            moduleName.set("KotUniL - Kotlin Units Library")
            dependsOn(tasks.javadoc)
        }
    }
    outputDirectory.set(file(docsDir))
    suppressInheritedMembers.set(true)

}

//Temporary implementation up to clearing problem with cooperation dokkaHtml and javadocJar
tasks.register<Jar>("javadocJarPostprocessing") {
    group = "build"
    manifest {
        attributes(mapOf("Implementation-Title" to projectName,
            "Implementation-Version" to project.version))
    }
    dependsOn(tasks.dokkaJavadoc)

    archiveClassifier.set("javadoc")

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    from(docsDir)
}

tasks.named("javadocJar").configure {
    actions.clear()
    dependsOn("javadocJarPostprocessing")
}






