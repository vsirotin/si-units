        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class HertzTest {

    @Test
    fun testHertzMainTest1() {
        assertEquals(1.Hz , Hz)
    }
    
    @Test
    fun testHertzMainTest2() {
        assertEquals(12.3.Hz , Hertz(12.3))
    }
    
    @Test
    fun testHertzMainTest3() {
        val x: Hertz = 12.3.Hz
        assertEquals(x , Hertz(12.3))
    }
    
    @Test
    fun testHertzMainTest4() {
        val x: Hertz = Hz
        assertEquals(x , Hertz(1.0))
    }
              
    @Test
    fun testHertzQHzTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QHz.value, Hz.value*myPow, EPS)
        assertEquals(1.quettahertz.value, Hz.value*myPow)
        assertEquals(1.QHz , QHz)
        assertEquals(quettahertz, QHz)
    }    
    
          
    @Test
    fun testHertzRHzTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RHz.value, Hz.value*myPow, EPS)
        assertEquals(1.ronnahertz.value, Hz.value*myPow)
        assertEquals(1.RHz , RHz)
        assertEquals(ronnahertz, RHz)
    }    
    
          
    @Test
    fun testHertzYHzTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YHz.value, Hz.value*myPow, EPS)
        assertEquals(1.yottahertz.value, Hz.value*myPow)
        assertEquals(1.YHz , YHz)
        assertEquals(yottahertz, YHz)
    }    
    
          
    @Test
    fun testHertzZHzTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZHz.value, Hz.value*myPow, EPS)
        assertEquals(1.zettahertz.value, Hz.value*myPow)
        assertEquals(1.ZHz , ZHz)
        assertEquals(zettahertz, ZHz)
    }    
    
          
    @Test
    fun testHertzEHzTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EHz.value, Hz.value*myPow, EPS)
        assertEquals(1.exahertz.value, Hz.value*myPow)
        assertEquals(1.EHz , EHz)
        assertEquals(exahertz, EHz)
    }    
    
          
    @Test
    fun testHertzPHzTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PHz.value, Hz.value*myPow, EPS)
        assertEquals(1.petahertz.value, Hz.value*myPow)
        assertEquals(1.PHz , PHz)
        assertEquals(petahertz, PHz)
    }    
    
          
    @Test
    fun testHertzTHzTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.THz.value, Hz.value*myPow, EPS)
        assertEquals(1.terahertz.value, Hz.value*myPow)
        assertEquals(1.THz , THz)
        assertEquals(terahertz, THz)
    }    
    
          
    @Test
    fun testHertzGHzTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GHz.value, Hz.value*myPow, EPS)
        assertEquals(1.gigahertz.value, Hz.value*myPow)
        assertEquals(1.GHz , GHz)
        assertEquals(gigahertz, GHz)
    }    
    
          
    @Test
    fun testHertzMHzTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MHz.value, Hz.value*myPow, EPS)
        assertEquals(1.megahertz.value, Hz.value*myPow)
        assertEquals(1.MHz , MHz)
        assertEquals(megahertz, MHz)
    }    
    
          
    @Test
    fun testHertzK1HzTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kHz.value, Hz.value*myPow, EPS)
        assertEquals(1.kilohertz.value, Hz.value*myPow)
        assertEquals(1.kHz , kHz)
        assertEquals(kilohertz, kHz)
    }    
    
          
    @Test
    fun testHertzH1HzTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hHz.value, Hz.value*myPow, EPS)
        assertEquals(1.hectohertz.value, Hz.value*myPow)
        assertEquals(1.hHz , hHz)
        assertEquals(hectohertz, hHz)
    }    
    
          
    @Test
    fun testHertzDA1HzTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daHz.value, Hz.value*myPow, EPS)
        assertEquals(1.decahertz.value, Hz.value*myPow)
        assertEquals(1.daHz , daHz)
        assertEquals(decahertz, daHz)
    }    
    
          
    @Test
    fun testHertzD1HzTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dHz.value, Hz.value*myPow, EPS)
        assertEquals(1.decihertz.value, Hz.value*myPow)
        assertEquals(1.dHz , dHz)
        assertEquals(decihertz, dHz)
    }    
    
          
    @Test
    fun testHertzC1HzTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cHz.value, Hz.value*myPow, EPS)
        assertEquals(1.centihertz.value, Hz.value*myPow)
        assertEquals(1.cHz , cHz)
        assertEquals(centihertz, cHz)
    }    
    
          
    @Test
    fun testHertzM1HzTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mHz.value, Hz.value*myPow, EPS)
        assertEquals(1.millihertz.value, Hz.value*myPow)
        assertEquals(1.mHz , mHz)
        assertEquals(millihertz, mHz)
    }    
    
          
    @Test
    fun testHertzΜ1HzTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μHz.value, Hz.value*myPow, EPS)
        assertEquals(1.microhertz.value, Hz.value*myPow)
        assertEquals(1.μHz , μHz)
        assertEquals(microhertz, μHz)
    }    
    
          
    @Test
    fun testHertzN1HzTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nHz.value, Hz.value*myPow, EPS)
        assertEquals(1.nanohertz.value, Hz.value*myPow)
        assertEquals(1.nHz , nHz)
        assertEquals(nanohertz, nHz)
    }    
    
          
    @Test
    fun testHertzP1HzTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pHz.value, Hz.value*myPow, EPS)
        assertEquals(1.picohertz.value, Hz.value*myPow)
        assertEquals(1.pHz , pHz)
        assertEquals(picohertz, pHz)
    }    
    
          
    @Test
    fun testHertzF1HzTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fHz.value, Hz.value*myPow, EPS)
        assertEquals(1.femtohertz.value, Hz.value*myPow)
        assertEquals(1.fHz , fHz)
        assertEquals(femtohertz, fHz)
    }    
    
          
    @Test
    fun testHertzA1HzTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aHz.value, Hz.value*myPow, EPS)
        assertEquals(1.attohertz.value, Hz.value*myPow)
        assertEquals(1.aHz , aHz)
        assertEquals(attohertz, aHz)
    }    
    
          
    @Test
    fun testHertzZ1HzTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zHz.value, Hz.value*myPow, EPS)
        assertEquals(1.zeptohertz.value, Hz.value*myPow)
        assertEquals(1.zHz , zHz)
        assertEquals(zeptohertz, zHz)
    }    
    
          
    @Test
    fun testHertzY1HzTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yHz.value, Hz.value*myPow, EPS)
        assertEquals(1.yoctohertz.value, Hz.value*myPow)
        assertEquals(1.yHz , yHz)
        assertEquals(yoctohertz, yHz)
    }    
    
          
    @Test
    fun testHertzR1HzTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rHz.value, Hz.value*myPow, EPS)
        assertEquals(1.rontohertz.value, Hz.value*myPow)
        assertEquals(1.rHz , rHz)
        assertEquals(rontohertz, rHz)
    }    
    
          
    @Test
    fun testHertzQ1HzTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qHz.value, Hz.value*myPow, EPS)
        assertEquals(1.quectohertz.value, Hz.value*myPow)
        assertEquals(1.qHz , qHz)
        assertEquals(quectohertz, qHz)
    }    
    }