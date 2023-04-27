        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class SievertTest {

    @Test
    fun testSievertMainTest1() {
        assertEquals(1.Sv , Sv)
    }
    
     @Test
    fun testSievertMainTest2() {
        assertEquals(12.3.Sv , Sievert(12.3))
    }
              
    @Test
    fun testSievertQSvTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QSv.value, Sv.value*myPow, EPS)
        assertEquals(1.quettasievert.value, Sv.value*myPow)
        assertEquals(1.QSv , QSv)
        assertEquals(quettasievert, QSv)
    }    
    
          
    @Test
    fun testSievertRSvTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RSv.value, Sv.value*myPow, EPS)
        assertEquals(1.ronnasievert.value, Sv.value*myPow)
        assertEquals(1.RSv , RSv)
        assertEquals(ronnasievert, RSv)
    }    
    
          
    @Test
    fun testSievertYSvTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YSv.value, Sv.value*myPow, EPS)
        assertEquals(1.yottasievert.value, Sv.value*myPow)
        assertEquals(1.YSv , YSv)
        assertEquals(yottasievert, YSv)
    }    
    
          
    @Test
    fun testSievertZSvTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZSv.value, Sv.value*myPow, EPS)
        assertEquals(1.zettasievert.value, Sv.value*myPow)
        assertEquals(1.ZSv , ZSv)
        assertEquals(zettasievert, ZSv)
    }    
    
          
    @Test
    fun testSievertESvTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.ESv.value, Sv.value*myPow, EPS)
        assertEquals(1.exasievert.value, Sv.value*myPow)
        assertEquals(1.ESv , ESv)
        assertEquals(exasievert, ESv)
    }    
    
          
    @Test
    fun testSievertPSvTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PSv.value, Sv.value*myPow, EPS)
        assertEquals(1.petasievert.value, Sv.value*myPow)
        assertEquals(1.PSv , PSv)
        assertEquals(petasievert, PSv)
    }    
    
          
    @Test
    fun testSievertTSvTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TSv.value, Sv.value*myPow, EPS)
        assertEquals(1.terasievert.value, Sv.value*myPow)
        assertEquals(1.TSv , TSv)
        assertEquals(terasievert, TSv)
    }    
    
          
    @Test
    fun testSievertGSvTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GSv.value, Sv.value*myPow, EPS)
        assertEquals(1.gigasievert.value, Sv.value*myPow)
        assertEquals(1.GSv , GSv)
        assertEquals(gigasievert, GSv)
    }    
    
          
    @Test
    fun testSievertMSvTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MSv.value, Sv.value*myPow, EPS)
        assertEquals(1.megasievert.value, Sv.value*myPow)
        assertEquals(1.MSv , MSv)
        assertEquals(megasievert, MSv)
    }    
    
          
    @Test
    fun testSievertK1SvTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kSv.value, Sv.value*myPow, EPS)
        assertEquals(1.kilosievert.value, Sv.value*myPow)
        assertEquals(1.kSv , kSv)
        assertEquals(kilosievert, kSv)
    }    
    
          
    @Test
    fun testSievertH1SvTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hSv.value, Sv.value*myPow, EPS)
        assertEquals(1.hectosievert.value, Sv.value*myPow)
        assertEquals(1.hSv , hSv)
        assertEquals(hectosievert, hSv)
    }    
    
          
    @Test
    fun testSievertDA1SvTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daSv.value, Sv.value*myPow, EPS)
        assertEquals(1.decasievert.value, Sv.value*myPow)
        assertEquals(1.daSv , daSv)
        assertEquals(decasievert, daSv)
    }    
    
          
    @Test
    fun testSievertD1SvTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dSv.value, Sv.value*myPow, EPS)
        assertEquals(1.decisievert.value, Sv.value*myPow)
        assertEquals(1.dSv , dSv)
        assertEquals(decisievert, dSv)
    }    
    
          
    @Test
    fun testSievertC1SvTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cSv.value, Sv.value*myPow, EPS)
        assertEquals(1.centisievert.value, Sv.value*myPow)
        assertEquals(1.cSv , cSv)
        assertEquals(centisievert, cSv)
    }    
    
          
    @Test
    fun testSievertM1SvTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mSv.value, Sv.value*myPow, EPS)
        assertEquals(1.millisievert.value, Sv.value*myPow)
        assertEquals(1.mSv , mSv)
        assertEquals(millisievert, mSv)
    }    
    
          
    @Test
    fun testSievertΜ1SvTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μSv.value, Sv.value*myPow, EPS)
        assertEquals(1.microsievert.value, Sv.value*myPow)
        assertEquals(1.μSv , μSv)
        assertEquals(microsievert, μSv)
    }    
    
          
    @Test
    fun testSievertN1SvTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nSv.value, Sv.value*myPow, EPS)
        assertEquals(1.nanosievert.value, Sv.value*myPow)
        assertEquals(1.nSv , nSv)
        assertEquals(nanosievert, nSv)
    }    
    
          
    @Test
    fun testSievertP1SvTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pSv.value, Sv.value*myPow, EPS)
        assertEquals(1.picosievert.value, Sv.value*myPow)
        assertEquals(1.pSv , pSv)
        assertEquals(picosievert, pSv)
    }    
    
          
    @Test
    fun testSievertF1SvTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fSv.value, Sv.value*myPow, EPS)
        assertEquals(1.femtosievert.value, Sv.value*myPow)
        assertEquals(1.fSv , fSv)
        assertEquals(femtosievert, fSv)
    }    
    
          
    @Test
    fun testSievertA1SvTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aSv.value, Sv.value*myPow, EPS)
        assertEquals(1.attosievert.value, Sv.value*myPow)
        assertEquals(1.aSv , aSv)
        assertEquals(attosievert, aSv)
    }    
    
          
    @Test
    fun testSievertZ1SvTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zSv.value, Sv.value*myPow, EPS)
        assertEquals(1.zeptosievert.value, Sv.value*myPow)
        assertEquals(1.zSv , zSv)
        assertEquals(zeptosievert, zSv)
    }    
    
          
    @Test
    fun testSievertY1SvTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.ySv.value, Sv.value*myPow, EPS)
        assertEquals(1.yoctosievert.value, Sv.value*myPow)
        assertEquals(1.ySv , ySv)
        assertEquals(yoctosievert, ySv)
    }    
    
          
    @Test
    fun testSievertR1SvTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rSv.value, Sv.value*myPow, EPS)
        assertEquals(1.rontosievert.value, Sv.value*myPow)
        assertEquals(1.rSv , rSv)
        assertEquals(rontosievert, rSv)
    }    
    
          
    @Test
    fun testSievertQ1SvTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qSv.value, Sv.value*myPow, EPS)
        assertEquals(1.quectosievert.value, Sv.value*myPow)
        assertEquals(1.qSv , qSv)
        assertEquals(quectosievert, qSv)
    }    
    }