package eu.sirotin.siunits.core

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith


internal class CoreTest {

    @Test
    fun testStatements1() {
        val v1 = 2.12.a/1.06.b
        assertEquals(2.0, v1.value)
        assertEquals("2.0 a/b", v1.toString())
        assertEquals("eu.sirotin.siunits.core.SiUnitProduct", v1.javaClass.name)

    }

    @Test
    fun testStatements2() {
        val v1 = 2.12.a/b
        assertEquals(2.12, v1.value)
        assertEquals("2.12 a/b", v1.toString())
        assertEquals("eu.sirotin.siunits.core.SiUnitProduct", v1.javaClass.name)

    }

    @Test
    fun testStatements3() {
        val v1 = 2.12.a/1.06.b*2.3.a
        assertEquals(4.6, v1.value)
        assertEquals("4.6 a/b", v1.toString())
        assertEquals("eu.sirotin.siunits.core.SiUnitProduct", v1.javaClass.name)

    }


    @Test
    fun testStatements4() {
        val v1 = 10*2.12.a/1.06.b
        assertEquals(20.0, v1.value)
        assertEquals("20.0 a/b", v1.toString())
        assertEquals("eu.sirotin.siunits.core.SiUnitProduct", v1.javaClass.name)

    }

    @Test
    fun testStatements5() {
        val v1 = 10*2.12.a/1.06.b
        assertEquals(20.0, v1.value)
        assertEquals("20.0 a/b", v1.toString())
        assertEquals("eu.sirotin.siunits.core.SiUnitProduct", v1.javaClass.name)

    }

    @Test
    fun testCompareTheSameType() {
        val v1 = 2.a
        val v2 = 2.999999999999999.a

        assertFalse(v1 > v2)
        assertFalse(v1 >= v2)
        assertTrue(v2 > v1)
        assertTrue(v2 >= v1)
    }

    @Test
    fun testCompareDifferentType() {
        val v1 = 2.4.a
        val v2 = 2.4.b

        //assertFalse(v1 == v2) compilation error
        //assertFalse(v1 == 2.4) compilation error

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertEquals("Compared elements have different types: 'this' is 'class eu.sirotin.siunits.core.UnitA but 'other' is 'class eu.sirotin.siunits.core.UnitB'" ,
            exception.message)

    }

    @Test
    fun testUnitAObject() {
        val v1 = 2.42.a

        assertEquals(2.42, v1.value)
        assertEquals("a", v1.description.unitSymbol)
        assertEquals("2.42 a", v1.toString())
        assertEquals("eu.sirotin.siunits.core.UnitA", v1.javaClass.name)

    }

}