package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object IsraeliNewShekelKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(ILS, IsraeliNewShekel())
        check(12.ILS, IsraeliNewShekel(12.0))

        val s = ILS.unitSymbols()
        check("ILS", s)

        val s1 = ILS.categorySymbols()
        check("`₪`", s1)

        val s2 = ILS.dimensions.factors.first().specification.unitSymbol
        check("ILS", s2)
        check(`₪`, IsraeliNewShekel())
        check(123.`₪`, 123.ILS)

        val c = 12*m3/`₪`
        check("m3/ILS", c.unitSymbols())
    }
}