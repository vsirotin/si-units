plugins {
   id("java")
}

group = "eu.sirotin.kotunil.app.java"
version = project.extra["kotunil-jvm-stable-version"]!!

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":kotunil"))
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22))
    }
}

tasks.register<JavaExec>("run") {
    group = "application"
    description = "Runs the jar file"

    classpath = files("build/libs/java-console-${project.extra["kotunil-jvm-stable-version"]}.jar")

    dependsOn("build")
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