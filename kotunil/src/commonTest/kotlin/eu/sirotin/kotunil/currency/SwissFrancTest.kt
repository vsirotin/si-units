package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SwissFrancTest {

    @Test
    fun testCreation() {
        assertEquals(CHF, SwissFranc())
        assertEquals(12.CHF, SwissFranc(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = CHF.unitSymbols()
        assertEquals("CHF", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = CHF.categorySymbols()
        assertEquals("SCHF", s)
    }

    @Test
    fun getDimensions() {
        val s = CHF.dimensions.factors.first().specification.unitSymbol
        assertEquals("CHF", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(SCHF, SwissFranc())
        assertEquals(123.SCHF, 123.CHF)
    }

    @Test
    fun testCost() {
        val c = 12*m3/SCHF
        assertEquals("m3/CHF", c.unitSymbols())
    }
}