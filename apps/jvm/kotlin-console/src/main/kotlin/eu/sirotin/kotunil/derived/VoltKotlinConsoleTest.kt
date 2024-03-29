        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object VoltKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.V , V)
              
        val pow30 = 10.0.pow(30)
        check(1.QV.value, V.value*pow30)
        check(1.quettavolt.value, V.value*pow30)
        check(1.QV , QV)
        check(quettavolt, QV)
          
        val pow27 = 10.0.pow(27)
        check(1.RV.value, V.value*pow27)
        check(1.ronnavolt.value, V.value*pow27)
        check(1.RV , RV)
        check(ronnavolt, RV)
          
        val pow24 = 10.0.pow(24)
        check(1.YV.value, V.value*pow24)
        check(1.yottavolt.value, V.value*pow24)
        check(1.YV , YV)
        check(yottavolt, YV)
          
        val pow21 = 10.0.pow(21)
        check(1.ZV.value, V.value*pow21)
        check(1.zettavolt.value, V.value*pow21)
        check(1.ZV , ZV)
        check(zettavolt, ZV)
          
        val pow18 = 10.0.pow(18)
        check(1.EV.value, V.value*pow18)
        check(1.exavolt.value, V.value*pow18)
        check(1.EV , EV)
        check(exavolt, EV)
          
        val pow15 = 10.0.pow(15)
        check(1.PV.value, V.value*pow15)
        check(1.petavolt.value, V.value*pow15)
        check(1.PV , PV)
        check(petavolt, PV)
          
        val pow12 = 10.0.pow(12)
        check(1.TV.value, V.value*pow12)
        check(1.teravolt.value, V.value*pow12)
        check(1.TV , TV)
        check(teravolt, TV)
          
        val pow9 = 10.0.pow(9)
        check(1.GV.value, V.value*pow9)
        check(1.gigavolt.value, V.value*pow9)
        check(1.GV , GV)
        check(gigavolt, GV)
          
        val pow6 = 10.0.pow(6)
        check(1.MV.value, V.value*pow6)
        check(1.megavolt.value, V.value*pow6)
        check(1.MV , MV)
        check(megavolt, MV)
          
        val pow3 = 10.0.pow(3)
        check(1.kV.value, V.value*pow3)
        check(1.kilovolt.value, V.value*pow3)
        check(1.kV , kV)
        check(kilovolt, kV)
          
        val pow2 = 10.0.pow(2)
        check(1.hV.value, V.value*pow2)
        check(1.hectovolt.value, V.value*pow2)
        check(1.hV , hV)
        check(hectovolt, hV)
          
        val pow1 = 10.0.pow(1)
        check(1.daV.value, V.value*pow1)
        check(1.decavolt.value, V.value*pow1)
        check(1.daV , daV)
        check(decavolt, daV)
          
        val powM1 = 10.0.pow(-1)
        check(1.dV.value, V.value*powM1)
        check(1.decivolt.value, V.value*powM1)
        check(1.dV , dV)
        check(decivolt, dV)
          
        val powM2 = 10.0.pow(-2)
        check(1.cV.value, V.value*powM2)
        check(1.centivolt.value, V.value*powM2)
        check(1.cV , cV)
        check(centivolt, cV)
          
        val powM3 = 10.0.pow(-3)
        check(1.mV.value, V.value*powM3)
        check(1.millivolt.value, V.value*powM3)
        check(1.mV , mV)
        check(millivolt, mV)
          
        val powM6 = 10.0.pow(-6)
        check(1.μV.value, V.value*powM6)
        check(1.microvolt.value, V.value*powM6)
        check(1.μV , μV)
        check(microvolt, μV)
          
        val powM9 = 10.0.pow(-9)
        check(1.nV.value, V.value*powM9)
        check(1.nanovolt.value, V.value*powM9)
        check(1.nV , nV)
        check(nanovolt, nV)
          
        val powM12 = 10.0.pow(-12)
        check(1.pV.value, V.value*powM12)
        check(1.picovolt.value, V.value*powM12)
        check(1.pV , pV)
        check(picovolt, pV)
          
        val powM15 = 10.0.pow(-15)
        check(1.fV.value, V.value*powM15)
        check(1.femtovolt.value, V.value*powM15)
        check(1.fV , fV)
        check(femtovolt, fV)
          
        val powM18 = 10.0.pow(-18)
        check(1.aV.value, V.value*powM18)
        check(1.attovolt.value, V.value*powM18)
        check(1.aV , aV)
        check(attovolt, aV)
          
        val powM21 = 10.0.pow(-21)
        check(1.zV.value, V.value*powM21)
        check(1.zeptovolt.value, V.value*powM21)
        check(1.zV , zV)
        check(zeptovolt, zV)
          
        val powM24 = 10.0.pow(-24)
        check(1.yV.value, V.value*powM24)
        check(1.yoctovolt.value, V.value*powM24)
        check(1.yV , yV)
        check(yoctovolt, yV)
          
        val powM27 = 10.0.pow(-27)
        check(1.rV.value, V.value*powM27)
        check(1.rontovolt.value, V.value*powM27)
        check(1.rV , rV)
        check(rontovolt, rV)
          
        val powM30 = 10.0.pow(-30)
        check(1.qV.value, V.value*powM30)
        check(1.quectovolt.value, V.value*powM30)
        check(1.qV , qV)
        check(quectovolt, qV)   }
}