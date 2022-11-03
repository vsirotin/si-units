
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    val Wb = kg*(m2) * (s `^` -2) * (A `^` -1)

    val Number.Wb : Expression
        get() = this.toDouble() * (kg*(m2) * (s `^` -2) * (A `^` -1))

    
    val Number.YWb : Expression
        @JvmName("getYWb_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.yottaweber : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val YWb = 10.0.pow(24) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val yottaweber = YWb
    

    val Number.ZWb : Expression
        @JvmName("getZWb_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.zettaweber : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val ZWb = 10.0.pow(21) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val zettaweber = ZWb
    

    val Number.EWb : Expression
        @JvmName("getEWb_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.exaweber : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val EWb = 10.0.pow(18) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val exaweber = EWb
    

    val Number.PWb : Expression
        @JvmName("getPWb_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.petaweber : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val PWb = 10.0.pow(15) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val petaweber = PWb
    

    val Number.TWb : Expression
        @JvmName("getTWb_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.teraweber : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val TWb = 10.0.pow(12) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val teraweber = TWb
    

    val Number.GWb : Expression
        @JvmName("getGWb_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.gigaweber : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val GWb = 10.0.pow(9) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val gigaweber = GWb
    

    val Number.MWb : Expression
        @JvmName("getMWb_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.megaweber : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val MWb = 10.0.pow(6) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val megaweber = MWb
    

    val Number.kWb : Expression
        @JvmName("getkWb_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.kiloweber : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val kWb = 10.0.pow(3) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val kiloweber = kWb
    

    val Number.hWb : Expression
        @JvmName("gethWb_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.hectoweber : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val hWb = 10.0.pow(2) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val hectoweber = hWb
    

    val Number.daWb : Expression
        @JvmName("getdaWb_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.decaweber : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val daWb = 10.0.pow(1) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val decaweber = daWb
    

    val Number.dWb : Expression
        @JvmName("getdWb_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.deciweber : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val dWb = 10.0.pow(-1) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val deciweber = dWb
    

    val Number.cWb : Expression
        @JvmName("getcWb_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.centiweber : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val cWb = 10.0.pow(-2) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val centiweber = cWb
    

    val Number.mWb : Expression
        @JvmName("getmWb_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.milliweber : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val mWb = 10.0.pow(-3) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val milliweber = mWb
    

    val Number.μWb : Expression
        @JvmName("getμWb_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.microweber : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val μWb = 10.0.pow(-6) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val microweber = μWb
    

    val Number.nWb : Expression
        @JvmName("getnWb_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.nanoweber : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val nWb = 10.0.pow(-9) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val nanoweber = nWb
    

    val Number.pWb : Expression
        @JvmName("getpWb_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.picoweber : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val pWb = 10.0.pow(-12) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val picoweber = pWb
    

    val Number.fWb : Expression
        @JvmName("getfWb_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.femtoweber : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val fWb = 10.0.pow(-15) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val femtoweber = fWb
    

    val Number.aWb : Expression
        @JvmName("getaWb_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.attoweber : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val aWb = 10.0.pow(-18) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val attoweber = aWb
    

    val Number.zWb : Expression
        @JvmName("getzWb_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.zeptoweber : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val zWb = 10.0.pow(-21) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val zeptoweber = zWb
    

    val Number.yWb : Expression
        @JvmName("getyWb_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg*(m2) * (s `^` -2) * (A `^` -1))

    val Number.yoctoweber : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg*(m2) * (s `^` -2) * (A `^` -1))


    @JvmField()         
    val yWb = 10.0.pow(-24) * (kg*(m2) * (s `^` -2) * (A `^` -1))
    val yoctoweber = yWb
    