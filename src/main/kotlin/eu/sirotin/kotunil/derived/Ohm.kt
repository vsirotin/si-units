
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.math.pow

private val unit =  kg*m2 * (s `^` -3) * (A `^` -2)

/**
* System International Unit for resistance, impedance, reactance.
*/
val Ω = unit

/**
* Creates Ohm-Object for current number value. Ohm is a System International Unit for resistance, impedance, reactance.
*/
val Number.Ω : Expression
   /**
   * Returns Ohm-Object for current number value. Ohm is a System International Unit for resistance, impedance, reactance.
   */
    get() = this.toDouble() * unit

    
/**
* QΩ, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.QΩ : Expression
    @JvmName("getQΩ_prop")
    /**
    * Returns QΩ, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettaohm, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.quettaohm : Expression
    /**
    * Returns quettaohm, 10^30 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit


@JvmField()  
/**
* QΩ, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val QΩ = 10.0.pow(30) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* quettaohm, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val quettaohm = QΩ
    

/**
* RΩ, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.RΩ : Expression
    @JvmName("getRΩ_prop")
    /**
    * Returns RΩ, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnaohm, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.ronnaohm : Expression
    /**
    * Returns ronnaohm, 10^27 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit


@JvmField()  
/**
* RΩ, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val RΩ = 10.0.pow(27) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* ronnaohm, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val ronnaohm = RΩ
    

/**
* YΩ, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.YΩ : Expression
    @JvmName("getYΩ_prop")
    /**
    * Returns YΩ, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottaohm, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.yottaohm : Expression
    /**
    * Returns yottaohm, 10^24 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit


@JvmField()  
/**
* YΩ, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val YΩ = 10.0.pow(24) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* yottaohm, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val yottaohm = YΩ
    

/**
* ZΩ, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.ZΩ : Expression
    @JvmName("getZΩ_prop")
    /**
    * Returns ZΩ, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettaohm, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.zettaohm : Expression
    /**
    * Returns zettaohm, 10^21 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit


@JvmField()  
/**
* ZΩ, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val ZΩ = 10.0.pow(21) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* zettaohm, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val zettaohm = ZΩ
    

/**
* EΩ, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.EΩ : Expression
    @JvmName("getEΩ_prop")
    /**
    * Returns EΩ, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exaohm, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.exaohm : Expression
    /**
    * Returns exaohm, 10^18 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit


@JvmField()  
/**
* EΩ, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val EΩ = 10.0.pow(18) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* exaohm, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val exaohm = EΩ
    

/**
* PΩ, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.PΩ : Expression
    @JvmName("getPΩ_prop")
    /**
    * Returns PΩ, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petaohm, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.petaohm : Expression
    /**
    * Returns petaohm, 10^15 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit


@JvmField()  
/**
* PΩ, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val PΩ = 10.0.pow(15) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* petaohm, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val petaohm = PΩ
    

/**
* TΩ, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.TΩ : Expression
    @JvmName("getTΩ_prop")
    /**
    * Returns TΩ, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* teraohm, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.teraohm : Expression
    /**
    * Returns teraohm, 10^12 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit


@JvmField()  
/**
* TΩ, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val TΩ = 10.0.pow(12) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* teraohm, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val teraohm = TΩ
    

/**
* GΩ, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.GΩ : Expression
    @JvmName("getGΩ_prop")
    /**
    * Returns GΩ, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigaohm, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.gigaohm : Expression
    /**
    * Returns gigaohm, 10^9 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit


@JvmField()  
/**
* GΩ, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val GΩ = 10.0.pow(9) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* gigaohm, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val gigaohm = GΩ
    

/**
* MΩ, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.MΩ : Expression
    @JvmName("getMΩ_prop")
    /**
    * Returns MΩ, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megaohm, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.megaohm : Expression
    /**
    * Returns megaohm, 10^6 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit


@JvmField()  
/**
* MΩ, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val MΩ = 10.0.pow(6) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* megaohm, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val megaohm = MΩ
    

/**
* kΩ, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.kΩ : Expression
    @JvmName("getkΩ_prop")
    /**
    * Returns kΩ, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kiloohm, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.kiloohm : Expression
    /**
    * Returns kiloohm, 10^3 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit


@JvmField()  
/**
* kΩ, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val kΩ = 10.0.pow(3) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* kiloohm, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val kiloohm = kΩ
    

/**
* hΩ, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.hΩ : Expression
    @JvmName("gethΩ_prop")
    /**
    * Returns hΩ, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectoohm, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.hectoohm : Expression
    /**
    * Returns hectoohm, 10^2 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit


@JvmField()  
/**
* hΩ, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val hΩ = 10.0.pow(2) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* hectoohm, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val hectoohm = hΩ
    

/**
* daΩ, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.daΩ : Expression
    @JvmName("getdaΩ_prop")
    /**
    * Returns daΩ, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decaohm, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.decaohm : Expression
    /**
    * Returns decaohm, 10^1 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit


@JvmField()  
/**
* daΩ, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val daΩ = 10.0.pow(1) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* decaohm, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val decaohm = daΩ
    

/**
* dΩ, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.dΩ : Expression
    @JvmName("getdΩ_prop")
    /**
    * Returns dΩ, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* deciohm, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.deciohm : Expression
    /**
    * Returns deciohm, 10^-1 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit


@JvmField()  
/**
* dΩ, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val dΩ = 10.0.pow(-1) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* deciohm, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val deciohm = dΩ
    

/**
* cΩ, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.cΩ : Expression
    @JvmName("getcΩ_prop")
    /**
    * Returns cΩ, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centiohm, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.centiohm : Expression
    /**
    * Returns centiohm, 10^-2 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit


@JvmField()  
/**
* cΩ, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val cΩ = 10.0.pow(-2) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* centiohm, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val centiohm = cΩ
    

/**
* mΩ, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.mΩ : Expression
    @JvmName("getmΩ_prop")
    /**
    * Returns mΩ, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* milliohm, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.milliohm : Expression
    /**
    * Returns milliohm, 10^-3 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField()  
/**
* mΩ, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val mΩ = 10.0.pow(-3) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* milliohm, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val milliohm = mΩ
    

/**
* μΩ, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.μΩ : Expression
    @JvmName("getμΩ_prop")
    /**
    * Returns μΩ, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microohm, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.microohm : Expression
    /**
    * Returns microohm, 10^-6 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit


@JvmField()  
/**
* μΩ, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val μΩ = 10.0.pow(-6) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* microohm, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val microohm = μΩ
    

/**
* nΩ, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.nΩ : Expression
    @JvmName("getnΩ_prop")
    /**
    * Returns nΩ, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanoohm, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.nanoohm : Expression
    /**
    * Returns nanoohm, 10^-9 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit


@JvmField()  
/**
* nΩ, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val nΩ = 10.0.pow(-9) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* nanoohm, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val nanoohm = nΩ
    

/**
* pΩ, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.pΩ : Expression
    @JvmName("getpΩ_prop")
    /**
    * Returns pΩ, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picoohm, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.picoohm : Expression
    /**
    * Returns picoohm, 10^-12 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField()  
/**
* pΩ, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val pΩ = 10.0.pow(-12) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* picoohm, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val picoohm = pΩ
    

/**
* fΩ, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.fΩ : Expression
    @JvmName("getfΩ_prop")
    /**
    * Returns fΩ, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtoohm, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.femtoohm : Expression
    /**
    * Returns femtoohm, 10^-15 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit


@JvmField()  
/**
* fΩ, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val fΩ = 10.0.pow(-15) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* femtoohm, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val femtoohm = fΩ
    

/**
* aΩ, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.aΩ : Expression
    @JvmName("getaΩ_prop")
    /**
    * Returns aΩ, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attoohm, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.attoohm : Expression
    /**
    * Returns attoohm, 10^-18 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit


@JvmField()  
/**
* aΩ, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val aΩ = 10.0.pow(-18) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* attoohm, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val attoohm = aΩ
    

/**
* zΩ, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.zΩ : Expression
    @JvmName("getzΩ_prop")
    /**
    * Returns zΩ, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptoohm, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.zeptoohm : Expression
    /**
    * Returns zeptoohm, 10^-21 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField()  
/**
* zΩ, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val zΩ = 10.0.pow(-21) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* zeptoohm, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val zeptoohm = zΩ
    

/**
* yΩ, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.yΩ : Expression
    @JvmName("getyΩ_prop")
    /**
    * Returns yΩ, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctoohm, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.yoctoohm : Expression
    /**
    * Returns yoctoohm, 10^-24 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField()  
/**
* yΩ, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val yΩ = 10.0.pow(-24) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* yoctoohm, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val yoctoohm = yΩ
    

/**
* rΩ, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.rΩ : Expression
    @JvmName("getrΩ_prop")
    /**
    * Returns rΩ, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontoohm, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.rontoohm : Expression
    /**
    * Returns rontoohm, 10^-27 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField()  
/**
* rΩ, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val rΩ = 10.0.pow(-27) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* rontoohm, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val rontoohm = rΩ
    

/**
* qΩ, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.qΩ : Expression
    @JvmName("getqΩ_prop")
    /**
    * Returns qΩ, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectoohm, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.quectoohm : Expression
    /**
    * Returns quectoohm, 10^-30 of of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField()  
/**
* qΩ, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val qΩ = 10.0.pow(-30) * (kg*m2 * (s `^` -3) * (A `^` -2))

/**
* quectoohm, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val quectoohm = qΩ
    