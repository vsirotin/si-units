
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class UAEDirhamTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(Dh, UAEDirham())
        assertEquals(123.Dh, 123.AED)
    }

    @Test
    fun testCost() {
        val c = 12*m3/Dh
        assertEquals("m3/AED", c.unitSymbols())
    }
}