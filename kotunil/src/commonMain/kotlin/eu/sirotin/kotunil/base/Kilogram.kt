
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val descriptionKilogram = UnitSpecification(
    "kg",
    "M",
    90
) { v: Double -> Kilogram(v) }

/**
 * System International Unit for mass.
 *
 * @constructor Creates the unit with given [value].
 */
@JsExport
class Kilogram(value: Double) : Expression(value, description = descriptionKilogram)
    /**
     * Creates Kilogram-Object for current number value. Kilogram is a System International Unit for mass.
     */
    val Number.kg : Kilogram
        /**
         * Returns Kilogram-Object for current number value. Kilogram is a System International Unit for mass.
         */
        get() = Kilogram(this.toDouble())
    
    /**
     * System International Unit for mass.
     */
    @JsExport
    @JvmField
    val kg = Kilogram(1.0)       
    
    /**
     * Qkg, (10^27 of kilogram)
     */    
    val Number.Qkg : Kilogram
        /**
         * Returns Qkg, (10^27 of kilogram)
         */ 
        @JvmName("getQkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(27))
    
    /**
     * Qkg, (10^27 of kilogram)
     */ 
    val Number.quettakilogram : Kilogram
        /**
         * Returns Qkg (10^27 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(27))
    
    /**
     * Returns numerical value of Qkg, (10^27 of kilogram)
     */
    val Kilogram.Qkg  : Double
        /**
         * Returns numerical value of Qkg, (10^27 of kilogram)
         */
        @JvmName("getQkg_prop")
        get() = this.value / 10.0.pow(27)
    
    /**
     * Returns numerical value of Qkg (10^27 of kilogram)
     */
    val Kilogram.quettakilogram  : Double
        /**
         * Returns numerical value of Qkg, (10^27 of kilogram)
         */
        get() = this.value / 10.0.pow(27)
    
    @JsExport
    @JvmField
    /**
     * Qkg (10^27 of kilogram)
     */
    val Qkg = Kilogram(10.0.pow(27))
    
    @JsExport
    @JvmField
    /**
     * Qkg, (10^27 of kilogram)
     */
    val quettakilogram = Qkg          

    /**
     * Rkg, (10^24 of kilogram)
     */    
    val Number.Rkg : Kilogram
        /**
         * Returns Rkg, (10^24 of kilogram)
         */ 
        @JvmName("getRkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(24))
    
    /**
     * Rkg, (10^24 of kilogram)
     */ 
    val Number.ronnakilogram : Kilogram
        /**
         * Returns Rkg (10^24 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(24))
    
    /**
     * Returns numerical value of Rkg, (10^24 of kilogram)
     */
    val Kilogram.Rkg  : Double
        /**
         * Returns numerical value of Rkg, (10^24 of kilogram)
         */
        @JvmName("getRkg_prop")
        get() = this.value / 10.0.pow(24)
    
    /**
     * Returns numerical value of Rkg (10^24 of kilogram)
     */
    val Kilogram.ronnakilogram  : Double
        /**
         * Returns numerical value of Rkg, (10^24 of kilogram)
         */
        get() = this.value / 10.0.pow(24)
    
    @JsExport
    @JvmField
    /**
     * Rkg (10^24 of kilogram)
     */
    val Rkg = Kilogram(10.0.pow(24))
    
    @JsExport
    @JvmField
    /**
     * Rkg, (10^24 of kilogram)
     */
    val ronnakilogram = Rkg          

    /**
     * Ykg, (10^21 of kilogram)
     */    
    val Number.Ykg : Kilogram
        /**
         * Returns Ykg, (10^21 of kilogram)
         */ 
        @JvmName("getYkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(21))
    
    /**
     * Ykg, (10^21 of kilogram)
     */ 
    val Number.yottakilogram : Kilogram
        /**
         * Returns Ykg (10^21 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(21))
    
    /**
     * Returns numerical value of Ykg, (10^21 of kilogram)
     */
    val Kilogram.Ykg  : Double
        /**
         * Returns numerical value of Ykg, (10^21 of kilogram)
         */
        @JvmName("getYkg_prop")
        get() = this.value / 10.0.pow(21)
    
    /**
     * Returns numerical value of Ykg (10^21 of kilogram)
     */
    val Kilogram.yottakilogram  : Double
        /**
         * Returns numerical value of Ykg, (10^21 of kilogram)
         */
        get() = this.value / 10.0.pow(21)
    
    @JsExport
    @JvmField
    /**
     * Ykg (10^21 of kilogram)
     */
    val Ykg = Kilogram(10.0.pow(21))
    
    @JsExport
    @JvmField
    /**
     * Ykg, (10^21 of kilogram)
     */
    val yottakilogram = Ykg          

    /**
     * Zkg, (10^18 of kilogram)
     */    
    val Number.Zkg : Kilogram
        /**
         * Returns Zkg, (10^18 of kilogram)
         */ 
        @JvmName("getZkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(18))
    
    /**
     * Zkg, (10^18 of kilogram)
     */ 
    val Number.zettakilogram : Kilogram
        /**
         * Returns Zkg (10^18 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(18))
    
    /**
     * Returns numerical value of Zkg, (10^18 of kilogram)
     */
    val Kilogram.Zkg  : Double
        /**
         * Returns numerical value of Zkg, (10^18 of kilogram)
         */
        @JvmName("getZkg_prop")
        get() = this.value / 10.0.pow(18)
    
    /**
     * Returns numerical value of Zkg (10^18 of kilogram)
     */
    val Kilogram.zettakilogram  : Double
        /**
         * Returns numerical value of Zkg, (10^18 of kilogram)
         */
        get() = this.value / 10.0.pow(18)
    
    @JsExport
    @JvmField
    /**
     * Zkg (10^18 of kilogram)
     */
    val Zkg = Kilogram(10.0.pow(18))
    
    @JsExport
    @JvmField
    /**
     * Zkg, (10^18 of kilogram)
     */
    val zettakilogram = Zkg          

    /**
     * Ekg, (10^15 of kilogram)
     */    
    val Number.Ekg : Kilogram
        /**
         * Returns Ekg, (10^15 of kilogram)
         */ 
        @JvmName("getEkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(15))
    
    /**
     * Ekg, (10^15 of kilogram)
     */ 
    val Number.exakilogram : Kilogram
        /**
         * Returns Ekg (10^15 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(15))
    
    /**
     * Returns numerical value of Ekg, (10^15 of kilogram)
     */
    val Kilogram.Ekg  : Double
        /**
         * Returns numerical value of Ekg, (10^15 of kilogram)
         */
        @JvmName("getEkg_prop")
        get() = this.value / 10.0.pow(15)
    
    /**
     * Returns numerical value of Ekg (10^15 of kilogram)
     */
    val Kilogram.exakilogram  : Double
        /**
         * Returns numerical value of Ekg, (10^15 of kilogram)
         */
        get() = this.value / 10.0.pow(15)
    
    @JsExport
    @JvmField
    /**
     * Ekg (10^15 of kilogram)
     */
    val Ekg = Kilogram(10.0.pow(15))
    
    @JsExport
    @JvmField
    /**
     * Ekg, (10^15 of kilogram)
     */
    val exakilogram = Ekg          

    /**
     * Pkg, (10^12 of kilogram)
     */    
    val Number.Pkg : Kilogram
        /**
         * Returns Pkg, (10^12 of kilogram)
         */ 
        @JvmName("getPkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(12))
    
    /**
     * Pkg, (10^12 of kilogram)
     */ 
    val Number.petakilogram : Kilogram
        /**
         * Returns Pkg (10^12 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(12))
    
    /**
     * Returns numerical value of Pkg, (10^12 of kilogram)
     */
    val Kilogram.Pkg  : Double
        /**
         * Returns numerical value of Pkg, (10^12 of kilogram)
         */
        @JvmName("getPkg_prop")
        get() = this.value / 10.0.pow(12)
    
    /**
     * Returns numerical value of Pkg (10^12 of kilogram)
     */
    val Kilogram.petakilogram  : Double
        /**
         * Returns numerical value of Pkg, (10^12 of kilogram)
         */
        get() = this.value / 10.0.pow(12)
    
    @JsExport
    @JvmField
    /**
     * Pkg (10^12 of kilogram)
     */
    val Pkg = Kilogram(10.0.pow(12))
    
    @JsExport
    @JvmField
    /**
     * Pkg, (10^12 of kilogram)
     */
    val petakilogram = Pkg          

    /**
     * Tkg, (10^9 of kilogram)
     */    
    val Number.Tkg : Kilogram
        /**
         * Returns Tkg, (10^9 of kilogram)
         */ 
        @JvmName("getTkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(9))
    
    /**
     * Tkg, (10^9 of kilogram)
     */ 
    val Number.terakilogram : Kilogram
        /**
         * Returns Tkg (10^9 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(9))
    
    /**
     * Returns numerical value of Tkg, (10^9 of kilogram)
     */
    val Kilogram.Tkg  : Double
        /**
         * Returns numerical value of Tkg, (10^9 of kilogram)
         */
        @JvmName("getTkg_prop")
        get() = this.value / 10.0.pow(9)
    
    /**
     * Returns numerical value of Tkg (10^9 of kilogram)
     */
    val Kilogram.terakilogram  : Double
        /**
         * Returns numerical value of Tkg, (10^9 of kilogram)
         */
        get() = this.value / 10.0.pow(9)
    
    @JsExport
    @JvmField
    /**
     * Tkg (10^9 of kilogram)
     */
    val Tkg = Kilogram(10.0.pow(9))
    
    @JsExport
    @JvmField
    /**
     * Tkg, (10^9 of kilogram)
     */
    val terakilogram = Tkg          

    /**
     * Gkg, (10^6 of kilogram)
     */    
    val Number.Gkg : Kilogram
        /**
         * Returns Gkg, (10^6 of kilogram)
         */ 
        @JvmName("getGkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(6))
    
    /**
     * Gkg, (10^6 of kilogram)
     */ 
    val Number.gigakilogram : Kilogram
        /**
         * Returns Gkg (10^6 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(6))
    
    /**
     * Returns numerical value of Gkg, (10^6 of kilogram)
     */
    val Kilogram.Gkg  : Double
        /**
         * Returns numerical value of Gkg, (10^6 of kilogram)
         */
        @JvmName("getGkg_prop")
        get() = this.value / 10.0.pow(6)
    
    /**
     * Returns numerical value of Gkg (10^6 of kilogram)
     */
    val Kilogram.gigakilogram  : Double
        /**
         * Returns numerical value of Gkg, (10^6 of kilogram)
         */
        get() = this.value / 10.0.pow(6)
    
    @JsExport
    @JvmField
    /**
     * Gkg (10^6 of kilogram)
     */
    val Gkg = Kilogram(10.0.pow(6))
    
    @JsExport
    @JvmField
    /**
     * Gkg, (10^6 of kilogram)
     */
    val gigakilogram = Gkg          

    /**
     * Mkg, (10^3 of kilogram)
     */    
    val Number.Mkg : Kilogram
        /**
         * Returns Mkg, (10^3 of kilogram)
         */ 
        @JvmName("getMkg_prop")
        get() = Kilogram(this.toDouble()*10.0.pow(3))
    
    /**
     * Mkg, (10^3 of kilogram)
     */ 
    val Number.megakilogram : Kilogram
        /**
         * Returns Mkg (10^3 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(3))
    
    /**
     * Returns numerical value of Mkg, (10^3 of kilogram)
     */
    val Kilogram.Mkg  : Double
        /**
         * Returns numerical value of Mkg, (10^3 of kilogram)
         */
        @JvmName("getMkg_prop")
        get() = this.value / 10.0.pow(3)
    
    /**
     * Returns numerical value of Mkg (10^3 of kilogram)
     */
    val Kilogram.megakilogram  : Double
        /**
         * Returns numerical value of Mkg, (10^3 of kilogram)
         */
        get() = this.value / 10.0.pow(3)
    
    @JsExport
    @JvmField
    /**
     * Mkg (10^3 of kilogram)
     */
    val Mkg = Kilogram(10.0.pow(3))
    
    @JsExport
    @JvmField
    /**
     * Mkg, (10^3 of kilogram)
     */
    val megakilogram = Mkg          

    /**
     * hkg, (10^-1 of kilogram)
     */    
    val Number.hkg : Kilogram
        /**
         * Returns hkg, (10^-1 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-1))
    
    /**
     * hkg, (10^-1 of kilogram)
     */ 
    val Number.hectokilogram : Kilogram
        /**
         * Returns hkg (10^-1 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-1))
    
    /**
     * Returns numerical value of hkg, (10^-1 of kilogram)
     */
    val Kilogram.hkg  : Double
        /**
         * Returns numerical value of hkg, (10^-1 of kilogram)
         */
        get() = this.value / 10.0.pow(-1)
    
    /**
     * Returns numerical value of hkg (10^-1 of kilogram)
     */
    val Kilogram.hectokilogram  : Double
        /**
         * Returns numerical value of hkg, (10^-1 of kilogram)
         */
        get() = this.value / 10.0.pow(-1)
    
    @JsExport
    @JvmField
    /**
     * hkg (10^-1 of kilogram)
     */
    val hkg = Kilogram(10.0.pow(-1))
    
    @JsExport
    @JvmField
    /**
     * hkg, (10^-1 of kilogram)
     */
    val hectokilogram = hkg          

    /**
     * dakg, (10^-2 of kilogram)
     */    
    val Number.dakg : Kilogram
        /**
         * Returns dakg, (10^-2 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-2))
    
    /**
     * dakg, (10^-2 of kilogram)
     */ 
    val Number.decakilogram : Kilogram
        /**
         * Returns dakg (10^-2 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-2))
    
    /**
     * Returns numerical value of dakg, (10^-2 of kilogram)
     */
    val Kilogram.dakg  : Double
        /**
         * Returns numerical value of dakg, (10^-2 of kilogram)
         */
        get() = this.value / 10.0.pow(-2)
    
    /**
     * Returns numerical value of dakg (10^-2 of kilogram)
     */
    val Kilogram.decakilogram  : Double
        /**
         * Returns numerical value of dakg, (10^-2 of kilogram)
         */
        get() = this.value / 10.0.pow(-2)
    
    @JsExport
    @JvmField
    /**
     * dakg (10^-2 of kilogram)
     */
    val dakg = Kilogram(10.0.pow(-2))
    
    @JsExport
    @JvmField
    /**
     * dakg, (10^-2 of kilogram)
     */
    val decakilogram = dakg          

    /**
     * dkg, (10^-4 of kilogram)
     */    
    val Number.dkg : Kilogram
        /**
         * Returns dkg, (10^-4 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-4))
    
    /**
     * dkg, (10^-4 of kilogram)
     */ 
    val Number.decikilogram : Kilogram
        /**
         * Returns dkg (10^-4 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-4))
    
    /**
     * Returns numerical value of dkg, (10^-4 of kilogram)
     */
    val Kilogram.dkg  : Double
        /**
         * Returns numerical value of dkg, (10^-4 of kilogram)
         */
        get() = this.value / 10.0.pow(-4)
    
    /**
     * Returns numerical value of dkg (10^-4 of kilogram)
     */
    val Kilogram.decikilogram  : Double
        /**
         * Returns numerical value of dkg, (10^-4 of kilogram)
         */
        get() = this.value / 10.0.pow(-4)
    
    @JsExport
    @JvmField
    /**
     * dkg (10^-4 of kilogram)
     */
    val dkg = Kilogram(10.0.pow(-4))
    
    @JsExport
    @JvmField
    /**
     * dkg, (10^-4 of kilogram)
     */
    val decikilogram = dkg          

    /**
     * ckg, (10^-5 of kilogram)
     */    
    val Number.ckg : Kilogram
        /**
         * Returns ckg, (10^-5 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-5))
    
    /**
     * ckg, (10^-5 of kilogram)
     */ 
    val Number.centikilogram : Kilogram
        /**
         * Returns ckg (10^-5 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-5))
    
    /**
     * Returns numerical value of ckg, (10^-5 of kilogram)
     */
    val Kilogram.ckg  : Double
        /**
         * Returns numerical value of ckg, (10^-5 of kilogram)
         */
        get() = this.value / 10.0.pow(-5)
    
    /**
     * Returns numerical value of ckg (10^-5 of kilogram)
     */
    val Kilogram.centikilogram  : Double
        /**
         * Returns numerical value of ckg, (10^-5 of kilogram)
         */
        get() = this.value / 10.0.pow(-5)
    
    @JsExport
    @JvmField
    /**
     * ckg (10^-5 of kilogram)
     */
    val ckg = Kilogram(10.0.pow(-5))
    
    @JsExport
    @JvmField
    /**
     * ckg, (10^-5 of kilogram)
     */
    val centikilogram = ckg          

    /**
     * mkg, (10^-6 of kilogram)
     */    
    val Number.mkg : Kilogram
        /**
         * Returns mkg, (10^-6 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-6))
    
    /**
     * mkg, (10^-6 of kilogram)
     */ 
    val Number.millikilogram : Kilogram
        /**
         * Returns mkg (10^-6 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-6))
    
    /**
     * Returns numerical value of mkg, (10^-6 of kilogram)
     */
    val Kilogram.mkg  : Double
        /**
         * Returns numerical value of mkg, (10^-6 of kilogram)
         */
        get() = this.value / 10.0.pow(-6)
    
    /**
     * Returns numerical value of mkg (10^-6 of kilogram)
     */
    val Kilogram.millikilogram  : Double
        /**
         * Returns numerical value of mkg, (10^-6 of kilogram)
         */
        get() = this.value / 10.0.pow(-6)
    
    
    @JvmField
    /**
     * mkg (10^-6 of kilogram)
     */
    val mkg = Kilogram(10.0.pow(-6))
    
    @JsExport
    @JvmField
    /**
     * mkg, (10^-6 of kilogram)
     */
    val millikilogram = mkg          

    /**
     * μkg, (10^-9 of kilogram)
     */    
    val Number.μkg : Kilogram
        /**
         * Returns μkg, (10^-9 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-9))
    
    /**
     * μkg, (10^-9 of kilogram)
     */ 
    val Number.microkilogram : Kilogram
        /**
         * Returns μkg (10^-9 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-9))
    
    /**
     * Returns numerical value of μkg, (10^-9 of kilogram)
     */
    val Kilogram.μkg  : Double
        /**
         * Returns numerical value of μkg, (10^-9 of kilogram)
         */
        get() = this.value / 10.0.pow(-9)
    
    /**
     * Returns numerical value of μkg (10^-9 of kilogram)
     */
    val Kilogram.microkilogram  : Double
        /**
         * Returns numerical value of μkg, (10^-9 of kilogram)
         */
        get() = this.value / 10.0.pow(-9)
    
    @JsExport
    @JvmField
    /**
     * μkg (10^-9 of kilogram)
     */
    val μkg = Kilogram(10.0.pow(-9))
    
    @JsExport
    @JvmField
    /**
     * μkg, (10^-9 of kilogram)
     */
    val microkilogram = μkg          

    /**
     * nkg, (10^-12 of kilogram)
     */    
    val Number.nkg : Kilogram
        /**
         * Returns nkg, (10^-12 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-12))
    
    /**
     * nkg, (10^-12 of kilogram)
     */ 
    val Number.nanokilogram : Kilogram
        /**
         * Returns nkg (10^-12 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-12))
    
    /**
     * Returns numerical value of nkg, (10^-12 of kilogram)
     */
    val Kilogram.nkg  : Double
        /**
         * Returns numerical value of nkg, (10^-12 of kilogram)
         */
        get() = this.value / 10.0.pow(-12)
    
    /**
     * Returns numerical value of nkg (10^-12 of kilogram)
     */
    val Kilogram.nanokilogram  : Double
        /**
         * Returns numerical value of nkg, (10^-12 of kilogram)
         */
        get() = this.value / 10.0.pow(-12)
    
    @JsExport
    @JvmField
    /**
     * nkg (10^-12 of kilogram)
     */
    val nkg = Kilogram(10.0.pow(-12))
    
    @JsExport
    @JvmField
    /**
     * nkg, (10^-12 of kilogram)
     */
    val nanokilogram = nkg          

    /**
     * pkg, (10^-15 of kilogram)
     */    
    val Number.pkg : Kilogram
        /**
         * Returns pkg, (10^-15 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-15))
    
    /**
     * pkg, (10^-15 of kilogram)
     */ 
    val Number.picokilogram : Kilogram
        /**
         * Returns pkg (10^-15 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-15))
    
    /**
     * Returns numerical value of pkg, (10^-15 of kilogram)
     */
    val Kilogram.pkg  : Double
        /**
         * Returns numerical value of pkg, (10^-15 of kilogram)
         */
        get() = this.value / 10.0.pow(-15)
    
    /**
     * Returns numerical value of pkg (10^-15 of kilogram)
     */
    val Kilogram.picokilogram  : Double
        /**
         * Returns numerical value of pkg, (10^-15 of kilogram)
         */
        get() = this.value / 10.0.pow(-15)
    
    
    @JvmField
    /**
     * pkg (10^-15 of kilogram)
     */
    val pkg = Kilogram(10.0.pow(-15))
    
    @JsExport
    @JvmField
    /**
     * pkg, (10^-15 of kilogram)
     */
    val picokilogram = pkg          

    /**
     * fkg, (10^-18 of kilogram)
     */    
    val Number.fkg : Kilogram
        /**
         * Returns fkg, (10^-18 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-18))
    
    /**
     * fkg, (10^-18 of kilogram)
     */ 
    val Number.femtokilogram : Kilogram
        /**
         * Returns fkg (10^-18 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-18))
    
    /**
     * Returns numerical value of fkg, (10^-18 of kilogram)
     */
    val Kilogram.fkg  : Double
        /**
         * Returns numerical value of fkg, (10^-18 of kilogram)
         */
        get() = this.value / 10.0.pow(-18)
    
    /**
     * Returns numerical value of fkg (10^-18 of kilogram)
     */
    val Kilogram.femtokilogram  : Double
        /**
         * Returns numerical value of fkg, (10^-18 of kilogram)
         */
        get() = this.value / 10.0.pow(-18)
    
    @JsExport
    @JvmField
    /**
     * fkg (10^-18 of kilogram)
     */
    val fkg = Kilogram(10.0.pow(-18))
    
    @JsExport
    @JvmField
    /**
     * fkg, (10^-18 of kilogram)
     */
    val femtokilogram = fkg          

    /**
     * akg, (10^-21 of kilogram)
     */    
    val Number.akg : Kilogram
        /**
         * Returns akg, (10^-21 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-21))
    
    /**
     * akg, (10^-21 of kilogram)
     */ 
    val Number.attokilogram : Kilogram
        /**
         * Returns akg (10^-21 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-21))
    
    /**
     * Returns numerical value of akg, (10^-21 of kilogram)
     */
    val Kilogram.akg  : Double
        /**
         * Returns numerical value of akg, (10^-21 of kilogram)
         */
        get() = this.value / 10.0.pow(-21)
    
    /**
     * Returns numerical value of akg (10^-21 of kilogram)
     */
    val Kilogram.attokilogram  : Double
        /**
         * Returns numerical value of akg, (10^-21 of kilogram)
         */
        get() = this.value / 10.0.pow(-21)
    
    @JsExport
    @JvmField
    /**
     * akg (10^-21 of kilogram)
     */
    val akg = Kilogram(10.0.pow(-21))
    
    @JsExport
    @JvmField
    /**
     * akg, (10^-21 of kilogram)
     */
    val attokilogram = akg          

    /**
     * zkg, (10^-24 of kilogram)
     */    
    val Number.zkg : Kilogram
        /**
         * Returns zkg, (10^-24 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-24))
    
    /**
     * zkg, (10^-24 of kilogram)
     */ 
    val Number.zeptokilogram : Kilogram
        /**
         * Returns zkg (10^-24 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-24))
    
    /**
     * Returns numerical value of zkg, (10^-24 of kilogram)
     */
    val Kilogram.zkg  : Double
        /**
         * Returns numerical value of zkg, (10^-24 of kilogram)
         */
        get() = this.value / 10.0.pow(-24)
    
    /**
     * Returns numerical value of zkg (10^-24 of kilogram)
     */
    val Kilogram.zeptokilogram  : Double
        /**
         * Returns numerical value of zkg, (10^-24 of kilogram)
         */
        get() = this.value / 10.0.pow(-24)
    
    
    @JvmField
    /**
     * zkg (10^-24 of kilogram)
     */
    val zkg = Kilogram(10.0.pow(-24))
    
    @JsExport
    @JvmField
    /**
     * zkg, (10^-24 of kilogram)
     */
    val zeptokilogram = zkg          

    /**
     * ykg, (10^-27 of kilogram)
     */    
    val Number.ykg : Kilogram
        /**
         * Returns ykg, (10^-27 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-27))
    
    /**
     * ykg, (10^-27 of kilogram)
     */ 
    val Number.yoctokilogram : Kilogram
        /**
         * Returns ykg (10^-27 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-27))
    
    /**
     * Returns numerical value of ykg, (10^-27 of kilogram)
     */
    val Kilogram.ykg  : Double
        /**
         * Returns numerical value of ykg, (10^-27 of kilogram)
         */
        get() = this.value / 10.0.pow(-27)
    
    /**
     * Returns numerical value of ykg (10^-27 of kilogram)
     */
    val Kilogram.yoctokilogram  : Double
        /**
         * Returns numerical value of ykg, (10^-27 of kilogram)
         */
        get() = this.value / 10.0.pow(-27)
    
    
    @JvmField
    /**
     * ykg (10^-27 of kilogram)
     */
    val ykg = Kilogram(10.0.pow(-27))
    
    @JsExport
    @JvmField
    /**
     * ykg, (10^-27 of kilogram)
     */
    val yoctokilogram = ykg          

    /**
     * rkg, (10^-30 of kilogram)
     */    
    val Number.rkg : Kilogram
        /**
         * Returns rkg, (10^-30 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-30))
    
    /**
     * rkg, (10^-30 of kilogram)
     */ 
    val Number.rontokilogram : Kilogram
        /**
         * Returns rkg (10^-30 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-30))
    
    /**
     * Returns numerical value of rkg, (10^-30 of kilogram)
     */
    val Kilogram.rkg  : Double
        /**
         * Returns numerical value of rkg, (10^-30 of kilogram)
         */
        get() = this.value / 10.0.pow(-30)
    
    /**
     * Returns numerical value of rkg (10^-30 of kilogram)
     */
    val Kilogram.rontokilogram  : Double
        /**
         * Returns numerical value of rkg, (10^-30 of kilogram)
         */
        get() = this.value / 10.0.pow(-30)
    
    
    @JvmField
    /**
     * rkg (10^-30 of kilogram)
     */
    val rkg = Kilogram(10.0.pow(-30))
    
    @JsExport
    @JvmField
    /**
     * rkg, (10^-30 of kilogram)
     */
    val rontokilogram = rkg          

    /**
     * qkg, (10^-33 of kilogram)
     */    
    val Number.qkg : Kilogram
        /**
         * Returns qkg, (10^-33 of kilogram)
         */ 
        get() = Kilogram(this.toDouble()*10.0.pow(-33))
    
    /**
     * qkg, (10^-33 of kilogram)
     */ 
    val Number.quectokilogram : Kilogram
        /**
         * Returns qkg (10^-33 of kilogram)
         */
        get() = Kilogram(this.toDouble()*10.0.pow(-33))
    
    /**
     * Returns numerical value of qkg, (10^-33 of kilogram)
     */
    val Kilogram.qkg  : Double
        /**
         * Returns numerical value of qkg, (10^-33 of kilogram)
         */
        get() = this.value / 10.0.pow(-33)
    
    /**
     * Returns numerical value of qkg (10^-33 of kilogram)
     */
    val Kilogram.quectokilogram  : Double
        /**
         * Returns numerical value of qkg, (10^-33 of kilogram)
         */
        get() = this.value / 10.0.pow(-33)
    
    
    @JvmField
    /**
     * qkg (10^-33 of kilogram)
     */
    val qkg = Kilogram(10.0.pow(-33))
    
    @JsExport
    @JvmField
    /**
     * qkg, (10^-33 of kilogram)
     */
    val quectokilogram = qkg          