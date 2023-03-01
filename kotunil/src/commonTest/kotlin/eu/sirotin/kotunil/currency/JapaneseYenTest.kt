package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class JapaneseYenTest {

    @Test
    fun testCreation() {
        assertEquals(JPY, JapaneseYen())
        assertEquals(12.JPY, JapaneseYen(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = JPY.unitSymbols()
        assertEquals("JPY", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = JPY.categorySymbols()
        assertEquals("`¥`", s)
    }

    @Test
    fun getDimensions() {
        val s = JPY.dimensions.factors.first().specification.unitSymbol
        assertEquals("JPY", s)
    }
}