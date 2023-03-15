package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object ColombianPesoKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(COP, ColombianPeso())
        check(12.COP, ColombianPeso(12.0))

        val s = COP.unitSymbols()
        check("COP", s)

        val s1 = COP.categorySymbols()
        check("`COL$`", s1)

        val s2 = COP.dimensions.factors.first().specification.unitSymbol
        check("COP", s2)
        check(`COL$`, ColombianPeso())
        check(123.`COL$`, 123.COP)

        val c = 12*m3/`COL$`
        check("m3/COP", c.unitSymbols())
    }
}