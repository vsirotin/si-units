        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object KatalKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.kat , kat)
              
        val pow30 = 10.0.pow(30)
        check(1.Qkat.value, kat.value*pow30)
        check(1.quettakatal.value, kat.value*pow30)
        check(1.Qkat , Qkat)
        check(quettakatal, Qkat)
          
        val pow27 = 10.0.pow(27)
        check(1.Rkat.value, kat.value*pow27)
        check(1.ronnakatal.value, kat.value*pow27)
        check(1.Rkat , Rkat)
        check(ronnakatal, Rkat)
          
        val pow24 = 10.0.pow(24)
        check(1.Ykat.value, kat.value*pow24)
        check(1.yottakatal.value, kat.value*pow24)
        check(1.Ykat , Ykat)
        check(yottakatal, Ykat)
          
        val pow21 = 10.0.pow(21)
        check(1.Zkat.value, kat.value*pow21)
        check(1.zettakatal.value, kat.value*pow21)
        check(1.Zkat , Zkat)
        check(zettakatal, Zkat)
          
        val pow18 = 10.0.pow(18)
        check(1.Ekat.value, kat.value*pow18)
        check(1.exakatal.value, kat.value*pow18)
        check(1.Ekat , Ekat)
        check(exakatal, Ekat)
          
        val pow15 = 10.0.pow(15)
        check(1.Pkat.value, kat.value*pow15)
        check(1.petakatal.value, kat.value*pow15)
        check(1.Pkat , Pkat)
        check(petakatal, Pkat)
          
        val pow12 = 10.0.pow(12)
        check(1.Tkat.value, kat.value*pow12)
        check(1.terakatal.value, kat.value*pow12)
        check(1.Tkat , Tkat)
        check(terakatal, Tkat)
          
        val pow9 = 10.0.pow(9)
        check(1.Gkat.value, kat.value*pow9)
        check(1.gigakatal.value, kat.value*pow9)
        check(1.Gkat , Gkat)
        check(gigakatal, Gkat)
          
        val pow6 = 10.0.pow(6)
        check(1.Mkat.value, kat.value*pow6)
        check(1.megakatal.value, kat.value*pow6)
        check(1.Mkat , Mkat)
        check(megakatal, Mkat)
          
        val pow3 = 10.0.pow(3)
        check(1.kkat.value, kat.value*pow3)
        check(1.kilokatal.value, kat.value*pow3)
        check(1.kkat , kkat)
        check(kilokatal, kkat)
          
        val pow2 = 10.0.pow(2)
        check(1.hkat.value, kat.value*pow2)
        check(1.hectokatal.value, kat.value*pow2)
        check(1.hkat , hkat)
        check(hectokatal, hkat)
          
        val pow1 = 10.0.pow(1)
        check(1.dakat.value, kat.value*pow1)
        check(1.decakatal.value, kat.value*pow1)
        check(1.dakat , dakat)
        check(decakatal, dakat)
          
        val powM1 = 10.0.pow(-1)
        check(1.dkat.value, kat.value*powM1)
        check(1.decikatal.value, kat.value*powM1)
        check(1.dkat , dkat)
        check(decikatal, dkat)
          
        val powM2 = 10.0.pow(-2)
        check(1.ckat.value, kat.value*powM2)
        check(1.centikatal.value, kat.value*powM2)
        check(1.ckat , ckat)
        check(centikatal, ckat)
          
        val powM3 = 10.0.pow(-3)
        check(1.mkat.value, kat.value*powM3)
        check(1.millikatal.value, kat.value*powM3)
        check(1.mkat , mkat)
        check(millikatal, mkat)
          
        val powM6 = 10.0.pow(-6)
        check(1.μkat.value, kat.value*powM6)
        check(1.microkatal.value, kat.value*powM6)
        check(1.μkat , μkat)
        check(microkatal, μkat)
          
        val powM9 = 10.0.pow(-9)
        check(1.nkat.value, kat.value*powM9)
        check(1.nanokatal.value, kat.value*powM9)
        check(1.nkat , nkat)
        check(nanokatal, nkat)
          
        val powM12 = 10.0.pow(-12)
        check(1.pkat.value, kat.value*powM12)
        check(1.picokatal.value, kat.value*powM12)
        check(1.pkat , pkat)
        check(picokatal, pkat)
          
        val powM15 = 10.0.pow(-15)
        check(1.fkat.value, kat.value*powM15)
        check(1.femtokatal.value, kat.value*powM15)
        check(1.fkat , fkat)
        check(femtokatal, fkat)
          
        val powM18 = 10.0.pow(-18)
        check(1.akat.value, kat.value*powM18)
        check(1.attokatal.value, kat.value*powM18)
        check(1.akat , akat)
        check(attokatal, akat)
          
        val powM21 = 10.0.pow(-21)
        check(1.zkat.value, kat.value*powM21)
        check(1.zeptokatal.value, kat.value*powM21)
        check(1.zkat , zkat)
        check(zeptokatal, zkat)
          
        val powM24 = 10.0.pow(-24)
        check(1.ykat.value, kat.value*powM24)
        check(1.yoctokatal.value, kat.value*powM24)
        check(1.ykat , ykat)
        check(yoctokatal, ykat)
          
        val powM27 = 10.0.pow(-27)
        check(1.rkat.value, kat.value*powM27)
        check(1.rontokatal.value, kat.value*powM27)
        check(1.rkat , rkat)
        check(rontokatal, rkat)
          
        val powM30 = 10.0.pow(-30)
        check(1.qkat.value, kat.value*powM30)
        check(1.quectokatal.value, kat.value*powM30)
        check(1.qkat , qkat)
        check(quectokatal, qkat)   }
}