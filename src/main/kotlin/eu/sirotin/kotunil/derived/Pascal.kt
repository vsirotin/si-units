
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.math.pow

private val unit =  kg/(m * (s `^` 2))

/**
* System International Unit for pressure, stress.
*/
val Pa = unit

/**
* Creates Pascal-Object for current number value. Pascal is a System International Unit for pressure, stress.
*/
val Number.Pa : Expression
   /**
   * Returns Pascal-Object for current number value. Pascal is a System International Unit for pressure, stress.
   */
    get() = this.toDouble() * unit

    
/**
* QPa, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.QPa : Expression
    @JvmName("getQPa_prop")
    /**
    * Returns QPa, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettapascal, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.quettapascal : Expression
    /**
    * Returns quettapascal, 10^30 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit


@JvmField()  
/**
* QPa, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val QPa = 10.0.pow(30) * (kg/(m * (s `^` 2)))

/**
* quettapascal, 10^30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val quettapascal = QPa
    

/**
* RPa, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.RPa : Expression
    @JvmName("getRPa_prop")
    /**
    * Returns RPa, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnapascal, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.ronnapascal : Expression
    /**
    * Returns ronnapascal, 10^27 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit


@JvmField()  
/**
* RPa, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val RPa = 10.0.pow(27) * (kg/(m * (s `^` 2)))

/**
* ronnapascal, 10^27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val ronnapascal = RPa
    

/**
* YPa, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.YPa : Expression
    @JvmName("getYPa_prop")
    /**
    * Returns YPa, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottapascal, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.yottapascal : Expression
    /**
    * Returns yottapascal, 10^24 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit


@JvmField()  
/**
* YPa, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val YPa = 10.0.pow(24) * (kg/(m * (s `^` 2)))

/**
* yottapascal, 10^24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val yottapascal = YPa
    

/**
* ZPa, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.ZPa : Expression
    @JvmName("getZPa_prop")
    /**
    * Returns ZPa, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettapascal, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.zettapascal : Expression
    /**
    * Returns zettapascal, 10^21 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit


@JvmField()  
/**
* ZPa, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val ZPa = 10.0.pow(21) * (kg/(m * (s `^` 2)))

/**
* zettapascal, 10^21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val zettapascal = ZPa
    

/**
* EPa, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.EPa : Expression
    @JvmName("getEPa_prop")
    /**
    * Returns EPa, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exapascal, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.exapascal : Expression
    /**
    * Returns exapascal, 10^18 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit


@JvmField()  
/**
* EPa, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val EPa = 10.0.pow(18) * (kg/(m * (s `^` 2)))

/**
* exapascal, 10^18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val exapascal = EPa
    

/**
* PPa, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.PPa : Expression
    @JvmName("getPPa_prop")
    /**
    * Returns PPa, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petapascal, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.petapascal : Expression
    /**
    * Returns petapascal, 10^15 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit


@JvmField()  
/**
* PPa, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val PPa = 10.0.pow(15) * (kg/(m * (s `^` 2)))

/**
* petapascal, 10^15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val petapascal = PPa
    

/**
* TPa, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.TPa : Expression
    @JvmName("getTPa_prop")
    /**
    * Returns TPa, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* terapascal, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.terapascal : Expression
    /**
    * Returns terapascal, 10^12 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit


@JvmField()  
/**
* TPa, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val TPa = 10.0.pow(12) * (kg/(m * (s `^` 2)))

/**
* terapascal, 10^12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val terapascal = TPa
    

/**
* GPa, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.GPa : Expression
    @JvmName("getGPa_prop")
    /**
    * Returns GPa, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigapascal, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.gigapascal : Expression
    /**
    * Returns gigapascal, 10^9 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit


@JvmField()  
/**
* GPa, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val GPa = 10.0.pow(9) * (kg/(m * (s `^` 2)))

/**
* gigapascal, 10^9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val gigapascal = GPa
    

/**
* MPa, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.MPa : Expression
    @JvmName("getMPa_prop")
    /**
    * Returns MPa, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megapascal, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.megapascal : Expression
    /**
    * Returns megapascal, 10^6 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit


@JvmField()  
/**
* MPa, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val MPa = 10.0.pow(6) * (kg/(m * (s `^` 2)))

/**
* megapascal, 10^6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val megapascal = MPa
    

/**
* kPa, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.kPa : Expression
    @JvmName("getkPa_prop")
    /**
    * Returns kPa, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilopascal, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.kilopascal : Expression
    /**
    * Returns kilopascal, 10^3 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit


@JvmField()  
/**
* kPa, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val kPa = 10.0.pow(3) * (kg/(m * (s `^` 2)))

/**
* kilopascal, 10^3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val kilopascal = kPa
    

/**
* hPa, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.hPa : Expression
    @JvmName("gethPa_prop")
    /**
    * Returns hPa, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectopascal, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.hectopascal : Expression
    /**
    * Returns hectopascal, 10^2 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit


@JvmField()  
/**
* hPa, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val hPa = 10.0.pow(2) * (kg/(m * (s `^` 2)))

/**
* hectopascal, 10^2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val hectopascal = hPa
    

/**
* daPa, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.daPa : Expression
    @JvmName("getdaPa_prop")
    /**
    * Returns daPa, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decapascal, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.decapascal : Expression
    /**
    * Returns decapascal, 10^1 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit


@JvmField()  
/**
* daPa, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val daPa = 10.0.pow(1) * (kg/(m * (s `^` 2)))

/**
* decapascal, 10^1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val decapascal = daPa
    

/**
* dPa, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.dPa : Expression
    @JvmName("getdPa_prop")
    /**
    * Returns dPa, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decipascal, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.decipascal : Expression
    /**
    * Returns decipascal, 10^-1 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit


@JvmField()  
/**
* dPa, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val dPa = 10.0.pow(-1) * (kg/(m * (s `^` 2)))

/**
* decipascal, 10^-1 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val decipascal = dPa
    

/**
* cPa, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.cPa : Expression
    @JvmName("getcPa_prop")
    /**
    * Returns cPa, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centipascal, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.centipascal : Expression
    /**
    * Returns centipascal, 10^-2 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit


@JvmField()  
/**
* cPa, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val cPa = 10.0.pow(-2) * (kg/(m * (s `^` 2)))

/**
* centipascal, 10^-2 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val centipascal = cPa
    

/**
* mPa, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.mPa : Expression
    @JvmName("getmPa_prop")
    /**
    * Returns mPa, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millipascal, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.millipascal : Expression
    /**
    * Returns millipascal, 10^-3 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField()  
/**
* mPa, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val mPa = 10.0.pow(-3) * (kg/(m * (s `^` 2)))

/**
* millipascal, 10^-3 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val millipascal = mPa
    

/**
* μPa, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.μPa : Expression
    @JvmName("getμPa_prop")
    /**
    * Returns μPa, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* micropascal, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.micropascal : Expression
    /**
    * Returns micropascal, 10^-6 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit


@JvmField()  
/**
* μPa, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val μPa = 10.0.pow(-6) * (kg/(m * (s `^` 2)))

/**
* micropascal, 10^-6 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val micropascal = μPa
    

/**
* nPa, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.nPa : Expression
    @JvmName("getnPa_prop")
    /**
    * Returns nPa, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanopascal, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.nanopascal : Expression
    /**
    * Returns nanopascal, 10^-9 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit


@JvmField()  
/**
* nPa, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val nPa = 10.0.pow(-9) * (kg/(m * (s `^` 2)))

/**
* nanopascal, 10^-9 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val nanopascal = nPa
    

/**
* pPa, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.pPa : Expression
    @JvmName("getpPa_prop")
    /**
    * Returns pPa, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picopascal, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.picopascal : Expression
    /**
    * Returns picopascal, 10^-12 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField()  
/**
* pPa, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val pPa = 10.0.pow(-12) * (kg/(m * (s `^` 2)))

/**
* picopascal, 10^-12 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val picopascal = pPa
    

/**
* fPa, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.fPa : Expression
    @JvmName("getfPa_prop")
    /**
    * Returns fPa, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtopascal, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.femtopascal : Expression
    /**
    * Returns femtopascal, 10^-15 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit


@JvmField()  
/**
* fPa, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val fPa = 10.0.pow(-15) * (kg/(m * (s `^` 2)))

/**
* femtopascal, 10^-15 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val femtopascal = fPa
    

/**
* aPa, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.aPa : Expression
    @JvmName("getaPa_prop")
    /**
    * Returns aPa, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attopascal, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.attopascal : Expression
    /**
    * Returns attopascal, 10^-18 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit


@JvmField()  
/**
* aPa, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val aPa = 10.0.pow(-18) * (kg/(m * (s `^` 2)))

/**
* attopascal, 10^-18 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val attopascal = aPa
    

/**
* zPa, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.zPa : Expression
    @JvmName("getzPa_prop")
    /**
    * Returns zPa, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptopascal, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.zeptopascal : Expression
    /**
    * Returns zeptopascal, 10^-21 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField()  
/**
* zPa, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val zPa = 10.0.pow(-21) * (kg/(m * (s `^` 2)))

/**
* zeptopascal, 10^-21 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val zeptopascal = zPa
    

/**
* yPa, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.yPa : Expression
    @JvmName("getyPa_prop")
    /**
    * Returns yPa, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctopascal, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.yoctopascal : Expression
    /**
    * Returns yoctopascal, 10^-24 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField()  
/**
* yPa, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val yPa = 10.0.pow(-24) * (kg/(m * (s `^` 2)))

/**
* yoctopascal, 10^-24 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val yoctopascal = yPa
    

/**
* rPa, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.rPa : Expression
    @JvmName("getrPa_prop")
    /**
    * Returns rPa, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontopascal, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.rontopascal : Expression
    /**
    * Returns rontopascal, 10^-27 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField()  
/**
* rPa, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val rPa = 10.0.pow(-27) * (kg/(m * (s `^` 2)))

/**
* rontopascal, 10^-27 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val rontopascal = rPa
    

/**
* qPa, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/    
val Number.qPa : Expression
    @JvmName("getqPa_prop")
    /**
    * Returns qPa, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectopascal, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val Number.quectopascal : Expression
    /**
    * Returns quectopascal, 10^-30 of of pascal, derived SI-Unit for measurement of pressure, stress
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField()  
/**
* qPa, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/        
val qPa = 10.0.pow(-30) * (kg/(m * (s `^` 2)))

/**
* quectopascal, 10^-30 of pascal, derived SI-Unit for measurement of pressure, stress
*/ 
val quectopascal = qPa
    