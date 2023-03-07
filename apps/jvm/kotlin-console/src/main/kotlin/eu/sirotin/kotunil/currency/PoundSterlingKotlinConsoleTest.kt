package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object PoundSterlingKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(GBP, PoundSterling())
        check(12.GBP, PoundSterling(12.0))

        val s = GBP.unitSymbols()
        check("GBP", s)

        val s1 = GBP.categorySymbols()
        check("`£`", s1)

        val s2 = GBP.dimensions.factors.first().specification.unitSymbol
        check("GBP", s2)
        check(`£`, PoundSterling())
        check(123.`£`, 123.GBP)

        val c = 12*m3/`£`
        check("m3/GBP", c.unitSymbols())
    }
}