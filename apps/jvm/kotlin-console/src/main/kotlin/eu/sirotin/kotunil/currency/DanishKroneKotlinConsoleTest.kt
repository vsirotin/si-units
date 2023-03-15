package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object DanishKroneKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(DKK, DanishKrone())
        check(12.DKK, DanishKrone(12.0))

        val s = DKK.unitSymbols()
        check("DKK", s)

        val s1 = DKK.categorySymbols()
        check("dkr", s1)

        val s2 = DKK.dimensions.factors.first().specification.unitSymbol
        check("DKK", s2)
        check(dkr, DanishKrone())
        check(123.dkr, 123.DKK)

        val c = 12*m3/dkr
        check("m3/DKK", c.unitSymbols())
    }
}