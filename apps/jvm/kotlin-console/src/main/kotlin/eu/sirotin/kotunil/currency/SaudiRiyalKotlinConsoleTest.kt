package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object SaudiRiyalKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(SAR, SaudiRiyal())
        check(12.SAR, SaudiRiyal(12.0))

        val s = SAR.unitSymbols()
        check("SAR", s)

        val s1 = SAR.categorySymbols()
        check("`﷼ `", s1)

        val s2 = SAR.dimensions.factors.first().specification.unitSymbol
        check("SAR", s2)
        check(`﷼ `, SaudiRiyal())
        check(123.`﷼ `, 123.SAR)

        val c = 12*m3/`﷼ `
        check("m3/SAR", c.unitSymbols())
    }
}