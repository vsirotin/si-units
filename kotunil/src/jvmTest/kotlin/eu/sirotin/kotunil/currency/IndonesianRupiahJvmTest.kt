
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class IndonesianRupiahTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(Rp, IndonesianRupiah())
        assertEquals(123.Rp, 123.IDR)
    }

    @Test
    fun testCost() {
        val c = 12*m3/Rp
        assertEquals("m3/IDR", c.unitSymbols())
    }
}