package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object EuroKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(EUR, Euro())
        check(12.EUR, Euro(12.0))

        val s = EUR.unitSymbols()
        check("EUR", s)

        val s1 = EUR.categorySymbols()
        check("`€`", s1)

        val s2 = EUR.dimensions.factors.first().specification.unitSymbol
        check("EUR", s2)
        check(`€`, Euro())
        check(123.`€`, 123.EUR)

        val c = 12*m3/`€`
        check("m3/EUR", c.unitSymbols())
    }
}