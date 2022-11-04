
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val Pa = kg/(m * (s `^` 2))

    val Number.Pa : Expression
        get() = this.toDouble() * (kg/(m * (s `^` 2)))

    
    val Number.YPa : Expression
        @JvmName("getYPa_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg/(m * (s `^` 2)))

    val Number.yottapascal : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val YPa = 10.0.pow(24) * (kg/(m * (s `^` 2)))
    val yottapascal = YPa
    

    val Number.ZPa : Expression
        @JvmName("getZPa_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg/(m * (s `^` 2)))

    val Number.zettapascal : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val ZPa = 10.0.pow(21) * (kg/(m * (s `^` 2)))
    val zettapascal = ZPa
    

    val Number.EPa : Expression
        @JvmName("getEPa_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg/(m * (s `^` 2)))

    val Number.exapascal : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val EPa = 10.0.pow(18) * (kg/(m * (s `^` 2)))
    val exapascal = EPa
    

    val Number.PPa : Expression
        @JvmName("getPPa_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg/(m * (s `^` 2)))

    val Number.petapascal : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val PPa = 10.0.pow(15) * (kg/(m * (s `^` 2)))
    val petapascal = PPa
    

    val Number.TPa : Expression
        @JvmName("getTPa_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg/(m * (s `^` 2)))

    val Number.terapascal : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val TPa = 10.0.pow(12) * (kg/(m * (s `^` 2)))
    val terapascal = TPa
    

    val Number.GPa : Expression
        @JvmName("getGPa_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg/(m * (s `^` 2)))

    val Number.gigapascal : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val GPa = 10.0.pow(9) * (kg/(m * (s `^` 2)))
    val gigapascal = GPa
    

    val Number.MPa : Expression
        @JvmName("getMPa_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg/(m * (s `^` 2)))

    val Number.megapascal : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val MPa = 10.0.pow(6) * (kg/(m * (s `^` 2)))
    val megapascal = MPa
    

    val Number.kPa : Expression
        @JvmName("getkPa_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg/(m * (s `^` 2)))

    val Number.kilopascal : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val kPa = 10.0.pow(3) * (kg/(m * (s `^` 2)))
    val kilopascal = kPa
    

    val Number.hPa : Expression
        @JvmName("gethPa_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg/(m * (s `^` 2)))

    val Number.hectopascal : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val hPa = 10.0.pow(2) * (kg/(m * (s `^` 2)))
    val hectopascal = hPa
    

    val Number.daPa : Expression
        @JvmName("getdaPa_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg/(m * (s `^` 2)))

    val Number.decapascal : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val daPa = 10.0.pow(1) * (kg/(m * (s `^` 2)))
    val decapascal = daPa
    

    val Number.dPa : Expression
        @JvmName("getdPa_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg/(m * (s `^` 2)))

    val Number.decipascal : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val dPa = 10.0.pow(-1) * (kg/(m * (s `^` 2)))
    val decipascal = dPa
    

    val Number.cPa : Expression
        @JvmName("getcPa_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg/(m * (s `^` 2)))

    val Number.centipascal : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val cPa = 10.0.pow(-2) * (kg/(m * (s `^` 2)))
    val centipascal = cPa
    

    val Number.mPa : Expression
        @JvmName("getmPa_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg/(m * (s `^` 2)))

    val Number.millipascal : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val mPa = 10.0.pow(-3) * (kg/(m * (s `^` 2)))
    val millipascal = mPa
    

    val Number.μPa : Expression
        @JvmName("getμPa_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg/(m * (s `^` 2)))

    val Number.micropascal : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val μPa = 10.0.pow(-6) * (kg/(m * (s `^` 2)))
    val micropascal = μPa
    

    val Number.nPa : Expression
        @JvmName("getnPa_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg/(m * (s `^` 2)))

    val Number.nanopascal : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val nPa = 10.0.pow(-9) * (kg/(m * (s `^` 2)))
    val nanopascal = nPa
    

    val Number.pPa : Expression
        @JvmName("getpPa_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg/(m * (s `^` 2)))

    val Number.picopascal : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val pPa = 10.0.pow(-12) * (kg/(m * (s `^` 2)))
    val picopascal = pPa
    

    val Number.fPa : Expression
        @JvmName("getfPa_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg/(m * (s `^` 2)))

    val Number.femtopascal : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val fPa = 10.0.pow(-15) * (kg/(m * (s `^` 2)))
    val femtopascal = fPa
    

    val Number.aPa : Expression
        @JvmName("getaPa_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg/(m * (s `^` 2)))

    val Number.attopascal : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val aPa = 10.0.pow(-18) * (kg/(m * (s `^` 2)))
    val attopascal = aPa
    

    val Number.zPa : Expression
        @JvmName("getzPa_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg/(m * (s `^` 2)))

    val Number.zeptopascal : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val zPa = 10.0.pow(-21) * (kg/(m * (s `^` 2)))
    val zeptopascal = zPa
    

    val Number.yPa : Expression
        @JvmName("getyPa_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg/(m * (s `^` 2)))

    val Number.yoctopascal : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg/(m * (s `^` 2)))


    @JvmField()         
    val yPa = 10.0.pow(-24) * (kg/(m * (s `^` 2)))
    val yoctopascal = yPa
    