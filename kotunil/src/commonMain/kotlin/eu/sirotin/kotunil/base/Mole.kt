
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val descriptionMole = UnitSpecification(
    "mol",
    "N",
    50
) { v: Double -> Mole(v) }

/**
 * System International Unit for amount of substance.
 *
 * @constructor Creates the unit with given [value].
 */
@JsExport
class Mole(value: Double) : Expression(value, description = descriptionMole)
    /**
     * Creates Mole-Object for current number value. Mole is a System International Unit for amount of substance.
     */
    val Number.mol : Mole
        /**
         * Returns Mole-Object for current number value. Mole is a System International Unit for amount of substance.
         */
        get() = Mole(this.toDouble())
    
    /**
     * System International Unit for amount of substance.
     */
    @JsExport
    @JvmField
    val mol = Mole(1.0)       
    
    /**
     * Qmol, (10^30 of mole)
     */    
    val Number.Qmol : Mole
        /**
         * Returns Qmol, (10^30 of mole)
         */ 
        @JvmName("getQmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(30))
    
    /**
     * Qmol, (10^30 of mole)
     */ 
    val Number.quettamole : Mole
        /**
         * Returns Qmol (10^30 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(30))
    
    /**
     * Returns the numerical value of Qmol, (10^30 of mole)
     */
    val Mole.Qmol  : Double
        /**
         * Returns the numerical value of Qmol, (10^30 of mole)
         */
        @JvmName("getQmol_prop")
        get() = this.value / 10.0.pow(30)
    
    /**
     * Returns the numerical value of Qmol (10^30 of mole)
     */
    val Mole.quettamole  : Double
        /**
         * Returns the numerical value of Qmol, (10^30 of mole)
         */
        get() = this.value / 10.0.pow(30)
    
    @JsExport
    @JvmField
    /**
     * Qmol (10^30 of mole)
     */
    val Qmol = Mole(10.0.pow(30))
    
    @JsExport
    @JvmField
    /**
     * Qmol, (10^30 of mole)
     */
    val quettamole = Qmol          

    /**
     * Rmol, (10^27 of mole)
     */    
    val Number.Rmol : Mole
        /**
         * Returns Rmol, (10^27 of mole)
         */ 
        @JvmName("getRmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(27))
    
    /**
     * Rmol, (10^27 of mole)
     */ 
    val Number.ronnamole : Mole
        /**
         * Returns Rmol (10^27 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(27))
    
    /**
     * Returns the numerical value of Rmol, (10^27 of mole)
     */
    val Mole.Rmol  : Double
        /**
         * Returns the numerical value of Rmol, (10^27 of mole)
         */
        @JvmName("getRmol_prop")
        get() = this.value / 10.0.pow(27)
    
    /**
     * Returns the numerical value of Rmol (10^27 of mole)
     */
    val Mole.ronnamole  : Double
        /**
         * Returns the numerical value of Rmol, (10^27 of mole)
         */
        get() = this.value / 10.0.pow(27)
    
    @JsExport
    @JvmField
    /**
     * Rmol (10^27 of mole)
     */
    val Rmol = Mole(10.0.pow(27))
    
    @JsExport
    @JvmField
    /**
     * Rmol, (10^27 of mole)
     */
    val ronnamole = Rmol          

    /**
     * Ymol, (10^24 of mole)
     */    
    val Number.Ymol : Mole
        /**
         * Returns Ymol, (10^24 of mole)
         */ 
        @JvmName("getYmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(24))
    
    /**
     * Ymol, (10^24 of mole)
     */ 
    val Number.yottamole : Mole
        /**
         * Returns Ymol (10^24 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(24))
    
    /**
     * Returns the numerical value of Ymol, (10^24 of mole)
     */
    val Mole.Ymol  : Double
        /**
         * Returns the numerical value of Ymol, (10^24 of mole)
         */
        @JvmName("getYmol_prop")
        get() = this.value / 10.0.pow(24)
    
    /**
     * Returns the numerical value of Ymol (10^24 of mole)
     */
    val Mole.yottamole  : Double
        /**
         * Returns the numerical value of Ymol, (10^24 of mole)
         */
        get() = this.value / 10.0.pow(24)
    
    @JsExport
    @JvmField
    /**
     * Ymol (10^24 of mole)
     */
    val Ymol = Mole(10.0.pow(24))
    
    @JsExport
    @JvmField
    /**
     * Ymol, (10^24 of mole)
     */
    val yottamole = Ymol          

    /**
     * Zmol, (10^21 of mole)
     */    
    val Number.Zmol : Mole
        /**
         * Returns Zmol, (10^21 of mole)
         */ 
        @JvmName("getZmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(21))
    
    /**
     * Zmol, (10^21 of mole)
     */ 
    val Number.zettamole : Mole
        /**
         * Returns Zmol (10^21 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(21))
    
    /**
     * Returns the numerical value of Zmol, (10^21 of mole)
     */
    val Mole.Zmol  : Double
        /**
         * Returns the numerical value of Zmol, (10^21 of mole)
         */
        @JvmName("getZmol_prop")
        get() = this.value / 10.0.pow(21)
    
    /**
     * Returns the numerical value of Zmol (10^21 of mole)
     */
    val Mole.zettamole  : Double
        /**
         * Returns the numerical value of Zmol, (10^21 of mole)
         */
        get() = this.value / 10.0.pow(21)
    
    @JsExport
    @JvmField
    /**
     * Zmol (10^21 of mole)
     */
    val Zmol = Mole(10.0.pow(21))
    
    @JsExport
    @JvmField
    /**
     * Zmol, (10^21 of mole)
     */
    val zettamole = Zmol          

    /**
     * Emol, (10^18 of mole)
     */    
    val Number.Emol : Mole
        /**
         * Returns Emol, (10^18 of mole)
         */ 
        @JvmName("getEmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(18))
    
    /**
     * Emol, (10^18 of mole)
     */ 
    val Number.examole : Mole
        /**
         * Returns Emol (10^18 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(18))
    
    /**
     * Returns the numerical value of Emol, (10^18 of mole)
     */
    val Mole.Emol  : Double
        /**
         * Returns the numerical value of Emol, (10^18 of mole)
         */
        @JvmName("getEmol_prop")
        get() = this.value / 10.0.pow(18)
    
    /**
     * Returns the numerical value of Emol (10^18 of mole)
     */
    val Mole.examole  : Double
        /**
         * Returns the numerical value of Emol, (10^18 of mole)
         */
        get() = this.value / 10.0.pow(18)
    
    @JsExport
    @JvmField
    /**
     * Emol (10^18 of mole)
     */
    val Emol = Mole(10.0.pow(18))
    
    @JsExport
    @JvmField
    /**
     * Emol, (10^18 of mole)
     */
    val examole = Emol          

    /**
     * Pmol, (10^15 of mole)
     */    
    val Number.Pmol : Mole
        /**
         * Returns Pmol, (10^15 of mole)
         */ 
        @JvmName("getPmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(15))
    
    /**
     * Pmol, (10^15 of mole)
     */ 
    val Number.petamole : Mole
        /**
         * Returns Pmol (10^15 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(15))
    
    /**
     * Returns the numerical value of Pmol, (10^15 of mole)
     */
    val Mole.Pmol  : Double
        /**
         * Returns the numerical value of Pmol, (10^15 of mole)
         */
        @JvmName("getPmol_prop")
        get() = this.value / 10.0.pow(15)
    
    /**
     * Returns the numerical value of Pmol (10^15 of mole)
     */
    val Mole.petamole  : Double
        /**
         * Returns the numerical value of Pmol, (10^15 of mole)
         */
        get() = this.value / 10.0.pow(15)
    
    @JsExport
    @JvmField
    /**
     * Pmol (10^15 of mole)
     */
    val Pmol = Mole(10.0.pow(15))
    
    @JsExport
    @JvmField
    /**
     * Pmol, (10^15 of mole)
     */
    val petamole = Pmol          

    /**
     * Tmol, (10^12 of mole)
     */    
    val Number.Tmol : Mole
        /**
         * Returns Tmol, (10^12 of mole)
         */ 
        @JvmName("getTmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(12))
    
    /**
     * Tmol, (10^12 of mole)
     */ 
    val Number.teramole : Mole
        /**
         * Returns Tmol (10^12 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(12))
    
    /**
     * Returns the numerical value of Tmol, (10^12 of mole)
     */
    val Mole.Tmol  : Double
        /**
         * Returns the numerical value of Tmol, (10^12 of mole)
         */
        @JvmName("getTmol_prop")
        get() = this.value / 10.0.pow(12)
    
    /**
     * Returns the numerical value of Tmol (10^12 of mole)
     */
    val Mole.teramole  : Double
        /**
         * Returns the numerical value of Tmol, (10^12 of mole)
         */
        get() = this.value / 10.0.pow(12)
    
    @JsExport
    @JvmField
    /**
     * Tmol (10^12 of mole)
     */
    val Tmol = Mole(10.0.pow(12))
    
    @JsExport
    @JvmField
    /**
     * Tmol, (10^12 of mole)
     */
    val teramole = Tmol          

    /**
     * Gmol, (10^9 of mole)
     */    
    val Number.Gmol : Mole
        /**
         * Returns Gmol, (10^9 of mole)
         */ 
        @JvmName("getGmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(9))
    
    /**
     * Gmol, (10^9 of mole)
     */ 
    val Number.gigamole : Mole
        /**
         * Returns Gmol (10^9 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(9))
    
    /**
     * Returns the numerical value of Gmol, (10^9 of mole)
     */
    val Mole.Gmol  : Double
        /**
         * Returns the numerical value of Gmol, (10^9 of mole)
         */
        @JvmName("getGmol_prop")
        get() = this.value / 10.0.pow(9)
    
    /**
     * Returns the numerical value of Gmol (10^9 of mole)
     */
    val Mole.gigamole  : Double
        /**
         * Returns the numerical value of Gmol, (10^9 of mole)
         */
        get() = this.value / 10.0.pow(9)
    
    @JsExport
    @JvmField
    /**
     * Gmol (10^9 of mole)
     */
    val Gmol = Mole(10.0.pow(9))
    
    @JsExport
    @JvmField
    /**
     * Gmol, (10^9 of mole)
     */
    val gigamole = Gmol          

    /**
     * Mmol, (10^6 of mole)
     */    
    val Number.Mmol : Mole
        /**
         * Returns Mmol, (10^6 of mole)
         */ 
        @JvmName("getMmol_prop")
        get() = Mole(this.toDouble()*10.0.pow(6))
    
    /**
     * Mmol, (10^6 of mole)
     */ 
    val Number.megamole : Mole
        /**
         * Returns Mmol (10^6 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(6))
    
    /**
     * Returns the numerical value of Mmol, (10^6 of mole)
     */
    val Mole.Mmol  : Double
        /**
         * Returns the numerical value of Mmol, (10^6 of mole)
         */
        @JvmName("getMmol_prop")
        get() = this.value / 10.0.pow(6)
    
    /**
     * Returns the numerical value of Mmol (10^6 of mole)
     */
    val Mole.megamole  : Double
        /**
         * Returns the numerical value of Mmol, (10^6 of mole)
         */
        get() = this.value / 10.0.pow(6)
    
    @JsExport
    @JvmField
    /**
     * Mmol (10^6 of mole)
     */
    val Mmol = Mole(10.0.pow(6))
    
    @JsExport
    @JvmField
    /**
     * Mmol, (10^6 of mole)
     */
    val megamole = Mmol          

    /**
     * kmol, (10^3 of mole)
     */    
    val Number.kmol : Mole
        /**
         * Returns kmol, (10^3 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(3))
    
    /**
     * kmol, (10^3 of mole)
     */ 
    val Number.kilomole : Mole
        /**
         * Returns kmol (10^3 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(3))
    
    /**
     * Returns the numerical value of kmol, (10^3 of mole)
     */
    val Mole.kmol  : Double
        /**
         * Returns the numerical value of kmol, (10^3 of mole)
         */
        get() = this.value / 10.0.pow(3)
    
    /**
     * Returns the numerical value of kmol (10^3 of mole)
     */
    val Mole.kilomole  : Double
        /**
         * Returns the numerical value of kmol, (10^3 of mole)
         */
        get() = this.value / 10.0.pow(3)
    
    @JsExport
    @JvmField
    /**
     * kmol (10^3 of mole)
     */
    val kmol = Mole(10.0.pow(3))
    
    @JsExport
    @JvmField
    /**
     * kmol, (10^3 of mole)
     */
    val kilomole = kmol          

    /**
     * hmol, (10^2 of mole)
     */    
    val Number.hmol : Mole
        /**
         * Returns hmol, (10^2 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(2))
    
    /**
     * hmol, (10^2 of mole)
     */ 
    val Number.hectomole : Mole
        /**
         * Returns hmol (10^2 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(2))
    
    /**
     * Returns the numerical value of hmol, (10^2 of mole)
     */
    val Mole.hmol  : Double
        /**
         * Returns the numerical value of hmol, (10^2 of mole)
         */
        get() = this.value / 10.0.pow(2)
    
    /**
     * Returns the numerical value of hmol (10^2 of mole)
     */
    val Mole.hectomole  : Double
        /**
         * Returns the numerical value of hmol, (10^2 of mole)
         */
        get() = this.value / 10.0.pow(2)
    
    @JsExport
    @JvmField
    /**
     * hmol (10^2 of mole)
     */
    val hmol = Mole(10.0.pow(2))
    
    @JsExport
    @JvmField
    /**
     * hmol, (10^2 of mole)
     */
    val hectomole = hmol          

    /**
     * damol, (10^1 of mole)
     */    
    val Number.damol : Mole
        /**
         * Returns damol, (10^1 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(1))
    
    /**
     * damol, (10^1 of mole)
     */ 
    val Number.decamole : Mole
        /**
         * Returns damol (10^1 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(1))
    
    /**
     * Returns the numerical value of damol, (10^1 of mole)
     */
    val Mole.damol  : Double
        /**
         * Returns the numerical value of damol, (10^1 of mole)
         */
        get() = this.value / 10.0.pow(1)
    
    /**
     * Returns the numerical value of damol (10^1 of mole)
     */
    val Mole.decamole  : Double
        /**
         * Returns the numerical value of damol, (10^1 of mole)
         */
        get() = this.value / 10.0.pow(1)
    
    @JsExport
    @JvmField
    /**
     * damol (10^1 of mole)
     */
    val damol = Mole(10.0.pow(1))
    
    @JsExport
    @JvmField
    /**
     * damol, (10^1 of mole)
     */
    val decamole = damol          

    /**
     * dmol, (10^-1 of mole)
     */    
    val Number.dmol : Mole
        /**
         * Returns dmol, (10^-1 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-1))
    
    /**
     * dmol, (10^-1 of mole)
     */ 
    val Number.decimole : Mole
        /**
         * Returns dmol (10^-1 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-1))
    
    /**
     * Returns the numerical value of dmol, (10^-1 of mole)
     */
    val Mole.dmol  : Double
        /**
         * Returns the numerical value of dmol, (10^-1 of mole)
         */
        get() = this.value / 10.0.pow(-1)
    
    /**
     * Returns the numerical value of dmol (10^-1 of mole)
     */
    val Mole.decimole  : Double
        /**
         * Returns the numerical value of dmol, (10^-1 of mole)
         */
        get() = this.value / 10.0.pow(-1)
    
    @JsExport
    @JvmField
    /**
     * dmol (10^-1 of mole)
     */
    val dmol = Mole(10.0.pow(-1))
    
    @JsExport
    @JvmField
    /**
     * dmol, (10^-1 of mole)
     */
    val decimole = dmol          

    /**
     * cmol, (10^-2 of mole)
     */    
    val Number.cmol : Mole
        /**
         * Returns cmol, (10^-2 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-2))
    
    /**
     * cmol, (10^-2 of mole)
     */ 
    val Number.centimole : Mole
        /**
         * Returns cmol (10^-2 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-2))
    
    /**
     * Returns the numerical value of cmol, (10^-2 of mole)
     */
    val Mole.cmol  : Double
        /**
         * Returns the numerical value of cmol, (10^-2 of mole)
         */
        get() = this.value / 10.0.pow(-2)
    
    /**
     * Returns the numerical value of cmol (10^-2 of mole)
     */
    val Mole.centimole  : Double
        /**
         * Returns the numerical value of cmol, (10^-2 of mole)
         */
        get() = this.value / 10.0.pow(-2)
    
    @JsExport
    @JvmField
    /**
     * cmol (10^-2 of mole)
     */
    val cmol = Mole(10.0.pow(-2))
    
    @JsExport
    @JvmField
    /**
     * cmol, (10^-2 of mole)
     */
    val centimole = cmol          

    /**
     * mmol, (10^-3 of mole)
     */    
    val Number.mmol : Mole
        /**
         * Returns mmol, (10^-3 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-3))
    
    /**
     * mmol, (10^-3 of mole)
     */ 
    val Number.millimole : Mole
        /**
         * Returns mmol (10^-3 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-3))
    
    /**
     * Returns the numerical value of mmol, (10^-3 of mole)
     */
    val Mole.mmol  : Double
        /**
         * Returns the numerical value of mmol, (10^-3 of mole)
         */
        get() = this.value / 10.0.pow(-3)
    
    /**
     * Returns the numerical value of mmol (10^-3 of mole)
     */
    val Mole.millimole  : Double
        /**
         * Returns the numerical value of mmol, (10^-3 of mole)
         */
        get() = this.value / 10.0.pow(-3)
    
    
    @JvmField
    /**
     * mmol (10^-3 of mole)
     */
    val mmol = Mole(10.0.pow(-3))
    
    @JsExport
    @JvmField
    /**
     * mmol, (10^-3 of mole)
     */
    val millimole = mmol          

    /**
     * μmol, (10^-6 of mole)
     */    
    val Number.μmol : Mole
        /**
         * Returns μmol, (10^-6 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-6))
    
    /**
     * μmol, (10^-6 of mole)
     */ 
    val Number.micromole : Mole
        /**
         * Returns μmol (10^-6 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-6))
    
    /**
     * Returns the numerical value of μmol, (10^-6 of mole)
     */
    val Mole.μmol  : Double
        /**
         * Returns the numerical value of μmol, (10^-6 of mole)
         */
        get() = this.value / 10.0.pow(-6)
    
    /**
     * Returns the numerical value of μmol (10^-6 of mole)
     */
    val Mole.micromole  : Double
        /**
         * Returns the numerical value of μmol, (10^-6 of mole)
         */
        get() = this.value / 10.0.pow(-6)
    
    @JsExport
    @JvmField
    /**
     * μmol (10^-6 of mole)
     */
    val μmol = Mole(10.0.pow(-6))
    
    @JsExport
    @JvmField
    /**
     * μmol, (10^-6 of mole)
     */
    val micromole = μmol          

    /**
     * nmol, (10^-9 of mole)
     */    
    val Number.nmol : Mole
        /**
         * Returns nmol, (10^-9 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-9))
    
    /**
     * nmol, (10^-9 of mole)
     */ 
    val Number.nanomole : Mole
        /**
         * Returns nmol (10^-9 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-9))
    
    /**
     * Returns the numerical value of nmol, (10^-9 of mole)
     */
    val Mole.nmol  : Double
        /**
         * Returns the numerical value of nmol, (10^-9 of mole)
         */
        get() = this.value / 10.0.pow(-9)
    
    /**
     * Returns the numerical value of nmol (10^-9 of mole)
     */
    val Mole.nanomole  : Double
        /**
         * Returns the numerical value of nmol, (10^-9 of mole)
         */
        get() = this.value / 10.0.pow(-9)
    
    @JsExport
    @JvmField
    /**
     * nmol (10^-9 of mole)
     */
    val nmol = Mole(10.0.pow(-9))
    
    @JsExport
    @JvmField
    /**
     * nmol, (10^-9 of mole)
     */
    val nanomole = nmol          

    /**
     * pmol, (10^-12 of mole)
     */    
    val Number.pmol : Mole
        /**
         * Returns pmol, (10^-12 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-12))
    
    /**
     * pmol, (10^-12 of mole)
     */ 
    val Number.picomole : Mole
        /**
         * Returns pmol (10^-12 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-12))
    
    /**
     * Returns the numerical value of pmol, (10^-12 of mole)
     */
    val Mole.pmol  : Double
        /**
         * Returns the numerical value of pmol, (10^-12 of mole)
         */
        get() = this.value / 10.0.pow(-12)
    
    /**
     * Returns the numerical value of pmol (10^-12 of mole)
     */
    val Mole.picomole  : Double
        /**
         * Returns the numerical value of pmol, (10^-12 of mole)
         */
        get() = this.value / 10.0.pow(-12)
    
    
    @JvmField
    /**
     * pmol (10^-12 of mole)
     */
    val pmol = Mole(10.0.pow(-12))
    
    @JsExport
    @JvmField
    /**
     * pmol, (10^-12 of mole)
     */
    val picomole = pmol          

    /**
     * fmol, (10^-15 of mole)
     */    
    val Number.fmol : Mole
        /**
         * Returns fmol, (10^-15 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-15))
    
    /**
     * fmol, (10^-15 of mole)
     */ 
    val Number.femtomole : Mole
        /**
         * Returns fmol (10^-15 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-15))
    
    /**
     * Returns the numerical value of fmol, (10^-15 of mole)
     */
    val Mole.fmol  : Double
        /**
         * Returns the numerical value of fmol, (10^-15 of mole)
         */
        get() = this.value / 10.0.pow(-15)
    
    /**
     * Returns the numerical value of fmol (10^-15 of mole)
     */
    val Mole.femtomole  : Double
        /**
         * Returns the numerical value of fmol, (10^-15 of mole)
         */
        get() = this.value / 10.0.pow(-15)
    
    @JsExport
    @JvmField
    /**
     * fmol (10^-15 of mole)
     */
    val fmol = Mole(10.0.pow(-15))
    
    @JsExport
    @JvmField
    /**
     * fmol, (10^-15 of mole)
     */
    val femtomole = fmol          

    /**
     * amol, (10^-18 of mole)
     */    
    val Number.amol : Mole
        /**
         * Returns amol, (10^-18 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-18))
    
    /**
     * amol, (10^-18 of mole)
     */ 
    val Number.attomole : Mole
        /**
         * Returns amol (10^-18 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-18))
    
    /**
     * Returns the numerical value of amol, (10^-18 of mole)
     */
    val Mole.amol  : Double
        /**
         * Returns the numerical value of amol, (10^-18 of mole)
         */
        get() = this.value / 10.0.pow(-18)
    
    /**
     * Returns the numerical value of amol (10^-18 of mole)
     */
    val Mole.attomole  : Double
        /**
         * Returns the numerical value of amol, (10^-18 of mole)
         */
        get() = this.value / 10.0.pow(-18)
    
    @JsExport
    @JvmField
    /**
     * amol (10^-18 of mole)
     */
    val amol = Mole(10.0.pow(-18))
    
    @JsExport
    @JvmField
    /**
     * amol, (10^-18 of mole)
     */
    val attomole = amol          

    /**
     * zmol, (10^-21 of mole)
     */    
    val Number.zmol : Mole
        /**
         * Returns zmol, (10^-21 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-21))
    
    /**
     * zmol, (10^-21 of mole)
     */ 
    val Number.zeptomole : Mole
        /**
         * Returns zmol (10^-21 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-21))
    
    /**
     * Returns the numerical value of zmol, (10^-21 of mole)
     */
    val Mole.zmol  : Double
        /**
         * Returns the numerical value of zmol, (10^-21 of mole)
         */
        get() = this.value / 10.0.pow(-21)
    
    /**
     * Returns the numerical value of zmol (10^-21 of mole)
     */
    val Mole.zeptomole  : Double
        /**
         * Returns the numerical value of zmol, (10^-21 of mole)
         */
        get() = this.value / 10.0.pow(-21)
    
    
    @JvmField
    /**
     * zmol (10^-21 of mole)
     */
    val zmol = Mole(10.0.pow(-21))
    
    @JsExport
    @JvmField
    /**
     * zmol, (10^-21 of mole)
     */
    val zeptomole = zmol          

    /**
     * ymol, (10^-24 of mole)
     */    
    val Number.ymol : Mole
        /**
         * Returns ymol, (10^-24 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-24))
    
    /**
     * ymol, (10^-24 of mole)
     */ 
    val Number.yoctomole : Mole
        /**
         * Returns ymol (10^-24 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-24))
    
    /**
     * Returns the numerical value of ymol, (10^-24 of mole)
     */
    val Mole.ymol  : Double
        /**
         * Returns the numerical value of ymol, (10^-24 of mole)
         */
        get() = this.value / 10.0.pow(-24)
    
    /**
     * Returns the numerical value of ymol (10^-24 of mole)
     */
    val Mole.yoctomole  : Double
        /**
         * Returns the numerical value of ymol, (10^-24 of mole)
         */
        get() = this.value / 10.0.pow(-24)
    
    
    @JvmField
    /**
     * ymol (10^-24 of mole)
     */
    val ymol = Mole(10.0.pow(-24))
    
    @JsExport
    @JvmField
    /**
     * ymol, (10^-24 of mole)
     */
    val yoctomole = ymol          

    /**
     * rmol, (10^-27 of mole)
     */    
    val Number.rmol : Mole
        /**
         * Returns rmol, (10^-27 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-27))
    
    /**
     * rmol, (10^-27 of mole)
     */ 
    val Number.rontomole : Mole
        /**
         * Returns rmol (10^-27 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-27))
    
    /**
     * Returns the numerical value of rmol, (10^-27 of mole)
     */
    val Mole.rmol  : Double
        /**
         * Returns the numerical value of rmol, (10^-27 of mole)
         */
        get() = this.value / 10.0.pow(-27)
    
    /**
     * Returns the numerical value of rmol (10^-27 of mole)
     */
    val Mole.rontomole  : Double
        /**
         * Returns the numerical value of rmol, (10^-27 of mole)
         */
        get() = this.value / 10.0.pow(-27)
    
    
    @JvmField
    /**
     * rmol (10^-27 of mole)
     */
    val rmol = Mole(10.0.pow(-27))
    
    @JsExport
    @JvmField
    /**
     * rmol, (10^-27 of mole)
     */
    val rontomole = rmol          

    /**
     * qmol, (10^-30 of mole)
     */    
    val Number.qmol : Mole
        /**
         * Returns qmol, (10^-30 of mole)
         */ 
        get() = Mole(this.toDouble()*10.0.pow(-30))
    
    /**
     * qmol, (10^-30 of mole)
     */ 
    val Number.quectomole : Mole
        /**
         * Returns qmol (10^-30 of mole)
         */
        get() = Mole(this.toDouble()*10.0.pow(-30))
    
    /**
     * Returns the numerical value of qmol, (10^-30 of mole)
     */
    val Mole.qmol  : Double
        /**
         * Returns the numerical value of qmol, (10^-30 of mole)
         */
        get() = this.value / 10.0.pow(-30)
    
    /**
     * Returns the numerical value of qmol (10^-30 of mole)
     */
    val Mole.quectomole  : Double
        /**
         * Returns the numerical value of qmol, (10^-30 of mole)
         */
        get() = this.value / 10.0.pow(-30)
    
    
    @JvmField
    /**
     * qmol (10^-30 of mole)
     */
    val qmol = Mole(10.0.pow(-30))
    
    @JsExport
    @JvmField
    /**
     * qmol, (10^-30 of mole)
     */
    val quectomole = qmol          