package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object HungarianForintKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(HUF, HungarianForint())
        check(12.HUF, HungarianForint(12.0))

        val s = HUF.unitSymbols()
        check("HUF", s)

        val s1 = HUF.categorySymbols()
        check("Ft", s1)

        val s2 = HUF.dimensions.factors.first().specification.unitSymbol
        check("HUF", s2)
        check(Ft, HungarianForint())
        check(123.Ft, 123.HUF)

        val c = 12*m3/Ft
        check("m3/HUF", c.unitSymbols())
    }
}