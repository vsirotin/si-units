package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class HongKongDollarTest {

    @Test
    fun testCreation() {
        assertEquals(HKD, HongKongDollar())
        assertEquals(12.HKD, HongKongDollar(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = HKD.unitSymbols()
        assertEquals("HKD", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = HKD.categorySymbols()
        assertEquals("`HK$`", s)
    }

    @Test
    fun getDimensions() {
        val s = HKD.dimensions.factors.first().specification.unitSymbol
        assertEquals("HKD", s)
    }
}