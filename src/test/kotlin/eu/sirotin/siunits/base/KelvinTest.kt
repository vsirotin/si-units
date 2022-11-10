        
package eu.sirotin.siunits.base

import eu.sirotin.siunits.core.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class KelvinTest {

    @Test
    fun testKelvinMainTest() {
        assertEquals(Kelvin(1.0), K)
        assertEquals(1.K , K)
    }
              
    @Test
    fun testKelvinYKTest() {
        val myPow = 10.0.pow(24)
        assertEquals(myPow * Kelvin(1.0), 1.YK)
        assertEquals(myPow * Kelvin(1.0), 1.yottakelvin)
        assertEquals(1.K.YK , K.value/myPow, EPS)
        assertEquals(1.K.yottakelvin , K.value/myPow, EPS)
        assertEquals(1.YK , YK)
        assertEquals(yottakelvin , YK)
    }    
    
          
    @Test
    fun testKelvinZKTest() {
        val myPow = 10.0.pow(21)
        assertEquals(myPow * Kelvin(1.0), 1.ZK)
        assertEquals(myPow * Kelvin(1.0), 1.zettakelvin)
        assertEquals(1.K.ZK , K.value/myPow, EPS)
        assertEquals(1.K.zettakelvin , K.value/myPow, EPS)
        assertEquals(1.ZK , ZK)
        assertEquals(zettakelvin , ZK)
    }    
    
          
    @Test
    fun testKelvinEKTest() {
        val myPow = 10.0.pow(18)
        assertEquals(myPow * Kelvin(1.0), 1.EK)
        assertEquals(myPow * Kelvin(1.0), 1.exakelvin)
        assertEquals(1.K.EK , K.value/myPow, EPS)
        assertEquals(1.K.exakelvin , K.value/myPow, EPS)
        assertEquals(1.EK , EK)
        assertEquals(exakelvin , EK)
    }    
    
          
    @Test
    fun testKelvinPKTest() {
        val myPow = 10.0.pow(15)
        assertEquals(myPow * Kelvin(1.0), 1.PK)
        assertEquals(myPow * Kelvin(1.0), 1.petakelvin)
        assertEquals(1.K.PK , K.value/myPow, EPS)
        assertEquals(1.K.petakelvin , K.value/myPow, EPS)
        assertEquals(1.PK , PK)
        assertEquals(petakelvin , PK)
    }    
    
          
    @Test
    fun testKelvinTKTest() {
        val myPow = 10.0.pow(12)
        assertEquals(myPow * Kelvin(1.0), 1.TK)
        assertEquals(myPow * Kelvin(1.0), 1.terakelvin)
        assertEquals(1.K.TK , K.value/myPow, EPS)
        assertEquals(1.K.terakelvin , K.value/myPow, EPS)
        assertEquals(1.TK , TK)
        assertEquals(terakelvin , TK)
    }    
    
          
    @Test
    fun testKelvinGKTest() {
        val myPow = 10.0.pow(9)
        assertEquals(myPow * Kelvin(1.0), 1.GK)
        assertEquals(myPow * Kelvin(1.0), 1.gigakelvin)
        assertEquals(1.K.GK , K.value/myPow, EPS)
        assertEquals(1.K.gigakelvin , K.value/myPow, EPS)
        assertEquals(1.GK , GK)
        assertEquals(gigakelvin , GK)
    }    
    
          
    @Test
    fun testKelvinMKTest() {
        val myPow = 10.0.pow(6)
        assertEquals(myPow * Kelvin(1.0), 1.MK)
        assertEquals(myPow * Kelvin(1.0), 1.megakelvin)
        assertEquals(1.K.MK , K.value/myPow, EPS)
        assertEquals(1.K.megakelvin , K.value/myPow, EPS)
        assertEquals(1.MK , MK)
        assertEquals(megakelvin , MK)
    }    
    
          
    @Test
    fun testKelvinK1KTest() {
        val myPow = 10.0.pow(3)
        assertEquals(myPow * Kelvin(1.0), 1.kK)
        assertEquals(myPow * Kelvin(1.0), 1.kilokelvin)
        assertEquals(1.K.kK , K.value/myPow, EPS)
        assertEquals(1.K.kilokelvin , K.value/myPow, EPS)
        assertEquals(1.kK , kK)
        assertEquals(kilokelvin , kK)
    }    
    
          
    @Test
    fun testKelvinH1KTest() {
        val myPow = 10.0.pow(2)
        assertEquals(myPow * Kelvin(1.0), 1.hK)
        assertEquals(myPow * Kelvin(1.0), 1.hectokelvin)
        assertEquals(1.K.hK , K.value/myPow, EPS)
        assertEquals(1.K.hectokelvin , K.value/myPow, EPS)
        assertEquals(1.hK , hK)
        assertEquals(hectokelvin , hK)
    }    
    
          
    @Test
    fun testKelvinDA1KTest() {
        val myPow = 10.0.pow(1)
        assertEquals(myPow * Kelvin(1.0), 1.daK)
        assertEquals(myPow * Kelvin(1.0), 1.decakelvin)
        assertEquals(1.K.daK , K.value/myPow, EPS)
        assertEquals(1.K.decakelvin , K.value/myPow, EPS)
        assertEquals(1.daK , daK)
        assertEquals(decakelvin , daK)
    }    
    
          
    @Test
    fun testKelvinD1KTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(myPow * Kelvin(1.0), 1.dK)
        assertEquals(myPow * Kelvin(1.0), 1.decikelvin)
        assertEquals(1.K.dK , K.value/myPow, EPS)
        assertEquals(1.K.decikelvin , K.value/myPow, EPS)
        assertEquals(1.dK , dK)
        assertEquals(decikelvin , dK)
    }    
    
          
    @Test
    fun testKelvinC1KTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(myPow * Kelvin(1.0), 1.cK)
        assertEquals(myPow * Kelvin(1.0), 1.centikelvin)
        assertEquals(1.K.cK , K.value/myPow, EPS)
        assertEquals(1.K.centikelvin , K.value/myPow, EPS)
        assertEquals(1.cK , cK)
        assertEquals(centikelvin , cK)
    }    
    
          
    @Test
    fun testKelvinM1KTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(myPow * Kelvin(1.0), 1.mK)
        assertEquals(myPow * Kelvin(1.0), 1.millikelvin)
        assertEquals(1.K.mK , K.value/myPow, EPS)
        assertEquals(1.K.millikelvin , K.value/myPow, EPS)
        assertEquals(1.mK , mK)
        assertEquals(millikelvin , mK)
    }    
    
          
    @Test
    fun testKelvinΜ1KTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(myPow * Kelvin(1.0), 1.μK)
        assertEquals(myPow * Kelvin(1.0), 1.microkelvin)
        assertEquals(1.K.μK , K.value/myPow, EPS)
        assertEquals(1.K.microkelvin , K.value/myPow, EPS)
        assertEquals(1.μK , μK)
        assertEquals(microkelvin , μK)
    }    
    
          
    @Test
    fun testKelvinN1KTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(myPow * Kelvin(1.0), 1.nK)
        assertEquals(myPow * Kelvin(1.0), 1.nanokelvin)
        assertEquals(1.K.nK , K.value/myPow, EPS)
        assertEquals(1.K.nanokelvin , K.value/myPow, EPS)
        assertEquals(1.nK , nK)
        assertEquals(nanokelvin , nK)
    }    
    
          
    @Test
    fun testKelvinP1KTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(myPow * Kelvin(1.0), 1.pK)
        assertEquals(myPow * Kelvin(1.0), 1.picokelvin)
        assertEquals(1.K.pK , K.value/myPow, EPS)
        assertEquals(1.K.picokelvin , K.value/myPow, EPS)
        assertEquals(1.pK , pK)
        assertEquals(picokelvin , pK)
    }    
    
          
    @Test
    fun testKelvinF1KTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(myPow * Kelvin(1.0), 1.fK)
        assertEquals(myPow * Kelvin(1.0), 1.femtokelvin)
        assertEquals(1.K.fK , K.value/myPow, EPS)
        assertEquals(1.K.femtokelvin , K.value/myPow, EPS)
        assertEquals(1.fK , fK)
        assertEquals(femtokelvin , fK)
    }    
    
          
    @Test
    fun testKelvinA1KTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(myPow * Kelvin(1.0), 1.aK)
        assertEquals(myPow * Kelvin(1.0), 1.attokelvin)
        assertEquals(1.K.aK , K.value/myPow, EPS)
        assertEquals(1.K.attokelvin , K.value/myPow, EPS)
        assertEquals(1.aK , aK)
        assertEquals(attokelvin , aK)
    }    
    
          
    @Test
    fun testKelvinZ1KTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(myPow * Kelvin(1.0), 1.zK)
        assertEquals(myPow * Kelvin(1.0), 1.zeptokelvin)
        assertEquals(1.K.zK , K.value/myPow, EPS)
        assertEquals(1.K.zeptokelvin , K.value/myPow, EPS)
        assertEquals(1.zK , zK)
        assertEquals(zeptokelvin , zK)
    }    
    
          
    @Test
    fun testKelvinY1KTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(myPow * Kelvin(1.0), 1.yK)
        assertEquals(myPow * Kelvin(1.0), 1.yoctokelvin)
        assertEquals(1.K.yK , K.value/myPow, EPS)
        assertEquals(1.K.yoctokelvin , K.value/myPow, EPS)
        assertEquals(1.yK , yK)
        assertEquals(yoctokelvin , yK)
    }    
    }