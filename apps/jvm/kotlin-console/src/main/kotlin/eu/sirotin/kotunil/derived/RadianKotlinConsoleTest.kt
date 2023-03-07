        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object RadianKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(1.rad , rad)
              
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(1.Qrad.value, rad.value*pow30)
        check(1.quettaradian.value, rad.value*pow30)
        check(1.Qrad , Qrad)
        check(quettaradian, Qrad)
          
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(1.Rrad.value, rad.value*pow27)
        check(1.ronnaradian.value, rad.value*pow27)
        check(1.Rrad , Rrad)
        check(ronnaradian, Rrad)
          
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(1.Yrad.value, rad.value*pow24)
        check(1.yottaradian.value, rad.value*pow24)
        check(1.Yrad , Yrad)
        check(yottaradian, Yrad)
          
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(1.Zrad.value, rad.value*pow21)
        check(1.zettaradian.value, rad.value*pow21)
        check(1.Zrad , Zrad)
        check(zettaradian, Zrad)
          
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(1.Erad.value, rad.value*pow18)
        check(1.exaradian.value, rad.value*pow18)
        check(1.Erad , Erad)
        check(exaradian, Erad)
          
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(1.Prad.value, rad.value*pow15)
        check(1.petaradian.value, rad.value*pow15)
        check(1.Prad , Prad)
        check(petaradian, Prad)
          
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(1.Trad.value, rad.value*pow12)
        check(1.teraradian.value, rad.value*pow12)
        check(1.Trad , Trad)
        check(teraradian, Trad)
          
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(1.Grad.value, rad.value*pow9)
        check(1.gigaradian.value, rad.value*pow9)
        check(1.Grad , Grad)
        check(gigaradian, Grad)
          
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(1.Mrad.value, rad.value*pow6)
        check(1.megaradian.value, rad.value*pow6)
        check(1.Mrad , Mrad)
        check(megaradian, Mrad)
          
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(1.krad.value, rad.value*pow3)
        check(1.kiloradian.value, rad.value*pow3)
        check(1.krad , krad)
        check(kiloradian, krad)
          
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(1.hrad.value, rad.value*pow2)
        check(1.hectoradian.value, rad.value*pow2)
        check(1.hrad , hrad)
        check(hectoradian, hrad)
          
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(1.darad.value, rad.value*pow1)
        check(1.decaradian.value, rad.value*pow1)
        check(1.darad , darad)
        check(decaradian, darad)
          
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(1.drad.value, rad.value*powM1)
        check(1.deciradian.value, rad.value*powM1)
        check(1.drad , drad)
        check(deciradian, drad)
          
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(1.crad.value, rad.value*powM2)
        check(1.centiradian.value, rad.value*powM2)
        check(1.crad , crad)
        check(centiradian, crad)
          
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(1.mrad.value, rad.value*powM3)
        check(1.milliradian.value, rad.value*powM3)
        check(1.mrad , mrad)
        check(milliradian, mrad)
          
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(1.μrad.value, rad.value*powM6)
        check(1.microradian.value, rad.value*powM6)
        check(1.μrad , μrad)
        check(microradian, μrad)
          
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(1.nrad.value, rad.value*powM9)
        check(1.nanoradian.value, rad.value*powM9)
        check(1.nrad , nrad)
        check(nanoradian, nrad)
          
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(1.prad.value, rad.value*powM12)
        check(1.picoradian.value, rad.value*powM12)
        check(1.prad , prad)
        check(picoradian, prad)
          
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(1.frad.value, rad.value*powM15)
        check(1.femtoradian.value, rad.value*powM15)
        check(1.frad , frad)
        check(femtoradian, frad)
          
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(1.arad.value, rad.value*powM18)
        check(1.attoradian.value, rad.value*powM18)
        check(1.arad , arad)
        check(attoradian, arad)
          
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(1.zrad.value, rad.value*powM21)
        check(1.zeptoradian.value, rad.value*powM21)
        check(1.zrad , zrad)
        check(zeptoradian, zrad)
          
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(1.yrad.value, rad.value*powM24)
        check(1.yoctoradian.value, rad.value*powM24)
        check(1.yrad , yrad)
        check(yoctoradian, yrad)
          
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(1.rrad.value, rad.value*powM27)
        check(1.rontoradian.value, rad.value*powM27)
        check(1.rrad , rrad)
        check(rontoradian, rrad)
          
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(1.qrad.value, rad.value*powM30)
        check(1.quectoradian.value, rad.value*powM30)
        check(1.qrad , qrad)
        check(quectoradian, qrad)   }
}