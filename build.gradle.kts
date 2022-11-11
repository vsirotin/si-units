import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.api.tasks.bundling.Jar

plugins {
    kotlin("jvm") version "1.7.10"
    id("java-library")
    id("maven-publish")
}

group = "eu.sirotin"
version = "1.0.1"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group as String?
            artifactId = "su-unit"
            version = project.version as String?

            from(components["java"])
        }
    }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
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