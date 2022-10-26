package eu.sirotin.siunits.siunits

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import kotlin.math.pow
private val descriptionKilogram = DimensionSpecification(
    "g",
    "M",
    "mass",
    90
) { v: Double -> Kilogram(v) }


class Kilogram(value: Double) : TermUnit(value, description = descriptionKilogram)
val Number.g : Kilogram
    get() = Kilogram(this.toDouble())
    
val g = Kilogram(1.0)   

val Number.Yg : Kilogram
    @JvmName("getYg_prop")
  get() = Kilogram(10.0.pow(21))

val Number.yottagram : Kilogram
    get() = Kilogram(10.0.pow(21))
    
val Kilogram.Yg  : Double
    @JvmName("getYg_prop")
  get() = this.value / 10.0.pow(21)
    
 val Kilogram.yottagram  : Double
    get() = this.value / 10.0.pow(21) 



val Number.Zg : Kilogram
    @JvmName("getZg_prop")
  get() = Kilogram(10.0.pow(18))

val Number.zettagram : Kilogram
    get() = Kilogram(10.0.pow(18))
    
val Kilogram.Zg  : Double
    @JvmName("getZg_prop")
  get() = this.value / 10.0.pow(18)
    
 val Kilogram.zettagram  : Double
    get() = this.value / 10.0.pow(18) 



val Number.Eg : Kilogram
    @JvmName("getEg_prop")
  get() = Kilogram(10.0.pow(15))

val Number.exagram : Kilogram
    get() = Kilogram(10.0.pow(15))
    
val Kilogram.Eg  : Double
    @JvmName("getEg_prop")
  get() = this.value / 10.0.pow(15)
    
 val Kilogram.exagram  : Double
    get() = this.value / 10.0.pow(15) 



val Number.Pg : Kilogram
    @JvmName("getPg_prop")
  get() = Kilogram(10.0.pow(12))

val Number.petagram : Kilogram
    get() = Kilogram(10.0.pow(12))
    
val Kilogram.Pg  : Double
    @JvmName("getPg_prop")
  get() = this.value / 10.0.pow(12)
    
 val Kilogram.petagram  : Double
    get() = this.value / 10.0.pow(12) 



val Number.Tg : Kilogram
    @JvmName("getTg_prop")
  get() = Kilogram(10.0.pow(9))

val Number.teragram : Kilogram
    get() = Kilogram(10.0.pow(9))
    
val Kilogram.Tg  : Double
    @JvmName("getTg_prop")
  get() = this.value / 10.0.pow(9)
    
 val Kilogram.teragram  : Double
    get() = this.value / 10.0.pow(9) 



val Number.Gg : Kilogram
    @JvmName("getGg_prop")
  get() = Kilogram(10.0.pow(6))

val Number.gigagram : Kilogram
    get() = Kilogram(10.0.pow(6))
    
val Kilogram.Gg  : Double
    @JvmName("getGg_prop")
  get() = this.value / 10.0.pow(6)
    
 val Kilogram.gigagram  : Double
    get() = this.value / 10.0.pow(6) 



val Number.Mg : Kilogram
    @JvmName("getMg_prop")
  get() = Kilogram(10.0.pow(3))

val Number.megagram : Kilogram
    get() = Kilogram(10.0.pow(3))
    
val Kilogram.Mg  : Double
    @JvmName("getMg_prop")
  get() = this.value / 10.0.pow(3)
    
 val Kilogram.megagram  : Double
    get() = this.value / 10.0.pow(3) 



val Number.hg : Kilogram
    get() = Kilogram(10.0.pow(-1))

val Number.hectogram : Kilogram
    get() = Kilogram(10.0.pow(-1))
    
val Kilogram.hg  : Double
    get() = this.value / 10.0.pow(-1)
    
 val Kilogram.hectogram  : Double
    get() = this.value / 10.0.pow(-1) 



val Number.dag : Kilogram
    get() = Kilogram(10.0.pow(-2))

