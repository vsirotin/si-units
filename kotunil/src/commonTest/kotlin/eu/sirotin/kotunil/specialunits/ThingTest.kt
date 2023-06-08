package eu.sirotin.kotunil.specialunits


import kotlin.test.Test
import eu.sirotin.kotunil.core.times
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class ThingTest {

    @Test
    fun testMain() {
        val t = 12.3.thing
        assertEquals(12.3, t.value)
        assertEquals("#", t.unitSymbols())
        assertEquals("12.3 #", t.toString())
        assertEquals("Thing", t.dimensions.categorySymbols())
    }

    @Test
    fun testCompareTo() {
        assertTrue(2.3.thing > Thing(2.2))
        assertTrue(2.3.thing <= Thing(2.3))
        assertTrue(2.3.thing < Thing(2.4))
        assertEquals(2.3.thing, Thing(2.3))
    }

    @Test
    fun testEquals() {
        assertEquals(2.3.thing, Thing(2.3))
    }

    @Test
    fun testThongsWithPercentage() {
        val x = 200.thing
        val y = x * 10.percentage
        assertEquals(20.thing, y)
        assertEquals(2000.0, y.asPercentage)
    }
}