
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg/(m * (s `^` 2))

@JsExport
/**
* System International Unit for pressure, stress.
*/
class Pascal(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for pressure, stress.
*/
@JsExport
@JvmField
val Pa = formula

/**
* Creates Pascal-Object for current number value. Pascal is a System International Unit for pressure, stress.
*/
val Number.Pa : Expression
   /**
   * Returns Pascal-Object for current number value. Pascal is a System International Unit for pressure, stress.
   */
    get() = this.toDouble() * formula

    
/**
* QPa, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.QPa : Expression
    @JvmName("getQPa_prop")
    /**
    * Returns QPa, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettapascal, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.quettapascal : Expression
    /**
    * Returns quettapascal, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

@JsExport
@JvmField
/**
* QPa, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val QPa = 10.0.pow(30) * (kg/(m * (s `^` 2)))

/**
* quettapascal, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val quettapascal = QPa
    

/**
* RPa, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.RPa : Expression
    @JvmName("getRPa_prop")
    /**
    * Returns RPa, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnapascal, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.ronnapascal : Expression
    /**
    * Returns ronnapascal, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

@JsExport
@JvmField
/**
* RPa, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val RPa = 10.0.pow(27) * (kg/(m * (s `^` 2)))

/**
* ronnapascal, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val ronnapascal = RPa
    

/**
* YPa, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.YPa : Expression
    @JvmName("getYPa_prop")
    /**
    * Returns YPa, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottapascal, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.yottapascal : Expression
    /**
    * Returns yottapascal, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

@JsExport
@JvmField
/**
* YPa, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val YPa = 10.0.pow(24) * (kg/(m * (s `^` 2)))

/**
* yottapascal, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val yottapascal = YPa
    

/**
* ZPa, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.ZPa : Expression
    @JvmName("getZPa_prop")
    /**
    * Returns ZPa, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettapascal, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.zettapascal : Expression
    /**
    * Returns zettapascal, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

@JsExport
@JvmField
/**
* ZPa, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val ZPa = 10.0.pow(21) * (kg/(m * (s `^` 2)))

/**
* zettapascal, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val zettapascal = ZPa
    

/**
* EPa, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.EPa : Expression
    @JvmName("getEPa_prop")
    /**
    * Returns EPa, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exapascal, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.exapascal : Expression
    /**
    * Returns exapascal, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

@JsExport
@JvmField
/**
* EPa, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val EPa = 10.0.pow(18) * (kg/(m * (s `^` 2)))

/**
* exapascal, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val exapascal = EPa
    

/**
* PPa, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.PPa : Expression
    @JvmName("getPPa_prop")
    /**
    * Returns PPa, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petapascal, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.petapascal : Expression
    /**
    * Returns petapascal, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

@JsExport
@JvmField
/**
* PPa, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val PPa = 10.0.pow(15) * (kg/(m * (s `^` 2)))

/**
* petapascal, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val petapascal = PPa
    

/**
* TPa, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.TPa : Expression
    @JvmName("getTPa_prop")
    /**
    * Returns TPa, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* terapascal, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.terapascal : Expression
    /**
    * Returns terapascal, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

@JsExport
@JvmField
/**
* TPa, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val TPa = 10.0.pow(12) * (kg/(m * (s `^` 2)))

/**
* terapascal, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val terapascal = TPa
    

/**
* GPa, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.GPa : Expression
    @JvmName("getGPa_prop")
    /**
    * Returns GPa, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigapascal, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.gigapascal : Expression
    /**
    * Returns gigapascal, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

@JsExport
@JvmField
/**
* GPa, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val GPa = 10.0.pow(9) * (kg/(m * (s `^` 2)))

/**
* gigapascal, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val gigapascal = GPa
    

/**
* MPa, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.MPa : Expression
    @JvmName("getMPa_prop")
    /**
    * Returns MPa, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megapascal, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.megapascal : Expression
    /**
    * Returns megapascal, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

@JsExport
@JvmField
/**
* MPa, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val MPa = 10.0.pow(6) * (kg/(m * (s `^` 2)))

/**
* megapascal, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val megapascal = MPa
    

/**
* kPa, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.kPa : Expression
    @JvmName("getkPa_prop")
    /**
    * Returns kPa, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilopascal, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.kilopascal : Expression
    /**
    * Returns kilopascal, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

@JsExport
@JvmField
/**
* kPa, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val kPa = 10.0.pow(3) * (kg/(m * (s `^` 2)))

/**
* kilopascal, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val kilopascal = kPa
    

/**
* hPa, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.hPa : Expression
    @JvmName("gethPa_prop")
    /**
    * Returns hPa, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectopascal, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.hectopascal : Expression
    /**
    * Returns hectopascal, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

@JsExport
@JvmField
/**
* hPa, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val hPa = 10.0.pow(2) * (kg/(m * (s `^` 2)))

/**
* hectopascal, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val hectopascal = hPa
    

/**
* daPa, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.daPa : Expression
    @JvmName("getdaPa_prop")
    /**
    * Returns daPa, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decapascal, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.decapascal : Expression
    /**
    * Returns decapascal, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

@JsExport
@JvmField
/**
* daPa, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val daPa = 10.0.pow(1) * (kg/(m * (s `^` 2)))

/**
* decapascal, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val decapascal = daPa
    

/**
* dPa, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.dPa : Expression
    @JvmName("getdPa_prop")
    /**
    * Returns dPa, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decipascal, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.decipascal : Expression
    /**
    * Returns decipascal, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

@JsExport
@JvmField
/**
* dPa, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val dPa = 10.0.pow(-1) * (kg/(m * (s `^` 2)))

/**
* decipascal, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val decipascal = dPa
    

/**
* cPa, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.cPa : Expression
    @JvmName("getcPa_prop")
    /**
    * Returns cPa, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centipascal, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.centipascal : Expression
    /**
    * Returns centipascal, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

@JsExport
@JvmField
/**
* cPa, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val cPa = 10.0.pow(-2) * (kg/(m * (s `^` 2)))

/**
* centipascal, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val centipascal = cPa
    

/**
* mPa, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.mPa : Expression
    @JvmName("getmPa_prop")
    /**
    * Returns mPa, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millipascal, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.millipascal : Expression
    /**
    * Returns millipascal, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


@JvmField
/**
* mPa, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val mPa = 10.0.pow(-3) * (kg/(m * (s `^` 2)))

/**
* millipascal, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val millipascal = mPa
    

/**
* μPa, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.μPa : Expression
    @JvmName("getμPa_prop")
    /**
    * Returns μPa, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* micropascal, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.micropascal : Expression
    /**
    * Returns micropascal, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

@JsExport
@JvmField
/**
* μPa, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val μPa = 10.0.pow(-6) * (kg/(m * (s `^` 2)))

/**
* micropascal, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val micropascal = μPa
    

/**
* nPa, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.nPa : Expression
    @JvmName("getnPa_prop")
    /**
    * Returns nPa, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanopascal, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.nanopascal : Expression
    /**
    * Returns nanopascal, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

@JsExport
@JvmField
/**
* nPa, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val nPa = 10.0.pow(-9) * (kg/(m * (s `^` 2)))

/**
* nanopascal, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val nanopascal = nPa
    

/**
* pPa, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.pPa : Expression
    @JvmName("getpPa_prop")
    /**
    * Returns pPa, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picopascal, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.picopascal : Expression
    /**
    * Returns picopascal, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


@JvmField
/**
* pPa, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val pPa = 10.0.pow(-12) * (kg/(m * (s `^` 2)))

/**
* picopascal, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val picopascal = pPa
    

/**
* fPa, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.fPa : Expression
    @JvmName("getfPa_prop")
    /**
    * Returns fPa, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtopascal, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.femtopascal : Expression
    /**
    * Returns femtopascal, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

@JsExport
@JvmField
/**
* fPa, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val fPa = 10.0.pow(-15) * (kg/(m * (s `^` 2)))

/**
* femtopascal, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val femtopascal = fPa
    

/**
* aPa, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.aPa : Expression
    @JvmName("getaPa_prop")
    /**
    * Returns aPa, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attopascal, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.attopascal : Expression
    /**
    * Returns attopascal, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

@JsExport
@JvmField
/**
* aPa, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val aPa = 10.0.pow(-18) * (kg/(m * (s `^` 2)))

/**
* attopascal, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val attopascal = aPa
    

/**
* zPa, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.zPa : Expression
    @JvmName("getzPa_prop")
    /**
    * Returns zPa, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptopascal, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.zeptopascal : Expression
    /**
    * Returns zeptopascal, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


@JvmField
/**
* zPa, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val zPa = 10.0.pow(-21) * (kg/(m * (s `^` 2)))

/**
* zeptopascal, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val zeptopascal = zPa
    

/**
* yPa, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.yPa : Expression
    @JvmName("getyPa_prop")
    /**
    * Returns yPa, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctopascal, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.yoctopascal : Expression
    /**
    * Returns yoctopascal, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


@JvmField
/**
* yPa, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val yPa = 10.0.pow(-24) * (kg/(m * (s `^` 2)))

/**
* yoctopascal, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val yoctopascal = yPa
    

/**
* rPa, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.rPa : Expression
    @JvmName("getrPa_prop")
    /**
    * Returns rPa, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontopascal, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.rontopascal : Expression
    /**
    * Returns rontopascal, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


@JvmField
/**
* rPa, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val rPa = 10.0.pow(-27) * (kg/(m * (s `^` 2)))

/**
* rontopascal, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val rontopascal = rPa
    

/**
* qPa, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.qPa : Expression
    @JvmName("getqPa_prop")
    /**
    * Returns qPa, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectopascal, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.quectopascal : Expression
    /**
    * Returns quectopascal, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


@JvmField
/**
* qPa, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val qPa = 10.0.pow(-30) * (kg/(m * (s `^` 2)))

/**
* quectopascal, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 

@JsExport
@JvmField
val quectopascal = qPa
    