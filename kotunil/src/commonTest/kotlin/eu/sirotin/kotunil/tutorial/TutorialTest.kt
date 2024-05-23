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

package eu.sirotin.kotunil.tutorial

import eu.sirotin.kotunil.base.A
import eu.sirotin.kotunil.base.Ampere
import eu.sirotin.kotunil.base.Candela
import eu.sirotin.kotunil.base.K
import eu.sirotin.kotunil.base.Kelvin
import eu.sirotin.kotunil.base.Kilogram
import eu.sirotin.kotunil.base.Metre
import eu.sirotin.kotunil.base.Mole
import eu.sirotin.kotunil.base.Second
import eu.sirotin.kotunil.base.cd
import eu.sirotin.kotunil.base.cm
import eu.sirotin.kotunil.base.kg
import eu.sirotin.kotunil.base.km
import eu.sirotin.kotunil.base.m
import eu.sirotin.kotunil.base.mm
import eu.sirotin.kotunil.base.mol
import eu.sirotin.kotunil.base.s
import eu.sirotin.kotunil.base.μm
import eu.sirotin.kotunil.core.COMPATIBILITY_ERR_PREFIX
import eu.sirotin.kotunil.core.`^`
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.minus
import eu.sirotin.kotunil.core.plus
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.core.ε
import eu.sirotin.kotunil.derived.Hz
import eu.sirotin.kotunil.derived.T
import eu.sirotin.kotunil.derived.Wb
import eu.sirotin.kotunil.derived.μV
import eu.sirotin.kotunil.specialunits.celsius
import eu.sirotin.kotunil.specialunits.ha
import eu.sirotin.kotunil.specialunits.l
import eu.sirotin.kotunil.specialunits.m2
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.specialunits.t
import kotlin.math.abs
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue


internal class TutorialTest {

    @Test
    fun testHappyGettingStarted() {
        //Eva broke a glass in her aquarium and water flowed to the bottom.
        // In aquarium before the break was 20 liters of water.
        // Eva's room is 4 m. long and 5 tall.
        // How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?

        //The solution in Kotlin can be written in one line.
        // For didactic reasons as introduce two auxiliary variables s and h.

        val s = 4.m * 5.m
        val x = 20.l
        val h = x / s
        val z = h / mm
        assertEquals(1.0, z.value, ε)

        //the same as statement

        assertEquals(1.0, ((20.l / (4.m * 5.m)) / mm).value, ε)

    }


    @Test
    fun testDimensionAnalysis() {
        //With the help of the built-in function unitSymbols you can get the dimension of any object in terms of SI standard.

        val s = 4.m * 5.m
        assertEquals("m2", s.unitSymbols())
        val x = 20.l
        assertEquals("m3", x.unitSymbols())
        val h = x / s
        assertEquals("m", h.unitSymbols())

        val y = 1.2.s
        assertEquals("s", y.unitSymbols())

        val z = x / y
        assertEquals("m3/s", z.unitSymbols())

    }

    @Test
    fun testCategorySymbols() {
        //Using the built-in function categorySymbols() you can analyze dimensions
        // of physical units in "academic" manner.
        val s = 4.m * 5.m
        assertEquals("L2", s.categorySymbols())

        val x = 20.l
        assertEquals("L3", x.categorySymbols())

        val h = x / s
        assertEquals("L", h.categorySymbols())

        val y = 1.2.s
        assertEquals("T", y.categorySymbols())

        val z = x / y
        assertEquals("L3T-1", z.categorySymbols())

    }

    //---------------Type safety
//Physical units of the same dimension can be added, added,
//divided and compared.
//If you try to do this with units of different types,
//you will get either compilation errors (for simple units) or run-time errors for complicated units.

