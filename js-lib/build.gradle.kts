version = "4.1.1"

dependencies {
    project(":kotunil")
    project(":kotunil-generators")
}

val fromDir = "../kotunil/build/dist/js/productionLibrary"
val distDir = "${layout.projectDirectory}/dist"
tasks.register<Copy>("copyLibs") {
    from(file(fromDir)
    )
    into(distDir)

    inputs.file("${fromDir}/package.json") //To make this task depend on this file
    logger.quiet("Copying completed")
}

tasks.register("installToGlobalMPM") {
    doLast {
        exec {
            executable("npm")
            args("publish")
            workingDir(distDir)
        }

        logger.quiet("Installation completed")
    }
}

