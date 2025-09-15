version = project.extra["kotunil-version"]!!

dependencies {
    project(":kotunil")
    project(":kotunil-generators")
}

val fromDir = "../kotunil/build/dist/js/productionLibrary"
val distDir = "${layout.projectDirectory}/dist"
tasks.register<Copy>("copyLibs") {
    from(file(fromDir), file("${layout.projectDirectory}/README.md"))
    into(distDir)

    inputs.file("${fromDir}/package.json") //To make this task depend on this file
    logger.quiet("Copying completed")
}

tasks.register<Exec>("publishToGlobalMPM") {
    executable("npm")
    args("publish")
    workingDir(distDir)

    doLast {
        logger.quiet("Installation completed")
    }
}

tasks.register<Delete>("clean") {
    delete(file(distDir))
}

tasks.register<DefaultTask>("build") {
    dependsOn(":kotunil:build")
    dependsOn("copyLibs")
}
