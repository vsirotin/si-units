package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class IsraeliNewShekelTest {

    @Test
    fun testCreation() {
        assertEquals(ILS, IsraeliNewShekel())
        assertEquals(12.ILS, IsraeliNewShekel(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = ILS.unitSymbols()
        assertEquals("ILS", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = ILS.categorySymbols()
        assertEquals("`₪`", s)
    }

    @Test
    fun getDimensions() {
        val s = ILS.dimensions.factors.first().specification.unitSymbol
        assertEquals("ILS", s)
    }
}