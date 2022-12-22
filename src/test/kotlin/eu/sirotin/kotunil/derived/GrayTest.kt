        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class GrayTest {

    @Test
    fun testGrayMainTest() {
        assertEquals(1.Gy , Gy)
    }
              
    @Test
    fun testGrayQGyTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QGy.value, Gy.value*myPow, EPS)
        assertEquals(1.quettagray.value, Gy.value*myPow)
        assertEquals(1.QGy , QGy)
        assertEquals(quettagray, QGy)
    }    
    
          
    @Test
    fun testGrayRGyTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RGy.value, Gy.value*myPow, EPS)
        assertEquals(1.ronnagray.value, Gy.value*myPow)
        assertEquals(1.RGy , RGy)
        assertEquals(ronnagray, RGy)
    }    
    
          
    @Test
    fun testGrayYGyTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YGy.value, Gy.value*myPow, EPS)
        assertEquals(1.yottagray.value, Gy.value*myPow)
        assertEquals(1.YGy , YGy)
        assertEquals(yottagray, YGy)
    }    
    
          
    @Test
    fun testGrayZGyTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZGy.value, Gy.value*myPow, EPS)
        assertEquals(1.zettagray.value, Gy.value*myPow)
        assertEquals(1.ZGy , ZGy)
        assertEquals(zettagray, ZGy)
    }    
    
          
    @Test
    fun testGrayEGyTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EGy.value, Gy.value*myPow, EPS)
        assertEquals(1.exagray.value, Gy.value*myPow)
        assertEquals(1.EGy , EGy)
        assertEquals(exagray, EGy)
    }    
    
          
    @Test
    fun testGrayPGyTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PGy.value, Gy.value*myPow, EPS)
        assertEquals(1.petagray.value, Gy.value*myPow)
        assertEquals(1.PGy , PGy)
        assertEquals(petagray, PGy)
    }    
    
          
    @Test
    fun testGrayTGyTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TGy.value, Gy.value*myPow, EPS)
        assertEquals(1.teragray.value, Gy.value*myPow)
        assertEquals(1.TGy , TGy)
        assertEquals(teragray, TGy)
    }    
    
          
    @Test
    fun testGrayGGyTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GGy.value, Gy.value*myPow, EPS)
        assertEquals(1.gigagray.value, Gy.value*myPow)
        assertEquals(1.GGy , GGy)
        assertEquals(gigagray, GGy)
    }    
    
          
    @Test
    fun testGrayMGyTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MGy.value, Gy.value*myPow, EPS)
        assertEquals(1.megagray.value, Gy.value*myPow)
        assertEquals(1.MGy , MGy)
        assertEquals(megagray, MGy)
    }    
    
          
    @Test
    fun testGrayK1GyTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kGy.value, Gy.value*myPow, EPS)
        assertEquals(1.kilogray.value, Gy.value*myPow)
        assertEquals(1.kGy , kGy)
        assertEquals(kilogray, kGy)
    }    
    
          
    @Test
    fun testGrayH1GyTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hGy.value, Gy.value*myPow, EPS)
        assertEquals(1.hectogray.value, Gy.value*myPow)
        assertEquals(1.hGy , hGy)
        assertEquals(hectogray, hGy)
    }    
    
          
    @Test
    fun testGrayDA1GyTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daGy.value, Gy.value*myPow, EPS)
        assertEquals(1.decagray.value, Gy.value*myPow)
        assertEquals(1.daGy , daGy)
        assertEquals(decagray, daGy)
    }    
    
          
    @Test
    fun testGrayD1GyTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dGy.value, Gy.value*myPow, EPS)
        assertEquals(1.decigray.value, Gy.value*myPow)
        assertEquals(1.dGy , dGy)
        assertEquals(decigray, dGy)
    }    
    
          
    @Test
    fun testGrayC1GyTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cGy.value, Gy.value*myPow, EPS)
        assertEquals(1.centigray.value, Gy.value*myPow)
        assertEquals(1.cGy , cGy)
        assertEquals(centigray, cGy)
    }    
    
          
    @Test
    fun testGrayM1GyTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mGy.value, Gy.value*myPow, EPS)
        assertEquals(1.milligray.value, Gy.value*myPow)
        assertEquals(1.mGy , mGy)
        assertEquals(milligray, mGy)
    }    
    
          
    @Test
    fun testGrayΜ1GyTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μGy.value, Gy.value*myPow, EPS)
        assertEquals(1.microgray.value, Gy.value*myPow)
        assertEquals(1.μGy , μGy)
        assertEquals(microgray, μGy)
    }    
    
          
    @Test
    fun testGrayN1GyTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nGy.value, Gy.value*myPow, EPS)
        assertEquals(1.nanogray.value, Gy.value*myPow)
        assertEquals(1.nGy , nGy)
        assertEquals(nanogray, nGy)
    }    
    
          
    @Test
    fun testGrayP1GyTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pGy.value, Gy.value*myPow, EPS)
        assertEquals(1.picogray.value, Gy.value*myPow)
        assertEquals(1.pGy , pGy)
        assertEquals(picogray, pGy)
    }    
    
          
    @Test
    fun testGrayF1GyTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fGy.value, Gy.value*myPow, EPS)
        assertEquals(1.femtogray.value, Gy.value*myPow)
        assertEquals(1.fGy , fGy)
        assertEquals(femtogray, fGy)
    }    
    
          
    @Test
    fun testGrayA1GyTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aGy.value, Gy.value*myPow, EPS)
        assertEquals(1.attogray.value, Gy.value*myPow)
        assertEquals(1.aGy , aGy)
        assertEquals(attogray, aGy)
    }    
    
          
    @Test
    fun testGrayZ1GyTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zGy.value, Gy.value*myPow, EPS)
        assertEquals(1.zeptogray.value, Gy.value*myPow)
        assertEquals(1.zGy , zGy)
        assertEquals(zeptogray, zGy)
    }    
    
          
    @Test
    fun testGrayY1GyTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yGy.value, Gy.value*myPow, EPS)
        assertEquals(1.yoctogray.value, Gy.value*myPow)
        assertEquals(1.yGy , yGy)
        assertEquals(yoctogray, yGy)
    }    
    
          
    @Test
    fun testGrayR1GyTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rGy.value, Gy.value*myPow, EPS)
        assertEquals(1.rontogray.value, Gy.value*myPow)
        assertEquals(1.rGy , rGy)
        assertEquals(rontogray, rGy)
    }    
    
          
    @Test
    fun testGrayQ1GyTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qGy.value, Gy.value*myPow, EPS)
        assertEquals(1.quectogray.value, Gy.value*myPow)
        assertEquals(1.qGy , qGy)
        assertEquals(quectogray, qGy)
    }    
    }