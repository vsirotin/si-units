        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class HenryTest {

    @Test
    fun testHenryMainTest1() {
        assertEquals(1.H , H)
    }
    
    @Test
    fun testHenryMainTest2() {
        assertEquals(12.3.H , Henry(12.3))
    }
    
    @Test
    fun testHenryMainTest3() {
        val x: Henry = 12.3.H
        assertEquals(x , Henry(12.3))
    }
    
    @Test
    fun testHenryMainTest4() {
        val x: Henry = H
        assertEquals(x , Henry(1.0))
    }
              
    @Test
    fun testHenryQHTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QH.value, H.value*myPow, EPS)
        assertEquals(1.quettahenry.value, H.value*myPow)
        assertEquals(1.QH , QH)
        assertEquals(quettahenry, QH)
    }    
    
          
    @Test
    fun testHenryRHTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RH.value, H.value*myPow, EPS)
        assertEquals(1.ronnahenry.value, H.value*myPow)
        assertEquals(1.RH , RH)
        assertEquals(ronnahenry, RH)
    }    
    
          
    @Test
    fun testHenryYHTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YH.value, H.value*myPow, EPS)
        assertEquals(1.yottahenry.value, H.value*myPow)
        assertEquals(1.YH , YH)
        assertEquals(yottahenry, YH)
    }    
    
          
    @Test
    fun testHenryZHTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZH.value, H.value*myPow, EPS)
        assertEquals(1.zettahenry.value, H.value*myPow)
        assertEquals(1.ZH , ZH)
        assertEquals(zettahenry, ZH)
    }    
    
          
    @Test
    fun testHenryEHTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EH.value, H.value*myPow, EPS)
        assertEquals(1.exahenry.value, H.value*myPow)
        assertEquals(1.EH , EH)
        assertEquals(exahenry, EH)
    }    
    
          
    @Test
    fun testHenryPHTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PH.value, H.value*myPow, EPS)
        assertEquals(1.petahenry.value, H.value*myPow)
        assertEquals(1.PH , PH)
        assertEquals(petahenry, PH)
    }    
    
          
    @Test
    fun testHenryTHTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TH.value, H.value*myPow, EPS)
        assertEquals(1.terahenry.value, H.value*myPow)
        assertEquals(1.TH , TH)
        assertEquals(terahenry, TH)
    }    
    
          
    @Test
    fun testHenryGHTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GH.value, H.value*myPow, EPS)
        assertEquals(1.gigahenry.value, H.value*myPow)
        assertEquals(1.GH , GH)
        assertEquals(gigahenry, GH)
    }    
    
          
    @Test
    fun testHenryMHTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MH.value, H.value*myPow, EPS)
        assertEquals(1.megahenry.value, H.value*myPow)
        assertEquals(1.MH , MH)
        assertEquals(megahenry, MH)
    }    
    
          
    @Test
    fun testHenryK1HTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kH.value, H.value*myPow, EPS)
        assertEquals(1.kilohenry.value, H.value*myPow)
        assertEquals(1.kH , kH)
        assertEquals(kilohenry, kH)
    }    
    
          
    @Test
    fun testHenryH1HTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hH.value, H.value*myPow, EPS)
        assertEquals(1.hectohenry.value, H.value*myPow)
        assertEquals(1.hH , hH)
        assertEquals(hectohenry, hH)
    }    
    
          
    @Test
    fun testHenryDA1HTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daH.value, H.value*myPow, EPS)
        assertEquals(1.decahenry.value, H.value*myPow)
        assertEquals(1.daH , daH)
        assertEquals(decahenry, daH)
    }    
    
          
    @Test
    fun testHenryD1HTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dH.value, H.value*myPow, EPS)
        assertEquals(1.decihenry.value, H.value*myPow)
        assertEquals(1.dH , dH)
        assertEquals(decihenry, dH)
    }    
    
          
    @Test
    fun testHenryC1HTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cH.value, H.value*myPow, EPS)
        assertEquals(1.centihenry.value, H.value*myPow)
        assertEquals(1.cH , cH)
        assertEquals(centihenry, cH)
    }    
    
          
    @Test
    fun testHenryM1HTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mH.value, H.value*myPow, EPS)
        assertEquals(1.millihenry.value, H.value*myPow)
        assertEquals(1.mH , mH)
        assertEquals(millihenry, mH)
    }    
    
          
    @Test
    fun testHenryΜ1HTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μH.value, H.value*myPow, EPS)
        assertEquals(1.microhenry.value, H.value*myPow)
        assertEquals(1.μH , μH)
        assertEquals(microhenry, μH)
    }    
    
          
    @Test
    fun testHenryN1HTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nH.value, H.value*myPow, EPS)
        assertEquals(1.nanohenry.value, H.value*myPow)
        assertEquals(1.nH , nH)
        assertEquals(nanohenry, nH)
    }    
    
          
    @Test
    fun testHenryP1HTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pH.value, H.value*myPow, EPS)
        assertEquals(1.picohenry.value, H.value*myPow)
        assertEquals(1.pH , pH)
        assertEquals(picohenry, pH)
    }    
    
          
    @Test
    fun testHenryF1HTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fH.value, H.value*myPow, EPS)
        assertEquals(1.femtohenry.value, H.value*myPow)
        assertEquals(1.fH , fH)
        assertEquals(femtohenry, fH)
    }    
    
          
    @Test
    fun testHenryA1HTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aH.value, H.value*myPow, EPS)
        assertEquals(1.attohenry.value, H.value*myPow)
        assertEquals(1.aH , aH)
        assertEquals(attohenry, aH)
    }    
    
          
    @Test
    fun testHenryZ1HTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zH.value, H.value*myPow, EPS)
        assertEquals(1.zeptohenry.value, H.value*myPow)
        assertEquals(1.zH , zH)
        assertEquals(zeptohenry, zH)
    }    
    
          
    @Test
    fun testHenryY1HTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yH.value, H.value*myPow, EPS)
        assertEquals(1.yoctohenry.value, H.value*myPow)
        assertEquals(1.yH , yH)
        assertEquals(yoctohenry, yH)
    }    
    
          
    @Test
    fun testHenryR1HTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rH.value, H.value*myPow, EPS)
        assertEquals(1.rontohenry.value, H.value*myPow)
        assertEquals(1.rH , rH)
        assertEquals(rontohenry, rH)
    }    
    
          
    @Test
    fun testHenryQ1HTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qH.value, H.value*myPow, EPS)
        assertEquals(1.quectohenry.value, H.value*myPow)
        assertEquals(1.qH , qH)
        assertEquals(quectohenry, qH)
    }    
    }