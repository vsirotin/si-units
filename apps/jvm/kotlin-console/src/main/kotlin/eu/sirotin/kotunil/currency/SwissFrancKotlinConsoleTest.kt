package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object SwissFrancKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(CHF, SwissFranc())
        check(12.CHF, SwissFranc(12.0))

        val s = CHF.unitSymbols()
        check("CHF", s)

        val s1 = CHF.categorySymbols()
        check("SCHF", s1)

        val s2 = CHF.dimensions.factors.first().specification.unitSymbol
        check("CHF", s2)
        check(SCHF, SwissFranc())
        check(123.SCHF, 123.CHF)

        val c = 12*m3/SCHF
        check("m3/CHF", c.unitSymbols())
    }
}