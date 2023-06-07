
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
//import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*(m*m)/(s `^` 2)

@JsExport
/**
* System International Unit for energy, work, heat.
*/
class Joule(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for energy, work, heat.
*/
@JsExport
@JvmField
val J = Joule(1.0)

/**
* Creates Joule-Object for current number value. Joule is a System International Unit for energy, work, heat.
*/
val Number.J : Joule
   /**
   * Returns Joule-Object for current number value. Joule is a System International Unit for energy, work, heat.
   */
    get() = Joule(this.toDouble())

    
/**
* QJ, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.QJ : Joule
    @JvmName("getQJ_prop")
    /**
    * Returns QJ, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(30))

/**
* quettajoule, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.quettajoule : Joule
    /**
    * Returns quettajoule, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QJ, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val QJ = 10.0.pow(30) * (kg*(m*m)/(s `^` 2))

/**
* quettajoule, 10^30 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val quettajoule = QJ
    

/**
* RJ, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.RJ : Joule
    @JvmName("getRJ_prop")
    /**
    * Returns RJ, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(27))

/**
* ronnajoule, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.ronnajoule : Joule
    /**
    * Returns ronnajoule, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RJ, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val RJ = 10.0.pow(27) * (kg*(m*m)/(s `^` 2))

/**
* ronnajoule, 10^27 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val ronnajoule = RJ
    

/**
* YJ, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.YJ : Joule
    @JvmName("getYJ_prop")
    /**
    * Returns YJ, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(24))

/**
* yottajoule, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.yottajoule : Joule
    /**
    * Returns yottajoule, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YJ, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val YJ = 10.0.pow(24) * (kg*(m*m)/(s `^` 2))

/**
* yottajoule, 10^24 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val yottajoule = YJ
    

/**
* ZJ, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.ZJ : Joule
    @JvmName("getZJ_prop")
    /**
    * Returns ZJ, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(21))

/**
* zettajoule, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.zettajoule : Joule
    /**
    * Returns zettajoule, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZJ, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val ZJ = 10.0.pow(21) * (kg*(m*m)/(s `^` 2))

/**
* zettajoule, 10^21 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val zettajoule = ZJ
    

/**
* EJ, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.EJ : Joule
    @JvmName("getEJ_prop")
    /**
    * Returns EJ, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(18))

/**
* exajoule, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.exajoule : Joule
    /**
    * Returns exajoule, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EJ, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val EJ = 10.0.pow(18) * (kg*(m*m)/(s `^` 2))

/**
* exajoule, 10^18 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val exajoule = EJ
    

/**
* PJ, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.PJ : Joule
    @JvmName("getPJ_prop")
    /**
    * Returns PJ, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(15))

/**
* petajoule, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.petajoule : Joule
    /**
    * Returns petajoule, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PJ, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val PJ = 10.0.pow(15) * (kg*(m*m)/(s `^` 2))

/**
* petajoule, 10^15 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val petajoule = PJ
    

/**
* TJ, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.TJ : Joule
    @JvmName("getTJ_prop")
    /**
    * Returns TJ, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(12))

/**
* terajoule, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.terajoule : Joule
    /**
    * Returns terajoule, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TJ, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val TJ = 10.0.pow(12) * (kg*(m*m)/(s `^` 2))

/**
* terajoule, 10^12 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val terajoule = TJ
    

/**
* GJ, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.GJ : Joule
    @JvmName("getGJ_prop")
    /**
    * Returns GJ, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(9))

/**
* gigajoule, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.gigajoule : Joule
    /**
    * Returns gigajoule, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GJ, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val GJ = 10.0.pow(9) * (kg*(m*m)/(s `^` 2))

/**
* gigajoule, 10^9 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val gigajoule = GJ
    

/**
* MJ, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.MJ : Joule
    @JvmName("getMJ_prop")
    /**
    * Returns MJ, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(6))

/**
* megajoule, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.megajoule : Joule
    /**
    * Returns megajoule, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MJ, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val MJ = 10.0.pow(6) * (kg*(m*m)/(s `^` 2))

/**
* megajoule, 10^6 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val megajoule = MJ
    

/**
* kJ, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.kJ : Joule
    @JvmName("getkJ_prop")
    /**
    * Returns kJ, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(3))

/**
* kilojoule, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.kilojoule : Joule
    /**
    * Returns kilojoule, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kJ, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val kJ = 10.0.pow(3) * (kg*(m*m)/(s `^` 2))

/**
* kilojoule, 10^3 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val kilojoule = kJ
    

/**
* hJ, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.hJ : Joule
    @JvmName("gethJ_prop")
    /**
    * Returns hJ, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(2))

/**
* hectojoule, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.hectojoule : Joule
    /**
    * Returns hectojoule, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hJ, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val hJ = 10.0.pow(2) * (kg*(m*m)/(s `^` 2))

/**
* hectojoule, 10^2 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val hectojoule = hJ
    

/**
* daJ, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.daJ : Joule
    @JvmName("getdaJ_prop")
    /**
    * Returns daJ, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(1))

/**
* decajoule, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.decajoule : Joule
    /**
    * Returns decajoule, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daJ, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val daJ = 10.0.pow(1) * (kg*(m*m)/(s `^` 2))

/**
* decajoule, 10^1 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val decajoule = daJ
    

/**
* dJ, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.dJ : Joule
    @JvmName("getdJ_prop")
    /**
    * Returns dJ, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-1))

/**
* decijoule, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.decijoule : Joule
    /**
    * Returns decijoule, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dJ, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val dJ = 10.0.pow(-1) * (kg*(m*m)/(s `^` 2))

/**
* decijoule, 10^-1 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val decijoule = dJ
    

/**
* cJ, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.cJ : Joule
    @JvmName("getcJ_prop")
    /**
    * Returns cJ, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-2))

/**
* centijoule, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.centijoule : Joule
    /**
    * Returns centijoule, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cJ, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val cJ = 10.0.pow(-2) * (kg*(m*m)/(s `^` 2))

/**
* centijoule, 10^-2 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val centijoule = cJ
    

/**
* mJ, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.mJ : Joule
    @JvmName("getmJ_prop")
    /**
    * Returns mJ, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-3))

/**
* millijoule, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.millijoule : Joule
    /**
    * Returns millijoule, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mJ, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val mJ = 10.0.pow(-3) * (kg*(m*m)/(s `^` 2))

/**
* millijoule, 10^-3 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val millijoule = mJ
    

/**
* μJ, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.μJ : Joule
    @JvmName("getμJ_prop")
    /**
    * Returns μJ, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-6))

/**
* microjoule, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.microjoule : Joule
    /**
    * Returns microjoule, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μJ, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val μJ = 10.0.pow(-6) * (kg*(m*m)/(s `^` 2))

/**
* microjoule, 10^-6 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val microjoule = μJ
    

/**
* nJ, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.nJ : Joule
    @JvmName("getnJ_prop")
    /**
    * Returns nJ, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-9))

/**
* nanojoule, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.nanojoule : Joule
    /**
    * Returns nanojoule, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nJ, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val nJ = 10.0.pow(-9) * (kg*(m*m)/(s `^` 2))

/**
* nanojoule, 10^-9 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val nanojoule = nJ
    

/**
* pJ, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.pJ : Joule
    @JvmName("getpJ_prop")
    /**
    * Returns pJ, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-12))

/**
* picojoule, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.picojoule : Joule
    /**
    * Returns picojoule, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pJ, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val pJ = 10.0.pow(-12) * (kg*(m*m)/(s `^` 2))

/**
* picojoule, 10^-12 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val picojoule = pJ
    

/**
* fJ, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.fJ : Joule
    @JvmName("getfJ_prop")
    /**
    * Returns fJ, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-15))

/**
* femtojoule, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.femtojoule : Joule
    /**
    * Returns femtojoule, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fJ, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val fJ = 10.0.pow(-15) * (kg*(m*m)/(s `^` 2))

/**
* femtojoule, 10^-15 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val femtojoule = fJ
    

/**
* aJ, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.aJ : Joule
    @JvmName("getaJ_prop")
    /**
    * Returns aJ, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-18))

/**
* attojoule, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.attojoule : Joule
    /**
    * Returns attojoule, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aJ, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val aJ = 10.0.pow(-18) * (kg*(m*m)/(s `^` 2))

/**
* attojoule, 10^-18 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val attojoule = aJ
    

/**
* zJ, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.zJ : Joule
    @JvmName("getzJ_prop")
    /**
    * Returns zJ, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-21))

/**
* zeptojoule, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.zeptojoule : Joule
    /**
    * Returns zeptojoule, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zJ, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val zJ = 10.0.pow(-21) * (kg*(m*m)/(s `^` 2))

/**
* zeptojoule, 10^-21 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val zeptojoule = zJ
    

/**
* yJ, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.yJ : Joule
    @JvmName("getyJ_prop")
    /**
    * Returns yJ, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-24))

/**
* yoctojoule, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.yoctojoule : Joule
    /**
    * Returns yoctojoule, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yJ, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val yJ = 10.0.pow(-24) * (kg*(m*m)/(s `^` 2))

/**
* yoctojoule, 10^-24 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val yoctojoule = yJ
    

/**
* rJ, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.rJ : Joule
    @JvmName("getrJ_prop")
    /**
    * Returns rJ, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-27))

/**
* rontojoule, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.rontojoule : Joule
    /**
    * Returns rontojoule, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rJ, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val rJ = 10.0.pow(-27) * (kg*(m*m)/(s `^` 2))

/**
* rontojoule, 10^-27 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val rontojoule = rJ
    

/**
* qJ, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
*/    
val Number.qJ : Joule
    @JvmName("getqJ_prop")
    /**
    * Returns qJ, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-30))

/**
* quectojoule, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 
val Number.quectojoule : Joule
    /**
    * Returns quectojoule, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
    */  
    get() = Joule(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qJ, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
*/        
val qJ = 10.0.pow(-30) * (kg*(m*m)/(s `^` 2))

/**
* quectojoule, 10^-30 of joule, derived SI-Unit for measurement of energy, work, heat
*/ 

@JsExport
@JvmField
val quectojoule = qJ
    