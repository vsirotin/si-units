package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object TurkishLiraKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(TRY, TurkishLira())
        check(12.TRY, TurkishLira(12.0))

        val s = TRY.unitSymbols()
        check("TRY", s)

        val s1 = TRY.categorySymbols()
        check("`₺`", s1)

        val s2 = TRY.dimensions.factors.first().specification.unitSymbol
        check("TRY", s2)
        check(`₺`, TurkishLira())
        check(123.`₺`, 123.TRY)

        val c = 12*m3/`₺`
        check("m3/TRY", c.unitSymbols())
    }
}