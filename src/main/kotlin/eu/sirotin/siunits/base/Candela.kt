
package eu.sirotin.siunits.base

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
    
    @JvmField()         
    val Ycd = Candela(10.0.pow(24))
    val yottacandela = Ycd          

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
    
    @JvmField()         
    val Zcd = Candela(10.0.pow(21))
    val zettacandela = Zcd          

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
    
    @JvmField()         
    val Ecd = Candela(10.0.pow(18))
    val exacandela = Ecd          

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
    
    @JvmField()         
    val Pcd = Candela(10.0.pow(15))
    val petacandela = Pcd          

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
    
    @JvmField()         
    val Tcd = Candela(10.0.pow(12))
    val teracandela = Tcd          

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
    
    @JvmField()         
    val Gcd = Candela(10.0.pow(9))
    val gigacandela = Gcd          

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
    
    @JvmField()         
    val Mcd = Candela(10.0.pow(6))
    val megacandela = Mcd          

    val Number.kcd : Candela
        get() = Candela(10.0.pow(3))
    
    val Number.kilocandela : Candela
        get() = Candela(10.0.pow(3))
    
    val Candela.kcd  : Double
        get() = this.value / 10.0.pow(3)
    
    val Candela.kilocandela  : Double
        get() = this.value / 10.0.pow(3)
    
    @JvmField()         
    val kcd = Candela(10.0.pow(3))
    val kilocandela = kcd          

    val Number.hcd : Candela
        get() = Candela(10.0.pow(2))
    
    val Number.hectocandela : Candela
        get() = Candela(10.0.pow(2))
    
    val Candela.hcd  : Double
        get() = this.value / 10.0.pow(2)
    
    val Candela.hectocandela  : Double
        get() = this.value / 10.0.pow(2)
    
    @JvmField()         
    val hcd = Candela(10.0.pow(2))
    val hectocandela = hcd          

    val Number.dacd : Candela
        get() = Candela(10.0.pow(1))
    
    val Number.decacandela : Candela
        get() = Candela(10.0.pow(1))
    
    val Candela.dacd  : Double
        get() = this.value / 10.0.pow(1)
    
    val Candela.decacandela  : Double
        get() = this.value / 10.0.pow(1)
    
    @JvmField()         
    val dacd = Candela(10.0.pow(1))
    val decacandela = dacd          

    val Number.dcd : Candela
        get() = Candela(10.0.pow(-1))
    
    val Number.decicandela : Candela
        get() = Candela(10.0.pow(-1))
    
    val Candela.dcd  : Double
        get() = this.value / 10.0.pow(-1)
    
    val Candela.decicandela  : Double
        get() = this.value / 10.0.pow(-1)
    
    @JvmField()         
    val dcd = Candela(10.0.pow(-1))
    val decicandela = dcd          

    val Number.ccd : Candela
        get() = Candela(10.0.pow(-2))
    
    val Number.centicandela : Candela
        get() = Candela(10.0.pow(-2))
    
    val Candela.ccd  : Double
        get() = this.value / 10.0.pow(-2)
    
    val Candela.centicandela  : Double
        get() = this.value / 10.0.pow(-2)
    
    @JvmField()         
    val ccd = Candela(10.0.pow(-2))
    val centicandela = ccd          

    val Number.mcd : Candela
        get() = Candela(10.0.pow(-3))
    
    val Number.millicandela : Candela
        get() = Candela(10.0.pow(-3))
    
    val Candela.mcd  : Double
        get() = this.value / 10.0.pow(-3)
    
    val Candela.millicandela  : Double
        get() = this.value / 10.0.pow(-3)
    
    @JvmField()         
    val mcd = Candela(10.0.pow(-3))
    val millicandela = mcd          

    val Number.μcd : Candela
        get() = Candela(10.0.pow(-6))
    
    val Number.microcandela : Candela
        get() = Candela(10.0.pow(-6))
    
    val Candela.μcd  : Double
        get() = this.value / 10.0.pow(-6)
    
    val Candela.microcandela  : Double
        get() = this.value / 10.0.pow(-6)
    
    @JvmField()         
    val μcd = Candela(10.0.pow(-6))
    val microcandela = μcd          

    val Number.ncd : Candela
        get() = Candela(10.0.pow(-9))
    
    val Number.nanocandela : Candela
        get() = Candela(10.0.pow(-9))
    
    val Candela.ncd  : Double
        get() = this.value / 10.0.pow(-9)
    
    val Candela.nanocandela  : Double
        get() = this.value / 10.0.pow(-9)
    
    @JvmField()         
    val ncd = Candela(10.0.pow(-9))
    val nanocandela = ncd          

    val Number.pcd : Candela
        get() = Candela(10.0.pow(-12))
    
    val Number.picocandela : Candela
        get() = Candela(10.0.pow(-12))
    
    val Candela.pcd  : Double
        get() = this.value / 10.0.pow(-12)
    
    val Candela.picocandela  : Double
        get() = this.value / 10.0.pow(-12)
    
    @JvmField()         
    val pcd = Candela(10.0.pow(-12))
    val picocandela = pcd          

    val Number.fcd : Candela
        get() = Candela(10.0.pow(-15))
    
    val Number.femtocandela : Candela
        get() = Candela(10.0.pow(-15))
    
    val Candela.fcd  : Double
        get() = this.value / 10.0.pow(-15)
    
    val Candela.femtocandela  : Double
        get() = this.value / 10.0.pow(-15)
    
    @JvmField()         
    val fcd = Candela(10.0.pow(-15))
    val femtocandela = fcd          

    val Number.acd : Candela
        get() = Candela(10.0.pow(-18))
    
    val Number.attocandela : Candela
        get() = Candela(10.0.pow(-18))
    
    val Candela.acd  : Double
        get() = this.value / 10.0.pow(-18)
    
    val Candela.attocandela  : Double
        get() = this.value / 10.0.pow(-18)
    
    @JvmField()         
    val acd = Candela(10.0.pow(-18))
    val attocandela = acd          

    val Number.zcd : Candela
        get() = Candela(10.0.pow(-21))
    
    val Number.zeptocandela : Candela
        get() = Candela(10.0.pow(-21))
    
    val Candela.zcd  : Double
        get() = this.value / 10.0.pow(-21)
    
    val Candela.zeptocandela  : Double
        get() = this.value / 10.0.pow(-21)
    
    @JvmField()         
    val zcd = Candela(10.0.pow(-21))
    val zeptocandela = zcd          

    val Number.ycd : Candela
        get() = Candela(10.0.pow(-24))
    
    val Number.yoctocandela : Candela
        get() = Candela(10.0.pow(-24))
    
    val Candela.ycd  : Double
        get() = this.value / 10.0.pow(-24)
    
    val Candela.yoctocandela  : Double
        get() = this.value / 10.0.pow(-24)
    
    @JvmField()         
    val ycd = Candela(10.0.pow(-24))
    val yoctocandela = ycd          