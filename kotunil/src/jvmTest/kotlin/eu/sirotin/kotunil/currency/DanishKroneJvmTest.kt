
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class DanishKroneTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(dkr, DanishKrone())
        assertEquals(123.dkr, 123.DKK)
    }

    @Test
    fun testCost() {
        val c = 12*m3/dkr
        assertEquals("m3/DKK", c.unitSymbols())
    }
}