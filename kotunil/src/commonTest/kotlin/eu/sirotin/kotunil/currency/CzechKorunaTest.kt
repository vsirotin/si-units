package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class CzechKorunaTest {

    @Test
    fun testCreation() {
        assertEquals(CZK, CzechKoruna())
        assertEquals(12.CZK, CzechKoruna(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = CZK.unitSymbols()
        assertEquals("CZK", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = CZK.categorySymbols()
        assertEquals("`Kč`", s)
    }

    @Test
    fun getDimensions() {
        val s = CZK.dimensions.factors.first().specification.unitSymbol
        assertEquals("CZK", s)
    }
}