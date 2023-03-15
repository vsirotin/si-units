package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object SouthAfricanRandKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(ZAR, SouthAfricanRand())
        check(12.ZAR, SouthAfricanRand(12.0))

        val s = ZAR.unitSymbols()
        check("ZAR", s)

        val s1 = ZAR.categorySymbols()
        check("R", s1)

        val s2 = ZAR.dimensions.factors.first().specification.unitSymbol
        check("ZAR", s2)
        check(R, SouthAfricanRand())
        check(123.R, 123.ZAR)

        val c = 12*m3/R
        check("m3/ZAR", c.unitSymbols())
    }
}