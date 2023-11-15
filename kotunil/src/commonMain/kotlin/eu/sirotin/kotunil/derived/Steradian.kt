
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  m*m/m*m

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for solid angle.
*/
class Steradian(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for solid angle.
*/
@JsExport
@JvmField
val sr = Steradian(1.0)

/**
* Creates Steradian-Object for current number value. Steradian is a System International Unit for solid angle.
*/
val Number.sr : Steradian
   /**
   * Returns Steradian-Object for current number value. Steradian is a System International Unit for solid angle.
   */
    get() = Steradian(this.toDouble())

    
/**
* Qsr, 10^30 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Qsr : Steradian
    @JvmName("getQsr_prop")
    /**
    * Returns Qsr, 10^30 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(30))

/**
* quettasteradian, 10^30 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.quettasteradian : Steradian
    /**
    * Returns quettasteradian, 10^30 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* Qsr, 10^30 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Qsr = 10.0.pow(30) * (m*m/m*m)

/**
* quettasteradian, 10^30 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val quettasteradian = Qsr
    

/**
* Rsr, 10^27 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Rsr : Steradian
    @JvmName("getRsr_prop")
    /**
    * Returns Rsr, 10^27 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(27))

/**
* ronnasteradian, 10^27 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.ronnasteradian : Steradian
    /**
    * Returns ronnasteradian, 10^27 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* Rsr, 10^27 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Rsr = 10.0.pow(27) * (m*m/m*m)

/**
* ronnasteradian, 10^27 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val ronnasteradian = Rsr
    

/**
* Ysr, 10^24 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Ysr : Steradian
    @JvmName("getYsr_prop")
    /**
    * Returns Ysr, 10^24 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(24))

/**
* yottasteradian, 10^24 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.yottasteradian : Steradian
    /**
    * Returns yottasteradian, 10^24 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* Ysr, 10^24 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Ysr = 10.0.pow(24) * (m*m/m*m)

/**
* yottasteradian, 10^24 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val yottasteradian = Ysr
    

/**
* Zsr, 10^21 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Zsr : Steradian
    @JvmName("getZsr_prop")
    /**
    * Returns Zsr, 10^21 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(21))

/**
* zettasteradian, 10^21 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.zettasteradian : Steradian
    /**
    * Returns zettasteradian, 10^21 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* Zsr, 10^21 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Zsr = 10.0.pow(21) * (m*m/m*m)

/**
* zettasteradian, 10^21 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val zettasteradian = Zsr
    

/**
* Esr, 10^18 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Esr : Steradian
    @JvmName("getEsr_prop")
    /**
    * Returns Esr, 10^18 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(18))

/**
* exasteradian, 10^18 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.exasteradian : Steradian
    /**
    * Returns exasteradian, 10^18 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* Esr, 10^18 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Esr = 10.0.pow(18) * (m*m/m*m)

/**
* exasteradian, 10^18 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val exasteradian = Esr
    

/**
* Psr, 10^15 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Psr : Steradian
    @JvmName("getPsr_prop")
    /**
    * Returns Psr, 10^15 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(15))

/**
* petasteradian, 10^15 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.petasteradian : Steradian
    /**
    * Returns petasteradian, 10^15 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* Psr, 10^15 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Psr = 10.0.pow(15) * (m*m/m*m)

/**
* petasteradian, 10^15 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val petasteradian = Psr
    

/**
* Tsr, 10^12 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Tsr : Steradian
    @JvmName("getTsr_prop")
    /**
    * Returns Tsr, 10^12 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(12))

/**
* terasteradian, 10^12 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.terasteradian : Steradian
    /**
    * Returns terasteradian, 10^12 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* Tsr, 10^12 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Tsr = 10.0.pow(12) * (m*m/m*m)

/**
* terasteradian, 10^12 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val terasteradian = Tsr
    

/**
* Gsr, 10^9 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Gsr : Steradian
    @JvmName("getGsr_prop")
    /**
    * Returns Gsr, 10^9 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(9))

/**
* gigasteradian, 10^9 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.gigasteradian : Steradian
    /**
    * Returns gigasteradian, 10^9 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* Gsr, 10^9 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Gsr = 10.0.pow(9) * (m*m/m*m)

/**
* gigasteradian, 10^9 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val gigasteradian = Gsr
    

/**
* Msr, 10^6 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Msr : Steradian
    @JvmName("getMsr_prop")
    /**
    * Returns Msr, 10^6 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(6))

/**
* megasteradian, 10^6 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.megasteradian : Steradian
    /**
    * Returns megasteradian, 10^6 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* Msr, 10^6 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Msr = 10.0.pow(6) * (m*m/m*m)

/**
* megasteradian, 10^6 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val megasteradian = Msr
    

/**
* ksr, 10^3 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.ksr : Steradian
    @JvmName("getksr_prop")
    /**
    * Returns ksr, 10^3 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(3))

/**
* kilosteradian, 10^3 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.kilosteradian : Steradian
    /**
    * Returns kilosteradian, 10^3 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* ksr, 10^3 of steradian, derived SI-Unit for measurement of solid angle
*/        
val ksr = 10.0.pow(3) * (m*m/m*m)

/**
* kilosteradian, 10^3 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val kilosteradian = ksr
    

/**
* hsr, 10^2 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.hsr : Steradian
    @JvmName("gethsr_prop")
    /**
    * Returns hsr, 10^2 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(2))

/**
* hectosteradian, 10^2 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.hectosteradian : Steradian
    /**
    * Returns hectosteradian, 10^2 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hsr, 10^2 of steradian, derived SI-Unit for measurement of solid angle
*/        
val hsr = 10.0.pow(2) * (m*m/m*m)

/**
* hectosteradian, 10^2 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val hectosteradian = hsr
    

/**
* dasr, 10^1 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.dasr : Steradian
    @JvmName("getdasr_prop")
    /**
    * Returns dasr, 10^1 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(1))

/**
* decasteradian, 10^1 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.decasteradian : Steradian
    /**
    * Returns decasteradian, 10^1 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* dasr, 10^1 of steradian, derived SI-Unit for measurement of solid angle
*/        
val dasr = 10.0.pow(1) * (m*m/m*m)

/**
* decasteradian, 10^1 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val decasteradian = dasr
    

/**
* dsr, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.dsr : Steradian
    @JvmName("getdsr_prop")
    /**
    * Returns dsr, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-1))

/**
* decisteradian, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.decisteradian : Steradian
    /**
    * Returns decisteradian, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dsr, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
*/        
val dsr = 10.0.pow(-1) * (m*m/m*m)

/**
* decisteradian, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val decisteradian = dsr
    

/**
* csr, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.csr : Steradian
    @JvmName("getcsr_prop")
    /**
    * Returns csr, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-2))

/**
* centisteradian, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.centisteradian : Steradian
    /**
    * Returns centisteradian, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* csr, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
*/        
val csr = 10.0.pow(-2) * (m*m/m*m)

/**
* centisteradian, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val centisteradian = csr
    

/**
* msr, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.msr : Steradian
    @JvmName("getmsr_prop")
    /**
    * Returns msr, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-3))

/**
* millisteradian, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.millisteradian : Steradian
    /**
    * Returns millisteradian, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* msr, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
*/        
val msr = 10.0.pow(-3) * (m*m/m*m)

/**
* millisteradian, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val millisteradian = msr
    

/**
* μsr, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.μsr : Steradian
    @JvmName("getμsr_prop")
    /**
    * Returns μsr, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-6))

/**
* microsteradian, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.microsteradian : Steradian
    /**
    * Returns microsteradian, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μsr, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
*/        
val μsr = 10.0.pow(-6) * (m*m/m*m)

/**
* microsteradian, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val microsteradian = μsr
    

/**
* nsr, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.nsr : Steradian
    @JvmName("getnsr_prop")
    /**
    * Returns nsr, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-9))

/**
* nanosteradian, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.nanosteradian : Steradian
    /**
    * Returns nanosteradian, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nsr, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
*/        
val nsr = 10.0.pow(-9) * (m*m/m*m)

/**
* nanosteradian, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val nanosteradian = nsr
    

/**
* psr, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.psr : Steradian
    @JvmName("getpsr_prop")
    /**
    * Returns psr, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-12))

/**
* picosteradian, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.picosteradian : Steradian
    /**
    * Returns picosteradian, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* psr, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
*/        
val psr = 10.0.pow(-12) * (m*m/m*m)

/**
* picosteradian, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val picosteradian = psr
    

/**
* fsr, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.fsr : Steradian
    @JvmName("getfsr_prop")
    /**
    * Returns fsr, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-15))

/**
* femtosteradian, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.femtosteradian : Steradian
    /**
    * Returns femtosteradian, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fsr, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
*/        
val fsr = 10.0.pow(-15) * (m*m/m*m)

/**
* femtosteradian, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val femtosteradian = fsr
    

/**
* asr, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.asr : Steradian
    @JvmName("getasr_prop")
    /**
    * Returns asr, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-18))

/**
* attosteradian, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.attosteradian : Steradian
    /**
    * Returns attosteradian, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* asr, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
*/        
val asr = 10.0.pow(-18) * (m*m/m*m)

/**
* attosteradian, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val attosteradian = asr
    

/**
* zsr, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.zsr : Steradian
    @JvmName("getzsr_prop")
    /**
    * Returns zsr, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-21))

/**
* zeptosteradian, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.zeptosteradian : Steradian
    /**
    * Returns zeptosteradian, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zsr, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
*/        
val zsr = 10.0.pow(-21) * (m*m/m*m)

/**
* zeptosteradian, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val zeptosteradian = zsr
    

/**
* ysr, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.ysr : Steradian
    @JvmName("getysr_prop")
    /**
    * Returns ysr, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-24))

/**
* yoctosteradian, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.yoctosteradian : Steradian
    /**
    * Returns yoctosteradian, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* ysr, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
*/        
val ysr = 10.0.pow(-24) * (m*m/m*m)

/**
* yoctosteradian, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val yoctosteradian = ysr
    

/**
* rsr, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.rsr : Steradian
    @JvmName("getrsr_prop")
    /**
    * Returns rsr, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-27))

/**
* rontosteradian, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.rontosteradian : Steradian
    /**
    * Returns rontosteradian, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rsr, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
*/        
val rsr = 10.0.pow(-27) * (m*m/m*m)

/**
* rontosteradian, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val rontosteradian = rsr
    

/**
* qsr, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.qsr : Steradian
    @JvmName("getqsr_prop")
    /**
    * Returns qsr, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-30))

/**
* quectosteradian, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.quectosteradian : Steradian
    /**
    * Returns quectosteradian, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = Steradian(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qsr, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
*/        
val qsr = 10.0.pow(-30) * (m*m/m*m)

/**
* quectosteradian, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
*/ 

@JsExport
@JvmField
val quectosteradian = qsr
    