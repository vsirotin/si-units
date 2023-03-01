
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class RomanianLeuTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(RL, RomanianLeu())
        assertEquals(123.RL, 123.RON)
    }

    @Test
    fun testCost() {
        val c = 12*m3/RL
        assertEquals("m3/RON", c.unitSymbols())
    }
}