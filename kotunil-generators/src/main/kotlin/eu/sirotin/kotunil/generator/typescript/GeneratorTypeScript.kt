package eu.sirotin.kotunil.generator.typescript

const val ROOT_TS = "apps/node_ts_app/src/"
const val ROOT_TS_TESTS = "${ROOT_TS}scripts/tests/"

fun generateTypeScriptFiles() {
    generateSiUnitsTestBaseTsFiles()
    generateSiUnitsTestDerivedTsFiles()
    generateCurrenciesTestTsFile()
}






