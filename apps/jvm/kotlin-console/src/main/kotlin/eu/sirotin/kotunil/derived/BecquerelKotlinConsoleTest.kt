        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object BecquerelKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++
        check(1.Bq , Bq)
              
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(1.QBq.value, Bq.value*pow30)
        check(1.quettabecquerel.value, Bq.value*pow30)
        check(1.QBq , QBq)
        check(quettabecquerel, QBq)
          
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(1.RBq.value, Bq.value*pow27)
        check(1.ronnabecquerel.value, Bq.value*pow27)
        check(1.RBq , RBq)
        check(ronnabecquerel, RBq)
          
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(1.YBq.value, Bq.value*pow24)
        check(1.yottabecquerel.value, Bq.value*pow24)
        check(1.YBq , YBq)
        check(yottabecquerel, YBq)
          
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(1.ZBq.value, Bq.value*pow21)
        check(1.zettabecquerel.value, Bq.value*pow21)
        check(1.ZBq , ZBq)
        check(zettabecquerel, ZBq)
          
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(1.EBq.value, Bq.value*pow18)
        check(1.exabecquerel.value, Bq.value*pow18)
        check(1.EBq , EBq)
        check(exabecquerel, EBq)
          
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(1.PBq.value, Bq.value*pow15)
        check(1.petabecquerel.value, Bq.value*pow15)
        check(1.PBq , PBq)
        check(petabecquerel, PBq)
          
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(1.TBq.value, Bq.value*pow12)
        check(1.terabecquerel.value, Bq.value*pow12)
        check(1.TBq , TBq)
        check(terabecquerel, TBq)
          
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(1.GBq.value, Bq.value*pow9)
        check(1.gigabecquerel.value, Bq.value*pow9)
        check(1.GBq , GBq)
        check(gigabecquerel, GBq)
          
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(1.MBq.value, Bq.value*pow6)
        check(1.megabecquerel.value, Bq.value*pow6)
        check(1.MBq , MBq)
        check(megabecquerel, MBq)
          
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(1.kBq.value, Bq.value*pow3)
        check(1.kilobecquerel.value, Bq.value*pow3)
        check(1.kBq , kBq)
        check(kilobecquerel, kBq)
          
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(1.hBq.value, Bq.value*pow2)
        check(1.hectobecquerel.value, Bq.value*pow2)
        check(1.hBq , hBq)
        check(hectobecquerel, hBq)
          
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(1.daBq.value, Bq.value*pow1)
        check(1.decabecquerel.value, Bq.value*pow1)
        check(1.daBq , daBq)
        check(decabecquerel, daBq)
          
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(1.dBq.value, Bq.value*powM1)
        check(1.decibecquerel.value, Bq.value*powM1)
        check(1.dBq , dBq)
        check(decibecquerel, dBq)
          
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(1.cBq.value, Bq.value*powM2)
        check(1.centibecquerel.value, Bq.value*powM2)
        check(1.cBq , cBq)
        check(centibecquerel, cBq)
          
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(1.mBq.value, Bq.value*powM3)
        check(1.millibecquerel.value, Bq.value*powM3)
        check(1.mBq , mBq)
        check(millibecquerel, mBq)
          
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(1.μBq.value, Bq.value*powM6)
        check(1.microbecquerel.value, Bq.value*powM6)
        check(1.μBq , μBq)
        check(microbecquerel, μBq)
          
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(1.nBq.value, Bq.value*powM9)
        check(1.nanobecquerel.value, Bq.value*powM9)
        check(1.nBq , nBq)
        check(nanobecquerel, nBq)
          
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(1.pBq.value, Bq.value*powM12)
        check(1.picobecquerel.value, Bq.value*powM12)
        check(1.pBq , pBq)
        check(picobecquerel, pBq)
          
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(1.fBq.value, Bq.value*powM15)
        check(1.femtobecquerel.value, Bq.value*powM15)
        check(1.fBq , fBq)
        check(femtobecquerel, fBq)
          
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(1.aBq.value, Bq.value*powM18)
        check(1.attobecquerel.value, Bq.value*powM18)
        check(1.aBq , aBq)
        check(attobecquerel, aBq)
          
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(1.zBq.value, Bq.value*powM21)
        check(1.zeptobecquerel.value, Bq.value*powM21)
        check(1.zBq , zBq)
        check(zeptobecquerel, zBq)
          
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(1.yBq.value, Bq.value*powM24)
        check(1.yoctobecquerel.value, Bq.value*powM24)
        check(1.yBq , yBq)
        check(yoctobecquerel, yBq)
          
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(1.rBq.value, Bq.value*powM27)
        check(1.rontobecquerel.value, Bq.value*powM27)
        check(1.rBq , rBq)
        check(rontobecquerel, rBq)
          
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(1.qBq.value, Bq.value*powM30)
        check(1.quectobecquerel.value, Bq.value*powM30)
        check(1.qBq , qBq)
        check(quectobecquerel, qBq)   }
}