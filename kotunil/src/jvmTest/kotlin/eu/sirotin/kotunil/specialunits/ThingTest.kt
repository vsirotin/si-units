package eu.sirotin.kotunil.specialunits

import eu.sirotin.kotunil.EPS
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.times
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

internal class ThingTest {

    @Test
    fun testThing() {
        //Sometimes you need an abstract unit like "thing". For example:
        //Every good guy has 30 different things per liter in his pocket.
        //Jan is a good guy and his pocket is 0.3 liters big.
        //How many things can his mom find in Jan's pocket?

        val p = 30.`#`/l
        val n = 0.3.l * p

        assertEquals(9.0, n.value, EPS)
        assertEquals("#", n.unitSymbols())
    }

    @Test
    fun testThingVariable() {

        assertEquals(`#`, Thing(1.0))
        assertEquals(`#`, 1.`#`)
    }
}