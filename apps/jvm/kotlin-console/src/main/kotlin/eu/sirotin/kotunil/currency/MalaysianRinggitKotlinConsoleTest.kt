package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object MalaysianRinggitKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(MYR, MalaysianRinggit())
        check(12.MYR, MalaysianRinggit(12.0))

        val s = MYR.unitSymbols()
        check("MYR", s)

        val s1 = MYR.categorySymbols()
        check("RM", s1)

        val s2 = MYR.dimensions.factors.first().specification.unitSymbol
        check("MYR", s2)
        check(RM, MalaysianRinggit())
        check(123.RM, 123.MYR)

        val c = 12*m3/RM
        check("m3/MYR", c.unitSymbols())
    }
}