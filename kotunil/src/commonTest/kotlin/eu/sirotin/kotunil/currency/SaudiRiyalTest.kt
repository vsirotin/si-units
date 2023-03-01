package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SaudiRiyalTest {

    @Test
    fun testCreation() {
        assertEquals(SAR, SaudiRiyal())
        assertEquals(12.SAR, SaudiRiyal(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = SAR.unitSymbols()
        assertEquals("SAR", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = SAR.categorySymbols()
        assertEquals("`﷼ `", s)
    }

    @Test
    fun getDimensions() {
        val s = SAR.dimensions.factors.first().specification.unitSymbol
        assertEquals("SAR", s)
    }
}