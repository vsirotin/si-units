package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object RussianRubleKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(RUB, RussianRuble())
        check(12.RUB, RussianRuble(12.0))

        val s = RUB.unitSymbols()
        check("RUB", s)

        val s1 = RUB.categorySymbols()
        check("`₽`", s1)

        val s2 = RUB.dimensions.factors.first().specification.unitSymbol
        check("RUB", s2)
        check(`₽`, RussianRuble())
        check(123.`₽`, 123.RUB)

        val c = 12*m3/`₽`
        check("m3/RUB", c.unitSymbols())
    }
}