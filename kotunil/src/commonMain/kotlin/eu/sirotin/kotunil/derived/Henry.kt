
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg* (m2)*(s `^` -2)*(A `^` -2)

@JsExport
/**
* System International Unit for inductance.
*/
class Henry(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for inductance.
*/
@JsExport
@JvmField
val H = formula

/**
* Creates Henry-Object for current number value. Henry is a System International Unit for inductance.
*/
val Number.H : Expression
   /**
   * Returns Henry-Object for current number value. Henry is a System International Unit for inductance.
   */
    get() = this.toDouble() * formula

    
/**
* QH, 10^30 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.QH : Expression
    @JvmName("getQH_prop")
    /**
    * Returns QH, 10^30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.quettahenry : Expression
    /**
    * Returns quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

@JsExport
@JvmField
/**
* QH, 10^30 of henry, derived SI-Unit for measurement of inductance
*/        
val QH = 10.0.pow(30) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val quettahenry = QH
    

/**
* RH, 10^27 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.RH : Expression
    @JvmName("getRH_prop")
    /**
    * Returns RH, 10^27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.ronnahenry : Expression
    /**
    * Returns ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

@JsExport
@JvmField
/**
* RH, 10^27 of henry, derived SI-Unit for measurement of inductance
*/        
val RH = 10.0.pow(27) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val ronnahenry = RH
    

/**
* YH, 10^24 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.YH : Expression
    @JvmName("getYH_prop")
    /**
    * Returns YH, 10^24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.yottahenry : Expression
    /**
    * Returns yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

@JsExport
@JvmField
/**
* YH, 10^24 of henry, derived SI-Unit for measurement of inductance
*/        
val YH = 10.0.pow(24) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val yottahenry = YH
    

/**
* ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.ZH : Expression
    @JvmName("getZH_prop")
    /**
    * Returns ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.zettahenry : Expression
    /**
    * Returns zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

@JsExport
@JvmField
/**
* ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
*/        
val ZH = 10.0.pow(21) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val zettahenry = ZH
    

/**
* EH, 10^18 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.EH : Expression
    @JvmName("getEH_prop")
    /**
    * Returns EH, 10^18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.exahenry : Expression
    /**
    * Returns exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

@JsExport
@JvmField
/**
* EH, 10^18 of henry, derived SI-Unit for measurement of inductance
*/        
val EH = 10.0.pow(18) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val exahenry = EH
    

/**
* PH, 10^15 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.PH : Expression
    @JvmName("getPH_prop")
    /**
    * Returns PH, 10^15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.petahenry : Expression
    /**
    * Returns petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

@JsExport
@JvmField
/**
* PH, 10^15 of henry, derived SI-Unit for measurement of inductance
*/        
val PH = 10.0.pow(15) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val petahenry = PH
    

/**
* TH, 10^12 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.TH : Expression
    @JvmName("getTH_prop")
    /**
    * Returns TH, 10^12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.terahenry : Expression
    /**
    * Returns terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

@JsExport
@JvmField
/**
* TH, 10^12 of henry, derived SI-Unit for measurement of inductance
*/        
val TH = 10.0.pow(12) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val terahenry = TH
    

/**
* GH, 10^9 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.GH : Expression
    @JvmName("getGH_prop")
    /**
    * Returns GH, 10^9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.gigahenry : Expression
    /**
    * Returns gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

@JsExport
@JvmField
/**
* GH, 10^9 of henry, derived SI-Unit for measurement of inductance
*/        
val GH = 10.0.pow(9) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val gigahenry = GH
    

/**
* MH, 10^6 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.MH : Expression
    @JvmName("getMH_prop")
    /**
    * Returns MH, 10^6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.megahenry : Expression
    /**
    * Returns megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

@JsExport
@JvmField
/**
* MH, 10^6 of henry, derived SI-Unit for measurement of inductance
*/        
val MH = 10.0.pow(6) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val megahenry = MH
    

/**
* kH, 10^3 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.kH : Expression
    @JvmName("getkH_prop")
    /**
    * Returns kH, 10^3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.kilohenry : Expression
    /**
    * Returns kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

@JsExport
@JvmField
/**
* kH, 10^3 of henry, derived SI-Unit for measurement of inductance
*/        
val kH = 10.0.pow(3) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val kilohenry = kH
    

/**
* hH, 10^2 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.hH : Expression
    @JvmName("gethH_prop")
    /**
    * Returns hH, 10^2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.hectohenry : Expression
    /**
    * Returns hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

@JsExport
@JvmField
/**
* hH, 10^2 of henry, derived SI-Unit for measurement of inductance
*/        
val hH = 10.0.pow(2) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val hectohenry = hH
    

/**
* daH, 10^1 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.daH : Expression
    @JvmName("getdaH_prop")
    /**
    * Returns daH, 10^1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.decahenry : Expression
    /**
    * Returns decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

@JsExport
@JvmField
/**
* daH, 10^1 of henry, derived SI-Unit for measurement of inductance
*/        
val daH = 10.0.pow(1) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val decahenry = daH
    

/**
* dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.dH : Expression
    @JvmName("getdH_prop")
    /**
    * Returns dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.decihenry : Expression
    /**
    * Returns decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

@JsExport
@JvmField
/**
* dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/        
val dH = 10.0.pow(-1) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val decihenry = dH
    

/**
* cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.cH : Expression
    @JvmName("getcH_prop")
    /**
    * Returns cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.centihenry : Expression
    /**
    * Returns centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

@JsExport
@JvmField
/**
* cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/        
val cH = 10.0.pow(-2) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val centihenry = cH
    

/**
* mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.mH : Expression
    @JvmName("getmH_prop")
    /**
    * Returns mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.millihenry : Expression
    /**
    * Returns millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


@JvmField
/**
* mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/        
val mH = 10.0.pow(-3) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val millihenry = mH
    

/**
* μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.μH : Expression
    @JvmName("getμH_prop")
    /**
    * Returns μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.microhenry : Expression
    /**
    * Returns microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

@JsExport
@JvmField
/**
* μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/        
val μH = 10.0.pow(-6) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val microhenry = μH
    

/**
* nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.nH : Expression
    @JvmName("getnH_prop")
    /**
    * Returns nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.nanohenry : Expression
    /**
    * Returns nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

@JsExport
@JvmField
/**
* nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/        
val nH = 10.0.pow(-9) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val nanohenry = nH
    

/**
* pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.pH : Expression
    @JvmName("getpH_prop")
    /**
    * Returns pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.picohenry : Expression
    /**
    * Returns picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


@JvmField
/**
* pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/        
val pH = 10.0.pow(-12) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val picohenry = pH
    

/**
* fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.fH : Expression
    @JvmName("getfH_prop")
    /**
    * Returns fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.femtohenry : Expression
    /**
    * Returns femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

@JsExport
@JvmField
/**
* fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/        
val fH = 10.0.pow(-15) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val femtohenry = fH
    

/**
* aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.aH : Expression
    @JvmName("getaH_prop")
    /**
    * Returns aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.attohenry : Expression
    /**
    * Returns attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

@JsExport
@JvmField
/**
* aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/        
val aH = 10.0.pow(-18) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val attohenry = aH
    

/**
* zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.zH : Expression
    @JvmName("getzH_prop")
    /**
    * Returns zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.zeptohenry : Expression
    /**
    * Returns zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


@JvmField
/**
* zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/        
val zH = 10.0.pow(-21) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val zeptohenry = zH
    

/**
* yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.yH : Expression
    @JvmName("getyH_prop")
    /**
    * Returns yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.yoctohenry : Expression
    /**
    * Returns yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


@JvmField
/**
* yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/        
val yH = 10.0.pow(-24) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val yoctohenry = yH
    

/**
* rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.rH : Expression
    @JvmName("getrH_prop")
    /**
    * Returns rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.rontohenry : Expression
    /**
    * Returns rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


@JvmField
/**
* rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/        
val rH = 10.0.pow(-27) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val rontohenry = rH
    

/**
* qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.qH : Expression
    @JvmName("getqH_prop")
    /**
    * Returns qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.quectohenry : Expression
    /**
    * Returns quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


@JvmField
/**
* qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/        
val qH = 10.0.pow(-30) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val quectohenry = qH
    