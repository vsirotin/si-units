
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val Ω = kg*m2 * (s `^` -3) * (A `^` -2)

    val Number.Ω : Expression
        get() = this.toDouble() * (kg*m2 * (s `^` -3) * (A `^` -2))

    
    val Number.YΩ : Expression
        @JvmName("getYΩ_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.yottaohm : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val YΩ = 10.0.pow(24) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val yottaohm = YΩ
    

    val Number.ZΩ : Expression
        @JvmName("getZΩ_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.zettaohm : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val ZΩ = 10.0.pow(21) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val zettaohm = ZΩ
    

    val Number.EΩ : Expression
        @JvmName("getEΩ_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.exaohm : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val EΩ = 10.0.pow(18) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val exaohm = EΩ
    

    val Number.PΩ : Expression
        @JvmName("getPΩ_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.petaohm : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val PΩ = 10.0.pow(15) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val petaohm = PΩ
    

    val Number.TΩ : Expression
        @JvmName("getTΩ_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.teraohm : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val TΩ = 10.0.pow(12) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val teraohm = TΩ
    

    val Number.GΩ : Expression
        @JvmName("getGΩ_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.gigaohm : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val GΩ = 10.0.pow(9) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val gigaohm = GΩ
    

    val Number.MΩ : Expression
        @JvmName("getMΩ_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.megaohm : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val MΩ = 10.0.pow(6) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val megaohm = MΩ
    

    val Number.kΩ : Expression
        @JvmName("getkΩ_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.kiloohm : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val kΩ = 10.0.pow(3) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val kiloohm = kΩ
    

    val Number.hΩ : Expression
        @JvmName("gethΩ_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.hectoohm : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val hΩ = 10.0.pow(2) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val hectoohm = hΩ
    

    val Number.daΩ : Expression
        @JvmName("getdaΩ_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.decaohm : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val daΩ = 10.0.pow(1) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val decaohm = daΩ
    

    val Number.dΩ : Expression
        @JvmName("getdΩ_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.deciohm : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val dΩ = 10.0.pow(-1) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val deciohm = dΩ
    

    val Number.cΩ : Expression
        @JvmName("getcΩ_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.centiohm : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val cΩ = 10.0.pow(-2) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val centiohm = cΩ
    

    val Number.mΩ : Expression
        @JvmName("getmΩ_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.milliohm : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val mΩ = 10.0.pow(-3) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val milliohm = mΩ
    

    val Number.μΩ : Expression
        @JvmName("getμΩ_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.microohm : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val μΩ = 10.0.pow(-6) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val microohm = μΩ
    

    val Number.nΩ : Expression
        @JvmName("getnΩ_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.nanoohm : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val nΩ = 10.0.pow(-9) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val nanoohm = nΩ
    

    val Number.pΩ : Expression
        @JvmName("getpΩ_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.picoohm : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val pΩ = 10.0.pow(-12) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val picoohm = pΩ
    

    val Number.fΩ : Expression
        @JvmName("getfΩ_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.femtoohm : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val fΩ = 10.0.pow(-15) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val femtoohm = fΩ
    

    val Number.aΩ : Expression
        @JvmName("getaΩ_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.attoohm : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val aΩ = 10.0.pow(-18) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val attoohm = aΩ
    

    val Number.zΩ : Expression
        @JvmName("getzΩ_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.zeptoohm : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val zΩ = 10.0.pow(-21) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val zeptoohm = zΩ
    

    val Number.yΩ : Expression
        @JvmName("getyΩ_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg*m2 * (s `^` -3) * (A `^` -2))

    val Number.yoctoohm : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg*m2 * (s `^` -3) * (A `^` -2))


    @JvmField()         
    val yΩ = 10.0.pow(-24) * (kg*m2 * (s `^` -3) * (A `^` -2))
    val yoctoohm = yΩ
    