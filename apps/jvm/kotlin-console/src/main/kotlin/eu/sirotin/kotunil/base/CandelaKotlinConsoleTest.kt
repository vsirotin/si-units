        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object CandelaKotlinConsoleTest {

    fun kotlinConsoleTest() {

        check(Candela(1.0), cd)
        check(1.cd , cd)

        //Serialization
        val v1 = Candela(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Candela(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        check(v1 , v2)
   
        val pow30 = 10.0.pow(30)
        check(pow30 * Candela(1.0), 1.Qcd)
        check(pow30 * Candela(1.0), 1.quettacandela)
        check(1.cd.Qcd , cd.value/pow30)
        check(1.cd.quettacandela , cd.value/pow30)
        check(1.Qcd , Qcd)
        check(quettacandela , Qcd) 

   
        val pow27 = 10.0.pow(27)
        check(pow27 * Candela(1.0), 1.Rcd)
        check(pow27 * Candela(1.0), 1.ronnacandela)
        check(1.cd.Rcd , cd.value/pow27)
        check(1.cd.ronnacandela , cd.value/pow27)
        check(1.Rcd , Rcd)
        check(ronnacandela , Rcd) 

   
        val pow24 = 10.0.pow(24)
        check(pow24 * Candela(1.0), 1.Ycd)
        check(pow24 * Candela(1.0), 1.yottacandela)
        check(1.cd.Ycd , cd.value/pow24)
        check(1.cd.yottacandela , cd.value/pow24)
        check(1.Ycd , Ycd)
        check(yottacandela , Ycd) 

   
        val pow21 = 10.0.pow(21)
        check(pow21 * Candela(1.0), 1.Zcd)
        check(pow21 * Candela(1.0), 1.zettacandela)
        check(1.cd.Zcd , cd.value/pow21)
        check(1.cd.zettacandela , cd.value/pow21)
        check(1.Zcd , Zcd)
        check(zettacandela , Zcd) 

   
        val pow18 = 10.0.pow(18)
        check(pow18 * Candela(1.0), 1.Ecd)
        check(pow18 * Candela(1.0), 1.exacandela)
        check(1.cd.Ecd , cd.value/pow18)
        check(1.cd.exacandela , cd.value/pow18)
        check(1.Ecd , Ecd)
        check(exacandela , Ecd) 

   
        val pow15 = 10.0.pow(15)
        check(pow15 * Candela(1.0), 1.Pcd)
        check(pow15 * Candela(1.0), 1.petacandela)
        check(1.cd.Pcd , cd.value/pow15)
        check(1.cd.petacandela , cd.value/pow15)
        check(1.Pcd , Pcd)
        check(petacandela , Pcd) 

   
        val pow12 = 10.0.pow(12)
        check(pow12 * Candela(1.0), 1.Tcd)
        check(pow12 * Candela(1.0), 1.teracandela)
        check(1.cd.Tcd , cd.value/pow12)
        check(1.cd.teracandela , cd.value/pow12)
        check(1.Tcd , Tcd)
        check(teracandela , Tcd) 

   
        val pow9 = 10.0.pow(9)
        check(pow9 * Candela(1.0), 1.Gcd)
        check(pow9 * Candela(1.0), 1.gigacandela)
        check(1.cd.Gcd , cd.value/pow9)
        check(1.cd.gigacandela , cd.value/pow9)
        check(1.Gcd , Gcd)
        check(gigacandela , Gcd) 

   
        val pow6 = 10.0.pow(6)
        check(pow6 * Candela(1.0), 1.Mcd)
        check(pow6 * Candela(1.0), 1.megacandela)
        check(1.cd.Mcd , cd.value/pow6)
        check(1.cd.megacandela , cd.value/pow6)
        check(1.Mcd , Mcd)
        check(megacandela , Mcd) 

   
        val pow3 = 10.0.pow(3)
        check(pow3 * Candela(1.0), 1.kcd)
        check(pow3 * Candela(1.0), 1.kilocandela)
        check(1.cd.kcd , cd.value/pow3)
        check(1.cd.kilocandela , cd.value/pow3)
        check(1.kcd , kcd)
        check(kilocandela , kcd) 

   
        val pow2 = 10.0.pow(2)
        check(pow2 * Candela(1.0), 1.hcd)
        check(pow2 * Candela(1.0), 1.hectocandela)
        check(1.cd.hcd , cd.value/pow2)
        check(1.cd.hectocandela , cd.value/pow2)
        check(1.hcd , hcd)
        check(hectocandela , hcd) 

   
        val pow1 = 10.0.pow(1)
        check(pow1 * Candela(1.0), 1.dacd)
        check(pow1 * Candela(1.0), 1.decacandela)
        check(1.cd.dacd , cd.value/pow1)
        check(1.cd.decacandela , cd.value/pow1)
        check(1.dacd , dacd)
        check(decacandela , dacd) 

   
        val powM1 = 10.0.pow(-1)
        check(powM1 * Candela(1.0), 1.dcd)
        check(powM1 * Candela(1.0), 1.decicandela)
        check(1.cd.dcd , cd.value/powM1)
        check(1.cd.decicandela , cd.value/powM1)
        check(1.dcd , dcd)
        check(decicandela , dcd) 

   
        val powM2 = 10.0.pow(-2)
        check(powM2 * Candela(1.0), 1.ccd)
        check(powM2 * Candela(1.0), 1.centicandela)
        check(1.cd.ccd , cd.value/powM2)
        check(1.cd.centicandela , cd.value/powM2)
        check(1.ccd , ccd)
        check(centicandela , ccd) 

   
        val powM3 = 10.0.pow(-3)
        check(powM3 * Candela(1.0), 1.mcd)
        check(powM3 * Candela(1.0), 1.millicandela)
        check(1.cd.mcd , cd.value/powM3)
        check(1.cd.millicandela , cd.value/powM3)
        check(1.mcd , mcd)
        check(millicandela , mcd) 

   
        val powM6 = 10.0.pow(-6)
        check(powM6 * Candela(1.0), 1.μcd)
        check(powM6 * Candela(1.0), 1.microcandela)
        check(1.cd.μcd , cd.value/powM6)
        check(1.cd.microcandela , cd.value/powM6)
        check(1.μcd , μcd)
        check(microcandela , μcd) 

   
        val powM9 = 10.0.pow(-9)
        check(powM9 * Candela(1.0), 1.ncd)
        check(powM9 * Candela(1.0), 1.nanocandela)
        check(1.cd.ncd , cd.value/powM9)
        check(1.cd.nanocandela , cd.value/powM9)
        check(1.ncd , ncd)
        check(nanocandela , ncd) 

   
        val powM12 = 10.0.pow(-12)
        check(powM12 * Candela(1.0), 1.pcd)
        check(powM12 * Candela(1.0), 1.picocandela)
        check(1.cd.pcd , cd.value/powM12)
        check(1.cd.picocandela , cd.value/powM12)
        check(1.pcd , pcd)
        check(picocandela , pcd) 

   
        val powM15 = 10.0.pow(-15)
        check(powM15 * Candela(1.0), 1.fcd)
        check(powM15 * Candela(1.0), 1.femtocandela)
        check(1.cd.fcd , cd.value/powM15)
        check(1.cd.femtocandela , cd.value/powM15)
        check(1.fcd , fcd)
        check(femtocandela , fcd) 

   
        val powM18 = 10.0.pow(-18)
        check(powM18 * Candela(1.0), 1.acd)
        check(powM18 * Candela(1.0), 1.attocandela)
        check(1.cd.acd , cd.value/powM18)
        check(1.cd.attocandela , cd.value/powM18)
        check(1.acd , acd)
        check(attocandela , acd) 

   
        val powM21 = 10.0.pow(-21)
        check(powM21 * Candela(1.0), 1.zcd)
        check(powM21 * Candela(1.0), 1.zeptocandela)
        check(1.cd.zcd , cd.value/powM21)
        check(1.cd.zeptocandela , cd.value/powM21)
        check(1.zcd , zcd)
        check(zeptocandela , zcd) 

   
        val powM24 = 10.0.pow(-24)
        check(powM24 * Candela(1.0), 1.ycd)
        check(powM24 * Candela(1.0), 1.yoctocandela)
        check(1.cd.ycd , cd.value/powM24)
        check(1.cd.yoctocandela , cd.value/powM24)
        check(1.ycd , ycd)
        check(yoctocandela , ycd) 

   
        val powM27 = 10.0.pow(-27)
        check(powM27 * Candela(1.0), 1.rcd)
        check(powM27 * Candela(1.0), 1.rontocandela)
        check(1.cd.rcd , cd.value/powM27)
        check(1.cd.rontocandela , cd.value/powM27)
        check(1.rcd , rcd)
        check(rontocandela , rcd) 

   
        val powM30 = 10.0.pow(-30)
        check(powM30 * Candela(1.0), 1.qcd)
        check(powM30 * Candela(1.0), 1.quectocandela)
        check(1.cd.qcd , cd.value/powM30)
        check(1.cd.quectocandela , cd.value/powM30)
        check(1.qcd , qcd)
        check(quectocandela , qcd) 
   }
}