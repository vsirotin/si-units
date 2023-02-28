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

import eu.sirotin.kotunil.EPS
import eu.sirotin.kotunil.base.A
import eu.sirotin.kotunil.base.K
import eu.sirotin.kotunil.base.cm
import eu.sirotin.kotunil.base.μm
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.core.minus
import eu.sirotin.kotunil.core.times
import eu.sirotin.kotunil.core.ε
//import eu.sirotin.kotunil.currency.`€`
import eu.sirotin.kotunil.derived.V
import eu.sirotin.kotunil.derived.W
import eu.sirotin.kotunil.derived.kW
import eu.sirotin.kotunil.specialunits.`#`
import eu.sirotin.kotunil.specialunits.`%`
import eu.sirotin.kotunil.specialunits.`as %`
import eu.sirotin.kotunil.specialunits.h
import eu.sirotin.kotunil.specialunits.l
import eu.sirotin.kotunil.specialunits.m2
import eu.sirotin.kotunil.specialunits.min
import eu.sirotin.kotunil.specialunits.`°C`
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


internal class TutorialTestJvm {


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
        val t = 20.`°C`()
        val ξ = 5.h*(t - 0.`°C`())
        val σ = ζ*ξ //melting height
        val α = σ/τ //melting ration
        assertEquals(1.0, α.`as %`, ε) //α.`as %` - Ratio presented in percents
    }

    @Test
    fun testCurrency() {
        //A householder has decided to cover the floor with tiles in one of his rooms.
        // He has bought 16,5 sqm of tiles for 52 €/sqm.
        //How much does he pay for his tiles?

        // TODO activate after properly implementation of currencies.
        //val prise = 52.`€`/ m2
        //val s = 16.5* m2
        //val cost = s*prise
        //assertEquals("858,00 EUR", cost.show("%.2f").replace(".", ","))
        //assertEquals("EUR", cost.unitSymbols())
    }

    @Test
    fun testThing() {
        //Sometimes you need an abstract unit like "thing". For example:
        //Every good guy has 30 different things per liter in his pocket.
        //Jan is a good guy and his pocket is 0.3 liters big.
        //How many things can his mom find in Jan's pocket?

        val p = 30.`#`/l
        val n = 0.3.l * p

        assertEquals(9.0, n.value, EPS)
        assertEquals("#", n.unitSymbols())
    }

}
