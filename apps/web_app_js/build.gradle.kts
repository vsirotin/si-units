group = "eu.sirotin.kotunil.app.js"
version = project.extra["kotunil-version"]!!


dependencies {
    project(":kotunil-generators")
    project(":kotunil")
    project(":js-lib")
}

//val fromDir = "${project.parent?.parent?.projectDir}/kotunil/build/dist/js/productionLibrary"
val fromDir = "${project.parent?.parent?.projectDir}/js-lib/dist"
val libDir = "${layout.projectDirectory}/lib"
tasks.register<Copy>("copyLibs") {
    from(file(fromDir))
    into(file(libDir))

    inputs.file("${fromDir}/package.json") //To make this task depend on this file
    logger.quiet("Copying completed from $fromDir into $libDir")
}

tasks.register<Delete>("clean") {
    delete(file(libDir))
}

tasks.register<DefaultTask>("build") {
    dependsOn(":js-lib:build")
    dependsOn("copyLibs")
}

tasks.named("copyLibs") {
    dependsOn(":js-lib:copyLibs")
}
