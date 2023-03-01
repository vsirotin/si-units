package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class IndianRupeeTest {

    @Test
    fun testCreation() {
        assertEquals(INR, IndianRupee())
        assertEquals(12.INR, IndianRupee(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = INR.unitSymbols()
        assertEquals("INR", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = INR.categorySymbols()
        assertEquals("`₹`", s)
    }

    @Test
    fun getDimensions() {
        val s = INR.dimensions.factors.first().specification.unitSymbol
        assertEquals("INR", s)
    }
}