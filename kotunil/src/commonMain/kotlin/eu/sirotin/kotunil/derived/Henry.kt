
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg* (m*m)*(s `^` -2)*(A `^` -2)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for inductance.
*/
class Henry(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for inductance.
*/
@JsExport
@JvmField
val H = Henry(1.0)

/**
* Creates Henry-Object for current number value. Henry is a System International Unit for inductance.
*/
val Number.H : Henry
   /**
   * Returns Henry-Object for current number value. Henry is a System International Unit for inductance.
   */
    get() = Henry(this.toDouble())

    
/**
* QH, 10^30 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.QH : Henry
    @JvmName("getQH_prop")
    /**
    * Returns QH, 10^30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(30))

/**
* quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.quettahenry : Henry
    /**
    * Returns quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QH, 10^30 of henry, derived SI-Unit for measurement of inductance
*/        
val QH = 10.0.pow(30) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val quettahenry = QH
    

/**
* RH, 10^27 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.RH : Henry
    @JvmName("getRH_prop")
    /**
    * Returns RH, 10^27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(27))

/**
* ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.ronnahenry : Henry
    /**
    * Returns ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RH, 10^27 of henry, derived SI-Unit for measurement of inductance
*/        
val RH = 10.0.pow(27) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val ronnahenry = RH
    

/**
* YH, 10^24 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.YH : Henry
    @JvmName("getYH_prop")
    /**
    * Returns YH, 10^24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(24))

/**
* yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.yottahenry : Henry
    /**
    * Returns yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YH, 10^24 of henry, derived SI-Unit for measurement of inductance
*/        
val YH = 10.0.pow(24) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val yottahenry = YH
    

/**
* ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.ZH : Henry
    @JvmName("getZH_prop")
    /**
    * Returns ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(21))

/**
* zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.zettahenry : Henry
    /**
    * Returns zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
*/        
val ZH = 10.0.pow(21) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val zettahenry = ZH
    

/**
* EH, 10^18 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.EH : Henry
    @JvmName("getEH_prop")
    /**
    * Returns EH, 10^18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(18))

/**
* exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.exahenry : Henry
    /**
    * Returns exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EH, 10^18 of henry, derived SI-Unit for measurement of inductance
*/        
val EH = 10.0.pow(18) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val exahenry = EH
    

/**
* PH, 10^15 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.PH : Henry
    @JvmName("getPH_prop")
    /**
    * Returns PH, 10^15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(15))

/**
* petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.petahenry : Henry
    /**
    * Returns petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PH, 10^15 of henry, derived SI-Unit for measurement of inductance
*/        
val PH = 10.0.pow(15) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val petahenry = PH
    

/**
* TH, 10^12 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.TH : Henry
    @JvmName("getTH_prop")
    /**
    * Returns TH, 10^12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(12))

/**
* terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.terahenry : Henry
    /**
    * Returns terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TH, 10^12 of henry, derived SI-Unit for measurement of inductance
*/        
val TH = 10.0.pow(12) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val terahenry = TH
    

/**
* GH, 10^9 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.GH : Henry
    @JvmName("getGH_prop")
    /**
    * Returns GH, 10^9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(9))

/**
* gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.gigahenry : Henry
    /**
    * Returns gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GH, 10^9 of henry, derived SI-Unit for measurement of inductance
*/        
val GH = 10.0.pow(9) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val gigahenry = GH
    

/**
* MH, 10^6 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.MH : Henry
    @JvmName("getMH_prop")
    /**
    * Returns MH, 10^6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(6))

/**
* megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.megahenry : Henry
    /**
    * Returns megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MH, 10^6 of henry, derived SI-Unit for measurement of inductance
*/        
val MH = 10.0.pow(6) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val megahenry = MH
    

/**
* kH, 10^3 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.kH : Henry
    @JvmName("getkH_prop")
    /**
    * Returns kH, 10^3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(3))

/**
* kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.kilohenry : Henry
    /**
    * Returns kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kH, 10^3 of henry, derived SI-Unit for measurement of inductance
*/        
val kH = 10.0.pow(3) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val kilohenry = kH
    

/**
* hH, 10^2 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.hH : Henry
    @JvmName("gethH_prop")
    /**
    * Returns hH, 10^2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(2))

/**
* hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.hectohenry : Henry
    /**
    * Returns hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hH, 10^2 of henry, derived SI-Unit for measurement of inductance
*/        
val hH = 10.0.pow(2) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val hectohenry = hH
    

/**
* daH, 10^1 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.daH : Henry
    @JvmName("getdaH_prop")
    /**
    * Returns daH, 10^1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(1))

/**
* decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.decahenry : Henry
    /**
    * Returns decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daH, 10^1 of henry, derived SI-Unit for measurement of inductance
*/        
val daH = 10.0.pow(1) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val decahenry = daH
    

/**
* dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.dH : Henry
    @JvmName("getdH_prop")
    /**
    * Returns dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-1))

/**
* decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.decihenry : Henry
    /**
    * Returns decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/        
val dH = 10.0.pow(-1) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val decihenry = dH
    

/**
* cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.cH : Henry
    @JvmName("getcH_prop")
    /**
    * Returns cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-2))

/**
* centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.centihenry : Henry
    /**
    * Returns centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/        
val cH = 10.0.pow(-2) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val centihenry = cH
    

/**
* mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.mH : Henry
    @JvmName("getmH_prop")
    /**
    * Returns mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-3))

/**
* millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.millihenry : Henry
    /**
    * Returns millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/        
val mH = 10.0.pow(-3) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val millihenry = mH
    

/**
* μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.μH : Henry
    @JvmName("getμH_prop")
    /**
    * Returns μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-6))

/**
* microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.microhenry : Henry
    /**
    * Returns microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/        
val μH = 10.0.pow(-6) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val microhenry = μH
    

/**
* nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.nH : Henry
    @JvmName("getnH_prop")
    /**
    * Returns nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-9))

/**
* nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.nanohenry : Henry
    /**
    * Returns nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/        
val nH = 10.0.pow(-9) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val nanohenry = nH
    

/**
* pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.pH : Henry
    @JvmName("getpH_prop")
    /**
    * Returns pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-12))

/**
* picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.picohenry : Henry
    /**
    * Returns picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/        
val pH = 10.0.pow(-12) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val picohenry = pH
    

/**
* fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.fH : Henry
    @JvmName("getfH_prop")
    /**
    * Returns fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-15))

/**
* femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.femtohenry : Henry
    /**
    * Returns femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/        
val fH = 10.0.pow(-15) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val femtohenry = fH
    

/**
* aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.aH : Henry
    @JvmName("getaH_prop")
    /**
    * Returns aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-18))

/**
* attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.attohenry : Henry
    /**
    * Returns attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/        
val aH = 10.0.pow(-18) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val attohenry = aH
    

/**
* zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.zH : Henry
    @JvmName("getzH_prop")
    /**
    * Returns zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-21))

/**
* zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.zeptohenry : Henry
    /**
    * Returns zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/        
val zH = 10.0.pow(-21) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val zeptohenry = zH
    

/**
* yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.yH : Henry
    @JvmName("getyH_prop")
    /**
    * Returns yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-24))

/**
* yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.yoctohenry : Henry
    /**
    * Returns yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/        
val yH = 10.0.pow(-24) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val yoctohenry = yH
    

/**
* rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.rH : Henry
    @JvmName("getrH_prop")
    /**
    * Returns rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-27))

/**
* rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.rontohenry : Henry
    /**
    * Returns rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/        
val rH = 10.0.pow(-27) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val rontohenry = rH
    

/**
* qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.qH : Henry
    @JvmName("getqH_prop")
    /**
    * Returns qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-30))

/**
* quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.quectohenry : Henry
    /**
    * Returns quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = Henry(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/        
val qH = 10.0.pow(-30) * (kg* (m*m)*(s `^` -2)*(A `^` -2))

/**
* quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/ 

@JsExport
@JvmField
val quectohenry = qH
    