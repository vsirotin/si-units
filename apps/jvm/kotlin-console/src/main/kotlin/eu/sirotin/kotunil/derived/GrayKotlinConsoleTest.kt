        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object GrayKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.Gy , Gy)
              
        val pow30 = 10.0.pow(30)
        check(1.QGy.value, Gy.value*pow30)
        check(1.quettagray.value, Gy.value*pow30)
        check(1.QGy , QGy)
        check(quettagray, QGy)
          
        val pow27 = 10.0.pow(27)
        check(1.RGy.value, Gy.value*pow27)
        check(1.ronnagray.value, Gy.value*pow27)
        check(1.RGy , RGy)
        check(ronnagray, RGy)
          
        val pow24 = 10.0.pow(24)
        check(1.YGy.value, Gy.value*pow24)
        check(1.yottagray.value, Gy.value*pow24)
        check(1.YGy , YGy)
        check(yottagray, YGy)
          
        val pow21 = 10.0.pow(21)
        check(1.ZGy.value, Gy.value*pow21)
        check(1.zettagray.value, Gy.value*pow21)
        check(1.ZGy , ZGy)
        check(zettagray, ZGy)
          
        val pow18 = 10.0.pow(18)
        check(1.EGy.value, Gy.value*pow18)
        check(1.exagray.value, Gy.value*pow18)
        check(1.EGy , EGy)
        check(exagray, EGy)
          
        val pow15 = 10.0.pow(15)
        check(1.PGy.value, Gy.value*pow15)
        check(1.petagray.value, Gy.value*pow15)
        check(1.PGy , PGy)
        check(petagray, PGy)
          
        val pow12 = 10.0.pow(12)
        check(1.TGy.value, Gy.value*pow12)
        check(1.teragray.value, Gy.value*pow12)
        check(1.TGy , TGy)
        check(teragray, TGy)
          
        val pow9 = 10.0.pow(9)
        check(1.GGy.value, Gy.value*pow9)
        check(1.gigagray.value, Gy.value*pow9)
        check(1.GGy , GGy)
        check(gigagray, GGy)
          
        val pow6 = 10.0.pow(6)
        check(1.MGy.value, Gy.value*pow6)
        check(1.megagray.value, Gy.value*pow6)
        check(1.MGy , MGy)
        check(megagray, MGy)
          
        val pow3 = 10.0.pow(3)
        check(1.kGy.value, Gy.value*pow3)
        check(1.kilogray.value, Gy.value*pow3)
        check(1.kGy , kGy)
        check(kilogray, kGy)
          
        val pow2 = 10.0.pow(2)
        check(1.hGy.value, Gy.value*pow2)
        check(1.hectogray.value, Gy.value*pow2)
        check(1.hGy , hGy)
        check(hectogray, hGy)
          
        val pow1 = 10.0.pow(1)
        check(1.daGy.value, Gy.value*pow1)
        check(1.decagray.value, Gy.value*pow1)
        check(1.daGy , daGy)
        check(decagray, daGy)
          
        val powM1 = 10.0.pow(-1)
        check(1.dGy.value, Gy.value*powM1)
        check(1.decigray.value, Gy.value*powM1)
        check(1.dGy , dGy)
        check(decigray, dGy)
          
        val powM2 = 10.0.pow(-2)
        check(1.cGy.value, Gy.value*powM2)
        check(1.centigray.value, Gy.value*powM2)
        check(1.cGy , cGy)
        check(centigray, cGy)
          
        val powM3 = 10.0.pow(-3)
        check(1.mGy.value, Gy.value*powM3)
        check(1.milligray.value, Gy.value*powM3)
        check(1.mGy , mGy)
        check(milligray, mGy)
          
        val powM6 = 10.0.pow(-6)
        check(1.μGy.value, Gy.value*powM6)
        check(1.microgray.value, Gy.value*powM6)
        check(1.μGy , μGy)
        check(microgray, μGy)
          
        val powM9 = 10.0.pow(-9)
        check(1.nGy.value, Gy.value*powM9)
        check(1.nanogray.value, Gy.value*powM9)
        check(1.nGy , nGy)
        check(nanogray, nGy)
          
        val powM12 = 10.0.pow(-12)
        check(1.pGy.value, Gy.value*powM12)
        check(1.picogray.value, Gy.value*powM12)
        check(1.pGy , pGy)
        check(picogray, pGy)
          
        val powM15 = 10.0.pow(-15)
        check(1.fGy.value, Gy.value*powM15)
        check(1.femtogray.value, Gy.value*powM15)
        check(1.fGy , fGy)
        check(femtogray, fGy)
          
        val powM18 = 10.0.pow(-18)
        check(1.aGy.value, Gy.value*powM18)
        check(1.attogray.value, Gy.value*powM18)
        check(1.aGy , aGy)
        check(attogray, aGy)
          
        val powM21 = 10.0.pow(-21)
        check(1.zGy.value, Gy.value*powM21)
        check(1.zeptogray.value, Gy.value*powM21)
        check(1.zGy , zGy)
        check(zeptogray, zGy)
          
        val powM24 = 10.0.pow(-24)
        check(1.yGy.value, Gy.value*powM24)
        check(1.yoctogray.value, Gy.value*powM24)
        check(1.yGy , yGy)
        check(yoctogray, yGy)
          
        val powM27 = 10.0.pow(-27)
        check(1.rGy.value, Gy.value*powM27)
        check(1.rontogray.value, Gy.value*powM27)
        check(1.rGy , rGy)
        check(rontogray, rGy)
          
        val powM30 = 10.0.pow(-30)
        check(1.qGy.value, Gy.value*powM30)
        check(1.quectogray.value, Gy.value*powM30)
        check(1.qGy , qGy)
        check(quectogray, qGy)   }
}