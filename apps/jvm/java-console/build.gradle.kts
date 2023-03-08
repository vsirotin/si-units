plugins {
    id("java")
}

group = "eu.sirotin.kotunil.app.java"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
//    mavenCentral()
}

dependencies {
    implementation("eu.sirotin.kotunil:kotunil-jvm:4.0.0-SNAPSHOT")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest.attributes["Main-Class"] = "eu.sirotin.kotunil.app.java.Main"

    val dependencies = configurations
        .runtimeClasspath
        .get()
        .map(::zipTree) // OR .map { zipTree(it) }
    from(dependencies)
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}