package eu.sirotin.siunits.siunits

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import kotlin.math.pow
private val descriptionSecond = DimensionSpecification(
    "s",
    "T",
    "time",
    0
) { v: Double -> Second(v) }


class Second(value: Double) : TermUnit(value, description = descriptionSecond)
val Number.s : Second
    get() = Second(this.toDouble())
    
val s = Second(1.0)   

val Number.Ys : Second
    @JvmName("getYs_prop")
  get() = Second(10.0.pow(24))

val Number.yottasecond : Second
    get() = Second(10.0.pow(24))
    
val Second.Ys  : Double
    @JvmName("getYs_prop")
  get() = this.value / 10.0.pow(24)
    
 val Second.yottasecond  : Double
    get() = this.value / 10.0.pow(24) 



val Number.Zs : Second
    @JvmName("getZs_prop")
  get() = Second(10.0.pow(21))

val Number.zettasecond : Second
    get() = Second(10.0.pow(21))
    
val Second.Zs  : Double
    @JvmName("getZs_prop")
  get() = this.value / 10.0.pow(21)
    
 val Second.zettasecond  : Double
    get() = this.value / 10.0.pow(21) 



val Number.Es : Second
    @JvmName("getEs_prop")
  get() = Second(10.0.pow(18))

val Number.exasecond : Second
    get() = Second(10.0.pow(18))
    
val Second.Es  : Double
    @JvmName("getEs_prop")
  get() = this.value / 10.0.pow(18)
    
 val Second.exasecond  : Double
    get() = this.value / 10.0.pow(18) 



val Number.Ps : Second
    @JvmName("getPs_prop")
  get() = Second(10.0.pow(15))

val Number.petasecond : Second
    get() = Second(10.0.pow(15))
    
val Second.Ps  : Double
    @JvmName("getPs_prop")
  get() = this.value / 10.0.pow(15)
    
 val Second.petasecond  : Double
    get() = this.value / 10.0.pow(15) 



val Number.Ts : Second
    @JvmName("getTs_prop")
  get() = Second(10.0.pow(12))

val Number.terasecond : Second
    get() = Second(10.0.pow(12))
    
val Second.Ts  : Double
    @JvmName("getTs_prop")
  get() = this.value / 10.0.pow(12)
    
 val Second.terasecond  : Double
    get() = this.value / 10.0.pow(12) 



val Number.Gs : Second
    @JvmName("getGs_prop")
  get() = Second(10.0.pow(9))

val Number.gigasecond : Second
    get() = Second(10.0.pow(9))
    
val Second.Gs  : Double
    @JvmName("getGs_prop")
  get() = this.value / 10.0.pow(9)
    
 val Second.gigasecond  : Double
    get() = this.value / 10.0.pow(9) 



val Number.Ms : Second
    @JvmName("getMs_prop")
  get() = Second(10.0.pow(6))

val Number.megasecond : Second
    get() = Second(10.0.pow(6))
    
val Second.Ms  : Double
    @JvmName("getMs_prop")
  get() = this.value / 10.0.pow(6)
    
 val Second.megasecond  : Double
    get() = this.value / 10.0.pow(6) 



val Number.ks : Second
    get() = Second(10.0.pow(3))

val Number.kilosecond : Second
    get() = Second(10.0.pow(3))
    
val Second.ks  : Double
    get() = this.value / 10.0.pow(3)
    
 val Second.kilosecond  : Double
    get() = this.value / 10.0.pow(3) 



val Number.hs : Second
    get() = Second(10.0.pow(2))

val Number.hectosecond : Second
    get() = Second(10.0.pow(2))
    
val Second.hs  : Double
    get() = this.value / 10.0.pow(2)
    
 val Second.hectosecond  : Double
    get() = this.value / 10.0.pow(2) 



val Number.das : Second
    get() = Second(10.0.pow(1))

val Number.decasecond : Second
    get() = Second(10.0.pow(1))
    
val Second.das  : Double
    get() = this.value / 10.0.pow(1)
    
 val Second.decasecond  : Double
    get() = this.value / 10.0.pow(1) 



val Number.ds : Second
    get() = Second(10.0.pow(-1))

val Number.decisecond : Second
    get() = Second(10.0.pow(-1))
    
val Second.ds  : Double
    get() = this.value / 10.0.pow(-1)
    
 val Second.decisecond  : Double
    get() = this.value / 10.0.pow(-1) 



val Number.cs : Second
    get() = Second(10.0.pow(-2))

val Number.centisecond : Second
    get() = Second(10.0.pow(-2))
    
val Second.cs  : Double
    get() = this.value / 10.0.pow(-2)
    
 val Second.centisecond  : Double
    get() = this.value / 10.0.pow(-2) 



val Number.ms : Second
    get() = Second(10.0.pow(-3))

val Number.millisecond : Second
    get() = Second(10.0.pow(-3))
    
val Second.ms  : Double
    get() = this.value / 10.0.pow(-3)
    
 val Second.millisecond  : Double
    get() = this.value / 10.0.pow(-3) 



val Number.μs : Second
    get() = Second(10.0.pow(-6))

val Number.microsecond : Second
    get() = Second(10.0.pow(-6))
    
val Second.μs  : Double
    get() = this.value / 10.0.pow(-6)
    
 val Second.microsecond  : Double
    get() = this.value / 10.0.pow(-6) 



val Number.ns : Second
    get() = Second(10.0.pow(-9))

val Number.nanosecond : Second
    get() = Second(10.0.pow(-9))
    
val Second.ns  : Double
    get() = this.value / 10.0.pow(-9)
    
 val Second.nanosecond  : Double
    get() = this.value / 10.0.pow(-9) 



val Number.ps : Second
    get() = Second(10.0.pow(-12))

val Number.picosecond : Second
    get() = Second(10.0.pow(-12))
    
val Second.ps  : Double
    get() = this.value / 10.0.pow(-12)
    
 val Second.picosecond  : Double
    get() = this.value / 10.0.pow(-12) 



val Number.fs : Second
    get() = Second(10.0.pow(-15))

val Number.femtosecond : Second
    get() = Second(10.0.pow(-15))
    
val Second.fs  : Double
    get() = this.value / 10.0.pow(-15)
    
 val Second.femtosecond  : Double
    get() = this.value / 10.0.pow(-15) 



val Number.ast : Second
    get() = Second(10.0.pow(-18))

val Number.attosecond : Second
    get() = Second(10.0.pow(-18))
    
val Second.ast  : Double
    get() = this.value / 10.0.pow(-18)
    
 val Second.attosecond  : Double
    get() = this.value / 10.0.pow(-18) 



val Number.zs : Second
    get() = Second(10.0.pow(-21))

val Number.zeptosecond : Second
    get() = Second(10.0.pow(-21))
    
val Second.zs  : Double
    get() = this.value / 10.0.pow(-21)
    
 val Second.zeptosecond  : Double
    get() = this.value / 10.0.pow(-21) 



val Number.ys : Second
    get() = Second(10.0.pow(-24))

val Number.yoctosecond : Second
    get() = Second(10.0.pow(-24))
    
val Second.ys  : Double
    get() = this.value / 10.0.pow(-24)
    
 val Second.yoctosecond  : Double
    get() = this.value / 10.0.pow(-24) 


