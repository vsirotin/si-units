package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class UAEDirhamTest {

    @Test
    fun testCreation() {
        assertEquals(AED, UAEDirham())
        assertEquals(12.AED, UAEDirham(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = AED.unitSymbols()
        assertEquals("AED", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = AED.categorySymbols()
        assertEquals("Dh", s)
    }

    @Test
    fun getDimensions() {
        val s = AED.dimensions.factors.first().specification.unitSymbol
        assertEquals("AED", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(Dh, UAEDirham())
        assertEquals(123.Dh, 123.AED)
    }

    @Test
    fun testCost() {
        val c = 12*m3/Dh
        assertEquals("m3/AED", c.unitSymbols())
    }
}