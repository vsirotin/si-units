package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object NorwegianKroneKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(NOK, NorwegianKrone())
        check(12.NOK, NorwegianKrone(12.0))

        val s = NOK.unitSymbols()
        check("NOK", s)

        val s1 = NOK.categorySymbols()
        check("nkr", s1)

        val s2 = NOK.dimensions.factors.first().specification.unitSymbol
        check("NOK", s2)
        check(nkr, NorwegianKrone())
        check(123.nkr, 123.NOK)

        val c = 12*m3/nkr
        check("m3/NOK", c.unitSymbols())
    }
}