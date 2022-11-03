
package eu.sirotin.siunits.base

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.DimensionSpecification
import kotlin.math.pow
private val descriptionKilogram = DimensionSpecification(
    "kg",
    "M",
    "mass",
    90
) { v: Double -> Kilogram(v) }

class Kilogram(value: Double) : TermUnit(value, description = descriptionKilogram)
    val Number.kg : Kilogram
        get() = Kilogram(this.toDouble())
    
    val kg = Kilogram(1.0)       
    
    val Number.Ykg : Kilogram
        @JvmName("getYkg_prop")
        get() = Kilogram(10.0.pow(21))
    
    val Number.yottakilogram : Kilogram
        get() = Kilogram(10.0.pow(21))
    
    val Kilogram.Ykg  : Double
        @JvmName("getYkg_prop")
        get() = this.value / 10.0.pow(21)
    
    val Kilogram.yottakilogram  : Double
        get() = this.value / 10.0.pow(21)
    
    @JvmField()         
    val Ykg = Kilogram(10.0.pow(21))
    val yottakilogram = Ykg          

    val Number.Zkg : Kilogram
        @JvmName("getZkg_prop")
        get() = Kilogram(10.0.pow(18))
    
    val Number.zettakilogram : Kilogram
        get() = Kilogram(10.0.pow(18))
    
    val Kilogram.Zkg  : Double
        @JvmName("getZkg_prop")
        get() = this.value / 10.0.pow(18)
    
    val Kilogram.zettakilogram  : Double
        get() = this.value / 10.0.pow(18)
    
    @JvmField()         
    val Zkg = Kilogram(10.0.pow(18))
    val zettakilogram = Zkg          

    val Number.Ekg : Kilogram
        @JvmName("getEkg_prop")
        get() = Kilogram(10.0.pow(15))
    
    val Number.exakilogram : Kilogram
        get() = Kilogram(10.0.pow(15))
    
    val Kilogram.Ekg  : Double
        @JvmName("getEkg_prop")
        get() = this.value / 10.0.pow(15)
    
    val Kilogram.exakilogram  : Double
        get() = this.value / 10.0.pow(15)
    
    @JvmField()         
    val Ekg = Kilogram(10.0.pow(15))
    val exakilogram = Ekg          

    val Number.Pkg : Kilogram
        @JvmName("getPkg_prop")
        get() = Kilogram(10.0.pow(12))
    
    val Number.petakilogram : Kilogram
        get() = Kilogram(10.0.pow(12))
    
    val Kilogram.Pkg  : Double
        @JvmName("getPkg_prop")
        get() = this.value / 10.0.pow(12)
    
    val Kilogram.petakilogram  : Double
        get() = this.value / 10.0.pow(12)
    
    @JvmField()         
    val Pkg = Kilogram(10.0.pow(12))
    val petakilogram = Pkg          

    val Number.Tkg : Kilogram
        @JvmName("getTkg_prop")
        get() = Kilogram(10.0.pow(9))
    
    val Number.terakilogram : Kilogram
        get() = Kilogram(10.0.pow(9))
    
    val Kilogram.Tkg  : Double
        @JvmName("getTkg_prop")
        get() = this.value / 10.0.pow(9)
    
    val Kilogram.terakilogram  : Double
        get() = this.value / 10.0.pow(9)
    
    @JvmField()         
    val Tkg = Kilogram(10.0.pow(9))
    val terakilogram = Tkg          

    val Number.Gkg : Kilogram
        @JvmName("getGkg_prop")
        get() = Kilogram(10.0.pow(6))
    
    val Number.gigakilogram : Kilogram
        get() = Kilogram(10.0.pow(6))
    
    val Kilogram.Gkg  : Double
        @JvmName("getGkg_prop")
        get() = this.value / 10.0.pow(6)
    
    val Kilogram.gigakilogram  : Double
        get() = this.value / 10.0.pow(6)
    
    @JvmField()         
    val Gkg = Kilogram(10.0.pow(6))
    val gigakilogram = Gkg          

    val Number.Mkg : Kilogram
        @JvmName("getMkg_prop")
        get() = Kilogram(10.0.pow(3))
    
    val Number.megakilogram : Kilogram
        get() = Kilogram(10.0.pow(3))
    
    val Kilogram.Mkg  : Double
        @JvmName("getMkg_prop")
        get() = this.value / 10.0.pow(3)
    
    val Kilogram.megakilogram  : Double
        get() = this.value / 10.0.pow(3)
    
    @JvmField()         
    val Mkg = Kilogram(10.0.pow(3))
    val megakilogram = Mkg          

    val Number.hkg : Kilogram
        get() = Kilogram(10.0.pow(-1))
    
    val Number.hectokilogram : Kilogram
        get() = Kilogram(10.0.pow(-1))
    
    val Kilogram.hkg  : Double
        get() = this.value / 10.0.pow(-1)
    
    val Kilogram.hectokilogram  : Double
        get() = this.value / 10.0.pow(-1)
    
    @JvmField()         
    val hkg = Kilogram(10.0.pow(-1))
    val hectokilogram = hkg          

    val Number.dakg : Kilogram
        get() = Kilogram(10.0.pow(-2))
    
    val Number.decakilogram : Kilogram
        get() = Kilogram(10.0.pow(-2))
    
    val Kilogram.dakg  : Double
        get() = this.value / 10.0.pow(-2)
    
    val Kilogram.decakilogram  : Double
        get() = this.value / 10.0.pow(-2)
    
    @JvmField()         
    val dakg = Kilogram(10.0.pow(-2))
    val decakilogram = dakg          

    val Number.dkg : Kilogram
        get() = Kilogram(10.0.pow(-4))
    
    val Number.decikilogram : Kilogram
        get() = Kilogram(10.0.pow(-4))
    
    val Kilogram.dkg  : Double
        get() = this.value / 10.0.pow(-4)
    
    val Kilogram.decikilogram  : Double
        get() = this.value / 10.0.pow(-4)
    
    @JvmField()         
    val dkg = Kilogram(10.0.pow(-4))
    val decikilogram = dkg          

    val Number.ckg : Kilogram
        get() = Kilogram(10.0.pow(-5))
    
    val Number.centikilogram : Kilogram
        get() = Kilogram(10.0.pow(-5))
    
    val Kilogram.ckg  : Double
        get() = this.value / 10.0.pow(-5)
    
    val Kilogram.centikilogram  : Double
        get() = this.value / 10.0.pow(-5)
    
    @JvmField()         
    val ckg = Kilogram(10.0.pow(-5))
    val centikilogram = ckg          

    val Number.mkg : Kilogram
        get() = Kilogram(10.0.pow(-6))
    
    val Number.millikilogram : Kilogram
        get() = Kilogram(10.0.pow(-6))
    
    val Kilogram.mkg  : Double
        get() = this.value / 10.0.pow(-6)
    
    val Kilogram.millikilogram  : Double
        get() = this.value / 10.0.pow(-6)
    
    @JvmField()         
    val mkg = Kilogram(10.0.pow(-6))
    val millikilogram = mkg          

    val Number.μkg : Kilogram
        get() = Kilogram(10.0.pow(-9))
    
    val Number.microkilogram : Kilogram
        get() = Kilogram(10.0.pow(-9))
    
    val Kilogram.μkg  : Double
        get() = this.value / 10.0.pow(-9)
    
    val Kilogram.microkilogram  : Double
        get() = this.value / 10.0.pow(-9)
    
    @JvmField()         
    val μkg = Kilogram(10.0.pow(-9))
    val microkilogram = μkg          

    val Number.nkg : Kilogram
        get() = Kilogram(10.0.pow(-12))
    
    val Number.nanokilogram : Kilogram
        get() = Kilogram(10.0.pow(-12))
    
    val Kilogram.nkg  : Double
        get() = this.value / 10.0.pow(-12)
    
    val Kilogram.nanokilogram  : Double
        get() = this.value / 10.0.pow(-12)
    
    @JvmField()         
    val nkg = Kilogram(10.0.pow(-12))
    val nanokilogram = nkg          

    val Number.pkg : Kilogram
        get() = Kilogram(10.0.pow(-15))
    
    val Number.picokilogram : Kilogram
        get() = Kilogram(10.0.pow(-15))
    
    val Kilogram.pkg  : Double
        get() = this.value / 10.0.pow(-15)
    
    val Kilogram.picokilogram  : Double
        get() = this.value / 10.0.pow(-15)
    
    @JvmField()         
    val pkg = Kilogram(10.0.pow(-15))
    val picokilogram = pkg          

    val Number.fkg : Kilogram
        get() = Kilogram(10.0.pow(-18))
    
    val Number.femtokilogram : Kilogram
        get() = Kilogram(10.0.pow(-18))
    
    val Kilogram.fkg  : Double
        get() = this.value / 10.0.pow(-18)
    
    val Kilogram.femtokilogram  : Double
        get() = this.value / 10.0.pow(-18)
    
    @JvmField()         
    val fkg = Kilogram(10.0.pow(-18))
    val femtokilogram = fkg          

    val Number.akg : Kilogram
        get() = Kilogram(10.0.pow(-21))
    
    val Number.attokilogram : Kilogram
        get() = Kilogram(10.0.pow(-21))
    
    val Kilogram.akg  : Double
        get() = this.value / 10.0.pow(-21)
    
    val Kilogram.attokilogram  : Double
        get() = this.value / 10.0.pow(-21)
    
    @JvmField()         
    val akg = Kilogram(10.0.pow(-21))
    val attokilogram = akg          

    val Number.zkg : Kilogram
        get() = Kilogram(10.0.pow(-24))
    
    val Number.zeptokilogram : Kilogram
        get() = Kilogram(10.0.pow(-24))
    
    val Kilogram.zkg  : Double
        get() = this.value / 10.0.pow(-24)
    
    val Kilogram.zeptokilogram  : Double
        get() = this.value / 10.0.pow(-24)
    
    @JvmField()         
    val zkg = Kilogram(10.0.pow(-24))
    val zeptokilogram = zkg          

    val Number.ykg : Kilogram
        get() = Kilogram(10.0.pow(-27))
    
    val Number.yoctokilogram : Kilogram
        get() = Kilogram(10.0.pow(-27))
    
    val Kilogram.ykg  : Double
        get() = this.value / 10.0.pow(-27)
    
    val Kilogram.yoctokilogram  : Double
        get() = this.value / 10.0.pow(-27)
    
    @JvmField()         
    val ykg = Kilogram(10.0.pow(-27))
    val yoctokilogram = ykg          