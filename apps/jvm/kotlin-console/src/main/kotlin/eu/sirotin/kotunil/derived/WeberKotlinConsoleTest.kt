        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object WeberKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.Wb , Wb)
              
        val pow30 = 10.0.pow(30)
        check(1.QWb.value, Wb.value*pow30)
        check(1.quettaweber.value, Wb.value*pow30)
        check(1.QWb , QWb)
        check(quettaweber, QWb)
          
        val pow27 = 10.0.pow(27)
        check(1.RWb.value, Wb.value*pow27)
        check(1.ronnaweber.value, Wb.value*pow27)
        check(1.RWb , RWb)
        check(ronnaweber, RWb)
          
        val pow24 = 10.0.pow(24)
        check(1.YWb.value, Wb.value*pow24)
        check(1.yottaweber.value, Wb.value*pow24)
        check(1.YWb , YWb)
        check(yottaweber, YWb)
          
        val pow21 = 10.0.pow(21)
        check(1.ZWb.value, Wb.value*pow21)
        check(1.zettaweber.value, Wb.value*pow21)
        check(1.ZWb , ZWb)
        check(zettaweber, ZWb)
          
        val pow18 = 10.0.pow(18)
        check(1.EWb.value, Wb.value*pow18)
        check(1.exaweber.value, Wb.value*pow18)
        check(1.EWb , EWb)
        check(exaweber, EWb)
          
        val pow15 = 10.0.pow(15)
        check(1.PWb.value, Wb.value*pow15)
        check(1.petaweber.value, Wb.value*pow15)
        check(1.PWb , PWb)
        check(petaweber, PWb)
          
        val pow12 = 10.0.pow(12)
        check(1.TWb.value, Wb.value*pow12)
        check(1.teraweber.value, Wb.value*pow12)
        check(1.TWb , TWb)
        check(teraweber, TWb)
          
        val pow9 = 10.0.pow(9)
        check(1.GWb.value, Wb.value*pow9)
        check(1.gigaweber.value, Wb.value*pow9)
        check(1.GWb , GWb)
        check(gigaweber, GWb)
          
        val pow6 = 10.0.pow(6)
        check(1.MWb.value, Wb.value*pow6)
        check(1.megaweber.value, Wb.value*pow6)
        check(1.MWb , MWb)
        check(megaweber, MWb)
          
        val pow3 = 10.0.pow(3)
        check(1.kWb.value, Wb.value*pow3)
        check(1.kiloweber.value, Wb.value*pow3)
        check(1.kWb , kWb)
        check(kiloweber, kWb)
          
        val pow2 = 10.0.pow(2)
        check(1.hWb.value, Wb.value*pow2)
        check(1.hectoweber.value, Wb.value*pow2)
        check(1.hWb , hWb)
        check(hectoweber, hWb)
          
        val pow1 = 10.0.pow(1)
        check(1.daWb.value, Wb.value*pow1)
        check(1.decaweber.value, Wb.value*pow1)
        check(1.daWb , daWb)
        check(decaweber, daWb)
          
        val powM1 = 10.0.pow(-1)
        check(1.dWb.value, Wb.value*powM1)
        check(1.deciweber.value, Wb.value*powM1)
        check(1.dWb , dWb)
        check(deciweber, dWb)
          
        val powM2 = 10.0.pow(-2)
        check(1.cWb.value, Wb.value*powM2)
        check(1.centiweber.value, Wb.value*powM2)
        check(1.cWb , cWb)
        check(centiweber, cWb)
          
        val powM3 = 10.0.pow(-3)
        check(1.mWb.value, Wb.value*powM3)
        check(1.milliweber.value, Wb.value*powM3)
        check(1.mWb , mWb)
        check(milliweber, mWb)
          
        val powM6 = 10.0.pow(-6)
        check(1.μWb.value, Wb.value*powM6)
        check(1.microweber.value, Wb.value*powM6)
        check(1.μWb , μWb)
        check(microweber, μWb)
          
        val powM9 = 10.0.pow(-9)
        check(1.nWb.value, Wb.value*powM9)
        check(1.nanoweber.value, Wb.value*powM9)
        check(1.nWb , nWb)
        check(nanoweber, nWb)
          
        val powM12 = 10.0.pow(-12)
        check(1.pWb.value, Wb.value*powM12)
        check(1.picoweber.value, Wb.value*powM12)
        check(1.pWb , pWb)
        check(picoweber, pWb)
          
        val powM15 = 10.0.pow(-15)
        check(1.fWb.value, Wb.value*powM15)
        check(1.femtoweber.value, Wb.value*powM15)
        check(1.fWb , fWb)
        check(femtoweber, fWb)
          
        val powM18 = 10.0.pow(-18)
        check(1.aWb.value, Wb.value*powM18)
        check(1.attoweber.value, Wb.value*powM18)
        check(1.aWb , aWb)
        check(attoweber, aWb)
          
        val powM21 = 10.0.pow(-21)
        check(1.zWb.value, Wb.value*powM21)
        check(1.zeptoweber.value, Wb.value*powM21)
        check(1.zWb , zWb)
        check(zeptoweber, zWb)
          
        val powM24 = 10.0.pow(-24)
        check(1.yWb.value, Wb.value*powM24)
        check(1.yoctoweber.value, Wb.value*powM24)
        check(1.yWb , yWb)
        check(yoctoweber, yWb)
          
        val powM27 = 10.0.pow(-27)
        check(1.rWb.value, Wb.value*powM27)
        check(1.rontoweber.value, Wb.value*powM27)
        check(1.rWb , rWb)
        check(rontoweber, rWb)
          
        val powM30 = 10.0.pow(-30)
        check(1.qWb.value, Wb.value*powM30)
        check(1.quectoweber.value, Wb.value*powM30)
        check(1.qWb , qWb)
        check(quectoweber, qWb)   }
}