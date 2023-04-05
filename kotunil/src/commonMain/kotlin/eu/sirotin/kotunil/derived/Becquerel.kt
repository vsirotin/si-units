
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  (s `^` -1)

/**
* System International Unit for activity referred to a radionuclide (decays per unit time).
*/
@JsExport
@JvmField
val Bq = unit

/**
* Creates Becquerel-Object for current number value. Becquerel is a System International Unit for activity referred to a radionuclide (decays per unit time).
*/
val Number.Bq : Expression
   /**
   * Returns Becquerel-Object for current number value. Becquerel is a System International Unit for activity referred to a radionuclide (decays per unit time).
   */
    get() = this.toDouble() * unit

    
/**
* QBq, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.QBq : Expression
    @JvmName("getQBq_prop")
    /**
    * Returns QBq, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettabecquerel, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.quettabecquerel : Expression
    /**
    * Returns quettabecquerel, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

@JsExport
@JvmField
/**
* QBq, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val QBq = 10.0.pow(30) * ((s `^` -1))

/**
* quettabecquerel, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val quettabecquerel = QBq
    

/**
* RBq, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.RBq : Expression
    @JvmName("getRBq_prop")
    /**
    * Returns RBq, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnabecquerel, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.ronnabecquerel : Expression
    /**
    * Returns ronnabecquerel, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

@JsExport
@JvmField
/**
* RBq, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val RBq = 10.0.pow(27) * ((s `^` -1))

/**
* ronnabecquerel, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val ronnabecquerel = RBq
    

/**
* YBq, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.YBq : Expression
    @JvmName("getYBq_prop")
    /**
    * Returns YBq, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottabecquerel, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.yottabecquerel : Expression
    /**
    * Returns yottabecquerel, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

@JsExport
@JvmField
/**
* YBq, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val YBq = 10.0.pow(24) * ((s `^` -1))

/**
* yottabecquerel, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val yottabecquerel = YBq
    

/**
* ZBq, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.ZBq : Expression
    @JvmName("getZBq_prop")
    /**
    * Returns ZBq, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettabecquerel, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.zettabecquerel : Expression
    /**
    * Returns zettabecquerel, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

@JsExport
@JvmField
/**
* ZBq, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val ZBq = 10.0.pow(21) * ((s `^` -1))

/**
* zettabecquerel, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val zettabecquerel = ZBq
    

/**
* EBq, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.EBq : Expression
    @JvmName("getEBq_prop")
    /**
    * Returns EBq, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exabecquerel, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.exabecquerel : Expression
    /**
    * Returns exabecquerel, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

@JsExport
@JvmField
/**
* EBq, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val EBq = 10.0.pow(18) * ((s `^` -1))

/**
* exabecquerel, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val exabecquerel = EBq
    

/**
* PBq, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.PBq : Expression
    @JvmName("getPBq_prop")
    /**
    * Returns PBq, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petabecquerel, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.petabecquerel : Expression
    /**
    * Returns petabecquerel, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

@JsExport
@JvmField
/**
* PBq, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val PBq = 10.0.pow(15) * ((s `^` -1))

/**
* petabecquerel, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val petabecquerel = PBq
    

/**
* TBq, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.TBq : Expression
    @JvmName("getTBq_prop")
    /**
    * Returns TBq, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* terabecquerel, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.terabecquerel : Expression
    /**
    * Returns terabecquerel, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

@JsExport
@JvmField
/**
* TBq, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val TBq = 10.0.pow(12) * ((s `^` -1))

/**
* terabecquerel, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val terabecquerel = TBq
    

/**
* GBq, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.GBq : Expression
    @JvmName("getGBq_prop")
    /**
    * Returns GBq, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigabecquerel, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.gigabecquerel : Expression
    /**
    * Returns gigabecquerel, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

@JsExport
@JvmField
/**
* GBq, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val GBq = 10.0.pow(9) * ((s `^` -1))

/**
* gigabecquerel, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val gigabecquerel = GBq
    

/**
* MBq, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.MBq : Expression
    @JvmName("getMBq_prop")
    /**
    * Returns MBq, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megabecquerel, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.megabecquerel : Expression
    /**
    * Returns megabecquerel, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

@JsExport
@JvmField
/**
* MBq, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val MBq = 10.0.pow(6) * ((s `^` -1))

/**
* megabecquerel, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val megabecquerel = MBq
    

/**
* kBq, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.kBq : Expression
    @JvmName("getkBq_prop")
    /**
    * Returns kBq, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilobecquerel, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.kilobecquerel : Expression
    /**
    * Returns kilobecquerel, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

@JsExport
@JvmField
/**
* kBq, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val kBq = 10.0.pow(3) * ((s `^` -1))

/**
* kilobecquerel, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val kilobecquerel = kBq
    

/**
* hBq, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.hBq : Expression
    @JvmName("gethBq_prop")
    /**
    * Returns hBq, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectobecquerel, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.hectobecquerel : Expression
    /**
    * Returns hectobecquerel, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

@JsExport
@JvmField
/**
* hBq, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val hBq = 10.0.pow(2) * ((s `^` -1))

/**
* hectobecquerel, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val hectobecquerel = hBq
    

/**
* daBq, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.daBq : Expression
    @JvmName("getdaBq_prop")
    /**
    * Returns daBq, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decabecquerel, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.decabecquerel : Expression
    /**
    * Returns decabecquerel, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

@JsExport
@JvmField
/**
* daBq, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val daBq = 10.0.pow(1) * ((s `^` -1))

/**
* decabecquerel, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val decabecquerel = daBq
    

/**
* dBq, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.dBq : Expression
    @JvmName("getdBq_prop")
    /**
    * Returns dBq, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decibecquerel, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.decibecquerel : Expression
    /**
    * Returns decibecquerel, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

@JsExport
@JvmField
/**
* dBq, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val dBq = 10.0.pow(-1) * ((s `^` -1))

/**
* decibecquerel, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val decibecquerel = dBq
    

/**
* cBq, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.cBq : Expression
    @JvmName("getcBq_prop")
    /**
    * Returns cBq, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centibecquerel, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.centibecquerel : Expression
    /**
    * Returns centibecquerel, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

@JsExport
@JvmField
/**
* cBq, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val cBq = 10.0.pow(-2) * ((s `^` -1))

/**
* centibecquerel, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val centibecquerel = cBq
    

/**
* mBq, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.mBq : Expression
    @JvmName("getmBq_prop")
    /**
    * Returns mBq, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millibecquerel, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.millibecquerel : Expression
    /**
    * Returns millibecquerel, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField
/**
* mBq, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val mBq = 10.0.pow(-3) * ((s `^` -1))

/**
* millibecquerel, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val millibecquerel = mBq
    

/**
* μBq, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.μBq : Expression
    @JvmName("getμBq_prop")
    /**
    * Returns μBq, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microbecquerel, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.microbecquerel : Expression
    /**
    * Returns microbecquerel, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

@JsExport
@JvmField
/**
* μBq, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val μBq = 10.0.pow(-6) * ((s `^` -1))

/**
* microbecquerel, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val microbecquerel = μBq
    

/**
* nBq, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.nBq : Expression
    @JvmName("getnBq_prop")
    /**
    * Returns nBq, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanobecquerel, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.nanobecquerel : Expression
    /**
    * Returns nanobecquerel, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

@JsExport
@JvmField
/**
* nBq, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val nBq = 10.0.pow(-9) * ((s `^` -1))

/**
* nanobecquerel, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val nanobecquerel = nBq
    

/**
* pBq, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.pBq : Expression
    @JvmName("getpBq_prop")
    /**
    * Returns pBq, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picobecquerel, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.picobecquerel : Expression
    /**
    * Returns picobecquerel, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField
/**
* pBq, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val pBq = 10.0.pow(-12) * ((s `^` -1))

/**
* picobecquerel, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val picobecquerel = pBq
    

/**
* fBq, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.fBq : Expression
    @JvmName("getfBq_prop")
    /**
    * Returns fBq, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtobecquerel, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.femtobecquerel : Expression
    /**
    * Returns femtobecquerel, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

@JsExport
@JvmField
/**
* fBq, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val fBq = 10.0.pow(-15) * ((s `^` -1))

/**
* femtobecquerel, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val femtobecquerel = fBq
    

/**
* aBq, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.aBq : Expression
    @JvmName("getaBq_prop")
    /**
    * Returns aBq, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attobecquerel, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.attobecquerel : Expression
    /**
    * Returns attobecquerel, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

@JsExport
@JvmField
/**
* aBq, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val aBq = 10.0.pow(-18) * ((s `^` -1))

/**
* attobecquerel, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val attobecquerel = aBq
    

/**
* zBq, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.zBq : Expression
    @JvmName("getzBq_prop")
    /**
    * Returns zBq, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptobecquerel, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.zeptobecquerel : Expression
    /**
    * Returns zeptobecquerel, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField
/**
* zBq, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val zBq = 10.0.pow(-21) * ((s `^` -1))

/**
* zeptobecquerel, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val zeptobecquerel = zBq
    

/**
* yBq, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.yBq : Expression
    @JvmName("getyBq_prop")
    /**
    * Returns yBq, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctobecquerel, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.yoctobecquerel : Expression
    /**
    * Returns yoctobecquerel, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField
/**
* yBq, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val yBq = 10.0.pow(-24) * ((s `^` -1))

/**
* yoctobecquerel, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val yoctobecquerel = yBq
    

/**
* rBq, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.rBq : Expression
    @JvmName("getrBq_prop")
    /**
    * Returns rBq, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontobecquerel, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.rontobecquerel : Expression
    /**
    * Returns rontobecquerel, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField
/**
* rBq, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val rBq = 10.0.pow(-27) * ((s `^` -1))

/**
* rontobecquerel, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val rontobecquerel = rBq
    

/**
* qBq, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.qBq : Expression
    @JvmName("getqBq_prop")
    /**
    * Returns qBq, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectobecquerel, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.quectobecquerel : Expression
    /**
    * Returns quectobecquerel, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField
/**
* qBq, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/        
val qBq = 10.0.pow(-30) * ((s `^` -1))

/**
* quectobecquerel, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 

@JsExport
@JvmField
val quectobecquerel = qBq
    