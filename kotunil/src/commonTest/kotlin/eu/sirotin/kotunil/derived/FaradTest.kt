        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class FaradTest {

    @Test
    fun testFaradMainTest1() {
        assertEquals(1.F , F)
    }
    
     @Test
    fun testFaradMainTest2() {
        assertEquals(12.3.F , Farad(12.3).expression)
    }
              
    @Test
    fun testFaradQFTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QF.value, F.value*myPow, EPS)
        assertEquals(1.quettafarad.value, F.value*myPow)
        assertEquals(1.QF , QF)
        assertEquals(quettafarad, QF)
    }    
    
          
    @Test
    fun testFaradRFTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RF.value, F.value*myPow, EPS)
        assertEquals(1.ronnafarad.value, F.value*myPow)
        assertEquals(1.RF , RF)
        assertEquals(ronnafarad, RF)
    }    
    
          
    @Test
    fun testFaradYFTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YF.value, F.value*myPow, EPS)
        assertEquals(1.yottafarad.value, F.value*myPow)
        assertEquals(1.YF , YF)
        assertEquals(yottafarad, YF)
    }    
    
          
    @Test
    fun testFaradZFTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZF.value, F.value*myPow, EPS)
        assertEquals(1.zettafarad.value, F.value*myPow)
        assertEquals(1.ZF , ZF)
        assertEquals(zettafarad, ZF)
    }    
    
          
    @Test
    fun testFaradEFTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EF.value, F.value*myPow, EPS)
        assertEquals(1.exafarad.value, F.value*myPow)
        assertEquals(1.EF , EF)
        assertEquals(exafarad, EF)
    }    
    
          
    @Test
    fun testFaradPFTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PF.value, F.value*myPow, EPS)
        assertEquals(1.petafarad.value, F.value*myPow)
        assertEquals(1.PF , PF)
        assertEquals(petafarad, PF)
    }    
    
          
    @Test
    fun testFaradTFTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TF.value, F.value*myPow, EPS)
        assertEquals(1.terafarad.value, F.value*myPow)
        assertEquals(1.TF , TF)
        assertEquals(terafarad, TF)
    }    
    
          
    @Test
    fun testFaradGFTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GF.value, F.value*myPow, EPS)
        assertEquals(1.gigafarad.value, F.value*myPow)
        assertEquals(1.GF , GF)
        assertEquals(gigafarad, GF)
    }    
    
          
    @Test
    fun testFaradMFTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MF.value, F.value*myPow, EPS)
        assertEquals(1.megafarad.value, F.value*myPow)
        assertEquals(1.MF , MF)
        assertEquals(megafarad, MF)
    }    
    
          
    @Test
    fun testFaradK1FTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kF.value, F.value*myPow, EPS)
        assertEquals(1.kilofarad.value, F.value*myPow)
        assertEquals(1.kF , kF)
        assertEquals(kilofarad, kF)
    }    
    
          
    @Test
    fun testFaradH1FTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hF.value, F.value*myPow, EPS)
        assertEquals(1.hectofarad.value, F.value*myPow)
        assertEquals(1.hF , hF)
        assertEquals(hectofarad, hF)
    }    
    
          
    @Test
    fun testFaradDA1FTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daF.value, F.value*myPow, EPS)
        assertEquals(1.decafarad.value, F.value*myPow)
        assertEquals(1.daF , daF)
        assertEquals(decafarad, daF)
    }    
    
          
    @Test
    fun testFaradD1FTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dF.value, F.value*myPow, EPS)
        assertEquals(1.decifarad.value, F.value*myPow)
        assertEquals(1.dF , dF)
        assertEquals(decifarad, dF)
    }    
    
          
    @Test
    fun testFaradC1FTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cF.value, F.value*myPow, EPS)
        assertEquals(1.centifarad.value, F.value*myPow)
        assertEquals(1.cF , cF)
        assertEquals(centifarad, cF)
    }    
    
          
    @Test
    fun testFaradM1FTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mF.value, F.value*myPow, EPS)
        assertEquals(1.millifarad.value, F.value*myPow)
        assertEquals(1.mF , mF)
        assertEquals(millifarad, mF)
    }    
    
          
    @Test
    fun testFaradΜ1FTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μF.value, F.value*myPow, EPS)
        assertEquals(1.microfarad.value, F.value*myPow)
        assertEquals(1.μF , μF)
        assertEquals(microfarad, μF)
    }    
    
          
    @Test
    fun testFaradN1FTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nF.value, F.value*myPow, EPS)
        assertEquals(1.nanofarad.value, F.value*myPow)
        assertEquals(1.nF , nF)
        assertEquals(nanofarad, nF)
    }    
    
          
    @Test
    fun testFaradP1FTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pF.value, F.value*myPow, EPS)
        assertEquals(1.picofarad.value, F.value*myPow)
        assertEquals(1.pF , pF)
        assertEquals(picofarad, pF)
    }    
    
          
    @Test
    fun testFaradF1FTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fF.value, F.value*myPow, EPS)
        assertEquals(1.femtofarad.value, F.value*myPow)
        assertEquals(1.fF , fF)
        assertEquals(femtofarad, fF)
    }    
    
          
    @Test
    fun testFaradA1FTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aF.value, F.value*myPow, EPS)
        assertEquals(1.attofarad.value, F.value*myPow)
        assertEquals(1.aF , aF)
        assertEquals(attofarad, aF)
    }    
    
          
    @Test
    fun testFaradZ1FTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zF.value, F.value*myPow, EPS)
        assertEquals(1.zeptofarad.value, F.value*myPow)
        assertEquals(1.zF , zF)
        assertEquals(zeptofarad, zF)
    }    
    
          
    @Test
    fun testFaradY1FTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yF.value, F.value*myPow, EPS)
        assertEquals(1.yoctofarad.value, F.value*myPow)
        assertEquals(1.yF , yF)
        assertEquals(yoctofarad, yF)
    }    
    
          
    @Test
    fun testFaradR1FTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rF.value, F.value*myPow, EPS)
        assertEquals(1.rontofarad.value, F.value*myPow)
        assertEquals(1.rF , rF)
        assertEquals(rontofarad, rF)
    }    
    
          
    @Test
    fun testFaradQ1FTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qF.value, F.value*myPow, EPS)
        assertEquals(1.quectofarad.value, F.value*myPow)
        assertEquals(1.qF , qF)
        assertEquals(quectofarad, qF)
    }    
    }