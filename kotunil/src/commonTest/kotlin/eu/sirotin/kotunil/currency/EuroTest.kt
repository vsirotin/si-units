package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class EuroTest {

    @Test
    fun testCreation() {
        assertEquals(EUR, Euro())
        assertEquals(12.EUR, Euro(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = EUR.unitSymbols()
        assertEquals("EUR", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = EUR.categorySymbols()
        assertEquals("`€`", s)
    }

    @Test
    fun getDimensions() {
        val s = EUR.dimensions.factors.first().specification.unitSymbol
        assertEquals("EUR", s)
    }
}