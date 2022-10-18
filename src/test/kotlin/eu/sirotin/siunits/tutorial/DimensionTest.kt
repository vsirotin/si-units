package eu.sirotin.siunits.tutorial

import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.physics.l
import eu.sirotin.siunits.physics.m
import eu.sirotin.siunits.physics.mm
import eu.sirotin.siunits.physics.s
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class DimensionTest {

    @Test
    fun testStatements() {
        //Eva broke a glass in her aquarium and water flowed to the bottom.
        // In aquarium before the break was 20 liters of water.
        // Eva'a room is 4 m. long and 5 tall.
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
    fun testUnits() {
        val s = 4.m * 5.m
        assertEquals("m2", s.units())
        val x = 20.l
        assertEquals("m3", x.units())
        val h = x/s
        assertEquals("m", h.units())

        val y = 1.2.s
        assertEquals("s", y.units())

        val z = x/y
        assertEquals("m3/s", z.units())

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

    }

}