        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class SteradianTest {

    @Test
    fun testSteradianMainTest() {
        assertEquals(1.sr , sr)
    }
              
    @Test
    fun testSteradianQsrTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.Qsr.value, sr.value*myPow, EPS)
        assertEquals(1.quettasteradian.value, sr.value*myPow)
        assertEquals(1.Qsr , Qsr)
        assertEquals(quettasteradian, Qsr)
    }    
    
          
    @Test
    fun testSteradianRsrTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.Rsr.value, sr.value*myPow, EPS)
        assertEquals(1.ronnasteradian.value, sr.value*myPow)
        assertEquals(1.Rsr , Rsr)
        assertEquals(ronnasteradian, Rsr)
    }    
    
          
    @Test
    fun testSteradianYsrTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.Ysr.value, sr.value*myPow, EPS)
        assertEquals(1.yottasteradian.value, sr.value*myPow)
        assertEquals(1.Ysr , Ysr)
        assertEquals(yottasteradian, Ysr)
    }    
    
          
    @Test
    fun testSteradianZsrTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.Zsr.value, sr.value*myPow, EPS)
        assertEquals(1.zettasteradian.value, sr.value*myPow)
        assertEquals(1.Zsr , Zsr)
        assertEquals(zettasteradian, Zsr)
    }    
    
          
    @Test
    fun testSteradianEsrTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.Esr.value, sr.value*myPow, EPS)
        assertEquals(1.exasteradian.value, sr.value*myPow)
        assertEquals(1.Esr , Esr)
        assertEquals(exasteradian, Esr)
    }    
    
          
    @Test
    fun testSteradianPsrTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.Psr.value, sr.value*myPow, EPS)
        assertEquals(1.petasteradian.value, sr.value*myPow)
        assertEquals(1.Psr , Psr)
        assertEquals(petasteradian, Psr)
    }    
    
          
    @Test
    fun testSteradianTsrTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.Tsr.value, sr.value*myPow, EPS)
        assertEquals(1.terasteradian.value, sr.value*myPow)
        assertEquals(1.Tsr , Tsr)
        assertEquals(terasteradian, Tsr)
    }    
    
          
    @Test
    fun testSteradianGsrTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.Gsr.value, sr.value*myPow, EPS)
        assertEquals(1.gigasteradian.value, sr.value*myPow)
        assertEquals(1.Gsr , Gsr)
        assertEquals(gigasteradian, Gsr)
    }    
    
          
    @Test
    fun testSteradianMsrTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.Msr.value, sr.value*myPow, EPS)
        assertEquals(1.megasteradian.value, sr.value*myPow)
        assertEquals(1.Msr , Msr)
        assertEquals(megasteradian, Msr)
    }    
    
          
    @Test
    fun testSteradianK1srTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.ksr.value, sr.value*myPow, EPS)
        assertEquals(1.kilosteradian.value, sr.value*myPow)
        assertEquals(1.ksr , ksr)
        assertEquals(kilosteradian, ksr)
    }    
    
          
    @Test
    fun testSteradianH1srTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hsr.value, sr.value*myPow, EPS)
        assertEquals(1.hectosteradian.value, sr.value*myPow)
        assertEquals(1.hsr , hsr)
        assertEquals(hectosteradian, hsr)
    }    
    
          
    @Test
    fun testSteradianDA1srTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.dasr.value, sr.value*myPow, EPS)
        assertEquals(1.decasteradian.value, sr.value*myPow)
        assertEquals(1.dasr , dasr)
        assertEquals(decasteradian, dasr)
    }    
    
          
    @Test
    fun testSteradianD1srTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dsr.value, sr.value*myPow, EPS)
        assertEquals(1.decisteradian.value, sr.value*myPow)
        assertEquals(1.dsr , dsr)
        assertEquals(decisteradian, dsr)
    }    
    
          
    @Test
    fun testSteradianC1srTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.csr.value, sr.value*myPow, EPS)
        assertEquals(1.centisteradian.value, sr.value*myPow)
        assertEquals(1.csr , csr)
        assertEquals(centisteradian, csr)
    }    
    
          
    @Test
    fun testSteradianM1srTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.msr.value, sr.value*myPow, EPS)
        assertEquals(1.millisteradian.value, sr.value*myPow)
        assertEquals(1.msr , msr)
        assertEquals(millisteradian, msr)
    }    
    
          
    @Test
    fun testSteradianΜ1srTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μsr.value, sr.value*myPow, EPS)
        assertEquals(1.microsteradian.value, sr.value*myPow)
        assertEquals(1.μsr , μsr)
        assertEquals(microsteradian, μsr)
    }    
    
          
    @Test
    fun testSteradianN1srTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nsr.value, sr.value*myPow, EPS)
        assertEquals(1.nanosteradian.value, sr.value*myPow)
        assertEquals(1.nsr , nsr)
        assertEquals(nanosteradian, nsr)
    }    
    
          
    @Test
    fun testSteradianP1srTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.psr.value, sr.value*myPow, EPS)
        assertEquals(1.picosteradian.value, sr.value*myPow)
        assertEquals(1.psr , psr)
        assertEquals(picosteradian, psr)
    }    
    
          
    @Test
    fun testSteradianF1srTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fsr.value, sr.value*myPow, EPS)
        assertEquals(1.femtosteradian.value, sr.value*myPow)
        assertEquals(1.fsr , fsr)
        assertEquals(femtosteradian, fsr)
    }    
    
          
    @Test
    fun testSteradianA1srTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.asr.value, sr.value*myPow, EPS)
        assertEquals(1.attosteradian.value, sr.value*myPow)
        assertEquals(1.asr , asr)
        assertEquals(attosteradian, asr)
    }    
    
          
    @Test
    fun testSteradianZ1srTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zsr.value, sr.value*myPow, EPS)
        assertEquals(1.zeptosteradian.value, sr.value*myPow)
        assertEquals(1.zsr , zsr)
        assertEquals(zeptosteradian, zsr)
    }    
    
          
    @Test
    fun testSteradianY1srTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.ysr.value, sr.value*myPow, EPS)
        assertEquals(1.yoctosteradian.value, sr.value*myPow)
        assertEquals(1.ysr , ysr)
        assertEquals(yoctosteradian, ysr)
    }    
    
          
    @Test
    fun testSteradianR1srTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rsr.value, sr.value*myPow, EPS)
        assertEquals(1.rontosteradian.value, sr.value*myPow)
        assertEquals(1.rsr , rsr)
        assertEquals(rontosteradian, rsr)
    }    
    
          
    @Test
    fun testSteradianQ1srTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qsr.value, sr.value*myPow, EPS)
        assertEquals(1.quectosteradian.value, sr.value*myPow)
        assertEquals(1.qsr , qsr)
        assertEquals(quectosteradian, qsr)
    }    
    }