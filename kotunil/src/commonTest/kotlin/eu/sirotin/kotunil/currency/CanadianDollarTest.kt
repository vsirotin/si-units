package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class CanadianDollarTest {

    @Test
    fun testCreation() {
        assertEquals(CAD, CanadianDollar())
        assertEquals(12.CAD, CanadianDollar(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = CAD.unitSymbols()
        assertEquals("CAD", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = CAD.categorySymbols()
        assertEquals("`C$`", s)
    }

    @Test
    fun getDimensions() {
        val s = CAD.dimensions.factors.first().specification.unitSymbol
        assertEquals("CAD", s)
    }
}