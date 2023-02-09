        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.EPS
import eu.sirotin.kotunil.core.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class CandelaTest {

    @Test
    fun testCandelaMainTest() {
        assertEquals(Candela(1.0), cd)
        assertEquals(1.cd , cd)
    }
    
       @Test
    fun testCandelaSerializationTest() {
        //Serialization
        val v1 = Candela(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Candela(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        assertEquals(v1 , v2)
    }
    
              
    @Test
    fun testCandelaQcdTest() {
        val myPow = 10.0.pow(30)
        assertEquals(myPow * Candela(1.0), 1.Qcd)
        assertEquals(myPow * Candela(1.0), 1.quettacandela)
        assertEquals(1.cd.Qcd , cd.value/myPow, EPS)
        assertEquals(1.cd.quettacandela , cd.value/myPow, EPS)
        assertEquals(1.Qcd , Qcd)
        assertEquals(quettacandela , Qcd)
    }    
    
          
    @Test
    fun testCandelaRcdTest() {
        val myPow = 10.0.pow(27)
        assertEquals(myPow * Candela(1.0), 1.Rcd)
        assertEquals(myPow * Candela(1.0), 1.ronnacandela)
        assertEquals(1.cd.Rcd , cd.value/myPow, EPS)
        assertEquals(1.cd.ronnacandela , cd.value/myPow, EPS)
        assertEquals(1.Rcd , Rcd)
        assertEquals(ronnacandela , Rcd)
    }    
    
          
    @Test
    fun testCandelaYcdTest() {
        val myPow = 10.0.pow(24)
        assertEquals(myPow * Candela(1.0), 1.Ycd)
        assertEquals(myPow * Candela(1.0), 1.yottacandela)
        assertEquals(1.cd.Ycd , cd.value/myPow, EPS)
        assertEquals(1.cd.yottacandela , cd.value/myPow, EPS)
        assertEquals(1.Ycd , Ycd)
        assertEquals(yottacandela , Ycd)
    }    
    
          
    @Test
    fun testCandelaZcdTest() {
        val myPow = 10.0.pow(21)
        assertEquals(myPow * Candela(1.0), 1.Zcd)
        assertEquals(myPow * Candela(1.0), 1.zettacandela)
        assertEquals(1.cd.Zcd , cd.value/myPow, EPS)
        assertEquals(1.cd.zettacandela , cd.value/myPow, EPS)
        assertEquals(1.Zcd , Zcd)
        assertEquals(zettacandela , Zcd)
    }    
    
          
    @Test
    fun testCandelaEcdTest() {
        val myPow = 10.0.pow(18)
        assertEquals(myPow * Candela(1.0), 1.Ecd)
        assertEquals(myPow * Candela(1.0), 1.exacandela)
        assertEquals(1.cd.Ecd , cd.value/myPow, EPS)
        assertEquals(1.cd.exacandela , cd.value/myPow, EPS)
        assertEquals(1.Ecd , Ecd)
        assertEquals(exacandela , Ecd)
    }    
    
          
    @Test
    fun testCandelaPcdTest() {
        val myPow = 10.0.pow(15)
        assertEquals(myPow * Candela(1.0), 1.Pcd)
        assertEquals(myPow * Candela(1.0), 1.petacandela)
        assertEquals(1.cd.Pcd , cd.value/myPow, EPS)
        assertEquals(1.cd.petacandela , cd.value/myPow, EPS)
        assertEquals(1.Pcd , Pcd)
        assertEquals(petacandela , Pcd)
    }    
    
          
    @Test
    fun testCandelaTcdTest() {
        val myPow = 10.0.pow(12)
        assertEquals(myPow * Candela(1.0), 1.Tcd)
        assertEquals(myPow * Candela(1.0), 1.teracandela)
        assertEquals(1.cd.Tcd , cd.value/myPow, EPS)
        assertEquals(1.cd.teracandela , cd.value/myPow, EPS)
        assertEquals(1.Tcd , Tcd)
        assertEquals(teracandela , Tcd)
    }    
    
          
    @Test
    fun testCandelaGcdTest() {
        val myPow = 10.0.pow(9)
        assertEquals(myPow * Candela(1.0), 1.Gcd)
        assertEquals(myPow * Candela(1.0), 1.gigacandela)
        assertEquals(1.cd.Gcd , cd.value/myPow, EPS)
        assertEquals(1.cd.gigacandela , cd.value/myPow, EPS)
        assertEquals(1.Gcd , Gcd)
        assertEquals(gigacandela , Gcd)
    }    
    
          
    @Test
    fun testCandelaMcdTest() {
        val myPow = 10.0.pow(6)
        assertEquals(myPow * Candela(1.0), 1.Mcd)
        assertEquals(myPow * Candela(1.0), 1.megacandela)
        assertEquals(1.cd.Mcd , cd.value/myPow, EPS)
        assertEquals(1.cd.megacandela , cd.value/myPow, EPS)
        assertEquals(1.Mcd , Mcd)
        assertEquals(megacandela , Mcd)
    }    
    
          
    @Test
    fun testCandelaK1cdTest() {
        val myPow = 10.0.pow(3)
        assertEquals(myPow * Candela(1.0), 1.kcd)
        assertEquals(myPow * Candela(1.0), 1.kilocandela)
        assertEquals(1.cd.kcd , cd.value/myPow, EPS)
        assertEquals(1.cd.kilocandela , cd.value/myPow, EPS)
        assertEquals(1.kcd , kcd)
        assertEquals(kilocandela , kcd)
    }    
    
          
    @Test
    fun testCandelaH1cdTest() {
        val myPow = 10.0.pow(2)
        assertEquals(myPow * Candela(1.0), 1.hcd)
        assertEquals(myPow * Candela(1.0), 1.hectocandela)
        assertEquals(1.cd.hcd , cd.value/myPow, EPS)
        assertEquals(1.cd.hectocandela , cd.value/myPow, EPS)
        assertEquals(1.hcd , hcd)
        assertEquals(hectocandela , hcd)
    }    
    
          
    @Test
    fun testCandelaDA1cdTest() {
        val myPow = 10.0.pow(1)
        assertEquals(myPow * Candela(1.0), 1.dacd)
        assertEquals(myPow * Candela(1.0), 1.decacandela)
        assertEquals(1.cd.dacd , cd.value/myPow, EPS)
        assertEquals(1.cd.decacandela , cd.value/myPow, EPS)
        assertEquals(1.dacd , dacd)
        assertEquals(decacandela , dacd)
    }    
    
          
    @Test
    fun testCandelaD1cdTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(myPow * Candela(1.0), 1.dcd)
        assertEquals(myPow * Candela(1.0), 1.decicandela)
        assertEquals(1.cd.dcd , cd.value/myPow, EPS)
        assertEquals(1.cd.decicandela , cd.value/myPow, EPS)
        assertEquals(1.dcd , dcd)
        assertEquals(decicandela , dcd)
    }    
    
          
    @Test
    fun testCandelaC1cdTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(myPow * Candela(1.0), 1.ccd)
        assertEquals(myPow * Candela(1.0), 1.centicandela)
        assertEquals(1.cd.ccd , cd.value/myPow, EPS)
        assertEquals(1.cd.centicandela , cd.value/myPow, EPS)
        assertEquals(1.ccd , ccd)
        assertEquals(centicandela , ccd)
    }    
    
          
    @Test
    fun testCandelaM1cdTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(myPow * Candela(1.0), 1.mcd)
        assertEquals(myPow * Candela(1.0), 1.millicandela)
        assertEquals(1.cd.mcd , cd.value/myPow, EPS)
        assertEquals(1.cd.millicandela , cd.value/myPow, EPS)
        assertEquals(1.mcd , mcd)
        assertEquals(millicandela , mcd)
    }    
    
          
    @Test
    fun testCandelaΜ1cdTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(myPow * Candela(1.0), 1.μcd)
        assertEquals(myPow * Candela(1.0), 1.microcandela)
        assertEquals(1.cd.μcd , cd.value/myPow, EPS)
        assertEquals(1.cd.microcandela , cd.value/myPow, EPS)
        assertEquals(1.μcd , μcd)
        assertEquals(microcandela , μcd)
    }    
    
          
    @Test
    fun testCandelaN1cdTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(myPow * Candela(1.0), 1.ncd)
        assertEquals(myPow * Candela(1.0), 1.nanocandela)
        assertEquals(1.cd.ncd , cd.value/myPow, EPS)
        assertEquals(1.cd.nanocandela , cd.value/myPow, EPS)
        assertEquals(1.ncd , ncd)
        assertEquals(nanocandela , ncd)
    }    
    
          
    @Test
    fun testCandelaP1cdTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(myPow * Candela(1.0), 1.pcd)
        assertEquals(myPow * Candela(1.0), 1.picocandela)
        assertEquals(1.cd.pcd , cd.value/myPow, EPS)
        assertEquals(1.cd.picocandela , cd.value/myPow, EPS)
        assertEquals(1.pcd , pcd)
        assertEquals(picocandela , pcd)
    }    
    
          
    @Test
    fun testCandelaF1cdTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(myPow * Candela(1.0), 1.fcd)
        assertEquals(myPow * Candela(1.0), 1.femtocandela)
        assertEquals(1.cd.fcd , cd.value/myPow, EPS)
        assertEquals(1.cd.femtocandela , cd.value/myPow, EPS)
        assertEquals(1.fcd , fcd)
        assertEquals(femtocandela , fcd)
    }    
    
          
    @Test
    fun testCandelaA1cdTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(myPow * Candela(1.0), 1.acd)
        assertEquals(myPow * Candela(1.0), 1.attocandela)
        assertEquals(1.cd.acd , cd.value/myPow, EPS)
        assertEquals(1.cd.attocandela , cd.value/myPow, EPS)
        assertEquals(1.acd , acd)
        assertEquals(attocandela , acd)
    }    
    
          
    @Test
    fun testCandelaZ1cdTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(myPow * Candela(1.0), 1.zcd)
        assertEquals(myPow * Candela(1.0), 1.zeptocandela)
        assertEquals(1.cd.zcd , cd.value/myPow, EPS)
        assertEquals(1.cd.zeptocandela , cd.value/myPow, EPS)
        assertEquals(1.zcd , zcd)
        assertEquals(zeptocandela , zcd)
    }    
    
          
    @Test
    fun testCandelaY1cdTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(myPow * Candela(1.0), 1.ycd)
        assertEquals(myPow * Candela(1.0), 1.yoctocandela)
        assertEquals(1.cd.ycd , cd.value/myPow, EPS)
        assertEquals(1.cd.yoctocandela , cd.value/myPow, EPS)
        assertEquals(1.ycd , ycd)
        assertEquals(yoctocandela , ycd)
    }    
    
          
    @Test
    fun testCandelaR1cdTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(myPow * Candela(1.0), 1.rcd)
        assertEquals(myPow * Candela(1.0), 1.rontocandela)
        assertEquals(1.cd.rcd , cd.value/myPow, EPS)
        assertEquals(1.cd.rontocandela , cd.value/myPow, EPS)
        assertEquals(1.rcd , rcd)
        assertEquals(rontocandela , rcd)
    }    
    
          
    @Test
    fun testCandelaQ1cdTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(myPow * Candela(1.0), 1.qcd)
        assertEquals(myPow * Candela(1.0), 1.quectocandela)
        assertEquals(1.cd.qcd , cd.value/myPow, EPS)
        assertEquals(1.cd.quectocandela , cd.value/myPow, EPS)
        assertEquals(1.qcd , qcd)
        assertEquals(quectocandela , qcd)
    }    
    }