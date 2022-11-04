
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val Gy = (m2)*(s `^` -2)

    val Number.Gy : Expression
        get() = this.toDouble() * ((m2)*(s `^` -2))

    
    val Number.YGy : Expression
        @JvmName("getYGy_prop")
        get() = this.toDouble() * 10.0.pow(24) * ((m2)*(s `^` -2))

    val Number.yottagray : Expression
        get() = this.toDouble() * 10.0.pow(24) * ((m2)*(s `^` -2))


    @JvmField()         
    val YGy = 10.0.pow(24) * ((m2)*(s `^` -2))
    val yottagray = YGy
    

    val Number.ZGy : Expression
        @JvmName("getZGy_prop")
        get() = this.toDouble() * 10.0.pow(21) * ((m2)*(s `^` -2))

    val Number.zettagray : Expression
        get() = this.toDouble() * 10.0.pow(21) * ((m2)*(s `^` -2))


    @JvmField()         
    val ZGy = 10.0.pow(21) * ((m2)*(s `^` -2))
    val zettagray = ZGy
    

    val Number.EGy : Expression
        @JvmName("getEGy_prop")
        get() = this.toDouble() * 10.0.pow(18) * ((m2)*(s `^` -2))

    val Number.exagray : Expression
        get() = this.toDouble() * 10.0.pow(18) * ((m2)*(s `^` -2))


    @JvmField()         
    val EGy = 10.0.pow(18) * ((m2)*(s `^` -2))
    val exagray = EGy
    

    val Number.PGy : Expression
        @JvmName("getPGy_prop")
        get() = this.toDouble() * 10.0.pow(15) * ((m2)*(s `^` -2))

    val Number.petagray : Expression
        get() = this.toDouble() * 10.0.pow(15) * ((m2)*(s `^` -2))


    @JvmField()         
    val PGy = 10.0.pow(15) * ((m2)*(s `^` -2))
    val petagray = PGy
    

    val Number.TGy : Expression
        @JvmName("getTGy_prop")
        get() = this.toDouble() * 10.0.pow(12) * ((m2)*(s `^` -2))

    val Number.teragray : Expression
        get() = this.toDouble() * 10.0.pow(12) * ((m2)*(s `^` -2))


    @JvmField()         
    val TGy = 10.0.pow(12) * ((m2)*(s `^` -2))
    val teragray = TGy
    

    val Number.GGy : Expression
        @JvmName("getGGy_prop")
        get() = this.toDouble() * 10.0.pow(9) * ((m2)*(s `^` -2))

    val Number.gigagray : Expression
        get() = this.toDouble() * 10.0.pow(9) * ((m2)*(s `^` -2))


    @JvmField()         
    val GGy = 10.0.pow(9) * ((m2)*(s `^` -2))
    val gigagray = GGy
    

    val Number.MGy : Expression
        @JvmName("getMGy_prop")
        get() = this.toDouble() * 10.0.pow(6) * ((m2)*(s `^` -2))

    val Number.megagray : Expression
        get() = this.toDouble() * 10.0.pow(6) * ((m2)*(s `^` -2))


    @JvmField()         
    val MGy = 10.0.pow(6) * ((m2)*(s `^` -2))
    val megagray = MGy
    

    val Number.kGy : Expression
        @JvmName("getkGy_prop")
        get() = this.toDouble() * 10.0.pow(3) * ((m2)*(s `^` -2))

    val Number.kilogray : Expression
        get() = this.toDouble() * 10.0.pow(3) * ((m2)*(s `^` -2))


    @JvmField()         
    val kGy = 10.0.pow(3) * ((m2)*(s `^` -2))
    val kilogray = kGy
    

    val Number.hGy : Expression
        @JvmName("gethGy_prop")
        get() = this.toDouble() * 10.0.pow(2) * ((m2)*(s `^` -2))

    val Number.hectogray : Expression
        get() = this.toDouble() * 10.0.pow(2) * ((m2)*(s `^` -2))


    @JvmField()         
    val hGy = 10.0.pow(2) * ((m2)*(s `^` -2))
    val hectogray = hGy
    

    val Number.daGy : Expression
        @JvmName("getdaGy_prop")
        get() = this.toDouble() * 10.0.pow(1) * ((m2)*(s `^` -2))

    val Number.decagray : Expression
        get() = this.toDouble() * 10.0.pow(1) * ((m2)*(s `^` -2))


    @JvmField()         
    val daGy = 10.0.pow(1) * ((m2)*(s `^` -2))
    val decagray = daGy
    

    val Number.dGy : Expression
        @JvmName("getdGy_prop")
        get() = this.toDouble() * 10.0.pow(-1) * ((m2)*(s `^` -2))

    val Number.decigray : Expression
        get() = this.toDouble() * 10.0.pow(-1) * ((m2)*(s `^` -2))


    @JvmField()         
    val dGy = 10.0.pow(-1) * ((m2)*(s `^` -2))
    val decigray = dGy
    

    val Number.cGy : Expression
        @JvmName("getcGy_prop")
        get() = this.toDouble() * 10.0.pow(-2) * ((m2)*(s `^` -2))

    val Number.centigray : Expression
        get() = this.toDouble() * 10.0.pow(-2) * ((m2)*(s `^` -2))


    @JvmField()         
    val cGy = 10.0.pow(-2) * ((m2)*(s `^` -2))
    val centigray = cGy
    

    val Number.mGy : Expression
        @JvmName("getmGy_prop")
        get() = this.toDouble() * 10.0.pow(-3) * ((m2)*(s `^` -2))

    val Number.milligray : Expression
        get() = this.toDouble() * 10.0.pow(-3) * ((m2)*(s `^` -2))


    @JvmField()         
    val mGy = 10.0.pow(-3) * ((m2)*(s `^` -2))
    val milligray = mGy
    

    val Number.μGy : Expression
        @JvmName("getμGy_prop")
        get() = this.toDouble() * 10.0.pow(-6) * ((m2)*(s `^` -2))

    val Number.microgray : Expression
        get() = this.toDouble() * 10.0.pow(-6) * ((m2)*(s `^` -2))


    @JvmField()         
    val μGy = 10.0.pow(-6) * ((m2)*(s `^` -2))
    val microgray = μGy
    

    val Number.nGy : Expression
        @JvmName("getnGy_prop")
        get() = this.toDouble() * 10.0.pow(-9) * ((m2)*(s `^` -2))

    val Number.nanogray : Expression
        get() = this.toDouble() * 10.0.pow(-9) * ((m2)*(s `^` -2))


    @JvmField()         
    val nGy = 10.0.pow(-9) * ((m2)*(s `^` -2))
    val nanogray = nGy
    

    val Number.pGy : Expression
        @JvmName("getpGy_prop")
        get() = this.toDouble() * 10.0.pow(-12) * ((m2)*(s `^` -2))

    val Number.picogray : Expression
        get() = this.toDouble() * 10.0.pow(-12) * ((m2)*(s `^` -2))


    @JvmField()         
    val pGy = 10.0.pow(-12) * ((m2)*(s `^` -2))
    val picogray = pGy
    

    val Number.fGy : Expression
        @JvmName("getfGy_prop")
        get() = this.toDouble() * 10.0.pow(-15) * ((m2)*(s `^` -2))

    val Number.femtogray : Expression
        get() = this.toDouble() * 10.0.pow(-15) * ((m2)*(s `^` -2))


    @JvmField()         
    val fGy = 10.0.pow(-15) * ((m2)*(s `^` -2))
    val femtogray = fGy
    

    val Number.aGy : Expression
        @JvmName("getaGy_prop")
        get() = this.toDouble() * 10.0.pow(-18) * ((m2)*(s `^` -2))

    val Number.attogray : Expression
        get() = this.toDouble() * 10.0.pow(-18) * ((m2)*(s `^` -2))


    @JvmField()         
    val aGy = 10.0.pow(-18) * ((m2)*(s `^` -2))
    val attogray = aGy
    

    val Number.zGy : Expression
        @JvmName("getzGy_prop")
        get() = this.toDouble() * 10.0.pow(-21) * ((m2)*(s `^` -2))

    val Number.zeptogray : Expression
        get() = this.toDouble() * 10.0.pow(-21) * ((m2)*(s `^` -2))


    @JvmField()         
    val zGy = 10.0.pow(-21) * ((m2)*(s `^` -2))
    val zeptogray = zGy
    

    val Number.yGy : Expression
        @JvmName("getyGy_prop")
        get() = this.toDouble() * 10.0.pow(-24) * ((m2)*(s `^` -2))

    val Number.yoctogray : Expression
        get() = this.toDouble() * 10.0.pow(-24) * ((m2)*(s `^` -2))


    @JvmField()         
    val yGy = 10.0.pow(-24) * ((m2)*(s `^` -2))
    val yoctogray = yGy
    