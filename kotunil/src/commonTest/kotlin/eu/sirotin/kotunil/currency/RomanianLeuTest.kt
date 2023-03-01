package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class RomanianLeuTest {

    @Test
    fun testCreation() {
        assertEquals(RON, RomanianLeu())
        assertEquals(12.RON, RomanianLeu(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = RON.unitSymbols()
        assertEquals("RON", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = RON.categorySymbols()
        assertEquals("RL", s)
    }

    @Test
    fun getDimensions() {
        val s = RON.dimensions.factors.first().specification.unitSymbol
        assertEquals("RON", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(RL, RomanianLeu())
        assertEquals(123.RL, 123.RON)
    }

    @Test
    fun testCost() {
        val c = 12*m3/RL
        assertEquals("m3/RON", c.unitSymbols())
    }
}