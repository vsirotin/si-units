package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class HungarianForintTest {

    @Test
    fun testCreation() {
        assertEquals(HUF, HungarianForint())
        assertEquals(12.HUF, HungarianForint(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = HUF.unitSymbols()
        assertEquals("HUF", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = HUF.categorySymbols()
        assertEquals("Ft", s)
    }

    @Test
    fun getDimensions() {
        val s = HUF.dimensions.factors.first().specification.unitSymbol
        assertEquals("HUF", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(Ft, HungarianForint())
        assertEquals(123.Ft, 123.HUF)
    }

    @Test
    fun testCost() {
        val c = 12*m3/Ft
        assertEquals("m3/HUF", c.unitSymbols())
    }
}