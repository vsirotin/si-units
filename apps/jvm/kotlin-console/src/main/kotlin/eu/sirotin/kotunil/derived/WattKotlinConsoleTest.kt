        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object WattKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.W , W)
              
        val pow30 = 10.0.pow(30)
        check(1.QW.value, W.value*pow30)
        check(1.quettawatt.value, W.value*pow30)
        check(1.QW , QW)
        check(quettawatt, QW)
          
        val pow27 = 10.0.pow(27)
        check(1.RW.value, W.value*pow27)
        check(1.ronnawatt.value, W.value*pow27)
        check(1.RW , RW)
        check(ronnawatt, RW)
          
        val pow24 = 10.0.pow(24)
        check(1.YW.value, W.value*pow24)
        check(1.yottawatt.value, W.value*pow24)
        check(1.YW , YW)
        check(yottawatt, YW)
          
        val pow21 = 10.0.pow(21)
        check(1.ZW.value, W.value*pow21)
        check(1.zettawatt.value, W.value*pow21)
        check(1.ZW , ZW)
        check(zettawatt, ZW)
          
        val pow18 = 10.0.pow(18)
        check(1.EW.value, W.value*pow18)
        check(1.exawatt.value, W.value*pow18)
        check(1.EW , EW)
        check(exawatt, EW)
          
        val pow15 = 10.0.pow(15)
        check(1.PW.value, W.value*pow15)
        check(1.petawatt.value, W.value*pow15)
        check(1.PW , PW)
        check(petawatt, PW)
          
        val pow12 = 10.0.pow(12)
        check(1.TW.value, W.value*pow12)
        check(1.terawatt.value, W.value*pow12)
        check(1.TW , TW)
        check(terawatt, TW)
          
        val pow9 = 10.0.pow(9)
        check(1.GW.value, W.value*pow9)
        check(1.gigawatt.value, W.value*pow9)
        check(1.GW , GW)
        check(gigawatt, GW)
          
        val pow6 = 10.0.pow(6)
        check(1.MW.value, W.value*pow6)
        check(1.megawatt.value, W.value*pow6)
        check(1.MW , MW)
        check(megawatt, MW)
          
        val pow3 = 10.0.pow(3)
        check(1.kW.value, W.value*pow3)
        check(1.kilowatt.value, W.value*pow3)
        check(1.kW , kW)
        check(kilowatt, kW)
          
        val pow2 = 10.0.pow(2)
        check(1.hW.value, W.value*pow2)
        check(1.hectowatt.value, W.value*pow2)
        check(1.hW , hW)
        check(hectowatt, hW)
          
        val pow1 = 10.0.pow(1)
        check(1.daW.value, W.value*pow1)
        check(1.decawatt.value, W.value*pow1)
        check(1.daW , daW)
        check(decawatt, daW)
          
        val powM1 = 10.0.pow(-1)
        check(1.dW.value, W.value*powM1)
        check(1.deciwatt.value, W.value*powM1)
        check(1.dW , dW)
        check(deciwatt, dW)
          
        val powM2 = 10.0.pow(-2)
        check(1.cW.value, W.value*powM2)
        check(1.centiwatt.value, W.value*powM2)
        check(1.cW , cW)
        check(centiwatt, cW)
          
        val powM3 = 10.0.pow(-3)
        check(1.mW.value, W.value*powM3)
        check(1.milliwatt.value, W.value*powM3)
        check(1.mW , mW)
        check(milliwatt, mW)
          
        val powM6 = 10.0.pow(-6)
        check(1.μW.value, W.value*powM6)
        check(1.microwatt.value, W.value*powM6)
        check(1.μW , μW)
        check(microwatt, μW)
          
        val powM9 = 10.0.pow(-9)
        check(1.nW.value, W.value*powM9)
        check(1.nanowatt.value, W.value*powM9)
        check(1.nW , nW)
        check(nanowatt, nW)
          
        val powM12 = 10.0.pow(-12)
        check(1.pW.value, W.value*powM12)
        check(1.picowatt.value, W.value*powM12)
        check(1.pW , pW)
        check(picowatt, pW)
          
        val powM15 = 10.0.pow(-15)
        check(1.fW.value, W.value*powM15)
        check(1.femtowatt.value, W.value*powM15)
        check(1.fW , fW)
        check(femtowatt, fW)
          
        val powM18 = 10.0.pow(-18)
        check(1.aW.value, W.value*powM18)
        check(1.attowatt.value, W.value*powM18)
        check(1.aW , aW)
        check(attowatt, aW)
          
        val powM21 = 10.0.pow(-21)
        check(1.zW.value, W.value*powM21)
        check(1.zeptowatt.value, W.value*powM21)
        check(1.zW , zW)
        check(zeptowatt, zW)
          
        val powM24 = 10.0.pow(-24)
        check(1.yW.value, W.value*powM24)
        check(1.yoctowatt.value, W.value*powM24)
        check(1.yW , yW)
        check(yoctowatt, yW)
          
        val powM27 = 10.0.pow(-27)
        check(1.rW.value, W.value*powM27)
        check(1.rontowatt.value, W.value*powM27)
        check(1.rW , rW)
        check(rontowatt, rW)
          
        val powM30 = 10.0.pow(-30)
        check(1.qW.value, W.value*powM30)
        check(1.quectowatt.value, W.value*powM30)
        check(1.qW , qW)
        check(quectowatt, qW)   }
}