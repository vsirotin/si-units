package eu.sirotin.siunits.siunits

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import kotlin.math.pow
private val descriptionKelvin = DimensionSpecification(
    "K",
    "Θ",
    "thermodynamic temperature",
    60
) { v: Double -> Kelvin(v) }


class Kelvin(value: Double) : TermUnit(value, description = descriptionKelvin)
val Number.K : Kelvin
    get() = Kelvin(this.toDouble())
    
val K = Kelvin(1.0)   

val Number.YK : Kelvin
    @JvmName("getYK_prop")
  get() = Kelvin(10.0.pow(24))

val Number.yottakelvin : Kelvin
    get() = Kelvin(10.0.pow(24))
    
val Kelvin.YK  : Double
    @JvmName("getYK_prop")
  get() = this.value / 10.0.pow(24)
    
 val Kelvin.yottakelvin  : Double
    get() = this.value / 10.0.pow(24) 



val Number.ZK : Kelvin
    @JvmName("getZK_prop")
  get() = Kelvin(10.0.pow(21))

val Number.zettakelvin : Kelvin
    get() = Kelvin(10.0.pow(21))
    
val Kelvin.ZK  : Double
    @JvmName("getZK_prop")
  get() = this.value / 10.0.pow(21)
    
 val Kelvin.zettakelvin  : Double
    get() = this.value / 10.0.pow(21) 



val Number.EK : Kelvin
    @JvmName("getEK_prop")
  get() = Kelvin(10.0.pow(18))

val Number.exakelvin : Kelvin
    get() = Kelvin(10.0.pow(18))
    
val Kelvin.EK  : Double
    @JvmName("getEK_prop")
  get() = this.value / 10.0.pow(18)
    
 val Kelvin.exakelvin  : Double
    get() = this.value / 10.0.pow(18) 



val Number.PK : Kelvin
    @JvmName("getPK_prop")
  get() = Kelvin(10.0.pow(15))

val Number.petakelvin : Kelvin
    get() = Kelvin(10.0.pow(15))
    
val Kelvin.PK  : Double
    @JvmName("getPK_prop")
  get() = this.value / 10.0.pow(15)
    
 val Kelvin.petakelvin  : Double
    get() = this.value / 10.0.pow(15) 



val Number.TK : Kelvin
    @JvmName("getTK_prop")
  get() = Kelvin(10.0.pow(12))

val Number.terakelvin : Kelvin
    get() = Kelvin(10.0.pow(12))
    
val Kelvin.TK  : Double
    @JvmName("getTK_prop")
  get() = this.value / 10.0.pow(12)
    
 val Kelvin.terakelvin  : Double
    get() = this.value / 10.0.pow(12) 



val Number.GK : Kelvin
    @JvmName("getGK_prop")
  get() = Kelvin(10.0.pow(9))

val Number.gigakelvin : Kelvin
    get() = Kelvin(10.0.pow(9))
    
val Kelvin.GK  : Double
    @JvmName("getGK_prop")
  get() = this.value / 10.0.pow(9)
    
 val Kelvin.gigakelvin  : Double
    get() = this.value / 10.0.pow(9) 



val Number.MK : Kelvin
    @JvmName("getMK_prop")
  get() = Kelvin(10.0.pow(6))

val Number.megakelvin : Kelvin
    get() = Kelvin(10.0.pow(6))
    
val Kelvin.MK  : Double
    @JvmName("getMK_prop")
  get() = this.value / 10.0.pow(6)
    
 val Kelvin.megakelvin  : Double
    get() = this.value / 10.0.pow(6) 



val Number.kK : Kelvin
    get() = Kelvin(10.0.pow(3))

val Number.kilokelvin : Kelvin
    get() = Kelvin(10.0.pow(3))
    
val Kelvin.kK  : Double
    get() = this.value / 10.0.pow(3)
    
 val Kelvin.kilokelvin  : Double
    get() = this.value / 10.0.pow(3) 



val Number.hK : Kelvin
    get() = Kelvin(10.0.pow(2))

val Number.hectokelvin : Kelvin
    get() = Kelvin(10.0.pow(2))
    
val Kelvin.hK  : Double
    get() = this.value / 10.0.pow(2)
    
 val Kelvin.hectokelvin  : Double
    get() = this.value / 10.0.pow(2) 



