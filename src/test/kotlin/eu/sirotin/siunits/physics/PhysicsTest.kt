package eu.sirotin.siunits.physics

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.siunits.m
import eu.sirotin.siunits.siunits.s

private const val EXPECTED_CLASS = "eu.sirotin.siunits.core.Expression"

internal class PhysicsTest {

    @Test
    fun testStatements1() {
        val v1 = 2.12.m/1.06.s
        assertEquals(2.0, v1.value)
        assertEquals("2.0 m/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements2() {
        val v1 = 2.12.m/s
        assertEquals(2.12, v1.value)
        assertEquals("2.12 m/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements3() {
        val v1 = 2.12.m/1.06.s*2.3.m
        assertEquals(4.6, v1.value)
        assertEquals("4.6 m2/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }


    @Test
    fun testStatements4() {
        val v1 = 10*2.12.m/1.06.s
        assertEquals(20.0, v1.value)
        assertEquals("20.0 m/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements5() {
        val v1 = 10*2.12.m/1.06.s
        assertEquals(20.0, v1.value)
        assertEquals("20.0 m/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

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
        

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))

    }

    @Test
    fun testMeterObject() {
        val v1 = 2.42.m

        assertEquals(2.42, v1.value)
        assertEquals("m", v1.description.unitSymbol)
        assertEquals("2.42 m", v1.toString())
        assertEquals("eu.sirotin.siunits.siunits.Metre", v1.javaClass.name)

    }

}