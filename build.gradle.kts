val kotunilVersion = "4.2.2"
val kotunilJvmStableVersion = kotunilVersion

val kotunilJsVersion = "5.0.1"


allprojects {
    group = "eu.sirotin.kotunil"

    repositories {
        mavenCentral()
    }
    extra.apply {
        set("kotunil-version", kotunilVersion)
        set("kotunil-jvm-stable-version", kotunilJvmStableVersion)
        set("kotunil-js-version", kotunilJsVersion)
    }
}



plugins {
    //Below: 1) Not clear, how replace version with variable
    //2) This is needed to configure subprojects
    kotlin("multiplatform") version "2.0.21" apply false
}

fun replaceSubstringInFile(filePath: String, oldSubstring: String, newSubstring: String) {
    val file = File(filePath)
    if (!file.exists()) {
        println("File $filePath does not exist")
        return
    }

    val text = file.readText()
    val updatedText = text.replace(oldSubstring, newSubstring)

    file.writeText(updatedText)
}

tasks.register("switchJvmTestAppsToMavenCentral") {
    doLast {
        replaceSubstringInFile("apps/jvm/java-console/build.gradle.kts", "mavenLocal()",
            "mavenCentral()")
        replaceSubstringInFile("apps/jvm/kotlin-console/build.gradle.kts", "mavenLocal()",
            "mavenCentral()")
    }
}

tasks.register("switchJvmTestAppsToMavenLocal") {
    doLast {
        replaceSubstringInFile("apps/jvm/java-console/build.gradle.kts", "mavenCentral()",
            "mavenLocal()")
        replaceSubstringInFile("apps/jvm/kotlin-console/build.gradle.kts","mavenCentral()",
            "mavenLocal()")
    }
}