val Number.daK : Kelvin
    get() = Kelvin(10.0.pow(1))

val Number.decakelvin : Kelvin
    get() = Kelvin(10.0.pow(1))
    
val Kelvin.daK  : Double
    get() = this.value / 10.0.pow(1)
    
 val Kelvin.decakelvin  : Double
    get() = this.value / 10.0.pow(1) 



val Number.dK : Kelvin
    get() = Kelvin(10.0.pow(-1))

val Number.decikelvin : Kelvin
    get() = Kelvin(10.0.pow(-1))
    
val Kelvin.dK  : Double
    get() = this.value / 10.0.pow(-1)
    
 val Kelvin.decikelvin  : Double
    get() = this.value / 10.0.pow(-1) 



val Number.cK : Kelvin
    get() = Kelvin(10.0.pow(-2))

val Number.centikelvin : Kelvin
    get() = Kelvin(10.0.pow(-2))
    
val Kelvin.cK  : Double
    get() = this.value / 10.0.pow(-2)
    
 val Kelvin.centikelvin  : Double
    get() = this.value / 10.0.pow(-2) 



val Number.mK : Kelvin
    get() = Kelvin(10.0.pow(-3))

val Number.millikelvin : Kelvin
    get() = Kelvin(10.0.pow(-3))
    
val Kelvin.mK  : Double
    get() = this.value / 10.0.pow(-3)
    
 val Kelvin.millikelvin  : Double
    get() = this.value / 10.0.pow(-3) 



val Number.μK : Kelvin
    get() = Kelvin(10.0.pow(-6))

val Number.microkelvin : Kelvin
    get() = Kelvin(10.0.pow(-6))
    
val Kelvin.μK  : Double
    get() = this.value / 10.0.pow(-6)
    
 val Kelvin.microkelvin  : Double
    get() = this.value / 10.0.pow(-6) 



val Number.nK : Kelvin
    get() = Kelvin(10.0.pow(-9))

val Number.nanokelvin : Kelvin
    get() = Kelvin(10.0.pow(-9))
    
val Kelvin.nK  : Double
    get() = this.value / 10.0.pow(-9)
    
 val Kelvin.nanokelvin  : Double
    get() = this.value / 10.0.pow(-9) 



val Number.pK : Kelvin
    get() = Kelvin(10.0.pow(-12))

val Number.picokelvin : Kelvin
    get() = Kelvin(10.0.pow(-12))
    
val Kelvin.pK  : Double
    get() = this.value / 10.0.pow(-12)
    
 val Kelvin.picokelvin  : Double
    get() = this.value / 10.0.pow(-12) 



val Number.fK : Kelvin
    get() = Kelvin(10.0.pow(-15))

val Number.femtokelvin : Kelvin
    get() = Kelvin(10.0.pow(-15))
    
val Kelvin.fK  : Double
    get() = this.value / 10.0.pow(-15)
    
 val Kelvin.femtokelvin  : Double
    get() = this.value / 10.0.pow(-15) 



val Number.aK : Kelvin
    get() = Kelvin(10.0.pow(-18))

val Number.attokelvin : Kelvin
    get() = Kelvin(10.0.pow(-18))
    
val Kelvin.aK  : Double
    get() = this.value / 10.0.pow(-18)
    
 val Kelvin.attokelvin  : Double
    get() = this.value / 10.0.pow(-18) 



val Number.zK : Kelvin
    get() = Kelvin(10.0.pow(-21))

val Number.zeptokelvin : Kelvin
    get() = Kelvin(10.0.pow(-21))
    
val Kelvin.zK  : Double
    get() = this.value / 10.0.pow(-21)
    
 val Kelvin.zeptokelvin  : Double
    get() = this.value / 10.0.pow(-21) 



val Number.yK : Kelvin
    get() = Kelvin(10.0.pow(-24))

val Number.yoctokelvin : Kelvin
    get() = Kelvin(10.0.pow(-24))
    
val Kelvin.yK  : Double
    get() = this.value / 10.0.pow(-24)
    
 val Kelvin.yoctokelvin  : Double
    get() = this.value / 10.0.pow(-24) 


