package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class UnitedStatesDollarTest {

    @Test
    fun testCreation() {
        assertEquals(USD, UnitedStatesDollar())
        assertEquals(12.USD, UnitedStatesDollar(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = USD.unitSymbols()
        assertEquals("USD", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = USD.categorySymbols()
        assertEquals("`US$`", s)
    }

    @Test
    fun getDimensions() {
        val s = USD.dimensions.factors.first().specification.unitSymbol
        assertEquals("USD", s)
    }
}