package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class PolishZłotyTest {

    @Test
    fun testCreation() {
        assertEquals(PLN, PolishZłoty())
        assertEquals(12.PLN, PolishZłoty(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = PLN.unitSymbols()
        assertEquals("PLN", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = PLN.categorySymbols()
        assertEquals("`zł`", s)
    }

    @Test
    fun getDimensions() {
        val s = PLN.dimensions.factors.first().specification.unitSymbol
        assertEquals("PLN", s)
    }
}