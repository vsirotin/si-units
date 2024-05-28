plugins {
    id("java")
}

group = "eu.sirotin.kotunil.app.java"
version = project.extra["kotunil-version"]!!

repositories {
    mavenCentral()
//    mavenLocal()
}

dependencies {
    implementation("eu.sirotin.kotunil:kotunil:$version")
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