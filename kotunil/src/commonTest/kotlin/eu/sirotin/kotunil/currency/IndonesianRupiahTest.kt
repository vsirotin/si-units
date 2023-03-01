package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class IndonesianRupiahTest {

    @Test
    fun testCreation() {
        assertEquals(IDR, IndonesianRupiah())
        assertEquals(12.IDR, IndonesianRupiah(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = IDR.unitSymbols()
        assertEquals("IDR", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = IDR.categorySymbols()
        assertEquals("Rp", s)
    }

    @Test
    fun getDimensions() {
        val s = IDR.dimensions.factors.first().specification.unitSymbol
        assertEquals("IDR", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(Rp, IndonesianRupiah())
        assertEquals(123.Rp, 123.IDR)
    }

    @Test
    fun testCost() {
        val c = 12*m3/Rp
        assertEquals("m3/IDR", c.unitSymbols())
    }
}