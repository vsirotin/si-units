package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MexicanPesoTest {

    @Test
    fun testCreation() {
        assertEquals(MXN, MexicanPeso())
        assertEquals(12.MXN, MexicanPeso(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = MXN.unitSymbols()
        assertEquals("MXN", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = MXN.categorySymbols()
        assertEquals("`$`", s)
    }

    @Test
    fun getDimensions() {
        val s = MXN.dimensions.factors.first().specification.unitSymbol
        assertEquals("MXN", s)
    }
}