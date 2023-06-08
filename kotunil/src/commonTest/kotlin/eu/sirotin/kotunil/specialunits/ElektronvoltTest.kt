package eu.sirotin.kotunil.specialunits


import eu.sirotin.kotunil.derived.Joule
import kotlin.math.pow
import kotlin.test.Test
import kotlin.test.assertEquals


internal class ElectronVoltTest {

    @Test
    fun testMain() {
        val x = 1.eV
        val y = Joule(1.602176634 * (10.0.pow(-19)))
        assertEquals(x, y)
    }
}