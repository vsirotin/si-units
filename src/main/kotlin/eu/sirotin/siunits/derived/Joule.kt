
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    val J = kg*(m2)/(s `^` 2)

    val Number.J : Expression
        get() = this.toDouble() * (kg*(m2)/(s `^` 2))

    
    val Number.YJ : Expression
        @JvmName("getYJ_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg*(m2)/(s `^` 2))

    val Number.yottajoule : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val YJ = 10.0.pow(24) * (kg*(m2)/(s `^` 2))
    val yottajoule = YJ
    

    val Number.ZJ : Expression
        @JvmName("getZJ_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg*(m2)/(s `^` 2))

    val Number.zettajoule : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val ZJ = 10.0.pow(21) * (kg*(m2)/(s `^` 2))
    val zettajoule = ZJ
    

    val Number.EJ : Expression
        @JvmName("getEJ_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg*(m2)/(s `^` 2))

    val Number.exajoule : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val EJ = 10.0.pow(18) * (kg*(m2)/(s `^` 2))
    val exajoule = EJ
    

    val Number.PJ : Expression
        @JvmName("getPJ_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg*(m2)/(s `^` 2))

    val Number.petajoule : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val PJ = 10.0.pow(15) * (kg*(m2)/(s `^` 2))
    val petajoule = PJ
    

    val Number.TJ : Expression
        @JvmName("getTJ_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg*(m2)/(s `^` 2))

    val Number.terajoule : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val TJ = 10.0.pow(12) * (kg*(m2)/(s `^` 2))
    val terajoule = TJ
    

    val Number.GJ : Expression
        @JvmName("getGJ_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg*(m2)/(s `^` 2))

    val Number.gigajoule : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val GJ = 10.0.pow(9) * (kg*(m2)/(s `^` 2))
    val gigajoule = GJ
    

    val Number.MJ : Expression
        @JvmName("getMJ_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg*(m2)/(s `^` 2))

    val Number.megajoule : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val MJ = 10.0.pow(6) * (kg*(m2)/(s `^` 2))
    val megajoule = MJ
    

    val Number.kJ : Expression
        @JvmName("getkJ_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg*(m2)/(s `^` 2))

    val Number.kilojoule : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val kJ = 10.0.pow(3) * (kg*(m2)/(s `^` 2))
    val kilojoule = kJ
    

    val Number.hJ : Expression
        @JvmName("gethJ_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg*(m2)/(s `^` 2))

    val Number.hectojoule : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val hJ = 10.0.pow(2) * (kg*(m2)/(s `^` 2))
    val hectojoule = hJ
    

    val Number.daJ : Expression
        @JvmName("getdaJ_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg*(m2)/(s `^` 2))

    val Number.decajoule : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val daJ = 10.0.pow(1) * (kg*(m2)/(s `^` 2))
    val decajoule = daJ
    

    val Number.dJ : Expression
        @JvmName("getdJ_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg*(m2)/(s `^` 2))

    val Number.decijoule : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val dJ = 10.0.pow(-1) * (kg*(m2)/(s `^` 2))
    val decijoule = dJ
    

    val Number.cJ : Expression
        @JvmName("getcJ_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg*(m2)/(s `^` 2))

    val Number.centijoule : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val cJ = 10.0.pow(-2) * (kg*(m2)/(s `^` 2))
    val centijoule = cJ
    

    val Number.mJ : Expression
        @JvmName("getmJ_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg*(m2)/(s `^` 2))

    val Number.millijoule : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val mJ = 10.0.pow(-3) * (kg*(m2)/(s `^` 2))
    val millijoule = mJ
    

    val Number.μJ : Expression
        @JvmName("getμJ_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg*(m2)/(s `^` 2))

    val Number.microjoule : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val μJ = 10.0.pow(-6) * (kg*(m2)/(s `^` 2))
    val microjoule = μJ
    

    val Number.nJ : Expression
        @JvmName("getnJ_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg*(m2)/(s `^` 2))

    val Number.nanojoule : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val nJ = 10.0.pow(-9) * (kg*(m2)/(s `^` 2))
    val nanojoule = nJ
    

    val Number.pJ : Expression
        @JvmName("getpJ_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg*(m2)/(s `^` 2))

    val Number.picojoule : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val pJ = 10.0.pow(-12) * (kg*(m2)/(s `^` 2))
    val picojoule = pJ
    

    val Number.fJ : Expression
        @JvmName("getfJ_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg*(m2)/(s `^` 2))

    val Number.femtojoule : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val fJ = 10.0.pow(-15) * (kg*(m2)/(s `^` 2))
    val femtojoule = fJ
    

    val Number.aJ : Expression
        @JvmName("getaJ_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg*(m2)/(s `^` 2))

    val Number.attojoule : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val aJ = 10.0.pow(-18) * (kg*(m2)/(s `^` 2))
    val attojoule = aJ
    

    val Number.zJ : Expression
        @JvmName("getzJ_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg*(m2)/(s `^` 2))

    val Number.zeptojoule : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val zJ = 10.0.pow(-21) * (kg*(m2)/(s `^` 2))
    val zeptojoule = zJ
    

    val Number.yJ : Expression
        @JvmName("getyJ_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg*(m2)/(s `^` 2))

    val Number.yoctojoule : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg*(m2)/(s `^` 2))


    @JvmField()         
    val yJ = 10.0.pow(-24) * (kg*(m2)/(s `^` 2))
    val yoctojoule = yJ
    