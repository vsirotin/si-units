package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class NewZealandDollarTest {

    @Test
    fun testCreation() {
        assertEquals(NZD, NewZealandDollar())
        assertEquals(12.NZD, NewZealandDollar(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = NZD.unitSymbols()
        assertEquals("NZD", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = NZD.categorySymbols()
        assertEquals("`NZ$`", s)
    }

    @Test
    fun getDimensions() {
        val s = NZD.dimensions.factors.first().specification.unitSymbol
        assertEquals("NZD", s)
    }
}