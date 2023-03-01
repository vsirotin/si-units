
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import org.junit.Test
import kotlin.test.assertEquals

internal class SwissFrancTestJvm {


    @Test
    fun testCreationJvm() {
        assertEquals(SCHF, SwissFranc())
        assertEquals(123.SCHF, 123.CHF)
    }

    @Test
    fun testCost() {
        val c = 12*m3/SCHF
        assertEquals("m3/CHF", c.unitSymbols())
    }
}