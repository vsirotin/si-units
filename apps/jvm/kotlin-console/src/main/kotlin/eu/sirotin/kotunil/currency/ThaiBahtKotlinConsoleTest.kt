package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object ThaiBahtKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(THB, ThaiBaht())
        check(12.THB, ThaiBaht(12.0))

        val s = THB.unitSymbols()
        check("THB", s)

        val s1 = THB.categorySymbols()
        check("`฿`", s1)

        val s2 = THB.dimensions.factors.first().specification.unitSymbol
        check("THB", s2)
        check(`฿`, ThaiBaht())
        check(123.`฿`, 123.THB)

        val c = 12*m3/`฿`
        check("m3/THB", c.unitSymbols())
    }
}