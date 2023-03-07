        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object SiemensKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(1.S , S)
              
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(1.QS.value, S.value*pow30)
        check(1.quettasiemens.value, S.value*pow30)
        check(1.QS , QS)
        check(quettasiemens, QS)
          
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(1.RS.value, S.value*pow27)
        check(1.ronnasiemens.value, S.value*pow27)
        check(1.RS , RS)
        check(ronnasiemens, RS)
          
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(1.YS.value, S.value*pow24)
        check(1.yottasiemens.value, S.value*pow24)
        check(1.YS , YS)
        check(yottasiemens, YS)
          
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(1.ZS.value, S.value*pow21)
        check(1.zettasiemens.value, S.value*pow21)
        check(1.ZS , ZS)
        check(zettasiemens, ZS)
          
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(1.ES.value, S.value*pow18)
        check(1.exasiemens.value, S.value*pow18)
        check(1.ES , ES)
        check(exasiemens, ES)
          
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(1.PS.value, S.value*pow15)
        check(1.petasiemens.value, S.value*pow15)
        check(1.PS , PS)
        check(petasiemens, PS)
          
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(1.TS.value, S.value*pow12)
        check(1.terasiemens.value, S.value*pow12)
        check(1.TS , TS)
        check(terasiemens, TS)
          
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(1.GS.value, S.value*pow9)
        check(1.gigasiemens.value, S.value*pow9)
        check(1.GS , GS)
        check(gigasiemens, GS)
          
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(1.MS.value, S.value*pow6)
        check(1.megasiemens.value, S.value*pow6)
        check(1.MS , MS)
        check(megasiemens, MS)
          
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(1.kS.value, S.value*pow3)
        check(1.kilosiemens.value, S.value*pow3)
        check(1.kS , kS)
        check(kilosiemens, kS)
          
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(1.hS.value, S.value*pow2)
        check(1.hectosiemens.value, S.value*pow2)
        check(1.hS , hS)
        check(hectosiemens, hS)
          
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(1.daS.value, S.value*pow1)
        check(1.decasiemens.value, S.value*pow1)
        check(1.daS , daS)
        check(decasiemens, daS)
          
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(1.dS.value, S.value*powM1)
        check(1.decisiemens.value, S.value*powM1)
        check(1.dS , dS)
        check(decisiemens, dS)
          
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(1.cS.value, S.value*powM2)
        check(1.centisiemens.value, S.value*powM2)
        check(1.cS , cS)
        check(centisiemens, cS)
          
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(1.mS.value, S.value*powM3)
        check(1.millisiemens.value, S.value*powM3)
        check(1.mS , mS)
        check(millisiemens, mS)
          
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(1.μS.value, S.value*powM6)
        check(1.microsiemens.value, S.value*powM6)
        check(1.μS , μS)
        check(microsiemens, μS)
          
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(1.nS.value, S.value*powM9)
        check(1.nanosiemens.value, S.value*powM9)
        check(1.nS , nS)
        check(nanosiemens, nS)
          
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(1.pS.value, S.value*powM12)
        check(1.picosiemens.value, S.value*powM12)
        check(1.pS , pS)
        check(picosiemens, pS)
          
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(1.fS.value, S.value*powM15)
        check(1.femtosiemens.value, S.value*powM15)
        check(1.fS , fS)
        check(femtosiemens, fS)
          
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(1.aS.value, S.value*powM18)
        check(1.attosiemens.value, S.value*powM18)
        check(1.aS , aS)
        check(attosiemens, aS)
          
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(1.zS.value, S.value*powM21)
        check(1.zeptosiemens.value, S.value*powM21)
        check(1.zS , zS)
        check(zeptosiemens, zS)
          
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(1.yS.value, S.value*powM24)
        check(1.yoctosiemens.value, S.value*powM24)
        check(1.yS , yS)
        check(yoctosiemens, yS)
          
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(1.rS.value, S.value*powM27)
        check(1.rontosiemens.value, S.value*powM27)
        check(1.rS , rS)
        check(rontosiemens, rS)
          
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(1.qS.value, S.value*powM30)
        check(1.quectosiemens.value, S.value*powM30)
        check(1.qS , qS)
        check(quectosiemens, qS)   }
}