        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object AmpereKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++

        check(Ampere(1.0), A)
        check(1.A , A)

        //Serialization
        val v1 = Ampere(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Ampere(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        check(v1 , v2)
   
        val pow30 = 10.0.pow(30)
        check(pow30 * Ampere(1.0), 1.QA)
        check(pow30 * Ampere(1.0), 1.quettaampere)
        check(1.A.QA , A.value/pow30)
        check(1.A.quettaampere , A.value/pow30)
        check(1.QA , QA)
        check(quettaampere , QA) 

   
        val pow27 = 10.0.pow(27)
        check(pow27 * Ampere(1.0), 1.RA)
        check(pow27 * Ampere(1.0), 1.ronnaampere)
        check(1.A.RA , A.value/pow27)
        check(1.A.ronnaampere , A.value/pow27)
        check(1.RA , RA)
        check(ronnaampere , RA) 

   
        val pow24 = 10.0.pow(24)
        check(pow24 * Ampere(1.0), 1.YA)
        check(pow24 * Ampere(1.0), 1.yottaampere)
        check(1.A.YA , A.value/pow24)
        check(1.A.yottaampere , A.value/pow24)
        check(1.YA , YA)
        check(yottaampere , YA) 

   
        val pow21 = 10.0.pow(21)
        check(pow21 * Ampere(1.0), 1.ZA)
        check(pow21 * Ampere(1.0), 1.zettaampere)
        check(1.A.ZA , A.value/pow21)
        check(1.A.zettaampere , A.value/pow21)
        check(1.ZA , ZA)
        check(zettaampere , ZA) 

   
        val pow18 = 10.0.pow(18)
        check(pow18 * Ampere(1.0), 1.EA)
        check(pow18 * Ampere(1.0), 1.exaampere)
        check(1.A.EA , A.value/pow18)
        check(1.A.exaampere , A.value/pow18)
        check(1.EA , EA)
        check(exaampere , EA) 

   
        val pow15 = 10.0.pow(15)
        check(pow15 * Ampere(1.0), 1.PA)
        check(pow15 * Ampere(1.0), 1.petaampere)
        check(1.A.PA , A.value/pow15)
        check(1.A.petaampere , A.value/pow15)
        check(1.PA , PA)
        check(petaampere , PA) 

   
        val pow12 = 10.0.pow(12)
        check(pow12 * Ampere(1.0), 1.TA)
        check(pow12 * Ampere(1.0), 1.teraampere)
        check(1.A.TA , A.value/pow12)
        check(1.A.teraampere , A.value/pow12)
        check(1.TA , TA)
        check(teraampere , TA) 

   
        val pow9 = 10.0.pow(9)
        check(pow9 * Ampere(1.0), 1.GA)
        check(pow9 * Ampere(1.0), 1.gigaampere)
        check(1.A.GA , A.value/pow9)
        check(1.A.gigaampere , A.value/pow9)
        check(1.GA , GA)
        check(gigaampere , GA) 

   
        val pow6 = 10.0.pow(6)
        check(pow6 * Ampere(1.0), 1.MA)
        check(pow6 * Ampere(1.0), 1.megaampere)
        check(1.A.MA , A.value/pow6)
        check(1.A.megaampere , A.value/pow6)
        check(1.MA , MA)
        check(megaampere , MA) 

   
        val pow3 = 10.0.pow(3)
        check(pow3 * Ampere(1.0), 1.kA)
        check(pow3 * Ampere(1.0), 1.kiloampere)
        check(1.A.kA , A.value/pow3)
        check(1.A.kiloampere , A.value/pow3)
        check(1.kA , kA)
        check(kiloampere , kA) 

   
        val pow2 = 10.0.pow(2)
        check(pow2 * Ampere(1.0), 1.hA)
        check(pow2 * Ampere(1.0), 1.hectoampere)
        check(1.A.hA , A.value/pow2)
        check(1.A.hectoampere , A.value/pow2)
        check(1.hA , hA)
        check(hectoampere , hA) 

   
        val pow1 = 10.0.pow(1)
        check(pow1 * Ampere(1.0), 1.daA)
        check(pow1 * Ampere(1.0), 1.decaampere)
        check(1.A.daA , A.value/pow1)
        check(1.A.decaampere , A.value/pow1)
        check(1.daA , daA)
        check(decaampere , daA) 

   
        val powM1 = 10.0.pow(-1)
        check(powM1 * Ampere(1.0), 1.dA)
        check(powM1 * Ampere(1.0), 1.deciampere)
        check(1.A.dA , A.value/powM1)
        check(1.A.deciampere , A.value/powM1)
        check(1.dA , dA)
        check(deciampere , dA) 

   
        val powM2 = 10.0.pow(-2)
        check(powM2 * Ampere(1.0), 1.cA)
        check(powM2 * Ampere(1.0), 1.centiampere)
        check(1.A.cA , A.value/powM2)
        check(1.A.centiampere , A.value/powM2)
        check(1.cA , cA)
        check(centiampere , cA) 

   
        val powM3 = 10.0.pow(-3)
        check(powM3 * Ampere(1.0), 1.mA)
        check(powM3 * Ampere(1.0), 1.milliampere)
        check(1.A.mA , A.value/powM3)
        check(1.A.milliampere , A.value/powM3)
        check(1.mA , mA)
        check(milliampere , mA) 

   
        val powM6 = 10.0.pow(-6)
        check(powM6 * Ampere(1.0), 1.μA)
        check(powM6 * Ampere(1.0), 1.microampere)
        check(1.A.μA , A.value/powM6)
        check(1.A.microampere , A.value/powM6)
        check(1.μA , μA)
        check(microampere , μA) 

   
        val powM9 = 10.0.pow(-9)
        check(powM9 * Ampere(1.0), 1.nA)
        check(powM9 * Ampere(1.0), 1.nanoampere)
        check(1.A.nA , A.value/powM9)
        check(1.A.nanoampere , A.value/powM9)
        check(1.nA , nA)
        check(nanoampere , nA) 

   
        val powM12 = 10.0.pow(-12)
        check(powM12 * Ampere(1.0), 1.pA)
        check(powM12 * Ampere(1.0), 1.picoampere)
        check(1.A.pA , A.value/powM12)
        check(1.A.picoampere , A.value/powM12)
        check(1.pA , pA)
        check(picoampere , pA) 

   
        val powM15 = 10.0.pow(-15)
        check(powM15 * Ampere(1.0), 1.fA)
        check(powM15 * Ampere(1.0), 1.femtoampere)
        check(1.A.fA , A.value/powM15)
        check(1.A.femtoampere , A.value/powM15)
        check(1.fA , fA)
        check(femtoampere , fA) 

   
        val powM18 = 10.0.pow(-18)
        check(powM18 * Ampere(1.0), 1.aA)
        check(powM18 * Ampere(1.0), 1.attoampere)
        check(1.A.aA , A.value/powM18)
        check(1.A.attoampere , A.value/powM18)
        check(1.aA , aA)
        check(attoampere , aA) 

   
        val powM21 = 10.0.pow(-21)
        check(powM21 * Ampere(1.0), 1.zA)
        check(powM21 * Ampere(1.0), 1.zeptoampere)
        check(1.A.zA , A.value/powM21)
        check(1.A.zeptoampere , A.value/powM21)
        check(1.zA , zA)
        check(zeptoampere , zA) 

   
        val powM24 = 10.0.pow(-24)
        check(powM24 * Ampere(1.0), 1.yA)
        check(powM24 * Ampere(1.0), 1.yoctoampere)
        check(1.A.yA , A.value/powM24)
        check(1.A.yoctoampere , A.value/powM24)
        check(1.yA , yA)
        check(yoctoampere , yA) 

   
        val powM27 = 10.0.pow(-27)
        check(powM27 * Ampere(1.0), 1.rA)
        check(powM27 * Ampere(1.0), 1.rontoampere)
        check(1.A.rA , A.value/powM27)
        check(1.A.rontoampere , A.value/powM27)
        check(1.rA , rA)
        check(rontoampere , rA) 

   
        val powM30 = 10.0.pow(-30)
        check(powM30 * Ampere(1.0), 1.qA)
        check(powM30 * Ampere(1.0), 1.quectoampere)
        check(1.A.qA , A.value/powM30)
        check(1.A.quectoampere , A.value/powM30)
        check(1.qA , qA)
        check(quectoampere , qA) 
   }
}