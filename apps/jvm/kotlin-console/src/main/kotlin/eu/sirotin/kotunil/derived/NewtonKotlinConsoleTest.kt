        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object NewtonKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.N , N)
              
        val pow30 = 10.0.pow(30)
        check(1.QN.value, N.value*pow30)
        check(1.quettanewton.value, N.value*pow30)
        check(1.QN , QN)
        check(quettanewton, QN)
          
        val pow27 = 10.0.pow(27)
        check(1.RN.value, N.value*pow27)
        check(1.ronnanewton.value, N.value*pow27)
        check(1.RN , RN)
        check(ronnanewton, RN)
          
        val pow24 = 10.0.pow(24)
        check(1.YN.value, N.value*pow24)
        check(1.yottanewton.value, N.value*pow24)
        check(1.YN , YN)
        check(yottanewton, YN)
          
        val pow21 = 10.0.pow(21)
        check(1.ZN.value, N.value*pow21)
        check(1.zettanewton.value, N.value*pow21)
        check(1.ZN , ZN)
        check(zettanewton, ZN)
          
        val pow18 = 10.0.pow(18)
        check(1.EN.value, N.value*pow18)
        check(1.exanewton.value, N.value*pow18)
        check(1.EN , EN)
        check(exanewton, EN)
          
        val pow15 = 10.0.pow(15)
        check(1.PN.value, N.value*pow15)
        check(1.petanewton.value, N.value*pow15)
        check(1.PN , PN)
        check(petanewton, PN)
          
        val pow12 = 10.0.pow(12)
        check(1.TN.value, N.value*pow12)
        check(1.teranewton.value, N.value*pow12)
        check(1.TN , TN)
        check(teranewton, TN)
          
        val pow9 = 10.0.pow(9)
        check(1.GN.value, N.value*pow9)
        check(1.giganewton.value, N.value*pow9)
        check(1.GN , GN)
        check(giganewton, GN)
          
        val pow6 = 10.0.pow(6)
        check(1.MN.value, N.value*pow6)
        check(1.meganewton.value, N.value*pow6)
        check(1.MN , MN)
        check(meganewton, MN)
          
        val pow3 = 10.0.pow(3)
        check(1.kN.value, N.value*pow3)
        check(1.kilonewton.value, N.value*pow3)
        check(1.kN , kN)
        check(kilonewton, kN)
          
        val pow2 = 10.0.pow(2)
        check(1.hN.value, N.value*pow2)
        check(1.hectonewton.value, N.value*pow2)
        check(1.hN , hN)
        check(hectonewton, hN)
          
        val pow1 = 10.0.pow(1)
        check(1.daN.value, N.value*pow1)
        check(1.decanewton.value, N.value*pow1)
        check(1.daN , daN)
        check(decanewton, daN)
          
        val powM1 = 10.0.pow(-1)
        check(1.dN.value, N.value*powM1)
        check(1.decinewton.value, N.value*powM1)
        check(1.dN , dN)
        check(decinewton, dN)
          
        val powM2 = 10.0.pow(-2)
        check(1.cN.value, N.value*powM2)
        check(1.centinewton.value, N.value*powM2)
        check(1.cN , cN)
        check(centinewton, cN)
          
        val powM3 = 10.0.pow(-3)
        check(1.mN.value, N.value*powM3)
        check(1.millinewton.value, N.value*powM3)
        check(1.mN , mN)
        check(millinewton, mN)
          
        val powM6 = 10.0.pow(-6)
        check(1.μN.value, N.value*powM6)
        check(1.micronewton.value, N.value*powM6)
        check(1.μN , μN)
        check(micronewton, μN)
          
        val powM9 = 10.0.pow(-9)
        check(1.nN.value, N.value*powM9)
        check(1.nanonewton.value, N.value*powM9)
        check(1.nN , nN)
        check(nanonewton, nN)
          
        val powM12 = 10.0.pow(-12)
        check(1.pN.value, N.value*powM12)
        check(1.piconewton.value, N.value*powM12)
        check(1.pN , pN)
        check(piconewton, pN)
          
        val powM15 = 10.0.pow(-15)
        check(1.fN.value, N.value*powM15)
        check(1.femtonewton.value, N.value*powM15)
        check(1.fN , fN)
        check(femtonewton, fN)
          
        val powM18 = 10.0.pow(-18)
        check(1.aN.value, N.value*powM18)
        check(1.attonewton.value, N.value*powM18)
        check(1.aN , aN)
        check(attonewton, aN)
          
        val powM21 = 10.0.pow(-21)
        check(1.zN.value, N.value*powM21)
        check(1.zeptonewton.value, N.value*powM21)
        check(1.zN , zN)
        check(zeptonewton, zN)
          
        val powM24 = 10.0.pow(-24)
        check(1.yN.value, N.value*powM24)
        check(1.yoctonewton.value, N.value*powM24)
        check(1.yN , yN)
        check(yoctonewton, yN)
          
        val powM27 = 10.0.pow(-27)
        check(1.rN.value, N.value*powM27)
        check(1.rontonewton.value, N.value*powM27)
        check(1.rN , rN)
        check(rontonewton, rN)
          
        val powM30 = 10.0.pow(-30)
        check(1.qN.value, N.value*powM30)
        check(1.quectonewton.value, N.value*powM30)
        check(1.qN , qN)
        check(quectonewton, qN)   }
}