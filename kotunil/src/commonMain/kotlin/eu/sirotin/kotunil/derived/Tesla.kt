
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg* (s `^` -2) * (A `^` -1)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for magnetic flux density.
*/
class Tesla(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for magnetic flux density.
*/
@JsExport
@JvmField
val T = Tesla(1.0)

/**
* Creates Tesla-Object for current number value. Tesla is a System International Unit for magnetic flux density.
*/
val Number.T : Tesla
   /**
   * Returns Tesla-Object for current number value. Tesla is a System International Unit for magnetic flux density.
   */
    get() = Tesla(this.toDouble())

    
/**
* QT, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.QT : Tesla
    @JvmName("getQT_prop")
    /**
    * Returns QT, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(30))

/**
* quettatesla, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.quettatesla : Tesla
    /**
    * Returns quettatesla, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QT, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val QT = 10.0.pow(30) * (kg* (s `^` -2) * (A `^` -1))

/**
* quettatesla, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val quettatesla = QT
    

/**
* RT, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.RT : Tesla
    @JvmName("getRT_prop")
    /**
    * Returns RT, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(27))

/**
* ronnatesla, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.ronnatesla : Tesla
    /**
    * Returns ronnatesla, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RT, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val RT = 10.0.pow(27) * (kg* (s `^` -2) * (A `^` -1))

/**
* ronnatesla, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val ronnatesla = RT
    

/**
* YT, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.YT : Tesla
    @JvmName("getYT_prop")
    /**
    * Returns YT, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(24))

/**
* yottatesla, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.yottatesla : Tesla
    /**
    * Returns yottatesla, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YT, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val YT = 10.0.pow(24) * (kg* (s `^` -2) * (A `^` -1))

/**
* yottatesla, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val yottatesla = YT
    

/**
* ZT, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.ZT : Tesla
    @JvmName("getZT_prop")
    /**
    * Returns ZT, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(21))

/**
* zettatesla, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.zettatesla : Tesla
    /**
    * Returns zettatesla, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZT, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val ZT = 10.0.pow(21) * (kg* (s `^` -2) * (A `^` -1))

/**
* zettatesla, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val zettatesla = ZT
    

/**
* ET, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.ET : Tesla
    @JvmName("getET_prop")
    /**
    * Returns ET, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(18))

/**
* exatesla, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.exatesla : Tesla
    /**
    * Returns exatesla, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* ET, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val ET = 10.0.pow(18) * (kg* (s `^` -2) * (A `^` -1))

/**
* exatesla, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val exatesla = ET
    

/**
* PT, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.PT : Tesla
    @JvmName("getPT_prop")
    /**
    * Returns PT, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(15))

/**
* petatesla, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.petatesla : Tesla
    /**
    * Returns petatesla, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PT, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val PT = 10.0.pow(15) * (kg* (s `^` -2) * (A `^` -1))

/**
* petatesla, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val petatesla = PT
    

/**
* TT, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.TT : Tesla
    @JvmName("getTT_prop")
    /**
    * Returns TT, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(12))

/**
* teratesla, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.teratesla : Tesla
    /**
    * Returns teratesla, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TT, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val TT = 10.0.pow(12) * (kg* (s `^` -2) * (A `^` -1))

/**
* teratesla, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val teratesla = TT
    

/**
* GT, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.GT : Tesla
    @JvmName("getGT_prop")
    /**
    * Returns GT, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(9))

/**
* gigatesla, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.gigatesla : Tesla
    /**
    * Returns gigatesla, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GT, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val GT = 10.0.pow(9) * (kg* (s `^` -2) * (A `^` -1))

/**
* gigatesla, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val gigatesla = GT
    

/**
* MT, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.MT : Tesla
    @JvmName("getMT_prop")
    /**
    * Returns MT, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(6))

/**
* megatesla, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.megatesla : Tesla
    /**
    * Returns megatesla, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MT, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val MT = 10.0.pow(6) * (kg* (s `^` -2) * (A `^` -1))

/**
* megatesla, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val megatesla = MT
    

/**
* kT, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.kT : Tesla
    @JvmName("getkT_prop")
    /**
    * Returns kT, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(3))

/**
* kilotesla, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.kilotesla : Tesla
    /**
    * Returns kilotesla, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kT, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val kT = 10.0.pow(3) * (kg* (s `^` -2) * (A `^` -1))

/**
* kilotesla, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val kilotesla = kT
    

/**
* hT, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.hT : Tesla
    @JvmName("gethT_prop")
    /**
    * Returns hT, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(2))

/**
* hectotesla, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.hectotesla : Tesla
    /**
    * Returns hectotesla, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hT, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val hT = 10.0.pow(2) * (kg* (s `^` -2) * (A `^` -1))

/**
* hectotesla, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val hectotesla = hT
    

/**
* daT, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.daT : Tesla
    @JvmName("getdaT_prop")
    /**
    * Returns daT, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(1))

/**
* decatesla, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.decatesla : Tesla
    /**
    * Returns decatesla, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daT, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val daT = 10.0.pow(1) * (kg* (s `^` -2) * (A `^` -1))

/**
* decatesla, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val decatesla = daT
    

/**
* dT, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.dT : Tesla
    @JvmName("getdT_prop")
    /**
    * Returns dT, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-1))

/**
* decitesla, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.decitesla : Tesla
    /**
    * Returns decitesla, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dT, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val dT = 10.0.pow(-1) * (kg* (s `^` -2) * (A `^` -1))

/**
* decitesla, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val decitesla = dT
    

/**
* cT, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.cT : Tesla
    @JvmName("getcT_prop")
    /**
    * Returns cT, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-2))

/**
* centitesla, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.centitesla : Tesla
    /**
    * Returns centitesla, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cT, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val cT = 10.0.pow(-2) * (kg* (s `^` -2) * (A `^` -1))

/**
* centitesla, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val centitesla = cT
    

/**
* mT, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.mT : Tesla
    @JvmName("getmT_prop")
    /**
    * Returns mT, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-3))

/**
* millitesla, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.millitesla : Tesla
    /**
    * Returns millitesla, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mT, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val mT = 10.0.pow(-3) * (kg* (s `^` -2) * (A `^` -1))

/**
* millitesla, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val millitesla = mT
    

/**
* μT, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.μT : Tesla
    @JvmName("getμT_prop")
    /**
    * Returns μT, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-6))

/**
* microtesla, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.microtesla : Tesla
    /**
    * Returns microtesla, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μT, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val μT = 10.0.pow(-6) * (kg* (s `^` -2) * (A `^` -1))

/**
* microtesla, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val microtesla = μT
    

/**
* nT, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.nT : Tesla
    @JvmName("getnT_prop")
    /**
    * Returns nT, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-9))

/**
* nanotesla, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.nanotesla : Tesla
    /**
    * Returns nanotesla, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nT, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val nT = 10.0.pow(-9) * (kg* (s `^` -2) * (A `^` -1))

/**
* nanotesla, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val nanotesla = nT
    

/**
* pT, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.pT : Tesla
    @JvmName("getpT_prop")
    /**
    * Returns pT, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-12))

/**
* picotesla, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.picotesla : Tesla
    /**
    * Returns picotesla, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pT, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val pT = 10.0.pow(-12) * (kg* (s `^` -2) * (A `^` -1))

/**
* picotesla, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val picotesla = pT
    

/**
* fT, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.fT : Tesla
    @JvmName("getfT_prop")
    /**
    * Returns fT, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-15))

/**
* femtotesla, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.femtotesla : Tesla
    /**
    * Returns femtotesla, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fT, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val fT = 10.0.pow(-15) * (kg* (s `^` -2) * (A `^` -1))

/**
* femtotesla, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val femtotesla = fT
    

/**
* aT, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.aT : Tesla
    @JvmName("getaT_prop")
    /**
    * Returns aT, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-18))

/**
* attotesla, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.attotesla : Tesla
    /**
    * Returns attotesla, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aT, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val aT = 10.0.pow(-18) * (kg* (s `^` -2) * (A `^` -1))

/**
* attotesla, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val attotesla = aT
    

/**
* zT, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.zT : Tesla
    @JvmName("getzT_prop")
    /**
    * Returns zT, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-21))

/**
* zeptotesla, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.zeptotesla : Tesla
    /**
    * Returns zeptotesla, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zT, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val zT = 10.0.pow(-21) * (kg* (s `^` -2) * (A `^` -1))

/**
* zeptotesla, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val zeptotesla = zT
    

/**
* yT, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.yT : Tesla
    @JvmName("getyT_prop")
    /**
    * Returns yT, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-24))

/**
* yoctotesla, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.yoctotesla : Tesla
    /**
    * Returns yoctotesla, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yT, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val yT = 10.0.pow(-24) * (kg* (s `^` -2) * (A `^` -1))

/**
* yoctotesla, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val yoctotesla = yT
    

/**
* rT, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.rT : Tesla
    @JvmName("getrT_prop")
    /**
    * Returns rT, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-27))

/**
* rontotesla, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.rontotesla : Tesla
    /**
    * Returns rontotesla, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rT, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val rT = 10.0.pow(-27) * (kg* (s `^` -2) * (A `^` -1))

/**
* rontotesla, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val rontotesla = rT
    

/**
* qT, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.qT : Tesla
    @JvmName("getqT_prop")
    /**
    * Returns qT, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-30))

/**
* quectotesla, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.quectotesla : Tesla
    /**
    * Returns quectotesla, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = Tesla(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qT, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/        
val qT = 10.0.pow(-30) * (kg* (s `^` -2) * (A `^` -1))

/**
* quectotesla, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 

@JsExport
@JvmField
val quectotesla = qT
    