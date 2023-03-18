package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object NewZealandDollarKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(NZD, NewZealandDollar())
        check(12.NZD, NewZealandDollar(12.0))

        val s = NZD.unitSymbols()
        check("NZD", s)

        val s1 = NZD.categorySymbols()
        check("`NZ$`", s1)

        val s2 = NZD.dimensions.factors.first().specification.unitSymbol
        check("NZD", s2)
        check(`NZ$`, NewZealandDollar())
        check(123.`NZ$`, 123.NZD)

        val c = 12*m3/`NZ$`
        check("m3/NZD", c.unitSymbols())
    }
}