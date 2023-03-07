        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object KatalKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(1.kat , kat)
              
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(1.Qkat.value, kat.value*pow30)
        check(1.quettakatal.value, kat.value*pow30)
        check(1.Qkat , Qkat)
        check(quettakatal, Qkat)
          
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(1.Rkat.value, kat.value*pow27)
        check(1.ronnakatal.value, kat.value*pow27)
        check(1.Rkat , Rkat)
        check(ronnakatal, Rkat)
          
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(1.Ykat.value, kat.value*pow24)
        check(1.yottakatal.value, kat.value*pow24)
        check(1.Ykat , Ykat)
        check(yottakatal, Ykat)
          
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(1.Zkat.value, kat.value*pow21)
        check(1.zettakatal.value, kat.value*pow21)
        check(1.Zkat , Zkat)
        check(zettakatal, Zkat)
          
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(1.Ekat.value, kat.value*pow18)
        check(1.exakatal.value, kat.value*pow18)
        check(1.Ekat , Ekat)
        check(exakatal, Ekat)
          
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(1.Pkat.value, kat.value*pow15)
        check(1.petakatal.value, kat.value*pow15)
        check(1.Pkat , Pkat)
        check(petakatal, Pkat)
          
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(1.Tkat.value, kat.value*pow12)
        check(1.terakatal.value, kat.value*pow12)
        check(1.Tkat , Tkat)
        check(terakatal, Tkat)
          
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(1.Gkat.value, kat.value*pow9)
        check(1.gigakatal.value, kat.value*pow9)
        check(1.Gkat , Gkat)
        check(gigakatal, Gkat)
          
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(1.Mkat.value, kat.value*pow6)
        check(1.megakatal.value, kat.value*pow6)
        check(1.Mkat , Mkat)
        check(megakatal, Mkat)
          
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(1.kkat.value, kat.value*pow3)
        check(1.kilokatal.value, kat.value*pow3)
        check(1.kkat , kkat)
        check(kilokatal, kkat)
          
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(1.hkat.value, kat.value*pow2)
        check(1.hectokatal.value, kat.value*pow2)
        check(1.hkat , hkat)
        check(hectokatal, hkat)
          
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(1.dakat.value, kat.value*pow1)
        check(1.decakatal.value, kat.value*pow1)
        check(1.dakat , dakat)
        check(decakatal, dakat)
          
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(1.dkat.value, kat.value*powM1)
        check(1.decikatal.value, kat.value*powM1)
        check(1.dkat , dkat)
        check(decikatal, dkat)
          
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(1.ckat.value, kat.value*powM2)
        check(1.centikatal.value, kat.value*powM2)
        check(1.ckat , ckat)
        check(centikatal, ckat)
          
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(1.mkat.value, kat.value*powM3)
        check(1.millikatal.value, kat.value*powM3)
        check(1.mkat , mkat)
        check(millikatal, mkat)
          
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(1.μkat.value, kat.value*powM6)
        check(1.microkatal.value, kat.value*powM6)
        check(1.μkat , μkat)
        check(microkatal, μkat)
          
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(1.nkat.value, kat.value*powM9)
        check(1.nanokatal.value, kat.value*powM9)
        check(1.nkat , nkat)
        check(nanokatal, nkat)
          
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(1.pkat.value, kat.value*powM12)
        check(1.picokatal.value, kat.value*powM12)
        check(1.pkat , pkat)
        check(picokatal, pkat)
          
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(1.fkat.value, kat.value*powM15)
        check(1.femtokatal.value, kat.value*powM15)
        check(1.fkat , fkat)
        check(femtokatal, fkat)
          
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(1.akat.value, kat.value*powM18)
        check(1.attokatal.value, kat.value*powM18)
        check(1.akat , akat)
        check(attokatal, akat)
          
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(1.zkat.value, kat.value*powM21)
        check(1.zeptokatal.value, kat.value*powM21)
        check(1.zkat , zkat)
        check(zeptokatal, zkat)
          
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(1.ykat.value, kat.value*powM24)
        check(1.yoctokatal.value, kat.value*powM24)
        check(1.ykat , ykat)
        check(yoctokatal, ykat)
          
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(1.rkat.value, kat.value*powM27)
        check(1.rontokatal.value, kat.value*powM27)
        check(1.rkat , rkat)
        check(rontokatal, rkat)
          
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(1.qkat.value, kat.value*powM30)
        check(1.quectokatal.value, kat.value*powM30)
        check(1.qkat , qkat)
        check(quectokatal, qkat)   }
}