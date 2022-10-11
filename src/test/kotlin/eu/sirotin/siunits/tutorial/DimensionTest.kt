package eu.sirotin.siunits.tutorial

import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.physics.l
import eu.sirotin.siunits.physics.m
import eu.sirotin.siunits.physics.mm
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class DimensionTest {

    @Test
    fun testDimensions() {
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

    }
}