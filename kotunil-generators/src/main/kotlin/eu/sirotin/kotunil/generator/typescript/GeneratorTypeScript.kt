package eu.sirotin.kotunil.generator.typescript

import eu.sirotin.kotunil.generator.commonscripts.checkerPath
import eu.sirotin.kotunil.generator.commonscripts.euImport
import eu.sirotin.kotunil.generator.commonscripts.fileExtension
import eu.sirotin.kotunil.generator.commonscripts.fileExtensionByImport
import eu.sirotin.kotunil.generator.commonscripts.generateBaseTestScriptFiles
import eu.sirotin.kotunil.generator.commonscripts.generateCurrenciesTestScriptFile
import eu.sirotin.kotunil.generator.commonscripts.generateDerivedTestScriptFiles
import java.io.File

private const val ROOT_TS = "apps/node_ts_app/src/"
private const val ROOT_TS_TESTS = "${ROOT_TS}scripts/tests/"
private const val FILE_EXTENSION = "ts"

private const val CHECKED_PATH = "'../../checker'"
private const val EU_IMPORT = "import {eu} from 'kotunil-js-lib';"

fun generateTypeScriptFiles() {
    checkerPath = CHECKED_PATH
    euImport = EU_IMPORT
    fileExtensionByImport = ""

    fileExtension = "ts"
    generateSiUnitsTestBaseTsFiles(FILE_EXTENSION)
    generateSiUnitsTestDerivedTsFiles(FILE_EXTENSION)
    generateCurrenciesTestTsFile(FILE_EXTENSION)
}

private fun generateSiUnitsTestBaseTsFiles(fileExtension: String) {
    //Generate package directory if not exists
    val dir = File("${ROOT_TS_TESTS}base")
    generateBaseTestScriptFiles(dir, fileExtension)
}
private fun generateSiUnitsTestDerivedTsFiles(fileExtension: String) {
    //Generate package directory if not exists
    val dir = File("${ROOT_TS_TESTS}derived")
    generateDerivedTestScriptFiles(dir, fileExtension)
}

private fun generateCurrenciesTestTsFile(fileExtension: String) {

    val dirPath = "${ROOT_TS_TESTS}currency"
    generateCurrenciesTestScriptFile(fileExtension, dirPath)
}






