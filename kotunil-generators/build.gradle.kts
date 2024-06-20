plugins {
    kotlin("jvm") //version "2.0.0" //Not clear, how replace version with variable
    application
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
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

tasks.register("generateAll") {
    doLast {
        exec {
            executable("java")
            args("-jar", "kotunil-generators/build/libs/kotunil-generators.jar")
            workingDir = rootDir
        }
    }

    dependsOn("jar")
}

tasks.build{
    dependsOn("generateAll")
}