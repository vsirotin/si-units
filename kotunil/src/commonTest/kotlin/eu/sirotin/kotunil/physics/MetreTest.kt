package eu.sirotin.kotunil.physics

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.m
import eu.sirotin.kotunil.specialunits.L
import eu.sirotin.kotunil.specialunits.m3
import kotlin.test.Test

import kotlin.test.assertEquals

internal class MetreTest {

    @Test
    fun testMeterObject() {
        val v1 = 2.42.m

        assertEquals(2.42, v1.value)
        assertEquals("m", v1.unitSymbols())
        assertEquals("2.42 m", v1.toString())
     }

    @Test
    fun testMeterOperations() {
        val v1 = 2.m - 1.5.m + 2*1.5.m - 3.m

        assertEquals(0.5, v1.value)
        assertEquals("m", v1.unitSymbols())
    }

    @Test
    fun testLitre() {
        val v1 = 1000*L
        assertEquals(v1, m3)

    }

}