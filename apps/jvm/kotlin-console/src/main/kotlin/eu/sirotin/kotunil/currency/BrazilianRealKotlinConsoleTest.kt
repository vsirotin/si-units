package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object BrazilianRealKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(BRL, BrazilianReal())
        check(12.BRL, BrazilianReal(12.0))

        val s = BRL.unitSymbols()
        check("BRL", s)

        val s1 = BRL.categorySymbols()
        check("`R$`", s1)

        val s2 = BRL.dimensions.factors.first().specification.unitSymbol
        check("BRL", s2)
        check(`R$`, BrazilianReal())
        check(123.`R$`, 123.BRL)

        val c = 12*m3/`R$`
        check("m3/BRL", c.unitSymbols())
    }
}