        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object FaradKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(1.F , F)
              
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(1.QF.value, F.value*pow30)
        check(1.quettafarad.value, F.value*pow30)
        check(1.QF , QF)
        check(quettafarad, QF)
          
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(1.RF.value, F.value*pow27)
        check(1.ronnafarad.value, F.value*pow27)
        check(1.RF , RF)
        check(ronnafarad, RF)
          
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(1.YF.value, F.value*pow24)
        check(1.yottafarad.value, F.value*pow24)
        check(1.YF , YF)
        check(yottafarad, YF)
          
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(1.ZF.value, F.value*pow21)
        check(1.zettafarad.value, F.value*pow21)
        check(1.ZF , ZF)
        check(zettafarad, ZF)
          
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(1.EF.value, F.value*pow18)
        check(1.exafarad.value, F.value*pow18)
        check(1.EF , EF)
        check(exafarad, EF)
          
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(1.PF.value, F.value*pow15)
        check(1.petafarad.value, F.value*pow15)
        check(1.PF , PF)
        check(petafarad, PF)
          
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(1.TF.value, F.value*pow12)
        check(1.terafarad.value, F.value*pow12)
        check(1.TF , TF)
        check(terafarad, TF)
          
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(1.GF.value, F.value*pow9)
        check(1.gigafarad.value, F.value*pow9)
        check(1.GF , GF)
        check(gigafarad, GF)
          
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(1.MF.value, F.value*pow6)
        check(1.megafarad.value, F.value*pow6)
        check(1.MF , MF)
        check(megafarad, MF)
          
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(1.kF.value, F.value*pow3)
        check(1.kilofarad.value, F.value*pow3)
        check(1.kF , kF)
        check(kilofarad, kF)
          
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(1.hF.value, F.value*pow2)
        check(1.hectofarad.value, F.value*pow2)
        check(1.hF , hF)
        check(hectofarad, hF)
          
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(1.daF.value, F.value*pow1)
        check(1.decafarad.value, F.value*pow1)
        check(1.daF , daF)
        check(decafarad, daF)
          
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(1.dF.value, F.value*powM1)
        check(1.decifarad.value, F.value*powM1)
        check(1.dF , dF)
        check(decifarad, dF)
          
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(1.cF.value, F.value*powM2)
        check(1.centifarad.value, F.value*powM2)
        check(1.cF , cF)
        check(centifarad, cF)
          
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(1.mF.value, F.value*powM3)
        check(1.millifarad.value, F.value*powM3)
        check(1.mF , mF)
        check(millifarad, mF)
          
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(1.μF.value, F.value*powM6)
        check(1.microfarad.value, F.value*powM6)
        check(1.μF , μF)
        check(microfarad, μF)
          
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(1.nF.value, F.value*powM9)
        check(1.nanofarad.value, F.value*powM9)
        check(1.nF , nF)
        check(nanofarad, nF)
          
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(1.pF.value, F.value*powM12)
        check(1.picofarad.value, F.value*powM12)
        check(1.pF , pF)
        check(picofarad, pF)
          
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(1.fF.value, F.value*powM15)
        check(1.femtofarad.value, F.value*powM15)
        check(1.fF , fF)
        check(femtofarad, fF)
          
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(1.aF.value, F.value*powM18)
        check(1.attofarad.value, F.value*powM18)
        check(1.aF , aF)
        check(attofarad, aF)
          
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(1.zF.value, F.value*powM21)
        check(1.zeptofarad.value, F.value*powM21)
        check(1.zF , zF)
        check(zeptofarad, zF)
          
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(1.yF.value, F.value*powM24)
        check(1.yoctofarad.value, F.value*powM24)
        check(1.yF , yF)
        check(yoctofarad, yF)
          
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(1.rF.value, F.value*powM27)
        check(1.rontofarad.value, F.value*powM27)
        check(1.rF , rF)
        check(rontofarad, rF)
          
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(1.qF.value, F.value*powM30)
        check(1.quectofarad.value, F.value*powM30)
        check(1.qF , qF)
        check(quectofarad, qF)   }
}