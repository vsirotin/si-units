
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    //Unit of frequency
    val Hz = 1/s

    val Number.Hz : Expression
        get() = this.toDouble() * (1/s)

    
    val Number.YHz : Expression
        @JvmName("getYHz_prop")
        get() = this.toDouble() * 10.0.pow(24) * (1/s)

    val Number.yottahertz : Expression
        get() = this.toDouble() * 10.0.pow(24) * (1/s)


    @JvmField()         
    val YHz = 10.0.pow(24) * (1/s)
    val yottahertz = YHz
    

    val Number.ZHz : Expression
        @JvmName("getZHz_prop")
        get() = this.toDouble() * 10.0.pow(21) * (1/s)

    val Number.zettahertz : Expression
        get() = this.toDouble() * 10.0.pow(21) * (1/s)


    @JvmField()         
    val ZHz = 10.0.pow(21) * (1/s)
    val zettahertz = ZHz
    

    val Number.EHz : Expression
        @JvmName("getEHz_prop")
        get() = this.toDouble() * 10.0.pow(18) * (1/s)

    val Number.exahertz : Expression
        get() = this.toDouble() * 10.0.pow(18) * (1/s)


    @JvmField()         
    val EHz = 10.0.pow(18) * (1/s)
    val exahertz = EHz
    

    val Number.PHz : Expression
        @JvmName("getPHz_prop")
        get() = this.toDouble() * 10.0.pow(15) * (1/s)

    val Number.petahertz : Expression
        get() = this.toDouble() * 10.0.pow(15) * (1/s)


    @JvmField()         
    val PHz = 10.0.pow(15) * (1/s)
    val petahertz = PHz
    

    val Number.THz : Expression
        @JvmName("getTHz_prop")
        get() = this.toDouble() * 10.0.pow(12) * (1/s)

    val Number.terahertz : Expression
        get() = this.toDouble() * 10.0.pow(12) * (1/s)


    @JvmField()         
    val THz = 10.0.pow(12) * (1/s)
    val terahertz = THz
    

    val Number.GHz : Expression
        @JvmName("getGHz_prop")
        get() = this.toDouble() * 10.0.pow(9) * (1/s)

    val Number.gigahertz : Expression
        get() = this.toDouble() * 10.0.pow(9) * (1/s)


    @JvmField()         
    val GHz = 10.0.pow(9) * (1/s)
    val gigahertz = GHz
    

    val Number.MHz : Expression
        @JvmName("getMHz_prop")
        get() = this.toDouble() * 10.0.pow(6) * (1/s)

    val Number.megahertz : Expression
        get() = this.toDouble() * 10.0.pow(6) * (1/s)


    @JvmField()         
    val MHz = 10.0.pow(6) * (1/s)
    val megahertz = MHz
    

    val Number.kHz : Expression
        @JvmName("getkHz_prop")
        get() = this.toDouble() * 10.0.pow(3) * (1/s)

    val Number.kilohertz : Expression
        get() = this.toDouble() * 10.0.pow(3) * (1/s)


    @JvmField()         
    val kHz = 10.0.pow(3) * (1/s)
    val kilohertz = kHz
    

    val Number.hHz : Expression
        @JvmName("gethHz_prop")
        get() = this.toDouble() * 10.0.pow(2) * (1/s)

    val Number.hectohertz : Expression
        get() = this.toDouble() * 10.0.pow(2) * (1/s)


    @JvmField()         
    val hHz = 10.0.pow(2) * (1/s)
    val hectohertz = hHz
    

    val Number.daHz : Expression
        @JvmName("getdaHz_prop")
        get() = this.toDouble() * 10.0.pow(1) * (1/s)

    val Number.decahertz : Expression
        get() = this.toDouble() * 10.0.pow(1) * (1/s)


    @JvmField()         
    val daHz = 10.0.pow(1) * (1/s)
    val decahertz = daHz
    

    val Number.dHz : Expression
        @JvmName("getdHz_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (1/s)

    val Number.decihertz : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (1/s)


    @JvmField()         
    val dHz = 10.0.pow(-1) * (1/s)
    val decihertz = dHz
    

    val Number.cHz : Expression
        @JvmName("getcHz_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (1/s)

    val Number.centihertz : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (1/s)


    @JvmField()         
    val cHz = 10.0.pow(-2) * (1/s)
    val centihertz = cHz
    

    val Number.mHz : Expression
        @JvmName("getmHz_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (1/s)

    val Number.millihertz : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (1/s)


    @JvmField()         
    val mHz = 10.0.pow(-3) * (1/s)
    val millihertz = mHz
    

    val Number.μHz : Expression
        @JvmName("getμHz_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (1/s)

    val Number.microhertz : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (1/s)


    @JvmField()         
    val μHz = 10.0.pow(-6) * (1/s)
    val microhertz = μHz
    

    val Number.nHz : Expression
        @JvmName("getnHz_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (1/s)

    val Number.nanohertz : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (1/s)


    @JvmField()         
    val nHz = 10.0.pow(-9) * (1/s)
    val nanohertz = nHz
    

    val Number.pHz : Expression
        @JvmName("getpHz_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (1/s)

    val Number.picohertz : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (1/s)


    @JvmField()         
    val pHz = 10.0.pow(-12) * (1/s)
    val picohertz = pHz
    

    val Number.fHz : Expression
        @JvmName("getfHz_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (1/s)

    val Number.femtohertz : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (1/s)


    @JvmField()         
    val fHz = 10.0.pow(-15) * (1/s)
    val femtohertz = fHz
    

    val Number.aHz : Expression
        @JvmName("getaHz_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (1/s)

    val Number.attohertz : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (1/s)


    @JvmField()         
    val aHz = 10.0.pow(-18) * (1/s)
    val attohertz = aHz
    

    val Number.zHz : Expression
        @JvmName("getzHz_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (1/s)

    val Number.zeptohertz : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (1/s)


    @JvmField()         
    val zHz = 10.0.pow(-21) * (1/s)
    val zeptohertz = zHz
    

    val Number.yHz : Expression
        @JvmName("getyHz_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (1/s)

    val Number.yoctohertz : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (1/s)


    @JvmField()         
    val yHz = 10.0.pow(-24) * (1/s)
    val yoctohertz = yHz
    