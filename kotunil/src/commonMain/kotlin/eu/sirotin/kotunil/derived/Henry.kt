
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  kg* (m2)*(s `^` -2)*(A `^` -2)

/**
* System International Unit for inductance.
*/
//@JsExport
@JvmField
val H = unit

/**
* Creates Henry-Object for current number value. Henry is a System International Unit for inductance.
*/
val Number.H : Expression
   /**
   * Returns Henry-Object for current number value. Henry is a System International Unit for inductance.
   */
    get() = this.toDouble() * unit

    
/**
* QH, 10^30 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.QH : Expression
    @JvmName("getQH_prop")
    /**
    * Returns QH, 10^30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.quettahenry : Expression
    /**
    * Returns quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

//@JsExport
@JvmField
//@get:JvmName("QH") 
/**
* QH, 10^30 of henry, derived SI-Unit for measurement of inductance
*/        
val QH = 10.0.pow(30) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* quettahenry, 10^30 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("quettahenry")
val quettahenry = QH
    

/**
* RH, 10^27 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.RH : Expression
    @JvmName("getRH_prop")
    /**
    * Returns RH, 10^27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.ronnahenry : Expression
    /**
    * Returns ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

//@JsExport
@JvmField
//@get:JvmName("RH") 
/**
* RH, 10^27 of henry, derived SI-Unit for measurement of inductance
*/        
val RH = 10.0.pow(27) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* ronnahenry, 10^27 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("ronnahenry")
val ronnahenry = RH
    

/**
* YH, 10^24 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.YH : Expression
    @JvmName("getYH_prop")
    /**
    * Returns YH, 10^24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.yottahenry : Expression
    /**
    * Returns yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

//@JsExport
@JvmField
//@get:JvmName("YH") 
/**
* YH, 10^24 of henry, derived SI-Unit for measurement of inductance
*/        
val YH = 10.0.pow(24) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* yottahenry, 10^24 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("yottahenry")
val yottahenry = YH
    

/**
* ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.ZH : Expression
    @JvmName("getZH_prop")
    /**
    * Returns ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.zettahenry : Expression
    /**
    * Returns zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

//@JsExport
@JvmField
//@get:JvmName("ZH") 
/**
* ZH, 10^21 of henry, derived SI-Unit for measurement of inductance
*/        
val ZH = 10.0.pow(21) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* zettahenry, 10^21 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("zettahenry")
val zettahenry = ZH
    

/**
* EH, 10^18 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.EH : Expression
    @JvmName("getEH_prop")
    /**
    * Returns EH, 10^18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.exahenry : Expression
    /**
    * Returns exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

//@JsExport
@JvmField
//@get:JvmName("EH") 
/**
* EH, 10^18 of henry, derived SI-Unit for measurement of inductance
*/        
val EH = 10.0.pow(18) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* exahenry, 10^18 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("exahenry")
val exahenry = EH
    

/**
* PH, 10^15 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.PH : Expression
    @JvmName("getPH_prop")
    /**
    * Returns PH, 10^15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.petahenry : Expression
    /**
    * Returns petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

//@JsExport
@JvmField
//@get:JvmName("PH") 
/**
* PH, 10^15 of henry, derived SI-Unit for measurement of inductance
*/        
val PH = 10.0.pow(15) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* petahenry, 10^15 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("petahenry")
val petahenry = PH
    

/**
* TH, 10^12 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.TH : Expression
    @JvmName("getTH_prop")
    /**
    * Returns TH, 10^12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.terahenry : Expression
    /**
    * Returns terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

//@JsExport
@JvmField
//@get:JvmName("TH") 
/**
* TH, 10^12 of henry, derived SI-Unit for measurement of inductance
*/        
val TH = 10.0.pow(12) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* terahenry, 10^12 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("terahenry")
val terahenry = TH
    

/**
* GH, 10^9 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.GH : Expression
    @JvmName("getGH_prop")
    /**
    * Returns GH, 10^9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.gigahenry : Expression
    /**
    * Returns gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

//@JsExport
@JvmField
//@get:JvmName("GH") 
/**
* GH, 10^9 of henry, derived SI-Unit for measurement of inductance
*/        
val GH = 10.0.pow(9) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* gigahenry, 10^9 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("gigahenry")
val gigahenry = GH
    

/**
* MH, 10^6 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.MH : Expression
    @JvmName("getMH_prop")
    /**
    * Returns MH, 10^6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.megahenry : Expression
    /**
    * Returns megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

//@JsExport
@JvmField
//@get:JvmName("MH") 
/**
* MH, 10^6 of henry, derived SI-Unit for measurement of inductance
*/        
val MH = 10.0.pow(6) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* megahenry, 10^6 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("megahenry")
val megahenry = MH
    

/**
* kH, 10^3 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.kH : Expression
    @JvmName("getkH_prop")
    /**
    * Returns kH, 10^3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.kilohenry : Expression
    /**
    * Returns kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

//@JsExport
@JvmField
//@get:JvmName("kH") 
/**
* kH, 10^3 of henry, derived SI-Unit for measurement of inductance
*/        
val kH = 10.0.pow(3) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* kilohenry, 10^3 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("kilohenry")
val kilohenry = kH
    

/**
* hH, 10^2 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.hH : Expression
    @JvmName("gethH_prop")
    /**
    * Returns hH, 10^2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.hectohenry : Expression
    /**
    * Returns hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

//@JsExport
@JvmField
//@get:JvmName("hH") 
/**
* hH, 10^2 of henry, derived SI-Unit for measurement of inductance
*/        
val hH = 10.0.pow(2) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* hectohenry, 10^2 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("hectohenry")
val hectohenry = hH
    

