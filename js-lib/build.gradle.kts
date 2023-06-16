version = "4.1.1"

dependencies {
    project(":kotunil")
    project(":kotunil-generators")
}

val fromDir = "../build/js/packages/si-units-kotunil/kotlin"
tasks.register<Copy>("copyOwnJsLib") {
    from(layout.projectDirectory.file("${fromDir}/si-units-kotunil.js"),
        layout.projectDirectory.file("${fromDir}/si-units-kotunil.js.map"))
    into(layout.projectDirectory)
}

tasks.register<Copy>("copyStdJsLib") {
    from(layout.projectDirectory.file("${fromDir}/kotlin-kotlin-stdlib-js-ir.js"),
        layout.projectDirectory.file("${fromDir}/kotlin-kotlin-stdlib-js-ir.js.map"))
    into(layout.projectDirectory)
}

