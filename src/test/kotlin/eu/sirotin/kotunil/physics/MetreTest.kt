package eu.sirotin.kotunil.physics

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.m
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MetreTest {

    @Test
    fun testMeterObject() {
        val v1 = 2.42.m

        assertEquals(2.42, v1.value)
        assertEquals("m", v1.description.unitSymbol)
        assertEquals("2.42 m", v1.toString())
        assertEquals("eu.sirotin.kotunil.base.Metre", v1.javaClass.name)

    }

    @Test
    fun testMeterOperations() {
        val v1 = 2.m - 1.5.m + 2*1.5.m - 3.m

        assertEquals(0.5, v1.value)
        assertEquals("m", v1.description.unitSymbol)
        assertEquals("0.5 m", v1.toString())
        assertEquals("eu.sirotin.kotunil.base.Metre", v1.javaClass.name)

    }

}