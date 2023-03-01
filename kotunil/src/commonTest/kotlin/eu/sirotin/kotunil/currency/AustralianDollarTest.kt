package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class AustralianDollarTest {

    @Test
    fun testCreation() {
        assertEquals(AUD, AustralianDollar())
        assertEquals(12.AUD, AustralianDollar(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = AUD.unitSymbols()
        assertEquals("AUD", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = AUD.categorySymbols()
        assertEquals("`A$`", s)
    }

    @Test
    fun getDimensions() {
        val s = AUD.dimensions.factors.first().specification.unitSymbol
        assertEquals("AUD", s)
    }
}