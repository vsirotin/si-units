package eu.sirotin.siunits.physics

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class CoreTest {

    @Test
    fun testEquals() {
        val v1 = 2.m
        val v2 = 2.m
        assertEquals(v1, v2)

        val v3 = 2.999999999999999.m
        val v4 = 2.999999999999999.m
        assertEquals(v3, v4)
        assertTrue(v1 == v2)
        assertTrue(v1 != v3)
        //val v5 = v1 + 2.0 compilation error
        //val v5 = 2.m + 3.s compilation error
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

}