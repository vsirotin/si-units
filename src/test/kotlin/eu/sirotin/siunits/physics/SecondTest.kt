package eu.sirotin.siunits.physics

import eu.sirotin.siunits.siunits.s
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class SecondTest {

    @Test
    fun testSecondObject() {
        val v1 = 3.12.s

        assertEquals(3.12, v1.value)
        assertEquals("s", v1.description.unitSymbol)
        assertEquals("3.12 s", v1.toString())
        assertEquals("eu.sirotin.siunits.siunits.Second", v1.javaClass.name)

    }

}