        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.base.A
import eu.sirotin.kotunil.base.kg
import eu.sirotin.kotunil.base.m
import eu.sirotin.kotunil.base.s
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.specialunits.m2
import kotlin.test.assertEquals
import kotlin.test.Test


internal class DerivedAbstractTest {

    private class Volt1(value: Number) : DerivedUnit(value, kg*m2*(s `^` -3) * (A `^` -1))

    @Test
    fun testCoreAndDerived() {

        val x = Newton(12)
        val y = x/m;
        val yc = y.categorySymbols()
        assertEquals("MT-2", yc)
    }

    @Test
    fun testPseudoVolt() {
        assertEquals<Expression>(Volt1(12.6) , Volt(12.6))
    }
}