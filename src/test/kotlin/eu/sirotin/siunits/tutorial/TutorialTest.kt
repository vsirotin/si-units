package eu.sirotin.siunits.tutorial

import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.physics.l
import eu.sirotin.siunits.physics.m
import eu.sirotin.siunits.physics.mm
import eu.sirotin.siunits.physics.s
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith


internal class TutorialTest {

    @Test
    fun testHappyPath1() {
        //Eva broke a glass in her aquarium and water flowed to the bottom.
        // In aquarium before the break was 20 liters of water.
        // Eva's room is 4 m. long and 5 tall.
        // How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?

        //The solution in Kotlin can be written in one line.
        // For didactic reasons as introduce two auxiliary variables s and h.

        val s = 4.m * 5.m
        val x = 20.l
        val h = x/s
        val z = h.mm
        assertEquals(1.0, z, EPS)

        //the same as statement

        assertEquals(1.0, (20.l/(4.m * 5.m)).mm, EPS)

    }

    @Test
    fun testUnitSymbols() {
        val s = 4.m * 5.m
        assertEquals("m2", s.unitSymbols())
        val x = 20.l
        assertEquals("m3", x.unitSymbols())
        val h = x/s
        assertEquals("m", h.unitSymbols())

        val y = 1.2.s
        assertEquals("s", y.unitSymbols())

        val z = x/y
        assertEquals("m3/s", z.unitSymbols())

    }

    @Test
    fun testDimensionalSymbols() {
        val s = 4.m * 5.m
        assertEquals("L2", s.dimensionSymbols())
        val x = 20.l
        assertEquals("L3", x.dimensionSymbols())
        val h = x/s
        assertEquals("L", h.dimensionSymbols())

        val y = 1.2.s
        assertEquals("T", y.dimensionSymbols())

        val z = x/y
        assertEquals("L3T-1", z.dimensionSymbols())

    }

    @Test
    fun testShow() {
        val s = 4.m * 5.m
        assertEquals("20 m2", s.show("%.0f"))
        val x = 20.l
        val format = "%.2f"
        assertEquals("0,02 m3", x.show(format))
        val h = x/s
        assertEquals("0,001 m", h.show("%.3f"))
        val y = 3.1415927.m
        assertEquals("3,142 m", y.show("%.3f"))

    }

    @Test
    fun testErrors1() {
        //Simple errors will be found on compilation phase:
        //val x = 1.m + 2 compiler error
        //val y = 20.l/(4.m * 5.m) + 14 compiler error

        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalArgumentException>(
            block = { 1.m + 2.s }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))
    }

    @Test
    fun testErrors2() {
        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalArgumentException>(
            block = { 20.l*s/(4.m + 5.m) + 2.s }
        )
        val expectedMessage = "$COMPATIBILITY_ERR_PREFIX 'm2s' and 's'"
        assertEquals(expectedMessage, exception.message!!)

    }

    @Test
    fun testErrors3() {
        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalStateException>(
            block = { (20.l*3.s/(4.m + 5.m)).mm}
        )
        val expectedMessage = ERR_CONVERSION_PREFIX + "L2T" + ERR_CONVERSION_SUFFIX
        assertEquals(expectedMessage, exception.message!!)

    }

    @Test
    fun testErrors4() {
        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalStateException>(
            block = { (20.l/(m*m*m)).mm}
        )
        assertEquals(ERR_CONVERSION_DIMENSIONLESS, exception.message!!)

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
}