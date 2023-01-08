package eu.sirotin.kotunil.physics

import eu.sirotin.kotunil.base.s
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
internal class SecondTest {

    @Test
    fun testSecondObject() {
        val v1 = 3.12.s

        assertEquals(3.12, v1.value)
        assertEquals("s", v1.unitSymbols())
        assertEquals("3.12 s", v1.toString())
        assertEquals("eu.sirotin.kotunil.base.Second", v1.javaClass.name)

    }

}