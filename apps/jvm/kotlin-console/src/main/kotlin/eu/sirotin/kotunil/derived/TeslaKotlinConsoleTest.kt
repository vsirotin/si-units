        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object TeslaKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.T , T)
              
        val pow30 = 10.0.pow(30)
        check(1.QT.value, T.value*pow30)
        check(1.quettatesla.value, T.value*pow30)
        check(1.QT , QT)
        check(quettatesla, QT)
          
        val pow27 = 10.0.pow(27)
        check(1.RT.value, T.value*pow27)
        check(1.ronnatesla.value, T.value*pow27)
        check(1.RT , RT)
        check(ronnatesla, RT)
          
        val pow24 = 10.0.pow(24)
        check(1.YT.value, T.value*pow24)
        check(1.yottatesla.value, T.value*pow24)
        check(1.YT , YT)
        check(yottatesla, YT)
          
        val pow21 = 10.0.pow(21)
        check(1.ZT.value, T.value*pow21)
        check(1.zettatesla.value, T.value*pow21)
        check(1.ZT , ZT)
        check(zettatesla, ZT)
          
        val pow18 = 10.0.pow(18)
        check(1.ET.value, T.value*pow18)
        check(1.exatesla.value, T.value*pow18)
        check(1.ET , ET)
        check(exatesla, ET)
          
        val pow15 = 10.0.pow(15)
        check(1.PT.value, T.value*pow15)
        check(1.petatesla.value, T.value*pow15)
        check(1.PT , PT)
        check(petatesla, PT)
          
        val pow12 = 10.0.pow(12)
        check(1.TT.value, T.value*pow12)
        check(1.teratesla.value, T.value*pow12)
        check(1.TT , TT)
        check(teratesla, TT)
          
        val pow9 = 10.0.pow(9)
        check(1.GT.value, T.value*pow9)
        check(1.gigatesla.value, T.value*pow9)
        check(1.GT , GT)
        check(gigatesla, GT)
          
        val pow6 = 10.0.pow(6)
        check(1.MT.value, T.value*pow6)
        check(1.megatesla.value, T.value*pow6)
        check(1.MT , MT)
        check(megatesla, MT)
          
        val pow3 = 10.0.pow(3)
        check(1.kT.value, T.value*pow3)
        check(1.kilotesla.value, T.value*pow3)
        check(1.kT , kT)
        check(kilotesla, kT)
          
        val pow2 = 10.0.pow(2)
        check(1.hT.value, T.value*pow2)
        check(1.hectotesla.value, T.value*pow2)
        check(1.hT , hT)
        check(hectotesla, hT)
          
        val pow1 = 10.0.pow(1)
        check(1.daT.value, T.value*pow1)
        check(1.decatesla.value, T.value*pow1)
        check(1.daT , daT)
        check(decatesla, daT)
          
        val powM1 = 10.0.pow(-1)
        check(1.dT.value, T.value*powM1)
        check(1.decitesla.value, T.value*powM1)
        check(1.dT , dT)
        check(decitesla, dT)
          
        val powM2 = 10.0.pow(-2)
        check(1.cT.value, T.value*powM2)
        check(1.centitesla.value, T.value*powM2)
        check(1.cT , cT)
        check(centitesla, cT)
          
        val powM3 = 10.0.pow(-3)
        check(1.mT.value, T.value*powM3)
        check(1.millitesla.value, T.value*powM3)
        check(1.mT , mT)
        check(millitesla, mT)
          
        val powM6 = 10.0.pow(-6)
        check(1.μT.value, T.value*powM6)
        check(1.microtesla.value, T.value*powM6)
        check(1.μT , μT)
        check(microtesla, μT)
          
        val powM9 = 10.0.pow(-9)
        check(1.nT.value, T.value*powM9)
        check(1.nanotesla.value, T.value*powM9)
        check(1.nT , nT)
        check(nanotesla, nT)
          
        val powM12 = 10.0.pow(-12)
        check(1.pT.value, T.value*powM12)
        check(1.picotesla.value, T.value*powM12)
        check(1.pT , pT)
        check(picotesla, pT)
          
        val powM15 = 10.0.pow(-15)
        check(1.fT.value, T.value*powM15)
        check(1.femtotesla.value, T.value*powM15)
        check(1.fT , fT)
        check(femtotesla, fT)
          
        val powM18 = 10.0.pow(-18)
        check(1.aT.value, T.value*powM18)
        check(1.attotesla.value, T.value*powM18)
        check(1.aT , aT)
        check(attotesla, aT)
          
        val powM21 = 10.0.pow(-21)
        check(1.zT.value, T.value*powM21)
        check(1.zeptotesla.value, T.value*powM21)
        check(1.zT , zT)
        check(zeptotesla, zT)
          
        val powM24 = 10.0.pow(-24)
        check(1.yT.value, T.value*powM24)
        check(1.yoctotesla.value, T.value*powM24)
        check(1.yT , yT)
        check(yoctotesla, yT)
          
        val powM27 = 10.0.pow(-27)
        check(1.rT.value, T.value*powM27)
        check(1.rontotesla.value, T.value*powM27)
        check(1.rT , rT)
        check(rontotesla, rT)
          
        val powM30 = 10.0.pow(-30)
        check(1.qT.value, T.value*powM30)
        check(1.quectotesla.value, T.value*powM30)
        check(1.qT , qT)
        check(quectotesla, qT)   }
}