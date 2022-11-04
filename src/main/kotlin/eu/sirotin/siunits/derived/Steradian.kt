
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val sr = m2/m2

    val Number.sr : Expression
        get() = this.toDouble() * (m2/m2)

    
    val Number.Ysr : Expression
        @JvmName("getYsr_prop")
        get() = this.toDouble() * 10.0.pow(24) * (m2/m2)

    val Number.yottasteradian : Expression
        get() = this.toDouble() * 10.0.pow(24) * (m2/m2)


    @JvmField()         
    val Ysr = 10.0.pow(24) * (m2/m2)
    val yottasteradian = Ysr
    

    val Number.Zsr : Expression
        @JvmName("getZsr_prop")
        get() = this.toDouble() * 10.0.pow(21) * (m2/m2)

    val Number.zettasteradian : Expression
        get() = this.toDouble() * 10.0.pow(21) * (m2/m2)


    @JvmField()         
    val Zsr = 10.0.pow(21) * (m2/m2)
    val zettasteradian = Zsr
    

    val Number.Esr : Expression
        @JvmName("getEsr_prop")
        get() = this.toDouble() * 10.0.pow(18) * (m2/m2)

    val Number.exasteradian : Expression
        get() = this.toDouble() * 10.0.pow(18) * (m2/m2)


    @JvmField()         
    val Esr = 10.0.pow(18) * (m2/m2)
    val exasteradian = Esr
    

    val Number.Psr : Expression
        @JvmName("getPsr_prop")
        get() = this.toDouble() * 10.0.pow(15) * (m2/m2)

    val Number.petasteradian : Expression
        get() = this.toDouble() * 10.0.pow(15) * (m2/m2)


    @JvmField()         
    val Psr = 10.0.pow(15) * (m2/m2)
    val petasteradian = Psr
    

    val Number.Tsr : Expression
        @JvmName("getTsr_prop")
        get() = this.toDouble() * 10.0.pow(12) * (m2/m2)

    val Number.terasteradian : Expression
        get() = this.toDouble() * 10.0.pow(12) * (m2/m2)


    @JvmField()         
    val Tsr = 10.0.pow(12) * (m2/m2)
    val terasteradian = Tsr
    

    val Number.Gsr : Expression
        @JvmName("getGsr_prop")
        get() = this.toDouble() * 10.0.pow(9) * (m2/m2)

    val Number.gigasteradian : Expression
        get() = this.toDouble() * 10.0.pow(9) * (m2/m2)


    @JvmField()         
    val Gsr = 10.0.pow(9) * (m2/m2)
    val gigasteradian = Gsr
    

    val Number.Msr : Expression
        @JvmName("getMsr_prop")
        get() = this.toDouble() * 10.0.pow(6) * (m2/m2)

    val Number.megasteradian : Expression
        get() = this.toDouble() * 10.0.pow(6) * (m2/m2)


    @JvmField()         
    val Msr = 10.0.pow(6) * (m2/m2)
    val megasteradian = Msr
    

    val Number.ksr : Expression
        @JvmName("getksr_prop")
        get() = this.toDouble() * 10.0.pow(3) * (m2/m2)

    val Number.kilosteradian : Expression
        get() = this.toDouble() * 10.0.pow(3) * (m2/m2)


    @JvmField()         
    val ksr = 10.0.pow(3) * (m2/m2)
    val kilosteradian = ksr
    

    val Number.hsr : Expression
        @JvmName("gethsr_prop")
        get() = this.toDouble() * 10.0.pow(2) * (m2/m2)

    val Number.hectosteradian : Expression
        get() = this.toDouble() * 10.0.pow(2) * (m2/m2)


    @JvmField()         
    val hsr = 10.0.pow(2) * (m2/m2)
    val hectosteradian = hsr
    

    val Number.dasr : Expression
        @JvmName("getdasr_prop")
        get() = this.toDouble() * 10.0.pow(1) * (m2/m2)

    val Number.decasteradian : Expression
        get() = this.toDouble() * 10.0.pow(1) * (m2/m2)


    @JvmField()         
    val dasr = 10.0.pow(1) * (m2/m2)
    val decasteradian = dasr
    

    val Number.dsr : Expression
        @JvmName("getdsr_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (m2/m2)

    val Number.decisteradian : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (m2/m2)


    @JvmField()         
    val dsr = 10.0.pow(-1) * (m2/m2)
    val decisteradian = dsr
    

    val Number.csr : Expression
        @JvmName("getcsr_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (m2/m2)

    val Number.centisteradian : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (m2/m2)


    @JvmField()         
    val csr = 10.0.pow(-2) * (m2/m2)
    val centisteradian = csr
    

    val Number.msr : Expression
        @JvmName("getmsr_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (m2/m2)

    val Number.millisteradian : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (m2/m2)


    @JvmField()         
    val msr = 10.0.pow(-3) * (m2/m2)
    val millisteradian = msr
    

    val Number.μsr : Expression
        @JvmName("getμsr_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (m2/m2)

    val Number.microsteradian : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (m2/m2)


    @JvmField()         
    val μsr = 10.0.pow(-6) * (m2/m2)
    val microsteradian = μsr
    

    val Number.nsr : Expression
        @JvmName("getnsr_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (m2/m2)

    val Number.nanosteradian : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (m2/m2)


    @JvmField()         
    val nsr = 10.0.pow(-9) * (m2/m2)
    val nanosteradian = nsr
    

    val Number.psr : Expression
        @JvmName("getpsr_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (m2/m2)

    val Number.picosteradian : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (m2/m2)


    @JvmField()         
    val psr = 10.0.pow(-12) * (m2/m2)
    val picosteradian = psr
    

    val Number.fsr : Expression
        @JvmName("getfsr_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (m2/m2)

    val Number.femtosteradian : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (m2/m2)


    @JvmField()         
    val fsr = 10.0.pow(-15) * (m2/m2)
    val femtosteradian = fsr
    

    val Number.asr : Expression
        @JvmName("getasr_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (m2/m2)

    val Number.attosteradian : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (m2/m2)


    @JvmField()         
    val asr = 10.0.pow(-18) * (m2/m2)
    val attosteradian = asr
    

    val Number.zsr : Expression
        @JvmName("getzsr_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (m2/m2)

    val Number.zeptosteradian : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (m2/m2)


    @JvmField()         
    val zsr = 10.0.pow(-21) * (m2/m2)
    val zeptosteradian = zsr
    

    val Number.ysr : Expression
        @JvmName("getysr_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (m2/m2)

    val Number.yoctosteradian : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (m2/m2)


    @JvmField()         
    val ysr = 10.0.pow(-24) * (m2/m2)
    val yoctosteradian = ysr
    