
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    val T = kg* (s `^` -2) * (A `^` -1)

    val Number.T : Expression
        get() = this.toDouble() * (kg* (s `^` -2) * (A `^` -1))

    
    val Number.YT : Expression
        @JvmName("getYT_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg* (s `^` -2) * (A `^` -1))

    val Number.yottatesla : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val YT = 10.0.pow(24) * (kg* (s `^` -2) * (A `^` -1))
    val yottatesla = YT
    

    val Number.ZT : Expression
        @JvmName("getZT_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg* (s `^` -2) * (A `^` -1))

    val Number.zettatesla : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val ZT = 10.0.pow(21) * (kg* (s `^` -2) * (A `^` -1))
    val zettatesla = ZT
    

    val Number.ET : Expression
        @JvmName("getET_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg* (s `^` -2) * (A `^` -1))

    val Number.exatesla : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val ET = 10.0.pow(18) * (kg* (s `^` -2) * (A `^` -1))
    val exatesla = ET
    

    val Number.PT : Expression
        @JvmName("getPT_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg* (s `^` -2) * (A `^` -1))

    val Number.petatesla : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val PT = 10.0.pow(15) * (kg* (s `^` -2) * (A `^` -1))
    val petatesla = PT
    

    val Number.TT : Expression
        @JvmName("getTT_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg* (s `^` -2) * (A `^` -1))

    val Number.teratesla : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val TT = 10.0.pow(12) * (kg* (s `^` -2) * (A `^` -1))
    val teratesla = TT
    

    val Number.GT : Expression
        @JvmName("getGT_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg* (s `^` -2) * (A `^` -1))

    val Number.gigatesla : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val GT = 10.0.pow(9) * (kg* (s `^` -2) * (A `^` -1))
    val gigatesla = GT
    

    val Number.MT : Expression
        @JvmName("getMT_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg* (s `^` -2) * (A `^` -1))

    val Number.megatesla : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val MT = 10.0.pow(6) * (kg* (s `^` -2) * (A `^` -1))
    val megatesla = MT
    

    val Number.kT : Expression
        @JvmName("getkT_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg* (s `^` -2) * (A `^` -1))

    val Number.kilotesla : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val kT = 10.0.pow(3) * (kg* (s `^` -2) * (A `^` -1))
    val kilotesla = kT
    

    val Number.hT : Expression
        @JvmName("gethT_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg* (s `^` -2) * (A `^` -1))

    val Number.hectotesla : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val hT = 10.0.pow(2) * (kg* (s `^` -2) * (A `^` -1))
    val hectotesla = hT
    

    val Number.daT : Expression
        @JvmName("getdaT_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg* (s `^` -2) * (A `^` -1))

    val Number.decatesla : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val daT = 10.0.pow(1) * (kg* (s `^` -2) * (A `^` -1))
    val decatesla = daT
    

    val Number.dT : Expression
        @JvmName("getdT_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg* (s `^` -2) * (A `^` -1))

    val Number.decitesla : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val dT = 10.0.pow(-1) * (kg* (s `^` -2) * (A `^` -1))
    val decitesla = dT
    

    val Number.cT : Expression
        @JvmName("getcT_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg* (s `^` -2) * (A `^` -1))

    val Number.centitesla : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val cT = 10.0.pow(-2) * (kg* (s `^` -2) * (A `^` -1))
    val centitesla = cT
    

    val Number.mT : Expression
        @JvmName("getmT_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg* (s `^` -2) * (A `^` -1))

    val Number.millitesla : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val mT = 10.0.pow(-3) * (kg* (s `^` -2) * (A `^` -1))
    val millitesla = mT
    

    val Number.μT : Expression
        @JvmName("getμT_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg* (s `^` -2) * (A `^` -1))

    val Number.microtesla : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val μT = 10.0.pow(-6) * (kg* (s `^` -2) * (A `^` -1))
    val microtesla = μT
    

    val Number.nT : Expression
        @JvmName("getnT_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg* (s `^` -2) * (A `^` -1))

    val Number.nanotesla : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val nT = 10.0.pow(-9) * (kg* (s `^` -2) * (A `^` -1))
    val nanotesla = nT
    

    val Number.pT : Expression
        @JvmName("getpT_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg* (s `^` -2) * (A `^` -1))

    val Number.picotesla : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val pT = 10.0.pow(-12) * (kg* (s `^` -2) * (A `^` -1))
    val picotesla = pT
    

    val Number.fT : Expression
        @JvmName("getfT_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg* (s `^` -2) * (A `^` -1))

    val Number.femtotesla : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val fT = 10.0.pow(-15) * (kg* (s `^` -2) * (A `^` -1))
    val femtotesla = fT
    

    val Number.aT : Expression
        @JvmName("getaT_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg* (s `^` -2) * (A `^` -1))

    val Number.attotesla : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val aT = 10.0.pow(-18) * (kg* (s `^` -2) * (A `^` -1))
    val attotesla = aT
    

    val Number.zT : Expression
        @JvmName("getzT_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg* (s `^` -2) * (A `^` -1))

    val Number.zeptotesla : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val zT = 10.0.pow(-21) * (kg* (s `^` -2) * (A `^` -1))
    val zeptotesla = zT
    

    val Number.yT : Expression
        @JvmName("getyT_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg* (s `^` -2) * (A `^` -1))

    val Number.yoctotesla : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg* (s `^` -2) * (A `^` -1))


    @JvmField()         
    val yT = 10.0.pow(-24) * (kg* (s `^` -2) * (A `^` -1))
    val yoctotesla = yT
    