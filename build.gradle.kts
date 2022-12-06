
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("java-library")
    id("maven-publish")
    id("org.jetbrains.dokka") version "1.7.20"
}

group = "eu.sirotin.kotunil"
version = "1.0.1-SNAPSHOT"

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
        }
    }
    outputDirectory.set(file(docsDir))
    suppressInheritedMembers.set(true)

}

//Temporary implementation up to clearing problem with cooperation dokkaHtml and javadocJar
tasks.register<Jar>("javadocJarWorkaround") {
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




