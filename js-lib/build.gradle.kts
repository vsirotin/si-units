version = "4.1.1"

dependencies {
    project(":kotunil")
    project(":kotunil-generators")
}

val fromDir = "../kotunil/js-dist"
tasks.register<Copy>("copyLibs") {
    from(file("${fromDir}/si-units-kotunil.js"),
        file("${fromDir}/si-units-kotunil.d.ts"),
        file("${fromDir}/si-units-kotunil.js.map"),
        file("${fromDir}/kotlin-kotlin-stdlib-js-ir.js"),
        file("${fromDir}/kotlin-kotlin-stdlib-js-ir.js.map")
    )
    into("${layout.projectDirectory}/dist1")
}

tasks.register("installToGlobalMPM") {
    doLast {
        exec {
            executable("npm")
            args("publish")
            workingDir("./dist")
        }

        logger.quiet("Please see installed KotUniL lib in directory 'apps/web_app_js/node_modules/kotunil-js-lib'")
    }
}