/**
* daH, 10^1 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.daH : Expression
    @JvmName("getdaH_prop")
    /**
    * Returns daH, 10^1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.decahenry : Expression
    /**
    * Returns decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

//@JsExport
@JvmField
//@get:JvmName("daH") 
/**
* daH, 10^1 of henry, derived SI-Unit for measurement of inductance
*/        
val daH = 10.0.pow(1) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* decahenry, 10^1 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("decahenry")
val decahenry = daH
    

/**
* dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.dH : Expression
    @JvmName("getdH_prop")
    /**
    * Returns dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.decihenry : Expression
    /**
    * Returns decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

//@JsExport
@JvmField
//@get:JvmName("dH") 
/**
* dH, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/        
val dH = 10.0.pow(-1) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* decihenry, 10^-1 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("decihenry")
val decihenry = dH
    

/**
* cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.cH : Expression
    @JvmName("getcH_prop")
    /**
    * Returns cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.centihenry : Expression
    /**
    * Returns centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

//@JsExport
@JvmField
//@get:JvmName("cH") 
/**
* cH, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/        
val cH = 10.0.pow(-2) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* centihenry, 10^-2 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("centihenry")
val centihenry = cH
    

/**
* mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.mH : Expression
    @JvmName("getmH_prop")
    /**
    * Returns mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.millihenry : Expression
    /**
    * Returns millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

//@JsExport
@JvmField
//@get:JvmName("mH") 
/**
* mH, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/        
val mH = 10.0.pow(-3) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* millihenry, 10^-3 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("millihenry")
val millihenry = mH
    

/**
* μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.μH : Expression
    @JvmName("getμH_prop")
    /**
    * Returns μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.microhenry : Expression
    /**
    * Returns microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

//@JsExport
@JvmField
//@get:JvmName("μH") 
/**
* μH, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/        
val μH = 10.0.pow(-6) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* microhenry, 10^-6 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("microhenry")
val microhenry = μH
    

/**
* nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.nH : Expression
    @JvmName("getnH_prop")
    /**
    * Returns nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.nanohenry : Expression
    /**
    * Returns nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

//@JsExport
@JvmField
//@get:JvmName("nH") 
/**
* nH, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/        
val nH = 10.0.pow(-9) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* nanohenry, 10^-9 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("nanohenry")
val nanohenry = nH
    

/**
* pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.pH : Expression
    @JvmName("getpH_prop")
    /**
    * Returns pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.picohenry : Expression
    /**
    * Returns picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

//@JsExport
@JvmField
//@get:JvmName("pH") 
/**
* pH, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/        
val pH = 10.0.pow(-12) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* picohenry, 10^-12 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("picohenry")
val picohenry = pH
    

/**
* fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.fH : Expression
    @JvmName("getfH_prop")
    /**
    * Returns fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.femtohenry : Expression
    /**
    * Returns femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

//@JsExport
@JvmField
//@get:JvmName("fH") 
/**
* fH, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/        
val fH = 10.0.pow(-15) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* femtohenry, 10^-15 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("femtohenry")
val femtohenry = fH
    

/**
* aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.aH : Expression
    @JvmName("getaH_prop")
    /**
    * Returns aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.attohenry : Expression
    /**
    * Returns attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

//@JsExport
@JvmField
//@get:JvmName("aH") 
/**
* aH, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/        
val aH = 10.0.pow(-18) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* attohenry, 10^-18 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("attohenry")
val attohenry = aH
    

/**
* zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.zH : Expression
    @JvmName("getzH_prop")
    /**
    * Returns zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.zeptohenry : Expression
    /**
    * Returns zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

//@JsExport
@JvmField
//@get:JvmName("zH") 
/**
* zH, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/        
val zH = 10.0.pow(-21) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* zeptohenry, 10^-21 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("zeptohenry")
val zeptohenry = zH
    

/**
* yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.yH : Expression
    @JvmName("getyH_prop")
    /**
    * Returns yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.yoctohenry : Expression
    /**
    * Returns yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

//@JsExport
@JvmField
//@get:JvmName("yH") 
/**
* yH, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/        
val yH = 10.0.pow(-24) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* yoctohenry, 10^-24 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("yoctohenry")
val yoctohenry = yH
    

/**
* rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.rH : Expression
    @JvmName("getrH_prop")
    /**
    * Returns rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.rontohenry : Expression
    /**
    * Returns rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

//@JsExport
@JvmField
//@get:JvmName("rH") 
/**
* rH, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/        
val rH = 10.0.pow(-27) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* rontohenry, 10^-27 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("rontohenry")
val rontohenry = rH
    

/**
* qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/    
val Number.qH : Expression
    @JvmName("getqH_prop")
    /**
    * Returns qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/ 
val Number.quectohenry : Expression
    /**
    * Returns quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

//@JsExport
@JvmField
//@get:JvmName("qH") 
/**
* qH, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/        
val qH = 10.0.pow(-30) * (kg* (m2)*(s `^` -2)*(A `^` -2))

/**
* quectohenry, 10^-30 of henry, derived SI-Unit for measurement of inductance
*/ 

//@JsExport
@JvmField
//@get:JvmName("quectohenry")
val quectohenry = qH
    