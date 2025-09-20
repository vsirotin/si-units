
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg/(m * (s `^` 2))

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for pressure, stress.
*/
class Pascal(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for pressure, stress.
*/
@JsExport
@JvmField
val Pa = Pascal(1.0)

/**
* Creates a Pascal object for the current number value. Pascal is a System International Unit for pressure, stress.
*/
val Number.Pa : Pascal
   /**
   * Returns a Pascal object for the current number value. Pascal is a System International Unit for pressure, stress.
   */
    get() = Pascal(this.toDouble())

    
/**
* QPa, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.QPa : Pascal
    @JvmName("getQPa_prop")
    /**
    * Returns QPa, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(30))

/**
* quettapascal, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.quettapascal : Pascal
    /**
    * Returns quettapascal, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(30))

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
val Number.RPa : Pascal
    @JvmName("getRPa_prop")
    /**
    * Returns RPa, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(27))

/**
* ronnapascal, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.ronnapascal : Pascal
    /**
    * Returns ronnapascal, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(27))

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
val Number.YPa : Pascal
    @JvmName("getYPa_prop")
    /**
    * Returns YPa, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(24))

/**
* yottapascal, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.yottapascal : Pascal
    /**
    * Returns yottapascal, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(24))

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
val Number.ZPa : Pascal
    @JvmName("getZPa_prop")
    /**
    * Returns ZPa, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(21))

/**
* zettapascal, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.zettapascal : Pascal
    /**
    * Returns zettapascal, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(21))

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
val Number.EPa : Pascal
    @JvmName("getEPa_prop")
    /**
    * Returns EPa, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(18))

/**
* exapascal, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.exapascal : Pascal
    /**
    * Returns exapascal, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(18))

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
val Number.PPa : Pascal
    @JvmName("getPPa_prop")
    /**
    * Returns PPa, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(15))

/**
* petapascal, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.petapascal : Pascal
    /**
    * Returns petapascal, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(15))

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
val Number.TPa : Pascal
    @JvmName("getTPa_prop")
    /**
    * Returns TPa, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(12))

/**
* terapascal, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.terapascal : Pascal
    /**
    * Returns terapascal, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(12))

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
val Number.GPa : Pascal
    @JvmName("getGPa_prop")
    /**
    * Returns GPa, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(9))

/**
* gigapascal, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.gigapascal : Pascal
    /**
    * Returns gigapascal, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(9))

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
val Number.MPa : Pascal
    @JvmName("getMPa_prop")
    /**
    * Returns MPa, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(6))

/**
* megapascal, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.megapascal : Pascal
    /**
    * Returns megapascal, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(6))

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
val Number.kPa : Pascal
    @JvmName("getkPa_prop")
    /**
    * Returns kPa, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(3))

/**
* kilopascal, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.kilopascal : Pascal
    /**
    * Returns kilopascal, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(3))

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
val Number.hPa : Pascal
    @JvmName("gethPa_prop")
    /**
    * Returns hPa, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(2))

/**
* hectopascal, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.hectopascal : Pascal
    /**
    * Returns hectopascal, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(2))

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
val Number.daPa : Pascal
    @JvmName("getdaPa_prop")
    /**
    * Returns daPa, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(1))

/**
* decapascal, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.decapascal : Pascal
    /**
    * Returns decapascal, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(1))

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
val Number.dPa : Pascal
    @JvmName("getdPa_prop")
    /**
    * Returns dPa, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-1))

/**
* decipascal, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.decipascal : Pascal
    /**
    * Returns decipascal, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-1))

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
val Number.cPa : Pascal
    @JvmName("getcPa_prop")
    /**
    * Returns cPa, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-2))

/**
* centipascal, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.centipascal : Pascal
    /**
    * Returns centipascal, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-2))

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
val Number.mPa : Pascal
    @JvmName("getmPa_prop")
    /**
    * Returns mPa, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-3))

/**
* millipascal, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.millipascal : Pascal
    /**
    * Returns millipascal, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-3))


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
val Number.μPa : Pascal
    @JvmName("getμPa_prop")
    /**
    * Returns μPa, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-6))

/**
* micropascal, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.micropascal : Pascal
    /**
    * Returns micropascal, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-6))

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
val Number.nPa : Pascal
    @JvmName("getnPa_prop")
    /**
    * Returns nPa, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-9))

/**
* nanopascal, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.nanopascal : Pascal
    /**
    * Returns nanopascal, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-9))

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
val Number.pPa : Pascal
    @JvmName("getpPa_prop")
    /**
    * Returns pPa, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-12))

/**
* picopascal, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.picopascal : Pascal
    /**
    * Returns picopascal, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-12))


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
val Number.fPa : Pascal
    @JvmName("getfPa_prop")
    /**
    * Returns fPa, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-15))

/**
* femtopascal, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.femtopascal : Pascal
    /**
    * Returns femtopascal, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-15))

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
val Number.aPa : Pascal
    @JvmName("getaPa_prop")
    /**
    * Returns aPa, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-18))

/**
* attopascal, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.attopascal : Pascal
    /**
    * Returns attopascal, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-18))

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
val Number.zPa : Pascal
    @JvmName("getzPa_prop")
    /**
    * Returns zPa, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-21))

/**
* zeptopascal, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.zeptopascal : Pascal
    /**
    * Returns zeptopascal, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-21))


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
val Number.yPa : Pascal
    @JvmName("getyPa_prop")
    /**
    * Returns yPa, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-24))

/**
* yoctopascal, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.yoctopascal : Pascal
    /**
    * Returns yoctopascal, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-24))


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
val Number.rPa : Pascal
    @JvmName("getrPa_prop")
    /**
    * Returns rPa, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-27))

/**
* rontopascal, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.rontopascal : Pascal
    /**
    * Returns rontopascal, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-27))


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
val Number.qPa : Pascal
    @JvmName("getqPa_prop")
    /**
    * Returns qPa, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-30))

/**
* quectopascal, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.quectopascal : Pascal
    /**
    * Returns quectopascal, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = Pascal(this.toDouble() * 10.0.pow(-30))


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
    