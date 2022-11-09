
package eu.sirotin.siunits.base

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification
import kotlin.math.pow
private val descriptionKelvin = UnitSpecification(
    "K",
    "Θ",
    60
) { v: Double -> Kelvin(v) }

class Kelvin(value: Double) : TermUnit(value, description = descriptionKelvin)
    val Number.K : Kelvin
        get() = Kelvin(this.toDouble())
    
    val K = Kelvin(1.0)       
    
    val Number.YK : Kelvin
        @JvmName("getYK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(24))
    
    val Number.yottakelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(24))
    
    val Kelvin.YK  : Double
        @JvmName("getYK_prop")
        get() = this.value / 10.0.pow(24)
    
    val Kelvin.yottakelvin  : Double
        get() = this.value / 10.0.pow(24)
    
    @JvmField()         
    val YK = Kelvin(10.0.pow(24))
    val yottakelvin = YK          

    val Number.ZK : Kelvin
        @JvmName("getZK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(21))
    
    val Number.zettakelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(21))
    
    val Kelvin.ZK  : Double
        @JvmName("getZK_prop")
        get() = this.value / 10.0.pow(21)
    
    val Kelvin.zettakelvin  : Double
        get() = this.value / 10.0.pow(21)
    
    @JvmField()         
    val ZK = Kelvin(10.0.pow(21))
    val zettakelvin = ZK          

    val Number.EK : Kelvin
        @JvmName("getEK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(18))
    
    val Number.exakelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(18))
    
    val Kelvin.EK  : Double
        @JvmName("getEK_prop")
        get() = this.value / 10.0.pow(18)
    
    val Kelvin.exakelvin  : Double
        get() = this.value / 10.0.pow(18)
    
    @JvmField()         
    val EK = Kelvin(10.0.pow(18))
    val exakelvin = EK          

    val Number.PK : Kelvin
        @JvmName("getPK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(15))
    
    val Number.petakelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(15))
    
    val Kelvin.PK  : Double
        @JvmName("getPK_prop")
        get() = this.value / 10.0.pow(15)
    
    val Kelvin.petakelvin  : Double
        get() = this.value / 10.0.pow(15)
    
    @JvmField()         
    val PK = Kelvin(10.0.pow(15))
    val petakelvin = PK          

    val Number.TK : Kelvin
        @JvmName("getTK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(12))
    
    val Number.terakelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(12))
    
    val Kelvin.TK  : Double
        @JvmName("getTK_prop")
        get() = this.value / 10.0.pow(12)
    
    val Kelvin.terakelvin  : Double
        get() = this.value / 10.0.pow(12)
    
    @JvmField()         
    val TK = Kelvin(10.0.pow(12))
    val terakelvin = TK          

    val Number.GK : Kelvin
        @JvmName("getGK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(9))
    
    val Number.gigakelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(9))
    
    val Kelvin.GK  : Double
        @JvmName("getGK_prop")
        get() = this.value / 10.0.pow(9)
    
    val Kelvin.gigakelvin  : Double
        get() = this.value / 10.0.pow(9)
    
    @JvmField()         
    val GK = Kelvin(10.0.pow(9))
    val gigakelvin = GK          

    val Number.MK : Kelvin
        @JvmName("getMK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(6))
    
    val Number.megakelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(6))
    
    val Kelvin.MK  : Double
        @JvmName("getMK_prop")
        get() = this.value / 10.0.pow(6)
    
    val Kelvin.megakelvin  : Double
        get() = this.value / 10.0.pow(6)
    
    @JvmField()         
    val MK = Kelvin(10.0.pow(6))
    val megakelvin = MK          

    val Number.kK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(3))
    
    val Number.kilokelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(3))
    
    val Kelvin.kK  : Double
        get() = this.value / 10.0.pow(3)
    
    val Kelvin.kilokelvin  : Double
        get() = this.value / 10.0.pow(3)
    
    @JvmField()         
    val kK = Kelvin(10.0.pow(3))
    val kilokelvin = kK          

    val Number.hK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(2))
    
    val Number.hectokelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(2))
    
    val Kelvin.hK  : Double
        get() = this.value / 10.0.pow(2)
    
    val Kelvin.hectokelvin  : Double
        get() = this.value / 10.0.pow(2)
    
    @JvmField()         
    val hK = Kelvin(10.0.pow(2))
    val hectokelvin = hK          

    val Number.daK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(1))
    
    val Number.decakelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(1))
    
    val Kelvin.daK  : Double
        get() = this.value / 10.0.pow(1)
    
    val Kelvin.decakelvin  : Double
        get() = this.value / 10.0.pow(1)
    
    @JvmField()         
    val daK = Kelvin(10.0.pow(1))
    val decakelvin = daK          

    val Number.dK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-1))
    
    val Number.decikelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-1))
    
    val Kelvin.dK  : Double
        get() = this.value / 10.0.pow(-1)
    
    val Kelvin.decikelvin  : Double
        get() = this.value / 10.0.pow(-1)
    
    @JvmField()         
    val dK = Kelvin(10.0.pow(-1))
    val decikelvin = dK          

    val Number.cK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-2))
    
    val Number.centikelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-2))
    
    val Kelvin.cK  : Double
        get() = this.value / 10.0.pow(-2)
    
    val Kelvin.centikelvin  : Double
        get() = this.value / 10.0.pow(-2)
    
    @JvmField()         
    val cK = Kelvin(10.0.pow(-2))
    val centikelvin = cK          

    val Number.mK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-3))
    
    val Number.millikelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-3))
    
    val Kelvin.mK  : Double
        get() = this.value / 10.0.pow(-3)
    
    val Kelvin.millikelvin  : Double
        get() = this.value / 10.0.pow(-3)
    
    @JvmField()         
    val mK = Kelvin(10.0.pow(-3))
    val millikelvin = mK          

    val Number.μK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-6))
    
    val Number.microkelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-6))
    
    val Kelvin.μK  : Double
        get() = this.value / 10.0.pow(-6)
    
    val Kelvin.microkelvin  : Double
        get() = this.value / 10.0.pow(-6)
    
    @JvmField()         
    val μK = Kelvin(10.0.pow(-6))
    val microkelvin = μK          

    val Number.nK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-9))
    
    val Number.nanokelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-9))
    
    val Kelvin.nK  : Double
        get() = this.value / 10.0.pow(-9)
    
    val Kelvin.nanokelvin  : Double
        get() = this.value / 10.0.pow(-9)
    
    @JvmField()         
    val nK = Kelvin(10.0.pow(-9))
    val nanokelvin = nK          

    val Number.pK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-12))
    
    val Number.picokelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-12))
    
    val Kelvin.pK  : Double
        get() = this.value / 10.0.pow(-12)
    
    val Kelvin.picokelvin  : Double
        get() = this.value / 10.0.pow(-12)
    
    @JvmField()         
    val pK = Kelvin(10.0.pow(-12))
    val picokelvin = pK          

    val Number.fK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-15))
    
    val Number.femtokelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-15))
    
    val Kelvin.fK  : Double
        get() = this.value / 10.0.pow(-15)
    
    val Kelvin.femtokelvin  : Double
        get() = this.value / 10.0.pow(-15)
    
    @JvmField()         
    val fK = Kelvin(10.0.pow(-15))
    val femtokelvin = fK          

    val Number.aK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-18))
    
    val Number.attokelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-18))
    
    val Kelvin.aK  : Double
        get() = this.value / 10.0.pow(-18)
    
    val Kelvin.attokelvin  : Double
        get() = this.value / 10.0.pow(-18)
    
    @JvmField()         
    val aK = Kelvin(10.0.pow(-18))
    val attokelvin = aK          

    val Number.zK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-21))
    
    val Number.zeptokelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-21))
    
    val Kelvin.zK  : Double
        get() = this.value / 10.0.pow(-21)
    
    val Kelvin.zeptokelvin  : Double
        get() = this.value / 10.0.pow(-21)
    
    @JvmField()         
    val zK = Kelvin(10.0.pow(-21))
    val zeptokelvin = zK          

    val Number.yK : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-24))
    
    val Number.yoctokelvin : Kelvin
        get() = Kelvin(this.toDouble()*10.0.pow(-24))
    
    val Kelvin.yK  : Double
        get() = this.value / 10.0.pow(-24)
    
    val Kelvin.yoctokelvin  : Double
        get() = this.value / 10.0.pow(-24)
    
    @JvmField()         
    val yK = Kelvin(10.0.pow(-24))
    val yoctokelvin = yK          