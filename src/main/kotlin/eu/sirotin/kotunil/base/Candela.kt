
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.math.pow
private val descriptionCandela = UnitSpecification(
    "cd",
    "J",
    40
) { v: Double -> Candela(v) }

/**
 * System International Unit for luminous intensity.
 *
 * @constructor Creates an unit with given [value].
 */
class Candela(value: Double) : TermUnit(value, description = descriptionCandela)
    /**
     * Creates Candela-Object for current number value. Candela is a System International Unit for luminous intensity.
     */
    val Number.cd : Candela
        /**
         * Returns Candela-Object for current number value. Candela is a System International Unit for luminous intensity.
         */
        get() = Candela(this.toDouble())
    
    /**
     * System International Unit for luminous intensity.
     */
    val cd = Candela(1.0)       
    
    /**
     * Qcd, (10^30 of candela)
     */    
    val Number.Qcd : Candela
        /**
         * Returns Qcd, (10^30 of candela)
         */ 
        @JvmName("getQcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(30))
    
    /**
     * Qcd, (10^30 of candela)
     */ 
    val Number.quettacandela : Candela
        /**
         * Returns Qcd (10^30 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(30))
    
    /**
     * Returns numerical value of Qcd, (10^30 of candela)
     */
    val Candela.Qcd  : Double
        /**
         * Returns numerical value of Qcd, (10^30 of candela)
         */
        @JvmName("getQcd_prop")
        get() = this.value / 10.0.pow(30)
    
    /**
     * Returns numerical value of Qcd (10^30 of candela)
     */
    val Candela.quettacandela  : Double
        /**
         * Returns numerical value of Qcd, (10^30 of candela)
         */
        get() = this.value / 10.0.pow(30)
    
    @JvmField()
    /**
     * Qcd (10^30 of candela)
     */
    val Qcd = Candela(10.0.pow(30))
    
    /**
     * Qcd, (10^30 of candela)
     */
    val quettacandela = Qcd          

    /**
     * Rcd, (10^27 of candela)
     */    
    val Number.Rcd : Candela
        /**
         * Returns Rcd, (10^27 of candela)
         */ 
        @JvmName("getRcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(27))
    
    /**
     * Rcd, (10^27 of candela)
     */ 
    val Number.ronnacandela : Candela
        /**
         * Returns Rcd (10^27 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(27))
    
    /**
     * Returns numerical value of Rcd, (10^27 of candela)
     */
    val Candela.Rcd  : Double
        /**
         * Returns numerical value of Rcd, (10^27 of candela)
         */
        @JvmName("getRcd_prop")
        get() = this.value / 10.0.pow(27)
    
    /**
     * Returns numerical value of Rcd (10^27 of candela)
     */
    val Candela.ronnacandela  : Double
        /**
         * Returns numerical value of Rcd, (10^27 of candela)
         */
        get() = this.value / 10.0.pow(27)
    
    @JvmField()
    /**
     * Rcd (10^27 of candela)
     */
    val Rcd = Candela(10.0.pow(27))
    
    /**
     * Rcd, (10^27 of candela)
     */
    val ronnacandela = Rcd          

    /**
     * Ycd, (10^24 of candela)
     */    
    val Number.Ycd : Candela
        /**
         * Returns Ycd, (10^24 of candela)
         */ 
        @JvmName("getYcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(24))
    
    /**
     * Ycd, (10^24 of candela)
     */ 
    val Number.yottacandela : Candela
        /**
         * Returns Ycd (10^24 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(24))
    
    /**
     * Returns numerical value of Ycd, (10^24 of candela)
     */
    val Candela.Ycd  : Double
        /**
         * Returns numerical value of Ycd, (10^24 of candela)
         */
        @JvmName("getYcd_prop")
        get() = this.value / 10.0.pow(24)
    
    /**
     * Returns numerical value of Ycd (10^24 of candela)
     */
    val Candela.yottacandela  : Double
        /**
         * Returns numerical value of Ycd, (10^24 of candela)
         */
        get() = this.value / 10.0.pow(24)
    
    @JvmField()
    /**
     * Ycd (10^24 of candela)
     */
    val Ycd = Candela(10.0.pow(24))
    
    /**
     * Ycd, (10^24 of candela)
     */
    val yottacandela = Ycd          

    /**
     * Zcd, (10^21 of candela)
     */    
    val Number.Zcd : Candela
        /**
         * Returns Zcd, (10^21 of candela)
         */ 
        @JvmName("getZcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(21))
    
    /**
     * Zcd, (10^21 of candela)
     */ 
    val Number.zettacandela : Candela
        /**
         * Returns Zcd (10^21 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(21))
    
    /**
     * Returns numerical value of Zcd, (10^21 of candela)
     */
    val Candela.Zcd  : Double
        /**
         * Returns numerical value of Zcd, (10^21 of candela)
         */
        @JvmName("getZcd_prop")
        get() = this.value / 10.0.pow(21)
    
    /**
     * Returns numerical value of Zcd (10^21 of candela)
     */
    val Candela.zettacandela  : Double
        /**
         * Returns numerical value of Zcd, (10^21 of candela)
         */
        get() = this.value / 10.0.pow(21)
    
    @JvmField()
    /**
     * Zcd (10^21 of candela)
     */
    val Zcd = Candela(10.0.pow(21))
    
    /**
     * Zcd, (10^21 of candela)
     */
    val zettacandela = Zcd          

    /**
     * Ecd, (10^18 of candela)
     */    
    val Number.Ecd : Candela
        /**
         * Returns Ecd, (10^18 of candela)
         */ 
        @JvmName("getEcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(18))
    
    /**
     * Ecd, (10^18 of candela)
     */ 
    val Number.exacandela : Candela
        /**
         * Returns Ecd (10^18 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(18))
    
    /**
     * Returns numerical value of Ecd, (10^18 of candela)
     */
    val Candela.Ecd  : Double
        /**
         * Returns numerical value of Ecd, (10^18 of candela)
         */
        @JvmName("getEcd_prop")
        get() = this.value / 10.0.pow(18)
    
    /**
     * Returns numerical value of Ecd (10^18 of candela)
     */
    val Candela.exacandela  : Double
        /**
         * Returns numerical value of Ecd, (10^18 of candela)
         */
        get() = this.value / 10.0.pow(18)
    
    @JvmField()
    /**
     * Ecd (10^18 of candela)
     */
    val Ecd = Candela(10.0.pow(18))
    
    /**
     * Ecd, (10^18 of candela)
     */
    val exacandela = Ecd          

    /**
     * Pcd, (10^15 of candela)
     */    
    val Number.Pcd : Candela
        /**
         * Returns Pcd, (10^15 of candela)
         */ 
        @JvmName("getPcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(15))
    
    /**
     * Pcd, (10^15 of candela)
     */ 
    val Number.petacandela : Candela
        /**
         * Returns Pcd (10^15 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(15))
    
    /**
     * Returns numerical value of Pcd, (10^15 of candela)
     */
    val Candela.Pcd  : Double
        /**
         * Returns numerical value of Pcd, (10^15 of candela)
         */
        @JvmName("getPcd_prop")
        get() = this.value / 10.0.pow(15)
    
    /**
     * Returns numerical value of Pcd (10^15 of candela)
     */
    val Candela.petacandela  : Double
        /**
         * Returns numerical value of Pcd, (10^15 of candela)
         */
        get() = this.value / 10.0.pow(15)
    
    @JvmField()
    /**
     * Pcd (10^15 of candela)
     */
    val Pcd = Candela(10.0.pow(15))
    
    /**
     * Pcd, (10^15 of candela)
     */
    val petacandela = Pcd          

    /**
     * Tcd, (10^12 of candela)
     */    
    val Number.Tcd : Candela
        /**
         * Returns Tcd, (10^12 of candela)
         */ 
        @JvmName("getTcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(12))
    
    /**
     * Tcd, (10^12 of candela)
     */ 
    val Number.teracandela : Candela
        /**
         * Returns Tcd (10^12 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(12))
    
    /**
     * Returns numerical value of Tcd, (10^12 of candela)
     */
    val Candela.Tcd  : Double
        /**
         * Returns numerical value of Tcd, (10^12 of candela)
         */
        @JvmName("getTcd_prop")
        get() = this.value / 10.0.pow(12)
    
    /**
     * Returns numerical value of Tcd (10^12 of candela)
     */
    val Candela.teracandela  : Double
        /**
         * Returns numerical value of Tcd, (10^12 of candela)
         */
        get() = this.value / 10.0.pow(12)
    
    @JvmField()
    /**
     * Tcd (10^12 of candela)
     */
    val Tcd = Candela(10.0.pow(12))
    
    /**
     * Tcd, (10^12 of candela)
     */
    val teracandela = Tcd          

    /**
     * Gcd, (10^9 of candela)
     */    
    val Number.Gcd : Candela
        /**
         * Returns Gcd, (10^9 of candela)
         */ 
        @JvmName("getGcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(9))
    
    /**
     * Gcd, (10^9 of candela)
     */ 
    val Number.gigacandela : Candela
        /**
         * Returns Gcd (10^9 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(9))
    
    /**
     * Returns numerical value of Gcd, (10^9 of candela)
     */
    val Candela.Gcd  : Double
        /**
         * Returns numerical value of Gcd, (10^9 of candela)
         */
        @JvmName("getGcd_prop")
        get() = this.value / 10.0.pow(9)
    
    /**
     * Returns numerical value of Gcd (10^9 of candela)
     */
    val Candela.gigacandela  : Double
        /**
         * Returns numerical value of Gcd, (10^9 of candela)
         */
        get() = this.value / 10.0.pow(9)
    
    @JvmField()
    /**
     * Gcd (10^9 of candela)
     */
    val Gcd = Candela(10.0.pow(9))
    
    /**
     * Gcd, (10^9 of candela)
     */
    val gigacandela = Gcd          

    /**
     * Mcd, (10^6 of candela)
     */    
    val Number.Mcd : Candela
        /**
         * Returns Mcd, (10^6 of candela)
         */ 
        @JvmName("getMcd_prop")
        get() = Candela(this.toDouble()*10.0.pow(6))
    
    /**
     * Mcd, (10^6 of candela)
     */ 
    val Number.megacandela : Candela
        /**
         * Returns Mcd (10^6 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(6))
    
    /**
     * Returns numerical value of Mcd, (10^6 of candela)
     */
    val Candela.Mcd  : Double
        /**
         * Returns numerical value of Mcd, (10^6 of candela)
         */
        @JvmName("getMcd_prop")
        get() = this.value / 10.0.pow(6)
    
    /**
     * Returns numerical value of Mcd (10^6 of candela)
     */
    val Candela.megacandela  : Double
        /**
         * Returns numerical value of Mcd, (10^6 of candela)
         */
        get() = this.value / 10.0.pow(6)
    
    @JvmField()
    /**
     * Mcd (10^6 of candela)
     */
    val Mcd = Candela(10.0.pow(6))
    
    /**
     * Mcd, (10^6 of candela)
     */
    val megacandela = Mcd          

    /**
     * kcd, (10^3 of candela)
     */    
    val Number.kcd : Candela
        /**
         * Returns kcd, (10^3 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(3))
    
    /**
     * kcd, (10^3 of candela)
     */ 
    val Number.kilocandela : Candela
        /**
         * Returns kcd (10^3 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(3))
    
    /**
     * Returns numerical value of kcd, (10^3 of candela)
     */
    val Candela.kcd  : Double
        /**
         * Returns numerical value of kcd, (10^3 of candela)
         */
        get() = this.value / 10.0.pow(3)
    
    /**
     * Returns numerical value of kcd (10^3 of candela)
     */
    val Candela.kilocandela  : Double
        /**
         * Returns numerical value of kcd, (10^3 of candela)
         */
        get() = this.value / 10.0.pow(3)
    
    @JvmField()
    /**
     * kcd (10^3 of candela)
     */
    val kcd = Candela(10.0.pow(3))
    
    /**
     * kcd, (10^3 of candela)
     */
    val kilocandela = kcd          

    /**
     * hcd, (10^2 of candela)
     */    
    val Number.hcd : Candela
        /**
         * Returns hcd, (10^2 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(2))
    
    /**
     * hcd, (10^2 of candela)
     */ 
    val Number.hectocandela : Candela
        /**
         * Returns hcd (10^2 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(2))
    
    /**
     * Returns numerical value of hcd, (10^2 of candela)
     */
    val Candela.hcd  : Double
        /**
         * Returns numerical value of hcd, (10^2 of candela)
         */
        get() = this.value / 10.0.pow(2)
    
    /**
     * Returns numerical value of hcd (10^2 of candela)
     */
    val Candela.hectocandela  : Double
        /**
         * Returns numerical value of hcd, (10^2 of candela)
         */
        get() = this.value / 10.0.pow(2)
    
    @JvmField()
    /**
     * hcd (10^2 of candela)
     */
    val hcd = Candela(10.0.pow(2))
    
    /**
     * hcd, (10^2 of candela)
     */
    val hectocandela = hcd          

    /**
     * dacd, (10^1 of candela)
     */    
    val Number.dacd : Candela
        /**
         * Returns dacd, (10^1 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(1))
    
    /**
     * dacd, (10^1 of candela)
     */ 
    val Number.decacandela : Candela
        /**
         * Returns dacd (10^1 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(1))
    
    /**
     * Returns numerical value of dacd, (10^1 of candela)
     */
    val Candela.dacd  : Double
        /**
         * Returns numerical value of dacd, (10^1 of candela)
         */
        get() = this.value / 10.0.pow(1)
    
    /**
     * Returns numerical value of dacd (10^1 of candela)
     */
    val Candela.decacandela  : Double
        /**
         * Returns numerical value of dacd, (10^1 of candela)
         */
        get() = this.value / 10.0.pow(1)
    
    @JvmField()
    /**
     * dacd (10^1 of candela)
     */
    val dacd = Candela(10.0.pow(1))
    
    /**
     * dacd, (10^1 of candela)
     */
    val decacandela = dacd          

    /**
     * dcd, (10^-1 of candela)
     */    
    val Number.dcd : Candela
        /**
         * Returns dcd, (10^-1 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-1))
    
    /**
     * dcd, (10^-1 of candela)
     */ 
    val Number.decicandela : Candela
        /**
         * Returns dcd (10^-1 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-1))
    
    /**
     * Returns numerical value of dcd, (10^-1 of candela)
     */
    val Candela.dcd  : Double
        /**
         * Returns numerical value of dcd, (10^-1 of candela)
         */
        get() = this.value / 10.0.pow(-1)
    
    /**
     * Returns numerical value of dcd (10^-1 of candela)
     */
    val Candela.decicandela  : Double
        /**
         * Returns numerical value of dcd, (10^-1 of candela)
         */
        get() = this.value / 10.0.pow(-1)
    
    @JvmField()
    /**
     * dcd (10^-1 of candela)
     */
    val dcd = Candela(10.0.pow(-1))
    
    /**
     * dcd, (10^-1 of candela)
     */
    val decicandela = dcd          

    /**
     * ccd, (10^-2 of candela)
     */    
    val Number.ccd : Candela
        /**
         * Returns ccd, (10^-2 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-2))
    
    /**
     * ccd, (10^-2 of candela)
     */ 
    val Number.centicandela : Candela
        /**
         * Returns ccd (10^-2 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-2))
    
    /**
     * Returns numerical value of ccd, (10^-2 of candela)
     */
    val Candela.ccd  : Double
        /**
         * Returns numerical value of ccd, (10^-2 of candela)
         */
        get() = this.value / 10.0.pow(-2)
    
    /**
     * Returns numerical value of ccd (10^-2 of candela)
     */
    val Candela.centicandela  : Double
        /**
         * Returns numerical value of ccd, (10^-2 of candela)
         */
        get() = this.value / 10.0.pow(-2)
    
    @JvmField()
    /**
     * ccd (10^-2 of candela)
     */
    val ccd = Candela(10.0.pow(-2))
    
    /**
     * ccd, (10^-2 of candela)
     */
    val centicandela = ccd          

    /**
     * mcd, (10^-3 of candela)
     */    
    val Number.mcd : Candela
        /**
         * Returns mcd, (10^-3 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-3))
    
    /**
     * mcd, (10^-3 of candela)
     */ 
    val Number.millicandela : Candela
        /**
         * Returns mcd (10^-3 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-3))
    
    /**
     * Returns numerical value of mcd, (10^-3 of candela)
     */
    val Candela.mcd  : Double
        /**
         * Returns numerical value of mcd, (10^-3 of candela)
         */
        get() = this.value / 10.0.pow(-3)
    
    /**
     * Returns numerical value of mcd (10^-3 of candela)
     */
    val Candela.millicandela  : Double
        /**
         * Returns numerical value of mcd, (10^-3 of candela)
         */
        get() = this.value / 10.0.pow(-3)
    
    @JvmField()
    /**
     * mcd (10^-3 of candela)
     */
    val mcd = Candela(10.0.pow(-3))
    
    /**
     * mcd, (10^-3 of candela)
     */
    val millicandela = mcd          

    /**
     * μcd, (10^-6 of candela)
     */    
    val Number.μcd : Candela
        /**
         * Returns μcd, (10^-6 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-6))
    
    /**
     * μcd, (10^-6 of candela)
     */ 
    val Number.microcandela : Candela
        /**
         * Returns μcd (10^-6 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-6))
    
    /**
     * Returns numerical value of μcd, (10^-6 of candela)
     */
    val Candela.μcd  : Double
        /**
         * Returns numerical value of μcd, (10^-6 of candela)
         */
        get() = this.value / 10.0.pow(-6)
    
    /**
     * Returns numerical value of μcd (10^-6 of candela)
     */
    val Candela.microcandela  : Double
        /**
         * Returns numerical value of μcd, (10^-6 of candela)
         */
        get() = this.value / 10.0.pow(-6)
    
    @JvmField()
    /**
     * μcd (10^-6 of candela)
     */
    val μcd = Candela(10.0.pow(-6))
    
    /**
     * μcd, (10^-6 of candela)
     */
    val microcandela = μcd          

    /**
     * ncd, (10^-9 of candela)
     */    
    val Number.ncd : Candela
        /**
         * Returns ncd, (10^-9 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-9))
    
    /**
     * ncd, (10^-9 of candela)
     */ 
    val Number.nanocandela : Candela
        /**
         * Returns ncd (10^-9 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-9))
    
    /**
     * Returns numerical value of ncd, (10^-9 of candela)
     */
    val Candela.ncd  : Double
        /**
         * Returns numerical value of ncd, (10^-9 of candela)
         */
        get() = this.value / 10.0.pow(-9)
    
    /**
     * Returns numerical value of ncd (10^-9 of candela)
     */
    val Candela.nanocandela  : Double
        /**
         * Returns numerical value of ncd, (10^-9 of candela)
         */
        get() = this.value / 10.0.pow(-9)
    
    @JvmField()
    /**
     * ncd (10^-9 of candela)
     */
    val ncd = Candela(10.0.pow(-9))
    
    /**
     * ncd, (10^-9 of candela)
     */
    val nanocandela = ncd          

    /**
     * pcd, (10^-12 of candela)
     */    
    val Number.pcd : Candela
        /**
         * Returns pcd, (10^-12 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-12))
    
    /**
     * pcd, (10^-12 of candela)
     */ 
    val Number.picocandela : Candela
        /**
         * Returns pcd (10^-12 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-12))
    
    /**
     * Returns numerical value of pcd, (10^-12 of candela)
     */
    val Candela.pcd  : Double
        /**
         * Returns numerical value of pcd, (10^-12 of candela)
         */
        get() = this.value / 10.0.pow(-12)
    
    /**
     * Returns numerical value of pcd (10^-12 of candela)
     */
    val Candela.picocandela  : Double
        /**
         * Returns numerical value of pcd, (10^-12 of candela)
         */
        get() = this.value / 10.0.pow(-12)
    
    @JvmField()
    /**
     * pcd (10^-12 of candela)
     */
    val pcd = Candela(10.0.pow(-12))
    
    /**
     * pcd, (10^-12 of candela)
     */
    val picocandela = pcd          

    /**
     * fcd, (10^-15 of candela)
     */    
    val Number.fcd : Candela
        /**
         * Returns fcd, (10^-15 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-15))
    
    /**
     * fcd, (10^-15 of candela)
     */ 
    val Number.femtocandela : Candela
        /**
         * Returns fcd (10^-15 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-15))
    
    /**
     * Returns numerical value of fcd, (10^-15 of candela)
     */
    val Candela.fcd  : Double
        /**
         * Returns numerical value of fcd, (10^-15 of candela)
         */
        get() = this.value / 10.0.pow(-15)
    
    /**
     * Returns numerical value of fcd (10^-15 of candela)
     */
    val Candela.femtocandela  : Double
        /**
         * Returns numerical value of fcd, (10^-15 of candela)
         */
        get() = this.value / 10.0.pow(-15)
    
    @JvmField()
    /**
     * fcd (10^-15 of candela)
     */
    val fcd = Candela(10.0.pow(-15))
    
    /**
     * fcd, (10^-15 of candela)
     */
    val femtocandela = fcd          

    /**
     * acd, (10^-18 of candela)
     */    
    val Number.acd : Candela
        /**
         * Returns acd, (10^-18 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-18))
    
    /**
     * acd, (10^-18 of candela)
     */ 
    val Number.attocandela : Candela
        /**
         * Returns acd (10^-18 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-18))
    
    /**
     * Returns numerical value of acd, (10^-18 of candela)
     */
    val Candela.acd  : Double
        /**
         * Returns numerical value of acd, (10^-18 of candela)
         */
        get() = this.value / 10.0.pow(-18)
    
    /**
     * Returns numerical value of acd (10^-18 of candela)
     */
    val Candela.attocandela  : Double
        /**
         * Returns numerical value of acd, (10^-18 of candela)
         */
        get() = this.value / 10.0.pow(-18)
    
    @JvmField()
    /**
     * acd (10^-18 of candela)
     */
    val acd = Candela(10.0.pow(-18))
    
    /**
     * acd, (10^-18 of candela)
     */
    val attocandela = acd          

    /**
     * zcd, (10^-21 of candela)
     */    
    val Number.zcd : Candela
        /**
         * Returns zcd, (10^-21 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-21))
    
    /**
     * zcd, (10^-21 of candela)
     */ 
    val Number.zeptocandela : Candela
        /**
         * Returns zcd (10^-21 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-21))
    
    /**
     * Returns numerical value of zcd, (10^-21 of candela)
     */
    val Candela.zcd  : Double
        /**
         * Returns numerical value of zcd, (10^-21 of candela)
         */
        get() = this.value / 10.0.pow(-21)
    
    /**
     * Returns numerical value of zcd (10^-21 of candela)
     */
    val Candela.zeptocandela  : Double
        /**
         * Returns numerical value of zcd, (10^-21 of candela)
         */
        get() = this.value / 10.0.pow(-21)
    
    @JvmField()
    /**
     * zcd (10^-21 of candela)
     */
    val zcd = Candela(10.0.pow(-21))
    
    /**
     * zcd, (10^-21 of candela)
     */
    val zeptocandela = zcd          

    /**
     * ycd, (10^-24 of candela)
     */    
    val Number.ycd : Candela
        /**
         * Returns ycd, (10^-24 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-24))
    
    /**
     * ycd, (10^-24 of candela)
     */ 
    val Number.yoctocandela : Candela
        /**
         * Returns ycd (10^-24 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-24))
    
    /**
     * Returns numerical value of ycd, (10^-24 of candela)
     */
    val Candela.ycd  : Double
        /**
         * Returns numerical value of ycd, (10^-24 of candela)
         */
        get() = this.value / 10.0.pow(-24)
    
    /**
     * Returns numerical value of ycd (10^-24 of candela)
     */
    val Candela.yoctocandela  : Double
        /**
         * Returns numerical value of ycd, (10^-24 of candela)
         */
        get() = this.value / 10.0.pow(-24)
    
    @JvmField()
    /**
     * ycd (10^-24 of candela)
     */
    val ycd = Candela(10.0.pow(-24))
    
    /**
     * ycd, (10^-24 of candela)
     */
    val yoctocandela = ycd          

    /**
     * rcd, (10^-27 of candela)
     */    
    val Number.rcd : Candela
        /**
         * Returns rcd, (10^-27 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-27))
    
    /**
     * rcd, (10^-27 of candela)
     */ 
    val Number.rontocandela : Candela
        /**
         * Returns rcd (10^-27 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-27))
    
    /**
     * Returns numerical value of rcd, (10^-27 of candela)
     */
    val Candela.rcd  : Double
        /**
         * Returns numerical value of rcd, (10^-27 of candela)
         */
        get() = this.value / 10.0.pow(-27)
    
    /**
     * Returns numerical value of rcd (10^-27 of candela)
     */
    val Candela.rontocandela  : Double
        /**
         * Returns numerical value of rcd, (10^-27 of candela)
         */
        get() = this.value / 10.0.pow(-27)
    
    @JvmField()
    /**
     * rcd (10^-27 of candela)
     */
    val rcd = Candela(10.0.pow(-27))
    
    /**
     * rcd, (10^-27 of candela)
     */
    val rontocandela = rcd          

    /**
     * qcd, (10^-30 of candela)
     */    
    val Number.qcd : Candela
        /**
         * Returns qcd, (10^-30 of candela)
         */ 
        get() = Candela(this.toDouble()*10.0.pow(-30))
    
    /**
     * qcd, (10^-30 of candela)
     */ 
    val Number.quectocandela : Candela
        /**
         * Returns qcd (10^-30 of candela)
         */
        get() = Candela(this.toDouble()*10.0.pow(-30))
    
    /**
     * Returns numerical value of qcd, (10^-30 of candela)
     */
    val Candela.qcd  : Double
        /**
         * Returns numerical value of qcd, (10^-30 of candela)
         */
        get() = this.value / 10.0.pow(-30)
    
    /**
     * Returns numerical value of qcd (10^-30 of candela)
     */
    val Candela.quectocandela  : Double
        /**
         * Returns numerical value of qcd, (10^-30 of candela)
         */
        get() = this.value / 10.0.pow(-30)
    
    @JvmField()
    /**
     * qcd (10^-30 of candela)
     */
    val qcd = Candela(10.0.pow(-30))
    
    /**
     * qcd, (10^-30 of candela)
     */
    val quectocandela = qcd          