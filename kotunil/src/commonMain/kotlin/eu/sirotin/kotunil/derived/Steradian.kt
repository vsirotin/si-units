
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  m2/m2

/**
* System International Unit for solid angle.
*/
@JsExport
@JvmField()
val sr = unit

/**
* Creates Steradian-Object for current number value. Steradian is a System International Unit for solid angle.
*/
val Number.sr : Expression
   /**
   * Returns Steradian-Object for current number value. Steradian is a System International Unit for solid angle.
   */
    get() = this.toDouble() * unit

    
/**
* Qsr, 10^30 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Qsr : Expression
    @JvmName("getQsr_prop")
    /**
    * Returns Qsr, 10^30 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettasteradian, 10^30 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.quettasteradian : Expression
    /**
    * Returns quettasteradian, 10^30 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

@JsExport
@JvmField  
/**
* Qsr, 10^30 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Qsr = 10.0.pow(30) * (m2/m2)

/**
* quettasteradian, 10^30 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val quettasteradian = Qsr
    

/**
* Rsr, 10^27 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Rsr : Expression
    @JvmName("getRsr_prop")
    /**
    * Returns Rsr, 10^27 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnasteradian, 10^27 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.ronnasteradian : Expression
    /**
    * Returns ronnasteradian, 10^27 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

@JsExport
@JvmField  
/**
* Rsr, 10^27 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Rsr = 10.0.pow(27) * (m2/m2)

/**
* ronnasteradian, 10^27 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val ronnasteradian = Rsr
    

/**
* Ysr, 10^24 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Ysr : Expression
    @JvmName("getYsr_prop")
    /**
    * Returns Ysr, 10^24 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottasteradian, 10^24 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.yottasteradian : Expression
    /**
    * Returns yottasteradian, 10^24 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

@JsExport
@JvmField  
/**
* Ysr, 10^24 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Ysr = 10.0.pow(24) * (m2/m2)

/**
* yottasteradian, 10^24 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val yottasteradian = Ysr
    

/**
* Zsr, 10^21 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Zsr : Expression
    @JvmName("getZsr_prop")
    /**
    * Returns Zsr, 10^21 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettasteradian, 10^21 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.zettasteradian : Expression
    /**
    * Returns zettasteradian, 10^21 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

@JsExport
@JvmField  
/**
* Zsr, 10^21 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Zsr = 10.0.pow(21) * (m2/m2)

/**
* zettasteradian, 10^21 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val zettasteradian = Zsr
    

/**
* Esr, 10^18 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Esr : Expression
    @JvmName("getEsr_prop")
    /**
    * Returns Esr, 10^18 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exasteradian, 10^18 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.exasteradian : Expression
    /**
    * Returns exasteradian, 10^18 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

@JsExport
@JvmField  
/**
* Esr, 10^18 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Esr = 10.0.pow(18) * (m2/m2)

/**
* exasteradian, 10^18 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val exasteradian = Esr
    

/**
* Psr, 10^15 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Psr : Expression
    @JvmName("getPsr_prop")
    /**
    * Returns Psr, 10^15 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petasteradian, 10^15 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.petasteradian : Expression
    /**
    * Returns petasteradian, 10^15 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

@JsExport
@JvmField  
/**
* Psr, 10^15 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Psr = 10.0.pow(15) * (m2/m2)

/**
* petasteradian, 10^15 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val petasteradian = Psr
    

/**
* Tsr, 10^12 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Tsr : Expression
    @JvmName("getTsr_prop")
    /**
    * Returns Tsr, 10^12 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* terasteradian, 10^12 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.terasteradian : Expression
    /**
    * Returns terasteradian, 10^12 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

@JsExport
@JvmField  
/**
* Tsr, 10^12 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Tsr = 10.0.pow(12) * (m2/m2)

/**
* terasteradian, 10^12 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val terasteradian = Tsr
    

/**
* Gsr, 10^9 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Gsr : Expression
    @JvmName("getGsr_prop")
    /**
    * Returns Gsr, 10^9 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigasteradian, 10^9 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.gigasteradian : Expression
    /**
    * Returns gigasteradian, 10^9 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

@JsExport
@JvmField  
/**
* Gsr, 10^9 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Gsr = 10.0.pow(9) * (m2/m2)

/**
* gigasteradian, 10^9 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val gigasteradian = Gsr
    

/**
* Msr, 10^6 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.Msr : Expression
    @JvmName("getMsr_prop")
    /**
    * Returns Msr, 10^6 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megasteradian, 10^6 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.megasteradian : Expression
    /**
    * Returns megasteradian, 10^6 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

@JsExport
@JvmField  
/**
* Msr, 10^6 of steradian, derived SI-Unit for measurement of solid angle
*/        
val Msr = 10.0.pow(6) * (m2/m2)

