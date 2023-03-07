        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object MoleKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++

        check(Mole(1.0), mol)
        check(1.mol , mol)

        //Serialization
        val v1 = Mole(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Mole(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        check(v1 , v2)
   
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(pow30 * Mole(1.0), 1.Qmol)
        check(pow30 * Mole(1.0), 1.quettamole)
        check(1.mol.Qmol , mol.value/pow30)
        check(1.mol.quettamole , mol.value/pow30)
        check(1.Qmol , Qmol)
        check(quettamole , Qmol) 

   
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(pow27 * Mole(1.0), 1.Rmol)
        check(pow27 * Mole(1.0), 1.ronnamole)
        check(1.mol.Rmol , mol.value/pow27)
        check(1.mol.ronnamole , mol.value/pow27)
        check(1.Rmol , Rmol)
        check(ronnamole , Rmol) 

   
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(pow24 * Mole(1.0), 1.Ymol)
        check(pow24 * Mole(1.0), 1.yottamole)
        check(1.mol.Ymol , mol.value/pow24)
        check(1.mol.yottamole , mol.value/pow24)
        check(1.Ymol , Ymol)
        check(yottamole , Ymol) 

   
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(pow21 * Mole(1.0), 1.Zmol)
        check(pow21 * Mole(1.0), 1.zettamole)
        check(1.mol.Zmol , mol.value/pow21)
        check(1.mol.zettamole , mol.value/pow21)
        check(1.Zmol , Zmol)
        check(zettamole , Zmol) 

   
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(pow18 * Mole(1.0), 1.Emol)
        check(pow18 * Mole(1.0), 1.examole)
        check(1.mol.Emol , mol.value/pow18)
        check(1.mol.examole , mol.value/pow18)
        check(1.Emol , Emol)
        check(examole , Emol) 

   
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(pow15 * Mole(1.0), 1.Pmol)
        check(pow15 * Mole(1.0), 1.petamole)
        check(1.mol.Pmol , mol.value/pow15)
        check(1.mol.petamole , mol.value/pow15)
        check(1.Pmol , Pmol)
        check(petamole , Pmol) 

   
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(pow12 * Mole(1.0), 1.Tmol)
        check(pow12 * Mole(1.0), 1.teramole)
        check(1.mol.Tmol , mol.value/pow12)
        check(1.mol.teramole , mol.value/pow12)
        check(1.Tmol , Tmol)
        check(teramole , Tmol) 

   
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(pow9 * Mole(1.0), 1.Gmol)
        check(pow9 * Mole(1.0), 1.gigamole)
        check(1.mol.Gmol , mol.value/pow9)
        check(1.mol.gigamole , mol.value/pow9)
        check(1.Gmol , Gmol)
        check(gigamole , Gmol) 

   
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(pow6 * Mole(1.0), 1.Mmol)
        check(pow6 * Mole(1.0), 1.megamole)
        check(1.mol.Mmol , mol.value/pow6)
        check(1.mol.megamole , mol.value/pow6)
        check(1.Mmol , Mmol)
        check(megamole , Mmol) 

   
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(pow3 * Mole(1.0), 1.kmol)
        check(pow3 * Mole(1.0), 1.kilomole)
        check(1.mol.kmol , mol.value/pow3)
        check(1.mol.kilomole , mol.value/pow3)
        check(1.kmol , kmol)
        check(kilomole , kmol) 

   
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(pow2 * Mole(1.0), 1.hmol)
        check(pow2 * Mole(1.0), 1.hectomole)
        check(1.mol.hmol , mol.value/pow2)
        check(1.mol.hectomole , mol.value/pow2)
        check(1.hmol , hmol)
        check(hectomole , hmol) 

   
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(pow1 * Mole(1.0), 1.damol)
        check(pow1 * Mole(1.0), 1.decamole)
        check(1.mol.damol , mol.value/pow1)
        check(1.mol.decamole , mol.value/pow1)
        check(1.damol , damol)
        check(decamole , damol) 

   
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(powM1 * Mole(1.0), 1.dmol)
        check(powM1 * Mole(1.0), 1.decimole)
        check(1.mol.dmol , mol.value/powM1)
        check(1.mol.decimole , mol.value/powM1)
        check(1.dmol , dmol)
        check(decimole , dmol) 

   
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(powM2 * Mole(1.0), 1.cmol)
        check(powM2 * Mole(1.0), 1.centimole)
        check(1.mol.cmol , mol.value/powM2)
        check(1.mol.centimole , mol.value/powM2)
        check(1.cmol , cmol)
        check(centimole , cmol) 

   
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(powM3 * Mole(1.0), 1.mmol)
        check(powM3 * Mole(1.0), 1.millimole)
        check(1.mol.mmol , mol.value/powM3)
        check(1.mol.millimole , mol.value/powM3)
        check(1.mmol , mmol)
        check(millimole , mmol) 

   
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(powM6 * Mole(1.0), 1.μmol)
        check(powM6 * Mole(1.0), 1.micromole)
        check(1.mol.μmol , mol.value/powM6)
        check(1.mol.micromole , mol.value/powM6)
        check(1.μmol , μmol)
        check(micromole , μmol) 

   
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(powM9 * Mole(1.0), 1.nmol)
        check(powM9 * Mole(1.0), 1.nanomole)
        check(1.mol.nmol , mol.value/powM9)
        check(1.mol.nanomole , mol.value/powM9)
        check(1.nmol , nmol)
        check(nanomole , nmol) 

   
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(powM12 * Mole(1.0), 1.pmol)
        check(powM12 * Mole(1.0), 1.picomole)
        check(1.mol.pmol , mol.value/powM12)
        check(1.mol.picomole , mol.value/powM12)
        check(1.pmol , pmol)
        check(picomole , pmol) 

   
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(powM15 * Mole(1.0), 1.fmol)
        check(powM15 * Mole(1.0), 1.femtomole)
        check(1.mol.fmol , mol.value/powM15)
        check(1.mol.femtomole , mol.value/powM15)
        check(1.fmol , fmol)
        check(femtomole , fmol) 

   
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(powM18 * Mole(1.0), 1.amol)
        check(powM18 * Mole(1.0), 1.attomole)
        check(1.mol.amol , mol.value/powM18)
        check(1.mol.attomole , mol.value/powM18)
        check(1.amol , amol)
        check(attomole , amol) 

   
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(powM21 * Mole(1.0), 1.zmol)
        check(powM21 * Mole(1.0), 1.zeptomole)
        check(1.mol.zmol , mol.value/powM21)
        check(1.mol.zeptomole , mol.value/powM21)
        check(1.zmol , zmol)
        check(zeptomole , zmol) 

   
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(powM24 * Mole(1.0), 1.ymol)
        check(powM24 * Mole(1.0), 1.yoctomole)
        check(1.mol.ymol , mol.value/powM24)
        check(1.mol.yoctomole , mol.value/powM24)
        check(1.ymol , ymol)
        check(yoctomole , ymol) 

   
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(powM27 * Mole(1.0), 1.rmol)
        check(powM27 * Mole(1.0), 1.rontomole)
        check(1.mol.rmol , mol.value/powM27)
        check(1.mol.rontomole , mol.value/powM27)
        check(1.rmol , rmol)
        check(rontomole , rmol) 

   
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(powM30 * Mole(1.0), 1.qmol)
        check(powM30 * Mole(1.0), 1.quectomole)
        check(1.mol.qmol , mol.value/powM30)
        check(1.mol.quectomole , mol.value/powM30)
        check(1.qmol , qmol)
        check(quectomole , qmol) 
   }
}