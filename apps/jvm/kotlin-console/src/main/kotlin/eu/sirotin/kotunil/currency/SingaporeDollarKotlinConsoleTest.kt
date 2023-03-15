package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object SingaporeDollarKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(SGD, SingaporeDollar())
        check(12.SGD, SingaporeDollar(12.0))

        val s = SGD.unitSymbols()
        check("SGD", s)

        val s1 = SGD.categorySymbols()
        check("`S$`", s1)

        val s2 = SGD.dimensions.factors.first().specification.unitSymbol
        check("SGD", s2)
        check(`S$`, SingaporeDollar())
        check(123.`S$`, 123.SGD)

        val c = 12*m3/`S$`
        check("m3/SGD", c.unitSymbols())
    }
}