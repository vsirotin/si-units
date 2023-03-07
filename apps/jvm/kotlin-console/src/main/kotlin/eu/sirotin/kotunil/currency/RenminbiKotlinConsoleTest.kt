package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object RenminbiKotlinConsoleTest {


    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(CNY, Renminbi())
        check(12.CNY, Renminbi(12.0))

        val s = CNY.unitSymbols()
        check("CNY", s)

        val s1 = CNY.categorySymbols()
        check("`人民币`", s1)

        val s2 = CNY.dimensions.factors.first().specification.unitSymbol
        check("CNY", s2)
        check(`人民币`, Renminbi())
        check(123.`人民币`, 123.CNY)

        val c = 12*m3/`人民币`
        check("m3/CNY", c.unitSymbols())
    }
}