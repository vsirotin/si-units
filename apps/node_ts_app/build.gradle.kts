group = "eu.sirotin.kotunil.app.ts-node"
version = project.extra["kotunil-version"]!!


plugins {
    id("com.github.node-gradle.node") version "7.0.1"
}

tasks.register<com.github.gradle.node.task.NodeTask>("startConsole"){
    script.set(file("dist/startConsole.js"))
//    dependsOn("build")
}

tasks.register<com.github.gradle.node.task.NodeTask>("startWeb"){
    script.set(file("dist/index.js"))
    args.addAll("run", "dev")
    dependsOn("build")
    logger.quiet("to complete watching enter Ctrl + C")
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("installAllProduction"){
    args.addAll("install", "express", "mongoose", "cors", "mongodb", "dotenv", "nodemon")
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("installAllDevelopment"){
    args.addAll("install", "-D", "typescript", "ts-node-dev", "@types/express", "@types/cors")
    dependsOn("installAllProduction")
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("installTypeScript"){
    args.addAll("install", "typescript", "--save-dev")
}

tasks.register("compileTypeScript") {
    doLast {
        exec {
            executable("tsc")
        }
        logger.quiet("Please see result of compilation in 'dist' directory")
    }
}

tasks.register<com.github.gradle.node.npm.task.NpmTask>("build"){
    args.addAll("run", "build")
    dependsOn("installAllDevelopment")
}

fun File.deleteDirContent(){
   this.walkBottomUp()
       .filter { it != this }
       .forEach { it.deleteRecursively() }
}

val distDir = "${layout.projectDirectory}/dist"
val nodeDir = "${layout.projectDirectory}/node_modules"
val testsDir = "${layout.projectDirectory}/src/scripts/tests/"
tasks.register<Delete>("clean") {
    delete(file(distDir))
    delete(file(nodeDir))

    file("${testsDir}/base").deleteDirContent()
    file("${testsDir}/currency").deleteDirContent()
    file("${testsDir}/derived").deleteDirContent()
}







