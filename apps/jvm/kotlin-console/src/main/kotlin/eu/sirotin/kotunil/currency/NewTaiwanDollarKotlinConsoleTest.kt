package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object NewTaiwanDollarKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(TWD, NewTaiwanDollar())
        check(12.TWD, NewTaiwanDollar(12.0))

        val s = TWD.unitSymbols()
        check("TWD", s)

        val s1 = TWD.categorySymbols()
        check("`NT$`", s1)

        val s2 = TWD.dimensions.factors.first().specification.unitSymbol
        check("TWD", s2)
        check(`NT$`, NewTaiwanDollar())
        check(123.`NT$`, 123.TWD)

        val c = 12*m3/`NT$`
        check("m3/TWD", c.unitSymbols())
    }
}