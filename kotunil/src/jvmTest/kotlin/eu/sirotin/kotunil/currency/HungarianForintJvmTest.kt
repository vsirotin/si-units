
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class HungarianForintTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(Ft, HungarianForint())
        assertEquals(123.Ft, 123.HUF)
    }

    @Test
    fun testCost() {
        val c = 12*m3/Ft
        assertEquals("m3/HUF", c.unitSymbols())
    }
}