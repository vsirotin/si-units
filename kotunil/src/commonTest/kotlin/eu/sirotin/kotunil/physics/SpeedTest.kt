package eu.sirotin.kotunil.physics

import eu.sirotin.kotunil.base.Second
import eu.sirotin.kotunil.base.km
import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.specialunits.h
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Car(val midSpeed: KmH){
    fun distanceForHours(duration: Second): Expression = (this.midSpeed*duration)
}

internal class SpeedTest {

    private val porsche = Car(200.kmh)

    @Test
    fun testDistance() {

        val d = porsche.distanceForHours(1.5.h)
        assertEquals(300.km, d)
        assertEquals(300_000.0, d.value)
        assertEquals("m", d.unitSymbols())
     }

    @Test
    fun testTypes() {
        assertEquals(porsche.midSpeed, 200*kmh)
    }
}