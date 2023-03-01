
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class SouthAfricanRandTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(R, SouthAfricanRand())
        assertEquals(123.R, 123.ZAR)
    }

    @Test
    fun testCost() {
        val c = 12*m3/R
        assertEquals("m3/ZAR", c.unitSymbols())
    }
}