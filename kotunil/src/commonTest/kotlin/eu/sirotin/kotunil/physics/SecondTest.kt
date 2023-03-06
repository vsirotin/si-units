package eu.sirotin.kotunil.physics

import eu.sirotin.kotunil.base.s
import kotlin.test.Test
import kotlin.test.assertEquals
internal class SecondTest {

    @Test
    fun testSecondObject() {
        val v1 = 3.12.s

        assertEquals(3.12, v1.value)
        assertEquals("s", v1.unitSymbols())
        assertEquals("3.12 s", v1.toString())
    }

}