package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.m3   
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class NorwegianKroneTest {

    @Test
    fun testCreation() {
        assertEquals(NOK, NorwegianKrone())
        assertEquals(12.NOK, NorwegianKrone(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = NOK.unitSymbols()
        assertEquals("NOK", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = NOK.categorySymbols()
        assertEquals("nkr", s)
    }

    @Test
    fun getDimensions() {
        val s = NOK.dimensions.factors.first().specification.unitSymbol
        assertEquals("NOK", s)
    }

    @Test
    fun testCreationJvm() {
        assertEquals(nkr, NorwegianKrone())
        assertEquals(123.nkr, 123.NOK)
    }

    @Test
    fun testCost() {
        val c = 12*m3/nkr
        assertEquals("m3/NOK", c.unitSymbols())
    }
}