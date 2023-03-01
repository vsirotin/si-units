package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SwedishKronaTest {

    @Test
    fun testCreation() {
        assertEquals(SEK, SwedishKrona())
        assertEquals(12.SEK, SwedishKrona(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = SEK.unitSymbols()
        assertEquals("SEK", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = SEK.categorySymbols()
        assertEquals("skr", s)
    }

    @Test
    fun getDimensions() {
        val s = SEK.dimensions.factors.first().specification.unitSymbol
        assertEquals("SEK", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(skr, SwedishKrona())
        assertEquals(123.skr, 123.SEK)
    }

    @Test
    fun testCost() {
        val c = 12*m3/skr
        assertEquals("m3/SEK", c.unitSymbols())
    }
}