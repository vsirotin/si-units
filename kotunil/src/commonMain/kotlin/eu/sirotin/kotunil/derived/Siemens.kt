
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for electrical conductance.
*/
class Siemens(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for electrical conductance.
*/
@JsExport
@JvmField
val S = Siemens(1.0)

/**
* Creates Siemens-Object for current number value. Siemens is a System International Unit for electrical conductance.
*/
val Number.S : Siemens
   /**
   * Returns Siemens-Object for current number value. Siemens is a System International Unit for electrical conductance.
   */
    get() = Siemens(this.toDouble())

    
/**
* QS, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.QS : Siemens
    @JvmName("getQS_prop")
    /**
    * Returns QS, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(30))

/**
* quettasiemens, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.quettasiemens : Siemens
    /**
    * Returns quettasiemens, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QS, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val QS = 10.0.pow(30) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* quettasiemens, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val quettasiemens = QS
    

/**
* RS, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.RS : Siemens
    @JvmName("getRS_prop")
    /**
    * Returns RS, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(27))

/**
* ronnasiemens, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.ronnasiemens : Siemens
    /**
    * Returns ronnasiemens, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RS, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val RS = 10.0.pow(27) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* ronnasiemens, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val ronnasiemens = RS
    

/**
* YS, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.YS : Siemens
    @JvmName("getYS_prop")
    /**
    * Returns YS, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(24))

/**
* yottasiemens, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.yottasiemens : Siemens
    /**
    * Returns yottasiemens, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YS, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val YS = 10.0.pow(24) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* yottasiemens, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val yottasiemens = YS
    

/**
* ZS, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.ZS : Siemens
    @JvmName("getZS_prop")
    /**
    * Returns ZS, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(21))

/**
* zettasiemens, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.zettasiemens : Siemens
    /**
    * Returns zettasiemens, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZS, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val ZS = 10.0.pow(21) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* zettasiemens, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val zettasiemens = ZS
    

/**
* ES, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.ES : Siemens
    @JvmName("getES_prop")
    /**
    * Returns ES, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(18))

/**
* exasiemens, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.exasiemens : Siemens
    /**
    * Returns exasiemens, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* ES, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val ES = 10.0.pow(18) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* exasiemens, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val exasiemens = ES
    

/**
* PS, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.PS : Siemens
    @JvmName("getPS_prop")
    /**
    * Returns PS, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(15))

/**
* petasiemens, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.petasiemens : Siemens
    /**
    * Returns petasiemens, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PS, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val PS = 10.0.pow(15) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* petasiemens, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val petasiemens = PS
    

/**
* TS, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.TS : Siemens
    @JvmName("getTS_prop")
    /**
    * Returns TS, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(12))

/**
* terasiemens, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.terasiemens : Siemens
    /**
    * Returns terasiemens, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TS, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val TS = 10.0.pow(12) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* terasiemens, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val terasiemens = TS
    

/**
* GS, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.GS : Siemens
    @JvmName("getGS_prop")
    /**
    * Returns GS, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(9))

/**
* gigasiemens, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.gigasiemens : Siemens
    /**
    * Returns gigasiemens, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GS, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val GS = 10.0.pow(9) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* gigasiemens, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val gigasiemens = GS
    

/**
* MS, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.MS : Siemens
    @JvmName("getMS_prop")
    /**
    * Returns MS, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(6))

/**
* megasiemens, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.megasiemens : Siemens
    /**
    * Returns megasiemens, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MS, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val MS = 10.0.pow(6) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* megasiemens, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val megasiemens = MS
    

/**
* kS, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.kS : Siemens
    @JvmName("getkS_prop")
    /**
    * Returns kS, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(3))

/**
* kilosiemens, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.kilosiemens : Siemens
    /**
    * Returns kilosiemens, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kS, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val kS = 10.0.pow(3) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* kilosiemens, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val kilosiemens = kS
    

/**
* hS, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.hS : Siemens
    @JvmName("gethS_prop")
    /**
    * Returns hS, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(2))

/**
* hectosiemens, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.hectosiemens : Siemens
    /**
    * Returns hectosiemens, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hS, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val hS = 10.0.pow(2) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* hectosiemens, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val hectosiemens = hS
    

/**
* daS, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.daS : Siemens
    @JvmName("getdaS_prop")
    /**
    * Returns daS, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(1))

/**
* decasiemens, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.decasiemens : Siemens
    /**
    * Returns decasiemens, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daS, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val daS = 10.0.pow(1) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* decasiemens, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val decasiemens = daS
    

/**
* dS, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.dS : Siemens
    @JvmName("getdS_prop")
    /**
    * Returns dS, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-1))

/**
* decisiemens, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.decisiemens : Siemens
    /**
    * Returns decisiemens, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dS, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val dS = 10.0.pow(-1) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* decisiemens, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val decisiemens = dS
    

/**
* cS, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.cS : Siemens
    @JvmName("getcS_prop")
    /**
    * Returns cS, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-2))

/**
* centisiemens, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.centisiemens : Siemens
    /**
    * Returns centisiemens, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cS, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val cS = 10.0.pow(-2) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* centisiemens, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val centisiemens = cS
    

/**
* mS, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.mS : Siemens
    @JvmName("getmS_prop")
    /**
    * Returns mS, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-3))

/**
* millisiemens, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.millisiemens : Siemens
    /**
    * Returns millisiemens, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mS, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val mS = 10.0.pow(-3) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* millisiemens, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val millisiemens = mS
    

/**
* μS, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.μS : Siemens
    @JvmName("getμS_prop")
    /**
    * Returns μS, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-6))

/**
* microsiemens, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.microsiemens : Siemens
    /**
    * Returns microsiemens, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μS, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val μS = 10.0.pow(-6) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* microsiemens, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val microsiemens = μS
    

/**
* nS, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.nS : Siemens
    @JvmName("getnS_prop")
    /**
    * Returns nS, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-9))

/**
* nanosiemens, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.nanosiemens : Siemens
    /**
    * Returns nanosiemens, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nS, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val nS = 10.0.pow(-9) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* nanosiemens, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val nanosiemens = nS
    

/**
* pS, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.pS : Siemens
    @JvmName("getpS_prop")
    /**
    * Returns pS, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-12))

/**
* picosiemens, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.picosiemens : Siemens
    /**
    * Returns picosiemens, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pS, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val pS = 10.0.pow(-12) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* picosiemens, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val picosiemens = pS
    

/**
* fS, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.fS : Siemens
    @JvmName("getfS_prop")
    /**
    * Returns fS, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-15))

/**
* femtosiemens, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.femtosiemens : Siemens
    /**
    * Returns femtosiemens, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fS, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val fS = 10.0.pow(-15) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* femtosiemens, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val femtosiemens = fS
    

/**
* aS, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.aS : Siemens
    @JvmName("getaS_prop")
    /**
    * Returns aS, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-18))

/**
* attosiemens, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.attosiemens : Siemens
    /**
    * Returns attosiemens, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aS, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val aS = 10.0.pow(-18) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* attosiemens, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val attosiemens = aS
    

/**
* zS, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.zS : Siemens
    @JvmName("getzS_prop")
    /**
    * Returns zS, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-21))

/**
* zeptosiemens, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.zeptosiemens : Siemens
    /**
    * Returns zeptosiemens, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zS, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val zS = 10.0.pow(-21) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* zeptosiemens, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val zeptosiemens = zS
    

/**
* yS, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.yS : Siemens
    @JvmName("getyS_prop")
    /**
    * Returns yS, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-24))

/**
* yoctosiemens, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.yoctosiemens : Siemens
    /**
    * Returns yoctosiemens, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yS, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val yS = 10.0.pow(-24) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* yoctosiemens, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val yoctosiemens = yS
    

/**
* rS, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.rS : Siemens
    @JvmName("getrS_prop")
    /**
    * Returns rS, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-27))

/**
* rontosiemens, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.rontosiemens : Siemens
    /**
    * Returns rontosiemens, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rS, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val rS = 10.0.pow(-27) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* rontosiemens, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val rontosiemens = rS
    

/**
* qS, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.qS : Siemens
    @JvmName("getqS_prop")
    /**
    * Returns qS, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-30))

/**
* quectosiemens, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.quectosiemens : Siemens
    /**
    * Returns quectosiemens, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = Siemens(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qS, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
*/        
val qS = 10.0.pow(-30) * ((kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2))

/**
* quectosiemens, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 

@JsExport
@JvmField
val quectosiemens = qS
    