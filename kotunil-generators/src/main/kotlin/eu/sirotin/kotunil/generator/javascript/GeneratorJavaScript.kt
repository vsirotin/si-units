package eu.sirotin.kotunil.generator.javascript

const val ROOT_JS = "apps/web_app_js/src/main/resources/libs/"

fun generateJavaScriptFiles() {
    generateSiUnitsBaseJsFiles()
    generateSiUnitsDerivedJsFiles()
    generateCurrenciesJsFiles()
}






