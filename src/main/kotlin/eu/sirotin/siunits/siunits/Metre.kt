package eu.sirotin.siunits.siunits

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import kotlin.math.pow
private val descriptionMetre = DimensionSpecification(
    "m",
    "L",
    "length",
    80
) { v: Double -> Metre(v) }


class Metre(value: Double) : TermUnit(value, description = descriptionMetre)
val Number.m : Metre
    get() = Metre(this.toDouble())
    
val m = Metre(1.0)   

val Number.Ym : Metre
    @JvmName("getYm_prop")
  get() = Metre(10.0.pow(24))

val Number.yottametre : Metre
    get() = Metre(10.0.pow(24))
    
val Metre.Ym  : Double
    @JvmName("getYm_prop")
  get() = this.value / 10.0.pow(24)
    
 val Metre.yottametre  : Double
    get() = this.value / 10.0.pow(24) 



val Number.Zm : Metre
    @JvmName("getZm_prop")
  get() = Metre(10.0.pow(21))

val Number.zettametre : Metre
    get() = Metre(10.0.pow(21))
    
val Metre.Zm  : Double
    @JvmName("getZm_prop")
  get() = this.value / 10.0.pow(21)
    
 val Metre.zettametre  : Double
    get() = this.value / 10.0.pow(21) 



val Number.Em : Metre
    @JvmName("getEm_prop")
  get() = Metre(10.0.pow(18))

val Number.exametre : Metre
    get() = Metre(10.0.pow(18))
    
val Metre.Em  : Double
    @JvmName("getEm_prop")
  get() = this.value / 10.0.pow(18)
    
 val Metre.exametre  : Double
    get() = this.value / 10.0.pow(18) 



val Number.Pm : Metre
    @JvmName("getPm_prop")
  get() = Metre(10.0.pow(15))

val Number.petametre : Metre
    get() = Metre(10.0.pow(15))
    
val Metre.Pm  : Double
    @JvmName("getPm_prop")
  get() = this.value / 10.0.pow(15)
    
 val Metre.petametre  : Double
    get() = this.value / 10.0.pow(15) 



val Number.Tm : Metre
    @JvmName("getTm_prop")
  get() = Metre(10.0.pow(12))

val Number.terametre : Metre
    get() = Metre(10.0.pow(12))
    
val Metre.Tm  : Double
    @JvmName("getTm_prop")
  get() = this.value / 10.0.pow(12)
    
 val Metre.terametre  : Double
    get() = this.value / 10.0.pow(12) 



val Number.Gm : Metre
    @JvmName("getGm_prop")
  get() = Metre(10.0.pow(9))

val Number.gigametre : Metre
    get() = Metre(10.0.pow(9))
    
val Metre.Gm  : Double
    @JvmName("getGm_prop")
  get() = this.value / 10.0.pow(9)
    
 val Metre.gigametre  : Double
    get() = this.value / 10.0.pow(9) 



val Number.Mm : Metre
    @JvmName("getMm_prop")
  get() = Metre(10.0.pow(6))

val Number.megametre : Metre
    get() = Metre(10.0.pow(6))
    
val Metre.Mm  : Double
    @JvmName("getMm_prop")
  get() = this.value / 10.0.pow(6)
    
 val Metre.megametre  : Double
    get() = this.value / 10.0.pow(6) 



val Number.km : Metre
    get() = Metre(10.0.pow(3))

val Number.kilometre : Metre
    get() = Metre(10.0.pow(3))
    
val Metre.km  : Double
    get() = this.value / 10.0.pow(3)
    
 val Metre.kilometre  : Double
    get() = this.value / 10.0.pow(3) 



val Number.hm : Metre
    get() = Metre(10.0.pow(2))

val Number.hectometre : Metre
    get() = Metre(10.0.pow(2))
    
val Metre.hm  : Double
    get() = this.value / 10.0.pow(2)
    
 val Metre.hectometre  : Double
    get() = this.value / 10.0.pow(2) 



val Number.dam : Metre
    get() = Metre(10.0.pow(1))

val Number.decametre : Metre
    get() = Metre(10.0.pow(1))
    
val Metre.dam  : Double
    get() = this.value / 10.0.pow(1)
    
 val Metre.decametre  : Double
    get() = this.value / 10.0.pow(1) 



val Number.dm : Metre
    get() = Metre(10.0.pow(-1))

val Number.decimetre : Metre
    get() = Metre(10.0.pow(-1))
    
val Metre.dm  : Double
    get() = this.value / 10.0.pow(-1)
    
 val Metre.decimetre  : Double
    get() = this.value / 10.0.pow(-1) 



val Number.cm : Metre
    get() = Metre(10.0.pow(-2))

val Number.centimetre : Metre
    get() = Metre(10.0.pow(-2))
    
val Metre.cm  : Double
    get() = this.value / 10.0.pow(-2)
    
 val Metre.centimetre  : Double
    get() = this.value / 10.0.pow(-2) 



val Number.mm : Metre
    get() = Metre(10.0.pow(-3))

val Number.millimetre : Metre
    get() = Metre(10.0.pow(-3))
    
val Metre.mm  : Double
    get() = this.value / 10.0.pow(-3)
    
 val Metre.millimetre  : Double
    get() = this.value / 10.0.pow(-3) 



val Number.μm : Metre
    get() = Metre(10.0.pow(-6))

val Number.micrometre : Metre
    get() = Metre(10.0.pow(-6))
    
val Metre.μm  : Double
    get() = this.value / 10.0.pow(-6)
    
 val Metre.micrometre  : Double
    get() = this.value / 10.0.pow(-6) 



val Number.nm : Metre
    get() = Metre(10.0.pow(-9))

val Number.nanometre : Metre
    get() = Metre(10.0.pow(-9))
    
val Metre.nm  : Double
    get() = this.value / 10.0.pow(-9)
    
 val Metre.nanometre  : Double
    get() = this.value / 10.0.pow(-9) 



val Number.pm : Metre
    get() = Metre(10.0.pow(-12))

val Number.picometre : Metre
    get() = Metre(10.0.pow(-12))
    
val Metre.pm  : Double
    get() = this.value / 10.0.pow(-12)
    
 val Metre.picometre  : Double
    get() = this.value / 10.0.pow(-12) 



val Number.fm : Metre
    get() = Metre(10.0.pow(-15))

val Number.femtometre : Metre
    get() = Metre(10.0.pow(-15))
    
val Metre.fm  : Double
    get() = this.value / 10.0.pow(-15)
    
 val Metre.femtometre  : Double
    get() = this.value / 10.0.pow(-15) 



val Number.am : Metre
    get() = Metre(10.0.pow(-18))

val Number.attometre : Metre
    get() = Metre(10.0.pow(-18))
    
val Metre.am  : Double
    get() = this.value / 10.0.pow(-18)
    
 val Metre.attometre  : Double
    get() = this.value / 10.0.pow(-18) 



val Number.zm : Metre
    get() = Metre(10.0.pow(-21))

val Number.zeptometre : Metre
    get() = Metre(10.0.pow(-21))
    
val Metre.zm  : Double
    get() = this.value / 10.0.pow(-21)
    
 val Metre.zeptometre  : Double
    get() = this.value / 10.0.pow(-21) 



val Number.ym : Metre
    get() = Metre(10.0.pow(-24))

val Number.yoctometre : Metre
    get() = Metre(10.0.pow(-24))
    
val Metre.ym  : Double
    get() = this.value / 10.0.pow(-24)
    
 val Metre.yoctometre  : Double
    get() = this.value / 10.0.pow(-24) 


