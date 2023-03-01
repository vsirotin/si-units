package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BrazilianRealTest {

    @Test
    fun testCreation() {
        assertEquals(BRL, BrazilianReal())
        assertEquals(12.BRL, BrazilianReal(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = BRL.unitSymbols()
        assertEquals("BRL", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = BRL.categorySymbols()
        assertEquals("`R$`", s)
    }

    @Test
    fun getDimensions() {
        val s = BRL.dimensions.factors.first().specification.unitSymbol
        assertEquals("BRL", s)
    }
}