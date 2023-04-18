        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class PascalTest {

    @Test
    fun testPascalMainTest1() {
        assertEquals(1.Pa , Pa)
    }
    
     @Test
    fun testPascalMainTest2() {
        assertEquals(12.3.Pa , Pascal(12.3).expression)
    }
              
    @Test
    fun testPascalQPaTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QPa.value, Pa.value*myPow, EPS)
        assertEquals(1.quettapascal.value, Pa.value*myPow)
        assertEquals(1.QPa , QPa)
        assertEquals(quettapascal, QPa)
    }    
    
          
    @Test
    fun testPascalRPaTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RPa.value, Pa.value*myPow, EPS)
        assertEquals(1.ronnapascal.value, Pa.value*myPow)
        assertEquals(1.RPa , RPa)
        assertEquals(ronnapascal, RPa)
    }    
    
          
    @Test
    fun testPascalYPaTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YPa.value, Pa.value*myPow, EPS)
        assertEquals(1.yottapascal.value, Pa.value*myPow)
        assertEquals(1.YPa , YPa)
        assertEquals(yottapascal, YPa)
    }    
    
          
    @Test
    fun testPascalZPaTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZPa.value, Pa.value*myPow, EPS)
        assertEquals(1.zettapascal.value, Pa.value*myPow)
        assertEquals(1.ZPa , ZPa)
        assertEquals(zettapascal, ZPa)
    }    
    
          
    @Test
    fun testPascalEPaTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EPa.value, Pa.value*myPow, EPS)
        assertEquals(1.exapascal.value, Pa.value*myPow)
        assertEquals(1.EPa , EPa)
        assertEquals(exapascal, EPa)
    }    
    
          
    @Test
    fun testPascalPPaTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PPa.value, Pa.value*myPow, EPS)
        assertEquals(1.petapascal.value, Pa.value*myPow)
        assertEquals(1.PPa , PPa)
        assertEquals(petapascal, PPa)
    }    
    
          
    @Test
    fun testPascalTPaTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TPa.value, Pa.value*myPow, EPS)
        assertEquals(1.terapascal.value, Pa.value*myPow)
        assertEquals(1.TPa , TPa)
        assertEquals(terapascal, TPa)
    }    
    
          
    @Test
    fun testPascalGPaTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GPa.value, Pa.value*myPow, EPS)
        assertEquals(1.gigapascal.value, Pa.value*myPow)
        assertEquals(1.GPa , GPa)
        assertEquals(gigapascal, GPa)
    }    
    
          
    @Test
    fun testPascalMPaTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MPa.value, Pa.value*myPow, EPS)
        assertEquals(1.megapascal.value, Pa.value*myPow)
        assertEquals(1.MPa , MPa)
        assertEquals(megapascal, MPa)
    }    
    
          
    @Test
    fun testPascalK1PaTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kPa.value, Pa.value*myPow, EPS)
        assertEquals(1.kilopascal.value, Pa.value*myPow)
        assertEquals(1.kPa , kPa)
        assertEquals(kilopascal, kPa)
    }    
    
          
    @Test
    fun testPascalH1PaTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hPa.value, Pa.value*myPow, EPS)
        assertEquals(1.hectopascal.value, Pa.value*myPow)
        assertEquals(1.hPa , hPa)
        assertEquals(hectopascal, hPa)
    }    
    
          
    @Test
    fun testPascalDA1PaTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daPa.value, Pa.value*myPow, EPS)
        assertEquals(1.decapascal.value, Pa.value*myPow)
        assertEquals(1.daPa , daPa)
        assertEquals(decapascal, daPa)
    }    
    
          
    @Test
    fun testPascalD1PaTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dPa.value, Pa.value*myPow, EPS)
        assertEquals(1.decipascal.value, Pa.value*myPow)
        assertEquals(1.dPa , dPa)
        assertEquals(decipascal, dPa)
    }    
    
          
    @Test
    fun testPascalC1PaTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cPa.value, Pa.value*myPow, EPS)
        assertEquals(1.centipascal.value, Pa.value*myPow)
        assertEquals(1.cPa , cPa)
        assertEquals(centipascal, cPa)
    }    
    
          
    @Test
    fun testPascalM1PaTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mPa.value, Pa.value*myPow, EPS)
        assertEquals(1.millipascal.value, Pa.value*myPow)
        assertEquals(1.mPa , mPa)
        assertEquals(millipascal, mPa)
    }    
    
          
    @Test
    fun testPascalΜ1PaTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μPa.value, Pa.value*myPow, EPS)
        assertEquals(1.micropascal.value, Pa.value*myPow)
        assertEquals(1.μPa , μPa)
        assertEquals(micropascal, μPa)
    }    
    
          
    @Test
    fun testPascalN1PaTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nPa.value, Pa.value*myPow, EPS)
        assertEquals(1.nanopascal.value, Pa.value*myPow)
        assertEquals(1.nPa , nPa)
        assertEquals(nanopascal, nPa)
    }    
    
          
    @Test
    fun testPascalP1PaTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pPa.value, Pa.value*myPow, EPS)
        assertEquals(1.picopascal.value, Pa.value*myPow)
        assertEquals(1.pPa , pPa)
        assertEquals(picopascal, pPa)
    }    
    
          
    @Test
    fun testPascalF1PaTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fPa.value, Pa.value*myPow, EPS)
        assertEquals(1.femtopascal.value, Pa.value*myPow)
        assertEquals(1.fPa , fPa)
        assertEquals(femtopascal, fPa)
    }    
    
          
    @Test
    fun testPascalA1PaTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aPa.value, Pa.value*myPow, EPS)
        assertEquals(1.attopascal.value, Pa.value*myPow)
        assertEquals(1.aPa , aPa)
        assertEquals(attopascal, aPa)
    }    
    
          
    @Test
    fun testPascalZ1PaTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zPa.value, Pa.value*myPow, EPS)
        assertEquals(1.zeptopascal.value, Pa.value*myPow)
        assertEquals(1.zPa , zPa)
        assertEquals(zeptopascal, zPa)
    }    
    
          
    @Test
    fun testPascalY1PaTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yPa.value, Pa.value*myPow, EPS)
        assertEquals(1.yoctopascal.value, Pa.value*myPow)
        assertEquals(1.yPa , yPa)
        assertEquals(yoctopascal, yPa)
    }    
    
          
    @Test
    fun testPascalR1PaTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rPa.value, Pa.value*myPow, EPS)
        assertEquals(1.rontopascal.value, Pa.value*myPow)
        assertEquals(1.rPa , rPa)
        assertEquals(rontopascal, rPa)
    }    
    
          
    @Test
    fun testPascalQ1PaTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qPa.value, Pa.value*myPow, EPS)
        assertEquals(1.quectopascal.value, Pa.value*myPow)
        assertEquals(1.qPa , qPa)
        assertEquals(quectopascal, qPa)
    }    
    }