package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object HongKongDollarKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(HKD, HongKongDollar())
        check(12.HKD, HongKongDollar(12.0))

        val s = HKD.unitSymbols()
        check("HKD", s)

        val s1 = HKD.categorySymbols()
        check("`HK$`", s1)

        val s2 = HKD.dimensions.factors.first().specification.unitSymbol
        check("HKD", s2)
        check(`HK$`, HongKongDollar())
        check(123.`HK$`, 123.HKD)

        val c = 12*m3/`HK$`
        check("m3/HKD", c.unitSymbols())
    }
}