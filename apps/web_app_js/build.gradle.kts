group = "eu.sirotin.kotunil.app.js"
version = project.extra["kotunil-version"]!!

plugins {
    id("com.github.node-gradle.node") version "7.0.1"
}

dependencies {
    project(":kotunil-generators")
    project(":kotunil")
    project(":js-lib")
}

val fromDir = "${project.parent?.parent?.projectDir}/js-lib/dist"
val fromLibDir = "${project.parent?.parent?.projectDir}/js-lib/dist/kotlin"
val libDir = "${layout.projectDirectory}/lib"
tasks.register<Copy>("copyLib") {
    from(file(fromLibDir))
    into(file(libDir))

    inputs.file("${fromDir}/package.json") //To make this task depend on this file
    logger.quiet("Copying completed from $fromDir into $libDir")
}

tasks.register<Delete>("clean") {
    delete(file(libDir))
    delete(file("${layout.projectDirectory}/node_modules"))
}

tasks.register<DefaultTask>("build") {
    dependsOn(":js-lib:build")
    dependsOn("copyLib")
}

tasks.named("copyLib") {
    dependsOn(":js-lib:copyLibs")
}

// Replace a value for key in package.json
fun replaceValueInPackageJson(key: String, newValue: String) {
    val packageJsonFile = File("${layout.projectDirectory}/package.json")
    if (!packageJsonFile.exists()) {
        println("package.json not found at ${packageJsonFile.absolutePath}")
        return
    }

    val content = packageJsonFile.readText()
    val regex = "\"$key\"\\s*:\\s*\"[^\"]*\"".toRegex()
    val updatedContent = content.replace(regex, "\"$key\": \"$newValue\"")

    packageJsonFile.writeText(updatedContent)
    println("Updated $key to $newValue in package.json")
}

tasks.register<DefaultTask>("updatePackageJson") {
    description = "Updates kotunil-js-lib dependency version in package.json"
    doLast {
        val kotunilJsVersion = project.extra["kotunil-js-version"].toString()
        replaceValueInPackageJson("kotunil-js-lib", kotunilJsVersion)
    }
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("installKotunilJs") {
    description = "Install kotunil-js-lib from NPM"
    args.addAll("install")
    dependsOn("updatePackageJson")
}

tasks.register<Delete>("cleanLib") {
    description = "Clean lib directory"
    delete(file(libDir))
}

tasks.register<Copy>("copyKotunilLibs") {
    description = "Copy kotunil-js libraries from node_modules to lib"
    from("${layout.projectDirectory}/node_modules/kotunil-js-lib/kotlin")
    into(file(libDir))
    include("kotlin-kotlin-stdlib.js", "kotunil-js-lib.js")
    dependsOn("installKotunilJs")
}

tasks.register<DefaultTask>("updateToPublishedVersion") {
    description = "Update to published kotunil-js version: update package.json, install from NPM, and copy libs"
    dependsOn("cleanLib", "copyKotunilLibs")
}
