
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class NorwegianKroneTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(nkr, NorwegianKrone())
        assertEquals(123.nkr, 123.NOK)
    }

    @Test
    fun testCost() {
        val c = 12*m3/nkr
        assertEquals("m3/NOK", c.unitSymbols())
    }
}