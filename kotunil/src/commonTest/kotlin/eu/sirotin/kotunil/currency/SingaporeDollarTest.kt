package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SingaporeDollarTest {

    @Test
    fun testCreation() {
        assertEquals(SGD, SingaporeDollar())
        assertEquals(12.SGD, SingaporeDollar(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = SGD.unitSymbols()
        assertEquals("SGD", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = SGD.categorySymbols()
        assertEquals("`S$`", s)
    }

    @Test
    fun getDimensions() {
        val s = SGD.dimensions.factors.first().specification.unitSymbol
        assertEquals("SGD", s)
    }
}