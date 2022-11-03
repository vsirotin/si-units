
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    //Unit of power, radiant flux
    val W = kg*(m2)/(s `^` 3)

    val Number.W : Expression
        get() = this.toDouble() * (kg*(m2)/(s `^` 3))

    
    val Number.YW : Expression
        @JvmName("getYW_prop")
        get() = this.toDouble() * 10.0.pow(24) * (kg*(m2)/(s `^` 3))

    val Number.yottawatt : Expression
        get() = this.toDouble() * 10.0.pow(24) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val YW = 10.0.pow(24) * (kg*(m2)/(s `^` 3))
    val yottawatt = YW
    

    val Number.ZW : Expression
        @JvmName("getZW_prop")
        get() = this.toDouble() * 10.0.pow(21) * (kg*(m2)/(s `^` 3))

    val Number.zettawatt : Expression
        get() = this.toDouble() * 10.0.pow(21) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val ZW = 10.0.pow(21) * (kg*(m2)/(s `^` 3))
    val zettawatt = ZW
    

    val Number.EW : Expression
        @JvmName("getEW_prop")
        get() = this.toDouble() * 10.0.pow(18) * (kg*(m2)/(s `^` 3))

    val Number.exawatt : Expression
        get() = this.toDouble() * 10.0.pow(18) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val EW = 10.0.pow(18) * (kg*(m2)/(s `^` 3))
    val exawatt = EW
    

    val Number.PW : Expression
        @JvmName("getPW_prop")
        get() = this.toDouble() * 10.0.pow(15) * (kg*(m2)/(s `^` 3))

    val Number.petawatt : Expression
        get() = this.toDouble() * 10.0.pow(15) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val PW = 10.0.pow(15) * (kg*(m2)/(s `^` 3))
    val petawatt = PW
    

    val Number.TW : Expression
        @JvmName("getTW_prop")
        get() = this.toDouble() * 10.0.pow(12) * (kg*(m2)/(s `^` 3))

    val Number.terawatt : Expression
        get() = this.toDouble() * 10.0.pow(12) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val TW = 10.0.pow(12) * (kg*(m2)/(s `^` 3))
    val terawatt = TW
    

    val Number.GW : Expression
        @JvmName("getGW_prop")
        get() = this.toDouble() * 10.0.pow(9) * (kg*(m2)/(s `^` 3))

    val Number.gigawatt : Expression
        get() = this.toDouble() * 10.0.pow(9) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val GW = 10.0.pow(9) * (kg*(m2)/(s `^` 3))
    val gigawatt = GW
    

    val Number.MW : Expression
        @JvmName("getMW_prop")
        get() = this.toDouble() * 10.0.pow(6) * (kg*(m2)/(s `^` 3))

    val Number.megawatt : Expression
        get() = this.toDouble() * 10.0.pow(6) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val MW = 10.0.pow(6) * (kg*(m2)/(s `^` 3))
    val megawatt = MW
    

    val Number.kW : Expression
        @JvmName("getkW_prop")
        get() = this.toDouble() * 10.0.pow(3) * (kg*(m2)/(s `^` 3))

    val Number.kilowatt : Expression
        get() = this.toDouble() * 10.0.pow(3) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val kW = 10.0.pow(3) * (kg*(m2)/(s `^` 3))
    val kilowatt = kW
    

    val Number.hW : Expression
        @JvmName("gethW_prop")
        get() = this.toDouble() * 10.0.pow(2) * (kg*(m2)/(s `^` 3))

    val Number.hectowatt : Expression
        get() = this.toDouble() * 10.0.pow(2) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val hW = 10.0.pow(2) * (kg*(m2)/(s `^` 3))
    val hectowatt = hW
    

    val Number.daW : Expression
        @JvmName("getdaW_prop")
        get() = this.toDouble() * 10.0.pow(1) * (kg*(m2)/(s `^` 3))

    val Number.decawatt : Expression
        get() = this.toDouble() * 10.0.pow(1) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val daW = 10.0.pow(1) * (kg*(m2)/(s `^` 3))
    val decawatt = daW
    

    val Number.dW : Expression
        @JvmName("getdW_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (kg*(m2)/(s `^` 3))

    val Number.deciwatt : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val dW = 10.0.pow(-1) * (kg*(m2)/(s `^` 3))
    val deciwatt = dW
    

    val Number.cW : Expression
        @JvmName("getcW_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (kg*(m2)/(s `^` 3))

    val Number.centiwatt : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val cW = 10.0.pow(-2) * (kg*(m2)/(s `^` 3))
    val centiwatt = cW
    

    val Number.mW : Expression
        @JvmName("getmW_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (kg*(m2)/(s `^` 3))

    val Number.milliwatt : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val mW = 10.0.pow(-3) * (kg*(m2)/(s `^` 3))
    val milliwatt = mW
    

    val Number.μW : Expression
        @JvmName("getμW_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (kg*(m2)/(s `^` 3))

    val Number.microwatt : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val μW = 10.0.pow(-6) * (kg*(m2)/(s `^` 3))
    val microwatt = μW
    

    val Number.nW : Expression
        @JvmName("getnW_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (kg*(m2)/(s `^` 3))

    val Number.nanowatt : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val nW = 10.0.pow(-9) * (kg*(m2)/(s `^` 3))
    val nanowatt = nW
    

    val Number.pW : Expression
        @JvmName("getpW_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (kg*(m2)/(s `^` 3))

    val Number.picowatt : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val pW = 10.0.pow(-12) * (kg*(m2)/(s `^` 3))
    val picowatt = pW
    

    val Number.fW : Expression
        @JvmName("getfW_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (kg*(m2)/(s `^` 3))

    val Number.femtowatt : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val fW = 10.0.pow(-15) * (kg*(m2)/(s `^` 3))
    val femtowatt = fW
    

    val Number.aW : Expression
        @JvmName("getaW_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (kg*(m2)/(s `^` 3))

    val Number.attowatt : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val aW = 10.0.pow(-18) * (kg*(m2)/(s `^` 3))
    val attowatt = aW
    

    val Number.zW : Expression
        @JvmName("getzW_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (kg*(m2)/(s `^` 3))

    val Number.zeptowatt : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val zW = 10.0.pow(-21) * (kg*(m2)/(s `^` 3))
    val zeptowatt = zW
    

    val Number.yW : Expression
        @JvmName("getyW_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (kg*(m2)/(s `^` 3))

    val Number.yoctowatt : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (kg*(m2)/(s `^` 3))


    @JvmField()         
    val yW = 10.0.pow(-24) * (kg*(m2)/(s `^` 3))
    val yoctowatt = yW
    