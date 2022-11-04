
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val H = kg* (m2)*(s `^` -2)*(A `^` -2)

    val Number.H : Expression
        get() = this.toDouble() * (kg* (m2)*(s `^` -2)*(A `^` -2))

    
    val Number.YH : Expression
        @JvmName("getYH_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.yottahenry : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val YH = 10.0.pow(24) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val yottahenry = YH
    

    val Number.ZH : Expression
        @JvmName("getZH_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.zettahenry : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val ZH = 10.0.pow(21) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val zettahenry = ZH
    

    val Number.EH : Expression
        @JvmName("getEH_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.exahenry : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val EH = 10.0.pow(18) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val exahenry = EH
    

    val Number.PH : Expression
        @JvmName("getPH_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.petahenry : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val PH = 10.0.pow(15) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val petahenry = PH
    

    val Number.TH : Expression
        @JvmName("getTH_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.terahenry : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val TH = 10.0.pow(12) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val terahenry = TH
    

    val Number.GH : Expression
        @JvmName("getGH_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.gigahenry : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val GH = 10.0.pow(9) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val gigahenry = GH
    

    val Number.MH : Expression
        @JvmName("getMH_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.megahenry : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val MH = 10.0.pow(6) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val megahenry = MH
    

    val Number.kH : Expression
        @JvmName("getkH_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.kilohenry : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val kH = 10.0.pow(3) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val kilohenry = kH
    

    val Number.hH : Expression
        @JvmName("gethH_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.hectohenry : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val hH = 10.0.pow(2) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val hectohenry = hH
    

    val Number.daH : Expression
        @JvmName("getdaH_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.decahenry : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val daH = 10.0.pow(1) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val decahenry = daH
    

    val Number.dH : Expression
        @JvmName("getdH_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.decihenry : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val dH = 10.0.pow(-1) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val decihenry = dH
    

    val Number.cH : Expression
        @JvmName("getcH_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.centihenry : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val cH = 10.0.pow(-2) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val centihenry = cH
    

    val Number.mH : Expression
        @JvmName("getmH_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.millihenry : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val mH = 10.0.pow(-3) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val millihenry = mH
    

    val Number.μH : Expression
        @JvmName("getμH_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.microhenry : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val μH = 10.0.pow(-6) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val microhenry = μH
    

    val Number.nH : Expression
        @JvmName("getnH_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.nanohenry : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val nH = 10.0.pow(-9) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val nanohenry = nH
    

    val Number.pH : Expression
        @JvmName("getpH_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.picohenry : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val pH = 10.0.pow(-12) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val picohenry = pH
    

    val Number.fH : Expression
        @JvmName("getfH_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.femtohenry : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val fH = 10.0.pow(-15) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val femtohenry = fH
    

    val Number.aH : Expression
        @JvmName("getaH_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.attohenry : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val aH = 10.0.pow(-18) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val attohenry = aH
    

    val Number.zH : Expression
        @JvmName("getzH_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.zeptohenry : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val zH = 10.0.pow(-21) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val zeptohenry = zH
    

    val Number.yH : Expression
        @JvmName("getyH_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg* (m2)*(s `^` -2)*(A `^` -2))

    val Number.yoctohenry : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg* (m2)*(s `^` -2)*(A `^` -2))


    @JvmField()         
    val yH = 10.0.pow(-24) * (kg* (m2)*(s `^` -2)*(A `^` -2))
    val yoctohenry = yH
    