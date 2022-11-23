        
package eu.sirotin.siunits.base

import eu.sirotin.siunits.EPS
import eu.sirotin.siunits.core.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class SecondTest {

    @Test
    fun testSecondMainTest() {
        assertEquals(Second(1.0), s)
        assertEquals(1.s , s)
    }
              
    @Test
    fun testSecondQsTest() {
        val myPow = 10.0.pow(30)
        assertEquals(myPow * Second(1.0), 1.Qs)
        assertEquals(myPow * Second(1.0), 1.quettasecond)
        assertEquals(1.s.Qs , s.value/myPow, EPS)
        assertEquals(1.s.quettasecond , s.value/myPow, EPS)
        assertEquals(1.Qs , Qs)
        assertEquals(quettasecond , Qs)
    }    
    
          
    @Test
    fun testSecondRsTest() {
        val myPow = 10.0.pow(27)
        assertEquals(myPow * Second(1.0), 1.Rs)
        assertEquals(myPow * Second(1.0), 1.ronnasecond)
        assertEquals(1.s.Rs , s.value/myPow, EPS)
        assertEquals(1.s.ronnasecond , s.value/myPow, EPS)
        assertEquals(1.Rs , Rs)
        assertEquals(ronnasecond , Rs)
    }    
    
          
    @Test
    fun testSecondYsTest() {
        val myPow = 10.0.pow(24)
        assertEquals(myPow * Second(1.0), 1.Ys)
        assertEquals(myPow * Second(1.0), 1.yottasecond)
        assertEquals(1.s.Ys , s.value/myPow, EPS)
        assertEquals(1.s.yottasecond , s.value/myPow, EPS)
        assertEquals(1.Ys , Ys)
        assertEquals(yottasecond , Ys)
    }    
    
          
    @Test
    fun testSecondZsTest() {
        val myPow = 10.0.pow(21)
        assertEquals(myPow * Second(1.0), 1.Zs)
        assertEquals(myPow * Second(1.0), 1.zettasecond)
        assertEquals(1.s.Zs , s.value/myPow, EPS)
        assertEquals(1.s.zettasecond , s.value/myPow, EPS)
        assertEquals(1.Zs , Zs)
        assertEquals(zettasecond , Zs)
    }    
    
          
    @Test
    fun testSecondEsTest() {
        val myPow = 10.0.pow(18)
        assertEquals(myPow * Second(1.0), 1.Es)
        assertEquals(myPow * Second(1.0), 1.exasecond)
        assertEquals(1.s.Es , s.value/myPow, EPS)
        assertEquals(1.s.exasecond , s.value/myPow, EPS)
        assertEquals(1.Es , Es)
        assertEquals(exasecond , Es)
    }    
    
          
    @Test
    fun testSecondPsTest() {
        val myPow = 10.0.pow(15)
        assertEquals(myPow * Second(1.0), 1.Ps)
        assertEquals(myPow * Second(1.0), 1.petasecond)
        assertEquals(1.s.Ps , s.value/myPow, EPS)
        assertEquals(1.s.petasecond , s.value/myPow, EPS)
        assertEquals(1.Ps , Ps)
        assertEquals(petasecond , Ps)
    }    
    
          
    @Test
    fun testSecondTsTest() {
        val myPow = 10.0.pow(12)
        assertEquals(myPow * Second(1.0), 1.Ts)
        assertEquals(myPow * Second(1.0), 1.terasecond)
        assertEquals(1.s.Ts , s.value/myPow, EPS)
        assertEquals(1.s.terasecond , s.value/myPow, EPS)
        assertEquals(1.Ts , Ts)
        assertEquals(terasecond , Ts)
    }    
    
          
    @Test
    fun testSecondGsTest() {
        val myPow = 10.0.pow(9)
        assertEquals(myPow * Second(1.0), 1.Gs)
        assertEquals(myPow * Second(1.0), 1.gigasecond)
        assertEquals(1.s.Gs , s.value/myPow, EPS)
        assertEquals(1.s.gigasecond , s.value/myPow, EPS)
        assertEquals(1.Gs , Gs)
        assertEquals(gigasecond , Gs)
    }    
    
          
    @Test
    fun testSecondMsTest() {
        val myPow = 10.0.pow(6)
        assertEquals(myPow * Second(1.0), 1.Ms)
        assertEquals(myPow * Second(1.0), 1.megasecond)
        assertEquals(1.s.Ms , s.value/myPow, EPS)
        assertEquals(1.s.megasecond , s.value/myPow, EPS)
        assertEquals(1.Ms , Ms)
        assertEquals(megasecond , Ms)
    }    
    
          
    @Test
    fun testSecondK1sTest() {
        val myPow = 10.0.pow(3)
        assertEquals(myPow * Second(1.0), 1.ks)
        assertEquals(myPow * Second(1.0), 1.kilosecond)
        assertEquals(1.s.ks , s.value/myPow, EPS)
        assertEquals(1.s.kilosecond , s.value/myPow, EPS)
        assertEquals(1.ks , ks)
        assertEquals(kilosecond , ks)
    }    
    
          
    @Test
    fun testSecondH1sTest() {
        val myPow = 10.0.pow(2)
        assertEquals(myPow * Second(1.0), 1.hs)
        assertEquals(myPow * Second(1.0), 1.hectosecond)
        assertEquals(1.s.hs , s.value/myPow, EPS)
        assertEquals(1.s.hectosecond , s.value/myPow, EPS)
        assertEquals(1.hs , hs)
        assertEquals(hectosecond , hs)
    }    
    
          
    @Test
    fun testSecondDA1sTest() {
        val myPow = 10.0.pow(1)
        assertEquals(myPow * Second(1.0), 1.das)
        assertEquals(myPow * Second(1.0), 1.decasecond)
        assertEquals(1.s.das , s.value/myPow, EPS)
        assertEquals(1.s.decasecond , s.value/myPow, EPS)
        assertEquals(1.das , das)
        assertEquals(decasecond , das)
    }    
    
          
    @Test
    fun testSecondD1sTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(myPow * Second(1.0), 1.ds)
        assertEquals(myPow * Second(1.0), 1.decisecond)
        assertEquals(1.s.ds , s.value/myPow, EPS)
        assertEquals(1.s.decisecond , s.value/myPow, EPS)
        assertEquals(1.ds , ds)
        assertEquals(decisecond , ds)
    }    
    
          
    @Test
    fun testSecondC1sTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(myPow * Second(1.0), 1.cs)
        assertEquals(myPow * Second(1.0), 1.centisecond)
        assertEquals(1.s.cs , s.value/myPow, EPS)
        assertEquals(1.s.centisecond , s.value/myPow, EPS)
        assertEquals(1.cs , cs)
        assertEquals(centisecond , cs)
    }    
    
          
    @Test
    fun testSecondM1sTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(myPow * Second(1.0), 1.ms)
        assertEquals(myPow * Second(1.0), 1.millisecond)
        assertEquals(1.s.ms , s.value/myPow, EPS)
        assertEquals(1.s.millisecond , s.value/myPow, EPS)
        assertEquals(1.ms , ms)
        assertEquals(millisecond , ms)
    }    
    
          
    @Test
    fun testSecondΜ1sTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(myPow * Second(1.0), 1.μs)
        assertEquals(myPow * Second(1.0), 1.microsecond)
        assertEquals(1.s.μs , s.value/myPow, EPS)
        assertEquals(1.s.microsecond , s.value/myPow, EPS)
        assertEquals(1.μs , μs)
        assertEquals(microsecond , μs)
    }    
    
          
    @Test
    fun testSecondN1sTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(myPow * Second(1.0), 1.ns)
        assertEquals(myPow * Second(1.0), 1.nanosecond)
        assertEquals(1.s.ns , s.value/myPow, EPS)
        assertEquals(1.s.nanosecond , s.value/myPow, EPS)
        assertEquals(1.ns , ns)
        assertEquals(nanosecond , ns)
    }    
    
          
    @Test
    fun testSecondP1sTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(myPow * Second(1.0), 1.ps)
        assertEquals(myPow * Second(1.0), 1.picosecond)
        assertEquals(1.s.ps , s.value/myPow, EPS)
        assertEquals(1.s.picosecond , s.value/myPow, EPS)
        assertEquals(1.ps , ps)
        assertEquals(picosecond , ps)
    }    
    
          
    @Test
    fun testSecondF1sTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(myPow * Second(1.0), 1.fs)
        assertEquals(myPow * Second(1.0), 1.femtosecond)
        assertEquals(1.s.fs , s.value/myPow, EPS)
        assertEquals(1.s.femtosecond , s.value/myPow, EPS)
        assertEquals(1.fs , fs)
        assertEquals(femtosecond , fs)
    }    
    

          
    @Test
    fun testSecondZ1sTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(myPow * Second(1.0), 1.zs)
        assertEquals(myPow * Second(1.0), 1.zeptosecond)
        assertEquals(1.s.zs , s.value/myPow, EPS)
        assertEquals(1.s.zeptosecond , s.value/myPow, EPS)
        assertEquals(1.zs , zs)
        assertEquals(zeptosecond , zs)
    }    
    
          
    @Test
    fun testSecondY1sTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(myPow * Second(1.0), 1.ys)
        assertEquals(myPow * Second(1.0), 1.yoctosecond)
        assertEquals(1.s.ys , s.value/myPow, EPS)
        assertEquals(1.s.yoctosecond , s.value/myPow, EPS)
        assertEquals(1.ys , ys)
        assertEquals(yoctosecond , ys)
    }    
    
          
    @Test
    fun testSecondR1sTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(myPow * Second(1.0), 1.rs)
        assertEquals(myPow * Second(1.0), 1.rontosecond)
        assertEquals(1.s.rs , s.value/myPow, EPS)
        assertEquals(1.s.rontosecond , s.value/myPow, EPS)
        assertEquals(1.rs , rs)
        assertEquals(rontosecond , rs)
    }    
    
          
    @Test
    fun testSecondQ1sTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(myPow * Second(1.0), 1.qs)
        assertEquals(myPow * Second(1.0), 1.quectosecond)
        assertEquals(1.s.qs , s.value/myPow, EPS)
        assertEquals(1.s.quectosecond , s.value/myPow, EPS)
        assertEquals(1.qs , qs)
        assertEquals(quectosecond , qs)
    }    
    }