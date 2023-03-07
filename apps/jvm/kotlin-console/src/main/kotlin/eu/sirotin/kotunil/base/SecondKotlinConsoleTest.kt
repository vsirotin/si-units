        
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.app.kotlin.TestStatistics
import eu.sirotin.kotunil.app.kotlin.check
import eu.sirotin.kotunil.core.*
import kotlin.math.pow

object SecondKotlinConsoleTest {

    fun kotlinConsoleTest() {
        TestStatistics.numberTestedObjects++

        check(Second(1.0), s)
        check(1.s , s)

        //Serialization
        val v1 = Second(1.12)
        val sd = v1.value.toString()
        val dv = sd.toDouble()

        //De-Serialization
        val creator = Second(1.0).dimensions.factors.first().specification.creator
        val v2 = creator(dv)
        check(v1 , v2)
   
        TestStatistics.numberTestedObjects++
        val pow30 = 10.0.pow(30)
        check(pow30 * Second(1.0), 1.Qs)
        check(pow30 * Second(1.0), 1.quettasecond)
        check(1.s.Qs , s.value/pow30)
        check(1.s.quettasecond , s.value/pow30)
        check(1.Qs , Qs)
        check(quettasecond , Qs) 

   
        TestStatistics.numberTestedObjects++
        val pow27 = 10.0.pow(27)
        check(pow27 * Second(1.0), 1.Rs)
        check(pow27 * Second(1.0), 1.ronnasecond)
        check(1.s.Rs , s.value/pow27)
        check(1.s.ronnasecond , s.value/pow27)
        check(1.Rs , Rs)
        check(ronnasecond , Rs) 

   
        TestStatistics.numberTestedObjects++
        val pow24 = 10.0.pow(24)
        check(pow24 * Second(1.0), 1.Ys)
        check(pow24 * Second(1.0), 1.yottasecond)
        check(1.s.Ys , s.value/pow24)
        check(1.s.yottasecond , s.value/pow24)
        check(1.Ys , Ys)
        check(yottasecond , Ys) 

   
        TestStatistics.numberTestedObjects++
        val pow21 = 10.0.pow(21)
        check(pow21 * Second(1.0), 1.Zs)
        check(pow21 * Second(1.0), 1.zettasecond)
        check(1.s.Zs , s.value/pow21)
        check(1.s.zettasecond , s.value/pow21)
        check(1.Zs , Zs)
        check(zettasecond , Zs) 

   
        TestStatistics.numberTestedObjects++
        val pow18 = 10.0.pow(18)
        check(pow18 * Second(1.0), 1.Es)
        check(pow18 * Second(1.0), 1.exasecond)
        check(1.s.Es , s.value/pow18)
        check(1.s.exasecond , s.value/pow18)
        check(1.Es , Es)
        check(exasecond , Es) 

   
        TestStatistics.numberTestedObjects++
        val pow15 = 10.0.pow(15)
        check(pow15 * Second(1.0), 1.Ps)
        check(pow15 * Second(1.0), 1.petasecond)
        check(1.s.Ps , s.value/pow15)
        check(1.s.petasecond , s.value/pow15)
        check(1.Ps , Ps)
        check(petasecond , Ps) 

   
        TestStatistics.numberTestedObjects++
        val pow12 = 10.0.pow(12)
        check(pow12 * Second(1.0), 1.Ts)
        check(pow12 * Second(1.0), 1.terasecond)
        check(1.s.Ts , s.value/pow12)
        check(1.s.terasecond , s.value/pow12)
        check(1.Ts , Ts)
        check(terasecond , Ts) 

   
        TestStatistics.numberTestedObjects++
        val pow9 = 10.0.pow(9)
        check(pow9 * Second(1.0), 1.Gs)
        check(pow9 * Second(1.0), 1.gigasecond)
        check(1.s.Gs , s.value/pow9)
        check(1.s.gigasecond , s.value/pow9)
        check(1.Gs , Gs)
        check(gigasecond , Gs) 

   
        TestStatistics.numberTestedObjects++
        val pow6 = 10.0.pow(6)
        check(pow6 * Second(1.0), 1.Ms)
        check(pow6 * Second(1.0), 1.megasecond)
        check(1.s.Ms , s.value/pow6)
        check(1.s.megasecond , s.value/pow6)
        check(1.Ms , Ms)
        check(megasecond , Ms) 

   
        TestStatistics.numberTestedObjects++
        val pow3 = 10.0.pow(3)
        check(pow3 * Second(1.0), 1.ks)
        check(pow3 * Second(1.0), 1.kilosecond)
        check(1.s.ks , s.value/pow3)
        check(1.s.kilosecond , s.value/pow3)
        check(1.ks , ks)
        check(kilosecond , ks) 

   
        TestStatistics.numberTestedObjects++
        val pow2 = 10.0.pow(2)
        check(pow2 * Second(1.0), 1.hs)
        check(pow2 * Second(1.0), 1.hectosecond)
        check(1.s.hs , s.value/pow2)
        check(1.s.hectosecond , s.value/pow2)
        check(1.hs , hs)
        check(hectosecond , hs) 

   
        TestStatistics.numberTestedObjects++
        val pow1 = 10.0.pow(1)
        check(pow1 * Second(1.0), 1.das)
        check(pow1 * Second(1.0), 1.decasecond)
        check(1.s.das , s.value/pow1)
        check(1.s.decasecond , s.value/pow1)
        check(1.das , das)
        check(decasecond , das) 

   
        TestStatistics.numberTestedObjects++
        val powM1 = 10.0.pow(-1)
        check(powM1 * Second(1.0), 1.ds)
        check(powM1 * Second(1.0), 1.decisecond)
        check(1.s.ds , s.value/powM1)
        check(1.s.decisecond , s.value/powM1)
        check(1.ds , ds)
        check(decisecond , ds) 

   
        TestStatistics.numberTestedObjects++
        val powM2 = 10.0.pow(-2)
        check(powM2 * Second(1.0), 1.cs)
        check(powM2 * Second(1.0), 1.centisecond)
        check(1.s.cs , s.value/powM2)
        check(1.s.centisecond , s.value/powM2)
        check(1.cs , cs)
        check(centisecond , cs) 

   
        TestStatistics.numberTestedObjects++
        val powM3 = 10.0.pow(-3)
        check(powM3 * Second(1.0), 1.ms)
        check(powM3 * Second(1.0), 1.millisecond)
        check(1.s.ms , s.value/powM3)
        check(1.s.millisecond , s.value/powM3)
        check(1.ms , ms)
        check(millisecond , ms) 

   
        TestStatistics.numberTestedObjects++
        val powM6 = 10.0.pow(-6)
        check(powM6 * Second(1.0), 1.μs)
        check(powM6 * Second(1.0), 1.microsecond)
        check(1.s.μs , s.value/powM6)
        check(1.s.microsecond , s.value/powM6)
        check(1.μs , μs)
        check(microsecond , μs) 

   
        TestStatistics.numberTestedObjects++
        val powM9 = 10.0.pow(-9)
        check(powM9 * Second(1.0), 1.ns)
        check(powM9 * Second(1.0), 1.nanosecond)
        check(1.s.ns , s.value/powM9)
        check(1.s.nanosecond , s.value/powM9)
        check(1.ns , ns)
        check(nanosecond , ns) 

   
        TestStatistics.numberTestedObjects++
        val powM12 = 10.0.pow(-12)
        check(powM12 * Second(1.0), 1.ps)
        check(powM12 * Second(1.0), 1.picosecond)
        check(1.s.ps , s.value/powM12)
        check(1.s.picosecond , s.value/powM12)
        check(1.ps , ps)
        check(picosecond , ps) 

   
        TestStatistics.numberTestedObjects++
        val powM15 = 10.0.pow(-15)
        check(powM15 * Second(1.0), 1.fs)
        check(powM15 * Second(1.0), 1.femtosecond)
        check(1.s.fs , s.value/powM15)
        check(1.s.femtosecond , s.value/powM15)
        check(1.fs , fs)
        check(femtosecond , fs) 


   
        TestStatistics.numberTestedObjects++
        val powM21 = 10.0.pow(-21)
        check(powM21 * Second(1.0), 1.zs)
        check(powM21 * Second(1.0), 1.zeptosecond)
        check(1.s.zs , s.value/powM21)
        check(1.s.zeptosecond , s.value/powM21)
        check(1.zs , zs)
        check(zeptosecond , zs) 

   
        TestStatistics.numberTestedObjects++
        val powM24 = 10.0.pow(-24)
        check(powM24 * Second(1.0), 1.ys)
        check(powM24 * Second(1.0), 1.yoctosecond)
        check(1.s.ys , s.value/powM24)
        check(1.s.yoctosecond , s.value/powM24)
        check(1.ys , ys)
        check(yoctosecond , ys) 

   
        TestStatistics.numberTestedObjects++
        val powM27 = 10.0.pow(-27)
        check(powM27 * Second(1.0), 1.rs)
        check(powM27 * Second(1.0), 1.rontosecond)
        check(1.s.rs , s.value/powM27)
        check(1.s.rontosecond , s.value/powM27)
        check(1.rs , rs)
        check(rontosecond , rs) 

   
        TestStatistics.numberTestedObjects++
        val powM30 = 10.0.pow(-30)
        check(powM30 * Second(1.0), 1.qs)
        check(powM30 * Second(1.0), 1.quectosecond)
        check(1.s.qs , s.value/powM30)
        check(1.s.quectosecond , s.value/powM30)
        check(1.qs , qs)
        check(quectosecond , qs) 
   }
}