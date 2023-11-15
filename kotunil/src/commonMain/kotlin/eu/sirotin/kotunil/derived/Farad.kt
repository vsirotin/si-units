
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for capacitance.
*/
class Farad(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for capacitance.
*/
@JsExport
@JvmField
val F = Farad(1.0)

/**
* Creates Farad-Object for current number value. Farad is a System International Unit for capacitance.
*/
val Number.F : Farad
   /**
   * Returns Farad-Object for current number value. Farad is a System International Unit for capacitance.
   */
    get() = Farad(this.toDouble())

    
/**
* QF, 10^30 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.QF : Farad
    @JvmName("getQF_prop")
    /**
    * Returns QF, 10^30 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(30))

/**
* quettafarad, 10^30 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.quettafarad : Farad
    /**
    * Returns quettafarad, 10^30 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QF, 10^30 of farad, derived SI-Unit for measurement of capacitance
*/        
val QF = 10.0.pow(30) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* quettafarad, 10^30 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val quettafarad = QF
    

/**
* RF, 10^27 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.RF : Farad
    @JvmName("getRF_prop")
    /**
    * Returns RF, 10^27 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(27))

/**
* ronnafarad, 10^27 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.ronnafarad : Farad
    /**
    * Returns ronnafarad, 10^27 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RF, 10^27 of farad, derived SI-Unit for measurement of capacitance
*/        
val RF = 10.0.pow(27) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* ronnafarad, 10^27 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val ronnafarad = RF
    

/**
* YF, 10^24 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.YF : Farad
    @JvmName("getYF_prop")
    /**
    * Returns YF, 10^24 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(24))

/**
* yottafarad, 10^24 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.yottafarad : Farad
    /**
    * Returns yottafarad, 10^24 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YF, 10^24 of farad, derived SI-Unit for measurement of capacitance
*/        
val YF = 10.0.pow(24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* yottafarad, 10^24 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val yottafarad = YF
    

/**
* ZF, 10^21 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.ZF : Farad
    @JvmName("getZF_prop")
    /**
    * Returns ZF, 10^21 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(21))

/**
* zettafarad, 10^21 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.zettafarad : Farad
    /**
    * Returns zettafarad, 10^21 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZF, 10^21 of farad, derived SI-Unit for measurement of capacitance
*/        
val ZF = 10.0.pow(21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* zettafarad, 10^21 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val zettafarad = ZF
    

/**
* EF, 10^18 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.EF : Farad
    @JvmName("getEF_prop")
    /**
    * Returns EF, 10^18 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(18))

/**
* exafarad, 10^18 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.exafarad : Farad
    /**
    * Returns exafarad, 10^18 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EF, 10^18 of farad, derived SI-Unit for measurement of capacitance
*/        
val EF = 10.0.pow(18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* exafarad, 10^18 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val exafarad = EF
    

/**
* PF, 10^15 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.PF : Farad
    @JvmName("getPF_prop")
    /**
    * Returns PF, 10^15 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(15))

/**
* petafarad, 10^15 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.petafarad : Farad
    /**
    * Returns petafarad, 10^15 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PF, 10^15 of farad, derived SI-Unit for measurement of capacitance
*/        
val PF = 10.0.pow(15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* petafarad, 10^15 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val petafarad = PF
    

/**
* TF, 10^12 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.TF : Farad
    @JvmName("getTF_prop")
    /**
    * Returns TF, 10^12 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(12))

/**
* terafarad, 10^12 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.terafarad : Farad
    /**
    * Returns terafarad, 10^12 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TF, 10^12 of farad, derived SI-Unit for measurement of capacitance
*/        
val TF = 10.0.pow(12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* terafarad, 10^12 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val terafarad = TF
    

/**
* GF, 10^9 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.GF : Farad
    @JvmName("getGF_prop")
    /**
    * Returns GF, 10^9 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(9))

/**
* gigafarad, 10^9 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.gigafarad : Farad
    /**
    * Returns gigafarad, 10^9 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GF, 10^9 of farad, derived SI-Unit for measurement of capacitance
*/        
val GF = 10.0.pow(9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* gigafarad, 10^9 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val gigafarad = GF
    

/**
* MF, 10^6 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.MF : Farad
    @JvmName("getMF_prop")
    /**
    * Returns MF, 10^6 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(6))

/**
* megafarad, 10^6 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.megafarad : Farad
    /**
    * Returns megafarad, 10^6 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MF, 10^6 of farad, derived SI-Unit for measurement of capacitance
*/        
val MF = 10.0.pow(6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* megafarad, 10^6 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val megafarad = MF
    

/**
* kF, 10^3 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.kF : Farad
    @JvmName("getkF_prop")
    /**
    * Returns kF, 10^3 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(3))

/**
* kilofarad, 10^3 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.kilofarad : Farad
    /**
    * Returns kilofarad, 10^3 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kF, 10^3 of farad, derived SI-Unit for measurement of capacitance
*/        
val kF = 10.0.pow(3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* kilofarad, 10^3 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val kilofarad = kF
    

/**
* hF, 10^2 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.hF : Farad
    @JvmName("gethF_prop")
    /**
    * Returns hF, 10^2 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(2))

/**
* hectofarad, 10^2 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.hectofarad : Farad
    /**
    * Returns hectofarad, 10^2 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hF, 10^2 of farad, derived SI-Unit for measurement of capacitance
*/        
val hF = 10.0.pow(2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* hectofarad, 10^2 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val hectofarad = hF
    

/**
* daF, 10^1 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.daF : Farad
    @JvmName("getdaF_prop")
    /**
    * Returns daF, 10^1 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(1))

/**
* decafarad, 10^1 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.decafarad : Farad
    /**
    * Returns decafarad, 10^1 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daF, 10^1 of farad, derived SI-Unit for measurement of capacitance
*/        
val daF = 10.0.pow(1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* decafarad, 10^1 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val decafarad = daF
    

/**
* dF, 10^-1 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.dF : Farad
    @JvmName("getdF_prop")
    /**
    * Returns dF, 10^-1 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-1))

/**
* decifarad, 10^-1 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.decifarad : Farad
    /**
    * Returns decifarad, 10^-1 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dF, 10^-1 of farad, derived SI-Unit for measurement of capacitance
*/        
val dF = 10.0.pow(-1) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* decifarad, 10^-1 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val decifarad = dF
    

/**
* cF, 10^-2 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.cF : Farad
    @JvmName("getcF_prop")
    /**
    * Returns cF, 10^-2 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-2))

/**
* centifarad, 10^-2 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.centifarad : Farad
    /**
    * Returns centifarad, 10^-2 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cF, 10^-2 of farad, derived SI-Unit for measurement of capacitance
*/        
val cF = 10.0.pow(-2) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* centifarad, 10^-2 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val centifarad = cF
    

/**
* mF, 10^-3 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.mF : Farad
    @JvmName("getmF_prop")
    /**
    * Returns mF, 10^-3 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-3))

/**
* millifarad, 10^-3 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.millifarad : Farad
    /**
    * Returns millifarad, 10^-3 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mF, 10^-3 of farad, derived SI-Unit for measurement of capacitance
*/        
val mF = 10.0.pow(-3) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* millifarad, 10^-3 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val millifarad = mF
    

/**
* μF, 10^-6 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.μF : Farad
    @JvmName("getμF_prop")
    /**
    * Returns μF, 10^-6 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-6))

/**
* microfarad, 10^-6 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.microfarad : Farad
    /**
    * Returns microfarad, 10^-6 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μF, 10^-6 of farad, derived SI-Unit for measurement of capacitance
*/        
val μF = 10.0.pow(-6) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* microfarad, 10^-6 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val microfarad = μF
    

/**
* nF, 10^-9 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.nF : Farad
    @JvmName("getnF_prop")
    /**
    * Returns nF, 10^-9 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-9))

/**
* nanofarad, 10^-9 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.nanofarad : Farad
    /**
    * Returns nanofarad, 10^-9 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nF, 10^-9 of farad, derived SI-Unit for measurement of capacitance
*/        
val nF = 10.0.pow(-9) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* nanofarad, 10^-9 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val nanofarad = nF
    

/**
* pF, 10^-12 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.pF : Farad
    @JvmName("getpF_prop")
    /**
    * Returns pF, 10^-12 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-12))

/**
* picofarad, 10^-12 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.picofarad : Farad
    /**
    * Returns picofarad, 10^-12 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pF, 10^-12 of farad, derived SI-Unit for measurement of capacitance
*/        
val pF = 10.0.pow(-12) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* picofarad, 10^-12 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val picofarad = pF
    

/**
* fF, 10^-15 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.fF : Farad
    @JvmName("getfF_prop")
    /**
    * Returns fF, 10^-15 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-15))

/**
* femtofarad, 10^-15 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.femtofarad : Farad
    /**
    * Returns femtofarad, 10^-15 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fF, 10^-15 of farad, derived SI-Unit for measurement of capacitance
*/        
val fF = 10.0.pow(-15) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* femtofarad, 10^-15 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val femtofarad = fF
    

/**
* aF, 10^-18 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.aF : Farad
    @JvmName("getaF_prop")
    /**
    * Returns aF, 10^-18 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-18))

/**
* attofarad, 10^-18 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.attofarad : Farad
    /**
    * Returns attofarad, 10^-18 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aF, 10^-18 of farad, derived SI-Unit for measurement of capacitance
*/        
val aF = 10.0.pow(-18) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* attofarad, 10^-18 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val attofarad = aF
    

/**
* zF, 10^-21 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.zF : Farad
    @JvmName("getzF_prop")
    /**
    * Returns zF, 10^-21 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-21))

/**
* zeptofarad, 10^-21 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.zeptofarad : Farad
    /**
    * Returns zeptofarad, 10^-21 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zF, 10^-21 of farad, derived SI-Unit for measurement of capacitance
*/        
val zF = 10.0.pow(-21) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* zeptofarad, 10^-21 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val zeptofarad = zF
    

/**
* yF, 10^-24 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.yF : Farad
    @JvmName("getyF_prop")
    /**
    * Returns yF, 10^-24 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-24))

/**
* yoctofarad, 10^-24 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.yoctofarad : Farad
    /**
    * Returns yoctofarad, 10^-24 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yF, 10^-24 of farad, derived SI-Unit for measurement of capacitance
*/        
val yF = 10.0.pow(-24) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* yoctofarad, 10^-24 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val yoctofarad = yF
    

/**
* rF, 10^-27 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.rF : Farad
    @JvmName("getrF_prop")
    /**
    * Returns rF, 10^-27 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-27))

/**
* rontofarad, 10^-27 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.rontofarad : Farad
    /**
    * Returns rontofarad, 10^-27 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rF, 10^-27 of farad, derived SI-Unit for measurement of capacitance
*/        
val rF = 10.0.pow(-27) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* rontofarad, 10^-27 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val rontofarad = rF
    

/**
* qF, 10^-30 of farad, derived SI-Unit for measurement of capacitance
*/    
val Number.qF : Farad
    @JvmName("getqF_prop")
    /**
    * Returns qF, 10^-30 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-30))

/**
* quectofarad, 10^-30 of farad, derived SI-Unit for measurement of capacitance
*/ 
val Number.quectofarad : Farad
    /**
    * Returns quectofarad, 10^-30 of farad, derived SI-Unit for measurement of capacitance
    */  
    get() = Farad(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qF, 10^-30 of farad, derived SI-Unit for measurement of capacitance
*/        
val qF = 10.0.pow(-30) * ((kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2))

/**
* quectofarad, 10^-30 of farad, derived SI-Unit for measurement of capacitance
*/ 

@JsExport
@JvmField
val quectofarad = qF
    