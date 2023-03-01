package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class PhilippinePesoTest {

    @Test
    fun testCreation() {
        assertEquals(PHP, PhilippinePeso())
        assertEquals(12.PHP, PhilippinePeso(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = PHP.unitSymbols()
        assertEquals("PHP", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = PHP.categorySymbols()
        assertEquals("`₱`", s)
    }

    @Test
    fun getDimensions() {
        val s = PHP.dimensions.factors.first().specification.unitSymbol
        assertEquals("PHP", s)
    }
}