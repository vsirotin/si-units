
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
//import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (m*m)*(s `^` -2)

@JsExport
/**
* System International Unit for equivalent dose (of ionising radiation).
*/
class Sievert(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for equivalent dose (of ionising radiation).
*/
@JsExport
@JvmField
val Sv = Sievert(1.0)

/**
* Creates Sievert-Object for current number value. Sievert is a System International Unit for equivalent dose (of ionising radiation).
*/
val Number.Sv : Sievert
   /**
   * Returns Sievert-Object for current number value. Sievert is a System International Unit for equivalent dose (of ionising radiation).
   */
    get() = Sievert(this.toDouble())

    
/**
* QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.QSv : Sievert
    @JvmName("getQSv_prop")
    /**
    * Returns QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(30))

/**
* quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.quettasievert : Sievert
    /**
    * Returns quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val QSv = 10.0.pow(30) * ((m*m)*(s `^` -2))

/**
* quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val quettasievert = QSv
    

/**
* RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.RSv : Sievert
    @JvmName("getRSv_prop")
    /**
    * Returns RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(27))

/**
* ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.ronnasievert : Sievert
    /**
    * Returns ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val RSv = 10.0.pow(27) * ((m*m)*(s `^` -2))

/**
* ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val ronnasievert = RSv
    

/**
* YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.YSv : Sievert
    @JvmName("getYSv_prop")
    /**
    * Returns YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(24))

/**
* yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.yottasievert : Sievert
    /**
    * Returns yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val YSv = 10.0.pow(24) * ((m*m)*(s `^` -2))

/**
* yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val yottasievert = YSv
    

/**
* ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ZSv : Sievert
    @JvmName("getZSv_prop")
    /**
    * Returns ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(21))

/**
* zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.zettasievert : Sievert
    /**
    * Returns zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ZSv = 10.0.pow(21) * ((m*m)*(s `^` -2))

/**
* zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val zettasievert = ZSv
    

/**
* ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ESv : Sievert
    @JvmName("getESv_prop")
    /**
    * Returns ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(18))

/**
* exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.exasievert : Sievert
    /**
    * Returns exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ESv = 10.0.pow(18) * ((m*m)*(s `^` -2))

/**
* exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val exasievert = ESv
    

/**
* PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.PSv : Sievert
    @JvmName("getPSv_prop")
    /**
    * Returns PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(15))

/**
* petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.petasievert : Sievert
    /**
    * Returns petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val PSv = 10.0.pow(15) * ((m*m)*(s `^` -2))

/**
* petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val petasievert = PSv
    

/**
* TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.TSv : Sievert
    @JvmName("getTSv_prop")
    /**
    * Returns TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(12))

/**
* terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.terasievert : Sievert
    /**
    * Returns terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val TSv = 10.0.pow(12) * ((m*m)*(s `^` -2))

/**
* terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val terasievert = TSv
    

/**
* GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.GSv : Sievert
    @JvmName("getGSv_prop")
    /**
    * Returns GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(9))

/**
* gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.gigasievert : Sievert
    /**
    * Returns gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val GSv = 10.0.pow(9) * ((m*m)*(s `^` -2))

/**
* gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val gigasievert = GSv
    

/**
* MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.MSv : Sievert
    @JvmName("getMSv_prop")
    /**
    * Returns MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(6))

/**
* megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.megasievert : Sievert
    /**
    * Returns megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val MSv = 10.0.pow(6) * ((m*m)*(s `^` -2))

/**
* megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val megasievert = MSv
    

/**
* kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.kSv : Sievert
    @JvmName("getkSv_prop")
    /**
    * Returns kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(3))

/**
* kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.kilosievert : Sievert
    /**
    * Returns kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val kSv = 10.0.pow(3) * ((m*m)*(s `^` -2))

/**
* kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val kilosievert = kSv
    

/**
* hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.hSv : Sievert
    @JvmName("gethSv_prop")
    /**
    * Returns hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(2))

/**
* hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.hectosievert : Sievert
    /**
    * Returns hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val hSv = 10.0.pow(2) * ((m*m)*(s `^` -2))

/**
* hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val hectosievert = hSv
    

/**
* daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.daSv : Sievert
    @JvmName("getdaSv_prop")
    /**
    * Returns daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(1))

/**
* decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.decasievert : Sievert
    /**
    * Returns decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val daSv = 10.0.pow(1) * ((m*m)*(s `^` -2))

/**
* decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val decasievert = daSv
    

/**
* dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.dSv : Sievert
    @JvmName("getdSv_prop")
    /**
    * Returns dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-1))

/**
* decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.decisievert : Sievert
    /**
    * Returns decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val dSv = 10.0.pow(-1) * ((m*m)*(s `^` -2))

/**
* decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val decisievert = dSv
    

/**
* cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.cSv : Sievert
    @JvmName("getcSv_prop")
    /**
    * Returns cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-2))

/**
* centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.centisievert : Sievert
    /**
    * Returns centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val cSv = 10.0.pow(-2) * ((m*m)*(s `^` -2))

/**
* centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val centisievert = cSv
    

/**
* mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.mSv : Sievert
    @JvmName("getmSv_prop")
    /**
    * Returns mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-3))

/**
* millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.millisievert : Sievert
    /**
    * Returns millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val mSv = 10.0.pow(-3) * ((m*m)*(s `^` -2))

/**
* millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val millisievert = mSv
    

/**
* μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.μSv : Sievert
    @JvmName("getμSv_prop")
    /**
    * Returns μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-6))

/**
* microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.microsievert : Sievert
    /**
    * Returns microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val μSv = 10.0.pow(-6) * ((m*m)*(s `^` -2))

/**
* microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val microsievert = μSv
    

/**
* nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.nSv : Sievert
    @JvmName("getnSv_prop")
    /**
    * Returns nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-9))

/**
* nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.nanosievert : Sievert
    /**
    * Returns nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val nSv = 10.0.pow(-9) * ((m*m)*(s `^` -2))

/**
* nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val nanosievert = nSv
    

/**
* pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.pSv : Sievert
    @JvmName("getpSv_prop")
    /**
    * Returns pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-12))

/**
* picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.picosievert : Sievert
    /**
    * Returns picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val pSv = 10.0.pow(-12) * ((m*m)*(s `^` -2))

/**
* picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val picosievert = pSv
    

/**
* fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.fSv : Sievert
    @JvmName("getfSv_prop")
    /**
    * Returns fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-15))

/**
* femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.femtosievert : Sievert
    /**
    * Returns femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val fSv = 10.0.pow(-15) * ((m*m)*(s `^` -2))

/**
* femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val femtosievert = fSv
    

/**
* aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.aSv : Sievert
    @JvmName("getaSv_prop")
    /**
    * Returns aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-18))

/**
* attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.attosievert : Sievert
    /**
    * Returns attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val aSv = 10.0.pow(-18) * ((m*m)*(s `^` -2))

/**
* attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val attosievert = aSv
    

/**
* zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.zSv : Sievert
    @JvmName("getzSv_prop")
    /**
    * Returns zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-21))

/**
* zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.zeptosievert : Sievert
    /**
    * Returns zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val zSv = 10.0.pow(-21) * ((m*m)*(s `^` -2))

/**
* zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val zeptosievert = zSv
    

/**
* ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ySv : Sievert
    @JvmName("getySv_prop")
    /**
    * Returns ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-24))

/**
* yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.yoctosievert : Sievert
    /**
    * Returns yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ySv = 10.0.pow(-24) * ((m*m)*(s `^` -2))

/**
* yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val yoctosievert = ySv
    

/**
* rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.rSv : Sievert
    @JvmName("getrSv_prop")
    /**
    * Returns rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-27))

/**
* rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.rontosievert : Sievert
    /**
    * Returns rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val rSv = 10.0.pow(-27) * ((m*m)*(s `^` -2))

/**
* rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val rontosievert = rSv
    

/**
* qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.qSv : Sievert
    @JvmName("getqSv_prop")
    /**
    * Returns qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-30))

/**
* quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.quectosievert : Sievert
    /**
    * Returns quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = Sievert(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val qSv = 10.0.pow(-30) * ((m*m)*(s `^` -2))

/**
* quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val quectosievert = qSv
    