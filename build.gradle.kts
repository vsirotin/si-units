
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("java-library")
    id("maven-publish")
    id("org.jetbrains.dokka") version "1.7.20"
}

group = "eu.sirotin.kotunil"
version = "1.0.1"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group as String?
            artifactId = "kotunil"
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
    dokkaSourceSets {
        configureEach {
            includes.from("module.md")
            suppressedFiles.from(file("src/main/kotlin/eu/sirotin/kotunil/generator"))
            reportUndocumented.set(true)

            moduleName.set("KotUniL")
        }

        dependsOn("cleanDokkaHtmlDocs")

    }


    outputDirectory.set(file(dokkaHtmlDocs))

    suppressInheritedMembers.set(true)

    moduleName.set(project.name)
}

tasks.javadoc.configure{
    sourceSets{
        configureEach{
            include("src")
        }
    }

    source("src")


}

//TODO to clear
//tasks.named("javadocJar"){
//
//    println("properties=" + properties.keys)
//    println("docsDir=" + properties["docsDir"])
//
//    inputs.dir("docs")
//    inputs.sourceFiles.files.plus(File("docs"))
//    println("this.name=" + name)
//    println("sourceFiles=" +this.inputs.sourceFiles.files.count())
//    inputs.sourceFiles.files.add(File("build/tmp/javadocJar/index.html"))
//    println("inputs.sourceFiles.asPath=" + inputs.sourceFiles.asPath)
//    println("sourceFiles=" +this.inputs.sourceFiles.files.count())
//    println("sourceFiles.1=" +this.inputs.sourceFiles.files.first())
//
//}


task("cleanDokkaHtmlDocs") {
   delete(file(dokkaHtmlDocs))
}

tasks.clean.configure{
    dependsOn("cleanDokkaHtmlDocs")
}

tasks.build.configure{
    dependsOn("dokkaHtml")
}
