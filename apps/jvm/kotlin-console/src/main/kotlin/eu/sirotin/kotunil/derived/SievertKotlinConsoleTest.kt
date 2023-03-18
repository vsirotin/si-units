        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object SievertKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.Sv , Sv)
              
        val pow30 = 10.0.pow(30)
        check(1.QSv.value, Sv.value*pow30)
        check(1.quettasievert.value, Sv.value*pow30)
        check(1.QSv , QSv)
        check(quettasievert, QSv)
          
        val pow27 = 10.0.pow(27)
        check(1.RSv.value, Sv.value*pow27)
        check(1.ronnasievert.value, Sv.value*pow27)
        check(1.RSv , RSv)
        check(ronnasievert, RSv)
          
        val pow24 = 10.0.pow(24)
        check(1.YSv.value, Sv.value*pow24)
        check(1.yottasievert.value, Sv.value*pow24)
        check(1.YSv , YSv)
        check(yottasievert, YSv)
          
        val pow21 = 10.0.pow(21)
        check(1.ZSv.value, Sv.value*pow21)
        check(1.zettasievert.value, Sv.value*pow21)
        check(1.ZSv , ZSv)
        check(zettasievert, ZSv)
          
        val pow18 = 10.0.pow(18)
        check(1.ESv.value, Sv.value*pow18)
        check(1.exasievert.value, Sv.value*pow18)
        check(1.ESv , ESv)
        check(exasievert, ESv)
          
        val pow15 = 10.0.pow(15)
        check(1.PSv.value, Sv.value*pow15)
        check(1.petasievert.value, Sv.value*pow15)
        check(1.PSv , PSv)
        check(petasievert, PSv)
          
        val pow12 = 10.0.pow(12)
        check(1.TSv.value, Sv.value*pow12)
        check(1.terasievert.value, Sv.value*pow12)
        check(1.TSv , TSv)
        check(terasievert, TSv)
          
        val pow9 = 10.0.pow(9)
        check(1.GSv.value, Sv.value*pow9)
        check(1.gigasievert.value, Sv.value*pow9)
        check(1.GSv , GSv)
        check(gigasievert, GSv)
          
        val pow6 = 10.0.pow(6)
        check(1.MSv.value, Sv.value*pow6)
        check(1.megasievert.value, Sv.value*pow6)
        check(1.MSv , MSv)
        check(megasievert, MSv)
          
        val pow3 = 10.0.pow(3)
        check(1.kSv.value, Sv.value*pow3)
        check(1.kilosievert.value, Sv.value*pow3)
        check(1.kSv , kSv)
        check(kilosievert, kSv)
          
        val pow2 = 10.0.pow(2)
        check(1.hSv.value, Sv.value*pow2)
        check(1.hectosievert.value, Sv.value*pow2)
        check(1.hSv , hSv)
        check(hectosievert, hSv)
          
        val pow1 = 10.0.pow(1)
        check(1.daSv.value, Sv.value*pow1)
        check(1.decasievert.value, Sv.value*pow1)
        check(1.daSv , daSv)
        check(decasievert, daSv)
          
        val powM1 = 10.0.pow(-1)
        check(1.dSv.value, Sv.value*powM1)
        check(1.decisievert.value, Sv.value*powM1)
        check(1.dSv , dSv)
        check(decisievert, dSv)
          
        val powM2 = 10.0.pow(-2)
        check(1.cSv.value, Sv.value*powM2)
        check(1.centisievert.value, Sv.value*powM2)
        check(1.cSv , cSv)
        check(centisievert, cSv)
          
        val powM3 = 10.0.pow(-3)
        check(1.mSv.value, Sv.value*powM3)
        check(1.millisievert.value, Sv.value*powM3)
        check(1.mSv , mSv)
        check(millisievert, mSv)
          
        val powM6 = 10.0.pow(-6)
        check(1.μSv.value, Sv.value*powM6)
        check(1.microsievert.value, Sv.value*powM6)
        check(1.μSv , μSv)
        check(microsievert, μSv)
          
        val powM9 = 10.0.pow(-9)
        check(1.nSv.value, Sv.value*powM9)
        check(1.nanosievert.value, Sv.value*powM9)
        check(1.nSv , nSv)
        check(nanosievert, nSv)
          
        val powM12 = 10.0.pow(-12)
        check(1.pSv.value, Sv.value*powM12)
        check(1.picosievert.value, Sv.value*powM12)
        check(1.pSv , pSv)
        check(picosievert, pSv)
          
        val powM15 = 10.0.pow(-15)
        check(1.fSv.value, Sv.value*powM15)
        check(1.femtosievert.value, Sv.value*powM15)
        check(1.fSv , fSv)
        check(femtosievert, fSv)
          
        val powM18 = 10.0.pow(-18)
        check(1.aSv.value, Sv.value*powM18)
        check(1.attosievert.value, Sv.value*powM18)
        check(1.aSv , aSv)
        check(attosievert, aSv)
          
        val powM21 = 10.0.pow(-21)
        check(1.zSv.value, Sv.value*powM21)
        check(1.zeptosievert.value, Sv.value*powM21)
        check(1.zSv , zSv)
        check(zeptosievert, zSv)
          
        val powM24 = 10.0.pow(-24)
        check(1.ySv.value, Sv.value*powM24)
        check(1.yoctosievert.value, Sv.value*powM24)
        check(1.ySv , ySv)
        check(yoctosievert, ySv)
          
        val powM27 = 10.0.pow(-27)
        check(1.rSv.value, Sv.value*powM27)
        check(1.rontosievert.value, Sv.value*powM27)
        check(1.rSv , rSv)
        check(rontosievert, rSv)
          
        val powM30 = 10.0.pow(-30)
        check(1.qSv.value, Sv.value*powM30)
        check(1.quectosievert.value, Sv.value*powM30)
        check(1.qSv , qSv)
        check(quectosievert, qSv)   }
}