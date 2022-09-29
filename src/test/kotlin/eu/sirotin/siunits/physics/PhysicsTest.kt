package eu.sirotin.siunits.physics

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith
import eu.sirotin.siunits.core.*
import org.junit.jupiter.api.Disabled

internal class PhysicsTest {

    @Test
    fun testStatements1() {
        val v1 = 2.12.m/1.06.s
        assertEquals(2.0, v1.value)
        assertEquals("2.0 m/s", v1.toString())
        assertEquals("eu.sirotin.siunits.core.Fraction", v1.javaClass.name)

    }

    @Test
    fun testStatements2() {
        val v1 = 2.12.m/s
        assertEquals(2.12, v1.value)
        assertEquals("2.12 m/s", v1.toString())
        assertEquals("eu.sirotin.siunits.core.Fraction", v1.javaClass.name)

    }

    @Test
    fun testStatements3() {
        val v1 = 2.12.m/1.06.s*2.3.m
        assertEquals(4.6, v1.value)
        // TODO assertEquals("4.6 m", v1.toString())
        // TODO assertEquals("eu.sirotin.siunits.physics.Meter", v1.javaClass.name)

    }


    @Test
    @Disabled
    fun testStatements4() {
        val v1 = 10*2.12.m/1.06.s
        assertEquals(20, v1.value)
        // TODO assertEquals("4.6 m", v1.toString())
        // TODO assertEquals("eu.sirotin.siunits.physics.Meter", v1.javaClass.name)

    }

    @Test
    fun testStatements5() {
        val v1 = 10*2.12.m/1.06.s
        //TODO val v2 = 10.1* v1/2
        //TODO assertEquals(46, v1.value)
        // TODO assertEquals("4.6 m", v1.toString())
        // TODO assertEquals("eu.sirotin.siunits.physics.Meter", v1.javaClass.name)

    }

    @Test
    fun testCompareTheSameType() {
        val v1 = 2.m
        val v2 = 2.999999999999999.m

        assertFalse(v1 > v2)
        assertFalse(v1 >= v2)
        assertTrue(v2 > v1)
        assertTrue(v2 >= v1)
    }

    @Test
    fun testCompareDifferentType() {
        val v1 = 2.4.m
        val v2 = 2.4.s

        //assertFalse(v1 == v2) compilation error
        //assertFalse(v1 == 2.4) compilation error

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertEquals("Compared elements have different types: 'this' is 'class eu.sirotin.siunits.physics.Meter but 'other' is 'class eu.sirotin.siunits.physics.Second'",
            exception.message)

    }

    @Test
    fun testMeterObject() {
        val v1 = 2.42.m

        assertEquals(2.42, v1.value)
        assertEquals("m", v1.symbol)
        assertEquals("2.42 m", v1.toString())
        assertEquals("eu.sirotin.siunits.physics.Meter", v1.javaClass.name)

    }

}