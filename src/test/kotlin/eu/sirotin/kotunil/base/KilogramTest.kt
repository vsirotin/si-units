        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.EPS
import eu.sirotin.kotunil.core.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class KilogramTest {

    @Test
    fun testKilogramMainTest() {
        assertEquals(Kilogram(1.0), kg)
        assertEquals(1.kg , kg)
    }
    
       @Test
    fun testKilogramSerializationTest() {
        //Serialization
        val v1 = Kilogram(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Kilogram(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        assertEquals(v1 , v2)
    }
    
              
    @Test
    fun testKilogramQkgTest() {
        val myPow = 10.0.pow(27)
        assertEquals(myPow * Kilogram(1.0), 1.Qkg)
        assertEquals(myPow * Kilogram(1.0), 1.quettakilogram)
        assertEquals(1.kg.Qkg , kg.value/myPow, EPS)
        assertEquals(1.kg.quettakilogram , kg.value/myPow, EPS)
        assertEquals(1.Qkg , Qkg)
        assertEquals(quettakilogram , Qkg)
    }    
    
          
    @Test
    fun testKilogramRkgTest() {
        val myPow = 10.0.pow(24)
        assertEquals(myPow * Kilogram(1.0), 1.Rkg)
        assertEquals(myPow * Kilogram(1.0), 1.ronnakilogram)
        assertEquals(1.kg.Rkg , kg.value/myPow, EPS)
        assertEquals(1.kg.ronnakilogram , kg.value/myPow, EPS)
        assertEquals(1.Rkg , Rkg)
        assertEquals(ronnakilogram , Rkg)
    }    
    
          
    @Test
    fun testKilogramYkgTest() {
        val myPow = 10.0.pow(21)
        assertEquals(myPow * Kilogram(1.0), 1.Ykg)
        assertEquals(myPow * Kilogram(1.0), 1.yottakilogram)
        assertEquals(1.kg.Ykg , kg.value/myPow, EPS)
        assertEquals(1.kg.yottakilogram , kg.value/myPow, EPS)
        assertEquals(1.Ykg , Ykg)
        assertEquals(yottakilogram , Ykg)
    }    
    
          
    @Test
    fun testKilogramZkgTest() {
        val myPow = 10.0.pow(18)
        assertEquals(myPow * Kilogram(1.0), 1.Zkg)
        assertEquals(myPow * Kilogram(1.0), 1.zettakilogram)
        assertEquals(1.kg.Zkg , kg.value/myPow, EPS)
        assertEquals(1.kg.zettakilogram , kg.value/myPow, EPS)
        assertEquals(1.Zkg , Zkg)
        assertEquals(zettakilogram , Zkg)
    }    
    
          
    @Test
    fun testKilogramEkgTest() {
        val myPow = 10.0.pow(15)
        assertEquals(myPow * Kilogram(1.0), 1.Ekg)
        assertEquals(myPow * Kilogram(1.0), 1.exakilogram)
        assertEquals(1.kg.Ekg , kg.value/myPow, EPS)
        assertEquals(1.kg.exakilogram , kg.value/myPow, EPS)
        assertEquals(1.Ekg , Ekg)
        assertEquals(exakilogram , Ekg)
    }    
    
          
    @Test
    fun testKilogramPkgTest() {
        val myPow = 10.0.pow(12)
        assertEquals(myPow * Kilogram(1.0), 1.Pkg)
        assertEquals(myPow * Kilogram(1.0), 1.petakilogram)
        assertEquals(1.kg.Pkg , kg.value/myPow, EPS)
        assertEquals(1.kg.petakilogram , kg.value/myPow, EPS)
        assertEquals(1.Pkg , Pkg)
        assertEquals(petakilogram , Pkg)
    }    
    
          
    @Test
    fun testKilogramTkgTest() {
        val myPow = 10.0.pow(9)
        assertEquals(myPow * Kilogram(1.0), 1.Tkg)
        assertEquals(myPow * Kilogram(1.0), 1.terakilogram)
        assertEquals(1.kg.Tkg , kg.value/myPow, EPS)
        assertEquals(1.kg.terakilogram , kg.value/myPow, EPS)
        assertEquals(1.Tkg , Tkg)
        assertEquals(terakilogram , Tkg)
    }    
    
          
    @Test
    fun testKilogramGkgTest() {
        val myPow = 10.0.pow(6)
        assertEquals(myPow * Kilogram(1.0), 1.Gkg)
        assertEquals(myPow * Kilogram(1.0), 1.gigakilogram)
        assertEquals(1.kg.Gkg , kg.value/myPow, EPS)
        assertEquals(1.kg.gigakilogram , kg.value/myPow, EPS)
        assertEquals(1.Gkg , Gkg)
        assertEquals(gigakilogram , Gkg)
    }    
    
          
    @Test
    fun testKilogramMkgTest() {
        val myPow = 10.0.pow(3)
        assertEquals(myPow * Kilogram(1.0), 1.Mkg)
        assertEquals(myPow * Kilogram(1.0), 1.megakilogram)
        assertEquals(1.kg.Mkg , kg.value/myPow, EPS)
        assertEquals(1.kg.megakilogram , kg.value/myPow, EPS)
        assertEquals(1.Mkg , Mkg)
        assertEquals(megakilogram , Mkg)
    }    
    
          
    @Test
    fun testKilogramH1kgTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(myPow * Kilogram(1.0), 1.hkg)
        assertEquals(myPow * Kilogram(1.0), 1.hectokilogram)
        assertEquals(1.kg.hkg , kg.value/myPow, EPS)
        assertEquals(1.kg.hectokilogram , kg.value/myPow, EPS)
        assertEquals(1.hkg , hkg)
        assertEquals(hectokilogram , hkg)
    }    
    
          
    @Test
    fun testKilogramDA1kgTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(myPow * Kilogram(1.0), 1.dakg)
        assertEquals(myPow * Kilogram(1.0), 1.decakilogram)
        assertEquals(1.kg.dakg , kg.value/myPow, EPS)
        assertEquals(1.kg.decakilogram , kg.value/myPow, EPS)
        assertEquals(1.dakg , dakg)
        assertEquals(decakilogram , dakg)
    }    
    
          
    @Test
    fun testKilogramD1kgTest() {
        val myPow = 10.0.pow(-4)
        assertEquals(myPow * Kilogram(1.0), 1.dkg)
        assertEquals(myPow * Kilogram(1.0), 1.decikilogram)
        assertEquals(1.kg.dkg , kg.value/myPow, EPS)
        assertEquals(1.kg.decikilogram , kg.value/myPow, EPS)
        assertEquals(1.dkg , dkg)
        assertEquals(decikilogram , dkg)
    }    
    
          
    @Test
    fun testKilogramC1kgTest() {
        val myPow = 10.0.pow(-5)
        assertEquals(myPow * Kilogram(1.0), 1.ckg)
        assertEquals(myPow * Kilogram(1.0), 1.centikilogram)
        assertEquals(1.kg.ckg , kg.value/myPow, EPS)
        assertEquals(1.kg.centikilogram , kg.value/myPow, EPS)
        assertEquals(1.ckg , ckg)
        assertEquals(centikilogram , ckg)
    }    
    
          
    @Test
    fun testKilogramM1kgTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(myPow * Kilogram(1.0), 1.mkg)
        assertEquals(myPow * Kilogram(1.0), 1.millikilogram)
        assertEquals(1.kg.mkg , kg.value/myPow, EPS)
        assertEquals(1.kg.millikilogram , kg.value/myPow, EPS)
        assertEquals(1.mkg , mkg)
        assertEquals(millikilogram , mkg)
    }    
    
          
    @Test
    fun testKilogramΜ1kgTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(myPow * Kilogram(1.0), 1.μkg)
        assertEquals(myPow * Kilogram(1.0), 1.microkilogram)
        assertEquals(1.kg.μkg , kg.value/myPow, EPS)
        assertEquals(1.kg.microkilogram , kg.value/myPow, EPS)
        assertEquals(1.μkg , μkg)
        assertEquals(microkilogram , μkg)
    }    
    
          
    @Test
    fun testKilogramN1kgTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(myPow * Kilogram(1.0), 1.nkg)
        assertEquals(myPow * Kilogram(1.0), 1.nanokilogram)
        assertEquals(1.kg.nkg , kg.value/myPow, EPS)
        assertEquals(1.kg.nanokilogram , kg.value/myPow, EPS)
        assertEquals(1.nkg , nkg)
        assertEquals(nanokilogram , nkg)
    }    
    
          
    @Test
    fun testKilogramP1kgTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(myPow * Kilogram(1.0), 1.pkg)
        assertEquals(myPow * Kilogram(1.0), 1.picokilogram)
        assertEquals(1.kg.pkg , kg.value/myPow, EPS)
        assertEquals(1.kg.picokilogram , kg.value/myPow, EPS)
        assertEquals(1.pkg , pkg)
        assertEquals(picokilogram , pkg)
    }    
    
          
    @Test
    fun testKilogramF1kgTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(myPow * Kilogram(1.0), 1.fkg)
        assertEquals(myPow * Kilogram(1.0), 1.femtokilogram)
        assertEquals(1.kg.fkg , kg.value/myPow, EPS)
        assertEquals(1.kg.femtokilogram , kg.value/myPow, EPS)
        assertEquals(1.fkg , fkg)
        assertEquals(femtokilogram , fkg)
    }    
    
          
    @Test
    fun testKilogramA1kgTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(myPow * Kilogram(1.0), 1.akg)
        assertEquals(myPow * Kilogram(1.0), 1.attokilogram)
        assertEquals(1.kg.akg , kg.value/myPow, EPS)
        assertEquals(1.kg.attokilogram , kg.value/myPow, EPS)
        assertEquals(1.akg , akg)
        assertEquals(attokilogram , akg)
    }    
    
          
    @Test
    fun testKilogramZ1kgTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(myPow * Kilogram(1.0), 1.zkg)
        assertEquals(myPow * Kilogram(1.0), 1.zeptokilogram)
        assertEquals(1.kg.zkg , kg.value/myPow, EPS)
        assertEquals(1.kg.zeptokilogram , kg.value/myPow, EPS)
        assertEquals(1.zkg , zkg)
        assertEquals(zeptokilogram , zkg)
    }    
    
          
    @Test
    fun testKilogramY1kgTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(myPow * Kilogram(1.0), 1.ykg)
        assertEquals(myPow * Kilogram(1.0), 1.yoctokilogram)
        assertEquals(1.kg.ykg , kg.value/myPow, EPS)
        assertEquals(1.kg.yoctokilogram , kg.value/myPow, EPS)
        assertEquals(1.ykg , ykg)
        assertEquals(yoctokilogram , ykg)
    }    
    
          
    @Test
    fun testKilogramR1kgTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(myPow * Kilogram(1.0), 1.rkg)
        assertEquals(myPow * Kilogram(1.0), 1.rontokilogram)
        assertEquals(1.kg.rkg , kg.value/myPow, EPS)
        assertEquals(1.kg.rontokilogram , kg.value/myPow, EPS)
        assertEquals(1.rkg , rkg)
        assertEquals(rontokilogram , rkg)
    }    
    
          
    @Test
    fun testKilogramQ1kgTest() {
        val myPow = 10.0.pow(-33)
        assertEquals(myPow * Kilogram(1.0), 1.qkg)
        assertEquals(myPow * Kilogram(1.0), 1.quectokilogram)
        assertEquals(1.kg.qkg , kg.value/myPow, EPS)
        assertEquals(1.kg.quectokilogram , kg.value/myPow, EPS)
        assertEquals(1.qkg , qkg)
        assertEquals(quectokilogram , qkg)
    }    
    }