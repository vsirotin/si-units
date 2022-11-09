
package eu.sirotin.siunits.base

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification
import kotlin.math.pow
private val descriptionMole = UnitSpecification(
    "mol",
    "N",
    50
) { v: Double -> Mole(v) }

class Mole(value: Double) : TermUnit(value, description = descriptionMole)
    val Number.mol : Mole
        get() = Mole(this.toDouble())
    
    val mol = Mole(1.0)       
    
    val Number.Ymol : Mole
        @JvmName("getYmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(24))
    
    val Number.yottamole : Mole
        get() = Mole(this.toDouble()*10.0.pow(24))
    
    val Mole.Ymol  : Double
        @JvmName("getYmol_prop")
        get() = this.value / 10.0.pow(24)
    
    val Mole.yottamole  : Double
        get() = this.value / 10.0.pow(24)
    
    @JvmField()         
    val Ymol = Mole(10.0.pow(24))
    val yottamole = Ymol          

    val Number.Zmol : Mole
        @JvmName("getZmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(21))
    
    val Number.zettamole : Mole
        get() = Mole(this.toDouble()*10.0.pow(21))
    
    val Mole.Zmol  : Double
        @JvmName("getZmol_prop")
        get() = this.value / 10.0.pow(21)
    
    val Mole.zettamole  : Double
        get() = this.value / 10.0.pow(21)
    
    @JvmField()         
    val Zmol = Mole(10.0.pow(21))
    val zettamole = Zmol          

    val Number.Emol : Mole
        @JvmName("getEmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(18))
    
    val Number.examole : Mole
        get() = Mole(this.toDouble()*10.0.pow(18))
    
    val Mole.Emol  : Double
        @JvmName("getEmol_prop")
        get() = this.value / 10.0.pow(18)
    
    val Mole.examole  : Double
        get() = this.value / 10.0.pow(18)
    
    @JvmField()         
    val Emol = Mole(10.0.pow(18))
    val examole = Emol          

    val Number.Pmol : Mole
        @JvmName("getPmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(15))
    
    val Number.petamole : Mole
        get() = Mole(this.toDouble()*10.0.pow(15))
    
    val Mole.Pmol  : Double
        @JvmName("getPmol_prop")
        get() = this.value / 10.0.pow(15)
    
    val Mole.petamole  : Double
        get() = this.value / 10.0.pow(15)
    
    @JvmField()         
    val Pmol = Mole(10.0.pow(15))
    val petamole = Pmol          

    val Number.Tmol : Mole
        @JvmName("getTmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(12))
    
    val Number.teramole : Mole
        get() = Mole(this.toDouble()*10.0.pow(12))
    
    val Mole.Tmol  : Double
        @JvmName("getTmol_prop")
        get() = this.value / 10.0.pow(12)
    
    val Mole.teramole  : Double
        get() = this.value / 10.0.pow(12)
    
    @JvmField()         
    val Tmol = Mole(10.0.pow(12))
    val teramole = Tmol          

    val Number.Gmol : Mole
        @JvmName("getGmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(9))
    
    val Number.gigamole : Mole
        get() = Mole(this.toDouble()*10.0.pow(9))
    
    val Mole.Gmol  : Double
        @JvmName("getGmol_prop")
        get() = this.value / 10.0.pow(9)
    
    val Mole.gigamole  : Double
        get() = this.value / 10.0.pow(9)
    
    @JvmField()         
    val Gmol = Mole(10.0.pow(9))
    val gigamole = Gmol          

    val Number.Mmol : Mole
        @JvmName("getMmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(6))
    
    val Number.megamole : Mole
        get() = Mole(this.toDouble()*10.0.pow(6))
    
    val Mole.Mmol  : Double
        @JvmName("getMmol_prop")
        get() = this.value / 10.0.pow(6)
    
    val Mole.megamole  : Double
        get() = this.value / 10.0.pow(6)
    
    @JvmField()         
    val Mmol = Mole(10.0.pow(6))
    val megamole = Mmol          

    val Number.kmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(3))
    
    val Number.kilomole : Mole
        get() = Mole(this.toDouble()*10.0.pow(3))
    
    val Mole.kmol  : Double
        get() = this.value / 10.0.pow(3)
    
    val Mole.kilomole  : Double
        get() = this.value / 10.0.pow(3)
    
    @JvmField()         
    val kmol = Mole(10.0.pow(3))
    val kilomole = kmol          

    val Number.hmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(2))
    
    val Number.hectomole : Mole
        get() = Mole(this.toDouble()*10.0.pow(2))
    
    val Mole.hmol  : Double
        get() = this.value / 10.0.pow(2)
    
    val Mole.hectomole  : Double
        get() = this.value / 10.0.pow(2)
    
    @JvmField()         
    val hmol = Mole(10.0.pow(2))
    val hectomole = hmol          

    val Number.damol : Mole
        get() = Mole(this.toDouble()*10.0.pow(1))
    
    val Number.decamole : Mole
        get() = Mole(this.toDouble()*10.0.pow(1))
    
    val Mole.damol  : Double
        get() = this.value / 10.0.pow(1)
    
    val Mole.decamole  : Double
        get() = this.value / 10.0.pow(1)
    
    @JvmField()         
    val damol = Mole(10.0.pow(1))
    val decamole = damol          

    val Number.dmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-1))
    
    val Number.decimole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-1))
    
    val Mole.dmol  : Double
        get() = this.value / 10.0.pow(-1)
    
    val Mole.decimole  : Double
        get() = this.value / 10.0.pow(-1)
    
    @JvmField()         
    val dmol = Mole(10.0.pow(-1))
    val decimole = dmol          

    val Number.cmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-2))
    
    val Number.centimole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-2))
    
    val Mole.cmol  : Double
        get() = this.value / 10.0.pow(-2)
    
    val Mole.centimole  : Double
        get() = this.value / 10.0.pow(-2)
    
    @JvmField()         
    val cmol = Mole(10.0.pow(-2))
    val centimole = cmol          

    val Number.mmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-3))
    
    val Number.millimole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-3))
    
    val Mole.mmol  : Double
        get() = this.value / 10.0.pow(-3)
    
    val Mole.millimole  : Double
        get() = this.value / 10.0.pow(-3)
    
    @JvmField()         
    val mmol = Mole(10.0.pow(-3))
    val millimole = mmol          

    val Number.μmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-6))
    
    val Number.micromole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-6))
    
    val Mole.μmol  : Double
        get() = this.value / 10.0.pow(-6)
    
    val Mole.micromole  : Double
        get() = this.value / 10.0.pow(-6)
    
    @JvmField()         
    val μmol = Mole(10.0.pow(-6))
    val micromole = μmol          

    val Number.nmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-9))
    
    val Number.nanomole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-9))
    
    val Mole.nmol  : Double
        get() = this.value / 10.0.pow(-9)
    
    val Mole.nanomole  : Double
        get() = this.value / 10.0.pow(-9)
    
    @JvmField()         
    val nmol = Mole(10.0.pow(-9))
    val nanomole = nmol          

    val Number.pmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-12))
    
    val Number.picomole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-12))
    
    val Mole.pmol  : Double
        get() = this.value / 10.0.pow(-12)
    
    val Mole.picomole  : Double
        get() = this.value / 10.0.pow(-12)
    
    @JvmField()         
    val pmol = Mole(10.0.pow(-12))
    val picomole = pmol          

    val Number.fmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-15))
    
    val Number.femtomole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-15))
    
    val Mole.fmol  : Double
        get() = this.value / 10.0.pow(-15)
    
    val Mole.femtomole  : Double
        get() = this.value / 10.0.pow(-15)
    
    @JvmField()         
    val fmol = Mole(10.0.pow(-15))
    val femtomole = fmol          

    val Number.amol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-18))
    
    val Number.attomole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-18))
    
    val Mole.amol  : Double
        get() = this.value / 10.0.pow(-18)
    
    val Mole.attomole  : Double
        get() = this.value / 10.0.pow(-18)
    
    @JvmField()         
    val amol = Mole(10.0.pow(-18))
    val attomole = amol          

    val Number.zmol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-21))
    
    val Number.zeptomole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-21))
    
    val Mole.zmol  : Double
        get() = this.value / 10.0.pow(-21)
    
    val Mole.zeptomole  : Double
        get() = this.value / 10.0.pow(-21)
    
    @JvmField()         
    val zmol = Mole(10.0.pow(-21))
    val zeptomole = zmol          

    val Number.ymol : Mole
        get() = Mole(this.toDouble()*10.0.pow(-24))
    
    val Number.yoctomole : Mole
        get() = Mole(this.toDouble()*10.0.pow(-24))
    
    val Mole.ymol  : Double
        get() = this.value / 10.0.pow(-24)
    
    val Mole.yoctomole  : Double
        get() = this.value / 10.0.pow(-24)
    
    @JvmField()         
    val ymol = Mole(10.0.pow(-24))
    val yoctomole = ymol          