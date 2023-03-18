package eu.sirotin.kotunil.currency
   

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times

object IndonesianRupiahKotlinConsoleTest {


    fun kotlinConsoleTest() {
        check(IDR, IndonesianRupiah())
        check(12.IDR, IndonesianRupiah(12.0))

        val s = IDR.unitSymbols()
        check("IDR", s)

        val s1 = IDR.categorySymbols()
        check("Rp", s1)

        val s2 = IDR.dimensions.factors.first().specification.unitSymbol
        check("IDR", s2)
        check(Rp, IndonesianRupiah())
        check(123.Rp, 123.IDR)

        val c = 12*m3/Rp
        check("m3/IDR", c.unitSymbols())
    }
}