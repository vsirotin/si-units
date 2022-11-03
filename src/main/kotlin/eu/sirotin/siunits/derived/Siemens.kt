
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    //Unit of electrical conductance
    val S = (kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2)

    val Number.S : Expression
        get() = this.toDouble() * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    
    val Number.YS : Expression
        @JvmName("getYS_prop")
        get() = this.toDouble() * 10.0.pow(24) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.yottasiemens : Expression
        get() = this.toDouble() * 10.0.pow(24) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val YS = 10.0.pow(24) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val yottasiemens = YS
    

    val Number.ZS : Expression
        @JvmName("getZS_prop")
        get() = this.toDouble() * 10.0.pow(21) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.zettasiemens : Expression
        get() = this.toDouble() * 10.0.pow(21) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val ZS = 10.0.pow(21) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val zettasiemens = ZS
    

    val Number.ES : Expression
        @JvmName("getES_prop")
        get() = this.toDouble() * 10.0.pow(18) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.exasiemens : Expression
        get() = this.toDouble() * 10.0.pow(18) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val ES = 10.0.pow(18) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val exasiemens = ES
    

    val Number.PS : Expression
        @JvmName("getPS_prop")
        get() = this.toDouble() * 10.0.pow(15) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.petasiemens : Expression
        get() = this.toDouble() * 10.0.pow(15) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val PS = 10.0.pow(15) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val petasiemens = PS
    

    val Number.TS : Expression
        @JvmName("getTS_prop")
        get() = this.toDouble() * 10.0.pow(12) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.terasiemens : Expression
        get() = this.toDouble() * 10.0.pow(12) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val TS = 10.0.pow(12) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val terasiemens = TS
    

    val Number.GS : Expression
        @JvmName("getGS_prop")
        get() = this.toDouble() * 10.0.pow(9) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.gigasiemens : Expression
        get() = this.toDouble() * 10.0.pow(9) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val GS = 10.0.pow(9) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val gigasiemens = GS
    

    val Number.MS : Expression
        @JvmName("getMS_prop")
        get() = this.toDouble() * 10.0.pow(6) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.megasiemens : Expression
        get() = this.toDouble() * 10.0.pow(6) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val MS = 10.0.pow(6) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val megasiemens = MS
    

    val Number.kS : Expression
        @JvmName("getkS_prop")
        get() = this.toDouble() * 10.0.pow(3) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.kilosiemens : Expression
        get() = this.toDouble() * 10.0.pow(3) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val kS = 10.0.pow(3) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val kilosiemens = kS
    

    val Number.hS : Expression
        @JvmName("gethS_prop")
        get() = this.toDouble() * 10.0.pow(2) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.hectosiemens : Expression
        get() = this.toDouble() * 10.0.pow(2) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val hS = 10.0.pow(2) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val hectosiemens = hS
    

    val Number.daS : Expression
        @JvmName("getdaS_prop")
        get() = this.toDouble() * 10.0.pow(1) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.decasiemens : Expression
        get() = this.toDouble() * 10.0.pow(1) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val daS = 10.0.pow(1) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val decasiemens = daS
    

    val Number.dS : Expression
        @JvmName("getdS_prop")
        get() = this.toDouble() * 10.0.pow(-1) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.decisiemens : Expression
        get() = this.toDouble() * 10.0.pow(-1) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val dS = 10.0.pow(-1) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val decisiemens = dS
    

    val Number.cS : Expression
        @JvmName("getcS_prop")
        get() = this.toDouble() * 10.0.pow(-2) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.centisiemens : Expression
        get() = this.toDouble() * 10.0.pow(-2) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val cS = 10.0.pow(-2) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val centisiemens = cS
    

    val Number.mS : Expression
        @JvmName("getmS_prop")
        get() = this.toDouble() * 10.0.pow(-3) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.millisiemens : Expression
        get() = this.toDouble() * 10.0.pow(-3) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val mS = 10.0.pow(-3) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val millisiemens = mS
    

    val Number.μS : Expression
        @JvmName("getμS_prop")
        get() = this.toDouble() * 10.0.pow(-6) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.microsiemens : Expression
        get() = this.toDouble() * 10.0.pow(-6) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val μS = 10.0.pow(-6) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val microsiemens = μS
    

    val Number.nS : Expression
        @JvmName("getnS_prop")
        get() = this.toDouble() * 10.0.pow(-9) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.nanosiemens : Expression
        get() = this.toDouble() * 10.0.pow(-9) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val nS = 10.0.pow(-9) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val nanosiemens = nS
    

    val Number.pS : Expression
        @JvmName("getpS_prop")
        get() = this.toDouble() * 10.0.pow(-12) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.picosiemens : Expression
        get() = this.toDouble() * 10.0.pow(-12) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val pS = 10.0.pow(-12) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val picosiemens = pS
    

    val Number.fS : Expression
        @JvmName("getfS_prop")
        get() = this.toDouble() * 10.0.pow(-15) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.femtosiemens : Expression
        get() = this.toDouble() * 10.0.pow(-15) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val fS = 10.0.pow(-15) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val femtosiemens = fS
    

    val Number.aS : Expression
        @JvmName("getaS_prop")
        get() = this.toDouble() * 10.0.pow(-18) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.attosiemens : Expression
        get() = this.toDouble() * 10.0.pow(-18) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val aS = 10.0.pow(-18) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val attosiemens = aS
    

    val Number.zS : Expression
        @JvmName("getzS_prop")
        get() = this.toDouble() * 10.0.pow(-21) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.zeptosiemens : Expression
        get() = this.toDouble() * 10.0.pow(-21) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val zS = 10.0.pow(-21) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val zeptosiemens = zS
    

    val Number.yS : Expression
        @JvmName("getyS_prop")
        get() = this.toDouble() * 10.0.pow(-24) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

    val Number.yoctosiemens : Expression
        get() = this.toDouble() * 10.0.pow(-24) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))


    @JvmField()         
    val yS = 10.0.pow(-24) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))
    val yoctosiemens = yS
    