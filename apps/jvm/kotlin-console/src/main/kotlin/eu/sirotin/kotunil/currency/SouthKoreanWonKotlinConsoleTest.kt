package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object SouthKoreanWonKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(KRW, SouthKoreanWon())
        check(12.KRW, SouthKoreanWon(12.0))

        val s = KRW.unitSymbols()
        check("KRW", s)

        val s1 = KRW.categorySymbols()
        check("`₩`", s1)

        val s2 = KRW.dimensions.factors.first().specification.unitSymbol
        check("KRW", s2)
        check(`₩`, SouthKoreanWon())
        check(123.`₩`, 123.KRW)

        val c = 12*m3/`₩`
        check("m3/KRW", c.unitSymbols())
    }
}