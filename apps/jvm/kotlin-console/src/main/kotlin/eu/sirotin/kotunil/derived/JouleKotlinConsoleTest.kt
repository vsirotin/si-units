        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object JouleKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.J , J)
              
        val pow30 = 10.0.pow(30)
        check(1.QJ.value, J.value*pow30)
        check(1.quettajoule.value, J.value*pow30)
        check(1.QJ , QJ)
        check(quettajoule, QJ)
          
        val pow27 = 10.0.pow(27)
        check(1.RJ.value, J.value*pow27)
        check(1.ronnajoule.value, J.value*pow27)
        check(1.RJ , RJ)
        check(ronnajoule, RJ)
          
        val pow24 = 10.0.pow(24)
        check(1.YJ.value, J.value*pow24)
        check(1.yottajoule.value, J.value*pow24)
        check(1.YJ , YJ)
        check(yottajoule, YJ)
          
        val pow21 = 10.0.pow(21)
        check(1.ZJ.value, J.value*pow21)
        check(1.zettajoule.value, J.value*pow21)
        check(1.ZJ , ZJ)
        check(zettajoule, ZJ)
          
        val pow18 = 10.0.pow(18)
        check(1.EJ.value, J.value*pow18)
        check(1.exajoule.value, J.value*pow18)
        check(1.EJ , EJ)
        check(exajoule, EJ)
          
        val pow15 = 10.0.pow(15)
        check(1.PJ.value, J.value*pow15)
        check(1.petajoule.value, J.value*pow15)
        check(1.PJ , PJ)
        check(petajoule, PJ)
          
        val pow12 = 10.0.pow(12)
        check(1.TJ.value, J.value*pow12)
        check(1.terajoule.value, J.value*pow12)
        check(1.TJ , TJ)
        check(terajoule, TJ)
          
        val pow9 = 10.0.pow(9)
        check(1.GJ.value, J.value*pow9)
        check(1.gigajoule.value, J.value*pow9)
        check(1.GJ , GJ)
        check(gigajoule, GJ)
          
        val pow6 = 10.0.pow(6)
        check(1.MJ.value, J.value*pow6)
        check(1.megajoule.value, J.value*pow6)
        check(1.MJ , MJ)
        check(megajoule, MJ)
          
        val pow3 = 10.0.pow(3)
        check(1.kJ.value, J.value*pow3)
        check(1.kilojoule.value, J.value*pow3)
        check(1.kJ , kJ)
        check(kilojoule, kJ)
          
        val pow2 = 10.0.pow(2)
        check(1.hJ.value, J.value*pow2)
        check(1.hectojoule.value, J.value*pow2)
        check(1.hJ , hJ)
        check(hectojoule, hJ)
          
        val pow1 = 10.0.pow(1)
        check(1.daJ.value, J.value*pow1)
        check(1.decajoule.value, J.value*pow1)
        check(1.daJ , daJ)
        check(decajoule, daJ)
          
        val powM1 = 10.0.pow(-1)
        check(1.dJ.value, J.value*powM1)
        check(1.decijoule.value, J.value*powM1)
        check(1.dJ , dJ)
        check(decijoule, dJ)
          
        val powM2 = 10.0.pow(-2)
        check(1.cJ.value, J.value*powM2)
        check(1.centijoule.value, J.value*powM2)
        check(1.cJ , cJ)
        check(centijoule, cJ)
          
        val powM3 = 10.0.pow(-3)
        check(1.mJ.value, J.value*powM3)
        check(1.millijoule.value, J.value*powM3)
        check(1.mJ , mJ)
        check(millijoule, mJ)
          
        val powM6 = 10.0.pow(-6)
        check(1.μJ.value, J.value*powM6)
        check(1.microjoule.value, J.value*powM6)
        check(1.μJ , μJ)
        check(microjoule, μJ)
          
        val powM9 = 10.0.pow(-9)
        check(1.nJ.value, J.value*powM9)
        check(1.nanojoule.value, J.value*powM9)
        check(1.nJ , nJ)
        check(nanojoule, nJ)
          
        val powM12 = 10.0.pow(-12)
        check(1.pJ.value, J.value*powM12)
        check(1.picojoule.value, J.value*powM12)
        check(1.pJ , pJ)
        check(picojoule, pJ)
          
        val powM15 = 10.0.pow(-15)
        check(1.fJ.value, J.value*powM15)
        check(1.femtojoule.value, J.value*powM15)
        check(1.fJ , fJ)
        check(femtojoule, fJ)
          
        val powM18 = 10.0.pow(-18)
        check(1.aJ.value, J.value*powM18)
        check(1.attojoule.value, J.value*powM18)
        check(1.aJ , aJ)
        check(attojoule, aJ)
          
        val powM21 = 10.0.pow(-21)
        check(1.zJ.value, J.value*powM21)
        check(1.zeptojoule.value, J.value*powM21)
        check(1.zJ , zJ)
        check(zeptojoule, zJ)
          
        val powM24 = 10.0.pow(-24)
        check(1.yJ.value, J.value*powM24)
        check(1.yoctojoule.value, J.value*powM24)
        check(1.yJ , yJ)
        check(yoctojoule, yJ)
          
        val powM27 = 10.0.pow(-27)
        check(1.rJ.value, J.value*powM27)
        check(1.rontojoule.value, J.value*powM27)
        check(1.rJ , rJ)
        check(rontojoule, rJ)
          
        val powM30 = 10.0.pow(-30)
        check(1.qJ.value, J.value*powM30)
        check(1.quectojoule.value, J.value*powM30)
        check(1.qJ , qJ)
        check(quectojoule, qJ)   }
}