val Number.decagram : Kilogram
    get() = Kilogram(10.0.pow(-2))
    
val Kilogram.dag  : Double
    get() = this.value / 10.0.pow(-2)
    
 val Kilogram.decagram  : Double
    get() = this.value / 10.0.pow(-2) 



val Number.dg : Kilogram
    get() = Kilogram(10.0.pow(-4))

val Number.decigram : Kilogram
    get() = Kilogram(10.0.pow(-4))
    
val Kilogram.dg  : Double
    get() = this.value / 10.0.pow(-4)
    
 val Kilogram.decigram  : Double
    get() = this.value / 10.0.pow(-4) 



val Number.cg : Kilogram
    get() = Kilogram(10.0.pow(-5))

val Number.centigram : Kilogram
    get() = Kilogram(10.0.pow(-5))
    
val Kilogram.cg  : Double
    get() = this.value / 10.0.pow(-5)
    
 val Kilogram.centigram  : Double
    get() = this.value / 10.0.pow(-5) 



val Number.mg : Kilogram
    get() = Kilogram(10.0.pow(-6))

val Number.milligram : Kilogram
    get() = Kilogram(10.0.pow(-6))
    
val Kilogram.mg  : Double
    get() = this.value / 10.0.pow(-6)
    
 val Kilogram.milligram  : Double
    get() = this.value / 10.0.pow(-6) 



val Number.μg : Kilogram
    get() = Kilogram(10.0.pow(-9))

val Number.microgram : Kilogram
    get() = Kilogram(10.0.pow(-9))
    
val Kilogram.μg  : Double
    get() = this.value / 10.0.pow(-9)
    
 val Kilogram.microgram  : Double
    get() = this.value / 10.0.pow(-9) 



val Number.ng : Kilogram
    get() = Kilogram(10.0.pow(-12))

val Number.nanogram : Kilogram
    get() = Kilogram(10.0.pow(-12))
    
val Kilogram.ng  : Double
    get() = this.value / 10.0.pow(-12)
    
 val Kilogram.nanogram  : Double
    get() = this.value / 10.0.pow(-12) 



val Number.pg : Kilogram
    get() = Kilogram(10.0.pow(-15))

val Number.picogram : Kilogram
    get() = Kilogram(10.0.pow(-15))
    
val Kilogram.pg  : Double
    get() = this.value / 10.0.pow(-15)
    
 val Kilogram.picogram  : Double
    get() = this.value / 10.0.pow(-15) 



val Number.fg : Kilogram
    get() = Kilogram(10.0.pow(-18))

val Number.femtogram : Kilogram
    get() = Kilogram(10.0.pow(-18))
    
val Kilogram.fg  : Double
    get() = this.value / 10.0.pow(-18)
    
 val Kilogram.femtogram  : Double
    get() = this.value / 10.0.pow(-18) 



val Number.ag : Kilogram
    get() = Kilogram(10.0.pow(-21))

val Number.attogram : Kilogram
    get() = Kilogram(10.0.pow(-21))
    
val Kilogram.ag  : Double
    get() = this.value / 10.0.pow(-21)
    
 val Kilogram.attogram  : Double
    get() = this.value / 10.0.pow(-21) 



val Number.zg : Kilogram
    get() = Kilogram(10.0.pow(-24))

val Number.zeptogram : Kilogram
    get() = Kilogram(10.0.pow(-24))
    
val Kilogram.zg  : Double
    get() = this.value / 10.0.pow(-24)
    
 val Kilogram.zeptogram  : Double
    get() = this.value / 10.0.pow(-24) 



val Number.yg : Kilogram
    get() = Kilogram(10.0.pow(-27))

val Number.yoctogram : Kilogram
    get() = Kilogram(10.0.pow(-27))
    
val Kilogram.yg  : Double
    get() = this.value / 10.0.pow(-27)
    
 val Kilogram.yoctogram  : Double
    get() = this.value / 10.0.pow(-27) 


