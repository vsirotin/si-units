
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (kg `^` -1) * (m `^` -2) *(s `^` 3)* (A `^` 2)

@JsExport
/**
* System International Unit for electrical conductance.
*/
class Siemens(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for electrical conductance.
*/
@JsExport
@JvmField
val S = formula

/**
* Creates Siemens-Object for current number value. Siemens is a System International Unit for electrical conductance.
*/
val Number.S : Expression
   /**
   * Returns Siemens-Object for current number value. Siemens is a System International Unit for electrical conductance.
   */
    get() = this.toDouble() * formula

    
/**
* QS, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
*/    
val Number.QS : Expression
    @JvmName("getQS_prop")
    /**
    * Returns QS, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettasiemens, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.quettasiemens : Expression
    /**
    * Returns quettasiemens, 10^30 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

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
val Number.RS : Expression
    @JvmName("getRS_prop")
    /**
    * Returns RS, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnasiemens, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.ronnasiemens : Expression
    /**
    * Returns ronnasiemens, 10^27 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

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
val Number.YS : Expression
    @JvmName("getYS_prop")
    /**
    * Returns YS, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottasiemens, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.yottasiemens : Expression
    /**
    * Returns yottasiemens, 10^24 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

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
val Number.ZS : Expression
    @JvmName("getZS_prop")
    /**
    * Returns ZS, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettasiemens, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.zettasiemens : Expression
    /**
    * Returns zettasiemens, 10^21 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

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
val Number.ES : Expression
    @JvmName("getES_prop")
    /**
    * Returns ES, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exasiemens, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.exasiemens : Expression
    /**
    * Returns exasiemens, 10^18 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

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
val Number.PS : Expression
    @JvmName("getPS_prop")
    /**
    * Returns PS, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petasiemens, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.petasiemens : Expression
    /**
    * Returns petasiemens, 10^15 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

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
val Number.TS : Expression
    @JvmName("getTS_prop")
    /**
    * Returns TS, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* terasiemens, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.terasiemens : Expression
    /**
    * Returns terasiemens, 10^12 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

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
val Number.GS : Expression
    @JvmName("getGS_prop")
    /**
    * Returns GS, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigasiemens, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.gigasiemens : Expression
    /**
    * Returns gigasiemens, 10^9 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

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
val Number.MS : Expression
    @JvmName("getMS_prop")
    /**
    * Returns MS, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megasiemens, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.megasiemens : Expression
    /**
    * Returns megasiemens, 10^6 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

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
val Number.kS : Expression
    @JvmName("getkS_prop")
    /**
    * Returns kS, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilosiemens, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.kilosiemens : Expression
    /**
    * Returns kilosiemens, 10^3 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

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
val Number.hS : Expression
    @JvmName("gethS_prop")
    /**
    * Returns hS, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectosiemens, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.hectosiemens : Expression
    /**
    * Returns hectosiemens, 10^2 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

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
val Number.daS : Expression
    @JvmName("getdaS_prop")
    /**
    * Returns daS, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decasiemens, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.decasiemens : Expression
    /**
    * Returns decasiemens, 10^1 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

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
val Number.dS : Expression
    @JvmName("getdS_prop")
    /**
    * Returns dS, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decisiemens, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.decisiemens : Expression
    /**
    * Returns decisiemens, 10^-1 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

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
val Number.cS : Expression
    @JvmName("getcS_prop")
    /**
    * Returns cS, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centisiemens, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.centisiemens : Expression
    /**
    * Returns centisiemens, 10^-2 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

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
val Number.mS : Expression
    @JvmName("getmS_prop")
    /**
    * Returns mS, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millisiemens, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.millisiemens : Expression
    /**
    * Returns millisiemens, 10^-3 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


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
val Number.μS : Expression
    @JvmName("getμS_prop")
    /**
    * Returns μS, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* microsiemens, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.microsiemens : Expression
    /**
    * Returns microsiemens, 10^-6 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

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
val Number.nS : Expression
    @JvmName("getnS_prop")
    /**
    * Returns nS, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanosiemens, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.nanosiemens : Expression
    /**
    * Returns nanosiemens, 10^-9 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

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
val Number.pS : Expression
    @JvmName("getpS_prop")
    /**
    * Returns pS, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picosiemens, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.picosiemens : Expression
    /**
    * Returns picosiemens, 10^-12 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


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
val Number.fS : Expression
    @JvmName("getfS_prop")
    /**
    * Returns fS, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtosiemens, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.femtosiemens : Expression
    /**
    * Returns femtosiemens, 10^-15 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

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
val Number.aS : Expression
    @JvmName("getaS_prop")
    /**
    * Returns aS, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attosiemens, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.attosiemens : Expression
    /**
    * Returns attosiemens, 10^-18 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

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
val Number.zS : Expression
    @JvmName("getzS_prop")
    /**
    * Returns zS, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptosiemens, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.zeptosiemens : Expression
    /**
    * Returns zeptosiemens, 10^-21 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


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
val Number.yS : Expression
    @JvmName("getyS_prop")
    /**
    * Returns yS, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctosiemens, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.yoctosiemens : Expression
    /**
    * Returns yoctosiemens, 10^-24 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


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
val Number.rS : Expression
    @JvmName("getrS_prop")
    /**
    * Returns rS, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontosiemens, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.rontosiemens : Expression
    /**
    * Returns rontosiemens, 10^-27 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


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
val Number.qS : Expression
    @JvmName("getqS_prop")
    /**
    * Returns qS, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectosiemens, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
*/ 
val Number.quectosiemens : Expression
    /**
    * Returns quectosiemens, 10^-30 of siemens, derived SI-Unit for measurement of electrical conductance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


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
    