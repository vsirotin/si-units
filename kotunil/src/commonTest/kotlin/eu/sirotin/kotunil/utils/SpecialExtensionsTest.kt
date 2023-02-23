        
package eu.sirotin.kotunil.utils

import kotlin.test.assertEquals
import kotlin.test.Test

private const val x0 = 0
private const val x1 = 123.456789
private const val x2 = -123.456789
private const val x3 = 123.9999
private const val x4 = -123.9999

private const val y1 = 0.456789
private const val y2 = -0.456789
private const val y3 = 0.9999
private const val y4 = -0.9999

private const val z1 = -0.00001
private const val z2 = 0.00001


internal class SpecialExtensionsTest {

    @Test
    fun testNumberAfter0() {
        assertEquals("0", x0.simpleFormat())

        assertEquals("123", x1.simpleFormat())
        assertEquals("-123", x2.simpleFormat())
        assertEquals("123", x3.simpleFormat())
        assertEquals("-123", x4.simpleFormat())

        assertEquals("0", y1.simpleFormat())
        assertEquals("0", y2.simpleFormat())
        assertEquals("0", y3.simpleFormat())
        assertEquals("0", y4.simpleFormat())
    }

    @Test
    fun testNumberAfter1() {
        assertEquals("0,0", x0.simpleFormat(1))

        assertEquals("123,4", x1.simpleFormat(1))
        assertEquals("-123,4", x2.simpleFormat(1))
        assertEquals("123,9", x3.simpleFormat(1))
        assertEquals("-123,9", x4.simpleFormat(1))

        assertEquals("0,4", y1.simpleFormat(1))
        assertEquals("-0,4", y2.simpleFormat(1))
        assertEquals("0,9", y3.simpleFormat(1))
        assertEquals("-0,9", y4.simpleFormat(1))
    }

    @Test
    fun testNumberAfter2() {
        assertEquals("0,00", x0.simpleFormat(2))

        assertEquals("123,45", x1.simpleFormat(2))
        assertEquals("-123,45", x2.simpleFormat(2))
        assertEquals("123,99", x3.simpleFormat(2))
        assertEquals("-123,99", x4.simpleFormat(2))

        assertEquals("0,45", y1.simpleFormat(2))
        assertEquals("-0,45", y2.simpleFormat(2))
        assertEquals("0,99", y3.simpleFormat(2))
        assertEquals("-0,99", y4.simpleFormat(2))
    }

    @Test
    fun testNumberAfter2AndPoint() {
        assertEquals("0.00", x0.simpleFormat(2, '.'))

        assertEquals("123.45", x1.simpleFormat(2, '.'))
        assertEquals("-123.45", x2.simpleFormat(2, '.'))
        assertEquals("123.99", x3.simpleFormat(2, '.'))
        assertEquals("-123.99", x4.simpleFormat(2, '.'))

        assertEquals("0.45", y1.simpleFormat(2, '.'))
        assertEquals("-0.45", y2.simpleFormat(2, '.'))
        assertEquals("0.99", y3.simpleFormat(2, '.'))
        assertEquals("-0.99", y4.simpleFormat(2, '.'))
    }

    @Test
    fun testNumberAfter0AndPoint() {
        assertEquals("0", x0.simpleFormat(0, '.'))

        assertEquals("123", x1.simpleFormat(0, '.'))
        assertEquals("-123", x2.simpleFormat(0, '.'))
        assertEquals("123", x3.simpleFormat(0, '.'))
        assertEquals("-123", x4.simpleFormat(0, '.'))

        assertEquals("0", y1.simpleFormat(0, '.'))
        assertEquals("0", y2.simpleFormat(0, '.'))
        assertEquals("0", y3.simpleFormat(0, '.'))
        assertEquals("0", y4.simpleFormat(0, '.'))
    }

    @Test
    fun testNumberNearNullAfter0AndPoint() {
        assertEquals("0", z1.simpleFormat(0, '.'))

        assertEquals("-0.0", z1.simpleFormat(1, '.'))
        assertEquals("-0.00", z1.simpleFormat(2, '.'))
        assertEquals("-0.000", z1.simpleFormat(3, '.'))
        assertEquals("-0.0000", z1.simpleFormat(4, '.'))
        assertEquals("-0.00001", z1.simpleFormat(5, '.'))
        assertEquals("-0.000010", z1.simpleFormat(6, '.'))

        assertEquals("0", z2.simpleFormat(0, '.'))

        assertEquals("0.0", z2.simpleFormat(1, '.'))
        assertEquals("0.00", z2.simpleFormat(2, '.'))
        assertEquals("0.000", z2.simpleFormat(3, '.'))
        assertEquals("0.0000", z2.simpleFormat(4, '.'))
        assertEquals("0.00001", z2.simpleFormat(5, '.'))
        assertEquals("0.000010", z2.simpleFormat(6, '.'))

    }
}