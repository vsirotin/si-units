
package eu.sirotin.kotunil.base

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.math.pow
private val descriptionKelvin = UnitSpecification(
    "K",
    "Θ",
    60
) { v: Double -> Kelvin(v) }

/**
 * System International Unit for thermodynamic temperature.
 *
 * @constructor Creates an unit with given [value].
 */
class Kelvin(value: Double) : Expression(value, description = descriptionKelvin)
    /**
     * Creates Kelvin-Object for current number value. Kelvin is a System International Unit for thermodynamic temperature.
     */
    val Number.K : Kelvin
        /**
         * Returns Kelvin-Object for current number value. Kelvin is a System International Unit for thermodynamic temperature.
         */
        get() = Kelvin(this.toDouble())
    
    /**
     * System International Unit for thermodynamic temperature.
     */
    val K = Kelvin(1.0)       
    
    /**
     * QK, (10^30 of kelvin)
     */    
    val Number.QK : Kelvin
        /**
         * Returns QK, (10^30 of kelvin)
         */ 
        @JvmName("getQK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(30))
    
    /**
     * QK, (10^30 of kelvin)
     */ 
    val Number.quettakelvin : Kelvin
        /**
         * Returns QK (10^30 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(30))
    
    /**
     * Returns numerical value of QK, (10^30 of kelvin)
     */
    val Kelvin.QK  : Double
        /**
         * Returns numerical value of QK, (10^30 of kelvin)
         */
        @JvmName("getQK_prop")
        get() = this.value / 10.0.pow(30)
    
    /**
     * Returns numerical value of QK (10^30 of kelvin)
     */
    val Kelvin.quettakelvin  : Double
        /**
         * Returns numerical value of QK, (10^30 of kelvin)
         */
        get() = this.value / 10.0.pow(30)
    
    @JvmField()
    /**
     * QK (10^30 of kelvin)
     */
    val QK = Kelvin(10.0.pow(30))
    
    /**
     * QK, (10^30 of kelvin)
     */
    val quettakelvin = QK          

    /**
     * RK, (10^27 of kelvin)
     */    
    val Number.RK : Kelvin
        /**
         * Returns RK, (10^27 of kelvin)
         */ 
        @JvmName("getRK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(27))
    
    /**
     * RK, (10^27 of kelvin)
     */ 
    val Number.ronnakelvin : Kelvin
        /**
         * Returns RK (10^27 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(27))
    
    /**
     * Returns numerical value of RK, (10^27 of kelvin)
     */
    val Kelvin.RK  : Double
        /**
         * Returns numerical value of RK, (10^27 of kelvin)
         */
        @JvmName("getRK_prop")
        get() = this.value / 10.0.pow(27)
    
    /**
     * Returns numerical value of RK (10^27 of kelvin)
     */
    val Kelvin.ronnakelvin  : Double
        /**
         * Returns numerical value of RK, (10^27 of kelvin)
         */
        get() = this.value / 10.0.pow(27)
    
    @JvmField()
    /**
     * RK (10^27 of kelvin)
     */
    val RK = Kelvin(10.0.pow(27))
    
    /**
     * RK, (10^27 of kelvin)
     */
    val ronnakelvin = RK          

    /**
     * YK, (10^24 of kelvin)
     */    
    val Number.YK : Kelvin
        /**
         * Returns YK, (10^24 of kelvin)
         */ 
        @JvmName("getYK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(24))
    
    /**
     * YK, (10^24 of kelvin)
     */ 
    val Number.yottakelvin : Kelvin
        /**
         * Returns YK (10^24 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(24))
    
    /**
     * Returns numerical value of YK, (10^24 of kelvin)
     */
    val Kelvin.YK  : Double
        /**
         * Returns numerical value of YK, (10^24 of kelvin)
         */
        @JvmName("getYK_prop")
        get() = this.value / 10.0.pow(24)
    
    /**
     * Returns numerical value of YK (10^24 of kelvin)
     */
    val Kelvin.yottakelvin  : Double
        /**
         * Returns numerical value of YK, (10^24 of kelvin)
         */
        get() = this.value / 10.0.pow(24)
    
    @JvmField()
    /**
     * YK (10^24 of kelvin)
     */
    val YK = Kelvin(10.0.pow(24))
    
    /**
     * YK, (10^24 of kelvin)
     */
    val yottakelvin = YK          

    /**
     * ZK, (10^21 of kelvin)
     */    
    val Number.ZK : Kelvin
        /**
         * Returns ZK, (10^21 of kelvin)
         */ 
        @JvmName("getZK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(21))
    
    /**
     * ZK, (10^21 of kelvin)
     */ 
    val Number.zettakelvin : Kelvin
        /**
         * Returns ZK (10^21 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(21))
    
    /**
     * Returns numerical value of ZK, (10^21 of kelvin)
     */
    val Kelvin.ZK  : Double
        /**
         * Returns numerical value of ZK, (10^21 of kelvin)
         */
        @JvmName("getZK_prop")
        get() = this.value / 10.0.pow(21)
    
    /**
     * Returns numerical value of ZK (10^21 of kelvin)
     */
    val Kelvin.zettakelvin  : Double
        /**
         * Returns numerical value of ZK, (10^21 of kelvin)
         */
        get() = this.value / 10.0.pow(21)
    
    @JvmField()
    /**
     * ZK (10^21 of kelvin)
     */
    val ZK = Kelvin(10.0.pow(21))
    
    /**
     * ZK, (10^21 of kelvin)
     */
    val zettakelvin = ZK          

    /**
     * EK, (10^18 of kelvin)
     */    
    val Number.EK : Kelvin
        /**
         * Returns EK, (10^18 of kelvin)
         */ 
        @JvmName("getEK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(18))
    
    /**
     * EK, (10^18 of kelvin)
     */ 
    val Number.exakelvin : Kelvin
        /**
         * Returns EK (10^18 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(18))
    
    /**
     * Returns numerical value of EK, (10^18 of kelvin)
     */
    val Kelvin.EK  : Double
        /**
         * Returns numerical value of EK, (10^18 of kelvin)
         */
        @JvmName("getEK_prop")
        get() = this.value / 10.0.pow(18)
    
    /**
     * Returns numerical value of EK (10^18 of kelvin)
     */
    val Kelvin.exakelvin  : Double
        /**
         * Returns numerical value of EK, (10^18 of kelvin)
         */
        get() = this.value / 10.0.pow(18)
    
    @JvmField()
    /**
     * EK (10^18 of kelvin)
     */
    val EK = Kelvin(10.0.pow(18))
    
    /**
     * EK, (10^18 of kelvin)
     */
    val exakelvin = EK          

    /**
     * PK, (10^15 of kelvin)
     */    
    val Number.PK : Kelvin
        /**
         * Returns PK, (10^15 of kelvin)
         */ 
        @JvmName("getPK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(15))
    
    /**
     * PK, (10^15 of kelvin)
     */ 
    val Number.petakelvin : Kelvin
        /**
         * Returns PK (10^15 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(15))
    
    /**
     * Returns numerical value of PK, (10^15 of kelvin)
     */
    val Kelvin.PK  : Double
        /**
         * Returns numerical value of PK, (10^15 of kelvin)
         */
        @JvmName("getPK_prop")
        get() = this.value / 10.0.pow(15)
    
    /**
     * Returns numerical value of PK (10^15 of kelvin)
     */
    val Kelvin.petakelvin  : Double
        /**
         * Returns numerical value of PK, (10^15 of kelvin)
         */
        get() = this.value / 10.0.pow(15)
    
    @JvmField()
    /**
     * PK (10^15 of kelvin)
     */
    val PK = Kelvin(10.0.pow(15))
    
    /**
     * PK, (10^15 of kelvin)
     */
    val petakelvin = PK          

    /**
     * TK, (10^12 of kelvin)
     */    
    val Number.TK : Kelvin
        /**
         * Returns TK, (10^12 of kelvin)
         */ 
        @JvmName("getTK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(12))
    
    /**
     * TK, (10^12 of kelvin)
     */ 
    val Number.terakelvin : Kelvin
        /**
         * Returns TK (10^12 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(12))
    
    /**
     * Returns numerical value of TK, (10^12 of kelvin)
     */
    val Kelvin.TK  : Double
        /**
         * Returns numerical value of TK, (10^12 of kelvin)
         */
        @JvmName("getTK_prop")
        get() = this.value / 10.0.pow(12)
    
    /**
     * Returns numerical value of TK (10^12 of kelvin)
     */
    val Kelvin.terakelvin  : Double
        /**
         * Returns numerical value of TK, (10^12 of kelvin)
         */
        get() = this.value / 10.0.pow(12)
    
    @JvmField()
    /**
     * TK (10^12 of kelvin)
     */
    val TK = Kelvin(10.0.pow(12))
    
    /**
     * TK, (10^12 of kelvin)
     */
    val terakelvin = TK          

    /**
     * GK, (10^9 of kelvin)
     */    
    val Number.GK : Kelvin
        /**
         * Returns GK, (10^9 of kelvin)
         */ 
        @JvmName("getGK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(9))
    
    /**
     * GK, (10^9 of kelvin)
     */ 
    val Number.gigakelvin : Kelvin
        /**
         * Returns GK (10^9 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(9))
    
    /**
     * Returns numerical value of GK, (10^9 of kelvin)
     */
    val Kelvin.GK  : Double
        /**
         * Returns numerical value of GK, (10^9 of kelvin)
         */
        @JvmName("getGK_prop")
        get() = this.value / 10.0.pow(9)
    
    /**
     * Returns numerical value of GK (10^9 of kelvin)
     */
    val Kelvin.gigakelvin  : Double
        /**
         * Returns numerical value of GK, (10^9 of kelvin)
         */
        get() = this.value / 10.0.pow(9)
    
    @JvmField()
    /**
     * GK (10^9 of kelvin)
     */
    val GK = Kelvin(10.0.pow(9))
    
    /**
     * GK, (10^9 of kelvin)
     */
    val gigakelvin = GK          

    /**
     * MK, (10^6 of kelvin)
     */    
    val Number.MK : Kelvin
        /**
         * Returns MK, (10^6 of kelvin)
         */ 
        @JvmName("getMK_prop")
        get() = Kelvin(this.toDouble()*10.0.pow(6))
    
    /**
     * MK, (10^6 of kelvin)
     */ 
    val Number.megakelvin : Kelvin
        /**
         * Returns MK (10^6 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(6))
    
    /**
     * Returns numerical value of MK, (10^6 of kelvin)
     */
    val Kelvin.MK  : Double
        /**
         * Returns numerical value of MK, (10^6 of kelvin)
         */
        @JvmName("getMK_prop")
        get() = this.value / 10.0.pow(6)
    
    /**
     * Returns numerical value of MK (10^6 of kelvin)
     */
    val Kelvin.megakelvin  : Double
        /**
         * Returns numerical value of MK, (10^6 of kelvin)
         */
        get() = this.value / 10.0.pow(6)
    
    @JvmField()
    /**
     * MK (10^6 of kelvin)
     */
    val MK = Kelvin(10.0.pow(6))
    
    /**
     * MK, (10^6 of kelvin)
     */
    val megakelvin = MK          

    /**
     * kK, (10^3 of kelvin)
     */    
    val Number.kK : Kelvin
        /**
         * Returns kK, (10^3 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(3))
    
    /**
     * kK, (10^3 of kelvin)
     */ 
    val Number.kilokelvin : Kelvin
        /**
         * Returns kK (10^3 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(3))
    
    /**
     * Returns numerical value of kK, (10^3 of kelvin)
     */
    val Kelvin.kK  : Double
        /**
         * Returns numerical value of kK, (10^3 of kelvin)
         */
        get() = this.value / 10.0.pow(3)
    
    /**
     * Returns numerical value of kK (10^3 of kelvin)
     */
    val Kelvin.kilokelvin  : Double
        /**
         * Returns numerical value of kK, (10^3 of kelvin)
         */
        get() = this.value / 10.0.pow(3)
    
    @JvmField()
    /**
     * kK (10^3 of kelvin)
     */
    val kK = Kelvin(10.0.pow(3))
    
    /**
     * kK, (10^3 of kelvin)
     */
    val kilokelvin = kK          

    /**
     * hK, (10^2 of kelvin)
     */    
    val Number.hK : Kelvin
        /**
         * Returns hK, (10^2 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(2))
    
    /**
     * hK, (10^2 of kelvin)
     */ 
    val Number.hectokelvin : Kelvin
        /**
         * Returns hK (10^2 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(2))
    
    /**
     * Returns numerical value of hK, (10^2 of kelvin)
     */
    val Kelvin.hK  : Double
        /**
         * Returns numerical value of hK, (10^2 of kelvin)
         */
        get() = this.value / 10.0.pow(2)
    
    /**
     * Returns numerical value of hK (10^2 of kelvin)
     */
    val Kelvin.hectokelvin  : Double
        /**
         * Returns numerical value of hK, (10^2 of kelvin)
         */
        get() = this.value / 10.0.pow(2)
    
    @JvmField()
    /**
     * hK (10^2 of kelvin)
     */
    val hK = Kelvin(10.0.pow(2))
    
    /**
     * hK, (10^2 of kelvin)
     */
    val hectokelvin = hK          

    /**
     * daK, (10^1 of kelvin)
     */    
    val Number.daK : Kelvin
        /**
         * Returns daK, (10^1 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(1))
    
    /**
     * daK, (10^1 of kelvin)
     */ 
    val Number.decakelvin : Kelvin
        /**
         * Returns daK (10^1 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(1))
    
    /**
     * Returns numerical value of daK, (10^1 of kelvin)
     */
    val Kelvin.daK  : Double
        /**
         * Returns numerical value of daK, (10^1 of kelvin)
         */
        get() = this.value / 10.0.pow(1)
    
    /**
     * Returns numerical value of daK (10^1 of kelvin)
     */
    val Kelvin.decakelvin  : Double
        /**
         * Returns numerical value of daK, (10^1 of kelvin)
         */
        get() = this.value / 10.0.pow(1)
    
    @JvmField()
    /**
     * daK (10^1 of kelvin)
     */
    val daK = Kelvin(10.0.pow(1))
    
    /**
     * daK, (10^1 of kelvin)
     */
    val decakelvin = daK          

    /**
     * dK, (10^-1 of kelvin)
     */    
    val Number.dK : Kelvin
        /**
         * Returns dK, (10^-1 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-1))
    
    /**
     * dK, (10^-1 of kelvin)
     */ 
    val Number.decikelvin : Kelvin
        /**
         * Returns dK (10^-1 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-1))
    
    /**
     * Returns numerical value of dK, (10^-1 of kelvin)
     */
    val Kelvin.dK  : Double
        /**
         * Returns numerical value of dK, (10^-1 of kelvin)
         */
        get() = this.value / 10.0.pow(-1)
    
    /**
     * Returns numerical value of dK (10^-1 of kelvin)
     */
    val Kelvin.decikelvin  : Double
        /**
         * Returns numerical value of dK, (10^-1 of kelvin)
         */
        get() = this.value / 10.0.pow(-1)
    
    @JvmField()
    /**
     * dK (10^-1 of kelvin)
     */
    val dK = Kelvin(10.0.pow(-1))
    
    /**
     * dK, (10^-1 of kelvin)
     */
    val decikelvin = dK          

    /**
     * cK, (10^-2 of kelvin)
     */    
    val Number.cK : Kelvin
        /**
         * Returns cK, (10^-2 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-2))
    
    /**
     * cK, (10^-2 of kelvin)
     */ 
    val Number.centikelvin : Kelvin
        /**
         * Returns cK (10^-2 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-2))
    
    /**
     * Returns numerical value of cK, (10^-2 of kelvin)
     */
    val Kelvin.cK  : Double
        /**
         * Returns numerical value of cK, (10^-2 of kelvin)
         */
        get() = this.value / 10.0.pow(-2)
    
    /**
     * Returns numerical value of cK (10^-2 of kelvin)
     */
    val Kelvin.centikelvin  : Double
        /**
         * Returns numerical value of cK, (10^-2 of kelvin)
         */
        get() = this.value / 10.0.pow(-2)
    
    @JvmField()
    /**
     * cK (10^-2 of kelvin)
     */
    val cK = Kelvin(10.0.pow(-2))
    
    /**
     * cK, (10^-2 of kelvin)
     */
    val centikelvin = cK          

    /**
     * mK, (10^-3 of kelvin)
     */    
    val Number.mK : Kelvin
        /**
         * Returns mK, (10^-3 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-3))
    
    /**
     * mK, (10^-3 of kelvin)
     */ 
    val Number.millikelvin : Kelvin
        /**
         * Returns mK (10^-3 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-3))
    
    /**
     * Returns numerical value of mK, (10^-3 of kelvin)
     */
    val Kelvin.mK  : Double
        /**
         * Returns numerical value of mK, (10^-3 of kelvin)
         */
        get() = this.value / 10.0.pow(-3)
    
    /**
     * Returns numerical value of mK (10^-3 of kelvin)
     */
    val Kelvin.millikelvin  : Double
        /**
         * Returns numerical value of mK, (10^-3 of kelvin)
         */
        get() = this.value / 10.0.pow(-3)
    
    @JvmField()
    /**
     * mK (10^-3 of kelvin)
     */
    val mK = Kelvin(10.0.pow(-3))
    
    /**
     * mK, (10^-3 of kelvin)
     */
    val millikelvin = mK          

    /**
     * μK, (10^-6 of kelvin)
     */    
    val Number.μK : Kelvin
        /**
         * Returns μK, (10^-6 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-6))
    
    /**
     * μK, (10^-6 of kelvin)
     */ 
    val Number.microkelvin : Kelvin
        /**
         * Returns μK (10^-6 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-6))
    
    /**
     * Returns numerical value of μK, (10^-6 of kelvin)
     */
    val Kelvin.μK  : Double
        /**
         * Returns numerical value of μK, (10^-6 of kelvin)
         */
        get() = this.value / 10.0.pow(-6)
    
    /**
     * Returns numerical value of μK (10^-6 of kelvin)
     */
    val Kelvin.microkelvin  : Double
        /**
         * Returns numerical value of μK, (10^-6 of kelvin)
         */
        get() = this.value / 10.0.pow(-6)
    
    @JvmField()
    /**
     * μK (10^-6 of kelvin)
     */
    val μK = Kelvin(10.0.pow(-6))
    
    /**
     * μK, (10^-6 of kelvin)
     */
    val microkelvin = μK          

    /**
     * nK, (10^-9 of kelvin)
     */    
    val Number.nK : Kelvin
        /**
         * Returns nK, (10^-9 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-9))
    
    /**
     * nK, (10^-9 of kelvin)
     */ 
    val Number.nanokelvin : Kelvin
        /**
         * Returns nK (10^-9 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-9))
    
    /**
     * Returns numerical value of nK, (10^-9 of kelvin)
     */
    val Kelvin.nK  : Double
        /**
         * Returns numerical value of nK, (10^-9 of kelvin)
         */
        get() = this.value / 10.0.pow(-9)
    
    /**
     * Returns numerical value of nK (10^-9 of kelvin)
     */
    val Kelvin.nanokelvin  : Double
        /**
         * Returns numerical value of nK, (10^-9 of kelvin)
         */
        get() = this.value / 10.0.pow(-9)
    
    @JvmField()
    /**
     * nK (10^-9 of kelvin)
     */
    val nK = Kelvin(10.0.pow(-9))
    
    /**
     * nK, (10^-9 of kelvin)
     */
    val nanokelvin = nK          

    /**
     * pK, (10^-12 of kelvin)
     */    
    val Number.pK : Kelvin
        /**
         * Returns pK, (10^-12 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-12))
    
    /**
     * pK, (10^-12 of kelvin)
     */ 
    val Number.picokelvin : Kelvin
        /**
         * Returns pK (10^-12 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-12))
    
    /**
     * Returns numerical value of pK, (10^-12 of kelvin)
     */
    val Kelvin.pK  : Double
        /**
         * Returns numerical value of pK, (10^-12 of kelvin)
         */
        get() = this.value / 10.0.pow(-12)
    
    /**
     * Returns numerical value of pK (10^-12 of kelvin)
     */
    val Kelvin.picokelvin  : Double
        /**
         * Returns numerical value of pK, (10^-12 of kelvin)
         */
        get() = this.value / 10.0.pow(-12)
    
    @JvmField()
    /**
     * pK (10^-12 of kelvin)
     */
    val pK = Kelvin(10.0.pow(-12))
    
    /**
     * pK, (10^-12 of kelvin)
     */
    val picokelvin = pK          

    /**
     * fK, (10^-15 of kelvin)
     */    
    val Number.fK : Kelvin
        /**
         * Returns fK, (10^-15 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-15))
    
    /**
     * fK, (10^-15 of kelvin)
     */ 
    val Number.femtokelvin : Kelvin
        /**
         * Returns fK (10^-15 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-15))
    
    /**
     * Returns numerical value of fK, (10^-15 of kelvin)
     */
    val Kelvin.fK  : Double
        /**
         * Returns numerical value of fK, (10^-15 of kelvin)
         */
        get() = this.value / 10.0.pow(-15)
    
    /**
     * Returns numerical value of fK (10^-15 of kelvin)
     */
    val Kelvin.femtokelvin  : Double
        /**
         * Returns numerical value of fK, (10^-15 of kelvin)
         */
        get() = this.value / 10.0.pow(-15)
    
    @JvmField()
    /**
     * fK (10^-15 of kelvin)
     */
    val fK = Kelvin(10.0.pow(-15))
    
    /**
     * fK, (10^-15 of kelvin)
     */
    val femtokelvin = fK          

    /**
     * aK, (10^-18 of kelvin)
     */    
    val Number.aK : Kelvin
        /**
         * Returns aK, (10^-18 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-18))
    
    /**
     * aK, (10^-18 of kelvin)
     */ 
    val Number.attokelvin : Kelvin
        /**
         * Returns aK (10^-18 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-18))
    
    /**
     * Returns numerical value of aK, (10^-18 of kelvin)
     */
    val Kelvin.aK  : Double
        /**
         * Returns numerical value of aK, (10^-18 of kelvin)
         */
        get() = this.value / 10.0.pow(-18)
    
    /**
     * Returns numerical value of aK (10^-18 of kelvin)
     */
    val Kelvin.attokelvin  : Double
        /**
         * Returns numerical value of aK, (10^-18 of kelvin)
         */
        get() = this.value / 10.0.pow(-18)
    
    @JvmField()
    /**
     * aK (10^-18 of kelvin)
     */
    val aK = Kelvin(10.0.pow(-18))
    
    /**
     * aK, (10^-18 of kelvin)
     */
    val attokelvin = aK          

    /**
     * zK, (10^-21 of kelvin)
     */    
    val Number.zK : Kelvin
        /**
         * Returns zK, (10^-21 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-21))
    
    /**
     * zK, (10^-21 of kelvin)
     */ 
    val Number.zeptokelvin : Kelvin
        /**
         * Returns zK (10^-21 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-21))
    
    /**
     * Returns numerical value of zK, (10^-21 of kelvin)
     */
    val Kelvin.zK  : Double
        /**
         * Returns numerical value of zK, (10^-21 of kelvin)
         */
        get() = this.value / 10.0.pow(-21)
    
    /**
     * Returns numerical value of zK (10^-21 of kelvin)
     */
    val Kelvin.zeptokelvin  : Double
        /**
         * Returns numerical value of zK, (10^-21 of kelvin)
         */
        get() = this.value / 10.0.pow(-21)
    
    @JvmField()
    /**
     * zK (10^-21 of kelvin)
     */
    val zK = Kelvin(10.0.pow(-21))
    
    /**
     * zK, (10^-21 of kelvin)
     */
    val zeptokelvin = zK          

    /**
     * yK, (10^-24 of kelvin)
     */    
    val Number.yK : Kelvin
        /**
         * Returns yK, (10^-24 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-24))
    
    /**
     * yK, (10^-24 of kelvin)
     */ 
    val Number.yoctokelvin : Kelvin
        /**
         * Returns yK (10^-24 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-24))
    
    /**
     * Returns numerical value of yK, (10^-24 of kelvin)
     */
    val Kelvin.yK  : Double
        /**
         * Returns numerical value of yK, (10^-24 of kelvin)
         */
        get() = this.value / 10.0.pow(-24)
    
    /**
     * Returns numerical value of yK (10^-24 of kelvin)
     */
    val Kelvin.yoctokelvin  : Double
        /**
         * Returns numerical value of yK, (10^-24 of kelvin)
         */
        get() = this.value / 10.0.pow(-24)
    
    @JvmField()
    /**
     * yK (10^-24 of kelvin)
     */
    val yK = Kelvin(10.0.pow(-24))
    
    /**
     * yK, (10^-24 of kelvin)
     */
    val yoctokelvin = yK          

    /**
     * rK, (10^-27 of kelvin)
     */    
    val Number.rK : Kelvin
        /**
         * Returns rK, (10^-27 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-27))
    
    /**
     * rK, (10^-27 of kelvin)
     */ 
    val Number.rontokelvin : Kelvin
        /**
         * Returns rK (10^-27 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-27))
    
    /**
     * Returns numerical value of rK, (10^-27 of kelvin)
     */
    val Kelvin.rK  : Double
        /**
         * Returns numerical value of rK, (10^-27 of kelvin)
         */
        get() = this.value / 10.0.pow(-27)
    
    /**
     * Returns numerical value of rK (10^-27 of kelvin)
     */
    val Kelvin.rontokelvin  : Double
        /**
         * Returns numerical value of rK, (10^-27 of kelvin)
         */
        get() = this.value / 10.0.pow(-27)
    
    @JvmField()
    /**
     * rK (10^-27 of kelvin)
     */
    val rK = Kelvin(10.0.pow(-27))
    
    /**
     * rK, (10^-27 of kelvin)
     */
    val rontokelvin = rK          

    /**
     * qK, (10^-30 of kelvin)
     */    
    val Number.qK : Kelvin
        /**
         * Returns qK, (10^-30 of kelvin)
         */ 
        get() = Kelvin(this.toDouble()*10.0.pow(-30))
    
    /**
     * qK, (10^-30 of kelvin)
     */ 
    val Number.quectokelvin : Kelvin
        /**
         * Returns qK (10^-30 of kelvin)
         */
        get() = Kelvin(this.toDouble()*10.0.pow(-30))
    
    /**
     * Returns numerical value of qK, (10^-30 of kelvin)
     */
    val Kelvin.qK  : Double
        /**
         * Returns numerical value of qK, (10^-30 of kelvin)
         */
        get() = this.value / 10.0.pow(-30)
    
    /**
     * Returns numerical value of qK (10^-30 of kelvin)
     */
    val Kelvin.quectokelvin  : Double
        /**
         * Returns numerical value of qK, (10^-30 of kelvin)
         */
        get() = this.value / 10.0.pow(-30)
    
    @JvmField()
    /**
     * qK (10^-30 of kelvin)
     */
    val qK = Kelvin(10.0.pow(-30))
    
    /**
     * qK, (10^-30 of kelvin)
     */
    val quectokelvin = qK          