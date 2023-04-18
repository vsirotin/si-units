        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class RadianTest {

    @Test
    fun testRadianMainTest1() {
        assertEquals(1.rad , rad)
    }
    
     @Test
    fun testRadianMainTest2() {
        assertEquals(12.3.rad , Radian(12.3).expression)
    }
              
    @Test
    fun testRadianQradTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.Qrad.value, rad.value*myPow, EPS)
        assertEquals(1.quettaradian.value, rad.value*myPow)
        assertEquals(1.Qrad , Qrad)
        assertEquals(quettaradian, Qrad)
    }    
    
          
    @Test
    fun testRadianRradTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.Rrad.value, rad.value*myPow, EPS)
        assertEquals(1.ronnaradian.value, rad.value*myPow)
        assertEquals(1.Rrad , Rrad)
        assertEquals(ronnaradian, Rrad)
    }    
    
          
    @Test
    fun testRadianYradTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.Yrad.value, rad.value*myPow, EPS)
        assertEquals(1.yottaradian.value, rad.value*myPow)
        assertEquals(1.Yrad , Yrad)
        assertEquals(yottaradian, Yrad)
    }    
    
          
    @Test
    fun testRadianZradTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.Zrad.value, rad.value*myPow, EPS)
        assertEquals(1.zettaradian.value, rad.value*myPow)
        assertEquals(1.Zrad , Zrad)
        assertEquals(zettaradian, Zrad)
    }    
    
          
    @Test
    fun testRadianEradTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.Erad.value, rad.value*myPow, EPS)
        assertEquals(1.exaradian.value, rad.value*myPow)
        assertEquals(1.Erad , Erad)
        assertEquals(exaradian, Erad)
    }    
    
          
    @Test
    fun testRadianPradTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.Prad.value, rad.value*myPow, EPS)
        assertEquals(1.petaradian.value, rad.value*myPow)
        assertEquals(1.Prad , Prad)
        assertEquals(petaradian, Prad)
    }    
    
          
    @Test
    fun testRadianTradTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.Trad.value, rad.value*myPow, EPS)
        assertEquals(1.teraradian.value, rad.value*myPow)
        assertEquals(1.Trad , Trad)
        assertEquals(teraradian, Trad)
    }    
    
          
    @Test
    fun testRadianGradTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.Grad.value, rad.value*myPow, EPS)
        assertEquals(1.gigaradian.value, rad.value*myPow)
        assertEquals(1.Grad , Grad)
        assertEquals(gigaradian, Grad)
    }    
    
          
    @Test
    fun testRadianMradTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.Mrad.value, rad.value*myPow, EPS)
        assertEquals(1.megaradian.value, rad.value*myPow)
        assertEquals(1.Mrad , Mrad)
        assertEquals(megaradian, Mrad)
    }    
    
          
    @Test
    fun testRadianK1radTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.krad.value, rad.value*myPow, EPS)
        assertEquals(1.kiloradian.value, rad.value*myPow)
        assertEquals(1.krad , krad)
        assertEquals(kiloradian, krad)
    }    
    
          
    @Test
    fun testRadianH1radTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hrad.value, rad.value*myPow, EPS)
        assertEquals(1.hectoradian.value, rad.value*myPow)
        assertEquals(1.hrad , hrad)
        assertEquals(hectoradian, hrad)
    }    
    
          
    @Test
    fun testRadianDA1radTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.darad.value, rad.value*myPow, EPS)
        assertEquals(1.decaradian.value, rad.value*myPow)
        assertEquals(1.darad , darad)
        assertEquals(decaradian, darad)
    }    
    
          
    @Test
    fun testRadianD1radTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.drad.value, rad.value*myPow, EPS)
        assertEquals(1.deciradian.value, rad.value*myPow)
        assertEquals(1.drad , drad)
        assertEquals(deciradian, drad)
    }    
    
          
    @Test
    fun testRadianC1radTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.crad.value, rad.value*myPow, EPS)
        assertEquals(1.centiradian.value, rad.value*myPow)
        assertEquals(1.crad , crad)
        assertEquals(centiradian, crad)
    }    
    
          
    @Test
    fun testRadianM1radTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mrad.value, rad.value*myPow, EPS)
        assertEquals(1.milliradian.value, rad.value*myPow)
        assertEquals(1.mrad , mrad)
        assertEquals(milliradian, mrad)
    }    
    
          
    @Test
    fun testRadianΜ1radTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μrad.value, rad.value*myPow, EPS)
        assertEquals(1.microradian.value, rad.value*myPow)
        assertEquals(1.μrad , μrad)
        assertEquals(microradian, μrad)
    }    
    
          
    @Test
    fun testRadianN1radTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nrad.value, rad.value*myPow, EPS)
        assertEquals(1.nanoradian.value, rad.value*myPow)
        assertEquals(1.nrad , nrad)
        assertEquals(nanoradian, nrad)
    }    
    
          
    @Test
    fun testRadianP1radTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.prad.value, rad.value*myPow, EPS)
        assertEquals(1.picoradian.value, rad.value*myPow)
        assertEquals(1.prad , prad)
        assertEquals(picoradian, prad)
    }    
    
          
    @Test
    fun testRadianF1radTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.frad.value, rad.value*myPow, EPS)
        assertEquals(1.femtoradian.value, rad.value*myPow)
        assertEquals(1.frad , frad)
        assertEquals(femtoradian, frad)
    }    
    
          
    @Test
    fun testRadianA1radTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.arad.value, rad.value*myPow, EPS)
        assertEquals(1.attoradian.value, rad.value*myPow)
        assertEquals(1.arad , arad)
        assertEquals(attoradian, arad)
    }    
    
          
    @Test
    fun testRadianZ1radTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zrad.value, rad.value*myPow, EPS)
        assertEquals(1.zeptoradian.value, rad.value*myPow)
        assertEquals(1.zrad , zrad)
        assertEquals(zeptoradian, zrad)
    }    
    
          
    @Test
    fun testRadianY1radTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yrad.value, rad.value*myPow, EPS)
        assertEquals(1.yoctoradian.value, rad.value*myPow)
        assertEquals(1.yrad , yrad)
        assertEquals(yoctoradian, yrad)
    }    
    
          
    @Test
    fun testRadianR1radTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rrad.value, rad.value*myPow, EPS)
        assertEquals(1.rontoradian.value, rad.value*myPow)
        assertEquals(1.rrad , rrad)
        assertEquals(rontoradian, rrad)
    }    
    
          
    @Test
    fun testRadianQ1radTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qrad.value, rad.value*myPow, EPS)
        assertEquals(1.quectoradian.value, rad.value*myPow)
        assertEquals(1.qrad , qrad)
        assertEquals(quectoradian, qrad)
    }    
    }