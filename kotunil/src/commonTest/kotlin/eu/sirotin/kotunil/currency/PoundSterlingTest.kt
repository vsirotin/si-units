package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class PoundSterlingTest {

    @Test
    fun testCreation() {
        assertEquals(GBP, PoundSterling())
        assertEquals(12.GBP, PoundSterling(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = GBP.unitSymbols()
        assertEquals("GBP", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = GBP.categorySymbols()
        assertEquals("`£`", s)
    }

    @Test
    fun getDimensions() {
        val s = GBP.dimensions.factors.first().specification.unitSymbol
        assertEquals("GBP", s)
    }
}