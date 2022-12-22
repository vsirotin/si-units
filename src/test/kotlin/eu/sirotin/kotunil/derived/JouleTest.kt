        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class JouleTest {

    @Test
    fun testJouleMainTest() {
        assertEquals(1.J , J)
    }
              
    @Test
    fun testJouleQJTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QJ.value, J.value*myPow, EPS)
        assertEquals(1.quettajoule.value, J.value*myPow)
        assertEquals(1.QJ , QJ)
        assertEquals(quettajoule, QJ)
    }    
    
          
    @Test
    fun testJouleRJTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RJ.value, J.value*myPow, EPS)
        assertEquals(1.ronnajoule.value, J.value*myPow)
        assertEquals(1.RJ , RJ)
        assertEquals(ronnajoule, RJ)
    }    
    
          
    @Test
    fun testJouleYJTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YJ.value, J.value*myPow, EPS)
        assertEquals(1.yottajoule.value, J.value*myPow)
        assertEquals(1.YJ , YJ)
        assertEquals(yottajoule, YJ)
    }    
    
          
    @Test
    fun testJouleZJTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZJ.value, J.value*myPow, EPS)
        assertEquals(1.zettajoule.value, J.value*myPow)
        assertEquals(1.ZJ , ZJ)
        assertEquals(zettajoule, ZJ)
    }    
    
          
    @Test
    fun testJouleEJTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EJ.value, J.value*myPow, EPS)
        assertEquals(1.exajoule.value, J.value*myPow)
        assertEquals(1.EJ , EJ)
        assertEquals(exajoule, EJ)
    }    
    
          
    @Test
    fun testJoulePJTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PJ.value, J.value*myPow, EPS)
        assertEquals(1.petajoule.value, J.value*myPow)
        assertEquals(1.PJ , PJ)
        assertEquals(petajoule, PJ)
    }    
    
          
    @Test
    fun testJouleTJTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TJ.value, J.value*myPow, EPS)
        assertEquals(1.terajoule.value, J.value*myPow)
        assertEquals(1.TJ , TJ)
        assertEquals(terajoule, TJ)
    }    
    
          
    @Test
    fun testJouleGJTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GJ.value, J.value*myPow, EPS)
        assertEquals(1.gigajoule.value, J.value*myPow)
        assertEquals(1.GJ , GJ)
        assertEquals(gigajoule, GJ)
    }    
    
          
    @Test
    fun testJouleMJTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MJ.value, J.value*myPow, EPS)
        assertEquals(1.megajoule.value, J.value*myPow)
        assertEquals(1.MJ , MJ)
        assertEquals(megajoule, MJ)
    }    
    
          
    @Test
    fun testJouleK1JTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kJ.value, J.value*myPow, EPS)
        assertEquals(1.kilojoule.value, J.value*myPow)
        assertEquals(1.kJ , kJ)
        assertEquals(kilojoule, kJ)
    }    
    
          
    @Test
    fun testJouleH1JTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hJ.value, J.value*myPow, EPS)
        assertEquals(1.hectojoule.value, J.value*myPow)
        assertEquals(1.hJ , hJ)
        assertEquals(hectojoule, hJ)
    }    
    
          
    @Test
    fun testJouleDA1JTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daJ.value, J.value*myPow, EPS)
        assertEquals(1.decajoule.value, J.value*myPow)
        assertEquals(1.daJ , daJ)
        assertEquals(decajoule, daJ)
    }    
    
          
    @Test
    fun testJouleD1JTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dJ.value, J.value*myPow, EPS)
        assertEquals(1.decijoule.value, J.value*myPow)
        assertEquals(1.dJ , dJ)
        assertEquals(decijoule, dJ)
    }    
    
          
    @Test
    fun testJouleC1JTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cJ.value, J.value*myPow, EPS)
        assertEquals(1.centijoule.value, J.value*myPow)
        assertEquals(1.cJ , cJ)
        assertEquals(centijoule, cJ)
    }    
    
          
    @Test
    fun testJouleM1JTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mJ.value, J.value*myPow, EPS)
        assertEquals(1.millijoule.value, J.value*myPow)
        assertEquals(1.mJ , mJ)
        assertEquals(millijoule, mJ)
    }    
    
          
    @Test
    fun testJouleΜ1JTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μJ.value, J.value*myPow, EPS)
        assertEquals(1.microjoule.value, J.value*myPow)
        assertEquals(1.μJ , μJ)
        assertEquals(microjoule, μJ)
    }    
    
          
    @Test
    fun testJouleN1JTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nJ.value, J.value*myPow, EPS)
        assertEquals(1.nanojoule.value, J.value*myPow)
        assertEquals(1.nJ , nJ)
        assertEquals(nanojoule, nJ)
    }    
    
          
    @Test
    fun testJouleP1JTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pJ.value, J.value*myPow, EPS)
        assertEquals(1.picojoule.value, J.value*myPow)
        assertEquals(1.pJ , pJ)
        assertEquals(picojoule, pJ)
    }    
    
          
    @Test
    fun testJouleF1JTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fJ.value, J.value*myPow, EPS)
        assertEquals(1.femtojoule.value, J.value*myPow)
        assertEquals(1.fJ , fJ)
        assertEquals(femtojoule, fJ)
    }    
    
          
    @Test
    fun testJouleA1JTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aJ.value, J.value*myPow, EPS)
        assertEquals(1.attojoule.value, J.value*myPow)
        assertEquals(1.aJ , aJ)
        assertEquals(attojoule, aJ)
    }    
    
          
    @Test
    fun testJouleZ1JTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zJ.value, J.value*myPow, EPS)
        assertEquals(1.zeptojoule.value, J.value*myPow)
        assertEquals(1.zJ , zJ)
        assertEquals(zeptojoule, zJ)
    }    
    
          
    @Test
    fun testJouleY1JTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yJ.value, J.value*myPow, EPS)
        assertEquals(1.yoctojoule.value, J.value*myPow)
        assertEquals(1.yJ , yJ)
        assertEquals(yoctojoule, yJ)
    }    
    
          
    @Test
    fun testJouleR1JTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rJ.value, J.value*myPow, EPS)
        assertEquals(1.rontojoule.value, J.value*myPow)
        assertEquals(1.rJ , rJ)
        assertEquals(rontojoule, rJ)
    }    
    
          
    @Test
    fun testJouleQ1JTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qJ.value, J.value*myPow, EPS)
        assertEquals(1.quectojoule.value, J.value*myPow)
        assertEquals(1.qJ , qJ)
        assertEquals(quectojoule, qJ)
    }    
    }