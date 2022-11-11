        
package eu.sirotin.siunits.base

import eu.sirotin.siunits.core.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class MoleTest {

    @Test
    fun testMoleMainTest() {
        assertEquals(Mole(1.0), mol)
        assertEquals(1.mol , mol)
    }
              
    @Test
    fun testMoleYmolTest() {
        val myPow = 10.0.pow(24)
        assertEquals(myPow * Mole(1.0), 1.Ymol)
        assertEquals(myPow * Mole(1.0), 1.yottamole)
        assertEquals(1.mol.Ymol , mol.value/myPow, ε)
        assertEquals(1.mol.yottamole , mol.value/myPow, ε)
        assertEquals(1.Ymol , Ymol)
        assertEquals(yottamole , Ymol)
    }    
    
          
    @Test
    fun testMoleZmolTest() {
        val myPow = 10.0.pow(21)
        assertEquals(myPow * Mole(1.0), 1.Zmol)
        assertEquals(myPow * Mole(1.0), 1.zettamole)
        assertEquals(1.mol.Zmol , mol.value/myPow, ε)
        assertEquals(1.mol.zettamole , mol.value/myPow, ε)
        assertEquals(1.Zmol , Zmol)
        assertEquals(zettamole , Zmol)
    }    
    
          
    @Test
    fun testMoleEmolTest() {
        val myPow = 10.0.pow(18)
        assertEquals(myPow * Mole(1.0), 1.Emol)
        assertEquals(myPow * Mole(1.0), 1.examole)
        assertEquals(1.mol.Emol , mol.value/myPow, ε)
        assertEquals(1.mol.examole , mol.value/myPow, ε)
        assertEquals(1.Emol , Emol)
        assertEquals(examole , Emol)
    }    
    
          
    @Test
    fun testMolePmolTest() {
        val myPow = 10.0.pow(15)
        assertEquals(myPow * Mole(1.0), 1.Pmol)
        assertEquals(myPow * Mole(1.0), 1.petamole)
        assertEquals(1.mol.Pmol , mol.value/myPow, ε)
        assertEquals(1.mol.petamole , mol.value/myPow, ε)
        assertEquals(1.Pmol , Pmol)
        assertEquals(petamole , Pmol)
    }    
    
          
    @Test
    fun testMoleTmolTest() {
        val myPow = 10.0.pow(12)
        assertEquals(myPow * Mole(1.0), 1.Tmol)
        assertEquals(myPow * Mole(1.0), 1.teramole)
        assertEquals(1.mol.Tmol , mol.value/myPow, ε)
        assertEquals(1.mol.teramole , mol.value/myPow, ε)
        assertEquals(1.Tmol , Tmol)
        assertEquals(teramole , Tmol)
    }    
    
          
    @Test
    fun testMoleGmolTest() {
        val myPow = 10.0.pow(9)
        assertEquals(myPow * Mole(1.0), 1.Gmol)
        assertEquals(myPow * Mole(1.0), 1.gigamole)
        assertEquals(1.mol.Gmol , mol.value/myPow, ε)
        assertEquals(1.mol.gigamole , mol.value/myPow, ε)
        assertEquals(1.Gmol , Gmol)
        assertEquals(gigamole , Gmol)
    }    
    
          
    @Test
    fun testMoleMmolTest() {
        val myPow = 10.0.pow(6)
        assertEquals(myPow * Mole(1.0), 1.Mmol)
        assertEquals(myPow * Mole(1.0), 1.megamole)
        assertEquals(1.mol.Mmol , mol.value/myPow, ε)
        assertEquals(1.mol.megamole , mol.value/myPow, ε)
        assertEquals(1.Mmol , Mmol)
        assertEquals(megamole , Mmol)
    }    
    
          
    @Test
    fun testMoleK1molTest() {
        val myPow = 10.0.pow(3)
        assertEquals(myPow * Mole(1.0), 1.kmol)
        assertEquals(myPow * Mole(1.0), 1.kilomole)
        assertEquals(1.mol.kmol , mol.value/myPow, ε)
        assertEquals(1.mol.kilomole , mol.value/myPow, ε)
        assertEquals(1.kmol , kmol)
        assertEquals(kilomole , kmol)
    }    
    
          
    @Test
    fun testMoleH1molTest() {
        val myPow = 10.0.pow(2)
        assertEquals(myPow * Mole(1.0), 1.hmol)
        assertEquals(myPow * Mole(1.0), 1.hectomole)
        assertEquals(1.mol.hmol , mol.value/myPow, ε)
        assertEquals(1.mol.hectomole , mol.value/myPow, ε)
        assertEquals(1.hmol , hmol)
        assertEquals(hectomole , hmol)
    }    
    
          
    @Test
    fun testMoleDA1molTest() {
        val myPow = 10.0.pow(1)
        assertEquals(myPow * Mole(1.0), 1.damol)
        assertEquals(myPow * Mole(1.0), 1.decamole)
        assertEquals(1.mol.damol , mol.value/myPow, ε)
        assertEquals(1.mol.decamole , mol.value/myPow, ε)
        assertEquals(1.damol , damol)
        assertEquals(decamole , damol)
    }    
    
          
    @Test
    fun testMoleD1molTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(myPow * Mole(1.0), 1.dmol)
        assertEquals(myPow * Mole(1.0), 1.decimole)
        assertEquals(1.mol.dmol , mol.value/myPow, ε)
        assertEquals(1.mol.decimole , mol.value/myPow, ε)
        assertEquals(1.dmol , dmol)
        assertEquals(decimole , dmol)
    }    
    
          
    @Test
    fun testMoleC1molTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(myPow * Mole(1.0), 1.cmol)
        assertEquals(myPow * Mole(1.0), 1.centimole)
        assertEquals(1.mol.cmol , mol.value/myPow, ε)
        assertEquals(1.mol.centimole , mol.value/myPow, ε)
        assertEquals(1.cmol , cmol)
        assertEquals(centimole , cmol)
    }    
    
          
    @Test
    fun testMoleM1molTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(myPow * Mole(1.0), 1.mmol)
        assertEquals(myPow * Mole(1.0), 1.millimole)
        assertEquals(1.mol.mmol , mol.value/myPow, ε)
        assertEquals(1.mol.millimole , mol.value/myPow, ε)
        assertEquals(1.mmol , mmol)
        assertEquals(millimole , mmol)
    }    
    
          
    @Test
    fun testMoleΜ1molTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(myPow * Mole(1.0), 1.μmol)
        assertEquals(myPow * Mole(1.0), 1.micromole)
        assertEquals(1.mol.μmol , mol.value/myPow, ε)
        assertEquals(1.mol.micromole , mol.value/myPow, ε)
        assertEquals(1.μmol , μmol)
        assertEquals(micromole , μmol)
    }    
    
          
    @Test
    fun testMoleN1molTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(myPow * Mole(1.0), 1.nmol)
        assertEquals(myPow * Mole(1.0), 1.nanomole)
        assertEquals(1.mol.nmol , mol.value/myPow, ε)
        assertEquals(1.mol.nanomole , mol.value/myPow, ε)
        assertEquals(1.nmol , nmol)
        assertEquals(nanomole , nmol)
    }    
    
          
    @Test
    fun testMoleP1molTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(myPow * Mole(1.0), 1.pmol)
        assertEquals(myPow * Mole(1.0), 1.picomole)
        assertEquals(1.mol.pmol , mol.value/myPow, ε)
        assertEquals(1.mol.picomole , mol.value/myPow, ε)
        assertEquals(1.pmol , pmol)
        assertEquals(picomole , pmol)
    }    
    
          
    @Test
    fun testMoleF1molTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(myPow * Mole(1.0), 1.fmol)
        assertEquals(myPow * Mole(1.0), 1.femtomole)
        assertEquals(1.mol.fmol , mol.value/myPow, ε)
        assertEquals(1.mol.femtomole , mol.value/myPow, ε)
        assertEquals(1.fmol , fmol)
        assertEquals(femtomole , fmol)
    }    
    
          
    @Test
    fun testMoleA1molTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(myPow * Mole(1.0), 1.amol)
        assertEquals(myPow * Mole(1.0), 1.attomole)
        assertEquals(1.mol.amol , mol.value/myPow, ε)
        assertEquals(1.mol.attomole , mol.value/myPow, ε)
        assertEquals(1.amol , amol)
        assertEquals(attomole , amol)
    }    
    
          
    @Test
    fun testMoleZ1molTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(myPow * Mole(1.0), 1.zmol)
        assertEquals(myPow * Mole(1.0), 1.zeptomole)
        assertEquals(1.mol.zmol , mol.value/myPow, ε)
        assertEquals(1.mol.zeptomole , mol.value/myPow, ε)
        assertEquals(1.zmol , zmol)
        assertEquals(zeptomole , zmol)
    }    
    
          
    @Test
    fun testMoleY1molTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(myPow * Mole(1.0), 1.ymol)
        assertEquals(myPow * Mole(1.0), 1.yoctomole)
        assertEquals(1.mol.ymol , mol.value/myPow, ε)
        assertEquals(1.mol.yoctomole , mol.value/myPow, ε)
        assertEquals(1.ymol , ymol)
        assertEquals(yoctomole , ymol)
    }    
    }