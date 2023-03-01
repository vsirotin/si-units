package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ThaiBahtTest {

    @Test
    fun testCreation() {
        assertEquals(THB, ThaiBaht())
        assertEquals(12.THB, ThaiBaht(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = THB.unitSymbols()
        assertEquals("THB", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = THB.categorySymbols()
        assertEquals("`฿`", s)
    }

    @Test
    fun getDimensions() {
        val s = THB.dimensions.factors.first().specification.unitSymbol
        assertEquals("THB", s)
    }
}