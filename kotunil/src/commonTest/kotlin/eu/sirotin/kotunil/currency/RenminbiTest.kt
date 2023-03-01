package eu.sirotin.kotunil.currency
   
import kotlin.test.Test
import kotlin.test.assertEquals

internal class RenminbiTest {

    @Test
    fun testCreation() {
        assertEquals(CNY, Renminbi())
        assertEquals(12.CNY, Renminbi(12.0))
    }


    @Test
    fun testUnitSymbols() {
        val s = CNY.unitSymbols()
        assertEquals("CNY", s)
    }

    @Test
    fun testCategorySymbols() {
        val s = CNY.categorySymbols()
        assertEquals("`人民币`", s)
    }

    @Test
    fun getDimensions() {
        val s = CNY.dimensions.factors.first().specification.unitSymbol
        assertEquals("CNY", s)
    }
}