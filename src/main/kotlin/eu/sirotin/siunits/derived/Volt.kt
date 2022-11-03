
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    val V = kg*m2*(s `^` -3) * (A `^` -1)

    val Number.V : Expression
        get() = this.toDouble() * (kg*m2*(s `^` -3) * (A `^` -1))

    
    val Number.YV : Expression
        @JvmName("getYV_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.yottavolt : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val YV = 10.0.pow(24) * (kg*m2*(s `^` -3) * (A `^` -1))
    val yottavolt = YV
    

    val Number.ZV : Expression
        @JvmName("getZV_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.zettavolt : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val ZV = 10.0.pow(21) * (kg*m2*(s `^` -3) * (A `^` -1))
    val zettavolt = ZV
    

    val Number.EV : Expression
        @JvmName("getEV_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.exavolt : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val EV = 10.0.pow(18) * (kg*m2*(s `^` -3) * (A `^` -1))
    val exavolt = EV
    

    val Number.PV : Expression
        @JvmName("getPV_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.petavolt : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val PV = 10.0.pow(15) * (kg*m2*(s `^` -3) * (A `^` -1))
    val petavolt = PV
    

    val Number.TV : Expression
        @JvmName("getTV_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.teravolt : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val TV = 10.0.pow(12) * (kg*m2*(s `^` -3) * (A `^` -1))
    val teravolt = TV
    

    val Number.GV : Expression
        @JvmName("getGV_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.gigavolt : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val GV = 10.0.pow(9) * (kg*m2*(s `^` -3) * (A `^` -1))
    val gigavolt = GV
    

    val Number.MV : Expression
        @JvmName("getMV_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.megavolt : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val MV = 10.0.pow(6) * (kg*m2*(s `^` -3) * (A `^` -1))
    val megavolt = MV
    

    val Number.kV : Expression
        @JvmName("getkV_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.kilovolt : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val kV = 10.0.pow(3) * (kg*m2*(s `^` -3) * (A `^` -1))
    val kilovolt = kV
    

    val Number.hV : Expression
        @JvmName("gethV_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.hectovolt : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val hV = 10.0.pow(2) * (kg*m2*(s `^` -3) * (A `^` -1))
    val hectovolt = hV
    

    val Number.daV : Expression
        @JvmName("getdaV_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.decavolt : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val daV = 10.0.pow(1) * (kg*m2*(s `^` -3) * (A `^` -1))
    val decavolt = daV
    

    val Number.dV : Expression
        @JvmName("getdV_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.decivolt : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val dV = 10.0.pow(-1) * (kg*m2*(s `^` -3) * (A `^` -1))
    val decivolt = dV
    

    val Number.cV : Expression
        @JvmName("getcV_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.centivolt : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val cV = 10.0.pow(-2) * (kg*m2*(s `^` -3) * (A `^` -1))
    val centivolt = cV
    

    val Number.mV : Expression
        @JvmName("getmV_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.millivolt : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val mV = 10.0.pow(-3) * (kg*m2*(s `^` -3) * (A `^` -1))
    val millivolt = mV
    

    val Number.μV : Expression
        @JvmName("getμV_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.microvolt : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val μV = 10.0.pow(-6) * (kg*m2*(s `^` -3) * (A `^` -1))
    val microvolt = μV
    

    val Number.nV : Expression
        @JvmName("getnV_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.nanovolt : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val nV = 10.0.pow(-9) * (kg*m2*(s `^` -3) * (A `^` -1))
    val nanovolt = nV
    

    val Number.pV : Expression
        @JvmName("getpV_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.picovolt : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val pV = 10.0.pow(-12) * (kg*m2*(s `^` -3) * (A `^` -1))
    val picovolt = pV
    

    val Number.fV : Expression
        @JvmName("getfV_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.femtovolt : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val fV = 10.0.pow(-15) * (kg*m2*(s `^` -3) * (A `^` -1))
    val femtovolt = fV
    

    val Number.aV : Expression
        @JvmName("getaV_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.attovolt : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val aV = 10.0.pow(-18) * (kg*m2*(s `^` -3) * (A `^` -1))
    val attovolt = aV
    

    val Number.zV : Expression
        @JvmName("getzV_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.zeptovolt : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val zV = 10.0.pow(-21) * (kg*m2*(s `^` -3) * (A `^` -1))
    val zeptovolt = zV
    

    val Number.yV : Expression
        @JvmName("getyV_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg*m2*(s `^` -3) * (A `^` -1))

    val Number.yoctovolt : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg*m2*(s `^` -3) * (A `^` -1))


    @JvmField()         
    val yV = 10.0.pow(-24) * (kg*m2*(s `^` -3) * (A `^` -1))
    val yoctovolt = yV
    