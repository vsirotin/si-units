package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object PolishZłotyKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(PLN, PolishZłoty())
        check(12.PLN, PolishZłoty(12.0))

        val s = PLN.unitSymbols()
        check("PLN", s)

        val s1 = PLN.categorySymbols()
        check("`zł`", s1)

        val s2 = PLN.dimensions.factors.first().specification.unitSymbol
        check("PLN", s2)
        check(`zł`, PolishZłoty())
        check(123.`zł`, 123.PLN)

        val c = 12*m3/`zł`
        check("m3/PLN", c.unitSymbols())
    }
}