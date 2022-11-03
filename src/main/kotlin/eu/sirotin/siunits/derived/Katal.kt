
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    val kat = (mol * (s `^` -1))

    val Number.kat : Expression
        get() = this.toDouble() * ((mol * (s `^` -1)))

    
    val Number.Ykat : Expression
        @JvmName("getYkat_prop")
        get() = this.toDouble() * 10.0.pow(24) * ((mol * (s `^` -1)))

    val Number.yottakatal : Expression
        get() = this.toDouble() * 10.0.pow(24) * ((mol * (s `^` -1)))


    @JvmField()         
    val Ykat = 10.0.pow(24) * ((mol * (s `^` -1)))
    val yottakatal = Ykat
    

    val Number.Zkat : Expression
        @JvmName("getZkat_prop")
        get() = this.toDouble() * 10.0.pow(21) * ((mol * (s `^` -1)))

    val Number.zettakatal : Expression
        get() = this.toDouble() * 10.0.pow(21) * ((mol * (s `^` -1)))


    @JvmField()         
    val Zkat = 10.0.pow(21) * ((mol * (s `^` -1)))
    val zettakatal = Zkat
    

    val Number.Ekat : Expression
        @JvmName("getEkat_prop")
        get() = this.toDouble() * 10.0.pow(18) * ((mol * (s `^` -1)))

    val Number.exakatal : Expression
        get() = this.toDouble() * 10.0.pow(18) * ((mol * (s `^` -1)))


    @JvmField()         
    val Ekat = 10.0.pow(18) * ((mol * (s `^` -1)))
    val exakatal = Ekat
    

    val Number.Pkat : Expression
        @JvmName("getPkat_prop")
        get() = this.toDouble() * 10.0.pow(15) * ((mol * (s `^` -1)))

    val Number.petakatal : Expression
        get() = this.toDouble() * 10.0.pow(15) * ((mol * (s `^` -1)))


    @JvmField()         
    val Pkat = 10.0.pow(15) * ((mol * (s `^` -1)))
    val petakatal = Pkat
    

    val Number.Tkat : Expression
        @JvmName("getTkat_prop")
        get() = this.toDouble() * 10.0.pow(12) * ((mol * (s `^` -1)))

    val Number.terakatal : Expression
        get() = this.toDouble() * 10.0.pow(12) * ((mol * (s `^` -1)))


    @JvmField()         
    val Tkat = 10.0.pow(12) * ((mol * (s `^` -1)))
    val terakatal = Tkat
    

    val Number.Gkat : Expression
        @JvmName("getGkat_prop")
        get() = this.toDouble() * 10.0.pow(9) * ((mol * (s `^` -1)))

    val Number.gigakatal : Expression
        get() = this.toDouble() * 10.0.pow(9) * ((mol * (s `^` -1)))


    @JvmField()         
    val Gkat = 10.0.pow(9) * ((mol * (s `^` -1)))
    val gigakatal = Gkat
    

    val Number.Mkat : Expression
        @JvmName("getMkat_prop")
        get() = this.toDouble() * 10.0.pow(6) * ((mol * (s `^` -1)))

    val Number.megakatal : Expression
        get() = this.toDouble() * 10.0.pow(6) * ((mol * (s `^` -1)))


    @JvmField()         
    val Mkat = 10.0.pow(6) * ((mol * (s `^` -1)))
    val megakatal = Mkat
    

    val Number.kkat : Expression
        @JvmName("getkkat_prop")
        get() = this.toDouble() * 10.0.pow(3) * ((mol * (s `^` -1)))

    val Number.kilokatal : Expression
        get() = this.toDouble() * 10.0.pow(3) * ((mol * (s `^` -1)))


    @JvmField()         
    val kkat = 10.0.pow(3) * ((mol * (s `^` -1)))
    val kilokatal = kkat
    

    val Number.hkat : Expression
        @JvmName("gethkat_prop")
        get() = this.toDouble() * 10.0.pow(2) * ((mol * (s `^` -1)))

    val Number.hectokatal : Expression
        get() = this.toDouble() * 10.0.pow(2) * ((mol * (s `^` -1)))


    @JvmField()         
    val hkat = 10.0.pow(2) * ((mol * (s `^` -1)))
    val hectokatal = hkat
    

    val Number.dakat : Expression
        @JvmName("getdakat_prop")
        get() = this.toDouble() * 10.0.pow(1) * ((mol * (s `^` -1)))

    val Number.decakatal : Expression
        get() = this.toDouble() * 10.0.pow(1) * ((mol * (s `^` -1)))


    @JvmField()         
    val dakat = 10.0.pow(1) * ((mol * (s `^` -1)))
    val decakatal = dakat
    

    val Number.dkat : Expression
        @JvmName("getdkat_prop")
        get() = this.toDouble() * 10.0.pow(-1) * ((mol * (s `^` -1)))

    val Number.decikatal : Expression
        get() = this.toDouble() * 10.0.pow(-1) * ((mol * (s `^` -1)))


    @JvmField()         
    val dkat = 10.0.pow(-1) * ((mol * (s `^` -1)))
    val decikatal = dkat
    

    val Number.ckat : Expression
        @JvmName("getckat_prop")
        get() = this.toDouble() * 10.0.pow(-2) * ((mol * (s `^` -1)))

    val Number.centikatal : Expression
        get() = this.toDouble() * 10.0.pow(-2) * ((mol * (s `^` -1)))


    @JvmField()         
    val ckat = 10.0.pow(-2) * ((mol * (s `^` -1)))
    val centikatal = ckat
    

    val Number.mkat : Expression
        @JvmName("getmkat_prop")
        get() = this.toDouble() * 10.0.pow(-3) * ((mol * (s `^` -1)))

    val Number.millikatal : Expression
        get() = this.toDouble() * 10.0.pow(-3) * ((mol * (s `^` -1)))


    @JvmField()         
    val mkat = 10.0.pow(-3) * ((mol * (s `^` -1)))
    val millikatal = mkat
    

    val Number.μkat : Expression
        @JvmName("getμkat_prop")
        get() = this.toDouble() * 10.0.pow(-6) * ((mol * (s `^` -1)))

    val Number.microkatal : Expression
        get() = this.toDouble() * 10.0.pow(-6) * ((mol * (s `^` -1)))


    @JvmField()         
    val μkat = 10.0.pow(-6) * ((mol * (s `^` -1)))
    val microkatal = μkat
    

    val Number.nkat : Expression
        @JvmName("getnkat_prop")
        get() = this.toDouble() * 10.0.pow(-9) * ((mol * (s `^` -1)))

    val Number.nanokatal : Expression
        get() = this.toDouble() * 10.0.pow(-9) * ((mol * (s `^` -1)))


    @JvmField()         
    val nkat = 10.0.pow(-9) * ((mol * (s `^` -1)))
    val nanokatal = nkat
    

    val Number.pkat : Expression
        @JvmName("getpkat_prop")
        get() = this.toDouble() * 10.0.pow(-12) * ((mol * (s `^` -1)))

    val Number.picokatal : Expression
        get() = this.toDouble() * 10.0.pow(-12) * ((mol * (s `^` -1)))


    @JvmField()         
    val pkat = 10.0.pow(-12) * ((mol * (s `^` -1)))
    val picokatal = pkat
    

    val Number.fkat : Expression
        @JvmName("getfkat_prop")
        get() = this.toDouble() * 10.0.pow(-15) * ((mol * (s `^` -1)))

    val Number.femtokatal : Expression
        get() = this.toDouble() * 10.0.pow(-15) * ((mol * (s `^` -1)))


    @JvmField()         
    val fkat = 10.0.pow(-15) * ((mol * (s `^` -1)))
    val femtokatal = fkat
    

    val Number.akat : Expression
        @JvmName("getakat_prop")
        get() = this.toDouble() * 10.0.pow(-18) * ((mol * (s `^` -1)))

    val Number.attokatal : Expression
        get() = this.toDouble() * 10.0.pow(-18) * ((mol * (s `^` -1)))


    @JvmField()         
    val akat = 10.0.pow(-18) * ((mol * (s `^` -1)))
    val attokatal = akat
    

    val Number.zkat : Expression
        @JvmName("getzkat_prop")
        get() = this.toDouble() * 10.0.pow(-21) * ((mol * (s `^` -1)))

    val Number.zeptokatal : Expression
        get() = this.toDouble() * 10.0.pow(-21) * ((mol * (s `^` -1)))


    @JvmField()         
    val zkat = 10.0.pow(-21) * ((mol * (s `^` -1)))
    val zeptokatal = zkat
    

    val Number.ykat : Expression
        @JvmName("getykat_prop")
        get() = this.toDouble() * 10.0.pow(-24) * ((mol * (s `^` -1)))

    val Number.yoctokatal : Expression
        get() = this.toDouble() * 10.0.pow(-24) * ((mol * (s `^` -1)))


    @JvmField()         
    val ykat = 10.0.pow(-24) * ((mol * (s `^` -1)))
    val yoctokatal = ykat
    