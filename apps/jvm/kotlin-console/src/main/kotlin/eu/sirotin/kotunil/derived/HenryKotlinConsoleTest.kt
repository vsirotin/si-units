        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object HenryKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.H , H)
              
        val pow30 = 10.0.pow(30)
        check(1.QH.value, H.value*pow30)
        check(1.quettahenry.value, H.value*pow30)
        check(1.QH , QH)
        check(quettahenry, QH)
          
        val pow27 = 10.0.pow(27)
        check(1.RH.value, H.value*pow27)
        check(1.ronnahenry.value, H.value*pow27)
        check(1.RH , RH)
        check(ronnahenry, RH)
          
        val pow24 = 10.0.pow(24)
        check(1.YH.value, H.value*pow24)
        check(1.yottahenry.value, H.value*pow24)
        check(1.YH , YH)
        check(yottahenry, YH)
          
        val pow21 = 10.0.pow(21)
        check(1.ZH.value, H.value*pow21)
        check(1.zettahenry.value, H.value*pow21)
        check(1.ZH , ZH)
        check(zettahenry, ZH)
          
        val pow18 = 10.0.pow(18)
        check(1.EH.value, H.value*pow18)
        check(1.exahenry.value, H.value*pow18)
        check(1.EH , EH)
        check(exahenry, EH)
          
        val pow15 = 10.0.pow(15)
        check(1.PH.value, H.value*pow15)
        check(1.petahenry.value, H.value*pow15)
        check(1.PH , PH)
        check(petahenry, PH)
          
        val pow12 = 10.0.pow(12)
        check(1.TH.value, H.value*pow12)
        check(1.terahenry.value, H.value*pow12)
        check(1.TH , TH)
        check(terahenry, TH)
          
        val pow9 = 10.0.pow(9)
        check(1.GH.value, H.value*pow9)
        check(1.gigahenry.value, H.value*pow9)
        check(1.GH , GH)
        check(gigahenry, GH)
          
        val pow6 = 10.0.pow(6)
        check(1.MH.value, H.value*pow6)
        check(1.megahenry.value, H.value*pow6)
        check(1.MH , MH)
        check(megahenry, MH)
          
        val pow3 = 10.0.pow(3)
        check(1.kH.value, H.value*pow3)
        check(1.kilohenry.value, H.value*pow3)
        check(1.kH , kH)
        check(kilohenry, kH)
          
        val pow2 = 10.0.pow(2)
        check(1.hH.value, H.value*pow2)
        check(1.hectohenry.value, H.value*pow2)
        check(1.hH , hH)
        check(hectohenry, hH)
          
        val pow1 = 10.0.pow(1)
        check(1.daH.value, H.value*pow1)
        check(1.decahenry.value, H.value*pow1)
        check(1.daH , daH)
        check(decahenry, daH)
          
        val powM1 = 10.0.pow(-1)
        check(1.dH.value, H.value*powM1)
        check(1.decihenry.value, H.value*powM1)
        check(1.dH , dH)
        check(decihenry, dH)
          
        val powM2 = 10.0.pow(-2)
        check(1.cH.value, H.value*powM2)
        check(1.centihenry.value, H.value*powM2)
        check(1.cH , cH)
        check(centihenry, cH)
          
        val powM3 = 10.0.pow(-3)
        check(1.mH.value, H.value*powM3)
        check(1.millihenry.value, H.value*powM3)
        check(1.mH , mH)
        check(millihenry, mH)
          
        val powM6 = 10.0.pow(-6)
        check(1.μH.value, H.value*powM6)
        check(1.microhenry.value, H.value*powM6)
        check(1.μH , μH)
        check(microhenry, μH)
          
        val powM9 = 10.0.pow(-9)
        check(1.nH.value, H.value*powM9)
        check(1.nanohenry.value, H.value*powM9)
        check(1.nH , nH)
        check(nanohenry, nH)
          
        val powM12 = 10.0.pow(-12)
        check(1.pH.value, H.value*powM12)
        check(1.picohenry.value, H.value*powM12)
        check(1.pH , pH)
        check(picohenry, pH)
          
        val powM15 = 10.0.pow(-15)
        check(1.fH.value, H.value*powM15)
        check(1.femtohenry.value, H.value*powM15)
        check(1.fH , fH)
        check(femtohenry, fH)
          
        val powM18 = 10.0.pow(-18)
        check(1.aH.value, H.value*powM18)
        check(1.attohenry.value, H.value*powM18)
        check(1.aH , aH)
        check(attohenry, aH)
          
        val powM21 = 10.0.pow(-21)
        check(1.zH.value, H.value*powM21)
        check(1.zeptohenry.value, H.value*powM21)
        check(1.zH , zH)
        check(zeptohenry, zH)
          
        val powM24 = 10.0.pow(-24)
        check(1.yH.value, H.value*powM24)
        check(1.yoctohenry.value, H.value*powM24)
        check(1.yH , yH)
        check(yoctohenry, yH)
          
        val powM27 = 10.0.pow(-27)
        check(1.rH.value, H.value*powM27)
        check(1.rontohenry.value, H.value*powM27)
        check(1.rH , rH)
        check(rontohenry, rH)
          
        val powM30 = 10.0.pow(-30)
        check(1.qH.value, H.value*powM30)
        check(1.quectohenry.value, H.value*powM30)
        check(1.qH , qH)
        check(quectohenry, qH)   }
}