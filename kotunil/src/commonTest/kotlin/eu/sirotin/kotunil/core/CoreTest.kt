/*
 * Copyright (c) 2022.  Viktor Sirotin
 *
 *  *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  *  furnished to do so, subject to the following conditions:
 *  *  This Copyright header should still in file if you use it file without changes or
 *  * with changes or if you copy essential part of this file in some new file.
 *  *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 */

package eu.sirotin.kotunil.core

import eu.sirotin.kotunil.EPS
import kotlin.test.*

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

        val s1 = 2.0.a / 1.b
        check(s1, 2.0, "a/b")

        val s2 = 2.0.a * 1.b.pow(3) //* 1.b/ (1.0.b * 1.b.pow(3))
        check(s2, 2.0, "ab3")

        val s3 = s2 * s2
        check(s3, 4.0, "a2b6")

        val s4 = b.pow(2.01)
        check(s4, 1.0, "b2.01")

        val s5 = s4.pow(3.02)
        check(s5, 1.0, "b6.0702")

        val s6 = s2 * s3
        check(s6, 8.0, "a3b9")

        val s7 = s2 / s3
        check(s7, 0.5, "1/ab3")
        assertEquals("A-1B-3", s7.categorySymbols())

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

        val v4 = v3 / v3
        check(v4, 1.0, "")

        val v5 = x1 / 4
        check(v5, 0.5, "a")

        val v6 = 2 / x1
        check(v6, 1.0, "1/a")

    }


    private fun check(obj: Expression, value: Double, units: String) {
        assertEquals(value, obj.value, ε)
        assertEquals(units, obj.unitSymbols())
    }

    @Ignore
    @Test
    fun testStatements1() {
        val v1 = 2.12.a / (1.06.a)
        assertEquals(2.0, v1.value)
        assertEquals("2.0 ", v1.toString())
        // TODO JS
        //// TODO assertEquals(EXPECTED_CLASS, v1::class.qualifiedName)

    }

    @Test
    fun testStatements2() {
        val v1 = 2.12.a / b
        assertEquals(2.12, v1.value)
        assertEquals("2.12 a/b", v1.toString())
        // TODO JS
        // // TODO assertEquals(EXPECTED_CLASS, v1::class.qualifiedName)

    }

    @Test
    fun testStatements3() {
        val v1 = 2.12.a / 1.06.b * 2.3.a
        assertEquals(4.6, v1.value)
        assertEquals("4.6 a2/b", v1.toString())
        // TODO JS
        // // TODO assertEquals(EXPECTED_CLASS, v1::class.qualifiedName)

    }

    @Ignore
    @Test
    fun testStatements4() {
        val v1 = 10 * 2.12.a / 1.06.b
        assertEquals(20.0, v1.value)
        assertEquals("20.0 a/b", v1.toString())
        // TODO JS
        // // TODO assertEquals(EXPECTED_CLASS, v1::class.qualifiedName)

    }

    @Ignore
    @Test
    fun testStatements5() {
        val v1 = 10 * 2.12.a / 1.06.b
        assertEquals(20.0, v1.value)
        assertEquals("20.0 a/b", v1.toString())
        // TODO JS
        // // TODO assertEquals(EXPECTED_CLASS, v1::class.qualifiedName)

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

        val v2 = a * a * a / (a * b * b * 3.b.pow(2.1))
        assertEquals("a2/b4.1", v2.unitSymbols())

    }

    @Test
    fun testDimensionalSymbols() {
        val v1 = 2.42.a
        assertEquals("A", v1.categorySymbols())

        val v2 = a * a * a / (a * b * b * 3.b.pow(2.1))
        assertEquals("A2B-4.1", v2.categorySymbols())

    }

    @Test
    fun testErrors1() {
        //Simple errors will be found on compilation phase:
        //val x = 1.m + 2 compiler error
        //val y = 20.l/(4.m * 5.m) + 14 compiler error

        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalArgumentException>(
            block = { 1.a + 2.b }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))
    }

    @Test
    fun testErrors2() {
        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalArgumentException>(
            block = { a * a * a * b / (4.a + 5.b) + 2.b }
        )
        val expectedMessage = "$COMPATIBILITY_ERR_PREFIX 'a' and 'b'"
        assertEquals(expectedMessage, exception.message!!)

    }

    @Test
    fun testErrors3() {
        //Complex errors will be found in runtime:
        assertFailsWith<ClassCastException>(
            block = { (20.a * a * a * 3.b / (4.a + 5.a)).aa }
        )

    }

    @Test
    fun testErrors4() {
        //Complex errors will be found in runtime:
        assertFailsWith<ClassCastException>(
            block = { (20.a * a * a / (a * a * a)).aa }
        )

    }

    @Test
    fun testPowerAliasInTerm() {
        val x = 20.a `^` 3
        assertEquals("A3", x.categorySymbols())
        assertEquals(8000.0, x.value)
    }

    @Test
    fun testPowerAliasInExpression() {
        //Different operation/operator priority by infix function `^` and extension function pow
        val x = 2.a * 20.a / b `^` 3
        assertEquals("A6B-3", x.categorySymbols())
        assertEquals(64000.0, x.value)

        val y = 2.a * 20.a / b.pow(3)
        assertEquals("A2B-3", y.categorySymbols())
        assertEquals(40.0, y.value)

        //To access the same result as by previous lines:
        val z = 2.a * 20.a / (b `^` 3)
        assertEquals("A2B-3", z.categorySymbols())
        assertEquals(40.0, z.value)

    }

    @Test
    fun testUnaryOperators() {

        val x0 = 1.2.a * (b `^` -2.5)
        val x1 = +x0
        assertEquals("AB-2.5", x1.categorySymbols())
        assertEquals(x0.value, x1.value, EPS)

        val x2 = -x0
        assertEquals("AB-2.5", x2.categorySymbols())
        assertEquals(x0.value, -x2.value, EPS)

        //Both not working because known error in compiler: https://youtrack.jetbrains.com/issue/KT-24800
        //val x3a = x0++
        //val x3b = x0--

    }

    @Test
    fun testAugmentedAssignments() {
        val x0 = 1.2.a * (b `^` -2.5)
        var x4 = x0
        x4 += 2 * x0
        assertEquals("AB-2.5", x4.categorySymbols())
        assertEquals(3 * x0.value, x4.value, EPS)

        x4 -= 4 * x0
        assertEquals("AB-2.5", x4.categorySymbols())
        assertEquals(-x0.value, x4.value, EPS)

        var x5 = x0
        x5 *= a
        assertEquals("A2B-2.5", x5.categorySymbols())
        assertEquals(x0.value, x5.value, EPS)

        x5 /= a
        assertEquals("AB-2.5", x5.categorySymbols())
        assertEquals(x0.value, x5.value, EPS)

        val x6 = 1.23.a * b
        val x7 = 0.5 * a
        val x8 = 1.23 % 0.5
        val x9 = x6 % x7
        assertEquals("B", x9.categorySymbols())
        assertEquals(x8, x9.value, EPS)

        var x10 = x6
        x10 %= x7
        assertEquals("B", x10.categorySymbols())
        assertEquals(x8, x10.value, EPS)
    }

    @Test
    fun testRange() {
        val x0 = 1.2.a * (b `^` -2.5)
        val x11 = 11 * x0
        val r11 = x0..x11
        assertTrue(x0 * 3.1 in r11)
        assertFalse(-x0 in r11)
        assertFalse(11.1 * x0 in r11)

    }

    @Test
    fun testComparison() {
        assertTrue(2.a > 1.3.a)
        assertTrue(2.a >= 1.3.a)
        assertEquals(12.a, 12.a)
        assertNotSame(12.a, 12.a)
        assertFalse(2.a < 1.3.a)
        assertFalse(2.a <= 1.3.a)
        assertNotEquals(2.a, 1.3.a)
        assertTrue(2.a != 1.3.a)

    }
}