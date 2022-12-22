        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class LumenTest {

    @Test
    fun testLumenMainTest() {
        assertEquals(1.lm , lm)
    }
              
    @Test
    fun testLumenQlmTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.Qlm.value, lm.value*myPow, EPS)
        assertEquals(1.quettalumen.value, lm.value*myPow)
        assertEquals(1.Qlm , Qlm)
        assertEquals(quettalumen, Qlm)
    }    
    
          
    @Test
    fun testLumenRlmTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.Rlm.value, lm.value*myPow, EPS)
        assertEquals(1.ronnalumen.value, lm.value*myPow)
        assertEquals(1.Rlm , Rlm)
        assertEquals(ronnalumen, Rlm)
    }    
    
          
    @Test
    fun testLumenYlmTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.Ylm.value, lm.value*myPow, EPS)
        assertEquals(1.yottalumen.value, lm.value*myPow)
        assertEquals(1.Ylm , Ylm)
        assertEquals(yottalumen, Ylm)
    }    
    
          
    @Test
    fun testLumenZlmTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.Zlm.value, lm.value*myPow, EPS)
        assertEquals(1.zettalumen.value, lm.value*myPow)
        assertEquals(1.Zlm , Zlm)
        assertEquals(zettalumen, Zlm)
    }    
    
          
    @Test
    fun testLumenElmTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.Elm.value, lm.value*myPow, EPS)
        assertEquals(1.exalumen.value, lm.value*myPow)
        assertEquals(1.Elm , Elm)
        assertEquals(exalumen, Elm)
    }    
    
          
    @Test
    fun testLumenPlmTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.Plm.value, lm.value*myPow, EPS)
        assertEquals(1.petalumen.value, lm.value*myPow)
        assertEquals(1.Plm , Plm)
        assertEquals(petalumen, Plm)
    }    
    
          
    @Test
    fun testLumenTlmTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.Tlm.value, lm.value*myPow, EPS)
        assertEquals(1.teralumen.value, lm.value*myPow)
        assertEquals(1.Tlm , Tlm)
        assertEquals(teralumen, Tlm)
    }    
    
          
    @Test
    fun testLumenGlmTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.Glm.value, lm.value*myPow, EPS)
        assertEquals(1.gigalumen.value, lm.value*myPow)
        assertEquals(1.Glm , Glm)
        assertEquals(gigalumen, Glm)
    }    
    
          
    @Test
    fun testLumenMlmTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.Mlm.value, lm.value*myPow, EPS)
        assertEquals(1.megalumen.value, lm.value*myPow)
        assertEquals(1.Mlm , Mlm)
        assertEquals(megalumen, Mlm)
    }    
    
          
    @Test
    fun testLumenK1lmTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.klm.value, lm.value*myPow, EPS)
        assertEquals(1.kilolumen.value, lm.value*myPow)
        assertEquals(1.klm , klm)
        assertEquals(kilolumen, klm)
    }    
    
          
    @Test
    fun testLumenH1lmTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hlm.value, lm.value*myPow, EPS)
        assertEquals(1.hectolumen.value, lm.value*myPow)
        assertEquals(1.hlm , hlm)
        assertEquals(hectolumen, hlm)
    }    
    
          
    @Test
    fun testLumenDA1lmTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.dalm.value, lm.value*myPow, EPS)
        assertEquals(1.decalumen.value, lm.value*myPow)
        assertEquals(1.dalm , dalm)
        assertEquals(decalumen, dalm)
    }    
    
          
    @Test
    fun testLumenD1lmTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dlm.value, lm.value*myPow, EPS)
        assertEquals(1.decilumen.value, lm.value*myPow)
        assertEquals(1.dlm , dlm)
        assertEquals(decilumen, dlm)
    }    
    
          
    @Test
    fun testLumenC1lmTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.clm.value, lm.value*myPow, EPS)
        assertEquals(1.centilumen.value, lm.value*myPow)
        assertEquals(1.clm , clm)
        assertEquals(centilumen, clm)
    }    
    
          
    @Test
    fun testLumenM1lmTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mlm.value, lm.value*myPow, EPS)
        assertEquals(1.millilumen.value, lm.value*myPow)
        assertEquals(1.mlm , mlm)
        assertEquals(millilumen, mlm)
    }    
    
          
    @Test
    fun testLumenΜ1lmTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μlm.value, lm.value*myPow, EPS)
        assertEquals(1.microlumen.value, lm.value*myPow)
        assertEquals(1.μlm , μlm)
        assertEquals(microlumen, μlm)
    }    
    
          
    @Test
    fun testLumenN1lmTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nlm.value, lm.value*myPow, EPS)
        assertEquals(1.nanolumen.value, lm.value*myPow)
        assertEquals(1.nlm , nlm)
        assertEquals(nanolumen, nlm)
    }    
    
          
    @Test
    fun testLumenP1lmTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.plm.value, lm.value*myPow, EPS)
        assertEquals(1.picolumen.value, lm.value*myPow)
        assertEquals(1.plm , plm)
        assertEquals(picolumen, plm)
    }    
    
          
    @Test
    fun testLumenF1lmTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.flm.value, lm.value*myPow, EPS)
        assertEquals(1.femtolumen.value, lm.value*myPow)
        assertEquals(1.flm , flm)
        assertEquals(femtolumen, flm)
    }    
    
          
    @Test
    fun testLumenA1lmTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.alm.value, lm.value*myPow, EPS)
        assertEquals(1.attolumen.value, lm.value*myPow)
        assertEquals(1.alm , alm)
        assertEquals(attolumen, alm)
    }    
    
          
    @Test
    fun testLumenZ1lmTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zlm.value, lm.value*myPow, EPS)
        assertEquals(1.zeptolumen.value, lm.value*myPow)
        assertEquals(1.zlm , zlm)
        assertEquals(zeptolumen, zlm)
    }    
    
          
    @Test
    fun testLumenY1lmTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.ylm.value, lm.value*myPow, EPS)
        assertEquals(1.yoctolumen.value, lm.value*myPow)
        assertEquals(1.ylm , ylm)
        assertEquals(yoctolumen, ylm)
    }    
    
          
    @Test
    fun testLumenR1lmTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rlm.value, lm.value*myPow, EPS)
        assertEquals(1.rontolumen.value, lm.value*myPow)
        assertEquals(1.rlm , rlm)
        assertEquals(rontolumen, rlm)
    }    
    
          
    @Test
    fun testLumenQ1lmTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qlm.value, lm.value*myPow, EPS)
        assertEquals(1.quectolumen.value, lm.value*myPow)
        assertEquals(1.qlm , qlm)
        assertEquals(quectolumen, qlm)
    }    
    }