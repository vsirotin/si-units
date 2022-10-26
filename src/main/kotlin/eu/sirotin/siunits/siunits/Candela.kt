package eu.sirotin.siunits.siunits

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import kotlin.math.pow
private val descriptionCandela = DimensionSpecification(
    "cd",
    "J",
    "luminous intensity",
    40
) { v: Double -> Candela(v) }


class Candela(value: Double) : TermUnit(value, description = descriptionCandela)
val Number.cd : Candela
    get() = Candela(this.toDouble())
    
val cd = Candela(1.0)   

val Number.Ycd : Candela
    @JvmName("getYcd_prop")
  get() = Candela(10.0.pow(24))

val Number.yottacandela : Candela
    get() = Candela(10.0.pow(24))
    
val Candela.Ycd  : Double
    @JvmName("getYcd_prop")
  get() = this.value / 10.0.pow(24)
    
 val Candela.yottacandela  : Double
    get() = this.value / 10.0.pow(24) 



val Number.Zcd : Candela
    @JvmName("getZcd_prop")
  get() = Candela(10.0.pow(21))

val Number.zettacandela : Candela
    get() = Candela(10.0.pow(21))
    
val Candela.Zcd  : Double
    @JvmName("getZcd_prop")
  get() = this.value / 10.0.pow(21)
    
 val Candela.zettacandela  : Double
    get() = this.value / 10.0.pow(21) 



val Number.Ecd : Candela
    @JvmName("getEcd_prop")
  get() = Candela(10.0.pow(18))

val Number.exacandela : Candela
    get() = Candela(10.0.pow(18))
    
val Candela.Ecd  : Double
    @JvmName("getEcd_prop")
  get() = this.value / 10.0.pow(18)
    
 val Candela.exacandela  : Double
    get() = this.value / 10.0.pow(18) 



val Number.Pcd : Candela
    @JvmName("getPcd_prop")
  get() = Candela(10.0.pow(15))

val Number.petacandela : Candela
    get() = Candela(10.0.pow(15))
    
val Candela.Pcd  : Double
    @JvmName("getPcd_prop")
  get() = this.value / 10.0.pow(15)
    
 val Candela.petacandela  : Double
    get() = this.value / 10.0.pow(15) 



val Number.Tcd : Candela
    @JvmName("getTcd_prop")
  get() = Candela(10.0.pow(12))

val Number.teracandela : Candela
    get() = Candela(10.0.pow(12))
    
val Candela.Tcd  : Double
    @JvmName("getTcd_prop")
  get() = this.value / 10.0.pow(12)
    
 val Candela.teracandela  : Double
    get() = this.value / 10.0.pow(12) 



val Number.Gcd : Candela
    @JvmName("getGcd_prop")
  get() = Candela(10.0.pow(9))

val Number.gigacandela : Candela
    get() = Candela(10.0.pow(9))
    
val Candela.Gcd  : Double
    @JvmName("getGcd_prop")
  get() = this.value / 10.0.pow(9)
    
 val Candela.gigacandela  : Double
    get() = this.value / 10.0.pow(9) 



val Number.Mcd : Candela
    @JvmName("getMcd_prop")
  get() = Candela(10.0.pow(6))

val Number.megacandela : Candela
    get() = Candela(10.0.pow(6))
    
val Candela.Mcd  : Double
    @JvmName("getMcd_prop")
  get() = this.value / 10.0.pow(6)
    
 val Candela.megacandela  : Double
    get() = this.value / 10.0.pow(6) 



val Number.kcd : Candela
    get() = Candela(10.0.pow(3))

val Number.kilocandela : Candela
    get() = Candela(10.0.pow(3))
    
val Candela.kcd  : Double
    get() = this.value / 10.0.pow(3)
    
 val Candela.kilocandela  : Double
    get() = this.value / 10.0.pow(3) 



val Number.hcd : Candela
    get() = Candela(10.0.pow(2))

val Number.hectocandela : Candela
    get() = Candela(10.0.pow(2))
    
