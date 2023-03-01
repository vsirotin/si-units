package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SouthKoreanWonTest {

    @Test
    fun testCreation() {
        assertEquals(KRW, SouthKoreanWon())
        assertEquals(12.KRW, SouthKoreanWon(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = KRW.unitSymbols()
        assertEquals("KRW", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = KRW.categorySymbols()
        assertEquals("`₩`", s)
    }

    @Test
    fun getDimensions() {
        val s = KRW.dimensions.factors.first().specification.unitSymbol
        assertEquals("KRW", s)
    }
}