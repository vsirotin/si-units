package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class NewTaiwanDollarTest {

    @Test
    fun testCreation() {
        assertEquals(TWD, NewTaiwanDollar())
        assertEquals(12.TWD, NewTaiwanDollar(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = TWD.unitSymbols()
        assertEquals("TWD", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = TWD.categorySymbols()
        assertEquals("`NT$`", s)
    }

    @Test
    fun getDimensions() {
        val s = TWD.dimensions.factors.first().specification.unitSymbol
        assertEquals("TWD", s)
    }
}