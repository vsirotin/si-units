
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.math.pow
import kotlin.jvm.JvmName

private val descriptionMetre = UnitSpecification(
    "m",
    "L",
    80
) { v: Double -> Metre(v) }

/**
 * System International Unit for length.
 *
 * @constructor Creates the unit with given [value].
 */
class Metre(value: Double) : Expression(value, description = descriptionMetre)
    /**
     * Creates Metre-Object for current number value. Metre is a System International Unit for length.
     */
    val Number.m : Metre
        /**
         * Returns Metre-Object for current number value. Metre is a System International Unit for length.
         */
        get() = Metre(this.toDouble())
    
    /**
     * System International Unit for length.
     */
    val m = Metre(1.0)       
    
    /**
     * Qm, (10^30 of metre)
     */    
    val Number.Qm : Metre
        /**
         * Returns Qm, (10^30 of metre)
         */ 
        @JvmName("getQm_prop")
        get() = Metre(this.toDouble()*10.0.pow(30))
    
    /**
     * Qm, (10^30 of metre)
     */ 
    val Number.quettametre : Metre
        /**
         * Returns Qm (10^30 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(30))
    
    /**
     * Returns numerical value of Qm, (10^30 of metre)
     */
    val Metre.Qm  : Double
        /**
         * Returns numerical value of Qm, (10^30 of metre)
         */
        @JvmName("getQm_prop")
        get() = this.value / 10.0.pow(30)
    
    /**
     * Returns numerical value of Qm (10^30 of metre)
     */
    val Metre.quettametre  : Double
        /**
         * Returns numerical value of Qm, (10^30 of metre)
         */
        get() = this.value / 10.0.pow(30)
    
    @JvmField()
    /**
     * Qm (10^30 of metre)
     */
    val Qm = Metre(10.0.pow(30))
    
    /**
     * Qm, (10^30 of metre)
     */
    val quettametre = Qm          

    /**
     * Rm, (10^27 of metre)
     */    
    val Number.Rm : Metre
        /**
         * Returns Rm, (10^27 of metre)
         */ 
        @JvmName("getRm_prop")
        get() = Metre(this.toDouble()*10.0.pow(27))
    
    /**
     * Rm, (10^27 of metre)
     */ 
    val Number.ronnametre : Metre
        /**
         * Returns Rm (10^27 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(27))
    
    /**
     * Returns numerical value of Rm, (10^27 of metre)
     */
    val Metre.Rm  : Double
        /**
         * Returns numerical value of Rm, (10^27 of metre)
         */
        @JvmName("getRm_prop")
        get() = this.value / 10.0.pow(27)
    
    /**
     * Returns numerical value of Rm (10^27 of metre)
     */
    val Metre.ronnametre  : Double
        /**
         * Returns numerical value of Rm, (10^27 of metre)
         */
        get() = this.value / 10.0.pow(27)
    
    @JvmField()
    /**
     * Rm (10^27 of metre)
     */
    val Rm = Metre(10.0.pow(27))
    
    /**
     * Rm, (10^27 of metre)
     */
    val ronnametre = Rm          

    /**
     * Ym, (10^24 of metre)
     */    
    val Number.Ym : Metre
        /**
         * Returns Ym, (10^24 of metre)
         */ 
        @JvmName("getYm_prop")
        get() = Metre(this.toDouble()*10.0.pow(24))
    
    /**
     * Ym, (10^24 of metre)
     */ 
    val Number.yottametre : Metre
        /**
         * Returns Ym (10^24 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(24))
    
    /**
     * Returns numerical value of Ym, (10^24 of metre)
     */
    val Metre.Ym  : Double
        /**
         * Returns numerical value of Ym, (10^24 of metre)
         */
        @JvmName("getYm_prop")
        get() = this.value / 10.0.pow(24)
    
    /**
     * Returns numerical value of Ym (10^24 of metre)
     */
    val Metre.yottametre  : Double
        /**
         * Returns numerical value of Ym, (10^24 of metre)
         */
        get() = this.value / 10.0.pow(24)
    
    @JvmField()
    /**
     * Ym (10^24 of metre)
     */
    val Ym = Metre(10.0.pow(24))
    
    /**
     * Ym, (10^24 of metre)
     */
    val yottametre = Ym          

    /**
     * Zm, (10^21 of metre)
     */    
    val Number.Zm : Metre
        /**
         * Returns Zm, (10^21 of metre)
         */ 
        @JvmName("getZm_prop")
        get() = Metre(this.toDouble()*10.0.pow(21))
    
    /**
     * Zm, (10^21 of metre)
     */ 
    val Number.zettametre : Metre
        /**
         * Returns Zm (10^21 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(21))
    
    /**
     * Returns numerical value of Zm, (10^21 of metre)
     */
    val Metre.Zm  : Double
        /**
         * Returns numerical value of Zm, (10^21 of metre)
         */
        @JvmName("getZm_prop")
        get() = this.value / 10.0.pow(21)
    
    /**
     * Returns numerical value of Zm (10^21 of metre)
     */
    val Metre.zettametre  : Double
        /**
         * Returns numerical value of Zm, (10^21 of metre)
         */
        get() = this.value / 10.0.pow(21)
    
    @JvmField()
    /**
     * Zm (10^21 of metre)
     */
    val Zm = Metre(10.0.pow(21))
    
    /**
     * Zm, (10^21 of metre)
     */
    val zettametre = Zm          

    /**
     * Em, (10^18 of metre)
     */    
    val Number.Em : Metre
        /**
         * Returns Em, (10^18 of metre)
         */ 
        @JvmName("getEm_prop")
        get() = Metre(this.toDouble()*10.0.pow(18))
    
    /**
     * Em, (10^18 of metre)
     */ 
    val Number.exametre : Metre
        /**
         * Returns Em (10^18 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(18))
    
    /**
     * Returns numerical value of Em, (10^18 of metre)
     */
    val Metre.Em  : Double
        /**
         * Returns numerical value of Em, (10^18 of metre)
         */
        @JvmName("getEm_prop")
        get() = this.value / 10.0.pow(18)
    
    /**
     * Returns numerical value of Em (10^18 of metre)
     */
    val Metre.exametre  : Double
        /**
         * Returns numerical value of Em, (10^18 of metre)
         */
        get() = this.value / 10.0.pow(18)
    
    @JvmField()
    /**
     * Em (10^18 of metre)
     */
    val Em = Metre(10.0.pow(18))
    
    /**
     * Em, (10^18 of metre)
     */
    val exametre = Em          

    /**
     * Pm, (10^15 of metre)
     */    
    val Number.Pm : Metre
        /**
         * Returns Pm, (10^15 of metre)
         */ 
        @JvmName("getPm_prop")
        get() = Metre(this.toDouble()*10.0.pow(15))
    
    /**
     * Pm, (10^15 of metre)
     */ 
    val Number.petametre : Metre
        /**
         * Returns Pm (10^15 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(15))
    
    /**
     * Returns numerical value of Pm, (10^15 of metre)
     */
    val Metre.Pm  : Double
        /**
         * Returns numerical value of Pm, (10^15 of metre)
         */
        @JvmName("getPm_prop")
        get() = this.value / 10.0.pow(15)
    
    /**
     * Returns numerical value of Pm (10^15 of metre)
     */
    val Metre.petametre  : Double
        /**
         * Returns numerical value of Pm, (10^15 of metre)
         */
        get() = this.value / 10.0.pow(15)
    
    @JvmField()
    /**
     * Pm (10^15 of metre)
     */
    val Pm = Metre(10.0.pow(15))
    
    /**
     * Pm, (10^15 of metre)
     */
    val petametre = Pm          

    /**
     * Tm, (10^12 of metre)
     */    
    val Number.Tm : Metre
        /**
         * Returns Tm, (10^12 of metre)
         */ 
        @JvmName("getTm_prop")
        get() = Metre(this.toDouble()*10.0.pow(12))
    
    /**
     * Tm, (10^12 of metre)
     */ 
    val Number.terametre : Metre
        /**
         * Returns Tm (10^12 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(12))
    
    /**
     * Returns numerical value of Tm, (10^12 of metre)
     */
    val Metre.Tm  : Double
        /**
         * Returns numerical value of Tm, (10^12 of metre)
         */
        @JvmName("getTm_prop")
        get() = this.value / 10.0.pow(12)
    
    /**
     * Returns numerical value of Tm (10^12 of metre)
     */
    val Metre.terametre  : Double
        /**
         * Returns numerical value of Tm, (10^12 of metre)
         */
        get() = this.value / 10.0.pow(12)
    
    @JvmField()
    /**
     * Tm (10^12 of metre)
     */
    val Tm = Metre(10.0.pow(12))
    
    /**
     * Tm, (10^12 of metre)
     */
    val terametre = Tm          

    /**
     * Gm, (10^9 of metre)
     */    
    val Number.Gm : Metre
        /**
         * Returns Gm, (10^9 of metre)
         */ 
        @JvmName("getGm_prop")
        get() = Metre(this.toDouble()*10.0.pow(9))
    
    /**
     * Gm, (10^9 of metre)
     */ 
    val Number.gigametre : Metre
        /**
         * Returns Gm (10^9 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(9))
    
    /**
     * Returns numerical value of Gm, (10^9 of metre)
     */
    val Metre.Gm  : Double
        /**
         * Returns numerical value of Gm, (10^9 of metre)
         */
        @JvmName("getGm_prop")
        get() = this.value / 10.0.pow(9)
    
    /**
     * Returns numerical value of Gm (10^9 of metre)
     */
    val Metre.gigametre  : Double
        /**
         * Returns numerical value of Gm, (10^9 of metre)
         */
        get() = this.value / 10.0.pow(9)
    
    @JvmField()
    /**
     * Gm (10^9 of metre)
     */
    val Gm = Metre(10.0.pow(9))
    
    /**
     * Gm, (10^9 of metre)
     */
    val gigametre = Gm          

    /**
     * Mm, (10^6 of metre)
     */    
    val Number.Mm : Metre
        /**
         * Returns Mm, (10^6 of metre)
         */ 
        @JvmName("getMm_prop")
        get() = Metre(this.toDouble()*10.0.pow(6))
    
    /**
     * Mm, (10^6 of metre)
     */ 
    val Number.megametre : Metre
        /**
         * Returns Mm (10^6 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(6))
    
    /**
     * Returns numerical value of Mm, (10^6 of metre)
     */
    val Metre.Mm  : Double
        /**
         * Returns numerical value of Mm, (10^6 of metre)
         */
        @JvmName("getMm_prop")
        get() = this.value / 10.0.pow(6)
    
    /**
     * Returns numerical value of Mm (10^6 of metre)
     */
    val Metre.megametre  : Double
        /**
         * Returns numerical value of Mm, (10^6 of metre)
         */
        get() = this.value / 10.0.pow(6)
    
    @JvmField()
    /**
     * Mm (10^6 of metre)
     */
    val Mm = Metre(10.0.pow(6))
    
    /**
     * Mm, (10^6 of metre)
     */
    val megametre = Mm          

    /**
     * km, (10^3 of metre)
     */    
    val Number.km : Metre
        /**
         * Returns km, (10^3 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(3))
    
    /**
     * km, (10^3 of metre)
     */ 
    val Number.kilometre : Metre
        /**
         * Returns km (10^3 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(3))
    
    /**
     * Returns numerical value of km, (10^3 of metre)
     */
    val Metre.km  : Double
        /**
         * Returns numerical value of km, (10^3 of metre)
         */
        get() = this.value / 10.0.pow(3)
    
    /**
     * Returns numerical value of km (10^3 of metre)
     */
    val Metre.kilometre  : Double
        /**
         * Returns numerical value of km, (10^3 of metre)
         */
        get() = this.value / 10.0.pow(3)
    
    @JvmField()
    /**
     * km (10^3 of metre)
     */
    val km = Metre(10.0.pow(3))
    
    /**
     * km, (10^3 of metre)
     */
    val kilometre = km          

    /**
     * hm, (10^2 of metre)
     */    
    val Number.hm : Metre
        /**
         * Returns hm, (10^2 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(2))
    
    /**
     * hm, (10^2 of metre)
     */ 
    val Number.hectometre : Metre
        /**
         * Returns hm (10^2 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(2))
    
    /**
     * Returns numerical value of hm, (10^2 of metre)
     */
    val Metre.hm  : Double
        /**
         * Returns numerical value of hm, (10^2 of metre)
         */
        get() = this.value / 10.0.pow(2)
    
    /**
     * Returns numerical value of hm (10^2 of metre)
     */
    val Metre.hectometre  : Double
        /**
         * Returns numerical value of hm, (10^2 of metre)
         */
        get() = this.value / 10.0.pow(2)
    
    @JvmField()
    /**
     * hm (10^2 of metre)
     */
    val hm = Metre(10.0.pow(2))
    
    /**
     * hm, (10^2 of metre)
     */
    val hectometre = hm          

    /**
     * dam, (10^1 of metre)
     */    
    val Number.dam : Metre
        /**
         * Returns dam, (10^1 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(1))
    
    /**
     * dam, (10^1 of metre)
     */ 
    val Number.decametre : Metre
        /**
         * Returns dam (10^1 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(1))
    
    /**
     * Returns numerical value of dam, (10^1 of metre)
     */
    val Metre.dam  : Double
        /**
         * Returns numerical value of dam, (10^1 of metre)
         */
        get() = this.value / 10.0.pow(1)
    
    /**
     * Returns numerical value of dam (10^1 of metre)
     */
    val Metre.decametre  : Double
        /**
         * Returns numerical value of dam, (10^1 of metre)
         */
        get() = this.value / 10.0.pow(1)
    
    @JvmField()
    /**
     * dam (10^1 of metre)
     */
    val dam = Metre(10.0.pow(1))
    
    /**
     * dam, (10^1 of metre)
     */
    val decametre = dam          

    /**
     * dm, (10^-1 of metre)
     */    
    val Number.dm : Metre
        /**
         * Returns dm, (10^-1 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-1))
    
    /**
     * dm, (10^-1 of metre)
     */ 
    val Number.decimetre : Metre
        /**
         * Returns dm (10^-1 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-1))
    
    /**
     * Returns numerical value of dm, (10^-1 of metre)
     */
    val Metre.dm  : Double
        /**
         * Returns numerical value of dm, (10^-1 of metre)
         */
        get() = this.value / 10.0.pow(-1)
    
    /**
     * Returns numerical value of dm (10^-1 of metre)
     */
    val Metre.decimetre  : Double
        /**
         * Returns numerical value of dm, (10^-1 of metre)
         */
        get() = this.value / 10.0.pow(-1)
    
    @JvmField()
    /**
     * dm (10^-1 of metre)
     */
    val dm = Metre(10.0.pow(-1))
    
    /**
     * dm, (10^-1 of metre)
     */
    val decimetre = dm          

    /**
     * cm, (10^-2 of metre)
     */    
    val Number.cm : Metre
        /**
         * Returns cm, (10^-2 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-2))
    
    /**
     * cm, (10^-2 of metre)
     */ 
    val Number.centimetre : Metre
        /**
         * Returns cm (10^-2 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-2))
    
    /**
     * Returns numerical value of cm, (10^-2 of metre)
     */
    val Metre.cm  : Double
        /**
         * Returns numerical value of cm, (10^-2 of metre)
         */
        get() = this.value / 10.0.pow(-2)
    
    /**
     * Returns numerical value of cm (10^-2 of metre)
     */
    val Metre.centimetre  : Double
        /**
         * Returns numerical value of cm, (10^-2 of metre)
         */
        get() = this.value / 10.0.pow(-2)
    
    @JvmField()
    /**
     * cm (10^-2 of metre)
     */
    val cm = Metre(10.0.pow(-2))
    
    /**
     * cm, (10^-2 of metre)
     */
    val centimetre = cm          

    /**
     * mm, (10^-3 of metre)
     */    
    val Number.mm : Metre
        /**
         * Returns mm, (10^-3 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-3))
    
    /**
     * mm, (10^-3 of metre)
     */ 
    val Number.millimetre : Metre
        /**
         * Returns mm (10^-3 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-3))
    
    /**
     * Returns numerical value of mm, (10^-3 of metre)
     */
    val Metre.mm  : Double
        /**
         * Returns numerical value of mm, (10^-3 of metre)
         */
        get() = this.value / 10.0.pow(-3)
    
    /**
     * Returns numerical value of mm (10^-3 of metre)
     */
    val Metre.millimetre  : Double
        /**
         * Returns numerical value of mm, (10^-3 of metre)
         */
        get() = this.value / 10.0.pow(-3)
    
    @JvmField()
    /**
     * mm (10^-3 of metre)
     */
    val mm = Metre(10.0.pow(-3))
    
    /**
     * mm, (10^-3 of metre)
     */
    val millimetre = mm          

    /**
     * μm, (10^-6 of metre)
     */    
    val Number.μm : Metre
        /**
         * Returns μm, (10^-6 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-6))
    
    /**
     * μm, (10^-6 of metre)
     */ 
    val Number.micrometre : Metre
        /**
         * Returns μm (10^-6 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-6))
    
    /**
     * Returns numerical value of μm, (10^-6 of metre)
     */
    val Metre.μm  : Double
        /**
         * Returns numerical value of μm, (10^-6 of metre)
         */
        get() = this.value / 10.0.pow(-6)
    
    /**
     * Returns numerical value of μm (10^-6 of metre)
     */
    val Metre.micrometre  : Double
        /**
         * Returns numerical value of μm, (10^-6 of metre)
         */
        get() = this.value / 10.0.pow(-6)
    
    @JvmField()
    /**
     * μm (10^-6 of metre)
     */
    val μm = Metre(10.0.pow(-6))
    
    /**
     * μm, (10^-6 of metre)
     */
    val micrometre = μm          

    /**
     * nm, (10^-9 of metre)
     */    
    val Number.nm : Metre
        /**
         * Returns nm, (10^-9 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-9))
    
    /**
     * nm, (10^-9 of metre)
     */ 
    val Number.nanometre : Metre
        /**
         * Returns nm (10^-9 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-9))
    
    /**
     * Returns numerical value of nm, (10^-9 of metre)
     */
    val Metre.nm  : Double
        /**
         * Returns numerical value of nm, (10^-9 of metre)
         */
        get() = this.value / 10.0.pow(-9)
    
    /**
     * Returns numerical value of nm (10^-9 of metre)
     */
    val Metre.nanometre  : Double
        /**
         * Returns numerical value of nm, (10^-9 of metre)
         */
        get() = this.value / 10.0.pow(-9)
    
    @JvmField()
    /**
     * nm (10^-9 of metre)
     */
    val nm = Metre(10.0.pow(-9))
    
    /**
     * nm, (10^-9 of metre)
     */
    val nanometre = nm          

    /**
     * pm, (10^-12 of metre)
     */    
    val Number.pm : Metre
        /**
         * Returns pm, (10^-12 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-12))
    
    /**
     * pm, (10^-12 of metre)
     */ 
    val Number.picometre : Metre
        /**
         * Returns pm (10^-12 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-12))
    
    /**
     * Returns numerical value of pm, (10^-12 of metre)
     */
    val Metre.pm  : Double
        /**
         * Returns numerical value of pm, (10^-12 of metre)
         */
        get() = this.value / 10.0.pow(-12)
    
    /**
     * Returns numerical value of pm (10^-12 of metre)
     */
    val Metre.picometre  : Double
        /**
         * Returns numerical value of pm, (10^-12 of metre)
         */
        get() = this.value / 10.0.pow(-12)
    
    @JvmField()
    /**
     * pm (10^-12 of metre)
     */
    val pm = Metre(10.0.pow(-12))
    
    /**
     * pm, (10^-12 of metre)
     */
    val picometre = pm          

    /**
     * fm, (10^-15 of metre)
     */    
    val Number.fm : Metre
        /**
         * Returns fm, (10^-15 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-15))
    
    /**
     * fm, (10^-15 of metre)
     */ 
    val Number.femtometre : Metre
        /**
         * Returns fm (10^-15 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-15))
    
    /**
     * Returns numerical value of fm, (10^-15 of metre)
     */
    val Metre.fm  : Double
        /**
         * Returns numerical value of fm, (10^-15 of metre)
         */
        get() = this.value / 10.0.pow(-15)
    
    /**
     * Returns numerical value of fm (10^-15 of metre)
     */
    val Metre.femtometre  : Double
        /**
         * Returns numerical value of fm, (10^-15 of metre)
         */
        get() = this.value / 10.0.pow(-15)
    
    @JvmField()
    /**
     * fm (10^-15 of metre)
     */
    val fm = Metre(10.0.pow(-15))
    
    /**
     * fm, (10^-15 of metre)
     */
    val femtometre = fm          

    /**
     * am, (10^-18 of metre)
     */    
    val Number.am : Metre
        /**
         * Returns am, (10^-18 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-18))
    
    /**
     * am, (10^-18 of metre)
     */ 
    val Number.attometre : Metre
        /**
         * Returns am (10^-18 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-18))
    
    /**
     * Returns numerical value of am, (10^-18 of metre)
     */
    val Metre.am  : Double
        /**
         * Returns numerical value of am, (10^-18 of metre)
         */
        get() = this.value / 10.0.pow(-18)
    
    /**
     * Returns numerical value of am (10^-18 of metre)
     */
    val Metre.attometre  : Double
        /**
         * Returns numerical value of am, (10^-18 of metre)
         */
        get() = this.value / 10.0.pow(-18)
    
    @JvmField()
    /**
     * am (10^-18 of metre)
     */
    val am = Metre(10.0.pow(-18))
    
    /**
     * am, (10^-18 of metre)
     */
    val attometre = am          

    /**
     * zm, (10^-21 of metre)
     */    
    val Number.zm : Metre
        /**
         * Returns zm, (10^-21 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-21))
    
    /**
     * zm, (10^-21 of metre)
     */ 
    val Number.zeptometre : Metre
        /**
         * Returns zm (10^-21 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-21))
    
    /**
     * Returns numerical value of zm, (10^-21 of metre)
     */
    val Metre.zm  : Double
        /**
         * Returns numerical value of zm, (10^-21 of metre)
         */
        get() = this.value / 10.0.pow(-21)
    
    /**
     * Returns numerical value of zm (10^-21 of metre)
     */
    val Metre.zeptometre  : Double
        /**
         * Returns numerical value of zm, (10^-21 of metre)
         */
        get() = this.value / 10.0.pow(-21)
    
    @JvmField()
    /**
     * zm (10^-21 of metre)
     */
    val zm = Metre(10.0.pow(-21))
    
    /**
     * zm, (10^-21 of metre)
     */
    val zeptometre = zm          

    /**
     * ym, (10^-24 of metre)
     */    
    val Number.ym : Metre
        /**
         * Returns ym, (10^-24 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-24))
    
    /**
     * ym, (10^-24 of metre)
     */ 
    val Number.yoctometre : Metre
        /**
         * Returns ym (10^-24 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-24))
    
    /**
     * Returns numerical value of ym, (10^-24 of metre)
     */
    val Metre.ym  : Double
        /**
         * Returns numerical value of ym, (10^-24 of metre)
         */
        get() = this.value / 10.0.pow(-24)
    
    /**
     * Returns numerical value of ym (10^-24 of metre)
     */
    val Metre.yoctometre  : Double
        /**
         * Returns numerical value of ym, (10^-24 of metre)
         */
        get() = this.value / 10.0.pow(-24)
    
    @JvmField()
    /**
     * ym (10^-24 of metre)
     */
    val ym = Metre(10.0.pow(-24))
    
    /**
     * ym, (10^-24 of metre)
     */
    val yoctometre = ym          

    /**
     * rm, (10^-27 of metre)
     */    
    val Number.rm : Metre
        /**
         * Returns rm, (10^-27 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-27))
    
    /**
     * rm, (10^-27 of metre)
     */ 
    val Number.rontometre : Metre
        /**
         * Returns rm (10^-27 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-27))
    
    /**
     * Returns numerical value of rm, (10^-27 of metre)
     */
    val Metre.rm  : Double
        /**
         * Returns numerical value of rm, (10^-27 of metre)
         */
        get() = this.value / 10.0.pow(-27)
    
    /**
     * Returns numerical value of rm (10^-27 of metre)
     */
    val Metre.rontometre  : Double
        /**
         * Returns numerical value of rm, (10^-27 of metre)
         */
        get() = this.value / 10.0.pow(-27)
    
    @JvmField()
    /**
     * rm (10^-27 of metre)
     */
    val rm = Metre(10.0.pow(-27))
    
    /**
     * rm, (10^-27 of metre)
     */
    val rontometre = rm          

    /**
     * qm, (10^-30 of metre)
     */    
    val Number.qm : Metre
        /**
         * Returns qm, (10^-30 of metre)
         */ 
        get() = Metre(this.toDouble()*10.0.pow(-30))
    
    /**
     * qm, (10^-30 of metre)
     */ 
    val Number.quectometre : Metre
        /**
         * Returns qm (10^-30 of metre)
         */
        get() = Metre(this.toDouble()*10.0.pow(-30))
    
    /**
     * Returns numerical value of qm, (10^-30 of metre)
     */
    val Metre.qm  : Double
        /**
         * Returns numerical value of qm, (10^-30 of metre)
         */
        get() = this.value / 10.0.pow(-30)
    
    /**
     * Returns numerical value of qm (10^-30 of metre)
     */
    val Metre.quectometre  : Double
        /**
         * Returns numerical value of qm, (10^-30 of metre)
         */
        get() = this.value / 10.0.pow(-30)
    
    @JvmField()
    /**
     * qm (10^-30 of metre)
     */
    val qm = Metre(10.0.pow(-30))
    
    /**
     * qm, (10^-30 of metre)
     */
    val quectometre = qm          