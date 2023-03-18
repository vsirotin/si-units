package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object CzechKorunaKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(CZK, CzechKoruna())
        check(12.CZK, CzechKoruna(12.0))

        val s = CZK.unitSymbols()
        check("CZK", s)

        val s1 = CZK.categorySymbols()
        check("`Kč`", s1)

        val s2 = CZK.dimensions.factors.first().specification.unitSymbol
        check("CZK", s2)
        check(`Kč`, CzechKoruna())
        check(123.`Kč`, 123.CZK)

        val c = 12*m3/`Kč`
        check("m3/CZK", c.unitSymbols())
    }
}