package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class DanishKroneTest {

    @Test
    fun testCreation() {
        assertEquals(DKK, DanishKrone())
        assertEquals(12.DKK, DanishKrone(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = DKK.unitSymbols()
        assertEquals("DKK", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = DKK.categorySymbols()
        assertEquals("dkr", s)
    }

    @Test
    fun getDimensions() {
        val s = DKK.dimensions.factors.first().specification.unitSymbol
        assertEquals("DKK", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(dkr, DanishKrone())
        assertEquals(123.dkr, 123.DKK)
    }

    @Test
    fun testCost() {
        val c = 12*m3/dkr
        assertEquals("m3/DKK", c.unitSymbols())
    }
}