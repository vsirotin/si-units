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

import eu.sirotin.kotunil.currency.*
import eu.sirotin.kotunil.base.A
import eu.sirotin.kotunil.base.Ampere
import eu.sirotin.kotunil.core.COMPATIBILITY_ERR_PREFIX
import eu.sirotin.kotunil.core.ε
import eu.sirotin.kotunil.specialunits.h
import eu.sirotin.kotunil.specialunits.ha
import eu.sirotin.kotunil.specialunits.l
import eu.sirotin.kotunil.specialunits.m2
import eu.sirotin.kotunil.specialunits.m3
import eu.sirotin.kotunil.specialunits.min
import eu.sirotin.kotunil.specialunits.t
import eu.sirotin.kotunil.specialunits.`°C`
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.specialunits.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.derived.*
import kotlin.test.Test

import kotlin.test.assertEquals
import kotlin.math.abs
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


    @Test
    fun testShow() {
        //Pretty print
        //Values of physical objects can be presented using the built-in function show
        // similar to the way they are presented in technical articles.

        val s = 4.m * 5.m
        assertEquals("20 m2", s.show("%.0f"))
        val x = 20.l
        val format = "%.2f"
        // TODO test not running with github actions
        //assertEquals("0,02 m3", x.show(format))
        val h = x / s
        assertEquals("0,001 m", h.show("%.3f"))
        val y = 3.1415927.m
        assertEquals("3,142 m", y.show("%.3f"))

    }

    //---------------Type safety
//Physical units of the same dimension can be added, added,
//divided and compared.
//If you try to do this with units of different types,
//you will get either compilation errors (for simple units) or run-time errors for complicated units.
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
        assertTrue(Second(1.0) == 1.s)
        assertTrue(1*s == 1.0.s)

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
    fun testDerivedUnits() {
        assertEquals(T,	kg * (s `^` -2) * (A `^` -1))
        assertEquals(T,	Wb/ m2)
    }

    @Test
    fun testDerivedUnitsStory() {
    //Miller family makes a trip to the nature.
    // They brought a solar panel and immediately turned on at the excursion site.
    // Solar produced 12 volts and 7 amps 2 hours.
    // Produced electricity was stored in a storage tank. Storage efficiency is 85%.
    //After that, Mrs. Miller decided to prepare the tea in boiler.
    // To prepare hot water for tea with boilers with 500 watt strength,
    // the water should be boiled for 8 min.
    //The question, is stored in memory electricity enough for that?

        val producedElectricity = 12.V * 7.A * 2.h
        val savedElectricity = producedElectricity * 85.`%`
        val neededElectricity = 0.5.kW * 8.min
        val dif = savedElectricity - neededElectricity
        assertTrue(dif > 0.W* h) //Comparison in SI-Units
        assertTrue(dif.value > 0) //Comparison dimensionless
    }

    @Test
    fun testOwnDeriveUnits() {
        //You can also define your own Derived Units.
        //Consider a not properly scientifically proven example.
        //Let's imagine that the melting speed of snow in mountains is proportional
        // to the duration and temperature above 0 grad °C. This will be our new Derived Unit.
        //If current snow thickness is 10 cm, what proportion is melted in 5 hours at 20 degrees Celsius?
        //The code below also shows the nice side of Kotlin - a possibility to use Unicode symbols,
        // e.g. Greek letters.

        val ζ = 10.μm/(h *K) //melting speed
        val τ = 10.cm
        val t = 20.`°C`
        val ξ = 5.h*(t - 0.`°C`)
        val σ = ζ*ξ //melting height
        val α = σ/τ //melting ration
        assertEquals(1.0, α.`as %`, ε) //α.`as %` - Ratio presented in percents
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
    fun testCurrency() {
        //A householder has decided to cover the floor with tiles in one of his rooms.
        // He has bought 16,5 sqm of tiles for 52 €/sqm.
        //How much does he pay for his tiles?

        val prise = 52.`€`/ m2
        val s = 16.5* m2
        val cost = s*prise
        assertEquals("858,00 EUR", cost.show("%.2f").replace(".", ","))
        assertEquals("EUR", cost.unitSymbols())
    }

    @Test
    fun testThing() {
        //Sometimes you need an abstract unit like "thing". For example:
        //Every good guy has 30 different things per liter in his pocket.
        //Jan is a good guy and his pocket is 0.3 liters big.
        //How many things can his mom find in Jan's pocket?

        val p = 30.`#`/l
        val n = 0.3.l * p

        assertEquals("9 #", n.show("%.0f"))
        assertEquals("#", n.unitSymbols())
    }

}
