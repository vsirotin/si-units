plugins {
    kotlin("jvm")
    application
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    // Generation phase: Use latest Java version (22) for code generation tools
    jvmToolchain(22)
}

application {
    mainClass.set("eu.sirotin.kotunil.generator.GeneratorKt")
}

tasks.jar {
    manifest.attributes["Main-Class"] = "eu.sirotin.kotunil.generator.GeneratorKt"

    val dependencies = configurations
        .runtimeClasspath
        .get()
        .map(::zipTree) // OR .map { zipTree(it) }
    from(dependencies)
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.run.configure{
    workingDir = rootDir
}
