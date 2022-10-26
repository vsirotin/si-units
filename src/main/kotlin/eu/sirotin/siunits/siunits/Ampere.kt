package eu.sirotin.siunits.siunits

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import kotlin.math.pow
private val descriptionAmpere = DimensionSpecification(
    "A",
    "I",
    "electric current",
    70
) { v: Double -> Ampere(v) }


class Ampere(value: Double) : TermUnit(value, description = descriptionAmpere)
val Number.A : Ampere
    get() = Ampere(this.toDouble())
    
val A = Ampere(1.0)   

val Number.YA : Ampere
    @JvmName("getYA_prop")
  get() = Ampere(10.0.pow(24))

val Number.yottaampere : Ampere
    get() = Ampere(10.0.pow(24))
    
val Ampere.YA  : Double
    @JvmName("getYA_prop")
  get() = this.value / 10.0.pow(24)
    
 val Ampere.yottaampere  : Double
    get() = this.value / 10.0.pow(24) 



val Number.ZA : Ampere
    @JvmName("getZA_prop")
  get() = Ampere(10.0.pow(21))

val Number.zettaampere : Ampere
    get() = Ampere(10.0.pow(21))
    
val Ampere.ZA  : Double
    @JvmName("getZA_prop")
  get() = this.value / 10.0.pow(21)
    
 val Ampere.zettaampere  : Double
    get() = this.value / 10.0.pow(21) 



val Number.EA : Ampere
    @JvmName("getEA_prop")
  get() = Ampere(10.0.pow(18))

val Number.exaampere : Ampere
    get() = Ampere(10.0.pow(18))
    
val Ampere.EA  : Double
    @JvmName("getEA_prop")
  get() = this.value / 10.0.pow(18)
    
 val Ampere.exaampere  : Double
    get() = this.value / 10.0.pow(18) 



val Number.PA : Ampere
    @JvmName("getPA_prop")
  get() = Ampere(10.0.pow(15))

val Number.petaampere : Ampere
    get() = Ampere(10.0.pow(15))
    
val Ampere.PA  : Double
    @JvmName("getPA_prop")
  get() = this.value / 10.0.pow(15)
    
 val Ampere.petaampere  : Double
    get() = this.value / 10.0.pow(15) 



val Number.TA : Ampere
    @JvmName("getTA_prop")
  get() = Ampere(10.0.pow(12))

val Number.teraampere : Ampere
    get() = Ampere(10.0.pow(12))
    
val Ampere.TA  : Double
    @JvmName("getTA_prop")
  get() = this.value / 10.0.pow(12)
    
 val Ampere.teraampere  : Double
    get() = this.value / 10.0.pow(12) 



val Number.GA : Ampere
    @JvmName("getGA_prop")
  get() = Ampere(10.0.pow(9))

val Number.gigaampere : Ampere
    get() = Ampere(10.0.pow(9))
    
val Ampere.GA  : Double
    @JvmName("getGA_prop")
  get() = this.value / 10.0.pow(9)
    
 val Ampere.gigaampere  : Double
    get() = this.value / 10.0.pow(9) 



val Number.MA : Ampere
    @JvmName("getMA_prop")
  get() = Ampere(10.0.pow(6))

val Number.megaampere : Ampere
    get() = Ampere(10.0.pow(6))
    
val Ampere.MA  : Double
    @JvmName("getMA_prop")
  get() = this.value / 10.0.pow(6)
    
 val Ampere.megaampere  : Double
    get() = this.value / 10.0.pow(6) 



val Number.kA : Ampere
    get() = Ampere(10.0.pow(3))

val Number.kiloampere : Ampere
    get() = Ampere(10.0.pow(3))
    
val Ampere.kA  : Double
    get() = this.value / 10.0.pow(3)
    
 val Ampere.kiloampere  : Double
    get() = this.value / 10.0.pow(3) 



val Number.hA : Ampere
    get() = Ampere(10.0.pow(2))

val Number.hectoampere : Ampere
    get() = Ampere(10.0.pow(2))
    
