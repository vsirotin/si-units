version = "4.1.1"

dependencies {
    project(":kotunil")
    project(":kotunil-generators")
}

val fromDir = "../kotunil/build/dist/js/productionLibrary"
val distDir = "${layout.projectDirectory}/dist"
tasks.register<Copy>("copyLibs") {
    from(file("fromDir")
    )
    into(distDir)
    finalizedBy("jsonUpdate")

    dependsOn(":kotunil:jsTest")
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

//For implementation details see:
// https://stackoverflow.com/questions/65360274/custom-gradle-task-that-accesses-top-level-fails-with-the-constructor-shoul
open class PackageJsonModifierTask : DefaultTask() {
    @Input
    var packageJsonPath : String = ""

    @Input
    var addFilePath : String = ""

    @TaskAction
    fun updatePackageJson() {

        val packageJsonFile = File(packageJsonPath)
        val linesOriginal = packageJsonFile.readLines()
        if (linesOriginal.isEmpty()) throw java.lang.IllegalArgumentException("File $packageJsonPath is empty")
        val linesBeforeLast = linesOriginal.subList(0, linesOriginal.size - 2).toMutableList()
        val lineBeforeLast = linesOriginal[linesOriginal.size - 2] + ","
        linesBeforeLast.add(lineBeforeLast)

        val linesAdd = File(addFilePath).readLines()
        if (linesAdd.isEmpty())throw java.lang.IllegalArgumentException("File $addFilePath is empty")

        linesBeforeLast.addAll(linesAdd)
        linesBeforeLast.add(linesOriginal.last())
        packageJsonFile.writeText(linesBeforeLast.joinToString("\n"))
        logger.quiet("File $packageJsonPath updated.")
    }
}

tasks.register<PackageJsonModifierTask>("jsonUpdate"){

    packageJsonPath = "${distDir}/package.json"
    addFilePath = "${layout.projectDirectory}/resources/package.json.add.txt"
}
