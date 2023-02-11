        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class BecquerelTest {

    @Test
    fun testBecquerelMainTest() {
        assertEquals(1.Bq , Bq)
    }
              
    @Test
    fun testBecquerelQBqTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QBq.value, Bq.value*myPow, EPS)
        assertEquals(1.quettabecquerel.value, Bq.value*myPow)
        assertEquals(1.QBq , QBq)
        assertEquals(quettabecquerel, QBq)
    }    
    
          
    @Test
    fun testBecquerelRBqTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RBq.value, Bq.value*myPow, EPS)
        assertEquals(1.ronnabecquerel.value, Bq.value*myPow)
        assertEquals(1.RBq , RBq)
        assertEquals(ronnabecquerel, RBq)
    }    
    
          
    @Test
    fun testBecquerelYBqTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YBq.value, Bq.value*myPow, EPS)
        assertEquals(1.yottabecquerel.value, Bq.value*myPow)
        assertEquals(1.YBq , YBq)
        assertEquals(yottabecquerel, YBq)
    }    
    
          
    @Test
    fun testBecquerelZBqTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZBq.value, Bq.value*myPow, EPS)
        assertEquals(1.zettabecquerel.value, Bq.value*myPow)
        assertEquals(1.ZBq , ZBq)
        assertEquals(zettabecquerel, ZBq)
    }    
    
          
    @Test
    fun testBecquerelEBqTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EBq.value, Bq.value*myPow, EPS)
        assertEquals(1.exabecquerel.value, Bq.value*myPow)
        assertEquals(1.EBq , EBq)
        assertEquals(exabecquerel, EBq)
    }    
    
          
    @Test
    fun testBecquerelPBqTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PBq.value, Bq.value*myPow, EPS)
        assertEquals(1.petabecquerel.value, Bq.value*myPow)
        assertEquals(1.PBq , PBq)
        assertEquals(petabecquerel, PBq)
    }    
    
          
    @Test
    fun testBecquerelTBqTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TBq.value, Bq.value*myPow, EPS)
        assertEquals(1.terabecquerel.value, Bq.value*myPow)
        assertEquals(1.TBq , TBq)
        assertEquals(terabecquerel, TBq)
    }    
    
          
    @Test
    fun testBecquerelGBqTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GBq.value, Bq.value*myPow, EPS)
        assertEquals(1.gigabecquerel.value, Bq.value*myPow)
        assertEquals(1.GBq , GBq)
        assertEquals(gigabecquerel, GBq)
    }    
    
          
    @Test
    fun testBecquerelMBqTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MBq.value, Bq.value*myPow, EPS)
        assertEquals(1.megabecquerel.value, Bq.value*myPow)
        assertEquals(1.MBq , MBq)
        assertEquals(megabecquerel, MBq)
    }    
    
          
    @Test
    fun testBecquerelK1BqTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kBq.value, Bq.value*myPow, EPS)
        assertEquals(1.kilobecquerel.value, Bq.value*myPow)
        assertEquals(1.kBq , kBq)
        assertEquals(kilobecquerel, kBq)
    }    
    
          
    @Test
    fun testBecquerelH1BqTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hBq.value, Bq.value*myPow, EPS)
        assertEquals(1.hectobecquerel.value, Bq.value*myPow)
        assertEquals(1.hBq , hBq)
        assertEquals(hectobecquerel, hBq)
    }    
    
          
    @Test
    fun testBecquerelDA1BqTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daBq.value, Bq.value*myPow, EPS)
        assertEquals(1.decabecquerel.value, Bq.value*myPow)
        assertEquals(1.daBq , daBq)
        assertEquals(decabecquerel, daBq)
    }    
    
          
    @Test
    fun testBecquerelD1BqTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dBq.value, Bq.value*myPow, EPS)
        assertEquals(1.decibecquerel.value, Bq.value*myPow)
        assertEquals(1.dBq , dBq)
        assertEquals(decibecquerel, dBq)
    }    
    
          
    @Test
    fun testBecquerelC1BqTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cBq.value, Bq.value*myPow, EPS)
        assertEquals(1.centibecquerel.value, Bq.value*myPow)
        assertEquals(1.cBq , cBq)
        assertEquals(centibecquerel, cBq)
    }    
    
          
    @Test
    fun testBecquerelM1BqTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mBq.value, Bq.value*myPow, EPS)
        assertEquals(1.millibecquerel.value, Bq.value*myPow)
        assertEquals(1.mBq , mBq)
        assertEquals(millibecquerel, mBq)
    }    
    
          
    @Test
    fun testBecquerelΜ1BqTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μBq.value, Bq.value*myPow, EPS)
        assertEquals(1.microbecquerel.value, Bq.value*myPow)
        assertEquals(1.μBq , μBq)
        assertEquals(microbecquerel, μBq)
    }    
    
          
    @Test
    fun testBecquerelN1BqTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nBq.value, Bq.value*myPow, EPS)
        assertEquals(1.nanobecquerel.value, Bq.value*myPow)
        assertEquals(1.nBq , nBq)
        assertEquals(nanobecquerel, nBq)
    }    
    
          
    @Test
    fun testBecquerelP1BqTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pBq.value, Bq.value*myPow, EPS)
        assertEquals(1.picobecquerel.value, Bq.value*myPow)
        assertEquals(1.pBq , pBq)
        assertEquals(picobecquerel, pBq)
    }    
    
          
    @Test
    fun testBecquerelF1BqTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fBq.value, Bq.value*myPow, EPS)
        assertEquals(1.femtobecquerel.value, Bq.value*myPow)
        assertEquals(1.fBq , fBq)
        assertEquals(femtobecquerel, fBq)
    }    
    
          
    @Test
    fun testBecquerelA1BqTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aBq.value, Bq.value*myPow, EPS)
        assertEquals(1.attobecquerel.value, Bq.value*myPow)
        assertEquals(1.aBq , aBq)
        assertEquals(attobecquerel, aBq)
    }    
    
          
    @Test
    fun testBecquerelZ1BqTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zBq.value, Bq.value*myPow, EPS)
        assertEquals(1.zeptobecquerel.value, Bq.value*myPow)
        assertEquals(1.zBq , zBq)
        assertEquals(zeptobecquerel, zBq)
    }    
    
          
    @Test
    fun testBecquerelY1BqTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yBq.value, Bq.value*myPow, EPS)
        assertEquals(1.yoctobecquerel.value, Bq.value*myPow)
        assertEquals(1.yBq , yBq)
        assertEquals(yoctobecquerel, yBq)
    }    
    
          
    @Test
    fun testBecquerelR1BqTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rBq.value, Bq.value*myPow, EPS)
        assertEquals(1.rontobecquerel.value, Bq.value*myPow)
        assertEquals(1.rBq , rBq)
        assertEquals(rontobecquerel, rBq)
    }    
    
          
    @Test
    fun testBecquerelQ1BqTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qBq.value, Bq.value*myPow, EPS)
        assertEquals(1.quectobecquerel.value, Bq.value*myPow)
        assertEquals(1.qBq , qBq)
        assertEquals(quectobecquerel, qBq)
    }    
    }