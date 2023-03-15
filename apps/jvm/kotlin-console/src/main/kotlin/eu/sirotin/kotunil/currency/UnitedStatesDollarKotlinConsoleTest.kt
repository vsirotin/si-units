package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object UnitedStatesDollarKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(USD, UnitedStatesDollar())
        check(12.USD, UnitedStatesDollar(12.0))

        val s = USD.unitSymbols()
        check("USD", s)

        val s1 = USD.categorySymbols()
        check("`US$`", s1)

        val s2 = USD.dimensions.factors.first().specification.unitSymbol
        check("USD", s2)
        check(`US$`, UnitedStatesDollar())
        check(123.`US$`, 123.USD)

        val c = 12*m3/`US$`
        check("m3/USD", c.unitSymbols())
    }
}