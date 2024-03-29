        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object SteradianKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.sr , sr)
              
        val pow30 = 10.0.pow(30)
        check(1.Qsr.value, sr.value*pow30)
        check(1.quettasteradian.value, sr.value*pow30)
        check(1.Qsr , Qsr)
        check(quettasteradian, Qsr)
          
        val pow27 = 10.0.pow(27)
        check(1.Rsr.value, sr.value*pow27)
        check(1.ronnasteradian.value, sr.value*pow27)
        check(1.Rsr , Rsr)
        check(ronnasteradian, Rsr)
          
        val pow24 = 10.0.pow(24)
        check(1.Ysr.value, sr.value*pow24)
        check(1.yottasteradian.value, sr.value*pow24)
        check(1.Ysr , Ysr)
        check(yottasteradian, Ysr)
          
        val pow21 = 10.0.pow(21)
        check(1.Zsr.value, sr.value*pow21)
        check(1.zettasteradian.value, sr.value*pow21)
        check(1.Zsr , Zsr)
        check(zettasteradian, Zsr)
          
        val pow18 = 10.0.pow(18)
        check(1.Esr.value, sr.value*pow18)
        check(1.exasteradian.value, sr.value*pow18)
        check(1.Esr , Esr)
        check(exasteradian, Esr)
          
        val pow15 = 10.0.pow(15)
        check(1.Psr.value, sr.value*pow15)
        check(1.petasteradian.value, sr.value*pow15)
        check(1.Psr , Psr)
        check(petasteradian, Psr)
          
        val pow12 = 10.0.pow(12)
        check(1.Tsr.value, sr.value*pow12)
        check(1.terasteradian.value, sr.value*pow12)
        check(1.Tsr , Tsr)
        check(terasteradian, Tsr)
          
        val pow9 = 10.0.pow(9)
        check(1.Gsr.value, sr.value*pow9)
        check(1.gigasteradian.value, sr.value*pow9)
        check(1.Gsr , Gsr)
        check(gigasteradian, Gsr)
          
        val pow6 = 10.0.pow(6)
        check(1.Msr.value, sr.value*pow6)
        check(1.megasteradian.value, sr.value*pow6)
        check(1.Msr , Msr)
        check(megasteradian, Msr)
          
        val pow3 = 10.0.pow(3)
        check(1.ksr.value, sr.value*pow3)
        check(1.kilosteradian.value, sr.value*pow3)
        check(1.ksr , ksr)
        check(kilosteradian, ksr)
          
        val pow2 = 10.0.pow(2)
        check(1.hsr.value, sr.value*pow2)
        check(1.hectosteradian.value, sr.value*pow2)
        check(1.hsr , hsr)
        check(hectosteradian, hsr)
          
        val pow1 = 10.0.pow(1)
        check(1.dasr.value, sr.value*pow1)
        check(1.decasteradian.value, sr.value*pow1)
        check(1.dasr , dasr)
        check(decasteradian, dasr)
          
        val powM1 = 10.0.pow(-1)
        check(1.dsr.value, sr.value*powM1)
        check(1.decisteradian.value, sr.value*powM1)
        check(1.dsr , dsr)
        check(decisteradian, dsr)
          
        val powM2 = 10.0.pow(-2)
        check(1.csr.value, sr.value*powM2)
        check(1.centisteradian.value, sr.value*powM2)
        check(1.csr , csr)
        check(centisteradian, csr)
          
        val powM3 = 10.0.pow(-3)
        check(1.msr.value, sr.value*powM3)
        check(1.millisteradian.value, sr.value*powM3)
        check(1.msr , msr)
        check(millisteradian, msr)
          
        val powM6 = 10.0.pow(-6)
        check(1.μsr.value, sr.value*powM6)
        check(1.microsteradian.value, sr.value*powM6)
        check(1.μsr , μsr)
        check(microsteradian, μsr)
          
        val powM9 = 10.0.pow(-9)
        check(1.nsr.value, sr.value*powM9)
        check(1.nanosteradian.value, sr.value*powM9)
        check(1.nsr , nsr)
        check(nanosteradian, nsr)
          
        val powM12 = 10.0.pow(-12)
        check(1.psr.value, sr.value*powM12)
        check(1.picosteradian.value, sr.value*powM12)
        check(1.psr , psr)
        check(picosteradian, psr)
          
        val powM15 = 10.0.pow(-15)
        check(1.fsr.value, sr.value*powM15)
        check(1.femtosteradian.value, sr.value*powM15)
        check(1.fsr , fsr)
        check(femtosteradian, fsr)
          
        val powM18 = 10.0.pow(-18)
        check(1.asr.value, sr.value*powM18)
        check(1.attosteradian.value, sr.value*powM18)
        check(1.asr , asr)
        check(attosteradian, asr)
          
        val powM21 = 10.0.pow(-21)
        check(1.zsr.value, sr.value*powM21)
        check(1.zeptosteradian.value, sr.value*powM21)
        check(1.zsr , zsr)
        check(zeptosteradian, zsr)
          
        val powM24 = 10.0.pow(-24)
        check(1.ysr.value, sr.value*powM24)
        check(1.yoctosteradian.value, sr.value*powM24)
        check(1.ysr , ysr)
        check(yoctosteradian, ysr)
          
        val powM27 = 10.0.pow(-27)
        check(1.rsr.value, sr.value*powM27)
        check(1.rontosteradian.value, sr.value*powM27)
        check(1.rsr , rsr)
        check(rontosteradian, rsr)
          
        val powM30 = 10.0.pow(-30)
        check(1.qsr.value, sr.value*powM30)
        check(1.quectosteradian.value, sr.value*powM30)
        check(1.qsr , qsr)
        check(quectosteradian, qsr)   }
}