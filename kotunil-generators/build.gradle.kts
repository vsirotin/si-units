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
    jvmToolchain(8)
}

application {
    mainClass.set("eu.sirotin.kotunil.generator.GeneratorKt")
}