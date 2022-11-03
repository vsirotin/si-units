
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    val Sv = (m2)*(s `^` -2)

    val Number.Sv : Expression
        get() = this.toDouble() * ((m2)*(s `^` -2))

    
    val Number.YSv : Expression
        @JvmName("getYSv_prop")
        get() = this.toDouble() * 10.0.pow(24) * ((m2)*(s `^` -2))

    val Number.yottasievert : Expression
        get() = this.toDouble() * 10.0.pow(24) * ((m2)*(s `^` -2))


    @JvmField()         
    val YSv = 10.0.pow(24) * ((m2)*(s `^` -2))
    val yottasievert = YSv
    

    val Number.ZSv : Expression
        @JvmName("getZSv_prop")
        get() = this.toDouble() * 10.0.pow(21) * ((m2)*(s `^` -2))

    val Number.zettasievert : Expression
        get() = this.toDouble() * 10.0.pow(21) * ((m2)*(s `^` -2))


    @JvmField()         
    val ZSv = 10.0.pow(21) * ((m2)*(s `^` -2))
    val zettasievert = ZSv
    

    val Number.ESv : Expression
        @JvmName("getESv_prop")
        get() = this.toDouble() * 10.0.pow(18) * ((m2)*(s `^` -2))

    val Number.exasievert : Expression
        get() = this.toDouble() * 10.0.pow(18) * ((m2)*(s `^` -2))


    @JvmField()         
    val ESv = 10.0.pow(18) * ((m2)*(s `^` -2))
    val exasievert = ESv
    

    val Number.PSv : Expression
        @JvmName("getPSv_prop")
        get() = this.toDouble() * 10.0.pow(15) * ((m2)*(s `^` -2))

    val Number.petasievert : Expression
        get() = this.toDouble() * 10.0.pow(15) * ((m2)*(s `^` -2))


    @JvmField()         
    val PSv = 10.0.pow(15) * ((m2)*(s `^` -2))
    val petasievert = PSv
    

    val Number.TSv : Expression
        @JvmName("getTSv_prop")
        get() = this.toDouble() * 10.0.pow(12) * ((m2)*(s `^` -2))

    val Number.terasievert : Expression
        get() = this.toDouble() * 10.0.pow(12) * ((m2)*(s `^` -2))


    @JvmField()         
    val TSv = 10.0.pow(12) * ((m2)*(s `^` -2))
    val terasievert = TSv
    

    val Number.GSv : Expression
        @JvmName("getGSv_prop")
        get() = this.toDouble() * 10.0.pow(9) * ((m2)*(s `^` -2))

    val Number.gigasievert : Expression
        get() = this.toDouble() * 10.0.pow(9) * ((m2)*(s `^` -2))


    @JvmField()         
    val GSv = 10.0.pow(9) * ((m2)*(s `^` -2))
    val gigasievert = GSv
    

    val Number.MSv : Expression
        @JvmName("getMSv_prop")
        get() = this.toDouble() * 10.0.pow(6) * ((m2)*(s `^` -2))

    val Number.megasievert : Expression
        get() = this.toDouble() * 10.0.pow(6) * ((m2)*(s `^` -2))


    @JvmField()         
    val MSv = 10.0.pow(6) * ((m2)*(s `^` -2))
    val megasievert = MSv
    

    val Number.kSv : Expression
        @JvmName("getkSv_prop")
        get() = this.toDouble() * 10.0.pow(3) * ((m2)*(s `^` -2))

    val Number.kilosievert : Expression
        get() = this.toDouble() * 10.0.pow(3) * ((m2)*(s `^` -2))


    @JvmField()         
    val kSv = 10.0.pow(3) * ((m2)*(s `^` -2))
    val kilosievert = kSv
    

    val Number.hSv : Expression
        @JvmName("gethSv_prop")
        get() = this.toDouble() * 10.0.pow(2) * ((m2)*(s `^` -2))

    val Number.hectosievert : Expression
        get() = this.toDouble() * 10.0.pow(2) * ((m2)*(s `^` -2))


    @JvmField()         
    val hSv = 10.0.pow(2) * ((m2)*(s `^` -2))
    val hectosievert = hSv
    

    val Number.daSv : Expression
        @JvmName("getdaSv_prop")
        get() = this.toDouble() * 10.0.pow(1) * ((m2)*(s `^` -2))

    val Number.decasievert : Expression
        get() = this.toDouble() * 10.0.pow(1) * ((m2)*(s `^` -2))


    @JvmField()         
    val daSv = 10.0.pow(1) * ((m2)*(s `^` -2))
    val decasievert = daSv
    

    val Number.dSv : Expression
        @JvmName("getdSv_prop")
        get() = this.toDouble() * 10.0.pow(-1) * ((m2)*(s `^` -2))

    val Number.decisievert : Expression
        get() = this.toDouble() * 10.0.pow(-1) * ((m2)*(s `^` -2))


    @JvmField()         
    val dSv = 10.0.pow(-1) * ((m2)*(s `^` -2))
    val decisievert = dSv
    

    val Number.cSv : Expression
        @JvmName("getcSv_prop")
        get() = this.toDouble() * 10.0.pow(-2) * ((m2)*(s `^` -2))

    val Number.centisievert : Expression
        get() = this.toDouble() * 10.0.pow(-2) * ((m2)*(s `^` -2))


    @JvmField()         
    val cSv = 10.0.pow(-2) * ((m2)*(s `^` -2))
    val centisievert = cSv
    

    val Number.mSv : Expression
        @JvmName("getmSv_prop")
        get() = this.toDouble() * 10.0.pow(-3) * ((m2)*(s `^` -2))

    val Number.millisievert : Expression
        get() = this.toDouble() * 10.0.pow(-3) * ((m2)*(s `^` -2))


    @JvmField()         
    val mSv = 10.0.pow(-3) * ((m2)*(s `^` -2))
    val millisievert = mSv
    

    val Number.μSv : Expression
        @JvmName("getμSv_prop")
        get() = this.toDouble() * 10.0.pow(-6) * ((m2)*(s `^` -2))

    val Number.microsievert : Expression
        get() = this.toDouble() * 10.0.pow(-6) * ((m2)*(s `^` -2))


    @JvmField()         
    val μSv = 10.0.pow(-6) * ((m2)*(s `^` -2))
    val microsievert = μSv
    

    val Number.nSv : Expression
        @JvmName("getnSv_prop")
        get() = this.toDouble() * 10.0.pow(-9) * ((m2)*(s `^` -2))

    val Number.nanosievert : Expression
        get() = this.toDouble() * 10.0.pow(-9) * ((m2)*(s `^` -2))


    @JvmField()         
    val nSv = 10.0.pow(-9) * ((m2)*(s `^` -2))
    val nanosievert = nSv
    

    val Number.pSv : Expression
        @JvmName("getpSv_prop")
        get() = this.toDouble() * 10.0.pow(-12) * ((m2)*(s `^` -2))

    val Number.picosievert : Expression
        get() = this.toDouble() * 10.0.pow(-12) * ((m2)*(s `^` -2))


    @JvmField()         
    val pSv = 10.0.pow(-12) * ((m2)*(s `^` -2))
    val picosievert = pSv
    

    val Number.fSv : Expression
        @JvmName("getfSv_prop")
        get() = this.toDouble() * 10.0.pow(-15) * ((m2)*(s `^` -2))

    val Number.femtosievert : Expression
        get() = this.toDouble() * 10.0.pow(-15) * ((m2)*(s `^` -2))


    @JvmField()         
    val fSv = 10.0.pow(-15) * ((m2)*(s `^` -2))
    val femtosievert = fSv
    

    val Number.aSv : Expression
        @JvmName("getaSv_prop")
        get() = this.toDouble() * 10.0.pow(-18) * ((m2)*(s `^` -2))

    val Number.attosievert : Expression
        get() = this.toDouble() * 10.0.pow(-18) * ((m2)*(s `^` -2))


    @JvmField()         
    val aSv = 10.0.pow(-18) * ((m2)*(s `^` -2))
    val attosievert = aSv
    

    val Number.zSv : Expression
        @JvmName("getzSv_prop")
        get() = this.toDouble() * 10.0.pow(-21) * ((m2)*(s `^` -2))

    val Number.zeptosievert : Expression
        get() = this.toDouble() * 10.0.pow(-21) * ((m2)*(s `^` -2))


    @JvmField()         
    val zSv = 10.0.pow(-21) * ((m2)*(s `^` -2))
    val zeptosievert = zSv
    

    val Number.ySv : Expression
        @JvmName("getySv_prop")
        get() = this.toDouble() * 10.0.pow(-24) * ((m2)*(s `^` -2))

    val Number.yoctosievert : Expression
        get() = this.toDouble() * 10.0.pow(-24) * ((m2)*(s `^` -2))


    @JvmField()         
    val ySv = 10.0.pow(-24) * ((m2)*(s `^` -2))
    val yoctosievert = ySv
    