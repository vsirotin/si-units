package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ChileanPesoTest {

    @Test
    fun testCreation() {
        assertEquals(CLP, ChileanPeso())
        assertEquals(12.CLP, ChileanPeso(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = CLP.unitSymbols()
        assertEquals("CLP", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = CLP.categorySymbols()
        assertEquals("`CLP$`", s)
    }

    @Test
    fun getDimensions() {
        val s = CLP.dimensions.factors.first().specification.unitSymbol
        assertEquals("CLP", s)
    }
}