package eu.sirotin.kotunil.generator.javascript

import eu.sirotin.kotunil.generator.commonscripts.checkerPath
import eu.sirotin.kotunil.generator.commonscripts.euImport
import eu.sirotin.kotunil.generator.commonscripts.fileExtension
import eu.sirotin.kotunil.generator.commonscripts.fileExtensionByImport
import eu.sirotin.kotunil.generator.commonscripts.generateBaseTestScriptFiles
import eu.sirotin.kotunil.generator.commonscripts.generateCurrenciesTestScriptFile
import eu.sirotin.kotunil.generator.commonscripts.generateDerivedTestScriptFiles
import java.io.File

private const val ROOT_APP = "apps/web_app_js/"
private const val ROOT_SCRIPT = "${ROOT_APP}src/"
private const val ROOT_JS_TESTS = "${ROOT_SCRIPT}scripts/tests/"
private const val FILE_EXTENSION = "js"

private const val CHECKED_PATH = "'/src/scripts/tests/checker.js'"
private const val EU_IMPORT = ""


fun generateJavaScriptFiles() {
    checkerPath = CHECKED_PATH
    euImport = EU_IMPORT
    fileExtension = "js"
    fileExtensionByImport = ".$fileExtension"
    generateSiUnitsTestBaseJsFiles(FILE_EXTENSION)
    generateSiUnitsTestDerivedJsFiles(FILE_EXTENSION)
    generateCurrenciesTestJsFile(FILE_EXTENSION)
}

private fun generateSiUnitsTestBaseJsFiles(fileExtension: String) {
    //Generate package directory if not exists
    val dir = File("${ROOT_JS_TESTS}base")
    generateBaseTestScriptFiles(dir, fileExtension)
}
private fun generateSiUnitsTestDerivedJsFiles(fileExtension: String) {
    //Generate package directory if not exists
    val dir = File("${ROOT_JS_TESTS}derived")
    generateDerivedTestScriptFiles(dir, fileExtension)
}

private fun generateCurrenciesTestJsFile(fileExtension: String) {

    val dirPath = "${ROOT_JS_TESTS}currency"
    generateCurrenciesTestScriptFile(fileExtension, dirPath)
}
