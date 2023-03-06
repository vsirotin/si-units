package eu.sirotin.kotunil.generator

import java.io.File
import java.nio.file.Files


fun<T> generateFiles(
    dirPath: String,
    unitDescriptions: List<T>,
    generatorFileContent: (T) -> String,
    generatorFileName: (T)->String
) {
    //Generate package directory if not exists
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())

    //Generate File
    unitDescriptions.forEach { generateFile(it, dir, generatorFileContent, generatorFileName) }
}

fun<T> generateFile(description: T,
                         dir: File,
                         generatorFileContent: (T) -> String,
                         generatorFileName: (T)->String) {
    val classText = generatorFileContent.invoke(description)
    if(classText.isEmpty())return

    val fileName = generatorFileName.invoke(description)
    val file = dir.resolve(fileName)
    file.delete()

    file.writeText(classText)
}
