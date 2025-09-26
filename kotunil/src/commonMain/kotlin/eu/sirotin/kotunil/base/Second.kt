
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val descriptionSecond = UnitSpecification(
    "s",
    "T",
    0
) { v: Double -> Second(v) }

/**
 * System International Unit for time.
 *
 * @constructor Creates the unit with given [value].
 */
@JsExport
class Second(value: Double) : Expression(value, description = descriptionSecond)
    /**
     * Creates Second-Object for current number value. Second is a System International Unit for time.
     */
    val Number.s : Second
        /**
         * Returns Second-Object for current number value. Second is a System International Unit for time.
         */
        get() = Second(this.toDouble())
    
    /**
     * System International Unit for time.
     */
    @JsExport
    @JvmField
    val s = Second(1.0)       
    
    /**
     * Qs, (10^30 of second)
     */    
    val Number.Qs : Second
        /**
         * Returns Qs, (10^30 of second)
         */ 
        @JvmName("getQs_prop")
        get() = Second(this.toDouble()*10.0.pow(30))
    
    /**
     * Qs, (10^30 of second)
     */ 
    val Number.quettasecond : Second
        /**
         * Returns Qs (10^30 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(30))
    
    /**
     * Returns the numerical value of Qs, (10^30 of second)
     */
    val Second.Qs  : Double
        /**
         * Returns the numerical value of Qs, (10^30 of second)
         */
        @JvmName("getQs_prop")
        get() = this.value / 10.0.pow(30)
    
    /**
     * Returns the numerical value of Qs (10^30 of second)
     */
    val Second.quettasecond  : Double
        /**
         * Returns the numerical value of Qs, (10^30 of second)
         */
        get() = this.value / 10.0.pow(30)
    
    @JsExport
    @JvmField
    /**
     * Qs (10^30 of second)
     */
    val Qs = Second(10.0.pow(30))
    
    @JsExport
    @JvmField
    /**
     * Qs, (10^30 of second)
     */
    val quettasecond = Qs          

    /**
     * Rs, (10^27 of second)
     */    
    val Number.Rs : Second
        /**
         * Returns Rs, (10^27 of second)
         */ 
        @JvmName("getRs_prop")
        get() = Second(this.toDouble()*10.0.pow(27))
    
    /**
     * Rs, (10^27 of second)
     */ 
    val Number.ronnasecond : Second
        /**
         * Returns Rs (10^27 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(27))
    
    /**
     * Returns the numerical value of Rs, (10^27 of second)
     */
    val Second.Rs  : Double
        /**
         * Returns the numerical value of Rs, (10^27 of second)
         */
        @JvmName("getRs_prop")
        get() = this.value / 10.0.pow(27)
    
    /**
     * Returns the numerical value of Rs (10^27 of second)
     */
    val Second.ronnasecond  : Double
        /**
         * Returns the numerical value of Rs, (10^27 of second)
         */
        get() = this.value / 10.0.pow(27)
    
    @JsExport
    @JvmField
    /**
     * Rs (10^27 of second)
     */
    val Rs = Second(10.0.pow(27))
    
    @JsExport
    @JvmField
    /**
     * Rs, (10^27 of second)
     */
    val ronnasecond = Rs          

    /**
     * Ys, (10^24 of second)
     */    
    val Number.Ys : Second
        /**
         * Returns Ys, (10^24 of second)
         */ 
        @JvmName("getYs_prop")
        get() = Second(this.toDouble()*10.0.pow(24))
    
    /**
     * Ys, (10^24 of second)
     */ 
    val Number.yottasecond : Second
        /**
         * Returns Ys (10^24 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(24))
    
    /**
     * Returns the numerical value of Ys, (10^24 of second)
     */
    val Second.Ys  : Double
        /**
         * Returns the numerical value of Ys, (10^24 of second)
         */
        @JvmName("getYs_prop")
        get() = this.value / 10.0.pow(24)
    
    /**
     * Returns the numerical value of Ys (10^24 of second)
     */
    val Second.yottasecond  : Double
        /**
         * Returns the numerical value of Ys, (10^24 of second)
         */
        get() = this.value / 10.0.pow(24)
    
    @JsExport
    @JvmField
    /**
     * Ys (10^24 of second)
     */
    val Ys = Second(10.0.pow(24))
    
    @JsExport
    @JvmField
    /**
     * Ys, (10^24 of second)
     */
    val yottasecond = Ys          

    /**
     * Zs, (10^21 of second)
     */    
    val Number.Zs : Second
        /**
         * Returns Zs, (10^21 of second)
         */ 
        @JvmName("getZs_prop")
        get() = Second(this.toDouble()*10.0.pow(21))
    
    /**
     * Zs, (10^21 of second)
     */ 
    val Number.zettasecond : Second
        /**
         * Returns Zs (10^21 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(21))
    
    /**
     * Returns the numerical value of Zs, (10^21 of second)
     */
    val Second.Zs  : Double
        /**
         * Returns the numerical value of Zs, (10^21 of second)
         */
        @JvmName("getZs_prop")
        get() = this.value / 10.0.pow(21)
    
    /**
     * Returns the numerical value of Zs (10^21 of second)
     */
    val Second.zettasecond  : Double
        /**
         * Returns the numerical value of Zs, (10^21 of second)
         */
        get() = this.value / 10.0.pow(21)
    
    @JsExport
    @JvmField
    /**
     * Zs (10^21 of second)
     */
    val Zs = Second(10.0.pow(21))
    
    @JsExport
    @JvmField
    /**
     * Zs, (10^21 of second)
     */
    val zettasecond = Zs          

    /**
     * Es, (10^18 of second)
     */    
    val Number.Es : Second
        /**
         * Returns Es, (10^18 of second)
         */ 
        @JvmName("getEs_prop")
        get() = Second(this.toDouble()*10.0.pow(18))
    
    /**
     * Es, (10^18 of second)
     */ 
    val Number.exasecond : Second
        /**
         * Returns Es (10^18 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(18))
    
    /**
     * Returns the numerical value of Es, (10^18 of second)
     */
    val Second.Es  : Double
        /**
         * Returns the numerical value of Es, (10^18 of second)
         */
        @JvmName("getEs_prop")
        get() = this.value / 10.0.pow(18)
    
    /**
     * Returns the numerical value of Es (10^18 of second)
     */
    val Second.exasecond  : Double
        /**
         * Returns the numerical value of Es, (10^18 of second)
         */
        get() = this.value / 10.0.pow(18)
    
    @JsExport
    @JvmField
    /**
     * Es (10^18 of second)
     */
    val Es = Second(10.0.pow(18))
    
    @JsExport
    @JvmField
    /**
     * Es, (10^18 of second)
     */
    val exasecond = Es          

    /**
     * Ps, (10^15 of second)
     */    
    val Number.Ps : Second
        /**
         * Returns Ps, (10^15 of second)
         */ 
        @JvmName("getPs_prop")
        get() = Second(this.toDouble()*10.0.pow(15))
    
    /**
     * Ps, (10^15 of second)
     */ 
    val Number.petasecond : Second
        /**
         * Returns Ps (10^15 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(15))
    
    /**
     * Returns the numerical value of Ps, (10^15 of second)
     */
    val Second.Ps  : Double
        /**
         * Returns the numerical value of Ps, (10^15 of second)
         */
        @JvmName("getPs_prop")
        get() = this.value / 10.0.pow(15)
    
    /**
     * Returns the numerical value of Ps (10^15 of second)
     */
    val Second.petasecond  : Double
        /**
         * Returns the numerical value of Ps, (10^15 of second)
         */
        get() = this.value / 10.0.pow(15)
    
    @JsExport
    @JvmField
    /**
     * Ps (10^15 of second)
     */
    val Ps = Second(10.0.pow(15))
    
    @JsExport
    @JvmField
    /**
     * Ps, (10^15 of second)
     */
    val petasecond = Ps          

    /**
     * Ts, (10^12 of second)
     */    
    val Number.Ts : Second
        /**
         * Returns Ts, (10^12 of second)
         */ 
        @JvmName("getTs_prop")
        get() = Second(this.toDouble()*10.0.pow(12))
    
    /**
     * Ts, (10^12 of second)
     */ 
    val Number.terasecond : Second
        /**
         * Returns Ts (10^12 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(12))
    
    /**
     * Returns the numerical value of Ts, (10^12 of second)
     */
    val Second.Ts  : Double
        /**
         * Returns the numerical value of Ts, (10^12 of second)
         */
        @JvmName("getTs_prop")
        get() = this.value / 10.0.pow(12)
    
    /**
     * Returns the numerical value of Ts (10^12 of second)
     */
    val Second.terasecond  : Double
        /**
         * Returns the numerical value of Ts, (10^12 of second)
         */
        get() = this.value / 10.0.pow(12)
    
    @JsExport
    @JvmField
    /**
     * Ts (10^12 of second)
     */
    val Ts = Second(10.0.pow(12))
    
    @JsExport
    @JvmField
    /**
     * Ts, (10^12 of second)
     */
    val terasecond = Ts          

    /**
     * Gs, (10^9 of second)
     */    
    val Number.Gs : Second
        /**
         * Returns Gs, (10^9 of second)
         */ 
        @JvmName("getGs_prop")
        get() = Second(this.toDouble()*10.0.pow(9))
    
    /**
     * Gs, (10^9 of second)
     */ 
    val Number.gigasecond : Second
        /**
         * Returns Gs (10^9 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(9))
    
    /**
     * Returns the numerical value of Gs, (10^9 of second)
     */
    val Second.Gs  : Double
        /**
         * Returns the numerical value of Gs, (10^9 of second)
         */
        @JvmName("getGs_prop")
        get() = this.value / 10.0.pow(9)
    
    /**
     * Returns the numerical value of Gs (10^9 of second)
     */
    val Second.gigasecond  : Double
        /**
         * Returns the numerical value of Gs, (10^9 of second)
         */
        get() = this.value / 10.0.pow(9)
    
    @JsExport
    @JvmField
    /**
     * Gs (10^9 of second)
     */
    val Gs = Second(10.0.pow(9))
    
    @JsExport
    @JvmField
    /**
     * Gs, (10^9 of second)
     */
    val gigasecond = Gs          

    /**
     * Ms, (10^6 of second)
     */    
    val Number.Ms : Second
        /**
         * Returns Ms, (10^6 of second)
         */ 
        @JvmName("getMs_prop")
        get() = Second(this.toDouble()*10.0.pow(6))
    
    /**
     * Ms, (10^6 of second)
     */ 
    val Number.megasecond : Second
        /**
         * Returns Ms (10^6 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(6))
    
    /**
     * Returns the numerical value of Ms, (10^6 of second)
     */
    val Second.Ms  : Double
        /**
         * Returns the numerical value of Ms, (10^6 of second)
         */
        @JvmName("getMs_prop")
        get() = this.value / 10.0.pow(6)
    
    /**
     * Returns the numerical value of Ms (10^6 of second)
     */
    val Second.megasecond  : Double
        /**
         * Returns the numerical value of Ms, (10^6 of second)
         */
        get() = this.value / 10.0.pow(6)
    
    @JsExport
    @JvmField
    /**
     * Ms (10^6 of second)
     */
    val Ms = Second(10.0.pow(6))
    
    @JsExport
    @JvmField
    /**
     * Ms, (10^6 of second)
     */
    val megasecond = Ms          

    /**
     * ks, (10^3 of second)
     */    
    val Number.ks : Second
        /**
         * Returns ks, (10^3 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(3))
    
    /**
     * ks, (10^3 of second)
     */ 
    val Number.kilosecond : Second
        /**
         * Returns ks (10^3 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(3))
    
    /**
     * Returns the numerical value of ks, (10^3 of second)
     */
    val Second.ks  : Double
        /**
         * Returns the numerical value of ks, (10^3 of second)
         */
        get() = this.value / 10.0.pow(3)
    
    /**
     * Returns the numerical value of ks (10^3 of second)
     */
    val Second.kilosecond  : Double
        /**
         * Returns the numerical value of ks, (10^3 of second)
         */
        get() = this.value / 10.0.pow(3)
    
    @JsExport
    @JvmField
    /**
     * ks (10^3 of second)
     */
    val ks = Second(10.0.pow(3))
    
    @JsExport
    @JvmField
    /**
     * ks, (10^3 of second)
     */
    val kilosecond = ks          

    /**
     * hs, (10^2 of second)
     */    
    val Number.hs : Second
        /**
         * Returns hs, (10^2 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(2))
    
    /**
     * hs, (10^2 of second)
     */ 
    val Number.hectosecond : Second
        /**
         * Returns hs (10^2 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(2))
    
    /**
     * Returns the numerical value of hs, (10^2 of second)
     */
    val Second.hs  : Double
        /**
         * Returns the numerical value of hs, (10^2 of second)
         */
        get() = this.value / 10.0.pow(2)
    
    /**
     * Returns the numerical value of hs (10^2 of second)
     */
    val Second.hectosecond  : Double
        /**
         * Returns the numerical value of hs, (10^2 of second)
         */
        get() = this.value / 10.0.pow(2)
    
    @JsExport
    @JvmField
    /**
     * hs (10^2 of second)
     */
    val hs = Second(10.0.pow(2))
    
    @JsExport
    @JvmField
    /**
     * hs, (10^2 of second)
     */
    val hectosecond = hs          

    /**
     * das, (10^1 of second)
     */    
    val Number.das : Second
        /**
         * Returns das, (10^1 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(1))
    
    /**
     * das, (10^1 of second)
     */ 
    val Number.decasecond : Second
        /**
         * Returns das (10^1 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(1))
    
    /**
     * Returns the numerical value of das, (10^1 of second)
     */
    val Second.das  : Double
        /**
         * Returns the numerical value of das, (10^1 of second)
         */
        get() = this.value / 10.0.pow(1)
    
    /**
     * Returns the numerical value of das (10^1 of second)
     */
    val Second.decasecond  : Double
        /**
         * Returns the numerical value of das, (10^1 of second)
         */
        get() = this.value / 10.0.pow(1)
    
    @JsExport
    @JvmField
    /**
     * das (10^1 of second)
     */
    val das = Second(10.0.pow(1))
    
    @JsExport
    @JvmField
    /**
     * das, (10^1 of second)
     */
    val decasecond = das          

    /**
     * ds, (10^-1 of second)
     */    
    val Number.ds : Second
        /**
         * Returns ds, (10^-1 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-1))
    
    /**
     * ds, (10^-1 of second)
     */ 
    val Number.decisecond : Second
        /**
         * Returns ds (10^-1 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-1))
    
    /**
     * Returns the numerical value of ds, (10^-1 of second)
     */
    val Second.ds  : Double
        /**
         * Returns the numerical value of ds, (10^-1 of second)
         */
        get() = this.value / 10.0.pow(-1)
    
    /**
     * Returns the numerical value of ds (10^-1 of second)
     */
    val Second.decisecond  : Double
        /**
         * Returns the numerical value of ds, (10^-1 of second)
         */
        get() = this.value / 10.0.pow(-1)
    
    @JsExport
    @JvmField
    /**
     * ds (10^-1 of second)
     */
    val ds = Second(10.0.pow(-1))
    
    @JsExport
    @JvmField
    /**
     * ds, (10^-1 of second)
     */
    val decisecond = ds          

    /**
     * cs, (10^-2 of second)
     */    
    val Number.cs : Second
        /**
         * Returns cs, (10^-2 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-2))
    
    /**
     * cs, (10^-2 of second)
     */ 
    val Number.centisecond : Second
        /**
         * Returns cs (10^-2 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-2))
    
    /**
     * Returns the numerical value of cs, (10^-2 of second)
     */
    val Second.cs  : Double
        /**
         * Returns the numerical value of cs, (10^-2 of second)
         */
        get() = this.value / 10.0.pow(-2)
    
    /**
     * Returns the numerical value of cs (10^-2 of second)
     */
    val Second.centisecond  : Double
        /**
         * Returns the numerical value of cs, (10^-2 of second)
         */
        get() = this.value / 10.0.pow(-2)
    
    @JsExport
    @JvmField
    /**
     * cs (10^-2 of second)
     */
    val cs = Second(10.0.pow(-2))
    
    @JsExport
    @JvmField
    /**
     * cs, (10^-2 of second)
     */
    val centisecond = cs          

    /**
     * ms, (10^-3 of second)
     */    
    val Number.ms : Second
        /**
         * Returns ms, (10^-3 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-3))
    
    /**
     * ms, (10^-3 of second)
     */ 
    val Number.millisecond : Second
        /**
         * Returns ms (10^-3 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-3))
    
    /**
     * Returns the numerical value of ms, (10^-3 of second)
     */
    val Second.ms  : Double
        /**
         * Returns the numerical value of ms, (10^-3 of second)
         */
        get() = this.value / 10.0.pow(-3)
    
    /**
     * Returns the numerical value of ms (10^-3 of second)
     */
    val Second.millisecond  : Double
        /**
         * Returns the numerical value of ms, (10^-3 of second)
         */
        get() = this.value / 10.0.pow(-3)
    
    
    @JvmField
    /**
     * ms (10^-3 of second)
     */
    val ms = Second(10.0.pow(-3))
    
    @JsExport
    @JvmField
    /**
     * ms, (10^-3 of second)
     */
    val millisecond = ms          

    /**
     * μs, (10^-6 of second)
     */    
    val Number.μs : Second
        /**
         * Returns μs, (10^-6 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-6))
    
    /**
     * μs, (10^-6 of second)
     */ 
    val Number.microsecond : Second
        /**
         * Returns μs (10^-6 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-6))
    
    /**
     * Returns the numerical value of μs, (10^-6 of second)
     */
    val Second.μs  : Double
        /**
         * Returns the numerical value of μs, (10^-6 of second)
         */
        get() = this.value / 10.0.pow(-6)
    
    /**
     * Returns the numerical value of μs (10^-6 of second)
     */
    val Second.microsecond  : Double
        /**
         * Returns the numerical value of μs, (10^-6 of second)
         */
        get() = this.value / 10.0.pow(-6)
    
    @JsExport
    @JvmField
    /**
     * μs (10^-6 of second)
     */
    val μs = Second(10.0.pow(-6))
    
    @JsExport
    @JvmField
    /**
     * μs, (10^-6 of second)
     */
    val microsecond = μs          

    /**
     * ns, (10^-9 of second)
     */    
    val Number.ns : Second
        /**
         * Returns ns, (10^-9 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-9))
    
    /**
     * ns, (10^-9 of second)
     */ 
    val Number.nanosecond : Second
        /**
         * Returns ns (10^-9 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-9))
    
    /**
     * Returns the numerical value of ns, (10^-9 of second)
     */
    val Second.ns  : Double
        /**
         * Returns the numerical value of ns, (10^-9 of second)
         */
        get() = this.value / 10.0.pow(-9)
    
    /**
     * Returns the numerical value of ns (10^-9 of second)
     */
    val Second.nanosecond  : Double
        /**
         * Returns the numerical value of ns, (10^-9 of second)
         */
        get() = this.value / 10.0.pow(-9)
    
    @JsExport
    @JvmField
    /**
     * ns (10^-9 of second)
     */
    val ns = Second(10.0.pow(-9))
    
    @JsExport
    @JvmField
    /**
     * ns, (10^-9 of second)
     */
    val nanosecond = ns          

    /**
     * ps, (10^-12 of second)
     */    
    val Number.ps : Second
        /**
         * Returns ps, (10^-12 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-12))
    
    /**
     * ps, (10^-12 of second)
     */ 
    val Number.picosecond : Second
        /**
         * Returns ps (10^-12 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-12))
    
    /**
     * Returns the numerical value of ps, (10^-12 of second)
     */
    val Second.ps  : Double
        /**
         * Returns the numerical value of ps, (10^-12 of second)
         */
        get() = this.value / 10.0.pow(-12)
    
    /**
     * Returns the numerical value of ps (10^-12 of second)
     */
    val Second.picosecond  : Double
        /**
         * Returns the numerical value of ps, (10^-12 of second)
         */
        get() = this.value / 10.0.pow(-12)
    
    
    @JvmField
    /**
     * ps (10^-12 of second)
     */
    val ps = Second(10.0.pow(-12))
    
    @JsExport
    @JvmField
    /**
     * ps, (10^-12 of second)
     */
    val picosecond = ps          

    /**
     * fs, (10^-15 of second)
     */    
    val Number.fs : Second
        /**
         * Returns fs, (10^-15 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-15))
    
    /**
     * fs, (10^-15 of second)
     */ 
    val Number.femtosecond : Second
        /**
         * Returns fs (10^-15 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-15))
    
    /**
     * Returns the numerical value of fs, (10^-15 of second)
     */
    val Second.fs  : Double
        /**
         * Returns the numerical value of fs, (10^-15 of second)
         */
        get() = this.value / 10.0.pow(-15)
    
    /**
     * Returns the numerical value of fs (10^-15 of second)
     */
    val Second.femtosecond  : Double
        /**
         * Returns the numerical value of fs, (10^-15 of second)
         */
        get() = this.value / 10.0.pow(-15)
    
    @JsExport
    @JvmField
    /**
     * fs (10^-15 of second)
     */
    val fs = Second(10.0.pow(-15))
    
    @JsExport
    @JvmField
    /**
     * fs, (10^-15 of second)
     */
    val femtosecond = fs          

    /**
     * `as`, (10^-18 of second)
     */    
    val Number.`as` : Second
        /**
         * Returns `as`, (10^-18 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-18))
    
    /**
     * `as`, (10^-18 of second)
     */ 
    val Number.attosecond : Second
        /**
         * Returns `as` (10^-18 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-18))
    
    /**
     * Returns the numerical value of `as`, (10^-18 of second)
     */
    val Second.`as`  : Double
        /**
         * Returns the numerical value of `as`, (10^-18 of second)
         */
        get() = this.value / 10.0.pow(-18)
    
    /**
     * Returns the numerical value of `as` (10^-18 of second)
     */
    val Second.attosecond  : Double
        /**
         * Returns the numerical value of `as`, (10^-18 of second)
         */
        get() = this.value / 10.0.pow(-18)
    
    @JsExport
    @JvmField
    /**
     * `as` (10^-18 of second)
     */
    val `as` = Second(10.0.pow(-18))
    
    @JsExport
    @JvmField
    /**
     * `as`, (10^-18 of second)
     */
    val attosecond = `as`          

    /**
     * zs, (10^-21 of second)
     */    
    val Number.zs : Second
        /**
         * Returns zs, (10^-21 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-21))
    
    /**
     * zs, (10^-21 of second)
     */ 
    val Number.zeptosecond : Second
        /**
         * Returns zs (10^-21 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-21))
    
    /**
     * Returns the numerical value of zs, (10^-21 of second)
     */
    val Second.zs  : Double
        /**
         * Returns the numerical value of zs, (10^-21 of second)
         */
        get() = this.value / 10.0.pow(-21)
    
    /**
     * Returns the numerical value of zs (10^-21 of second)
     */
    val Second.zeptosecond  : Double
        /**
         * Returns the numerical value of zs, (10^-21 of second)
         */
        get() = this.value / 10.0.pow(-21)
    
    
    @JvmField
    /**
     * zs (10^-21 of second)
     */
    val zs = Second(10.0.pow(-21))
    
    @JsExport
    @JvmField
    /**
     * zs, (10^-21 of second)
     */
    val zeptosecond = zs          

    /**
     * ys, (10^-24 of second)
     */    
    val Number.ys : Second
        /**
         * Returns ys, (10^-24 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-24))
    
    /**
     * ys, (10^-24 of second)
     */ 
    val Number.yoctosecond : Second
        /**
         * Returns ys (10^-24 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-24))
    
    /**
     * Returns the numerical value of ys, (10^-24 of second)
     */
    val Second.ys  : Double
        /**
         * Returns the numerical value of ys, (10^-24 of second)
         */
        get() = this.value / 10.0.pow(-24)
    
    /**
     * Returns the numerical value of ys (10^-24 of second)
     */
    val Second.yoctosecond  : Double
        /**
         * Returns the numerical value of ys, (10^-24 of second)
         */
        get() = this.value / 10.0.pow(-24)
    
    
    @JvmField
    /**
     * ys (10^-24 of second)
     */
    val ys = Second(10.0.pow(-24))
    
    @JsExport
    @JvmField
    /**
     * ys, (10^-24 of second)
     */
    val yoctosecond = ys          

    /**
     * rs, (10^-27 of second)
     */    
    val Number.rs : Second
        /**
         * Returns rs, (10^-27 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-27))
    
    /**
     * rs, (10^-27 of second)
     */ 
    val Number.rontosecond : Second
        /**
         * Returns rs (10^-27 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-27))
    
    /**
     * Returns the numerical value of rs, (10^-27 of second)
     */
    val Second.rs  : Double
        /**
         * Returns the numerical value of rs, (10^-27 of second)
         */
        get() = this.value / 10.0.pow(-27)
    
    /**
     * Returns the numerical value of rs (10^-27 of second)
     */
    val Second.rontosecond  : Double
        /**
         * Returns the numerical value of rs, (10^-27 of second)
         */
        get() = this.value / 10.0.pow(-27)
    
    
    @JvmField
    /**
     * rs (10^-27 of second)
     */
    val rs = Second(10.0.pow(-27))
    
    @JsExport
    @JvmField
    /**
     * rs, (10^-27 of second)
     */
    val rontosecond = rs          

    /**
     * qs, (10^-30 of second)
     */    
    val Number.qs : Second
        /**
         * Returns qs, (10^-30 of second)
         */ 
        get() = Second(this.toDouble()*10.0.pow(-30))
    
    /**
     * qs, (10^-30 of second)
     */ 
    val Number.quectosecond : Second
        /**
         * Returns qs (10^-30 of second)
         */
        get() = Second(this.toDouble()*10.0.pow(-30))
    
    /**
     * Returns the numerical value of qs, (10^-30 of second)
     */
    val Second.qs  : Double
        /**
         * Returns the numerical value of qs, (10^-30 of second)
         */
        get() = this.value / 10.0.pow(-30)
    
    /**
     * Returns the numerical value of qs (10^-30 of second)
     */
    val Second.quectosecond  : Double
        /**
         * Returns the numerical value of qs, (10^-30 of second)
         */
        get() = this.value / 10.0.pow(-30)
    
    
    @JvmField
    /**
     * qs (10^-30 of second)
     */
    val qs = Second(10.0.pow(-30))
    
    @JsExport
    @JvmField
    /**
     * qs, (10^-30 of second)
     */
    val quectosecond = qs          