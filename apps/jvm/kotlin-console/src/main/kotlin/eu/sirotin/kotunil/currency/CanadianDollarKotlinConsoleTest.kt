package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object CanadianDollarKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(CAD, CanadianDollar())
        check(12.CAD, CanadianDollar(12.0))

        val s = CAD.unitSymbols()
        check("CAD", s)

        val s1 = CAD.categorySymbols()
        check("`C$`", s1)

        val s2 = CAD.dimensions.factors.first().specification.unitSymbol
        check("CAD", s2)
        check(`C$`, CanadianDollar())
        check(123.`C$`, 123.CAD)

        val c = 12*m3/`C$`
        check("m3/CAD", c.unitSymbols())
    }
}