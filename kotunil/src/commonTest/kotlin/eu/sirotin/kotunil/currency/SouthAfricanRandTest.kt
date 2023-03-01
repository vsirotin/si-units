package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SouthAfricanRandTest {

    @Test
    fun testCreation() {
        assertEquals(ZAR, SouthAfricanRand())
        assertEquals(12.ZAR, SouthAfricanRand(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = ZAR.unitSymbols()
        assertEquals("ZAR", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = ZAR.categorySymbols()
        assertEquals("R", s)
    }

    @Test
    fun getDimensions() {
        val s = ZAR.dimensions.factors.first().specification.unitSymbol
        assertEquals("ZAR", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(R, SouthAfricanRand())
        assertEquals(123.R, 123.ZAR)
    }

    @Test
    fun testCost() {
        val c = 12*m3/R
        assertEquals("m3/ZAR", c.unitSymbols())
    }
}