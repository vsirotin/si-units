package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class RussianRubleTest {

    @Test
    fun testCreation() {
        assertEquals(RUB, RussianRuble())
        assertEquals(12.RUB, RussianRuble(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = RUB.unitSymbols()
        assertEquals("RUB", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = RUB.categorySymbols()
        assertEquals("`₽`", s)
    }

    @Test
    fun getDimensions() {
        val s = RUB.dimensions.factors.first().specification.unitSymbol
        assertEquals("RUB", s)
    }
}