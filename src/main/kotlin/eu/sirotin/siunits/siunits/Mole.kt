package eu.sirotin.siunits.siunits

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import kotlin.math.pow
private val descriptionMole = DimensionSpecification(
    "mol",
    "N",
    "amount of substance",
    50
) { v: Double -> Mole(v) }


class Mole(value: Double) : TermUnit(value, description = descriptionMole)
val Number.mol : Mole
    get() = Mole(this.toDouble())
    
val mol = Mole(1.0)   

val Number.Ymol : Mole
    @JvmName("getYmol_prop")
  get() = Mole(10.0.pow(24))

val Number.yottamole : Mole
    get() = Mole(10.0.pow(24))
    
val Mole.Ymol  : Double
    @JvmName("getYmol_prop")
  get() = this.value / 10.0.pow(24)
    
 val Mole.yottamole  : Double
    get() = this.value / 10.0.pow(24) 



val Number.Zmol : Mole
    @JvmName("getZmol_prop")
  get() = Mole(10.0.pow(21))

val Number.zettamole : Mole
    get() = Mole(10.0.pow(21))
    
val Mole.Zmol  : Double
    @JvmName("getZmol_prop")
  get() = this.value / 10.0.pow(21)
    
 val Mole.zettamole  : Double
    get() = this.value / 10.0.pow(21) 



val Number.Emol : Mole
    @JvmName("getEmol_prop")
  get() = Mole(10.0.pow(18))

val Number.examole : Mole
    get() = Mole(10.0.pow(18))
    
val Mole.Emol  : Double
    @JvmName("getEmol_prop")
  get() = this.value / 10.0.pow(18)
    
 val Mole.examole  : Double
    get() = this.value / 10.0.pow(18) 



val Number.Pmol : Mole
    @JvmName("getPmol_prop")
  get() = Mole(10.0.pow(15))

val Number.petamole : Mole
    get() = Mole(10.0.pow(15))
    
val Mole.Pmol  : Double
    @JvmName("getPmol_prop")
  get() = this.value / 10.0.pow(15)
    
 val Mole.petamole  : Double
    get() = this.value / 10.0.pow(15) 



val Number.Tmol : Mole
    @JvmName("getTmol_prop")
  get() = Mole(10.0.pow(12))

val Number.teramole : Mole
    get() = Mole(10.0.pow(12))
    
val Mole.Tmol  : Double
    @JvmName("getTmol_prop")
  get() = this.value / 10.0.pow(12)
    
 val Mole.teramole  : Double
    get() = this.value / 10.0.pow(12) 



val Number.Gmol : Mole
    @JvmName("getGmol_prop")
  get() = Mole(10.0.pow(9))

val Number.gigamole : Mole
    get() = Mole(10.0.pow(9))
    
val Mole.Gmol  : Double
    @JvmName("getGmol_prop")
  get() = this.value / 10.0.pow(9)
    
 val Mole.gigamole  : Double
    get() = this.value / 10.0.pow(9) 



val Number.Mmol : Mole
    @JvmName("getMmol_prop")
  get() = Mole(10.0.pow(6))

val Number.megamole : Mole
    get() = Mole(10.0.pow(6))
    
val Mole.Mmol  : Double
    @JvmName("getMmol_prop")
  get() = this.value / 10.0.pow(6)
    
 val Mole.megamole  : Double
    get() = this.value / 10.0.pow(6) 



val Number.kmol : Mole
    get() = Mole(10.0.pow(3))

val Number.kilomole : Mole
    get() = Mole(10.0.pow(3))
    
val Mole.kmol  : Double
    get() = this.value / 10.0.pow(3)
    
 val Mole.kilomole  : Double
    get() = this.value / 10.0.pow(3) 



val Number.hmol : Mole
    get() = Mole(10.0.pow(2))

val Number.hectomole : Mole
    get() = Mole(10.0.pow(2))
    
