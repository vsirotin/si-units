package eu.sirotin.siunits.core

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith


private const val EXPECTED_CLASS = "eu.sirotin.siunits.core.Expression"

internal class CoreTest {

    @Test
    fun testFullAlgebra() {
        val x1 = 2.a
        check(x1, 2.0, "a")

        val x2 = 4.b
        check(x2, 4.0, "b")

        val z1 = 2.a * 3.b
        check(z1, 6.0, "ab")

        val z2 = 2.b * 3.a
        check(z2, 6.0, "ab")

        val s0 = z1 / 6.b
        check(s0, 1.0, "a")

        val s1 =  2.0.a / 1.b
        check(s1, 2.0, "a/b")

        val s2 =  2.0.a * 1.b.pow(3) //* 1.b/ (1.0.b * 1.b.pow(3))
        check(s2, 2.0, "ab3")

        val s3 =  s2*s2
        check(s3, 4.0, "a2b6")

        val s4 = b.pow(2.01)
        check(s4, 1.0, "b2.01")

        val s5 = s4.pow(3.02)
        check(s5, 1.0, "b6.0702")

        val s6 = s2*s3
        check(s6, 8.0, "a3b9")

        val s7 = s2/s3
        check(s7, 0.5, "1/ab3")
        assertEquals("A-1B-3", s7.dimensionSymbols())

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { x1 + x2 }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))

        val exception2 = assertFailsWith<IllegalArgumentException>(
            block = { x1 - x2 }
        )
        assertTrue(exception2.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))

        val v3 = 3.1 * x1
        check(v3, 6.2, "a")

        val v4 = v3/v3
        check(v4, 1.0, "")

        val v5 = x1 / 4
        check(v5, 0.5, "a")

        val v6 = 2 / x1
        check(v6, 1.0, "1/a")

    }

    private fun check(obj: TermUnit, value: Double, units: String) {
        assertEquals(value, obj.value, EPS)
        assertEquals(units, obj.unitSymbols())
    }

    private fun check(obj: Expression, value: Double, units: String) {
        assertEquals(value, obj.value, EPS)
        assertEquals(units, obj.unitSymbols())
    }

    @Test
    fun testStatements1() {
        val v1 = 2.12.a/(1.06.a)
        assertEquals(2.0, v1.value)
        assertEquals("2.0 ", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements2() {
        val v1 = 2.12.a/b
        assertEquals(2.12, v1.value)
        assertEquals("2.12 a/b", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements3() {
        val v1 = 2.12.a/1.06.b*2.3.a
        assertEquals(4.6, v1.value)
        assertEquals("4.6 a2/b", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }


    @Test
    fun testStatements4() {
        val v1 = 10*2.12.a/1.06.b
        assertEquals(20.0, v1.value)
        assertEquals("20.0 a/b", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements5() {
        val v1 = 10*2.12.a/1.06.b
        assertEquals(20.0, v1.value)
        assertEquals("20.0 a/b", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testCompareTheSameSimpleType() {
        val v1 = 2.a
        val v2 = 2.999999999999999.a

        assertFalse(v1 > v2)
        assertFalse(v1 >= v2)
        assertTrue(v2 > v1)
        assertTrue(v2 >= v1)
    }

    @Test
    fun testCompareDifferentType() {
        val v1 = 2.4.a
        val v2 = 2.4.b

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))

    }

    @Test
    fun testUnitSymbols() {
        val v1 = 2.42.a
        assertEquals("a", v1.unitSymbols())

        val v2 = a*a*a/(a*b*b*3.b.pow(2.1))
        assertEquals("a2/b4.1", v2.unitSymbols())

    }

    @Test
    fun testDimensionalSymbols() {
        val v1 = 2.42.a
        assertEquals("A", v1.dimensionSymbols())

        val v2 = a*a*a/(a*b*b*3.b.pow(2.1))
        assertEquals("A2B-4.1", v2.dimensionSymbols())

    }

}