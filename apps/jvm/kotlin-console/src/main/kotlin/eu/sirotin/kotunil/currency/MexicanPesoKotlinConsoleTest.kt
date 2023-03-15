package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object MexicanPesoKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(MXN, MexicanPeso())
        check(12.MXN, MexicanPeso(12.0))

        val s = MXN.unitSymbols()
        check("MXN", s)

        val s1 = MXN.categorySymbols()
        check("`$`", s1)

        val s2 = MXN.dimensions.factors.first().specification.unitSymbol
        check("MXN", s2)
        check(`$`, MexicanPeso())
        check(123.`$`, 123.MXN)

        val c = 12*m3/`$`
        check("m3/MXN", c.unitSymbols())
    }
}