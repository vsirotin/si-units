        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class NewtonTest {

    @Test
    fun testNewtonMainTest() {
        assertEquals(1.N , N)
    }
              
    @Test
    fun testNewtonQNTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QN.value, N.value*myPow, EPS)
        assertEquals(1.quettanewton.value, N.value*myPow)
        assertEquals(1.QN , QN)
        assertEquals(quettanewton, QN)
    }    
    
          
    @Test
    fun testNewtonRNTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RN.value, N.value*myPow, EPS)
        assertEquals(1.ronnanewton.value, N.value*myPow)
        assertEquals(1.RN , RN)
        assertEquals(ronnanewton, RN)
    }    
    
          
    @Test
    fun testNewtonYNTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YN.value, N.value*myPow, EPS)
        assertEquals(1.yottanewton.value, N.value*myPow)
        assertEquals(1.YN , YN)
        assertEquals(yottanewton, YN)
    }    
    
          
    @Test
    fun testNewtonZNTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZN.value, N.value*myPow, EPS)
        assertEquals(1.zettanewton.value, N.value*myPow)
        assertEquals(1.ZN , ZN)
        assertEquals(zettanewton, ZN)
    }    
    
          
    @Test
    fun testNewtonENTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EN.value, N.value*myPow, EPS)
        assertEquals(1.exanewton.value, N.value*myPow)
        assertEquals(1.EN , EN)
        assertEquals(exanewton, EN)
    }    
    
          
    @Test
    fun testNewtonPNTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PN.value, N.value*myPow, EPS)
        assertEquals(1.petanewton.value, N.value*myPow)
        assertEquals(1.PN , PN)
        assertEquals(petanewton, PN)
    }    
    
          
    @Test
    fun testNewtonTNTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TN.value, N.value*myPow, EPS)
        assertEquals(1.teranewton.value, N.value*myPow)
        assertEquals(1.TN , TN)
        assertEquals(teranewton, TN)
    }    
    
          
    @Test
    fun testNewtonGNTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GN.value, N.value*myPow, EPS)
        assertEquals(1.giganewton.value, N.value*myPow)
        assertEquals(1.GN , GN)
        assertEquals(giganewton, GN)
    }    
    
          
    @Test
    fun testNewtonMNTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MN.value, N.value*myPow, EPS)
        assertEquals(1.meganewton.value, N.value*myPow)
        assertEquals(1.MN , MN)
        assertEquals(meganewton, MN)
    }    
    
          
    @Test
    fun testNewtonK1NTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kN.value, N.value*myPow, EPS)
        assertEquals(1.kilonewton.value, N.value*myPow)
        assertEquals(1.kN , kN)
        assertEquals(kilonewton, kN)
    }    
    
          
    @Test
    fun testNewtonH1NTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hN.value, N.value*myPow, EPS)
        assertEquals(1.hectonewton.value, N.value*myPow)
        assertEquals(1.hN , hN)
        assertEquals(hectonewton, hN)
    }    
    
          
    @Test
    fun testNewtonDA1NTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daN.value, N.value*myPow, EPS)
        assertEquals(1.decanewton.value, N.value*myPow)
        assertEquals(1.daN , daN)
        assertEquals(decanewton, daN)
    }    
    
          
    @Test
    fun testNewtonD1NTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dN.value, N.value*myPow, EPS)
        assertEquals(1.decinewton.value, N.value*myPow)
        assertEquals(1.dN , dN)
        assertEquals(decinewton, dN)
    }    
    
          
    @Test
    fun testNewtonC1NTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cN.value, N.value*myPow, EPS)
        assertEquals(1.centinewton.value, N.value*myPow)
        assertEquals(1.cN , cN)
        assertEquals(centinewton, cN)
    }    
    
          
    @Test
    fun testNewtonM1NTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mN.value, N.value*myPow, EPS)
        assertEquals(1.millinewton.value, N.value*myPow)
        assertEquals(1.mN , mN)
        assertEquals(millinewton, mN)
    }    
    
          
    @Test
    fun testNewtonΜ1NTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μN.value, N.value*myPow, EPS)
        assertEquals(1.micronewton.value, N.value*myPow)
        assertEquals(1.μN , μN)
        assertEquals(micronewton, μN)
    }    
    
          
    @Test
    fun testNewtonN1NTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nN.value, N.value*myPow, EPS)
        assertEquals(1.nanonewton.value, N.value*myPow)
        assertEquals(1.nN , nN)
        assertEquals(nanonewton, nN)
    }    
    
          
    @Test
    fun testNewtonP1NTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pN.value, N.value*myPow, EPS)
        assertEquals(1.piconewton.value, N.value*myPow)
        assertEquals(1.pN , pN)
        assertEquals(piconewton, pN)
    }    
    
          
    @Test
    fun testNewtonF1NTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fN.value, N.value*myPow, EPS)
        assertEquals(1.femtonewton.value, N.value*myPow)
        assertEquals(1.fN , fN)
        assertEquals(femtonewton, fN)
    }    
    
          
    @Test
    fun testNewtonA1NTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aN.value, N.value*myPow, EPS)
        assertEquals(1.attonewton.value, N.value*myPow)
        assertEquals(1.aN , aN)
        assertEquals(attonewton, aN)
    }    
    
          
    @Test
    fun testNewtonZ1NTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zN.value, N.value*myPow, EPS)
        assertEquals(1.zeptonewton.value, N.value*myPow)
        assertEquals(1.zN , zN)
        assertEquals(zeptonewton, zN)
    }    
    
          
    @Test
    fun testNewtonY1NTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yN.value, N.value*myPow, EPS)
        assertEquals(1.yoctonewton.value, N.value*myPow)
        assertEquals(1.yN , yN)
        assertEquals(yoctonewton, yN)
    }    
    
          
    @Test
    fun testNewtonR1NTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rN.value, N.value*myPow, EPS)
        assertEquals(1.rontonewton.value, N.value*myPow)
        assertEquals(1.rN , rN)
        assertEquals(rontonewton, rN)
    }    
    
          
    @Test
    fun testNewtonQ1NTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qN.value, N.value*myPow, EPS)
        assertEquals(1.quectonewton.value, N.value*myPow)
        assertEquals(1.qN , qN)
        assertEquals(quectonewton, qN)
    }    
    }