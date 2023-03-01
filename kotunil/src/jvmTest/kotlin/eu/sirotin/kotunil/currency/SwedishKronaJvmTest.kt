
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class SwedishKronaTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(skr, SwedishKrona())
        assertEquals(123.skr, 123.SEK)
    }

    @Test
    fun testCost() {
        val c = 12*m3/skr
        assertEquals("m3/SEK", c.unitSymbols())
    }
}