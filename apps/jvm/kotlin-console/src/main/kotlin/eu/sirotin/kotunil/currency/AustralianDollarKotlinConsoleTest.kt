package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object AustralianDollarKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(AUD, AustralianDollar())
        check(12.AUD, AustralianDollar(12.0))

        val s = AUD.unitSymbols()
        check("AUD", s)

        val s1 = AUD.categorySymbols()
        check("`A$`", s1)

        val s2 = AUD.dimensions.factors.first().specification.unitSymbol
        check("AUD", s2)
        check(`A$`, AustralianDollar())
        check(123.`A$`, 123.AUD)

        val c = 12*m3/`A$`
        check("m3/AUD", c.unitSymbols())
    }
}