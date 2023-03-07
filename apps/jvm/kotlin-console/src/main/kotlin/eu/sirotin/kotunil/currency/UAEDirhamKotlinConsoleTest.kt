package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object UAEDirhamKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(AED, UAEDirham())
        check(12.AED, UAEDirham(12.0))

        val s = AED.unitSymbols()
        check("AED", s)

        val s1 = AED.categorySymbols()
        check("Dh", s1)

        val s2 = AED.dimensions.factors.first().specification.unitSymbol
        check("AED", s2)
        check(Dh, UAEDirham())
        check(123.Dh, 123.AED)

        val c = 12*m3/Dh
        check("m3/AED", c.unitSymbols())
    }
}