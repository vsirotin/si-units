        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class TeslaTest {

    @Test
    fun testTeslaMainTest1() {
        assertEquals(1.T , T)
    }
    
    @Test
    fun testTeslaMainTest2() {
        assertEquals(12.3.T , Tesla(12.3))
    }
    
    @Test
    fun testTeslaMainTest3() {
        val x: Tesla = 12.3.T
        assertEquals(x , Tesla(12.3))
    }
    
    @Test
    fun testTeslaMainTest4() {
        val x: Tesla = T
        assertEquals(x , Tesla(1.0))
    }
              
    @Test
    fun testTeslaQTTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QT.value, T.value*myPow, EPS)
        assertEquals(1.quettatesla.value, T.value*myPow)
        assertEquals(1.QT , QT)
        assertEquals(quettatesla, QT)
    }    
    
          
    @Test
    fun testTeslaRTTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RT.value, T.value*myPow, EPS)
        assertEquals(1.ronnatesla.value, T.value*myPow)
        assertEquals(1.RT , RT)
        assertEquals(ronnatesla, RT)
    }    
    
          
    @Test
    fun testTeslaYTTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YT.value, T.value*myPow, EPS)
        assertEquals(1.yottatesla.value, T.value*myPow)
        assertEquals(1.YT , YT)
        assertEquals(yottatesla, YT)
    }    
    
          
    @Test
    fun testTeslaZTTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZT.value, T.value*myPow, EPS)
        assertEquals(1.zettatesla.value, T.value*myPow)
        assertEquals(1.ZT , ZT)
        assertEquals(zettatesla, ZT)
    }    
    
          
    @Test
    fun testTeslaETTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.ET.value, T.value*myPow, EPS)
        assertEquals(1.exatesla.value, T.value*myPow)
        assertEquals(1.ET , ET)
        assertEquals(exatesla, ET)
    }    
    
          
    @Test
    fun testTeslaPTTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PT.value, T.value*myPow, EPS)
        assertEquals(1.petatesla.value, T.value*myPow)
        assertEquals(1.PT , PT)
        assertEquals(petatesla, PT)
    }    
    
          
    @Test
    fun testTeslaTTTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TT.value, T.value*myPow, EPS)
        assertEquals(1.teratesla.value, T.value*myPow)
        assertEquals(1.TT , TT)
        assertEquals(teratesla, TT)
    }    
    
          
    @Test
    fun testTeslaGTTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GT.value, T.value*myPow, EPS)
        assertEquals(1.gigatesla.value, T.value*myPow)
        assertEquals(1.GT , GT)
        assertEquals(gigatesla, GT)
    }    
    
          
    @Test
    fun testTeslaMTTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MT.value, T.value*myPow, EPS)
        assertEquals(1.megatesla.value, T.value*myPow)
        assertEquals(1.MT , MT)
        assertEquals(megatesla, MT)
    }    
    
          
    @Test
    fun testTeslaK1TTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kT.value, T.value*myPow, EPS)
        assertEquals(1.kilotesla.value, T.value*myPow)
        assertEquals(1.kT , kT)
        assertEquals(kilotesla, kT)
    }    
    
          
    @Test
    fun testTeslaH1TTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hT.value, T.value*myPow, EPS)
        assertEquals(1.hectotesla.value, T.value*myPow)
        assertEquals(1.hT , hT)
        assertEquals(hectotesla, hT)
    }    
    
          
    @Test
    fun testTeslaDA1TTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daT.value, T.value*myPow, EPS)
        assertEquals(1.decatesla.value, T.value*myPow)
        assertEquals(1.daT , daT)
        assertEquals(decatesla, daT)
    }    
    
          
    @Test
    fun testTeslaD1TTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dT.value, T.value*myPow, EPS)
        assertEquals(1.decitesla.value, T.value*myPow)
        assertEquals(1.dT , dT)
        assertEquals(decitesla, dT)
    }    
    
          
    @Test
    fun testTeslaC1TTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cT.value, T.value*myPow, EPS)
        assertEquals(1.centitesla.value, T.value*myPow)
        assertEquals(1.cT , cT)
        assertEquals(centitesla, cT)
    }    
    
          
    @Test
    fun testTeslaM1TTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mT.value, T.value*myPow, EPS)
        assertEquals(1.millitesla.value, T.value*myPow)
        assertEquals(1.mT , mT)
        assertEquals(millitesla, mT)
    }    
    
          
    @Test
    fun testTeslaΜ1TTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μT.value, T.value*myPow, EPS)
        assertEquals(1.microtesla.value, T.value*myPow)
        assertEquals(1.μT , μT)
        assertEquals(microtesla, μT)
    }    
    
          
    @Test
    fun testTeslaN1TTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nT.value, T.value*myPow, EPS)
        assertEquals(1.nanotesla.value, T.value*myPow)
        assertEquals(1.nT , nT)
        assertEquals(nanotesla, nT)
    }    
    
          
    @Test
    fun testTeslaP1TTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pT.value, T.value*myPow, EPS)
        assertEquals(1.picotesla.value, T.value*myPow)
        assertEquals(1.pT , pT)
        assertEquals(picotesla, pT)
    }    
    
          
    @Test
    fun testTeslaF1TTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fT.value, T.value*myPow, EPS)
        assertEquals(1.femtotesla.value, T.value*myPow)
        assertEquals(1.fT , fT)
        assertEquals(femtotesla, fT)
    }    
    
          
    @Test
    fun testTeslaA1TTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aT.value, T.value*myPow, EPS)
        assertEquals(1.attotesla.value, T.value*myPow)
        assertEquals(1.aT , aT)
        assertEquals(attotesla, aT)
    }    
    
          
    @Test
    fun testTeslaZ1TTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zT.value, T.value*myPow, EPS)
        assertEquals(1.zeptotesla.value, T.value*myPow)
        assertEquals(1.zT , zT)
        assertEquals(zeptotesla, zT)
    }    
    
          
    @Test
    fun testTeslaY1TTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yT.value, T.value*myPow, EPS)
        assertEquals(1.yoctotesla.value, T.value*myPow)
        assertEquals(1.yT , yT)
        assertEquals(yoctotesla, yT)
    }    
    
          
    @Test
    fun testTeslaR1TTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rT.value, T.value*myPow, EPS)
        assertEquals(1.rontotesla.value, T.value*myPow)
        assertEquals(1.rT , rT)
        assertEquals(rontotesla, rT)
    }    
    
          
    @Test
    fun testTeslaQ1TTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qT.value, T.value*myPow, EPS)
        assertEquals(1.quectotesla.value, T.value*myPow)
        assertEquals(1.qT , qT)
        assertEquals(quectotesla, qT)
    }    
    }