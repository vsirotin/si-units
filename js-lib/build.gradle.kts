version = "4.1.1"

dependencies {
    project(":kotunil")
    project(":kotunil-generators")
}

val fromDir = "../kotunil/js-dist"
tasks.register<Copy>("copyLibs") {
    from(layout.projectDirectory.file("${fromDir}/si-units-kotunil.js"),
        layout.projectDirectory.file("${fromDir}/si-units-kotunil.js.map"),
        layout.projectDirectory.file("${fromDir}/kotlin-kotlin-stdlib-js-ir.js"),
        layout.projectDirectory.file("${fromDir}/kotlin-kotlin-stdlib-js-ir.js.map")
    )
    into(layout.projectDirectory)
}