val Mole.hmol  : Double
    get() = this.value / 10.0.pow(2)
    
 val Mole.hectomole  : Double
    get() = this.value / 10.0.pow(2) 



val Number.damol : Mole
    get() = Mole(10.0.pow(1))

val Number.decamole : Mole
    get() = Mole(10.0.pow(1))
    
val Mole.damol  : Double
    get() = this.value / 10.0.pow(1)
    
 val Mole.decamole  : Double
    get() = this.value / 10.0.pow(1) 



val Number.dmol : Mole
    get() = Mole(10.0.pow(-1))

val Number.decimole : Mole
    get() = Mole(10.0.pow(-1))
    
val Mole.dmol  : Double
    get() = this.value / 10.0.pow(-1)
    
 val Mole.decimole  : Double
    get() = this.value / 10.0.pow(-1) 



val Number.cmol : Mole
    get() = Mole(10.0.pow(-2))

val Number.centimole : Mole
    get() = Mole(10.0.pow(-2))
    
val Mole.cmol  : Double
    get() = this.value / 10.0.pow(-2)
    
 val Mole.centimole  : Double
    get() = this.value / 10.0.pow(-2) 



val Number.mmol : Mole
    get() = Mole(10.0.pow(-3))

val Number.millimole : Mole
    get() = Mole(10.0.pow(-3))
    
val Mole.mmol  : Double
    get() = this.value / 10.0.pow(-3)
    
 val Mole.millimole  : Double
    get() = this.value / 10.0.pow(-3) 



val Number.μmol : Mole
    get() = Mole(10.0.pow(-6))

val Number.micromole : Mole
    get() = Mole(10.0.pow(-6))
    
val Mole.μmol  : Double
    get() = this.value / 10.0.pow(-6)
    
 val Mole.micromole  : Double
    get() = this.value / 10.0.pow(-6) 



val Number.nmol : Mole
    get() = Mole(10.0.pow(-9))

val Number.nanomole : Mole
    get() = Mole(10.0.pow(-9))
    
val Mole.nmol  : Double
    get() = this.value / 10.0.pow(-9)
    
 val Mole.nanomole  : Double
    get() = this.value / 10.0.pow(-9) 



val Number.pmol : Mole
    get() = Mole(10.0.pow(-12))

val Number.picomole : Mole
    get() = Mole(10.0.pow(-12))
    
val Mole.pmol  : Double
    get() = this.value / 10.0.pow(-12)
    
 val Mole.picomole  : Double
    get() = this.value / 10.0.pow(-12) 



val Number.fmol : Mole
    get() = Mole(10.0.pow(-15))

val Number.femtomole : Mole
    get() = Mole(10.0.pow(-15))
    
val Mole.fmol  : Double
    get() = this.value / 10.0.pow(-15)
    
 val Mole.femtomole  : Double
    get() = this.value / 10.0.pow(-15) 



val Number.amol : Mole
    get() = Mole(10.0.pow(-18))

val Number.attomole : Mole
    get() = Mole(10.0.pow(-18))
    
val Mole.amol  : Double
    get() = this.value / 10.0.pow(-18)
    
 val Mole.attomole  : Double
    get() = this.value / 10.0.pow(-18) 



val Number.zmol : Mole
    get() = Mole(10.0.pow(-21))

val Number.zeptomole : Mole
    get() = Mole(10.0.pow(-21))
    
val Mole.zmol  : Double
    get() = this.value / 10.0.pow(-21)
    
 val Mole.zeptomole  : Double
    get() = this.value / 10.0.pow(-21) 



val Number.ymol : Mole
    get() = Mole(10.0.pow(-24))

val Number.yoctomole : Mole
    get() = Mole(10.0.pow(-24))
    
val Mole.ymol  : Double
    get() = this.value / 10.0.pow(-24)
    
 val Mole.yoctomole  : Double
    get() = this.value / 10.0.pow(-24) 