/**
* megasteradian, 10^6 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val megasteradian = Msr
    

/**
* ksr, 10^3 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.ksr : Expression
    @JvmName("getksr_prop")
    /**
    * Returns ksr, 10^3 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilosteradian, 10^3 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.kilosteradian : Expression
    /**
    * Returns kilosteradian, 10^3 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

@JsExport
@JvmField  
/**
* ksr, 10^3 of steradian, derived SI-Unit for measurement of solid angle
*/        
val ksr = 10.0.pow(3) * (m2/m2)

/**
* kilosteradian, 10^3 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val kilosteradian = ksr
    

/**
* hsr, 10^2 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.hsr : Expression
    @JvmName("gethsr_prop")
    /**
    * Returns hsr, 10^2 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectosteradian, 10^2 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.hectosteradian : Expression
    /**
    * Returns hectosteradian, 10^2 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

@JsExport
@JvmField  
/**
* hsr, 10^2 of steradian, derived SI-Unit for measurement of solid angle
*/        
val hsr = 10.0.pow(2) * (m2/m2)

/**
* hectosteradian, 10^2 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val hectosteradian = hsr
    

/**
* dasr, 10^1 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.dasr : Expression
    @JvmName("getdasr_prop")
    /**
    * Returns dasr, 10^1 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decasteradian, 10^1 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.decasteradian : Expression
    /**
    * Returns decasteradian, 10^1 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

@JsExport
@JvmField  
/**
* dasr, 10^1 of steradian, derived SI-Unit for measurement of solid angle
*/        
val dasr = 10.0.pow(1) * (m2/m2)

/**
* decasteradian, 10^1 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val decasteradian = dasr
    

/**
* dsr, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.dsr : Expression
    @JvmName("getdsr_prop")
    /**
    * Returns dsr, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decisteradian, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.decisteradian : Expression
    /**
    * Returns decisteradian, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

@JsExport
@JvmField  
/**
* dsr, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
*/        
val dsr = 10.0.pow(-1) * (m2/m2)

/**
* decisteradian, 10^-1 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val decisteradian = dsr
    

/**
* csr, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.csr : Expression
    @JvmName("getcsr_prop")
    /**
    * Returns csr, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centisteradian, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.centisteradian : Expression
    /**
    * Returns centisteradian, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

@JsExport
@JvmField  
/**
* csr, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
*/        
val csr = 10.0.pow(-2) * (m2/m2)

/**
* centisteradian, 10^-2 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val centisteradian = csr
    

/**
* msr, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.msr : Expression
    @JvmName("getmsr_prop")
    /**
    * Returns msr, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millisteradian, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.millisteradian : Expression
    /**
    * Returns millisteradian, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

@JsExport
@JvmField  
/**
* msr, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
*/        
val msr = 10.0.pow(-3) * (m2/m2)

