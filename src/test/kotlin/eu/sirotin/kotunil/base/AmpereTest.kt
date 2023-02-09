        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.EPS
import eu.sirotin.kotunil.core.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class AmpereTest {

    @Test
    fun testAmpereMainTest() {
        assertEquals(Ampere(1.0), A)
        assertEquals(1.A , A)
    }
    
       @Test
    fun testAmpereSerializationTest() {
        //Serialization
        val v1 = Ampere(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Ampere(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        assertEquals(v1 , v2)
    }
    
              
    @Test
    fun testAmpereQATest() {
        val myPow = 10.0.pow(30)
        assertEquals(myPow * Ampere(1.0), 1.QA)
        assertEquals(myPow * Ampere(1.0), 1.quettaampere)
        assertEquals(1.A.QA , A.value/myPow, EPS)
        assertEquals(1.A.quettaampere , A.value/myPow, EPS)
        assertEquals(1.QA , QA)
        assertEquals(quettaampere , QA)
    }    
    
          
    @Test
    fun testAmpereRATest() {
        val myPow = 10.0.pow(27)
        assertEquals(myPow * Ampere(1.0), 1.RA)
        assertEquals(myPow * Ampere(1.0), 1.ronnaampere)
        assertEquals(1.A.RA , A.value/myPow, EPS)
        assertEquals(1.A.ronnaampere , A.value/myPow, EPS)
        assertEquals(1.RA , RA)
        assertEquals(ronnaampere , RA)
    }    
    
          
    @Test
    fun testAmpereYATest() {
        val myPow = 10.0.pow(24)
        assertEquals(myPow * Ampere(1.0), 1.YA)
        assertEquals(myPow * Ampere(1.0), 1.yottaampere)
        assertEquals(1.A.YA , A.value/myPow, EPS)
        assertEquals(1.A.yottaampere , A.value/myPow, EPS)
        assertEquals(1.YA , YA)
        assertEquals(yottaampere , YA)
    }    
    
          
    @Test
    fun testAmpereZATest() {
        val myPow = 10.0.pow(21)
        assertEquals(myPow * Ampere(1.0), 1.ZA)
        assertEquals(myPow * Ampere(1.0), 1.zettaampere)
        assertEquals(1.A.ZA , A.value/myPow, EPS)
        assertEquals(1.A.zettaampere , A.value/myPow, EPS)
        assertEquals(1.ZA , ZA)
        assertEquals(zettaampere , ZA)
    }    
    
          
    @Test
    fun testAmpereEATest() {
        val myPow = 10.0.pow(18)
        assertEquals(myPow * Ampere(1.0), 1.EA)
        assertEquals(myPow * Ampere(1.0), 1.exaampere)
        assertEquals(1.A.EA , A.value/myPow, EPS)
        assertEquals(1.A.exaampere , A.value/myPow, EPS)
        assertEquals(1.EA , EA)
        assertEquals(exaampere , EA)
    }    
    
          
    @Test
    fun testAmperePATest() {
        val myPow = 10.0.pow(15)
        assertEquals(myPow * Ampere(1.0), 1.PA)
        assertEquals(myPow * Ampere(1.0), 1.petaampere)
        assertEquals(1.A.PA , A.value/myPow, EPS)
        assertEquals(1.A.petaampere , A.value/myPow, EPS)
        assertEquals(1.PA , PA)
        assertEquals(petaampere , PA)
    }    
    
          
    @Test
    fun testAmpereTATest() {
        val myPow = 10.0.pow(12)
        assertEquals(myPow * Ampere(1.0), 1.TA)
        assertEquals(myPow * Ampere(1.0), 1.teraampere)
        assertEquals(1.A.TA , A.value/myPow, EPS)
        assertEquals(1.A.teraampere , A.value/myPow, EPS)
        assertEquals(1.TA , TA)
        assertEquals(teraampere , TA)
    }    
    
          
    @Test
    fun testAmpereGATest() {
        val myPow = 10.0.pow(9)
        assertEquals(myPow * Ampere(1.0), 1.GA)
        assertEquals(myPow * Ampere(1.0), 1.gigaampere)
        assertEquals(1.A.GA , A.value/myPow, EPS)
        assertEquals(1.A.gigaampere , A.value/myPow, EPS)
        assertEquals(1.GA , GA)
        assertEquals(gigaampere , GA)
    }    
    
          
    @Test
    fun testAmpereMATest() {
        val myPow = 10.0.pow(6)
        assertEquals(myPow * Ampere(1.0), 1.MA)
        assertEquals(myPow * Ampere(1.0), 1.megaampere)
        assertEquals(1.A.MA , A.value/myPow, EPS)
        assertEquals(1.A.megaampere , A.value/myPow, EPS)
        assertEquals(1.MA , MA)
        assertEquals(megaampere , MA)
    }    
    
          
    @Test
    fun testAmpereK1ATest() {
        val myPow = 10.0.pow(3)
        assertEquals(myPow * Ampere(1.0), 1.kA)
        assertEquals(myPow * Ampere(1.0), 1.kiloampere)
        assertEquals(1.A.kA , A.value/myPow, EPS)
        assertEquals(1.A.kiloampere , A.value/myPow, EPS)
        assertEquals(1.kA , kA)
        assertEquals(kiloampere , kA)
    }    
    
          
    @Test
    fun testAmpereH1ATest() {
        val myPow = 10.0.pow(2)
        assertEquals(myPow * Ampere(1.0), 1.hA)
        assertEquals(myPow * Ampere(1.0), 1.hectoampere)
        assertEquals(1.A.hA , A.value/myPow, EPS)
        assertEquals(1.A.hectoampere , A.value/myPow, EPS)
        assertEquals(1.hA , hA)
        assertEquals(hectoampere , hA)
    }    
    
          
    @Test
    fun testAmpereDA1ATest() {
        val myPow = 10.0.pow(1)
        assertEquals(myPow * Ampere(1.0), 1.daA)
        assertEquals(myPow * Ampere(1.0), 1.decaampere)
        assertEquals(1.A.daA , A.value/myPow, EPS)
        assertEquals(1.A.decaampere , A.value/myPow, EPS)
        assertEquals(1.daA , daA)
        assertEquals(decaampere , daA)
    }    
    
          
    @Test
    fun testAmpereD1ATest() {
        val myPow = 10.0.pow(-1)
        assertEquals(myPow * Ampere(1.0), 1.dA)
        assertEquals(myPow * Ampere(1.0), 1.deciampere)
        assertEquals(1.A.dA , A.value/myPow, EPS)
        assertEquals(1.A.deciampere , A.value/myPow, EPS)
        assertEquals(1.dA , dA)
        assertEquals(deciampere , dA)
    }    
    
          
    @Test
    fun testAmpereC1ATest() {
        val myPow = 10.0.pow(-2)
        assertEquals(myPow * Ampere(1.0), 1.cA)
        assertEquals(myPow * Ampere(1.0), 1.centiampere)
        assertEquals(1.A.cA , A.value/myPow, EPS)
        assertEquals(1.A.centiampere , A.value/myPow, EPS)
        assertEquals(1.cA , cA)
        assertEquals(centiampere , cA)
    }    
    
          
    @Test
    fun testAmpereM1ATest() {
        val myPow = 10.0.pow(-3)
        assertEquals(myPow * Ampere(1.0), 1.mA)
        assertEquals(myPow * Ampere(1.0), 1.milliampere)
        assertEquals(1.A.mA , A.value/myPow, EPS)
        assertEquals(1.A.milliampere , A.value/myPow, EPS)
        assertEquals(1.mA , mA)
        assertEquals(milliampere , mA)
    }    
    
          
    @Test
    fun testAmpereΜ1ATest() {
        val myPow = 10.0.pow(-6)
        assertEquals(myPow * Ampere(1.0), 1.μA)
        assertEquals(myPow * Ampere(1.0), 1.microampere)
        assertEquals(1.A.μA , A.value/myPow, EPS)
        assertEquals(1.A.microampere , A.value/myPow, EPS)
        assertEquals(1.μA , μA)
        assertEquals(microampere , μA)
    }    
    
          
    @Test
    fun testAmpereN1ATest() {
        val myPow = 10.0.pow(-9)
        assertEquals(myPow * Ampere(1.0), 1.nA)
        assertEquals(myPow * Ampere(1.0), 1.nanoampere)
        assertEquals(1.A.nA , A.value/myPow, EPS)
        assertEquals(1.A.nanoampere , A.value/myPow, EPS)
        assertEquals(1.nA , nA)
        assertEquals(nanoampere , nA)
    }    
    
          
    @Test
    fun testAmpereP1ATest() {
        val myPow = 10.0.pow(-12)
        assertEquals(myPow * Ampere(1.0), 1.pA)
        assertEquals(myPow * Ampere(1.0), 1.picoampere)
        assertEquals(1.A.pA , A.value/myPow, EPS)
        assertEquals(1.A.picoampere , A.value/myPow, EPS)
        assertEquals(1.pA , pA)
        assertEquals(picoampere , pA)
    }    
    
          
    @Test
    fun testAmpereF1ATest() {
        val myPow = 10.0.pow(-15)
        assertEquals(myPow * Ampere(1.0), 1.fA)
        assertEquals(myPow * Ampere(1.0), 1.femtoampere)
        assertEquals(1.A.fA , A.value/myPow, EPS)
        assertEquals(1.A.femtoampere , A.value/myPow, EPS)
        assertEquals(1.fA , fA)
        assertEquals(femtoampere , fA)
    }    
    
          
    @Test
    fun testAmpereA1ATest() {
        val myPow = 10.0.pow(-18)
        assertEquals(myPow * Ampere(1.0), 1.aA)
        assertEquals(myPow * Ampere(1.0), 1.attoampere)
        assertEquals(1.A.aA , A.value/myPow, EPS)
        assertEquals(1.A.attoampere , A.value/myPow, EPS)
        assertEquals(1.aA , aA)
        assertEquals(attoampere , aA)
    }    
    
          
    @Test
    fun testAmpereZ1ATest() {
        val myPow = 10.0.pow(-21)
        assertEquals(myPow * Ampere(1.0), 1.zA)
        assertEquals(myPow * Ampere(1.0), 1.zeptoampere)
        assertEquals(1.A.zA , A.value/myPow, EPS)
        assertEquals(1.A.zeptoampere , A.value/myPow, EPS)
        assertEquals(1.zA , zA)
        assertEquals(zeptoampere , zA)
    }    
    
          
    @Test
    fun testAmpereY1ATest() {
        val myPow = 10.0.pow(-24)
        assertEquals(myPow * Ampere(1.0), 1.yA)
        assertEquals(myPow * Ampere(1.0), 1.yoctoampere)
        assertEquals(1.A.yA , A.value/myPow, EPS)
        assertEquals(1.A.yoctoampere , A.value/myPow, EPS)
        assertEquals(1.yA , yA)
        assertEquals(yoctoampere , yA)
    }    
    
          
    @Test
    fun testAmpereR1ATest() {
        val myPow = 10.0.pow(-27)
        assertEquals(myPow * Ampere(1.0), 1.rA)
        assertEquals(myPow * Ampere(1.0), 1.rontoampere)
        assertEquals(1.A.rA , A.value/myPow, EPS)
        assertEquals(1.A.rontoampere , A.value/myPow, EPS)
        assertEquals(1.rA , rA)
        assertEquals(rontoampere , rA)
    }    
    
          
    @Test
    fun testAmpereQ1ATest() {
        val myPow = 10.0.pow(-30)
        assertEquals(myPow * Ampere(1.0), 1.qA)
        assertEquals(myPow * Ampere(1.0), 1.quectoampere)
        assertEquals(1.A.qA , A.value/myPow, EPS)
        assertEquals(1.A.quectoampere , A.value/myPow, EPS)
        assertEquals(1.qA , qA)
        assertEquals(quectoampere , qA)
    }    
    }