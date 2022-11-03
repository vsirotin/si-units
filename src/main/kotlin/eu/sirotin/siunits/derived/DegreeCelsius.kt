
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    val Celsius = (K `^` 1)

    val Number.Celsius : Expression
        get() = this.toDouble() * ((K `^` 1))

    
    val Number.YCelsius : Expression
        @JvmName("getYCelsius_prop")
        get() = this.toDouble() * 10.0.pow(24) * ((K `^` 1))

    val Number.yottadegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(24) * ((K `^` 1))


    @JvmField()         
    val YCelsius = 10.0.pow(24) * ((K `^` 1))
    val yottadegreeCelsius = YCelsius
    

    val Number.ZCelsius : Expression
        @JvmName("getZCelsius_prop")
        get() = this.toDouble() * 10.0.pow(21) * ((K `^` 1))

    val Number.zettadegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(21) * ((K `^` 1))


    @JvmField()         
    val ZCelsius = 10.0.pow(21) * ((K `^` 1))
    val zettadegreeCelsius = ZCelsius
    

    val Number.ECelsius : Expression
        @JvmName("getECelsius_prop")
        get() = this.toDouble() * 10.0.pow(18) * ((K `^` 1))

    val Number.exadegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(18) * ((K `^` 1))


    @JvmField()         
    val ECelsius = 10.0.pow(18) * ((K `^` 1))
    val exadegreeCelsius = ECelsius
    

    val Number.PCelsius : Expression
        @JvmName("getPCelsius_prop")
        get() = this.toDouble() * 10.0.pow(15) * ((K `^` 1))

    val Number.petadegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(15) * ((K `^` 1))


    @JvmField()         
    val PCelsius = 10.0.pow(15) * ((K `^` 1))
    val petadegreeCelsius = PCelsius
    

    val Number.TCelsius : Expression
        @JvmName("getTCelsius_prop")
        get() = this.toDouble() * 10.0.pow(12) * ((K `^` 1))

    val Number.teradegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(12) * ((K `^` 1))


    @JvmField()         
    val TCelsius = 10.0.pow(12) * ((K `^` 1))
    val teradegreeCelsius = TCelsius
    

    val Number.GCelsius : Expression
        @JvmName("getGCelsius_prop")
        get() = this.toDouble() * 10.0.pow(9) * ((K `^` 1))

    val Number.gigadegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(9) * ((K `^` 1))


    @JvmField()         
    val GCelsius = 10.0.pow(9) * ((K `^` 1))
    val gigadegreeCelsius = GCelsius
    

    val Number.MCelsius : Expression
        @JvmName("getMCelsius_prop")
        get() = this.toDouble() * 10.0.pow(6) * ((K `^` 1))

    val Number.megadegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(6) * ((K `^` 1))


    @JvmField()         
    val MCelsius = 10.0.pow(6) * ((K `^` 1))
    val megadegreeCelsius = MCelsius
    

    val Number.kCelsius : Expression
        @JvmName("getkCelsius_prop")
        get() = this.toDouble() * 10.0.pow(3) * ((K `^` 1))

    val Number.kilodegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(3) * ((K `^` 1))


    @JvmField()         
    val kCelsius = 10.0.pow(3) * ((K `^` 1))
    val kilodegreeCelsius = kCelsius
    

    val Number.hCelsius : Expression
        @JvmName("gethCelsius_prop")
        get() = this.toDouble() * 10.0.pow(2) * ((K `^` 1))

    val Number.hectodegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(2) * ((K `^` 1))


    @JvmField()         
    val hCelsius = 10.0.pow(2) * ((K `^` 1))
    val hectodegreeCelsius = hCelsius
    

    val Number.daCelsius : Expression
        @JvmName("getdaCelsius_prop")
        get() = this.toDouble() * 10.0.pow(1) * ((K `^` 1))

    val Number.decadegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(1) * ((K `^` 1))


    @JvmField()         
    val daCelsius = 10.0.pow(1) * ((K `^` 1))
    val decadegreeCelsius = daCelsius
    

    val Number.dCelsius : Expression
        @JvmName("getdCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-1) * ((K `^` 1))

    val Number.decidegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-1) * ((K `^` 1))


    @JvmField()         
    val dCelsius = 10.0.pow(-1) * ((K `^` 1))
    val decidegreeCelsius = dCelsius
    

    val Number.cCelsius : Expression
        @JvmName("getcCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-2) * ((K `^` 1))

    val Number.centidegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-2) * ((K `^` 1))


    @JvmField()         
    val cCelsius = 10.0.pow(-2) * ((K `^` 1))
    val centidegreeCelsius = cCelsius
    

    val Number.mCelsius : Expression
        @JvmName("getmCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-3) * ((K `^` 1))

    val Number.millidegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-3) * ((K `^` 1))


    @JvmField()         
    val mCelsius = 10.0.pow(-3) * ((K `^` 1))
    val millidegreeCelsius = mCelsius
    

    val Number.μCelsius : Expression
        @JvmName("getμCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-6) * ((K `^` 1))

    val Number.microdegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-6) * ((K `^` 1))


    @JvmField()         
    val μCelsius = 10.0.pow(-6) * ((K `^` 1))
    val microdegreeCelsius = μCelsius
    

    val Number.nCelsius : Expression
        @JvmName("getnCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-9) * ((K `^` 1))

    val Number.nanodegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-9) * ((K `^` 1))


    @JvmField()         
    val nCelsius = 10.0.pow(-9) * ((K `^` 1))
    val nanodegreeCelsius = nCelsius
    

    val Number.pCelsius : Expression
        @JvmName("getpCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-12) * ((K `^` 1))

    val Number.picodegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-12) * ((K `^` 1))


    @JvmField()         
    val pCelsius = 10.0.pow(-12) * ((K `^` 1))
    val picodegreeCelsius = pCelsius
    

    val Number.fCelsius : Expression
        @JvmName("getfCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-15) * ((K `^` 1))

    val Number.femtodegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-15) * ((K `^` 1))


    @JvmField()         
    val fCelsius = 10.0.pow(-15) * ((K `^` 1))
    val femtodegreeCelsius = fCelsius
    

    val Number.aCelsius : Expression
        @JvmName("getaCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-18) * ((K `^` 1))

    val Number.attodegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-18) * ((K `^` 1))


    @JvmField()         
    val aCelsius = 10.0.pow(-18) * ((K `^` 1))
    val attodegreeCelsius = aCelsius
    

    val Number.zCelsius : Expression
        @JvmName("getzCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-21) * ((K `^` 1))

    val Number.zeptodegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-21) * ((K `^` 1))


    @JvmField()         
    val zCelsius = 10.0.pow(-21) * ((K `^` 1))
    val zeptodegreeCelsius = zCelsius
    

    val Number.yCelsius : Expression
        @JvmName("getyCelsius_prop")
        get() = this.toDouble() * 10.0.pow(-24) * ((K `^` 1))

    val Number.yoctodegreeCelsius : Expression
        get() = this.toDouble() * 10.0.pow(-24) * ((K `^` 1))


    @JvmField()         
    val yCelsius = 10.0.pow(-24) * ((K `^` 1))
    val yoctodegreeCelsius = yCelsius
    