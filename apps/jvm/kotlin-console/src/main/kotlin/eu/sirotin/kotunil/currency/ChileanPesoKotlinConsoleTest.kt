package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object ChileanPesoKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(CLP, ChileanPeso())
        check(12.CLP, ChileanPeso(12.0))

        val s = CLP.unitSymbols()
        check("CLP", s)

        val s1 = CLP.categorySymbols()
        check("`CLP$`", s1)

        val s2 = CLP.dimensions.factors.first().specification.unitSymbol
        check("CLP", s2)
        check(`CLP$`, ChileanPeso())
        check(123.`CLP$`, 123.CLP)

        val c = 12*m3/`CLP$`
        check("m3/CLP", c.unitSymbols())
    }
}