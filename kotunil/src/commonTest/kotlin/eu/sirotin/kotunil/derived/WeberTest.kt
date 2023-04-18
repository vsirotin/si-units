        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class WeberTest {

    @Test
    fun testWeberMainTest1() {
        assertEquals(1.Wb , Wb)
    }
    
     @Test
    fun testWeberMainTest2() {
        assertEquals(12.3.Wb , Weber(12.3).expression)
    }
              
    @Test
    fun testWeberQWbTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QWb.value, Wb.value*myPow, EPS)
        assertEquals(1.quettaweber.value, Wb.value*myPow)
        assertEquals(1.QWb , QWb)
        assertEquals(quettaweber, QWb)
    }    
    
          
    @Test
    fun testWeberRWbTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RWb.value, Wb.value*myPow, EPS)
        assertEquals(1.ronnaweber.value, Wb.value*myPow)
        assertEquals(1.RWb , RWb)
        assertEquals(ronnaweber, RWb)
    }    
    
          
    @Test
    fun testWeberYWbTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YWb.value, Wb.value*myPow, EPS)
        assertEquals(1.yottaweber.value, Wb.value*myPow)
        assertEquals(1.YWb , YWb)
        assertEquals(yottaweber, YWb)
    }    
    
          
    @Test
    fun testWeberZWbTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZWb.value, Wb.value*myPow, EPS)
        assertEquals(1.zettaweber.value, Wb.value*myPow)
        assertEquals(1.ZWb , ZWb)
        assertEquals(zettaweber, ZWb)
    }    
    
          
    @Test
    fun testWeberEWbTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EWb.value, Wb.value*myPow, EPS)
        assertEquals(1.exaweber.value, Wb.value*myPow)
        assertEquals(1.EWb , EWb)
        assertEquals(exaweber, EWb)
    }    
    
          
    @Test
    fun testWeberPWbTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PWb.value, Wb.value*myPow, EPS)
        assertEquals(1.petaweber.value, Wb.value*myPow)
        assertEquals(1.PWb , PWb)
        assertEquals(petaweber, PWb)
    }    
    
          
    @Test
    fun testWeberTWbTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TWb.value, Wb.value*myPow, EPS)
        assertEquals(1.teraweber.value, Wb.value*myPow)
        assertEquals(1.TWb , TWb)
        assertEquals(teraweber, TWb)
    }    
    
          
    @Test
    fun testWeberGWbTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GWb.value, Wb.value*myPow, EPS)
        assertEquals(1.gigaweber.value, Wb.value*myPow)
        assertEquals(1.GWb , GWb)
        assertEquals(gigaweber, GWb)
    }    
    
          
    @Test
    fun testWeberMWbTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MWb.value, Wb.value*myPow, EPS)
        assertEquals(1.megaweber.value, Wb.value*myPow)
        assertEquals(1.MWb , MWb)
        assertEquals(megaweber, MWb)
    }    
    
          
    @Test
    fun testWeberK1WbTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kWb.value, Wb.value*myPow, EPS)
        assertEquals(1.kiloweber.value, Wb.value*myPow)
        assertEquals(1.kWb , kWb)
        assertEquals(kiloweber, kWb)
    }    
    
          
    @Test
    fun testWeberH1WbTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hWb.value, Wb.value*myPow, EPS)
        assertEquals(1.hectoweber.value, Wb.value*myPow)
        assertEquals(1.hWb , hWb)
        assertEquals(hectoweber, hWb)
    }    
    
          
    @Test
    fun testWeberDA1WbTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daWb.value, Wb.value*myPow, EPS)
        assertEquals(1.decaweber.value, Wb.value*myPow)
        assertEquals(1.daWb , daWb)
        assertEquals(decaweber, daWb)
    }    
    
          
    @Test
    fun testWeberD1WbTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dWb.value, Wb.value*myPow, EPS)
        assertEquals(1.deciweber.value, Wb.value*myPow)
        assertEquals(1.dWb , dWb)
        assertEquals(deciweber, dWb)
    }    
    
          
    @Test
    fun testWeberC1WbTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cWb.value, Wb.value*myPow, EPS)
        assertEquals(1.centiweber.value, Wb.value*myPow)
        assertEquals(1.cWb , cWb)
        assertEquals(centiweber, cWb)
    }    
    
          
    @Test
    fun testWeberM1WbTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mWb.value, Wb.value*myPow, EPS)
        assertEquals(1.milliweber.value, Wb.value*myPow)
        assertEquals(1.mWb , mWb)
        assertEquals(milliweber, mWb)
    }    
    
          
    @Test
    fun testWeberΜ1WbTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μWb.value, Wb.value*myPow, EPS)
        assertEquals(1.microweber.value, Wb.value*myPow)
        assertEquals(1.μWb , μWb)
        assertEquals(microweber, μWb)
    }    
    
          
    @Test
    fun testWeberN1WbTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nWb.value, Wb.value*myPow, EPS)
        assertEquals(1.nanoweber.value, Wb.value*myPow)
        assertEquals(1.nWb , nWb)
        assertEquals(nanoweber, nWb)
    }    
    
          
    @Test
    fun testWeberP1WbTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pWb.value, Wb.value*myPow, EPS)
        assertEquals(1.picoweber.value, Wb.value*myPow)
        assertEquals(1.pWb , pWb)
        assertEquals(picoweber, pWb)
    }    
    
          
    @Test
    fun testWeberF1WbTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fWb.value, Wb.value*myPow, EPS)
        assertEquals(1.femtoweber.value, Wb.value*myPow)
        assertEquals(1.fWb , fWb)
        assertEquals(femtoweber, fWb)
    }    
    
          
    @Test
    fun testWeberA1WbTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aWb.value, Wb.value*myPow, EPS)
        assertEquals(1.attoweber.value, Wb.value*myPow)
        assertEquals(1.aWb , aWb)
        assertEquals(attoweber, aWb)
    }    
    
          
    @Test
    fun testWeberZ1WbTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zWb.value, Wb.value*myPow, EPS)
        assertEquals(1.zeptoweber.value, Wb.value*myPow)
        assertEquals(1.zWb , zWb)
        assertEquals(zeptoweber, zWb)
    }    
    
          
    @Test
    fun testWeberY1WbTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yWb.value, Wb.value*myPow, EPS)
        assertEquals(1.yoctoweber.value, Wb.value*myPow)
        assertEquals(1.yWb , yWb)
        assertEquals(yoctoweber, yWb)
    }    
    
          
    @Test
    fun testWeberR1WbTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rWb.value, Wb.value*myPow, EPS)
        assertEquals(1.rontoweber.value, Wb.value*myPow)
        assertEquals(1.rWb , rWb)
        assertEquals(rontoweber, rWb)
    }    
    
          
    @Test
    fun testWeberQ1WbTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qWb.value, Wb.value*myPow, EPS)
        assertEquals(1.quectoweber.value, Wb.value*myPow)
        assertEquals(1.qWb , qWb)
        assertEquals(quectoweber, qWb)
    }    
    }