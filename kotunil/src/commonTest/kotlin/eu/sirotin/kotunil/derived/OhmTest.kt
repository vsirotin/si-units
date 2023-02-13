        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class OhmTest {

    @Test
    fun testOhmMainTest() {
        assertEquals(1.Ω , Ω)
    }
              
    @Test
    fun testOhmQΩTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.quettaohm.value, Ω.value*myPow)
        assertEquals(1.QΩ , QΩ)
        assertEquals(quettaohm, QΩ)
    }    
    
          
    @Test
    fun testOhmRΩTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.ronnaohm.value, Ω.value*myPow)
        assertEquals(1.RΩ , RΩ)
        assertEquals(ronnaohm, RΩ)
    }    
    
          
    @Test
    fun testOhmYΩTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.yottaohm.value, Ω.value*myPow)
        assertEquals(1.YΩ , YΩ)
        assertEquals(yottaohm, YΩ)
    }    
    
          
    @Test
    fun testOhmZΩTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.zettaohm.value, Ω.value*myPow)
        assertEquals(1.ZΩ , ZΩ)
        assertEquals(zettaohm, ZΩ)
    }    
    
          
    @Test
    fun testOhmEΩTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.exaohm.value, Ω.value*myPow)
        assertEquals(1.EΩ , EΩ)
        assertEquals(exaohm, EΩ)
    }    
    
          
    @Test
    fun testOhmPΩTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.petaohm.value, Ω.value*myPow)
        assertEquals(1.PΩ , PΩ)
        assertEquals(petaohm, PΩ)
    }    
    
          
    @Test
    fun testOhmTΩTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.teraohm.value, Ω.value*myPow)
        assertEquals(1.TΩ , TΩ)
        assertEquals(teraohm, TΩ)
    }    
    
          
    @Test
    fun testOhmGΩTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.gigaohm.value, Ω.value*myPow)
        assertEquals(1.GΩ , GΩ)
        assertEquals(gigaohm, GΩ)
    }    
    
          
    @Test
    fun testOhmMΩTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.megaohm.value, Ω.value*myPow)
        assertEquals(1.MΩ , MΩ)
        assertEquals(megaohm, MΩ)
    }    
    
          
    @Test
    fun testOhmK1ΩTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.kiloohm.value, Ω.value*myPow)
        assertEquals(1.kΩ , kΩ)
        assertEquals(kiloohm, kΩ)
    }    
    
          
    @Test
    fun testOhmH1ΩTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.hectoohm.value, Ω.value*myPow)
        assertEquals(1.hΩ , hΩ)
        assertEquals(hectoohm, hΩ)
    }    
    
          
    @Test
    fun testOhmDA1ΩTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.decaohm.value, Ω.value*myPow)
        assertEquals(1.daΩ , daΩ)
        assertEquals(decaohm, daΩ)
    }    
    
          
    @Test
    fun testOhmD1ΩTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.deciohm.value, Ω.value*myPow)
        assertEquals(1.dΩ , dΩ)
        assertEquals(deciohm, dΩ)
    }    
    
          
    @Test
    fun testOhmC1ΩTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.centiohm.value, Ω.value*myPow)
        assertEquals(1.cΩ , cΩ)
        assertEquals(centiohm, cΩ)
    }    
    
          
    @Test
    fun testOhmM1ΩTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.milliohm.value, Ω.value*myPow)
        assertEquals(1.mΩ , mΩ)
        assertEquals(milliohm, mΩ)
    }    
    
          
    @Test
    fun testOhmΜ1ΩTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.microohm.value, Ω.value*myPow)
        assertEquals(1.μΩ , μΩ)
        assertEquals(microohm, μΩ)
    }    
    
          
    @Test
    fun testOhmN1ΩTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.nanoohm.value, Ω.value*myPow)
        assertEquals(1.nΩ , nΩ)
        assertEquals(nanoohm, nΩ)
    }    
    
          
    @Test
    fun testOhmP1ΩTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.picoohm.value, Ω.value*myPow)
        assertEquals(1.pΩ , pΩ)
        assertEquals(picoohm, pΩ)
    }    
    
          
    @Test
    fun testOhmF1ΩTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.femtoohm.value, Ω.value*myPow)
        assertEquals(1.fΩ , fΩ)
        assertEquals(femtoohm, fΩ)
    }    
    
          
    @Test
    fun testOhmA1ΩTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.attoohm.value, Ω.value*myPow)
        assertEquals(1.aΩ , aΩ)
        assertEquals(attoohm, aΩ)
    }    
    
          
    @Test
    fun testOhmZ1ΩTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.zeptoohm.value, Ω.value*myPow)
        assertEquals(1.zΩ , zΩ)
        assertEquals(zeptoohm, zΩ)
    }    
    
          
    @Test
    fun testOhmY1ΩTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.yoctoohm.value, Ω.value*myPow)
        assertEquals(1.yΩ , yΩ)
        assertEquals(yoctoohm, yΩ)
    }    
    
          
    @Test
    fun testOhmR1ΩTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.rontoohm.value, Ω.value*myPow)
        assertEquals(1.rΩ , rΩ)
        assertEquals(rontoohm, rΩ)
    }    
    
          
    @Test
    fun testOhmQ1ΩTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qΩ.value, Ω.value*myPow, EPS)
        assertEquals(1.quectoohm.value, Ω.value*myPow)
        assertEquals(1.qΩ , qΩ)
        assertEquals(quectoohm, qΩ)
    }    
    }