package eu.sirotin.kotunil.physics

import eu.sirotin.kotunil.EPS

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.derived.*
import eu.sirotin.kotunil.specialunits.g
import eu.sirotin.kotunil.specialunits.l
import eu.sirotin.kotunil.specialunits.m2
import eu.sirotin.kotunil.specialunits.m3
import kotlin.test.*


internal class PhysicsTest {

    @Test
    fun testDerivedUnits() {
        //Based on Table "SI derived units with special names and symbols" from Wikipedia-Article
        // 'https://en.wikipedia.org/wiki/International_System_of_Units'

        //herz
        assertEquals(Hz, 1 / s)

        //newton
        assertEquals(N, kg * m * (s `^` -2))
        //pascal
        assertEquals(Pa,	kg * (m `^` -1) * (s `^` -2))
        assertEquals(Pa,	N / m2)
        //joule
        assertEquals(J,	kg * m2 * (s `^` -2))
        assertEquals(N * m, Pa * m3)
        //watt
        assertEquals(W,	kg * m2 * (s `^` -3))
        assertEquals(W,	J/s)
        //coulomb
        assertEquals(C,	s * A)
        //volt
        assertEquals(V,	kg * m2 * (s `^` -3) * (A `^` -1))
        assertEquals(W/A, J/C)
        //farad
        assertEquals(F,	(kg `^` -1) * (m `^` -2) * (s `^` 4) * (A `^` 2))
        assertEquals(C/V, (C `^` 2)/J)
        //ohm
        assertEquals(Ω,	kg * m2 * (s `^` -3) * (A `^` -2))
        assertEquals(V/A, J * s/(C `^` 2))
        //siemens
        assertEquals(S,	(kg `^` -1) * (m `^` -2) * (s `^` 3) *(A `^` 2))
        assertEquals(S,	Ω `^` -1)
        //weber
        assertEquals(Wb,	kg * m2 * (s `^` -2) * (A `^` -1))
        assertEquals(Wb,	V * s)
        //tesla
        assertEquals(T,	kg * (s `^` -2) * (A `^` -1))
        assertEquals(T,	Wb/ m2)
        //henry
        assertEquals(H,	kg * m2 * (s `^` -2) * (A `^` -2))
        assertEquals(H,	Wb/A)
        //lumen
        assertEquals(lm,	(cd `^` 1) * sr)
        //lux
        assertEquals(lx,	cd * sr * (m `^` -2))
        assertEquals(lx,	lm/ m2)
        //becquerel
        assertEquals(Bq,	(s `^` -1))
        //gray
        assertEquals(Gy,	m2 * (s `^` -2))
        assertEquals(Gy,	J/kg)
        //sievert
        assertEquals(Sv,	m2 * (s `^` -2))
        assertEquals(Sv,	J/kg)
        //katal
        assertEquals(kat,	mol * (s `^` -1))


    }

    @Test
    fun testStatements1() {
        val v1 = 2.12.m/1.06.s
        assertEquals(2.0, v1.value)
     }

    @Test
    fun testStatements2() {
        val v1 = 2.12.m/ s
        assertEquals(2.12, v1.value)
        assertEquals("m/s", v1.unitSymbols())
    }

    @Test
    fun testStatements3() {
        val v1 = 2.12.m/1.06.s*2.3.m
        assertEquals(4.6, v1.value)
        assertEquals("m2/s", v1.unitSymbols())

    }
    
    @Test
    fun testStatements4() {
        val v1 = 10*2.12.m/1.06.s
        assertEquals(20.0, v1.value)
        assertEquals("m/s", v1.unitSymbols())
    }

    @Test
    fun testCompareTheSameType() {
        val v1 = 2.m
        val v2 = 2.999999999999999.m

        assertFalse(v1 > v2)
        assertFalse(v1 >= v2)
        assertTrue(v2 > v1)
        assertTrue(v2 >= v1)
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

    @Test
    fun testMeterObject() {
        val v1 = 2.42.m

        assertEquals(2.42, v1.value)
        assertEquals("m", v1.unitSymbols())
    }

    @Test
    fun testMeterToKilometer() {
        val d = 50.m
        val x = d.km
        assertEquals(0.05, x, EPS)
    }

    @Test
    fun testGramToKilogram() {
        assertEquals(100.g, 0.1.kg)
        assertEquals(100*g, 0.1.kg)
    }

    @Test
    fun testPrefixes1() {
        assertEquals(100.cm, 1.m)
        val d = 1.dm
        val d3= d.pow(3)
        assertEquals(d3.value, l.value, EPS)
    }

    @Test
    fun testPrefixes2() {
        assertEquals(10.mm, 1.cm)
        assertEquals(1000.mm.value, 1.m.value, EPS)
    }

    @Test
    fun testPrefixes3() {
        assertEquals(1.kA, 1000.A)
        assertEquals(1000.mA.value, 1.A.value, EPS)
    }

    @Test
    fun testPrefixes4() {
        assertEquals(1.kW, 1000.W)
        assertEquals(10.kW, 10000.W)
        assertEquals(1.kW, 1000*W)
        assertEquals(1000.mW.value, 1.W.value, EPS)
    }

    @Test
    fun testCompare() {
        val v1 = 1.qm //10^-30 of metre
        val v2 = 1.0001.qm //10^-30 of metre
        assertTrue(v2 > v1 ) //because relative difference is large

        val v3 = 1.m + v1
        assertEquals(v3, 1.m) //because relative difference is small
    }

}