
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.math.pow
import kotlin.jvm.JvmName

private val descriptionAmpere = UnitSpecification(
    "A",
    "I",
    70
) { v: Double -> Ampere(v) }

/**
 * System International Unit for electric current.
 *
 * @constructor Creates the unit with given [value].
 */
class Ampere(value: Double) : Expression(value, description = descriptionAmpere)
    /**
     * Creates Ampere-Object for current number value. Ampere is a System International Unit for electric current.
     */
    val Number.A : Ampere
        /**
         * Returns Ampere-Object for current number value. Ampere is a System International Unit for electric current.
         */
        get() = Ampere(this.toDouble())
    
    /**
     * System International Unit for electric current.
     */
    @JvmField()
    val A = Ampere(1.0)       
    
    /**
     * QA, (10^30 of ampere)
     */    
    val Number.QA : Ampere
        /**
         * Returns QA, (10^30 of ampere)
         */ 
        @JvmName("getQA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(30))
    
    /**
     * QA, (10^30 of ampere)
     */ 
    val Number.quettaampere : Ampere
        /**
         * Returns QA (10^30 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(30))
    
    /**
     * Returns numerical value of QA, (10^30 of ampere)
     */
    val Ampere.QA  : Double
        /**
         * Returns numerical value of QA, (10^30 of ampere)
         */
        @JvmName("getQA_prop")
        get() = this.value / 10.0.pow(30)
    
    /**
     * Returns numerical value of QA (10^30 of ampere)
     */
    val Ampere.quettaampere  : Double
        /**
         * Returns numerical value of QA, (10^30 of ampere)
         */
        get() = this.value / 10.0.pow(30)
    
    @JvmField()
    /**
     * QA (10^30 of ampere)
     */
    val QA = Ampere(10.0.pow(30))
    
    /**
     * QA, (10^30 of ampere)
     */
    val quettaampere = QA          

    /**
     * RA, (10^27 of ampere)
     */    
    val Number.RA : Ampere
        /**
         * Returns RA, (10^27 of ampere)
         */ 
        @JvmName("getRA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(27))
    
    /**
     * RA, (10^27 of ampere)
     */ 
    val Number.ronnaampere : Ampere
        /**
         * Returns RA (10^27 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(27))
    
    /**
     * Returns numerical value of RA, (10^27 of ampere)
     */
    val Ampere.RA  : Double
        /**
         * Returns numerical value of RA, (10^27 of ampere)
         */
        @JvmName("getRA_prop")
        get() = this.value / 10.0.pow(27)
    
    /**
     * Returns numerical value of RA (10^27 of ampere)
     */
    val Ampere.ronnaampere  : Double
        /**
         * Returns numerical value of RA, (10^27 of ampere)
         */
        get() = this.value / 10.0.pow(27)
    
    @JvmField()
    /**
     * RA (10^27 of ampere)
     */
    val RA = Ampere(10.0.pow(27))
    
    /**
     * RA, (10^27 of ampere)
     */
    val ronnaampere = RA          

    /**
     * YA, (10^24 of ampere)
     */    
    val Number.YA : Ampere
        /**
         * Returns YA, (10^24 of ampere)
         */ 
        @JvmName("getYA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(24))
    
    /**
     * YA, (10^24 of ampere)
     */ 
    val Number.yottaampere : Ampere
        /**
         * Returns YA (10^24 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(24))
    
    /**
     * Returns numerical value of YA, (10^24 of ampere)
     */
    val Ampere.YA  : Double
        /**
         * Returns numerical value of YA, (10^24 of ampere)
         */
        @JvmName("getYA_prop")
        get() = this.value / 10.0.pow(24)
    
    /**
     * Returns numerical value of YA (10^24 of ampere)
     */
    val Ampere.yottaampere  : Double
        /**
         * Returns numerical value of YA, (10^24 of ampere)
         */
        get() = this.value / 10.0.pow(24)
    
    @JvmField()
    /**
     * YA (10^24 of ampere)
     */
    val YA = Ampere(10.0.pow(24))
    
    /**
     * YA, (10^24 of ampere)
     */
    val yottaampere = YA          

    /**
     * ZA, (10^21 of ampere)
     */    
    val Number.ZA : Ampere
        /**
         * Returns ZA, (10^21 of ampere)
         */ 
        @JvmName("getZA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(21))
    
    /**
     * ZA, (10^21 of ampere)
     */ 
    val Number.zettaampere : Ampere
        /**
         * Returns ZA (10^21 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(21))
    
    /**
     * Returns numerical value of ZA, (10^21 of ampere)
     */
    val Ampere.ZA  : Double
        /**
         * Returns numerical value of ZA, (10^21 of ampere)
         */
        @JvmName("getZA_prop")
        get() = this.value / 10.0.pow(21)
    
    /**
     * Returns numerical value of ZA (10^21 of ampere)
     */
    val Ampere.zettaampere  : Double
        /**
         * Returns numerical value of ZA, (10^21 of ampere)
         */
        get() = this.value / 10.0.pow(21)
    
    @JvmField()
    /**
     * ZA (10^21 of ampere)
     */
    val ZA = Ampere(10.0.pow(21))
    
    /**
     * ZA, (10^21 of ampere)
     */
    val zettaampere = ZA          

    /**
     * EA, (10^18 of ampere)
     */    
    val Number.EA : Ampere
        /**
         * Returns EA, (10^18 of ampere)
         */ 
        @JvmName("getEA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(18))
    
    /**
     * EA, (10^18 of ampere)
     */ 
    val Number.exaampere : Ampere
        /**
         * Returns EA (10^18 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(18))
    
    /**
     * Returns numerical value of EA, (10^18 of ampere)
     */
    val Ampere.EA  : Double
        /**
         * Returns numerical value of EA, (10^18 of ampere)
         */
        @JvmName("getEA_prop")
        get() = this.value / 10.0.pow(18)
    
    /**
     * Returns numerical value of EA (10^18 of ampere)
     */
    val Ampere.exaampere  : Double
        /**
         * Returns numerical value of EA, (10^18 of ampere)
         */
        get() = this.value / 10.0.pow(18)
    
    @JvmField()
    /**
     * EA (10^18 of ampere)
     */
    val EA = Ampere(10.0.pow(18))
    
    /**
     * EA, (10^18 of ampere)
     */
    val exaampere = EA          

    /**
     * PA, (10^15 of ampere)
     */    
    val Number.PA : Ampere
        /**
         * Returns PA, (10^15 of ampere)
         */ 
        @JvmName("getPA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(15))
    
    /**
     * PA, (10^15 of ampere)
     */ 
    val Number.petaampere : Ampere
        /**
         * Returns PA (10^15 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(15))
    
    /**
     * Returns numerical value of PA, (10^15 of ampere)
     */
    val Ampere.PA  : Double
        /**
         * Returns numerical value of PA, (10^15 of ampere)
         */
        @JvmName("getPA_prop")
        get() = this.value / 10.0.pow(15)
    
    /**
     * Returns numerical value of PA (10^15 of ampere)
     */
    val Ampere.petaampere  : Double
        /**
         * Returns numerical value of PA, (10^15 of ampere)
         */
        get() = this.value / 10.0.pow(15)
    
    @JvmField()
    /**
     * PA (10^15 of ampere)
     */
    val PA = Ampere(10.0.pow(15))
    
    /**
     * PA, (10^15 of ampere)
     */
    val petaampere = PA          

    /**
     * TA, (10^12 of ampere)
     */    
    val Number.TA : Ampere
        /**
         * Returns TA, (10^12 of ampere)
         */ 
        @JvmName("getTA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(12))
    
    /**
     * TA, (10^12 of ampere)
     */ 
    val Number.teraampere : Ampere
        /**
         * Returns TA (10^12 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(12))
    
    /**
     * Returns numerical value of TA, (10^12 of ampere)
     */
    val Ampere.TA  : Double
        /**
         * Returns numerical value of TA, (10^12 of ampere)
         */
        @JvmName("getTA_prop")
        get() = this.value / 10.0.pow(12)
    
    /**
     * Returns numerical value of TA (10^12 of ampere)
     */
    val Ampere.teraampere  : Double
        /**
         * Returns numerical value of TA, (10^12 of ampere)
         */
        get() = this.value / 10.0.pow(12)
    
    @JvmField()
    /**
     * TA (10^12 of ampere)
     */
    val TA = Ampere(10.0.pow(12))
    
    /**
     * TA, (10^12 of ampere)
     */
    val teraampere = TA          

    /**
     * GA, (10^9 of ampere)
     */    
    val Number.GA : Ampere
        /**
         * Returns GA, (10^9 of ampere)
         */ 
        @JvmName("getGA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(9))
    
    /**
     * GA, (10^9 of ampere)
     */ 
    val Number.gigaampere : Ampere
        /**
         * Returns GA (10^9 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(9))
    
    /**
     * Returns numerical value of GA, (10^9 of ampere)
     */
    val Ampere.GA  : Double
        /**
         * Returns numerical value of GA, (10^9 of ampere)
         */
        @JvmName("getGA_prop")
        get() = this.value / 10.0.pow(9)
    
    /**
     * Returns numerical value of GA (10^9 of ampere)
     */
    val Ampere.gigaampere  : Double
        /**
         * Returns numerical value of GA, (10^9 of ampere)
         */
        get() = this.value / 10.0.pow(9)
    
    @JvmField()
    /**
     * GA (10^9 of ampere)
     */
    val GA = Ampere(10.0.pow(9))
    
    /**
     * GA, (10^9 of ampere)
     */
    val gigaampere = GA          

    /**
     * MA, (10^6 of ampere)
     */    
    val Number.MA : Ampere
        /**
         * Returns MA, (10^6 of ampere)
         */ 
        @JvmName("getMA_prop")
        get() = Ampere(this.toDouble()*10.0.pow(6))
    
    /**
     * MA, (10^6 of ampere)
     */ 
    val Number.megaampere : Ampere
        /**
         * Returns MA (10^6 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(6))
    
    /**
     * Returns numerical value of MA, (10^6 of ampere)
     */
    val Ampere.MA  : Double
        /**
         * Returns numerical value of MA, (10^6 of ampere)
         */
        @JvmName("getMA_prop")
        get() = this.value / 10.0.pow(6)
    
    /**
     * Returns numerical value of MA (10^6 of ampere)
     */
    val Ampere.megaampere  : Double
        /**
         * Returns numerical value of MA, (10^6 of ampere)
         */
        get() = this.value / 10.0.pow(6)
    
    @JvmField()
    /**
     * MA (10^6 of ampere)
     */
    val MA = Ampere(10.0.pow(6))
    
    /**
     * MA, (10^6 of ampere)
     */
    val megaampere = MA          

    /**
     * kA, (10^3 of ampere)
     */    
    val Number.kA : Ampere
        /**
         * Returns kA, (10^3 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(3))
    
    /**
     * kA, (10^3 of ampere)
     */ 
    val Number.kiloampere : Ampere
        /**
         * Returns kA (10^3 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(3))
    
    /**
     * Returns numerical value of kA, (10^3 of ampere)
     */
    val Ampere.kA  : Double
        /**
         * Returns numerical value of kA, (10^3 of ampere)
         */
        get() = this.value / 10.0.pow(3)
    
    /**
     * Returns numerical value of kA (10^3 of ampere)
     */
    val Ampere.kiloampere  : Double
        /**
         * Returns numerical value of kA, (10^3 of ampere)
         */
        get() = this.value / 10.0.pow(3)
    
    @JvmField()
    /**
     * kA (10^3 of ampere)
     */
    val kA = Ampere(10.0.pow(3))
    
    /**
     * kA, (10^3 of ampere)
     */
    val kiloampere = kA          

    /**
     * hA, (10^2 of ampere)
     */    
    val Number.hA : Ampere
        /**
         * Returns hA, (10^2 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(2))
    
    /**
     * hA, (10^2 of ampere)
     */ 
    val Number.hectoampere : Ampere
        /**
         * Returns hA (10^2 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(2))
    
    /**
     * Returns numerical value of hA, (10^2 of ampere)
     */
    val Ampere.hA  : Double
        /**
         * Returns numerical value of hA, (10^2 of ampere)
         */
        get() = this.value / 10.0.pow(2)
    
    /**
     * Returns numerical value of hA (10^2 of ampere)
     */
    val Ampere.hectoampere  : Double
        /**
         * Returns numerical value of hA, (10^2 of ampere)
         */
        get() = this.value / 10.0.pow(2)
    
    @JvmField()
    /**
     * hA (10^2 of ampere)
     */
    val hA = Ampere(10.0.pow(2))
    
    /**
     * hA, (10^2 of ampere)
     */
    val hectoampere = hA          

    /**
     * daA, (10^1 of ampere)
     */    
    val Number.daA : Ampere
        /**
         * Returns daA, (10^1 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(1))
    
    /**
     * daA, (10^1 of ampere)
     */ 
    val Number.decaampere : Ampere
        /**
         * Returns daA (10^1 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(1))
    
    /**
     * Returns numerical value of daA, (10^1 of ampere)
     */
    val Ampere.daA  : Double
        /**
         * Returns numerical value of daA, (10^1 of ampere)
         */
        get() = this.value / 10.0.pow(1)
    
    /**
     * Returns numerical value of daA (10^1 of ampere)
     */
    val Ampere.decaampere  : Double
        /**
         * Returns numerical value of daA, (10^1 of ampere)
         */
        get() = this.value / 10.0.pow(1)
    
    @JvmField()
    /**
     * daA (10^1 of ampere)
     */
    val daA = Ampere(10.0.pow(1))
    
    /**
     * daA, (10^1 of ampere)
     */
    val decaampere = daA          

    /**
     * dA, (10^-1 of ampere)
     */    
    val Number.dA : Ampere
        /**
         * Returns dA, (10^-1 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-1))
    
    /**
     * dA, (10^-1 of ampere)
     */ 
    val Number.deciampere : Ampere
        /**
         * Returns dA (10^-1 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-1))
    
    /**
     * Returns numerical value of dA, (10^-1 of ampere)
     */
    val Ampere.dA  : Double
        /**
         * Returns numerical value of dA, (10^-1 of ampere)
         */
        get() = this.value / 10.0.pow(-1)
    
    /**
     * Returns numerical value of dA (10^-1 of ampere)
     */
    val Ampere.deciampere  : Double
        /**
         * Returns numerical value of dA, (10^-1 of ampere)
         */
        get() = this.value / 10.0.pow(-1)
    
    @JvmField()
    /**
     * dA (10^-1 of ampere)
     */
    val dA = Ampere(10.0.pow(-1))
    
    /**
     * dA, (10^-1 of ampere)
     */
    val deciampere = dA          

    /**
     * cA, (10^-2 of ampere)
     */    
    val Number.cA : Ampere
        /**
         * Returns cA, (10^-2 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-2))
    
    /**
     * cA, (10^-2 of ampere)
     */ 
    val Number.centiampere : Ampere
        /**
         * Returns cA (10^-2 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-2))
    
    /**
     * Returns numerical value of cA, (10^-2 of ampere)
     */
    val Ampere.cA  : Double
        /**
         * Returns numerical value of cA, (10^-2 of ampere)
         */
        get() = this.value / 10.0.pow(-2)
    
    /**
     * Returns numerical value of cA (10^-2 of ampere)
     */
    val Ampere.centiampere  : Double
        /**
         * Returns numerical value of cA, (10^-2 of ampere)
         */
        get() = this.value / 10.0.pow(-2)
    
    @JvmField()
    /**
     * cA (10^-2 of ampere)
     */
    val cA = Ampere(10.0.pow(-2))
    
    /**
     * cA, (10^-2 of ampere)
     */
    val centiampere = cA          

    /**
     * mA, (10^-3 of ampere)
     */    
    val Number.mA : Ampere
        /**
         * Returns mA, (10^-3 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-3))
    
    /**
     * mA, (10^-3 of ampere)
     */ 
    val Number.milliampere : Ampere
        /**
         * Returns mA (10^-3 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-3))
    
    /**
     * Returns numerical value of mA, (10^-3 of ampere)
     */
    val Ampere.mA  : Double
        /**
         * Returns numerical value of mA, (10^-3 of ampere)
         */
        get() = this.value / 10.0.pow(-3)
    
    /**
     * Returns numerical value of mA (10^-3 of ampere)
     */
    val Ampere.milliampere  : Double
        /**
         * Returns numerical value of mA, (10^-3 of ampere)
         */
        get() = this.value / 10.0.pow(-3)
    
    @JvmField()
    /**
     * mA (10^-3 of ampere)
     */
    val mA = Ampere(10.0.pow(-3))
    
    /**
     * mA, (10^-3 of ampere)
     */
    val milliampere = mA          

    /**
     * μA, (10^-6 of ampere)
     */    
    val Number.μA : Ampere
        /**
         * Returns μA, (10^-6 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-6))
    
    /**
     * μA, (10^-6 of ampere)
     */ 
    val Number.microampere : Ampere
        /**
         * Returns μA (10^-6 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-6))
    
    /**
     * Returns numerical value of μA, (10^-6 of ampere)
     */
    val Ampere.μA  : Double
        /**
         * Returns numerical value of μA, (10^-6 of ampere)
         */
        get() = this.value / 10.0.pow(-6)
    
    /**
     * Returns numerical value of μA (10^-6 of ampere)
     */
    val Ampere.microampere  : Double
        /**
         * Returns numerical value of μA, (10^-6 of ampere)
         */
        get() = this.value / 10.0.pow(-6)
    
    @JvmField()
    /**
     * μA (10^-6 of ampere)
     */
    val μA = Ampere(10.0.pow(-6))
    
    /**
     * μA, (10^-6 of ampere)
     */
    val microampere = μA          

    /**
     * nA, (10^-9 of ampere)
     */    
    val Number.nA : Ampere
        /**
         * Returns nA, (10^-9 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-9))
    
    /**
     * nA, (10^-9 of ampere)
     */ 
    val Number.nanoampere : Ampere
        /**
         * Returns nA (10^-9 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-9))
    
    /**
     * Returns numerical value of nA, (10^-9 of ampere)
     */
    val Ampere.nA  : Double
        /**
         * Returns numerical value of nA, (10^-9 of ampere)
         */
        get() = this.value / 10.0.pow(-9)
    
    /**
     * Returns numerical value of nA (10^-9 of ampere)
     */
    val Ampere.nanoampere  : Double
        /**
         * Returns numerical value of nA, (10^-9 of ampere)
         */
        get() = this.value / 10.0.pow(-9)
    
    @JvmField()
    /**
     * nA (10^-9 of ampere)
     */
    val nA = Ampere(10.0.pow(-9))
    
    /**
     * nA, (10^-9 of ampere)
     */
    val nanoampere = nA          

    /**
     * pA, (10^-12 of ampere)
     */    
    val Number.pA : Ampere
        /**
         * Returns pA, (10^-12 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-12))
    
    /**
     * pA, (10^-12 of ampere)
     */ 
    val Number.picoampere : Ampere
        /**
         * Returns pA (10^-12 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-12))
    
    /**
     * Returns numerical value of pA, (10^-12 of ampere)
     */
    val Ampere.pA  : Double
        /**
         * Returns numerical value of pA, (10^-12 of ampere)
         */
        get() = this.value / 10.0.pow(-12)
    
    /**
     * Returns numerical value of pA (10^-12 of ampere)
     */
    val Ampere.picoampere  : Double
        /**
         * Returns numerical value of pA, (10^-12 of ampere)
         */
        get() = this.value / 10.0.pow(-12)
    
    @JvmField()
    /**
     * pA (10^-12 of ampere)
     */
    val pA = Ampere(10.0.pow(-12))
    
    /**
     * pA, (10^-12 of ampere)
     */
    val picoampere = pA          

    /**
     * fA, (10^-15 of ampere)
     */    
    val Number.fA : Ampere
        /**
         * Returns fA, (10^-15 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-15))
    
    /**
     * fA, (10^-15 of ampere)
     */ 
    val Number.femtoampere : Ampere
        /**
         * Returns fA (10^-15 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-15))
    
    /**
     * Returns numerical value of fA, (10^-15 of ampere)
     */
    val Ampere.fA  : Double
        /**
         * Returns numerical value of fA, (10^-15 of ampere)
         */
        get() = this.value / 10.0.pow(-15)
    
    /**
     * Returns numerical value of fA (10^-15 of ampere)
     */
    val Ampere.femtoampere  : Double
        /**
         * Returns numerical value of fA, (10^-15 of ampere)
         */
        get() = this.value / 10.0.pow(-15)
    
    @JvmField()
    /**
     * fA (10^-15 of ampere)
     */
    val fA = Ampere(10.0.pow(-15))
    
    /**
     * fA, (10^-15 of ampere)
     */
    val femtoampere = fA          

    /**
     * aA, (10^-18 of ampere)
     */    
    val Number.aA : Ampere
        /**
         * Returns aA, (10^-18 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-18))
    
    /**
     * aA, (10^-18 of ampere)
     */ 
    val Number.attoampere : Ampere
        /**
         * Returns aA (10^-18 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-18))
    
    /**
     * Returns numerical value of aA, (10^-18 of ampere)
     */
    val Ampere.aA  : Double
        /**
         * Returns numerical value of aA, (10^-18 of ampere)
         */
        get() = this.value / 10.0.pow(-18)
    
    /**
     * Returns numerical value of aA (10^-18 of ampere)
     */
    val Ampere.attoampere  : Double
        /**
         * Returns numerical value of aA, (10^-18 of ampere)
         */
        get() = this.value / 10.0.pow(-18)
    
    @JvmField()
    /**
     * aA (10^-18 of ampere)
     */
    val aA = Ampere(10.0.pow(-18))
    
    /**
     * aA, (10^-18 of ampere)
     */
    val attoampere = aA          

    /**
     * zA, (10^-21 of ampere)
     */    
    val Number.zA : Ampere
        /**
         * Returns zA, (10^-21 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-21))
    
    /**
     * zA, (10^-21 of ampere)
     */ 
    val Number.zeptoampere : Ampere
        /**
         * Returns zA (10^-21 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-21))
    
    /**
     * Returns numerical value of zA, (10^-21 of ampere)
     */
    val Ampere.zA  : Double
        /**
         * Returns numerical value of zA, (10^-21 of ampere)
         */
        get() = this.value / 10.0.pow(-21)
    
    /**
     * Returns numerical value of zA (10^-21 of ampere)
     */
    val Ampere.zeptoampere  : Double
        /**
         * Returns numerical value of zA, (10^-21 of ampere)
         */
        get() = this.value / 10.0.pow(-21)
    
    @JvmField()
    /**
     * zA (10^-21 of ampere)
     */
    val zA = Ampere(10.0.pow(-21))
    
    /**
     * zA, (10^-21 of ampere)
     */
    val zeptoampere = zA          

    /**
     * yA, (10^-24 of ampere)
     */    
    val Number.yA : Ampere
        /**
         * Returns yA, (10^-24 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-24))
    
    /**
     * yA, (10^-24 of ampere)
     */ 
    val Number.yoctoampere : Ampere
        /**
         * Returns yA (10^-24 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-24))
    
    /**
     * Returns numerical value of yA, (10^-24 of ampere)
     */
    val Ampere.yA  : Double
        /**
         * Returns numerical value of yA, (10^-24 of ampere)
         */
        get() = this.value / 10.0.pow(-24)
    
    /**
     * Returns numerical value of yA (10^-24 of ampere)
     */
    val Ampere.yoctoampere  : Double
        /**
         * Returns numerical value of yA, (10^-24 of ampere)
         */
        get() = this.value / 10.0.pow(-24)
    
    @JvmField()
    /**
     * yA (10^-24 of ampere)
     */
    val yA = Ampere(10.0.pow(-24))
    
    /**
     * yA, (10^-24 of ampere)
     */
    val yoctoampere = yA          

    /**
     * rA, (10^-27 of ampere)
     */    
    val Number.rA : Ampere
        /**
         * Returns rA, (10^-27 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-27))
    
    /**
     * rA, (10^-27 of ampere)
     */ 
    val Number.rontoampere : Ampere
        /**
         * Returns rA (10^-27 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-27))
    
    /**
     * Returns numerical value of rA, (10^-27 of ampere)
     */
    val Ampere.rA  : Double
        /**
         * Returns numerical value of rA, (10^-27 of ampere)
         */
        get() = this.value / 10.0.pow(-27)
    
    /**
     * Returns numerical value of rA (10^-27 of ampere)
     */
    val Ampere.rontoampere  : Double
        /**
         * Returns numerical value of rA, (10^-27 of ampere)
         */
        get() = this.value / 10.0.pow(-27)
    
    @JvmField()
    /**
     * rA (10^-27 of ampere)
     */
    val rA = Ampere(10.0.pow(-27))
    
    /**
     * rA, (10^-27 of ampere)
     */
    val rontoampere = rA          

    /**
     * qA, (10^-30 of ampere)
     */    
    val Number.qA : Ampere
        /**
         * Returns qA, (10^-30 of ampere)
         */ 
        get() = Ampere(this.toDouble()*10.0.pow(-30))
    
    /**
     * qA, (10^-30 of ampere)
     */ 
    val Number.quectoampere : Ampere
        /**
         * Returns qA (10^-30 of ampere)
         */
        get() = Ampere(this.toDouble()*10.0.pow(-30))
    
    /**
     * Returns numerical value of qA, (10^-30 of ampere)
     */
    val Ampere.qA  : Double
        /**
         * Returns numerical value of qA, (10^-30 of ampere)
         */
        get() = this.value / 10.0.pow(-30)
    
    /**
     * Returns numerical value of qA (10^-30 of ampere)
     */
    val Ampere.quectoampere  : Double
        /**
         * Returns numerical value of qA, (10^-30 of ampere)
         */
        get() = this.value / 10.0.pow(-30)
    
    @JvmField()
    /**
     * qA (10^-30 of ampere)
     */
    val qA = Ampere(10.0.pow(-30))
    
    /**
     * qA, (10^-30 of ampere)
     */
    val quectoampere = qA          