    @Test
    fun testOperationTheSameTypesIndirect() {
        assertEquals(0.9.Hz, 0.9/s)

        assertEquals(0.9.Hz, 5/s - 4.1.Hz)

        assertEquals(16.Hz * m3, 20.2 * m3 / s - 4.2.Hz * m3)

        assertEquals((-2).Hz * kg * m, 2.2 * kg * m / s - 4.2.Hz * kg * m)
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
            block = { 20.l * s / (4.m + 5.m) + 2.s }
        )
        val expectedMessage = "$COMPATIBILITY_ERR_PREFIX 'm2s' and 's'"
        assertEquals(expectedMessage, exception.message!!)

    }

    @Test
    fun testErrors3() {
        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalArgumentException>(
            block = { (20.l * 3.s / (4.m + 5.m)) + mm }
        )
        val expectedMessage = "$COMPATIBILITY_ERR_PREFIX 'm2s' and 'm'"
        assertEquals(expectedMessage, exception.message!!)

    }

    //Comparison of objects---------
    //
    //Physical objects can be compared only if they have the same dimensions,
    // otherwise you will get a run-time error.

    @Test
    fun testCompareTheSameTypes() {
        assertTrue(5.m > 4.1.m)

        assertTrue(20.2 * m3 > 4.2 * m3)

        assertTrue(2.2 * kg * m / s < 4.2 * kg * m / s)
    }

    @Test
    fun testCompareTheSameTypesIndirect() {
        assertTrue(5/s > 4.1.Hz)

        assertTrue(20.2 * m3 / s > 4.2.Hz * m3)

        assertTrue(2.2 * kg * m / s < 4.2.Hz * kg * m)
    }

    @Test
    fun testCompareDifferentType1() {
        val v1 = 2.4.m
        val v2 = 2.4.s

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))
    }

    @Test
    fun testCompareDifferentType2() {
        val v1 = 2.4.m * kg / s
        val v2 = 2.4.s * m3 / μV

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))
    }

    @Test
    fun testBaseUnits() {
        assertEquals(Second(1.0), 1.s)
        assertEquals(1*s, 1.0.s)

        assertEquals(Metre(1.0), 1.m)
        assertEquals(2*m, 2.m)

        assertEquals(Kilogram(1.0), 1.kg)
        assertEquals(3*kg, 3.kg)

        assertEquals(Ampere(1.0), 1.A)
        assertEquals(4* A, 4.A)

        assertEquals(Kelvin(1.0), 1.K)
        assertEquals(5*K, 5.K)

        assertEquals(Mole(1.0), 1.mol)
        assertEquals(6*mol, 6.mol)

        assertEquals(Candela(1.0), 1.cd)
        assertEquals(7*cd, 7.cd)
    }

    @Test
    fun testCelsius() {
        assertEquals(12.celsius,	Kelvin(12 + 273.15))
        assertEquals(283.15, 10.celsius.value)
        assertEquals("Θ", celsius.categorySymbols())
        assertEquals("K", celsius.unitSymbols())
    }

    @Test
    fun testDerivedUnits() {
        assertEquals(T,	kg * (s `^` -2) * (A `^` -1))
        assertEquals(T,	Wb/ m2)
    }

    @Test
    fun testPrefixes() {
        val d = km - (10 `^` 9) * μm
        assertTrue(abs(d.value) < ε)
    }

    @Test
    fun testNonSiUnits() {
        //A city park has area 2.35 hectares. During a rain 1 mm of water had fallen from the sky.
        //If there was no rain, the park should be watered with water from car cisterns.
        // A car cistern can carry 4 tons of water.
        //How many cisterns are needed to achieve the same effect as in case of rain?
        //Reminder: density of watter is 1 kg/l

        val s = 2.35.ha
        val ω = s*1.mm //water volume
        val ρ = kg/ l //density of watter is 1 kg/l
        val τ = ω * ρ //common water weight of rain
        val n = τ/4.t
        assertEquals(5.875, n.value, ε)

    }

    @Test
    fun testConversion() {
        val x = 2.0.m/cm

        //How many centimeters contains 2 metres?
        assertEquals(200.0, x.value)

        //Which dimension has a metre divided in centimeter? (value is dimensionless)
        assertEquals("", x.unitSymbols())
    }
}
