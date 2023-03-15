package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object IndianRupeeKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(INR, IndianRupee())
        check(12.INR, IndianRupee(12.0))

        val s = INR.unitSymbols()
        check("INR", s)

        val s1 = INR.categorySymbols()
        check("`₹`", s1)

        val s2 = INR.dimensions.factors.first().specification.unitSymbol
        check("INR", s2)
        check(`₹`, IndianRupee())
        check(123.`₹`, 123.INR)

        val c = 12*m3/`₹`
        check("m3/INR", c.unitSymbols())
    }
}