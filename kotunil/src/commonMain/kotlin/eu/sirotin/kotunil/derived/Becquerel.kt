
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (s `^` -1)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for activity referred to a radionuclide (decays per unit time).
*/
class Becquerel(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for activity referred to a radionuclide (decays per unit time).
*/
@JsExport
@JvmField
val Bq = Becquerel(1.0)

/**
* Creates Becquerel-Object for current number value. Becquerel is a System International Unit for activity referred to a radionuclide (decays per unit time).
*/
val Number.Bq : Becquerel
   /**
   * Returns Becquerel-Object for current number value. Becquerel is a System International Unit for activity referred to a radionuclide (decays per unit time).
   */
    get() = Becquerel(this.toDouble())

    
/**
* QBq, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/    
val Number.QBq : Becquerel
    @JvmName("getQBq_prop")
    /**
    * Returns QBq, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(30))

/**
* quettabecquerel, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.quettabecquerel : Becquerel
    /**
    * Returns quettabecquerel, 10^30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(30))

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
val Number.RBq : Becquerel
    @JvmName("getRBq_prop")
    /**
    * Returns RBq, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(27))

/**
* ronnabecquerel, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.ronnabecquerel : Becquerel
    /**
    * Returns ronnabecquerel, 10^27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(27))

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
val Number.YBq : Becquerel
    @JvmName("getYBq_prop")
    /**
    * Returns YBq, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(24))

/**
* yottabecquerel, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.yottabecquerel : Becquerel
    /**
    * Returns yottabecquerel, 10^24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(24))

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
val Number.ZBq : Becquerel
    @JvmName("getZBq_prop")
    /**
    * Returns ZBq, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(21))

/**
* zettabecquerel, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.zettabecquerel : Becquerel
    /**
    * Returns zettabecquerel, 10^21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(21))

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
val Number.EBq : Becquerel
    @JvmName("getEBq_prop")
    /**
    * Returns EBq, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(18))

/**
* exabecquerel, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.exabecquerel : Becquerel
    /**
    * Returns exabecquerel, 10^18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(18))

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
val Number.PBq : Becquerel
    @JvmName("getPBq_prop")
    /**
    * Returns PBq, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(15))

/**
* petabecquerel, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.petabecquerel : Becquerel
    /**
    * Returns petabecquerel, 10^15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(15))

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
val Number.TBq : Becquerel
    @JvmName("getTBq_prop")
    /**
    * Returns TBq, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(12))

/**
* terabecquerel, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.terabecquerel : Becquerel
    /**
    * Returns terabecquerel, 10^12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(12))

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
val Number.GBq : Becquerel
    @JvmName("getGBq_prop")
    /**
    * Returns GBq, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(9))

/**
* gigabecquerel, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.gigabecquerel : Becquerel
    /**
    * Returns gigabecquerel, 10^9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(9))

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
val Number.MBq : Becquerel
    @JvmName("getMBq_prop")
    /**
    * Returns MBq, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(6))

/**
* megabecquerel, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.megabecquerel : Becquerel
    /**
    * Returns megabecquerel, 10^6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(6))

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
val Number.kBq : Becquerel
    @JvmName("getkBq_prop")
    /**
    * Returns kBq, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(3))

/**
* kilobecquerel, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.kilobecquerel : Becquerel
    /**
    * Returns kilobecquerel, 10^3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(3))

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
val Number.hBq : Becquerel
    @JvmName("gethBq_prop")
    /**
    * Returns hBq, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(2))

/**
* hectobecquerel, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.hectobecquerel : Becquerel
    /**
    * Returns hectobecquerel, 10^2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(2))

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
val Number.daBq : Becquerel
    @JvmName("getdaBq_prop")
    /**
    * Returns daBq, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(1))

/**
* decabecquerel, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.decabecquerel : Becquerel
    /**
    * Returns decabecquerel, 10^1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(1))

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
val Number.dBq : Becquerel
    @JvmName("getdBq_prop")
    /**
    * Returns dBq, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-1))

/**
* decibecquerel, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.decibecquerel : Becquerel
    /**
    * Returns decibecquerel, 10^-1 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-1))

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
val Number.cBq : Becquerel
    @JvmName("getcBq_prop")
    /**
    * Returns cBq, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-2))

/**
* centibecquerel, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.centibecquerel : Becquerel
    /**
    * Returns centibecquerel, 10^-2 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-2))

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
val Number.mBq : Becquerel
    @JvmName("getmBq_prop")
    /**
    * Returns mBq, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-3))

/**
* millibecquerel, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.millibecquerel : Becquerel
    /**
    * Returns millibecquerel, 10^-3 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-3))


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
val Number.μBq : Becquerel
    @JvmName("getμBq_prop")
    /**
    * Returns μBq, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-6))

/**
* microbecquerel, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.microbecquerel : Becquerel
    /**
    * Returns microbecquerel, 10^-6 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-6))

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
val Number.nBq : Becquerel
    @JvmName("getnBq_prop")
    /**
    * Returns nBq, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-9))

/**
* nanobecquerel, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.nanobecquerel : Becquerel
    /**
    * Returns nanobecquerel, 10^-9 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-9))

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
val Number.pBq : Becquerel
    @JvmName("getpBq_prop")
    /**
    * Returns pBq, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-12))

/**
* picobecquerel, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.picobecquerel : Becquerel
    /**
    * Returns picobecquerel, 10^-12 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-12))


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
val Number.fBq : Becquerel
    @JvmName("getfBq_prop")
    /**
    * Returns fBq, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-15))

/**
* femtobecquerel, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.femtobecquerel : Becquerel
    /**
    * Returns femtobecquerel, 10^-15 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-15))

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
val Number.aBq : Becquerel
    @JvmName("getaBq_prop")
    /**
    * Returns aBq, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-18))

/**
* attobecquerel, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.attobecquerel : Becquerel
    /**
    * Returns attobecquerel, 10^-18 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-18))

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
val Number.zBq : Becquerel
    @JvmName("getzBq_prop")
    /**
    * Returns zBq, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-21))

/**
* zeptobecquerel, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.zeptobecquerel : Becquerel
    /**
    * Returns zeptobecquerel, 10^-21 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-21))


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
val Number.yBq : Becquerel
    @JvmName("getyBq_prop")
    /**
    * Returns yBq, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-24))

/**
* yoctobecquerel, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.yoctobecquerel : Becquerel
    /**
    * Returns yoctobecquerel, 10^-24 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-24))


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
val Number.rBq : Becquerel
    @JvmName("getrBq_prop")
    /**
    * Returns rBq, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-27))

/**
* rontobecquerel, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.rontobecquerel : Becquerel
    /**
    * Returns rontobecquerel, 10^-27 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-27))


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
val Number.qBq : Becquerel
    @JvmName("getqBq_prop")
    /**
    * Returns qBq, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-30))

/**
* quectobecquerel, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
*/ 
val Number.quectobecquerel : Becquerel
    /**
    * Returns quectobecquerel, 10^-30 of becquerel, derived SI-Unit for measurement of activity referred to a radionuclide (decays per unit time)
    */  
    get() = Becquerel(this.toDouble() * 10.0.pow(-30))


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
    