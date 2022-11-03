package eu.sirotin.siunits.physics

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.siunits.derived.*

private const val EXPECTED_CLASS = "eu.sirotin.siunits.core.Expression"

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
        assertEquals(T,	Wb/m2)
        //henry
        assertEquals(H,	kg * m2 * (s `^` -2) * (A `^` -2))
        assertEquals(H,	Wb/A)
        //lumen
        assertEquals(lm,	(cd `^` 1) * sr)
        //lux
        assertEquals(lx,	cd * sr * (m `^` -2))
        assertEquals(lx,	lm/m2)
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
        assertEquals("2.0 m/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements2() {
        val v1 = 2.12.m/ s
        assertEquals(2.12, v1.value)
        assertEquals("2.12 m/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements3() {
        val v1 = 2.12.m/1.06.s*2.3.m
        assertEquals(4.6, v1.value)
        assertEquals("4.6 m2/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }


    @Test
    fun testStatements4() {
        val v1 = 10*2.12.m/1.06.s
        assertEquals(20.0, v1.value)
        assertEquals("20.0 m/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

    }

    @Test
    fun testStatements5() {
        val v1 = 10*2.12.m/1.06.s
        assertEquals(20.0, v1.value)
        assertEquals("20.0 m/s", v1.toString())
        assertEquals(EXPECTED_CLASS, v1.javaClass.name)

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
        assertEquals("m", v1.description.unitSymbol)
        assertEquals("2.42 m", v1.toString())
        assertEquals("eu.sirotin.siunits.base.Metre", v1.javaClass.name)

    }

}