
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg* (s `^` -2) * (A `^` -1)

@JsExport
/**
* System International Unit for magnetic flux density.
*/
class Tesla(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for magnetic flux density.
*/
@JsExport
@JvmField
val T = formula

/**
* Creates Tesla-Object for current number value. Tesla is a System International Unit for magnetic flux density.
*/
val Number.T : Expression
   /**
   * Returns Tesla-Object for current number value. Tesla is a System International Unit for magnetic flux density.
   */
    get() = this.toDouble() * formula

    
/**
* QT, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/    
val Number.QT : Expression
    @JvmName("getQT_prop")
    /**
    * Returns QT, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettatesla, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.quettatesla : Expression
    /**
    * Returns quettatesla, 10^30 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

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
val Number.RT : Expression
    @JvmName("getRT_prop")
    /**
    * Returns RT, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnatesla, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.ronnatesla : Expression
    /**
    * Returns ronnatesla, 10^27 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

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
val Number.YT : Expression
    @JvmName("getYT_prop")
    /**
    * Returns YT, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottatesla, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.yottatesla : Expression
    /**
    * Returns yottatesla, 10^24 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

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
val Number.ZT : Expression
    @JvmName("getZT_prop")
    /**
    * Returns ZT, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettatesla, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.zettatesla : Expression
    /**
    * Returns zettatesla, 10^21 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

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
val Number.ET : Expression
    @JvmName("getET_prop")
    /**
    * Returns ET, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exatesla, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.exatesla : Expression
    /**
    * Returns exatesla, 10^18 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

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
val Number.PT : Expression
    @JvmName("getPT_prop")
    /**
    * Returns PT, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petatesla, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.petatesla : Expression
    /**
    * Returns petatesla, 10^15 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

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
val Number.TT : Expression
    @JvmName("getTT_prop")
    /**
    * Returns TT, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* teratesla, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.teratesla : Expression
    /**
    * Returns teratesla, 10^12 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

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
val Number.GT : Expression
    @JvmName("getGT_prop")
    /**
    * Returns GT, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigatesla, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.gigatesla : Expression
    /**
    * Returns gigatesla, 10^9 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

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
val Number.MT : Expression
    @JvmName("getMT_prop")
    /**
    * Returns MT, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megatesla, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.megatesla : Expression
    /**
    * Returns megatesla, 10^6 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

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
val Number.kT : Expression
    @JvmName("getkT_prop")
    /**
    * Returns kT, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilotesla, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.kilotesla : Expression
    /**
    * Returns kilotesla, 10^3 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

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
val Number.hT : Expression
    @JvmName("gethT_prop")
    /**
    * Returns hT, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectotesla, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.hectotesla : Expression
    /**
    * Returns hectotesla, 10^2 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

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
val Number.daT : Expression
    @JvmName("getdaT_prop")
    /**
    * Returns daT, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decatesla, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.decatesla : Expression
    /**
    * Returns decatesla, 10^1 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

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
val Number.dT : Expression
    @JvmName("getdT_prop")
    /**
    * Returns dT, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decitesla, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.decitesla : Expression
    /**
    * Returns decitesla, 10^-1 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

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
val Number.cT : Expression
    @JvmName("getcT_prop")
    /**
    * Returns cT, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centitesla, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.centitesla : Expression
    /**
    * Returns centitesla, 10^-2 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

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
val Number.mT : Expression
    @JvmName("getmT_prop")
    /**
    * Returns mT, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millitesla, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.millitesla : Expression
    /**
    * Returns millitesla, 10^-3 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


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
val Number.μT : Expression
    @JvmName("getμT_prop")
    /**
    * Returns μT, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* microtesla, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.microtesla : Expression
    /**
    * Returns microtesla, 10^-6 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

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
val Number.nT : Expression
    @JvmName("getnT_prop")
    /**
    * Returns nT, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanotesla, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.nanotesla : Expression
    /**
    * Returns nanotesla, 10^-9 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

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
val Number.pT : Expression
    @JvmName("getpT_prop")
    /**
    * Returns pT, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picotesla, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.picotesla : Expression
    /**
    * Returns picotesla, 10^-12 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


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
val Number.fT : Expression
    @JvmName("getfT_prop")
    /**
    * Returns fT, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtotesla, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.femtotesla : Expression
    /**
    * Returns femtotesla, 10^-15 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

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
val Number.aT : Expression
    @JvmName("getaT_prop")
    /**
    * Returns aT, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attotesla, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.attotesla : Expression
    /**
    * Returns attotesla, 10^-18 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

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
val Number.zT : Expression
    @JvmName("getzT_prop")
    /**
    * Returns zT, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptotesla, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.zeptotesla : Expression
    /**
    * Returns zeptotesla, 10^-21 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


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
val Number.yT : Expression
    @JvmName("getyT_prop")
    /**
    * Returns yT, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctotesla, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.yoctotesla : Expression
    /**
    * Returns yoctotesla, 10^-24 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


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
val Number.rT : Expression
    @JvmName("getrT_prop")
    /**
    * Returns rT, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontotesla, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.rontotesla : Expression
    /**
    * Returns rontotesla, 10^-27 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


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
val Number.qT : Expression
    @JvmName("getqT_prop")
    /**
    * Returns qT, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectotesla, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
*/ 
val Number.quectotesla : Expression
    /**
    * Returns quectotesla, 10^-30 of tesla, derived SI-Unit for measurement of magnetic flux density
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


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
    