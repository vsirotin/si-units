plugins {
    kotlin("jvm")
    application
}

group = "eu.sirotin.kotunil.app.kotlin"
version = project.extra["kotunil-jvm-stable-version"]!!

repositories {
    mavenCentral()
}

dependencies {
   implementation("eu.sirotin.kotunil:kotunil-jvm:$version")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    // Testing phase: Use latest Java version (22) for testing compatibility
    jvmToolchain(22)
}

application {
    mainClass.set("eu.sirotin.kotunil.app.kotlin.MainKt")
}

tasks.jar {
    manifest.attributes["Main-Class"] = "eu.sirotin.kotunil.app.kotlin.MainKt"

    val dependencies = configurations
        .runtimeClasspath
        .get()
        .map(::zipTree) // OR .map { zipTree(it) }
    from(dependencies)
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}