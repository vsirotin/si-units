
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*m*m * (s `^` -3) * (A `^` -2)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for resistance, impedance, reactance.
*/
class Ohm(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for resistance, impedance, reactance.
*/
@JsExport
@JvmField
val Ω = Ohm(1.0)

/**
* Creates a Ohm object for the current number value. Ohm is a System International Unit for resistance, impedance, reactance.
*/
val Number.Ω : Ohm
   /**
   * Returns a Ohm object for the current number value. Ohm is a System International Unit for resistance, impedance, reactance.
   */
    get() = Ohm(this.toDouble())

    
/**
* QΩ, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.QΩ : Ohm
    @JvmName("getQΩ_prop")
    /**
    * Returns QΩ, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(30))

/**
* quettaohm, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.quettaohm : Ohm
    /**
    * Returns quettaohm, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QΩ, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val QΩ = 10.0.pow(30) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* quettaohm, 10^30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val quettaohm = QΩ
    

/**
* RΩ, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.RΩ : Ohm
    @JvmName("getRΩ_prop")
    /**
    * Returns RΩ, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(27))

/**
* ronnaohm, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.ronnaohm : Ohm
    /**
    * Returns ronnaohm, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RΩ, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val RΩ = 10.0.pow(27) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* ronnaohm, 10^27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val ronnaohm = RΩ
    

/**
* YΩ, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.YΩ : Ohm
    @JvmName("getYΩ_prop")
    /**
    * Returns YΩ, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(24))

/**
* yottaohm, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.yottaohm : Ohm
    /**
    * Returns yottaohm, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YΩ, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val YΩ = 10.0.pow(24) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* yottaohm, 10^24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val yottaohm = YΩ
    

/**
* ZΩ, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.ZΩ : Ohm
    @JvmName("getZΩ_prop")
    /**
    * Returns ZΩ, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(21))

/**
* zettaohm, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.zettaohm : Ohm
    /**
    * Returns zettaohm, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZΩ, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val ZΩ = 10.0.pow(21) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* zettaohm, 10^21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val zettaohm = ZΩ
    

/**
* EΩ, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.EΩ : Ohm
    @JvmName("getEΩ_prop")
    /**
    * Returns EΩ, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(18))

/**
* exaohm, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.exaohm : Ohm
    /**
    * Returns exaohm, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EΩ, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val EΩ = 10.0.pow(18) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* exaohm, 10^18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val exaohm = EΩ
    

/**
* PΩ, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.PΩ : Ohm
    @JvmName("getPΩ_prop")
    /**
    * Returns PΩ, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(15))

/**
* petaohm, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.petaohm : Ohm
    /**
    * Returns petaohm, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PΩ, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val PΩ = 10.0.pow(15) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* petaohm, 10^15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val petaohm = PΩ
    

/**
* TΩ, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.TΩ : Ohm
    @JvmName("getTΩ_prop")
    /**
    * Returns TΩ, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(12))

/**
* teraohm, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.teraohm : Ohm
    /**
    * Returns teraohm, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TΩ, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val TΩ = 10.0.pow(12) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* teraohm, 10^12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val teraohm = TΩ
    

/**
* GΩ, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.GΩ : Ohm
    @JvmName("getGΩ_prop")
    /**
    * Returns GΩ, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(9))

/**
* gigaohm, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.gigaohm : Ohm
    /**
    * Returns gigaohm, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GΩ, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val GΩ = 10.0.pow(9) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* gigaohm, 10^9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val gigaohm = GΩ
    

/**
* MΩ, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.MΩ : Ohm
    @JvmName("getMΩ_prop")
    /**
    * Returns MΩ, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(6))

/**
* megaohm, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.megaohm : Ohm
    /**
    * Returns megaohm, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MΩ, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val MΩ = 10.0.pow(6) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* megaohm, 10^6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val megaohm = MΩ
    

/**
* kΩ, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.kΩ : Ohm
    @JvmName("getkΩ_prop")
    /**
    * Returns kΩ, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(3))

/**
* kiloohm, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.kiloohm : Ohm
    /**
    * Returns kiloohm, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kΩ, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val kΩ = 10.0.pow(3) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* kiloohm, 10^3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val kiloohm = kΩ
    

/**
* hΩ, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.hΩ : Ohm
    @JvmName("gethΩ_prop")
    /**
    * Returns hΩ, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(2))

/**
* hectoohm, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.hectoohm : Ohm
    /**
    * Returns hectoohm, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hΩ, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val hΩ = 10.0.pow(2) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* hectoohm, 10^2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val hectoohm = hΩ
    

/**
* daΩ, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.daΩ : Ohm
    @JvmName("getdaΩ_prop")
    /**
    * Returns daΩ, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(1))

/**
* decaohm, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.decaohm : Ohm
    /**
    * Returns decaohm, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daΩ, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val daΩ = 10.0.pow(1) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* decaohm, 10^1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val decaohm = daΩ
    

/**
* dΩ, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.dΩ : Ohm
    @JvmName("getdΩ_prop")
    /**
    * Returns dΩ, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-1))

/**
* deciohm, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.deciohm : Ohm
    /**
    * Returns deciohm, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dΩ, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val dΩ = 10.0.pow(-1) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* deciohm, 10^-1 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val deciohm = dΩ
    

/**
* cΩ, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.cΩ : Ohm
    @JvmName("getcΩ_prop")
    /**
    * Returns cΩ, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-2))

/**
* centiohm, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.centiohm : Ohm
    /**
    * Returns centiohm, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cΩ, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val cΩ = 10.0.pow(-2) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* centiohm, 10^-2 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val centiohm = cΩ
    

/**
* mΩ, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.mΩ : Ohm
    @JvmName("getmΩ_prop")
    /**
    * Returns mΩ, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-3))

/**
* milliohm, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.milliohm : Ohm
    /**
    * Returns milliohm, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mΩ, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val mΩ = 10.0.pow(-3) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* milliohm, 10^-3 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val milliohm = mΩ
    

/**
* μΩ, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.μΩ : Ohm
    @JvmName("getμΩ_prop")
    /**
    * Returns μΩ, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-6))

/**
* microohm, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.microohm : Ohm
    /**
    * Returns microohm, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μΩ, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val μΩ = 10.0.pow(-6) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* microohm, 10^-6 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val microohm = μΩ
    

/**
* nΩ, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.nΩ : Ohm
    @JvmName("getnΩ_prop")
    /**
    * Returns nΩ, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-9))

/**
* nanoohm, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.nanoohm : Ohm
    /**
    * Returns nanoohm, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nΩ, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val nΩ = 10.0.pow(-9) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* nanoohm, 10^-9 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val nanoohm = nΩ
    

/**
* pΩ, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.pΩ : Ohm
    @JvmName("getpΩ_prop")
    /**
    * Returns pΩ, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-12))

/**
* picoohm, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.picoohm : Ohm
    /**
    * Returns picoohm, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pΩ, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val pΩ = 10.0.pow(-12) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* picoohm, 10^-12 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val picoohm = pΩ
    

/**
* fΩ, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.fΩ : Ohm
    @JvmName("getfΩ_prop")
    /**
    * Returns fΩ, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-15))

/**
* femtoohm, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.femtoohm : Ohm
    /**
    * Returns femtoohm, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fΩ, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val fΩ = 10.0.pow(-15) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* femtoohm, 10^-15 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val femtoohm = fΩ
    

/**
* aΩ, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.aΩ : Ohm
    @JvmName("getaΩ_prop")
    /**
    * Returns aΩ, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-18))

/**
* attoohm, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.attoohm : Ohm
    /**
    * Returns attoohm, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aΩ, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val aΩ = 10.0.pow(-18) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* attoohm, 10^-18 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val attoohm = aΩ
    

/**
* zΩ, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.zΩ : Ohm
    @JvmName("getzΩ_prop")
    /**
    * Returns zΩ, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-21))

/**
* zeptoohm, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.zeptoohm : Ohm
    /**
    * Returns zeptoohm, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zΩ, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val zΩ = 10.0.pow(-21) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* zeptoohm, 10^-21 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val zeptoohm = zΩ
    

/**
* yΩ, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.yΩ : Ohm
    @JvmName("getyΩ_prop")
    /**
    * Returns yΩ, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-24))

/**
* yoctoohm, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.yoctoohm : Ohm
    /**
    * Returns yoctoohm, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yΩ, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val yΩ = 10.0.pow(-24) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* yoctoohm, 10^-24 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val yoctoohm = yΩ
    

/**
* rΩ, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.rΩ : Ohm
    @JvmName("getrΩ_prop")
    /**
    * Returns rΩ, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-27))

/**
* rontoohm, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.rontoohm : Ohm
    /**
    * Returns rontoohm, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rΩ, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val rΩ = 10.0.pow(-27) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* rontoohm, 10^-27 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val rontoohm = rΩ
    

/**
* qΩ, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/    
val Number.qΩ : Ohm
    @JvmName("getqΩ_prop")
    /**
    * Returns qΩ, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-30))

/**
* quectoohm, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 
val Number.quectoohm : Ohm
    /**
    * Returns quectoohm, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
    */  
    get() = Ohm(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qΩ, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/        
val qΩ = 10.0.pow(-30) * (kg*m*m * (s `^` -3) * (A `^` -2))

/**
* quectoohm, 10^-30 of ohm, derived SI-Unit for measurement of resistance, impedance, reactance
*/ 

@JsExport
@JvmField
val quectoohm = qΩ
    