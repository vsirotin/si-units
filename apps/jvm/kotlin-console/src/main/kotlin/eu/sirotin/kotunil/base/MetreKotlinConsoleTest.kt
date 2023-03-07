        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object MetreKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++

        check(Metre(1.0), m)
        check(1.m , m)

        //Serialization
        val v1 = Metre(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Metre(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        check(v1 , v2)
   
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(pow30 * Metre(1.0), 1.Qm)
        check(pow30 * Metre(1.0), 1.quettametre)
        check(1.m.Qm , m.value/pow30)
        check(1.m.quettametre , m.value/pow30)
        check(1.Qm , Qm)
        check(quettametre , Qm) 

   
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(pow27 * Metre(1.0), 1.Rm)
        check(pow27 * Metre(1.0), 1.ronnametre)
        check(1.m.Rm , m.value/pow27)
        check(1.m.ronnametre , m.value/pow27)
        check(1.Rm , Rm)
        check(ronnametre , Rm) 

   
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(pow24 * Metre(1.0), 1.Ym)
        check(pow24 * Metre(1.0), 1.yottametre)
        check(1.m.Ym , m.value/pow24)
        check(1.m.yottametre , m.value/pow24)
        check(1.Ym , Ym)
        check(yottametre , Ym) 

   
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(pow21 * Metre(1.0), 1.Zm)
        check(pow21 * Metre(1.0), 1.zettametre)
        check(1.m.Zm , m.value/pow21)
        check(1.m.zettametre , m.value/pow21)
        check(1.Zm , Zm)
        check(zettametre , Zm) 

   
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(pow18 * Metre(1.0), 1.Em)
        check(pow18 * Metre(1.0), 1.exametre)
        check(1.m.Em , m.value/pow18)
        check(1.m.exametre , m.value/pow18)
        check(1.Em , Em)
        check(exametre , Em) 

   
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(pow15 * Metre(1.0), 1.Pm)
        check(pow15 * Metre(1.0), 1.petametre)
        check(1.m.Pm , m.value/pow15)
        check(1.m.petametre , m.value/pow15)
        check(1.Pm , Pm)
        check(petametre , Pm) 

   
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(pow12 * Metre(1.0), 1.Tm)
        check(pow12 * Metre(1.0), 1.terametre)
        check(1.m.Tm , m.value/pow12)
        check(1.m.terametre , m.value/pow12)
        check(1.Tm , Tm)
        check(terametre , Tm) 

   
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(pow9 * Metre(1.0), 1.Gm)
        check(pow9 * Metre(1.0), 1.gigametre)
        check(1.m.Gm , m.value/pow9)
        check(1.m.gigametre , m.value/pow9)
        check(1.Gm , Gm)
        check(gigametre , Gm) 

   
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(pow6 * Metre(1.0), 1.Mm)
        check(pow6 * Metre(1.0), 1.megametre)
        check(1.m.Mm , m.value/pow6)
        check(1.m.megametre , m.value/pow6)
        check(1.Mm , Mm)
        check(megametre , Mm) 

   
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(pow3 * Metre(1.0), 1.km)
        check(pow3 * Metre(1.0), 1.kilometre)
        check(1.m.km , m.value/pow3)
        check(1.m.kilometre , m.value/pow3)
        check(1.km , km)
        check(kilometre , km) 

   
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(pow2 * Metre(1.0), 1.hm)
        check(pow2 * Metre(1.0), 1.hectometre)
        check(1.m.hm , m.value/pow2)
        check(1.m.hectometre , m.value/pow2)
        check(1.hm , hm)
        check(hectometre , hm) 

   
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(pow1 * Metre(1.0), 1.dam)
        check(pow1 * Metre(1.0), 1.decametre)
        check(1.m.dam , m.value/pow1)
        check(1.m.decametre , m.value/pow1)
        check(1.dam , dam)
        check(decametre , dam) 

   
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(powM1 * Metre(1.0), 1.dm)
        check(powM1 * Metre(1.0), 1.decimetre)
        check(1.m.dm , m.value/powM1)
        check(1.m.decimetre , m.value/powM1)
        check(1.dm , dm)
        check(decimetre , dm) 

   
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(powM2 * Metre(1.0), 1.cm)
        check(powM2 * Metre(1.0), 1.centimetre)
        check(1.m.cm , m.value/powM2)
        check(1.m.centimetre , m.value/powM2)
        check(1.cm , cm)
        check(centimetre , cm) 

   
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(powM3 * Metre(1.0), 1.mm)
        check(powM3 * Metre(1.0), 1.millimetre)
        check(1.m.mm , m.value/powM3)
        check(1.m.millimetre , m.value/powM3)
        check(1.mm , mm)
        check(millimetre , mm) 

   
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(powM6 * Metre(1.0), 1.μm)
        check(powM6 * Metre(1.0), 1.micrometre)
        check(1.m.μm , m.value/powM6)
        check(1.m.micrometre , m.value/powM6)
        check(1.μm , μm)
        check(micrometre , μm) 

   
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(powM9 * Metre(1.0), 1.nm)
        check(powM9 * Metre(1.0), 1.nanometre)
        check(1.m.nm , m.value/powM9)
        check(1.m.nanometre , m.value/powM9)
        check(1.nm , nm)
        check(nanometre , nm) 

   
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(powM12 * Metre(1.0), 1.pm)
        check(powM12 * Metre(1.0), 1.picometre)
        check(1.m.pm , m.value/powM12)
        check(1.m.picometre , m.value/powM12)
        check(1.pm , pm)
        check(picometre , pm) 

   
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(powM15 * Metre(1.0), 1.fm)
        check(powM15 * Metre(1.0), 1.femtometre)
        check(1.m.fm , m.value/powM15)
        check(1.m.femtometre , m.value/powM15)
        check(1.fm , fm)
        check(femtometre , fm) 

   
        TestStatistics.numberTestedObjects++
        val powM18 = 10.0.pow(-18)
        check(powM18 * Metre(1.0), 1.am)
        check(powM18 * Metre(1.0), 1.attometre)
        check(1.m.am , m.value/powM18)
        check(1.m.attometre , m.value/powM18)
        check(1.am , am)
        check(attometre , am) 

   
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(powM21 * Metre(1.0), 1.zm)
        check(powM21 * Metre(1.0), 1.zeptometre)
        check(1.m.zm , m.value/powM21)
        check(1.m.zeptometre , m.value/powM21)
        check(1.zm , zm)
        check(zeptometre , zm) 

   
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(powM24 * Metre(1.0), 1.ym)
        check(powM24 * Metre(1.0), 1.yoctometre)
        check(1.m.ym , m.value/powM24)
        check(1.m.yoctometre , m.value/powM24)
        check(1.ym , ym)
        check(yoctometre , ym) 

   
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(powM27 * Metre(1.0), 1.rm)
        check(powM27 * Metre(1.0), 1.rontometre)
        check(1.m.rm , m.value/powM27)
        check(1.m.rontometre , m.value/powM27)
        check(1.rm , rm)
        check(rontometre , rm) 

   
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(powM30 * Metre(1.0), 1.qm)
        check(powM30 * Metre(1.0), 1.quectometre)
        check(1.m.qm , m.value/powM30)
        check(1.m.quectometre , m.value/powM30)
        check(1.qm , qm)
        check(quectometre , qm) 
   }
}