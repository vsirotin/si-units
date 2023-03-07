package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object RomanianLeuKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(RON, RomanianLeu())
        check(12.RON, RomanianLeu(12.0))

        val s = RON.unitSymbols()
        check("RON", s)

        val s1 = RON.categorySymbols()
        check("RL", s1)

        val s2 = RON.dimensions.factors.first().specification.unitSymbol
        check("RON", s2)
        check(RL, RomanianLeu())
        check(123.RL, 123.RON)

        val c = 12*m3/RL
        check("m3/RON", c.unitSymbols())
    }
}