package eu.sirotin.kotunil.generator.javascript

const val ROOT_JS = "apps/web_app_js/src/"
const val ROOT_JS_LIB = "${ROOT_JS}main/resources/libs/"
const val ROOT_JS_TESTS = "${ROOT_JS}main/javascript/tests/"

fun generateJavaScriptFiles() {
    generateSiUnitsBaseJsFiles()
    generateSiUnitsDerivedJsFiles()

    generateSiUnitsTestBaseJsFiles()
    generateCurrenciesJsFile()
    generateCurrenciesTestJsFile()

}






