        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class VoltTest {

    @Test
    fun testVoltMainTest1() {
        assertEquals(1.V , V)
    }
    
    @Test
    fun testVoltMainTest2() {
        assertEquals(12.3.V , Volt(12.3))
    }
    
    @Test
    fun testVoltMainTest3() {
        val x: Volt = 12.3.V
        assertEquals(x , Volt(12.3))
    }
    
    @Test
    fun testVoltMainTest4() {
        val x: Volt = V
        assertEquals(x , Volt(1.0))
    }
              
    @Test
    fun testVoltQVTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QV.value, V.value*myPow, EPS)
        assertEquals(1.quettavolt.value, V.value*myPow)
        assertEquals(1.QV , QV)
        assertEquals(quettavolt, QV)
    }    
    
          
    @Test
    fun testVoltRVTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RV.value, V.value*myPow, EPS)
        assertEquals(1.ronnavolt.value, V.value*myPow)
        assertEquals(1.RV , RV)
        assertEquals(ronnavolt, RV)
    }    
    
          
    @Test
    fun testVoltYVTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YV.value, V.value*myPow, EPS)
        assertEquals(1.yottavolt.value, V.value*myPow)
        assertEquals(1.YV , YV)
        assertEquals(yottavolt, YV)
    }    
    
          
    @Test
    fun testVoltZVTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZV.value, V.value*myPow, EPS)
        assertEquals(1.zettavolt.value, V.value*myPow)
        assertEquals(1.ZV , ZV)
        assertEquals(zettavolt, ZV)
    }    
    
          
    @Test
    fun testVoltEVTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EV.value, V.value*myPow, EPS)
        assertEquals(1.exavolt.value, V.value*myPow)
        assertEquals(1.EV , EV)
        assertEquals(exavolt, EV)
    }    
    
          
    @Test
    fun testVoltPVTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PV.value, V.value*myPow, EPS)
        assertEquals(1.petavolt.value, V.value*myPow)
        assertEquals(1.PV , PV)
        assertEquals(petavolt, PV)
    }    
    
          
    @Test
    fun testVoltTVTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TV.value, V.value*myPow, EPS)
        assertEquals(1.teravolt.value, V.value*myPow)
        assertEquals(1.TV , TV)
        assertEquals(teravolt, TV)
    }    
    
          
    @Test
    fun testVoltGVTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GV.value, V.value*myPow, EPS)
        assertEquals(1.gigavolt.value, V.value*myPow)
        assertEquals(1.GV , GV)
        assertEquals(gigavolt, GV)
    }    
    
          
    @Test
    fun testVoltMVTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MV.value, V.value*myPow, EPS)
        assertEquals(1.megavolt.value, V.value*myPow)
        assertEquals(1.MV , MV)
        assertEquals(megavolt, MV)
    }    
    
          
    @Test
    fun testVoltK1VTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kV.value, V.value*myPow, EPS)
        assertEquals(1.kilovolt.value, V.value*myPow)
        assertEquals(1.kV , kV)
        assertEquals(kilovolt, kV)
    }    
    
          
    @Test
    fun testVoltH1VTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hV.value, V.value*myPow, EPS)
        assertEquals(1.hectovolt.value, V.value*myPow)
        assertEquals(1.hV , hV)
        assertEquals(hectovolt, hV)
    }    
    
          
    @Test
    fun testVoltDA1VTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daV.value, V.value*myPow, EPS)
        assertEquals(1.decavolt.value, V.value*myPow)
        assertEquals(1.daV , daV)
        assertEquals(decavolt, daV)
    }    
    
          
    @Test
    fun testVoltD1VTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dV.value, V.value*myPow, EPS)
        assertEquals(1.decivolt.value, V.value*myPow)
        assertEquals(1.dV , dV)
        assertEquals(decivolt, dV)
    }    
    
          
    @Test
    fun testVoltC1VTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cV.value, V.value*myPow, EPS)
        assertEquals(1.centivolt.value, V.value*myPow)
        assertEquals(1.cV , cV)
        assertEquals(centivolt, cV)
    }    
    
          
    @Test
    fun testVoltM1VTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mV.value, V.value*myPow, EPS)
        assertEquals(1.millivolt.value, V.value*myPow)
        assertEquals(1.mV , mV)
        assertEquals(millivolt, mV)
    }    
    
          
    @Test
    fun testVoltΜ1VTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μV.value, V.value*myPow, EPS)
        assertEquals(1.microvolt.value, V.value*myPow)
        assertEquals(1.μV , μV)
        assertEquals(microvolt, μV)
    }    
    
          
    @Test
    fun testVoltN1VTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nV.value, V.value*myPow, EPS)
        assertEquals(1.nanovolt.value, V.value*myPow)
        assertEquals(1.nV , nV)
        assertEquals(nanovolt, nV)
    }    
    
          
    @Test
    fun testVoltP1VTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pV.value, V.value*myPow, EPS)
        assertEquals(1.picovolt.value, V.value*myPow)
        assertEquals(1.pV , pV)
        assertEquals(picovolt, pV)
    }    
    
          
    @Test
    fun testVoltF1VTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fV.value, V.value*myPow, EPS)
        assertEquals(1.femtovolt.value, V.value*myPow)
        assertEquals(1.fV , fV)
        assertEquals(femtovolt, fV)
    }    
    
          
    @Test
    fun testVoltA1VTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aV.value, V.value*myPow, EPS)
        assertEquals(1.attovolt.value, V.value*myPow)
        assertEquals(1.aV , aV)
        assertEquals(attovolt, aV)
    }    
    
          
    @Test
    fun testVoltZ1VTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zV.value, V.value*myPow, EPS)
        assertEquals(1.zeptovolt.value, V.value*myPow)
        assertEquals(1.zV , zV)
        assertEquals(zeptovolt, zV)
    }    
    
          
    @Test
    fun testVoltY1VTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yV.value, V.value*myPow, EPS)
        assertEquals(1.yoctovolt.value, V.value*myPow)
        assertEquals(1.yV , yV)
        assertEquals(yoctovolt, yV)
    }    
    
          
    @Test
    fun testVoltR1VTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rV.value, V.value*myPow, EPS)
        assertEquals(1.rontovolt.value, V.value*myPow)
        assertEquals(1.rV , rV)
        assertEquals(rontovolt, rV)
    }    
    
          
    @Test
    fun testVoltQ1VTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qV.value, V.value*myPow, EPS)
        assertEquals(1.quectovolt.value, V.value*myPow)
        assertEquals(1.qV , qV)
        assertEquals(quectovolt, qV)
    }    
    }