package eu.sirotin.kotunil.app.kotlin.base

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.test
import eu.sirotin.kotunil.base.A
import eu.sirotin.kotunil.base.Ampere


fun ampereKotlinConsoleTest() {
    TestStatistics.numberTestedObjects++

    testAmpereMainTest()
}

fun testAmpereMainTest() {
    test(Ampere(1.0), A)
    test(1.A , A)
}