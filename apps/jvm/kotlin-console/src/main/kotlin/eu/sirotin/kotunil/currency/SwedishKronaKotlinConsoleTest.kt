package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object SwedishKronaKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(SEK, SwedishKrona())
        check(12.SEK, SwedishKrona(12.0))

        val s = SEK.unitSymbols()
        check("SEK", s)

        val s1 = SEK.categorySymbols()
        check("skr", s1)

        val s2 = SEK.dimensions.factors.first().specification.unitSymbol
        check("SEK", s2)
        check(skr, SwedishKrona())
        check(123.skr, 123.SEK)

        val c = 12*m3/skr
        check("m3/SEK", c.unitSymbols())
    }
}