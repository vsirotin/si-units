package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object PhilippinePesoKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(PHP, PhilippinePeso())
        check(12.PHP, PhilippinePeso(12.0))

        val s = PHP.unitSymbols()
        check("PHP", s)

        val s1 = PHP.categorySymbols()
        check("`₱`", s1)

        val s2 = PHP.dimensions.factors.first().specification.unitSymbol
        check("PHP", s2)
        check(`₱`, PhilippinePeso())
        check(123.`₱`, 123.PHP)

        val c = 12*m3/`₱`
        check("m3/PHP", c.unitSymbols())
    }
}