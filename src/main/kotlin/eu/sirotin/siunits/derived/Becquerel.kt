
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val Bq = (s `^` -1)

    val Number.Bq : Expression
        get() = this.toDouble() * ((s `^` -1))

    
    val Number.YBq : Expression
        @JvmName("getYBq_prop")
        get() = this.toDouble() * 10.0.pow(24) * ((s `^` -1))

    val Number.yottabecquerel : Expression
        get() = this.toDouble() * 10.0.pow(24) * ((s `^` -1))


    @JvmField()         
    val YBq = 10.0.pow(24) * ((s `^` -1))
    val yottabecquerel = YBq
    

    val Number.ZBq : Expression
        @JvmName("getZBq_prop")
        get() = this.toDouble() * 10.0.pow(21) * ((s `^` -1))

    val Number.zettabecquerel : Expression
        get() = this.toDouble() * 10.0.pow(21) * ((s `^` -1))


    @JvmField()         
    val ZBq = 10.0.pow(21) * ((s `^` -1))
    val zettabecquerel = ZBq
    

    val Number.EBq : Expression
        @JvmName("getEBq_prop")
        get() = this.toDouble() * 10.0.pow(18) * ((s `^` -1))

    val Number.exabecquerel : Expression
        get() = this.toDouble() * 10.0.pow(18) * ((s `^` -1))


    @JvmField()         
    val EBq = 10.0.pow(18) * ((s `^` -1))
    val exabecquerel = EBq
    

    val Number.PBq : Expression
        @JvmName("getPBq_prop")
        get() = this.toDouble() * 10.0.pow(15) * ((s `^` -1))

    val Number.petabecquerel : Expression
        get() = this.toDouble() * 10.0.pow(15) * ((s `^` -1))


    @JvmField()         
    val PBq = 10.0.pow(15) * ((s `^` -1))
    val petabecquerel = PBq
    

    val Number.TBq : Expression
        @JvmName("getTBq_prop")
        get() = this.toDouble() * 10.0.pow(12) * ((s `^` -1))

    val Number.terabecquerel : Expression
        get() = this.toDouble() * 10.0.pow(12) * ((s `^` -1))


    @JvmField()         
    val TBq = 10.0.pow(12) * ((s `^` -1))
    val terabecquerel = TBq
    

    val Number.GBq : Expression
        @JvmName("getGBq_prop")
        get() = this.toDouble() * 10.0.pow(9) * ((s `^` -1))

    val Number.gigabecquerel : Expression
        get() = this.toDouble() * 10.0.pow(9) * ((s `^` -1))


    @JvmField()         
    val GBq = 10.0.pow(9) * ((s `^` -1))
    val gigabecquerel = GBq
    

    val Number.MBq : Expression
        @JvmName("getMBq_prop")
        get() = this.toDouble() * 10.0.pow(6) * ((s `^` -1))

    val Number.megabecquerel : Expression
        get() = this.toDouble() * 10.0.pow(6) * ((s `^` -1))


    @JvmField()         
    val MBq = 10.0.pow(6) * ((s `^` -1))
    val megabecquerel = MBq
    

    val Number.kBq : Expression
        @JvmName("getkBq_prop")
        get() = this.toDouble() * 10.0.pow(3) * ((s `^` -1))

    val Number.kilobecquerel : Expression
        get() = this.toDouble() * 10.0.pow(3) * ((s `^` -1))


    @JvmField()         
    val kBq = 10.0.pow(3) * ((s `^` -1))
    val kilobecquerel = kBq
    

    val Number.hBq : Expression
        @JvmName("gethBq_prop")
        get() = this.toDouble() * 10.0.pow(2) * ((s `^` -1))

    val Number.hectobecquerel : Expression
        get() = this.toDouble() * 10.0.pow(2) * ((s `^` -1))


    @JvmField()         
    val hBq = 10.0.pow(2) * ((s `^` -1))
    val hectobecquerel = hBq
    

    val Number.daBq : Expression
        @JvmName("getdaBq_prop")
        get() = this.toDouble() * 10.0.pow(1) * ((s `^` -1))

    val Number.decabecquerel : Expression
        get() = this.toDouble() * 10.0.pow(1) * ((s `^` -1))


    @JvmField()         
    val daBq = 10.0.pow(1) * ((s `^` -1))
    val decabecquerel = daBq
    

    val Number.dBq : Expression
        @JvmName("getdBq_prop")
        get() = this.toDouble() * 10.0.pow(-1) * ((s `^` -1))

    val Number.decibecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-1) * ((s `^` -1))


    @JvmField()         
    val dBq = 10.0.pow(-1) * ((s `^` -1))
    val decibecquerel = dBq
    

    val Number.cBq : Expression
        @JvmName("getcBq_prop")
        get() = this.toDouble() * 10.0.pow(-2) * ((s `^` -1))

    val Number.centibecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-2) * ((s `^` -1))


    @JvmField()         
    val cBq = 10.0.pow(-2) * ((s `^` -1))
    val centibecquerel = cBq
    

    val Number.mBq : Expression
        @JvmName("getmBq_prop")
        get() = this.toDouble() * 10.0.pow(-3) * ((s `^` -1))

    val Number.millibecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-3) * ((s `^` -1))


    @JvmField()         
    val mBq = 10.0.pow(-3) * ((s `^` -1))
    val millibecquerel = mBq
    

    val Number.μBq : Expression
        @JvmName("getμBq_prop")
        get() = this.toDouble() * 10.0.pow(-6) * ((s `^` -1))

    val Number.microbecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-6) * ((s `^` -1))


    @JvmField()         
    val μBq = 10.0.pow(-6) * ((s `^` -1))
    val microbecquerel = μBq
    

    val Number.nBq : Expression
        @JvmName("getnBq_prop")
        get() = this.toDouble() * 10.0.pow(-9) * ((s `^` -1))

    val Number.nanobecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-9) * ((s `^` -1))


    @JvmField()         
    val nBq = 10.0.pow(-9) * ((s `^` -1))
    val nanobecquerel = nBq
    

    val Number.pBq : Expression
        @JvmName("getpBq_prop")
        get() = this.toDouble() * 10.0.pow(-12) * ((s `^` -1))

    val Number.picobecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-12) * ((s `^` -1))


    @JvmField()         
    val pBq = 10.0.pow(-12) * ((s `^` -1))
    val picobecquerel = pBq
    

    val Number.fBq : Expression
        @JvmName("getfBq_prop")
        get() = this.toDouble() * 10.0.pow(-15) * ((s `^` -1))

    val Number.femtobecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-15) * ((s `^` -1))


    @JvmField()         
    val fBq = 10.0.pow(-15) * ((s `^` -1))
    val femtobecquerel = fBq
    

    val Number.aBq : Expression
        @JvmName("getaBq_prop")
        get() = this.toDouble() * 10.0.pow(-18) * ((s `^` -1))

    val Number.attobecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-18) * ((s `^` -1))


    @JvmField()         
    val aBq = 10.0.pow(-18) * ((s `^` -1))
    val attobecquerel = aBq
    

    val Number.zBq : Expression
        @JvmName("getzBq_prop")
        get() = this.toDouble() * 10.0.pow(-21) * ((s `^` -1))

    val Number.zeptobecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-21) * ((s `^` -1))


    @JvmField()         
    val zBq = 10.0.pow(-21) * ((s `^` -1))
    val zeptobecquerel = zBq
    

    val Number.yBq : Expression
        @JvmName("getyBq_prop")
        get() = this.toDouble() * 10.0.pow(-24) * ((s `^` -1))

    val Number.yoctobecquerel : Expression
        get() = this.toDouble() * 10.0.pow(-24) * ((s `^` -1))


    @JvmField()         
    val yBq = 10.0.pow(-24) * ((s `^` -1))
    val yoctobecquerel = yBq
    