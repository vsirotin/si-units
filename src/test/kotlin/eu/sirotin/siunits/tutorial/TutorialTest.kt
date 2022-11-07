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
 *  *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 */

package eu.sirotin.siunits.tutorial

import eu.sirotin.siunits.core.*
import eu.sirotin.specialunits.*
import eu.sirotin.siunits.base.*
import eu.sirotin.siunits.derived.μV
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

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
        val h = x/s
        val z = h/ mm
        assertEquals(1.0, z.value, EPS)

        //the same as statement

        assertEquals(1.0, ((20.l/(4.m * 5.m))/ mm).value, EPS)

    }




    @Test
    fun testDimensionAnalysis() {
        //With the help of the built-in function unitSymbols you can get the dimension of any object in terms of SI standard.

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
    fun testCategorySymbols() {
        //Using the built-in function categorySymbols() you can analyze dimensions
        // of physical units in "academic" manner.
        val s = 4.m * 5.m
        assertEquals("L2", s.categorySymbols())

        val x = 20.l
        assertEquals("L3", x.categorySymbols())

        val h = x/s
        assertEquals("L", h.categorySymbols())

        val y = 1.2.s
        assertEquals("T", y.categorySymbols())

        val z = x/y
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
        assertEquals("0,02 m3", x.show(format))
        val h = x/s
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
            block = { 20.l* s /(4.m + 5.m) + 2.s }
        )
        val expectedMessage = "$COMPATIBILITY_ERR_PREFIX 'm2s' and 's'"
        assertEquals(expectedMessage, exception.message!!)

    }

    @Test
    fun testErrors3() {
        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalArgumentException>(
            block = { (20.l*3.s/(4.m + 5.m)) + mm }
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

        assertTrue(20.2*m3 > 4.2*m3)

        assertTrue(2.2*kg*m/s < 4.2*kg*m/s)
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
        val v1 = 2.4.m*kg/s
        val v2 = 2.4.s*m3/ μV

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))
    }
}