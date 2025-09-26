group = "eu.sirotin.kotunil.app.ts-node"
version = project.extra["kotunil-version"]!!


plugins {
    id("com.github.node-gradle.node") version "7.0.1"
}

tasks.register<com.github.gradle.node.task.NodeTask>("startConsole"){
    script.set(file("dist/startConsole.js"))
    dependsOn("build")
}


tasks.register<com.github.gradle.node.npm.task.NpmTask>("installAllProduction"){
    args.addAll("install", "express", "mongoose", "cors", "mongodb", "dotenv", "nodemon")
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("installAllDevelopment"){
    args.addAll("install", "-D", "typescript", "ts-node-dev", "@types/express", "@types/cors")
    dependsOn("installAllProduction")
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("install"){
    args.addAll("install")
    dependsOn("installAllDevelopment")
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("build"){
    args.addAll("run", "build")
    dependsOn("install")
}

fun File.deleteDirContent(){
   this.walkBottomUp()
       .filter { it != this }
       .forEach { it.deleteRecursively() }
}

val distDir = "${layout.projectDirectory}/dist"
val nodeDir = "${layout.projectDirectory}/node_modules"
tasks.register<Delete>("clean") {
    delete(file(distDir))
    delete(file(nodeDir))
}


// Replace a value for key in configuration file
fun replaceValueForKey(filePath: String, key: String, newValue: String) {
    val file = File(filePath)
    if (!file.exists()) {
        println("File $filePath does not exist")
        return
    }
    val lines = file.readLines()

    val updatedLines = lines.map { line ->
        if (line.contains(key)) {
            val posDP = line.indexOf(":")
            val prefix = line.substring(0, posDP + 1)
            "$prefix ${newValue},"
        } else {
            line
        }
    }
    file.writeText(updatedLines.joinToString(System.lineSeparator()))
}

tasks.register("switchToNPMCentral") {
    doLast {
        val kotunilJvmStableVersion = project.rootProject.extra["kotunil-js-version"] as String
        replaceValueForKey("apps/node_ts_app/package.json", "kotunil-js-lib", "\"${kotunilJvmStableVersion}\"")
    }
}

tasks.register("switchNodeTestToLocalJsLibrary") {
    doLast {
        replaceValueForKey("apps/node_ts_app/package.json", "kotunil-js-lib", "\"file:../../js-lib/dist\"")
    }
}





