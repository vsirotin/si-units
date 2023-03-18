        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object KelvinKotlinConsoleTest {

    fun kotlinConsoleTest() {

        check(Kelvin(1.0), K)
        check(1.K , K)

        //Serialization
        val v1 = Kelvin(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Kelvin(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        check(v1 , v2)
   
        val pow30 = 10.0.pow(30)
        check(pow30 * Kelvin(1.0), 1.QK)
        check(pow30 * Kelvin(1.0), 1.quettakelvin)
        check(1.K.QK , K.value/pow30)
        check(1.K.quettakelvin , K.value/pow30)
        check(1.QK , QK)
        check(quettakelvin , QK) 

   
        val pow27 = 10.0.pow(27)
        check(pow27 * Kelvin(1.0), 1.RK)
        check(pow27 * Kelvin(1.0), 1.ronnakelvin)
        check(1.K.RK , K.value/pow27)
        check(1.K.ronnakelvin , K.value/pow27)
        check(1.RK , RK)
        check(ronnakelvin , RK) 

   
        val pow24 = 10.0.pow(24)
        check(pow24 * Kelvin(1.0), 1.YK)
        check(pow24 * Kelvin(1.0), 1.yottakelvin)
        check(1.K.YK , K.value/pow24)
        check(1.K.yottakelvin , K.value/pow24)
        check(1.YK , YK)
        check(yottakelvin , YK) 

   
        val pow21 = 10.0.pow(21)
        check(pow21 * Kelvin(1.0), 1.ZK)
        check(pow21 * Kelvin(1.0), 1.zettakelvin)
        check(1.K.ZK , K.value/pow21)
        check(1.K.zettakelvin , K.value/pow21)
        check(1.ZK , ZK)
        check(zettakelvin , ZK) 

   
        val pow18 = 10.0.pow(18)
        check(pow18 * Kelvin(1.0), 1.EK)
        check(pow18 * Kelvin(1.0), 1.exakelvin)
        check(1.K.EK , K.value/pow18)
        check(1.K.exakelvin , K.value/pow18)
        check(1.EK , EK)
        check(exakelvin , EK) 

   
        val pow15 = 10.0.pow(15)
        check(pow15 * Kelvin(1.0), 1.PK)
        check(pow15 * Kelvin(1.0), 1.petakelvin)
        check(1.K.PK , K.value/pow15)
        check(1.K.petakelvin , K.value/pow15)
        check(1.PK , PK)
        check(petakelvin , PK) 

   
        val pow12 = 10.0.pow(12)
        check(pow12 * Kelvin(1.0), 1.TK)
        check(pow12 * Kelvin(1.0), 1.terakelvin)
        check(1.K.TK , K.value/pow12)
        check(1.K.terakelvin , K.value/pow12)
        check(1.TK , TK)
        check(terakelvin , TK) 

   
        val pow9 = 10.0.pow(9)
        check(pow9 * Kelvin(1.0), 1.GK)
        check(pow9 * Kelvin(1.0), 1.gigakelvin)
        check(1.K.GK , K.value/pow9)
        check(1.K.gigakelvin , K.value/pow9)
        check(1.GK , GK)
        check(gigakelvin , GK) 

   
        val pow6 = 10.0.pow(6)
        check(pow6 * Kelvin(1.0), 1.MK)
        check(pow6 * Kelvin(1.0), 1.megakelvin)
        check(1.K.MK , K.value/pow6)
        check(1.K.megakelvin , K.value/pow6)
        check(1.MK , MK)
        check(megakelvin , MK) 

   
        val pow3 = 10.0.pow(3)
        check(pow3 * Kelvin(1.0), 1.kK)
        check(pow3 * Kelvin(1.0), 1.kilokelvin)
        check(1.K.kK , K.value/pow3)
        check(1.K.kilokelvin , K.value/pow3)
        check(1.kK , kK)
        check(kilokelvin , kK) 

   
        val pow2 = 10.0.pow(2)
        check(pow2 * Kelvin(1.0), 1.hK)
        check(pow2 * Kelvin(1.0), 1.hectokelvin)
        check(1.K.hK , K.value/pow2)
        check(1.K.hectokelvin , K.value/pow2)
        check(1.hK , hK)
        check(hectokelvin , hK) 

   
        val pow1 = 10.0.pow(1)
        check(pow1 * Kelvin(1.0), 1.daK)
        check(pow1 * Kelvin(1.0), 1.decakelvin)
        check(1.K.daK , K.value/pow1)
        check(1.K.decakelvin , K.value/pow1)
        check(1.daK , daK)
        check(decakelvin , daK) 

   
        val powM1 = 10.0.pow(-1)
        check(powM1 * Kelvin(1.0), 1.dK)
        check(powM1 * Kelvin(1.0), 1.decikelvin)
        check(1.K.dK , K.value/powM1)
        check(1.K.decikelvin , K.value/powM1)
        check(1.dK , dK)
        check(decikelvin , dK) 

   
        val powM2 = 10.0.pow(-2)
        check(powM2 * Kelvin(1.0), 1.cK)
        check(powM2 * Kelvin(1.0), 1.centikelvin)
        check(1.K.cK , K.value/powM2)
        check(1.K.centikelvin , K.value/powM2)
        check(1.cK , cK)
        check(centikelvin , cK) 

   
        val powM3 = 10.0.pow(-3)
        check(powM3 * Kelvin(1.0), 1.mK)
        check(powM3 * Kelvin(1.0), 1.millikelvin)
        check(1.K.mK , K.value/powM3)
        check(1.K.millikelvin , K.value/powM3)
        check(1.mK , mK)
        check(millikelvin , mK) 

   
        val powM6 = 10.0.pow(-6)
        check(powM6 * Kelvin(1.0), 1.μK)
        check(powM6 * Kelvin(1.0), 1.microkelvin)
        check(1.K.μK , K.value/powM6)
        check(1.K.microkelvin , K.value/powM6)
        check(1.μK , μK)
        check(microkelvin , μK) 

   
        val powM9 = 10.0.pow(-9)
        check(powM9 * Kelvin(1.0), 1.nK)
        check(powM9 * Kelvin(1.0), 1.nanokelvin)
        check(1.K.nK , K.value/powM9)
        check(1.K.nanokelvin , K.value/powM9)
        check(1.nK , nK)
        check(nanokelvin , nK) 

   
        val powM12 = 10.0.pow(-12)
        check(powM12 * Kelvin(1.0), 1.pK)
        check(powM12 * Kelvin(1.0), 1.picokelvin)
        check(1.K.pK , K.value/powM12)
        check(1.K.picokelvin , K.value/powM12)
        check(1.pK , pK)
        check(picokelvin , pK) 

   
        val powM15 = 10.0.pow(-15)
        check(powM15 * Kelvin(1.0), 1.fK)
        check(powM15 * Kelvin(1.0), 1.femtokelvin)
        check(1.K.fK , K.value/powM15)
        check(1.K.femtokelvin , K.value/powM15)
        check(1.fK , fK)
        check(femtokelvin , fK) 

   
        val powM18 = 10.0.pow(-18)
        check(powM18 * Kelvin(1.0), 1.aK)
        check(powM18 * Kelvin(1.0), 1.attokelvin)
        check(1.K.aK , K.value/powM18)
        check(1.K.attokelvin , K.value/powM18)
        check(1.aK , aK)
        check(attokelvin , aK) 

   
        val powM21 = 10.0.pow(-21)
        check(powM21 * Kelvin(1.0), 1.zK)
        check(powM21 * Kelvin(1.0), 1.zeptokelvin)
        check(1.K.zK , K.value/powM21)
        check(1.K.zeptokelvin , K.value/powM21)
        check(1.zK , zK)
        check(zeptokelvin , zK) 

   
        val powM24 = 10.0.pow(-24)
        check(powM24 * Kelvin(1.0), 1.yK)
        check(powM24 * Kelvin(1.0), 1.yoctokelvin)
        check(1.K.yK , K.value/powM24)
        check(1.K.yoctokelvin , K.value/powM24)
        check(1.yK , yK)
        check(yoctokelvin , yK) 

   
        val powM27 = 10.0.pow(-27)
        check(powM27 * Kelvin(1.0), 1.rK)
        check(powM27 * Kelvin(1.0), 1.rontokelvin)
        check(1.K.rK , K.value/powM27)
        check(1.K.rontokelvin , K.value/powM27)
        check(1.rK , rK)
        check(rontokelvin , rK) 

   
        val powM30 = 10.0.pow(-30)
        check(powM30 * Kelvin(1.0), 1.qK)
        check(powM30 * Kelvin(1.0), 1.quectokelvin)
        check(1.K.qK , K.value/powM30)
        check(1.K.quectokelvin , K.value/powM30)
        check(1.qK , qK)
        check(quectokelvin , qK) 
   }
}