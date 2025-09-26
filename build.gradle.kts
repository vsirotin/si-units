val kotunilVersion = "4.2.3"
val kotunilJvmStableVersion = kotunilVersion

val kotunilJsVersion = "5.0.3"


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
    id("org.jetbrains.dokka") version "1.9.20"
}

// Configure Dokka for multimodule documentation
tasks.dokkaHtmlMultiModule.configure {
    moduleName.set("KotUniL - Kotlin Units Library")
    outputDirectory.set(file("build/dokka/htmlMultiModule"))

    pluginsMapConfiguration.set(
        mapOf(
            "org.jetbrains.dokka.base.DokkaBase" to """
                {
                    "homepageLink": "https://github.com/vsirotin/si-units",
                    "customStyleSheets": [],
                    "customAssets": [],
                    "footerMessage": "© 2025 Dr. Viktor Sirotin"
                }
            """.trimIndent()
        )
    )
}

// Task to build versioned documentation
tasks.register("buildVersionedDocs") {
    group = "documentation"
    description = "Build versioned Dokka documentation"

    dependsOn("dokkaHtmlMultiModule")

    doLast {
        val version = kotunilVersion
        val docsOutputDir = file("docs")
        val versionedDir = file("$docsOutputDir/$version")
        val sourceDir = file("build/dokka/htmlMultiModule")

        // Create docs directory if it doesn't exist
        docsOutputDir.mkdirs()

        // Copy built documentation to versioned directory
        if (sourceDir.exists()) {
            sourceDir.copyRecursively(versionedDir, overwrite = true)
            println("Documentation built for version $version in $versionedDir")
        } else {
            throw GradleException("Dokka output not found at $sourceDir")
        }
    }
}

// Task to create index page
tasks.register("createDocsIndex") {
    group = "documentation"
    description = "Create main index page for documentation"

    doLast {
        val docsDir = file("docs")
        docsDir.mkdirs()

        val indexFile = file("$docsDir/index.html")
        val versions = docsDir.listFiles()
            ?.filter { it.isDirectory && it.name.matches(Regex("\\d+\\.\\d+\\.\\d+")) }
            ?.map { it.name }
            ?.sortedWith { version1, version2 ->
                val parts1 = version1.split(".").map { it.toInt() }
                val parts2 = version2.split(".").map { it.toInt() }

                // Compare major.minor.patch versions in descending order
                for (i in 0 until maxOf(parts1.size, parts2.size)) {
                    val part1 = parts1.getOrElse(i) { 0 }
                    val part2 = parts2.getOrElse(i) { 0 }
                    when {
                        part1 > part2 -> return@sortedWith -1  // version1 is newer
                        part1 < part2 -> return@sortedWith 1   // version2 is newer
                    }
                }
                0  // versions are equal
            }
            ?: emptyList()

        val indexContent = """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>KotUniL - Kotlin Units Library Documentation</title>
    <style>
        body { font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Arial, sans-serif; margin: 40px; line-height: 1.6; }
        .header { border-bottom: 2px solid #e0e0e0; padding-bottom: 20px; margin-bottom: 30px; }
        .version-list { list-style: none; padding: 0; }
        .version-item { margin: 10px 0; padding: 15px; background: #f8f9fa; border-radius: 8px; }
        .version-link { text-decoration: none; color: #0366d6; font-weight: 500; font-size: 1.1em; }
        .version-link:hover { text-decoration: underline; }
        .latest-badge { background: #28a745; color: white; padding: 2px 8px; border-radius: 12px; font-size: 0.8em; margin-left: 10px; }
        .description { color: #586069; margin-top: 20px; }
    </style>
</head>
<body>
    <div class="header">
        <h1>KotUniL - Kotlin Units Library</h1>
        <p>A comprehensive Kotlin Multiplatform library for handling all units of the International System of Units (SI) and more.</p>
    </div>
    
    <div class="description">
        <h2>About KotUniL</h2>
        <p>KotUniL (Kotlin Units Library) provides type-safe unit handling for:</p>
        <ul>
            <li>All SI base and derived units (meter, second, kilogram, etc.)</li>
            <li>SI prefixes (micro, nano, kilo, mega, etc.)</li>
            <li>Common units like currencies, percentages</li>
            <li>Full support for Kotlin Multiplatform (JVM, JS, Native)</li>
        </ul>
        
        <h2>Documentation Versions</h2>
        ${if (versions.isEmpty()) {
            "<p>No documentation versions available yet. Run <code>./gradlew buildVersionedDocs createDocsIndex</code> to generate documentation.</p>"
        } else {
            "<ul class=\"version-list\">" + versions.mapIndexed { index, version ->
                "<li class=\"version-item\"><a href=\"$version/\" class=\"version-link\">Version $version</a>${if (index == 0) "<span class=\"latest-badge\">Latest</span>" else ""}</li>"
            }.joinToString("\n") + "</ul>"
        }}
        
        <h2>Quick Links</h2>
        <ul>
            <li><a href="https://github.com/vsirotin/si-units">GitHub Repository</a></li>
            <li><a href="https://github.com/vsirotin/si-units/releases">Release Notes</a></li>
            <li><a href="https://search.maven.org/search?q=g:eu.sirotin.kotunil">Maven Central</a></li>
        </ul>
    </div>
</body>
</html>
        """.trimIndent()

        indexFile.writeText(indexContent)
        println("Created documentation index at $indexFile")
    }
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

// Task to remove specific version documentation
tasks.register<Delete>("removeVersionDocs") {
    group = "documentation"
    description = "Remove documentation for a specific version. Usage: ./gradlew removeVersionDocs -Pversion=X.Y.Z"

    doLast {
        val versionToRemove = project.findProperty("version") as String?
            ?: throw GradleException("Version not specified. Use -Pversion=X.Y.Z")

        val versionDir = file("docs/$versionToRemove")
        if (versionDir.exists()) {
            versionDir.deleteRecursively()
            println("Removed documentation for version $versionToRemove")

            // Regenerate index after removal
            tasks.getByName("createDocsIndex").actions.forEach { it.execute(this) }
        } else {
            println("Documentation for version $versionToRemove not found")
        }
    }
}

// Task to build and deploy all documentation
tasks.register("buildAndDeployDocs") {
    group = "documentation"
    description = "Build versioned documentation and create index page"

    dependsOn("buildVersionedDocs", "createDocsIndex")

    // Ensure createDocsIndex runs after buildVersionedDocs
    tasks.getByName("createDocsIndex").mustRunAfter("buildVersionedDocs")
}

// Task to deploy to GitHub Pages (local script approach)
tasks.register("deployToGitHubPages") {
    group = "documentation"
    description = "Deploy documentation to GitHub Pages"

    dependsOn("buildAndDeployDocs")

    doLast {
        val docsDir = file("docs")
        if (!docsDir.exists()) {
            throw GradleException("Documentation not found. Run buildAndDeployDocs first.")
        }

        exec {
            workingDir = projectDir
            commandLine("git", "add", "docs/")
        }

        exec {
            workingDir = projectDir
            commandLine("git", "commit", "-m", "docs: Update documentation for version $kotunilVersion")
        }

        exec {
            workingDir = projectDir
            commandLine("git", "push", "origin", "main")
        }

        println("Documentation deployed to GitHub Pages")
        println("Visit: https://vsirotin.github.io/si-units/")
    }
}
