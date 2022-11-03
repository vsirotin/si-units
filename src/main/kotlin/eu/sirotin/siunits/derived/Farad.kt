
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    val F = (kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2)

    val Number.F : Expression
        get() = this.toDouble() * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    
    val Number.YF : Expression
        @JvmName("getYF_prop")
        get() = this.toDouble() * 10.0.pow(24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.yottafarad : Expression
        get() = this.toDouble() * 10.0.pow(24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val YF = 10.0.pow(24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val yottafarad = YF
    

    val Number.ZF : Expression
        @JvmName("getZF_prop")
        get() = this.toDouble() * 10.0.pow(21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.zettafarad : Expression
        get() = this.toDouble() * 10.0.pow(21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val ZF = 10.0.pow(21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val zettafarad = ZF
    

    val Number.EF : Expression
        @JvmName("getEF_prop")
        get() = this.toDouble() * 10.0.pow(18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.exafarad : Expression
        get() = this.toDouble() * 10.0.pow(18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val EF = 10.0.pow(18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val exafarad = EF
    

    val Number.PF : Expression
        @JvmName("getPF_prop")
        get() = this.toDouble() * 10.0.pow(15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.petafarad : Expression
        get() = this.toDouble() * 10.0.pow(15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val PF = 10.0.pow(15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val petafarad = PF
    

    val Number.TF : Expression
        @JvmName("getTF_prop")
        get() = this.toDouble() * 10.0.pow(12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.terafarad : Expression
        get() = this.toDouble() * 10.0.pow(12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val TF = 10.0.pow(12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val terafarad = TF
    

    val Number.GF : Expression
        @JvmName("getGF_prop")
        get() = this.toDouble() * 10.0.pow(9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.gigafarad : Expression
        get() = this.toDouble() * 10.0.pow(9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val GF = 10.0.pow(9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val gigafarad = GF
    

    val Number.MF : Expression
        @JvmName("getMF_prop")
        get() = this.toDouble() * 10.0.pow(6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.megafarad : Expression
        get() = this.toDouble() * 10.0.pow(6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val MF = 10.0.pow(6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val megafarad = MF
    

    val Number.kF : Expression
        @JvmName("getkF_prop")
        get() = this.toDouble() * 10.0.pow(3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.kilofarad : Expression
        get() = this.toDouble() * 10.0.pow(3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val kF = 10.0.pow(3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val kilofarad = kF
    

    val Number.hF : Expression
        @JvmName("gethF_prop")
        get() = this.toDouble() * 10.0.pow(2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.hectofarad : Expression
        get() = this.toDouble() * 10.0.pow(2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val hF = 10.0.pow(2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val hectofarad = hF
    

    val Number.daF : Expression
        @JvmName("getdaF_prop")
        get() = this.toDouble() * 10.0.pow(1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.decafarad : Expression
        get() = this.toDouble() * 10.0.pow(1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val daF = 10.0.pow(1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val decafarad = daF
    

    val Number.dF : Expression
        @JvmName("getdF_prop")
        get() = this.toDouble() * 10.0.pow(-1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.decifarad : Expression
        get() = this.toDouble() * 10.0.pow(-1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val dF = 10.0.pow(-1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val decifarad = dF
    

    val Number.cF : Expression
        @JvmName("getcF_prop")
        get() = this.toDouble() * 10.0.pow(-2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.centifarad : Expression
        get() = this.toDouble() * 10.0.pow(-2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val cF = 10.0.pow(-2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val centifarad = cF
    

    val Number.mF : Expression
        @JvmName("getmF_prop")
        get() = this.toDouble() * 10.0.pow(-3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.millifarad : Expression
        get() = this.toDouble() * 10.0.pow(-3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val mF = 10.0.pow(-3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val millifarad = mF
    

    val Number.μF : Expression
        @JvmName("getμF_prop")
        get() = this.toDouble() * 10.0.pow(-6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.microfarad : Expression
        get() = this.toDouble() * 10.0.pow(-6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val μF = 10.0.pow(-6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val microfarad = μF
    

    val Number.nF : Expression
        @JvmName("getnF_prop")
        get() = this.toDouble() * 10.0.pow(-9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.nanofarad : Expression
        get() = this.toDouble() * 10.0.pow(-9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val nF = 10.0.pow(-9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val nanofarad = nF
    

    val Number.pF : Expression
        @JvmName("getpF_prop")
        get() = this.toDouble() * 10.0.pow(-12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.picofarad : Expression
        get() = this.toDouble() * 10.0.pow(-12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val pF = 10.0.pow(-12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val picofarad = pF
    

    val Number.fF : Expression
        @JvmName("getfF_prop")
        get() = this.toDouble() * 10.0.pow(-15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.femtofarad : Expression
        get() = this.toDouble() * 10.0.pow(-15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val fF = 10.0.pow(-15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val femtofarad = fF
    

    val Number.aF : Expression
        @JvmName("getaF_prop")
        get() = this.toDouble() * 10.0.pow(-18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.attofarad : Expression
        get() = this.toDouble() * 10.0.pow(-18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val aF = 10.0.pow(-18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val attofarad = aF
    

    val Number.zF : Expression
        @JvmName("getzF_prop")
        get() = this.toDouble() * 10.0.pow(-21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.zeptofarad : Expression
        get() = this.toDouble() * 10.0.pow(-21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val zF = 10.0.pow(-21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val zeptofarad = zF
    

    val Number.yF : Expression
        @JvmName("getyF_prop")
        get() = this.toDouble() * 10.0.pow(-24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

    val Number.yoctofarad : Expression
        get() = this.toDouble() * 10.0.pow(-24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))


    @JvmField()         
    val yF = 10.0.pow(-24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))
    val yoctofarad = yF
    