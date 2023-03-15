        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object HertzKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.Hz , Hz)
              
        val pow30 = 10.0.pow(30)
        check(1.QHz.value, Hz.value*pow30)
        check(1.quettahertz.value, Hz.value*pow30)
        check(1.QHz , QHz)
        check(quettahertz, QHz)
          
        val pow27 = 10.0.pow(27)
        check(1.RHz.value, Hz.value*pow27)
        check(1.ronnahertz.value, Hz.value*pow27)
        check(1.RHz , RHz)
        check(ronnahertz, RHz)
          
        val pow24 = 10.0.pow(24)
        check(1.YHz.value, Hz.value*pow24)
        check(1.yottahertz.value, Hz.value*pow24)
        check(1.YHz , YHz)
        check(yottahertz, YHz)
          
        val pow21 = 10.0.pow(21)
        check(1.ZHz.value, Hz.value*pow21)
        check(1.zettahertz.value, Hz.value*pow21)
        check(1.ZHz , ZHz)
        check(zettahertz, ZHz)
          
        val pow18 = 10.0.pow(18)
        check(1.EHz.value, Hz.value*pow18)
        check(1.exahertz.value, Hz.value*pow18)
        check(1.EHz , EHz)
        check(exahertz, EHz)
          
        val pow15 = 10.0.pow(15)
        check(1.PHz.value, Hz.value*pow15)
        check(1.petahertz.value, Hz.value*pow15)
        check(1.PHz , PHz)
        check(petahertz, PHz)
          
        val pow12 = 10.0.pow(12)
        check(1.THz.value, Hz.value*pow12)
        check(1.terahertz.value, Hz.value*pow12)
        check(1.THz , THz)
        check(terahertz, THz)
          
        val pow9 = 10.0.pow(9)
        check(1.GHz.value, Hz.value*pow9)
        check(1.gigahertz.value, Hz.value*pow9)
        check(1.GHz , GHz)
        check(gigahertz, GHz)
          
        val pow6 = 10.0.pow(6)
        check(1.MHz.value, Hz.value*pow6)
        check(1.megahertz.value, Hz.value*pow6)
        check(1.MHz , MHz)
        check(megahertz, MHz)
          
        val pow3 = 10.0.pow(3)
        check(1.kHz.value, Hz.value*pow3)
        check(1.kilohertz.value, Hz.value*pow3)
        check(1.kHz , kHz)
        check(kilohertz, kHz)
          
        val pow2 = 10.0.pow(2)
        check(1.hHz.value, Hz.value*pow2)
        check(1.hectohertz.value, Hz.value*pow2)
        check(1.hHz , hHz)
        check(hectohertz, hHz)
          
        val pow1 = 10.0.pow(1)
        check(1.daHz.value, Hz.value*pow1)
        check(1.decahertz.value, Hz.value*pow1)
        check(1.daHz , daHz)
        check(decahertz, daHz)
          
        val powM1 = 10.0.pow(-1)
        check(1.dHz.value, Hz.value*powM1)
        check(1.decihertz.value, Hz.value*powM1)
        check(1.dHz , dHz)
        check(decihertz, dHz)
          
        val powM2 = 10.0.pow(-2)
        check(1.cHz.value, Hz.value*powM2)
        check(1.centihertz.value, Hz.value*powM2)
        check(1.cHz , cHz)
        check(centihertz, cHz)
          
        val powM3 = 10.0.pow(-3)
        check(1.mHz.value, Hz.value*powM3)
        check(1.millihertz.value, Hz.value*powM3)
        check(1.mHz , mHz)
        check(millihertz, mHz)
          
        val powM6 = 10.0.pow(-6)
        check(1.μHz.value, Hz.value*powM6)
        check(1.microhertz.value, Hz.value*powM6)
        check(1.μHz , μHz)
        check(microhertz, μHz)
          
        val powM9 = 10.0.pow(-9)
        check(1.nHz.value, Hz.value*powM9)
        check(1.nanohertz.value, Hz.value*powM9)
        check(1.nHz , nHz)
        check(nanohertz, nHz)
          
        val powM12 = 10.0.pow(-12)
        check(1.pHz.value, Hz.value*powM12)
        check(1.picohertz.value, Hz.value*powM12)
        check(1.pHz , pHz)
        check(picohertz, pHz)
          
        val powM15 = 10.0.pow(-15)
        check(1.fHz.value, Hz.value*powM15)
        check(1.femtohertz.value, Hz.value*powM15)
        check(1.fHz , fHz)
        check(femtohertz, fHz)
          
        val powM18 = 10.0.pow(-18)
        check(1.aHz.value, Hz.value*powM18)
        check(1.attohertz.value, Hz.value*powM18)
        check(1.aHz , aHz)
        check(attohertz, aHz)
          
        val powM21 = 10.0.pow(-21)
        check(1.zHz.value, Hz.value*powM21)
        check(1.zeptohertz.value, Hz.value*powM21)
        check(1.zHz , zHz)
        check(zeptohertz, zHz)
          
        val powM24 = 10.0.pow(-24)
        check(1.yHz.value, Hz.value*powM24)
        check(1.yoctohertz.value, Hz.value*powM24)
        check(1.yHz , yHz)
        check(yoctohertz, yHz)
          
        val powM27 = 10.0.pow(-27)
        check(1.rHz.value, Hz.value*powM27)
        check(1.rontohertz.value, Hz.value*powM27)
        check(1.rHz , rHz)
        check(rontohertz, rHz)
          
        val powM30 = 10.0.pow(-30)
        check(1.qHz.value, Hz.value*powM30)
        check(1.quectohertz.value, Hz.value*powM30)
        check(1.qHz , qHz)
        check(quectohertz, qHz)   }
}