val Ampere.hA  : Double
    get() = this.value / 10.0.pow(2)
    
 val Ampere.hectoampere  : Double
    get() = this.value / 10.0.pow(2) 



val Number.daA : Ampere
    get() = Ampere(10.0.pow(1))

val Number.decaampere : Ampere
    get() = Ampere(10.0.pow(1))
    
val Ampere.daA  : Double
    get() = this.value / 10.0.pow(1)
    
 val Ampere.decaampere  : Double
    get() = this.value / 10.0.pow(1) 



val Number.dA : Ampere
    get() = Ampere(10.0.pow(-1))

val Number.deciampere : Ampere
    get() = Ampere(10.0.pow(-1))
    
val Ampere.dA  : Double
    get() = this.value / 10.0.pow(-1)
    
 val Ampere.deciampere  : Double
    get() = this.value / 10.0.pow(-1) 



val Number.cA : Ampere
    get() = Ampere(10.0.pow(-2))

val Number.centiampere : Ampere
    get() = Ampere(10.0.pow(-2))
    
val Ampere.cA  : Double
    get() = this.value / 10.0.pow(-2)
    
 val Ampere.centiampere  : Double
    get() = this.value / 10.0.pow(-2) 



val Number.mA : Ampere
    get() = Ampere(10.0.pow(-3))

val Number.milliampere : Ampere
    get() = Ampere(10.0.pow(-3))
    
val Ampere.mA  : Double
    get() = this.value / 10.0.pow(-3)
    
 val Ampere.milliampere  : Double
    get() = this.value / 10.0.pow(-3) 



val Number.μA : Ampere
    get() = Ampere(10.0.pow(-6))

val Number.microampere : Ampere
    get() = Ampere(10.0.pow(-6))
    
val Ampere.μA  : Double
    get() = this.value / 10.0.pow(-6)
    
 val Ampere.microampere  : Double
    get() = this.value / 10.0.pow(-6) 



val Number.nA : Ampere
    get() = Ampere(10.0.pow(-9))

val Number.nanoampere : Ampere
    get() = Ampere(10.0.pow(-9))
    
val Ampere.nA  : Double
    get() = this.value / 10.0.pow(-9)
    
 val Ampere.nanoampere  : Double
    get() = this.value / 10.0.pow(-9) 



val Number.pA : Ampere
    get() = Ampere(10.0.pow(-12))

val Number.picoampere : Ampere
    get() = Ampere(10.0.pow(-12))
    
val Ampere.pA  : Double
    get() = this.value / 10.0.pow(-12)
    
 val Ampere.picoampere  : Double
    get() = this.value / 10.0.pow(-12) 



val Number.fA : Ampere
    get() = Ampere(10.0.pow(-15))

val Number.femtoampere : Ampere
    get() = Ampere(10.0.pow(-15))
    
val Ampere.fA  : Double
    get() = this.value / 10.0.pow(-15)
    
 val Ampere.femtoampere  : Double
    get() = this.value / 10.0.pow(-15) 



val Number.aA : Ampere
    get() = Ampere(10.0.pow(-18))

val Number.attoampere : Ampere
    get() = Ampere(10.0.pow(-18))
    
val Ampere.aA  : Double
    get() = this.value / 10.0.pow(-18)
    
 val Ampere.attoampere  : Double
    get() = this.value / 10.0.pow(-18) 



val Number.zA : Ampere
    get() = Ampere(10.0.pow(-21))

val Number.zeptoampere : Ampere
    get() = Ampere(10.0.pow(-21))
    
val Ampere.zA  : Double
    get() = this.value / 10.0.pow(-21)
    
 val Ampere.zeptoampere  : Double
    get() = this.value / 10.0.pow(-21) 



val Number.yA : Ampere
    get() = Ampere(10.0.pow(-24))

val Number.yoctoampere : Ampere
    get() = Ampere(10.0.pow(-24))
    
val Ampere.yA  : Double
    get() = this.value / 10.0.pow(-24)
    
 val Ampere.yoctoampere  : Double
    get() = this.value / 10.0.pow(-24) 


