import org.gradle.internal.impldep.org.junit.experimental.categories.Categories.CategoryFilter.exclude
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("java-library")
    id("maven-publish")
    id("org.jetbrains.dokka") version "1.7.20"
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
            artifactId = "si-unit"
            version = project.version as String?

            from(components["java"])
        }
    }
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

val dokkaHtmlDocs = "htmlDocs"
tasks.dokkaHtml.configure {
    dokkaSourceSets{
        configureEach{
            includes.from("module.md")
        }

        dependsOn("cleanDokkaHtmlDocs")
    }

    outputDirectory.set(file(dokkaHtmlDocs))

    suppressInheritedMembers.set(true)

    moduleName.set("${project.name}")
}

task("cleanDokkaHtmlDocs") {
    delete(file(dokkaHtmlDocs))
}

tasks.clean.configure{
    dependsOn("cleanDokkaHtmlDocs")
}

tasks.build.configure{
    dependsOn("dokkaHtml")
}