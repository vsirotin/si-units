        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class WattTest {

    @Test
    fun testWattMainTest1() {
        assertEquals(1.W , W)
    }
    
     @Test
    fun testWattMainTest2() {
        assertEquals(12.3.W , Watt(12.3).expression)
    }
              
    @Test
    fun testWattQWTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QW.value, W.value*myPow, EPS)
        assertEquals(1.quettawatt.value, W.value*myPow)
        assertEquals(1.QW , QW)
        assertEquals(quettawatt, QW)
    }    
    
          
    @Test
    fun testWattRWTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RW.value, W.value*myPow, EPS)
        assertEquals(1.ronnawatt.value, W.value*myPow)
        assertEquals(1.RW , RW)
        assertEquals(ronnawatt, RW)
    }    
    
          
    @Test
    fun testWattYWTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YW.value, W.value*myPow, EPS)
        assertEquals(1.yottawatt.value, W.value*myPow)
        assertEquals(1.YW , YW)
        assertEquals(yottawatt, YW)
    }    
    
          
    @Test
    fun testWattZWTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZW.value, W.value*myPow, EPS)
        assertEquals(1.zettawatt.value, W.value*myPow)
        assertEquals(1.ZW , ZW)
        assertEquals(zettawatt, ZW)
    }    
    
          
    @Test
    fun testWattEWTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EW.value, W.value*myPow, EPS)
        assertEquals(1.exawatt.value, W.value*myPow)
        assertEquals(1.EW , EW)
        assertEquals(exawatt, EW)
    }    
    
          
    @Test
    fun testWattPWTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PW.value, W.value*myPow, EPS)
        assertEquals(1.petawatt.value, W.value*myPow)
        assertEquals(1.PW , PW)
        assertEquals(petawatt, PW)
    }    
    
          
    @Test
    fun testWattTWTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TW.value, W.value*myPow, EPS)
        assertEquals(1.terawatt.value, W.value*myPow)
        assertEquals(1.TW , TW)
        assertEquals(terawatt, TW)
    }    
    
          
    @Test
    fun testWattGWTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GW.value, W.value*myPow, EPS)
        assertEquals(1.gigawatt.value, W.value*myPow)
        assertEquals(1.GW , GW)
        assertEquals(gigawatt, GW)
    }    
    
          
    @Test
    fun testWattMWTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MW.value, W.value*myPow, EPS)
        assertEquals(1.megawatt.value, W.value*myPow)
        assertEquals(1.MW , MW)
        assertEquals(megawatt, MW)
    }    
    
          
    @Test
    fun testWattK1WTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kW.value, W.value*myPow, EPS)
        assertEquals(1.kilowatt.value, W.value*myPow)
        assertEquals(1.kW , kW)
        assertEquals(kilowatt, kW)
    }    
    
          
    @Test
    fun testWattH1WTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hW.value, W.value*myPow, EPS)
        assertEquals(1.hectowatt.value, W.value*myPow)
        assertEquals(1.hW , hW)
        assertEquals(hectowatt, hW)
    }    
    
          
    @Test
    fun testWattDA1WTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daW.value, W.value*myPow, EPS)
        assertEquals(1.decawatt.value, W.value*myPow)
        assertEquals(1.daW , daW)
        assertEquals(decawatt, daW)
    }    
    
          
    @Test
    fun testWattD1WTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dW.value, W.value*myPow, EPS)
        assertEquals(1.deciwatt.value, W.value*myPow)
        assertEquals(1.dW , dW)
        assertEquals(deciwatt, dW)
    }    
    
          
    @Test
    fun testWattC1WTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cW.value, W.value*myPow, EPS)
        assertEquals(1.centiwatt.value, W.value*myPow)
        assertEquals(1.cW , cW)
        assertEquals(centiwatt, cW)
    }    
    
          
    @Test
    fun testWattM1WTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mW.value, W.value*myPow, EPS)
        assertEquals(1.milliwatt.value, W.value*myPow)
        assertEquals(1.mW , mW)
        assertEquals(milliwatt, mW)
    }    
    
          
    @Test
    fun testWattΜ1WTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μW.value, W.value*myPow, EPS)
        assertEquals(1.microwatt.value, W.value*myPow)
        assertEquals(1.μW , μW)
        assertEquals(microwatt, μW)
    }    
    
          
    @Test
    fun testWattN1WTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nW.value, W.value*myPow, EPS)
        assertEquals(1.nanowatt.value, W.value*myPow)
        assertEquals(1.nW , nW)
        assertEquals(nanowatt, nW)
    }    
    
          
    @Test
    fun testWattP1WTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pW.value, W.value*myPow, EPS)
        assertEquals(1.picowatt.value, W.value*myPow)
        assertEquals(1.pW , pW)
        assertEquals(picowatt, pW)
    }    
    
          
    @Test
    fun testWattF1WTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fW.value, W.value*myPow, EPS)
        assertEquals(1.femtowatt.value, W.value*myPow)
        assertEquals(1.fW , fW)
        assertEquals(femtowatt, fW)
    }    
    
          
    @Test
    fun testWattA1WTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aW.value, W.value*myPow, EPS)
        assertEquals(1.attowatt.value, W.value*myPow)
        assertEquals(1.aW , aW)
        assertEquals(attowatt, aW)
    }    
    
          
    @Test
    fun testWattZ1WTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zW.value, W.value*myPow, EPS)
        assertEquals(1.zeptowatt.value, W.value*myPow)
        assertEquals(1.zW , zW)
        assertEquals(zeptowatt, zW)
    }    
    
          
    @Test
    fun testWattY1WTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yW.value, W.value*myPow, EPS)
        assertEquals(1.yoctowatt.value, W.value*myPow)
        assertEquals(1.yW , yW)
        assertEquals(yoctowatt, yW)
    }    
    
          
    @Test
    fun testWattR1WTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rW.value, W.value*myPow, EPS)
        assertEquals(1.rontowatt.value, W.value*myPow)
        assertEquals(1.rW , rW)
        assertEquals(rontowatt, rW)
    }    
    
          
    @Test
    fun testWattQ1WTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qW.value, W.value*myPow, EPS)
        assertEquals(1.quectowatt.value, W.value*myPow)
        assertEquals(1.qW , qW)
        assertEquals(quectowatt, qW)
    }    
    }