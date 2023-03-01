package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class TurkishLiraTest {

    @Test
    fun testCreation() {
        assertEquals(TRY, TurkishLira())
        assertEquals(12.TRY, TurkishLira(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = TRY.unitSymbols()
        assertEquals("TRY", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = TRY.categorySymbols()
        assertEquals("`₺`", s)
    }

    @Test
    fun getDimensions() {
        val s = TRY.dimensions.factors.first().specification.unitSymbol
        assertEquals("TRY", s)
    }
}