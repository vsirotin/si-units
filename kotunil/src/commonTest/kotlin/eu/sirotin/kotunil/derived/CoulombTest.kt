        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class CoulombTest {

    @Test
    fun testCoulombMainTest1() {
        assertEquals(1.C , C)
    }
    
     @Test
    fun testCoulombMainTest2() {
        assertEquals(12.3.C , Coulomb(12.3).expression)
    }
              
    @Test
    fun testCoulombQCTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QC.value, C.value*myPow, EPS)
        assertEquals(1.quettacoulomb.value, C.value*myPow)
        assertEquals(1.QC , QC)
        assertEquals(quettacoulomb, QC)
    }    
    
          
    @Test
    fun testCoulombRCTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RC.value, C.value*myPow, EPS)
        assertEquals(1.ronnacoulomb.value, C.value*myPow)
        assertEquals(1.RC , RC)
        assertEquals(ronnacoulomb, RC)
    }    
    
          
    @Test
    fun testCoulombYCTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YC.value, C.value*myPow, EPS)
        assertEquals(1.yottacoulomb.value, C.value*myPow)
        assertEquals(1.YC , YC)
        assertEquals(yottacoulomb, YC)
    }    
    
          
    @Test
    fun testCoulombZCTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZC.value, C.value*myPow, EPS)
        assertEquals(1.zettacoulomb.value, C.value*myPow)
        assertEquals(1.ZC , ZC)
        assertEquals(zettacoulomb, ZC)
    }    
    
          
    @Test
    fun testCoulombECTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.EC.value, C.value*myPow, EPS)
        assertEquals(1.exacoulomb.value, C.value*myPow)
        assertEquals(1.EC , EC)
        assertEquals(exacoulomb, EC)
    }    
    
          
    @Test
    fun testCoulombPCTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PC.value, C.value*myPow, EPS)
        assertEquals(1.petacoulomb.value, C.value*myPow)
        assertEquals(1.PC , PC)
        assertEquals(petacoulomb, PC)
    }    
    
          
    @Test
    fun testCoulombTCTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TC.value, C.value*myPow, EPS)
        assertEquals(1.teracoulomb.value, C.value*myPow)
        assertEquals(1.TC , TC)
        assertEquals(teracoulomb, TC)
    }    
    
          
    @Test
    fun testCoulombGCTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GC.value, C.value*myPow, EPS)
        assertEquals(1.gigacoulomb.value, C.value*myPow)
        assertEquals(1.GC , GC)
        assertEquals(gigacoulomb, GC)
    }    
    
          
    @Test
    fun testCoulombMCTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MC.value, C.value*myPow, EPS)
        assertEquals(1.megacoulomb.value, C.value*myPow)
        assertEquals(1.MC , MC)
        assertEquals(megacoulomb, MC)
    }    
    
          
    @Test
    fun testCoulombK1CTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kC.value, C.value*myPow, EPS)
        assertEquals(1.kilocoulomb.value, C.value*myPow)
        assertEquals(1.kC , kC)
        assertEquals(kilocoulomb, kC)
    }    
    
          
    @Test
    fun testCoulombH1CTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hC.value, C.value*myPow, EPS)
        assertEquals(1.hectocoulomb.value, C.value*myPow)
        assertEquals(1.hC , hC)
        assertEquals(hectocoulomb, hC)
    }    
    
          
    @Test
    fun testCoulombDA1CTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daC.value, C.value*myPow, EPS)
        assertEquals(1.decacoulomb.value, C.value*myPow)
        assertEquals(1.daC , daC)
        assertEquals(decacoulomb, daC)
    }    
    
          
    @Test
    fun testCoulombD1CTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dC.value, C.value*myPow, EPS)
        assertEquals(1.decicoulomb.value, C.value*myPow)
        assertEquals(1.dC , dC)
        assertEquals(decicoulomb, dC)
    }    
    
          
    @Test
    fun testCoulombC1CTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cC.value, C.value*myPow, EPS)
        assertEquals(1.centicoulomb.value, C.value*myPow)
        assertEquals(1.cC , cC)
        assertEquals(centicoulomb, cC)
    }    
    
          
    @Test
    fun testCoulombM1CTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mC.value, C.value*myPow, EPS)
        assertEquals(1.millicoulomb.value, C.value*myPow)
        assertEquals(1.mC , mC)
        assertEquals(millicoulomb, mC)
    }    
    
          
    @Test
    fun testCoulombΜ1CTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μC.value, C.value*myPow, EPS)
        assertEquals(1.microcoulomb.value, C.value*myPow)
        assertEquals(1.μC , μC)
        assertEquals(microcoulomb, μC)
    }    
    
          
    @Test
    fun testCoulombN1CTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nC.value, C.value*myPow, EPS)
        assertEquals(1.nanocoulomb.value, C.value*myPow)
        assertEquals(1.nC , nC)
        assertEquals(nanocoulomb, nC)
    }    
    
          
    @Test
    fun testCoulombP1CTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pC.value, C.value*myPow, EPS)
        assertEquals(1.picocoulomb.value, C.value*myPow)
        assertEquals(1.pC , pC)
        assertEquals(picocoulomb, pC)
    }    
    
          
    @Test
    fun testCoulombF1CTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fC.value, C.value*myPow, EPS)
        assertEquals(1.femtocoulomb.value, C.value*myPow)
        assertEquals(1.fC , fC)
        assertEquals(femtocoulomb, fC)
    }    
    
          
    @Test
    fun testCoulombA1CTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aC.value, C.value*myPow, EPS)
        assertEquals(1.attocoulomb.value, C.value*myPow)
        assertEquals(1.aC , aC)
        assertEquals(attocoulomb, aC)
    }    
    
          
    @Test
    fun testCoulombZ1CTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zC.value, C.value*myPow, EPS)
        assertEquals(1.zeptocoulomb.value, C.value*myPow)
        assertEquals(1.zC , zC)
        assertEquals(zeptocoulomb, zC)
    }    
    
          
    @Test
    fun testCoulombY1CTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yC.value, C.value*myPow, EPS)
        assertEquals(1.yoctocoulomb.value, C.value*myPow)
        assertEquals(1.yC , yC)
        assertEquals(yoctocoulomb, yC)
    }    
    
          
    @Test
    fun testCoulombR1CTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rC.value, C.value*myPow, EPS)
        assertEquals(1.rontocoulomb.value, C.value*myPow)
        assertEquals(1.rC , rC)
        assertEquals(rontocoulomb, rC)
    }    
    
          
    @Test
    fun testCoulombQ1CTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qC.value, C.value*myPow, EPS)
        assertEquals(1.quectocoulomb.value, C.value*myPow)
        assertEquals(1.qC , qC)
        assertEquals(quectocoulomb, qC)
    }    
    }