/**
* millisteradian, 10^-3 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val millisteradian = msr
    

/**
* μsr, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.μsr : Expression
    @JvmName("getμsr_prop")
    /**
    * Returns μsr, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microsteradian, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.microsteradian : Expression
    /**
    * Returns microsteradian, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

@JsExport
@JvmField  
/**
* μsr, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
*/        
val μsr = 10.0.pow(-6) * (m2/m2)

/**
* microsteradian, 10^-6 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val microsteradian = μsr
    

/**
* nsr, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.nsr : Expression
    @JvmName("getnsr_prop")
    /**
    * Returns nsr, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanosteradian, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.nanosteradian : Expression
    /**
    * Returns nanosteradian, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

@JsExport
@JvmField  
/**
* nsr, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
*/        
val nsr = 10.0.pow(-9) * (m2/m2)

/**
* nanosteradian, 10^-9 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val nanosteradian = nsr
    

/**
* psr, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.psr : Expression
    @JvmName("getpsr_prop")
    /**
    * Returns psr, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picosteradian, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.picosteradian : Expression
    /**
    * Returns picosteradian, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

@JsExport
@JvmField  
/**
* psr, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
*/        
val psr = 10.0.pow(-12) * (m2/m2)

/**
* picosteradian, 10^-12 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val picosteradian = psr
    

/**
* fsr, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.fsr : Expression
    @JvmName("getfsr_prop")
    /**
    * Returns fsr, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtosteradian, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.femtosteradian : Expression
    /**
    * Returns femtosteradian, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

@JsExport
@JvmField  
/**
* fsr, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
*/        
val fsr = 10.0.pow(-15) * (m2/m2)

/**
* femtosteradian, 10^-15 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val femtosteradian = fsr
    

/**
* asr, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.asr : Expression
    @JvmName("getasr_prop")
    /**
    * Returns asr, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attosteradian, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.attosteradian : Expression
    /**
    * Returns attosteradian, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

@JsExport
@JvmField  
/**
* asr, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
*/        
val asr = 10.0.pow(-18) * (m2/m2)

/**
* attosteradian, 10^-18 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val attosteradian = asr
    

/**
* zsr, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.zsr : Expression
    @JvmName("getzsr_prop")
    /**
    * Returns zsr, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptosteradian, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.zeptosteradian : Expression
    /**
    * Returns zeptosteradian, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

@JsExport
@JvmField  
/**
* zsr, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
*/        
val zsr = 10.0.pow(-21) * (m2/m2)

/**
* zeptosteradian, 10^-21 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val zeptosteradian = zsr
    

/**
* ysr, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.ysr : Expression
    @JvmName("getysr_prop")
    /**
    * Returns ysr, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctosteradian, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.yoctosteradian : Expression
    /**
    * Returns yoctosteradian, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

@JsExport
@JvmField  
/**
* ysr, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
*/        
val ysr = 10.0.pow(-24) * (m2/m2)

/**
* yoctosteradian, 10^-24 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val yoctosteradian = ysr
    

/**
* rsr, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.rsr : Expression
    @JvmName("getrsr_prop")
    /**
    * Returns rsr, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontosteradian, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.rontosteradian : Expression
    /**
    * Returns rontosteradian, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

@JsExport
@JvmField  
/**
* rsr, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
*/        
val rsr = 10.0.pow(-27) * (m2/m2)

/**
* rontosteradian, 10^-27 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val rontosteradian = rsr
    

/**
* qsr, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
*/    
val Number.qsr : Expression
    @JvmName("getqsr_prop")
    /**
    * Returns qsr, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectosteradian, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
*/ 
val Number.quectosteradian : Expression
    /**
    * Returns quectosteradian, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

@JsExport
@JvmField  
/**
* qsr, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
*/        
val qsr = 10.0.pow(-30) * (m2/m2)

/**
* quectosteradian, 10^-30 of steradian, derived SI-Unit for measurement of solid angle
*/ 
@JsExport
@JvmField()
val quectosteradian = qsr
    