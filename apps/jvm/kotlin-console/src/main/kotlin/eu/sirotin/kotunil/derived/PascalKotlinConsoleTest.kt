        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object PascalKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(1.Pa , Pa)
              
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(1.QPa.value, Pa.value*pow30)
        check(1.quettapascal.value, Pa.value*pow30)
        check(1.QPa , QPa)
        check(quettapascal, QPa)
          
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(1.RPa.value, Pa.value*pow27)
        check(1.ronnapascal.value, Pa.value*pow27)
        check(1.RPa , RPa)
        check(ronnapascal, RPa)
          
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(1.YPa.value, Pa.value*pow24)
        check(1.yottapascal.value, Pa.value*pow24)
        check(1.YPa , YPa)
        check(yottapascal, YPa)
          
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(1.ZPa.value, Pa.value*pow21)
        check(1.zettapascal.value, Pa.value*pow21)
        check(1.ZPa , ZPa)
        check(zettapascal, ZPa)
          
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(1.EPa.value, Pa.value*pow18)
        check(1.exapascal.value, Pa.value*pow18)
        check(1.EPa , EPa)
        check(exapascal, EPa)
          
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(1.PPa.value, Pa.value*pow15)
        check(1.petapascal.value, Pa.value*pow15)
        check(1.PPa , PPa)
        check(petapascal, PPa)
          
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(1.TPa.value, Pa.value*pow12)
        check(1.terapascal.value, Pa.value*pow12)
        check(1.TPa , TPa)
        check(terapascal, TPa)
          
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(1.GPa.value, Pa.value*pow9)
        check(1.gigapascal.value, Pa.value*pow9)
        check(1.GPa , GPa)
        check(gigapascal, GPa)
          
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(1.MPa.value, Pa.value*pow6)
        check(1.megapascal.value, Pa.value*pow6)
        check(1.MPa , MPa)
        check(megapascal, MPa)
          
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(1.kPa.value, Pa.value*pow3)
        check(1.kilopascal.value, Pa.value*pow3)
        check(1.kPa , kPa)
        check(kilopascal, kPa)
          
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(1.hPa.value, Pa.value*pow2)
        check(1.hectopascal.value, Pa.value*pow2)
        check(1.hPa , hPa)
        check(hectopascal, hPa)
          
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(1.daPa.value, Pa.value*pow1)
        check(1.decapascal.value, Pa.value*pow1)
        check(1.daPa , daPa)
        check(decapascal, daPa)
          
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(1.dPa.value, Pa.value*powM1)
        check(1.decipascal.value, Pa.value*powM1)
        check(1.dPa , dPa)
        check(decipascal, dPa)
          
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(1.cPa.value, Pa.value*powM2)
        check(1.centipascal.value, Pa.value*powM2)
        check(1.cPa , cPa)
        check(centipascal, cPa)
          
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(1.mPa.value, Pa.value*powM3)
        check(1.millipascal.value, Pa.value*powM3)
        check(1.mPa , mPa)
        check(millipascal, mPa)
          
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(1.μPa.value, Pa.value*powM6)
        check(1.micropascal.value, Pa.value*powM6)
        check(1.μPa , μPa)
        check(micropascal, μPa)
          
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(1.nPa.value, Pa.value*powM9)
        check(1.nanopascal.value, Pa.value*powM9)
        check(1.nPa , nPa)
        check(nanopascal, nPa)
          
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(1.pPa.value, Pa.value*powM12)
        check(1.picopascal.value, Pa.value*powM12)
        check(1.pPa , pPa)
        check(picopascal, pPa)
          
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(1.fPa.value, Pa.value*powM15)
        check(1.femtopascal.value, Pa.value*powM15)
        check(1.fPa , fPa)
        check(femtopascal, fPa)
          
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(1.aPa.value, Pa.value*powM18)
        check(1.attopascal.value, Pa.value*powM18)
        check(1.aPa , aPa)
        check(attopascal, aPa)
          
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(1.zPa.value, Pa.value*powM21)
        check(1.zeptopascal.value, Pa.value*powM21)
        check(1.zPa , zPa)
        check(zeptopascal, zPa)
          
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(1.yPa.value, Pa.value*powM24)
        check(1.yoctopascal.value, Pa.value*powM24)
        check(1.yPa , yPa)
        check(yoctopascal, yPa)
          
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(1.rPa.value, Pa.value*powM27)
        check(1.rontopascal.value, Pa.value*powM27)
        check(1.rPa , rPa)
        check(rontopascal, rPa)
          
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(1.qPa.value, Pa.value*powM30)
        check(1.quectopascal.value, Pa.value*powM30)
        check(1.qPa , qPa)
        check(quectopascal, qPa)   }
}