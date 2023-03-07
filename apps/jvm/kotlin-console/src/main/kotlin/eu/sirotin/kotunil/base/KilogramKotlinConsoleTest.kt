        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object KilogramKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++

        check(Kilogram(1.0), kg)
        check(1.kg , kg)

        //Serialization
        val v1 = Kilogram(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Kilogram(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        check(v1 , v2)
   
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(pow27 * Kilogram(1.0), 1.Qkg)
        check(pow27 * Kilogram(1.0), 1.quettakilogram)
        check(1.kg.Qkg , kg.value/pow27)
        check(1.kg.quettakilogram , kg.value/pow27)
        check(1.Qkg , Qkg)
        check(quettakilogram , Qkg) 

   
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(pow24 * Kilogram(1.0), 1.Rkg)
        check(pow24 * Kilogram(1.0), 1.ronnakilogram)
        check(1.kg.Rkg , kg.value/pow24)
        check(1.kg.ronnakilogram , kg.value/pow24)
        check(1.Rkg , Rkg)
        check(ronnakilogram , Rkg) 

   
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(pow21 * Kilogram(1.0), 1.Ykg)
        check(pow21 * Kilogram(1.0), 1.yottakilogram)
        check(1.kg.Ykg , kg.value/pow21)
        check(1.kg.yottakilogram , kg.value/pow21)
        check(1.Ykg , Ykg)
        check(yottakilogram , Ykg) 

   
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(pow18 * Kilogram(1.0), 1.Zkg)
        check(pow18 * Kilogram(1.0), 1.zettakilogram)
        check(1.kg.Zkg , kg.value/pow18)
        check(1.kg.zettakilogram , kg.value/pow18)
        check(1.Zkg , Zkg)
        check(zettakilogram , Zkg) 

   
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(pow15 * Kilogram(1.0), 1.Ekg)
        check(pow15 * Kilogram(1.0), 1.exakilogram)
        check(1.kg.Ekg , kg.value/pow15)
        check(1.kg.exakilogram , kg.value/pow15)
        check(1.Ekg , Ekg)
        check(exakilogram , Ekg) 

   
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(pow12 * Kilogram(1.0), 1.Pkg)
        check(pow12 * Kilogram(1.0), 1.petakilogram)
        check(1.kg.Pkg , kg.value/pow12)
        check(1.kg.petakilogram , kg.value/pow12)
        check(1.Pkg , Pkg)
        check(petakilogram , Pkg) 

   
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(pow9 * Kilogram(1.0), 1.Tkg)
        check(pow9 * Kilogram(1.0), 1.terakilogram)
        check(1.kg.Tkg , kg.value/pow9)
        check(1.kg.terakilogram , kg.value/pow9)
        check(1.Tkg , Tkg)
        check(terakilogram , Tkg) 

   
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(pow6 * Kilogram(1.0), 1.Gkg)
        check(pow6 * Kilogram(1.0), 1.gigakilogram)
        check(1.kg.Gkg , kg.value/pow6)
        check(1.kg.gigakilogram , kg.value/pow6)
        check(1.Gkg , Gkg)
        check(gigakilogram , Gkg) 

   
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(pow3 * Kilogram(1.0), 1.Mkg)
        check(pow3 * Kilogram(1.0), 1.megakilogram)
        check(1.kg.Mkg , kg.value/pow3)
        check(1.kg.megakilogram , kg.value/pow3)
        check(1.Mkg , Mkg)
        check(megakilogram , Mkg) 

   
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(powM1 * Kilogram(1.0), 1.hkg)
        check(powM1 * Kilogram(1.0), 1.hectokilogram)
        check(1.kg.hkg , kg.value/powM1)
        check(1.kg.hectokilogram , kg.value/powM1)
        check(1.hkg , hkg)
        check(hectokilogram , hkg) 

   
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(powM2 * Kilogram(1.0), 1.dakg)
        check(powM2 * Kilogram(1.0), 1.decakilogram)
        check(1.kg.dakg , kg.value/powM2)
        check(1.kg.decakilogram , kg.value/powM2)
        check(1.dakg , dakg)
        check(decakilogram , dakg) 

   
        TestStatistics.numberTestedObjects++
        val powM4 = 10.0.pow(-4)
        check(powM4 * Kilogram(1.0), 1.dkg)
        check(powM4 * Kilogram(1.0), 1.decikilogram)
        check(1.kg.dkg , kg.value/powM4)
        check(1.kg.decikilogram , kg.value/powM4)
        check(1.dkg , dkg)
        check(decikilogram , dkg) 

   
        TestStatistics.numberTestedObjects++
        val powM5 = 10.0.pow(-5)
        check(powM5 * Kilogram(1.0), 1.ckg)
        check(powM5 * Kilogram(1.0), 1.centikilogram)
        check(1.kg.ckg , kg.value/powM5)
        check(1.kg.centikilogram , kg.value/powM5)
        check(1.ckg , ckg)
        check(centikilogram , ckg) 

   
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(powM6 * Kilogram(1.0), 1.mkg)
        check(powM6 * Kilogram(1.0), 1.millikilogram)
        check(1.kg.mkg , kg.value/powM6)
        check(1.kg.millikilogram , kg.value/powM6)
        check(1.mkg , mkg)
        check(millikilogram , mkg) 

   
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(powM9 * Kilogram(1.0), 1.μkg)
        check(powM9 * Kilogram(1.0), 1.microkilogram)
        check(1.kg.μkg , kg.value/powM9)
        check(1.kg.microkilogram , kg.value/powM9)
        check(1.μkg , μkg)
        check(microkilogram , μkg) 

   
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(powM12 * Kilogram(1.0), 1.nkg)
        check(powM12 * Kilogram(1.0), 1.nanokilogram)
        check(1.kg.nkg , kg.value/powM12)
        check(1.kg.nanokilogram , kg.value/powM12)
        check(1.nkg , nkg)
        check(nanokilogram , nkg) 

   
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(powM15 * Kilogram(1.0), 1.pkg)
        check(powM15 * Kilogram(1.0), 1.picokilogram)
        check(1.kg.pkg , kg.value/powM15)
        check(1.kg.picokilogram , kg.value/powM15)
        check(1.pkg , pkg)
        check(picokilogram , pkg) 

   
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(powM18 * Kilogram(1.0), 1.fkg)
        check(powM18 * Kilogram(1.0), 1.femtokilogram)
        check(1.kg.fkg , kg.value/powM18)
        check(1.kg.femtokilogram , kg.value/powM18)
        check(1.fkg , fkg)
        check(femtokilogram , fkg) 

   
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(powM21 * Kilogram(1.0), 1.akg)
        check(powM21 * Kilogram(1.0), 1.attokilogram)
        check(1.kg.akg , kg.value/powM21)
        check(1.kg.attokilogram , kg.value/powM21)
        check(1.akg , akg)
        check(attokilogram , akg) 

   
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(powM24 * Kilogram(1.0), 1.zkg)
        check(powM24 * Kilogram(1.0), 1.zeptokilogram)
        check(1.kg.zkg , kg.value/powM24)
        check(1.kg.zeptokilogram , kg.value/powM24)
        check(1.zkg , zkg)
        check(zeptokilogram , zkg) 

   
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(powM27 * Kilogram(1.0), 1.ykg)
        check(powM27 * Kilogram(1.0), 1.yoctokilogram)
        check(1.kg.ykg , kg.value/powM27)
        check(1.kg.yoctokilogram , kg.value/powM27)
        check(1.ykg , ykg)
        check(yoctokilogram , ykg) 

   
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(powM30 * Kilogram(1.0), 1.rkg)
        check(powM30 * Kilogram(1.0), 1.rontokilogram)
        check(1.kg.rkg , kg.value/powM30)
        check(1.kg.rontokilogram , kg.value/powM30)
        check(1.rkg , rkg)
        check(rontokilogram , rkg) 

   
        TestStatistics.numberTestedObjects++
        val powM33 = 10.0.pow(-33)
        check(powM33 * Kilogram(1.0), 1.qkg)
        check(powM33 * Kilogram(1.0), 1.quectokilogram)
        check(1.kg.qkg , kg.value/powM33)
        check(1.kg.quectokilogram , kg.value/powM33)
        check(1.qkg , qkg)
        check(quectokilogram , qkg) 
   }
}