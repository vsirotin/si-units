
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class MalaysianRinggitTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(RM, MalaysianRinggit())
        assertEquals(123.RM, 123.MYR)
    }

    @Test
    fun testCost() {
        val c = 12*m3/RM
        assertEquals("m3/MYR", c.unitSymbols())
    }
}