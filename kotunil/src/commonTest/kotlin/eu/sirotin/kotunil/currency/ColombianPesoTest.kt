package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ColombianPesoTest {

    @Test
    fun testCreation() {
        assertEquals(COP, ColombianPeso())
        assertEquals(12.COP, ColombianPeso(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = COP.unitSymbols()
        assertEquals("COP", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = COP.categorySymbols()
        assertEquals("`COL$`", s)
    }

    @Test
    fun getDimensions() {
        val s = COP.dimensions.factors.first().specification.unitSymbol
        assertEquals("COP", s)
    }
}