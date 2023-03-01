package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MalaysianRinggitTest {

    @Test
    fun testCreation() {
        assertEquals(MYR, MalaysianRinggit())
        assertEquals(12.MYR, MalaysianRinggit(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = MYR.unitSymbols()
        assertEquals("MYR", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = MYR.categorySymbols()
        assertEquals("RM", s)
    }

    @Test
    fun getDimensions() {
        val s = MYR.dimensions.factors.first().specification.unitSymbol
        assertEquals("MYR", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(RM, MalaysianRinggit())
        assertEquals(123.RM, 123.MYR)
    }

    @Test
    fun testCost() {
        val c = 12*m3/RM
        assertEquals("m3/MYR", c.unitSymbols())
    }
}