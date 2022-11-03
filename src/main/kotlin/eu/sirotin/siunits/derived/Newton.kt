
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    //Unit of force, weight
    val N = kg*m/(s `^` 2)

    val Number.N : Expression
        get() = this.toDouble() * (kg*m/(s `^` 2))

    
    val Number.YN : Expression
        @JvmName("getYN_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg*m/(s `^` 2))

    val Number.yottanewton : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg*m/(s `^` 2))


    @JvmField()         
    val YN = 10.0.pow(24) * (kg*m/(s `^` 2))
    val yottanewton = YN
    

    val Number.ZN : Expression
        @JvmName("getZN_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg*m/(s `^` 2))

    val Number.zettanewton : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg*m/(s `^` 2))


    @JvmField()         
    val ZN = 10.0.pow(21) * (kg*m/(s `^` 2))
    val zettanewton = ZN
    

    val Number.EN : Expression
        @JvmName("getEN_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg*m/(s `^` 2))

    val Number.exanewton : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg*m/(s `^` 2))


    @JvmField()         
    val EN = 10.0.pow(18) * (kg*m/(s `^` 2))
    val exanewton = EN
    

    val Number.PN : Expression
        @JvmName("getPN_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg*m/(s `^` 2))

    val Number.petanewton : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg*m/(s `^` 2))


    @JvmField()         
    val PN = 10.0.pow(15) * (kg*m/(s `^` 2))
    val petanewton = PN
    

    val Number.TN : Expression
        @JvmName("getTN_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg*m/(s `^` 2))

    val Number.teranewton : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg*m/(s `^` 2))


    @JvmField()         
    val TN = 10.0.pow(12) * (kg*m/(s `^` 2))
    val teranewton = TN
    

    val Number.GN : Expression
        @JvmName("getGN_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg*m/(s `^` 2))

    val Number.giganewton : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg*m/(s `^` 2))


    @JvmField()         
    val GN = 10.0.pow(9) * (kg*m/(s `^` 2))
    val giganewton = GN
    

    val Number.MN : Expression
        @JvmName("getMN_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg*m/(s `^` 2))

    val Number.meganewton : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg*m/(s `^` 2))


    @JvmField()         
    val MN = 10.0.pow(6) * (kg*m/(s `^` 2))
    val meganewton = MN
    

    val Number.kN : Expression
        @JvmName("getkN_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg*m/(s `^` 2))

    val Number.kilonewton : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg*m/(s `^` 2))


    @JvmField()         
    val kN = 10.0.pow(3) * (kg*m/(s `^` 2))
    val kilonewton = kN
    

    val Number.hN : Expression
        @JvmName("gethN_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg*m/(s `^` 2))

    val Number.hectonewton : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg*m/(s `^` 2))


    @JvmField()         
    val hN = 10.0.pow(2) * (kg*m/(s `^` 2))
    val hectonewton = hN
    

    val Number.daN : Expression
        @JvmName("getdaN_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg*m/(s `^` 2))

    val Number.decanewton : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg*m/(s `^` 2))


    @JvmField()         
    val daN = 10.0.pow(1) * (kg*m/(s `^` 2))
    val decanewton = daN
    

    val Number.dN : Expression
        @JvmName("getdN_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg*m/(s `^` 2))

    val Number.decinewton : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg*m/(s `^` 2))


    @JvmField()         
    val dN = 10.0.pow(-1) * (kg*m/(s `^` 2))
    val decinewton = dN
    

    val Number.cN : Expression
        @JvmName("getcN_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg*m/(s `^` 2))

    val Number.centinewton : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg*m/(s `^` 2))


    @JvmField()         
    val cN = 10.0.pow(-2) * (kg*m/(s `^` 2))
    val centinewton = cN
    

    val Number.mN : Expression
        @JvmName("getmN_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg*m/(s `^` 2))

    val Number.millinewton : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg*m/(s `^` 2))


    @JvmField()         
    val mN = 10.0.pow(-3) * (kg*m/(s `^` 2))
    val millinewton = mN
    

    val Number.μN : Expression
        @JvmName("getμN_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg*m/(s `^` 2))

    val Number.micronewton : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg*m/(s `^` 2))


    @JvmField()         
    val μN = 10.0.pow(-6) * (kg*m/(s `^` 2))
    val micronewton = μN
    

    val Number.nN : Expression
        @JvmName("getnN_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg*m/(s `^` 2))

    val Number.nanonewton : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg*m/(s `^` 2))


    @JvmField()         
    val nN = 10.0.pow(-9) * (kg*m/(s `^` 2))
    val nanonewton = nN
    

    val Number.pN : Expression
        @JvmName("getpN_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg*m/(s `^` 2))

    val Number.piconewton : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg*m/(s `^` 2))


    @JvmField()         
    val pN = 10.0.pow(-12) * (kg*m/(s `^` 2))
    val piconewton = pN
    

    val Number.fN : Expression
        @JvmName("getfN_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg*m/(s `^` 2))

    val Number.femtonewton : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg*m/(s `^` 2))


    @JvmField()         
    val fN = 10.0.pow(-15) * (kg*m/(s `^` 2))
    val femtonewton = fN
    

    val Number.aN : Expression
        @JvmName("getaN_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg*m/(s `^` 2))

    val Number.attonewton : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg*m/(s `^` 2))


    @JvmField()         
    val aN = 10.0.pow(-18) * (kg*m/(s `^` 2))
    val attonewton = aN
    

    val Number.zN : Expression
        @JvmName("getzN_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg*m/(s `^` 2))

    val Number.zeptonewton : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg*m/(s `^` 2))


    @JvmField()         
    val zN = 10.0.pow(-21) * (kg*m/(s `^` 2))
    val zeptonewton = zN
    

    val Number.yN : Expression
        @JvmName("getyN_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg*m/(s `^` 2))

    val Number.yoctonewton : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg*m/(s `^` 2))


    @JvmField()         
    val yN = 10.0.pow(-24) * (kg*m/(s `^` 2))
    val yoctonewton = yN
    