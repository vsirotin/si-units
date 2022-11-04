
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val rad = m/m

    val Number.rad : Expression
        get() = this.toDouble() * (m/m)

    
    val Number.Yrad : Expression
        @JvmName("getYrad_prop")
        get() = this.toDouble() * 10.0.pow(24) * (m/m)

    val Number.yottaradian : Expression
        get() = this.toDouble() * 10.0.pow(24) * (m/m)


    @JvmField()         
    val Yrad = 10.0.pow(24) * (m/m)
    val yottaradian = Yrad
    

    val Number.Zrad : Expression
        @JvmName("getZrad_prop")
        get() = this.toDouble() * 10.0.pow(21) * (m/m)

    val Number.zettaradian : Expression
        get() = this.toDouble() * 10.0.pow(21) * (m/m)


    @JvmField()         
    val Zrad = 10.0.pow(21) * (m/m)
    val zettaradian = Zrad
    

    val Number.Erad : Expression
        @JvmName("getErad_prop")
        get() = this.toDouble() * 10.0.pow(18) * (m/m)

    val Number.exaradian : Expression
        get() = this.toDouble() * 10.0.pow(18) * (m/m)


    @JvmField()         
    val Erad = 10.0.pow(18) * (m/m)
    val exaradian = Erad
    

    val Number.Prad : Expression
        @JvmName("getPrad_prop")
        get() = this.toDouble() * 10.0.pow(15) * (m/m)

    val Number.petaradian : Expression
        get() = this.toDouble() * 10.0.pow(15) * (m/m)


    @JvmField()         
    val Prad = 10.0.pow(15) * (m/m)
    val petaradian = Prad
    

    val Number.Trad : Expression
        @JvmName("getTrad_prop")
        get() = this.toDouble() * 10.0.pow(12) * (m/m)

    val Number.teraradian : Expression
        get() = this.toDouble() * 10.0.pow(12) * (m/m)


    @JvmField()         
    val Trad = 10.0.pow(12) * (m/m)
    val teraradian = Trad
    

    val Number.Grad : Expression
        @JvmName("getGrad_prop")
        get() = this.toDouble() * 10.0.pow(9) * (m/m)

    val Number.gigaradian : Expression
        get() = this.toDouble() * 10.0.pow(9) * (m/m)


    @JvmField()         
    val Grad = 10.0.pow(9) * (m/m)
    val gigaradian = Grad
    

    val Number.Mrad : Expression
        @JvmName("getMrad_prop")
        get() = this.toDouble() * 10.0.pow(6) * (m/m)

    val Number.megaradian : Expression
        get() = this.toDouble() * 10.0.pow(6) * (m/m)


    @JvmField()         
    val Mrad = 10.0.pow(6) * (m/m)
    val megaradian = Mrad
    

    val Number.krad : Expression
        @JvmName("getkrad_prop")
        get() = this.toDouble() * 10.0.pow(3) * (m/m)

    val Number.kiloradian : Expression
        get() = this.toDouble() * 10.0.pow(3) * (m/m)


    @JvmField()         
    val krad = 10.0.pow(3) * (m/m)
    val kiloradian = krad
    

    val Number.hrad : Expression
        @JvmName("gethrad_prop")
        get() = this.toDouble() * 10.0.pow(2) * (m/m)

    val Number.hectoradian : Expression
        get() = this.toDouble() * 10.0.pow(2) * (m/m)


    @JvmField()         
    val hrad = 10.0.pow(2) * (m/m)
    val hectoradian = hrad
    

    val Number.darad : Expression
        @JvmName("getdarad_prop")
        get() = this.toDouble() * 10.0.pow(1) * (m/m)

    val Number.decaradian : Expression
        get() = this.toDouble() * 10.0.pow(1) * (m/m)


    @JvmField()         
    val darad = 10.0.pow(1) * (m/m)
    val decaradian = darad
    

    val Number.drad : Expression
        @JvmName("getdrad_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (m/m)

    val Number.deciradian : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (m/m)


    @JvmField()         
    val drad = 10.0.pow(-1) * (m/m)
    val deciradian = drad
    

    val Number.crad : Expression
        @JvmName("getcrad_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (m/m)

    val Number.centiradian : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (m/m)


    @JvmField()         
    val crad = 10.0.pow(-2) * (m/m)
    val centiradian = crad
    

    val Number.mrad : Expression
        @JvmName("getmrad_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (m/m)

    val Number.milliradian : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (m/m)


    @JvmField()         
    val mrad = 10.0.pow(-3) * (m/m)
    val milliradian = mrad
    

    val Number.μrad : Expression
        @JvmName("getμrad_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (m/m)

    val Number.microradian : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (m/m)


    @JvmField()         
    val μrad = 10.0.pow(-6) * (m/m)
    val microradian = μrad
    

    val Number.nrad : Expression
        @JvmName("getnrad_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (m/m)

    val Number.nanoradian : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (m/m)


    @JvmField()         
    val nrad = 10.0.pow(-9) * (m/m)
    val nanoradian = nrad
    

    val Number.prad : Expression
        @JvmName("getprad_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (m/m)

    val Number.picoradian : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (m/m)


    @JvmField()         
    val prad = 10.0.pow(-12) * (m/m)
    val picoradian = prad
    

    val Number.frad : Expression
        @JvmName("getfrad_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (m/m)

    val Number.femtoradian : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (m/m)


    @JvmField()         
    val frad = 10.0.pow(-15) * (m/m)
    val femtoradian = frad
    

    val Number.arad : Expression
        @JvmName("getarad_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (m/m)

    val Number.attoradian : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (m/m)


    @JvmField()         
    val arad = 10.0.pow(-18) * (m/m)
    val attoradian = arad
    

    val Number.zrad : Expression
        @JvmName("getzrad_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (m/m)

    val Number.zeptoradian : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (m/m)


    @JvmField()         
    val zrad = 10.0.pow(-21) * (m/m)
    val zeptoradian = zrad
    

    val Number.yrad : Expression
        @JvmName("getyrad_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (m/m)

    val Number.yoctoradian : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (m/m)


    @JvmField()         
    val yrad = 10.0.pow(-24) * (m/m)
    val yoctoradian = yrad
    