val Candela.hcd  : Double
    get() = this.value / 10.0.pow(2)
    
 val Candela.hectocandela  : Double
    get() = this.value / 10.0.pow(2) 



val Number.dacd : Candela
    get() = Candela(10.0.pow(1))

val Number.decacandela : Candela
    get() = Candela(10.0.pow(1))
    
val Candela.dacd  : Double
    get() = this.value / 10.0.pow(1)
    
 val Candela.decacandela  : Double
    get() = this.value / 10.0.pow(1) 



val Number.dcd : Candela
    get() = Candela(10.0.pow(-1))

val Number.decicandela : Candela
    get() = Candela(10.0.pow(-1))
    
val Candela.dcd  : Double
    get() = this.value / 10.0.pow(-1)
    
 val Candela.decicandela  : Double
    get() = this.value / 10.0.pow(-1) 



val Number.ccd : Candela
    get() = Candela(10.0.pow(-2))

val Number.centicandela : Candela
    get() = Candela(10.0.pow(-2))
    
val Candela.ccd  : Double
    get() = this.value / 10.0.pow(-2)
    
 val Candela.centicandela  : Double
    get() = this.value / 10.0.pow(-2) 



val Number.mcd : Candela
    get() = Candela(10.0.pow(-3))

val Number.millicandela : Candela
    get() = Candela(10.0.pow(-3))
    
val Candela.mcd  : Double
    get() = this.value / 10.0.pow(-3)
    
 val Candela.millicandela  : Double
    get() = this.value / 10.0.pow(-3) 



val Number.μcd : Candela
    get() = Candela(10.0.pow(-6))

val Number.microcandela : Candela
    get() = Candela(10.0.pow(-6))
    
val Candela.μcd  : Double
    get() = this.value / 10.0.pow(-6)
    
 val Candela.microcandela  : Double
    get() = this.value / 10.0.pow(-6) 



val Number.ncd : Candela
    get() = Candela(10.0.pow(-9))

val Number.nanocandela : Candela
    get() = Candela(10.0.pow(-9))
    
val Candela.ncd  : Double
    get() = this.value / 10.0.pow(-9)
    
 val Candela.nanocandela  : Double
    get() = this.value / 10.0.pow(-9) 



val Number.pcd : Candela
    get() = Candela(10.0.pow(-12))

val Number.picocandela : Candela
    get() = Candela(10.0.pow(-12))
    
val Candela.pcd  : Double
    get() = this.value / 10.0.pow(-12)
    
 val Candela.picocandela  : Double
    get() = this.value / 10.0.pow(-12) 



val Number.fcd : Candela
    get() = Candela(10.0.pow(-15))

val Number.femtocandela : Candela
    get() = Candela(10.0.pow(-15))
    
val Candela.fcd  : Double
    get() = this.value / 10.0.pow(-15)
    
 val Candela.femtocandela  : Double
    get() = this.value / 10.0.pow(-15) 



val Number.acd : Candela
    get() = Candela(10.0.pow(-18))

val Number.attocandela : Candela
    get() = Candela(10.0.pow(-18))
    
val Candela.acd  : Double
    get() = this.value / 10.0.pow(-18)
    
 val Candela.attocandela  : Double
    get() = this.value / 10.0.pow(-18) 



val Number.zcd : Candela
    get() = Candela(10.0.pow(-21))

val Number.zeptocandela : Candela
    get() = Candela(10.0.pow(-21))
    
val Candela.zcd  : Double
    get() = this.value / 10.0.pow(-21)
    
 val Candela.zeptocandela  : Double
    get() = this.value / 10.0.pow(-21) 



val Number.ycd : Candela
    get() = Candela(10.0.pow(-24))

val Number.yoctocandela : Candela
    get() = Candela(10.0.pow(-24))
    
val Candela.ycd  : Double
    get() = this.value / 10.0.pow(-24)
    
 val Candela.yoctocandela  : Double
    get() = this.value / 10.0.pow(-24) 


