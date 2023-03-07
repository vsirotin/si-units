        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object OhmKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(1.Ω , Ω)
              
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(1.QΩ.value, Ω.value*pow30)
        check(1.quettaohm.value, Ω.value*pow30)
        check(1.QΩ , QΩ)
        check(quettaohm, QΩ)
          
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(1.RΩ.value, Ω.value*pow27)
        check(1.ronnaohm.value, Ω.value*pow27)
        check(1.RΩ , RΩ)
        check(ronnaohm, RΩ)
          
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(1.YΩ.value, Ω.value*pow24)
        check(1.yottaohm.value, Ω.value*pow24)
        check(1.YΩ , YΩ)
        check(yottaohm, YΩ)
          
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(1.ZΩ.value, Ω.value*pow21)
        check(1.zettaohm.value, Ω.value*pow21)
        check(1.ZΩ , ZΩ)
        check(zettaohm, ZΩ)
          
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(1.EΩ.value, Ω.value*pow18)
        check(1.exaohm.value, Ω.value*pow18)
        check(1.EΩ , EΩ)
        check(exaohm, EΩ)
          
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(1.PΩ.value, Ω.value*pow15)
        check(1.petaohm.value, Ω.value*pow15)
        check(1.PΩ , PΩ)
        check(petaohm, PΩ)
          
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(1.TΩ.value, Ω.value*pow12)
        check(1.teraohm.value, Ω.value*pow12)
        check(1.TΩ , TΩ)
        check(teraohm, TΩ)
          
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(1.GΩ.value, Ω.value*pow9)
        check(1.gigaohm.value, Ω.value*pow9)
        check(1.GΩ , GΩ)
        check(gigaohm, GΩ)
          
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(1.MΩ.value, Ω.value*pow6)
        check(1.megaohm.value, Ω.value*pow6)
        check(1.MΩ , MΩ)
        check(megaohm, MΩ)
          
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(1.kΩ.value, Ω.value*pow3)
        check(1.kiloohm.value, Ω.value*pow3)
        check(1.kΩ , kΩ)
        check(kiloohm, kΩ)
          
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(1.hΩ.value, Ω.value*pow2)
        check(1.hectoohm.value, Ω.value*pow2)
        check(1.hΩ , hΩ)
        check(hectoohm, hΩ)
          
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(1.daΩ.value, Ω.value*pow1)
        check(1.decaohm.value, Ω.value*pow1)
        check(1.daΩ , daΩ)
        check(decaohm, daΩ)
          
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(1.dΩ.value, Ω.value*powM1)
        check(1.deciohm.value, Ω.value*powM1)
        check(1.dΩ , dΩ)
        check(deciohm, dΩ)
          
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(1.cΩ.value, Ω.value*powM2)
        check(1.centiohm.value, Ω.value*powM2)
        check(1.cΩ , cΩ)
        check(centiohm, cΩ)
          
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(1.mΩ.value, Ω.value*powM3)
        check(1.milliohm.value, Ω.value*powM3)
        check(1.mΩ , mΩ)
        check(milliohm, mΩ)
          
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(1.μΩ.value, Ω.value*powM6)
        check(1.microohm.value, Ω.value*powM6)
        check(1.μΩ , μΩ)
        check(microohm, μΩ)
          
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(1.nΩ.value, Ω.value*powM9)
        check(1.nanoohm.value, Ω.value*powM9)
        check(1.nΩ , nΩ)
        check(nanoohm, nΩ)
          
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(1.pΩ.value, Ω.value*powM12)
        check(1.picoohm.value, Ω.value*powM12)
        check(1.pΩ , pΩ)
        check(picoohm, pΩ)
          
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(1.fΩ.value, Ω.value*powM15)
        check(1.femtoohm.value, Ω.value*powM15)
        check(1.fΩ , fΩ)
        check(femtoohm, fΩ)
          
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(1.aΩ.value, Ω.value*powM18)
        check(1.attoohm.value, Ω.value*powM18)
        check(1.aΩ , aΩ)
        check(attoohm, aΩ)
          
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(1.zΩ.value, Ω.value*powM21)
        check(1.zeptoohm.value, Ω.value*powM21)
        check(1.zΩ , zΩ)
        check(zeptoohm, zΩ)
          
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(1.yΩ.value, Ω.value*powM24)
        check(1.yoctoohm.value, Ω.value*powM24)
        check(1.yΩ , yΩ)
        check(yoctoohm, yΩ)
          
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(1.rΩ.value, Ω.value*powM27)
        check(1.rontoohm.value, Ω.value*powM27)
        check(1.rΩ , rΩ)
        check(rontoohm, rΩ)
          
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(1.qΩ.value, Ω.value*powM30)
        check(1.quectoohm.value, Ω.value*powM30)
        check(1.qΩ , qΩ)
        check(quectoohm, qΩ)   }
}