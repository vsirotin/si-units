package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object JapaneseYenKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(JPY, JapaneseYen())
        check(12.JPY, JapaneseYen(12.0))

        val s = JPY.unitSymbols()
        check("JPY", s)

        val s1 = JPY.categorySymbols()
        check("`¥`", s1)

        val s2 = JPY.dimensions.factors.first().specification.unitSymbol
        check("JPY", s2)
        check(`¥`, JapaneseYen())
        check(123.`¥`, 123.JPY)

        val c = 12*m3/`¥`
        check("m3/JPY", c.unitSymbols())
    }
}