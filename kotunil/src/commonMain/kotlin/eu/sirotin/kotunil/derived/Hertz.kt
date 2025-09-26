
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  1/s

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for frequency.
*/
class Hertz(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for frequency.
*/
@JsExport
@JvmField
val Hz = Hertz(1.0)

/**
* Creates a Hertz object for the current number value. Hertz is a System International Unit for frequency.
*/
val Number.Hz : Hertz
   /**
   * Returns a Hertz object for the current number value. Hertz is a System International Unit for frequency.
   */
    get() = Hertz(this.toDouble())

    
/**
* QHz, 10^30 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.QHz : Hertz
    @JvmName("getQHz_prop")
    /**
    * Returns QHz, 10^30 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(30))

/**
* quettahertz, 10^30 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.quettahertz : Hertz
    /**
    * Returns quettahertz, 10^30 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QHz, 10^30 of hertz, derived SI-Unit for measurement of frequency
*/        
val QHz = 10.0.pow(30) * (1/s)

/**
* quettahertz, 10^30 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val quettahertz = QHz
    

/**
* RHz, 10^27 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.RHz : Hertz
    @JvmName("getRHz_prop")
    /**
    * Returns RHz, 10^27 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(27))

/**
* ronnahertz, 10^27 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.ronnahertz : Hertz
    /**
    * Returns ronnahertz, 10^27 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RHz, 10^27 of hertz, derived SI-Unit for measurement of frequency
*/        
val RHz = 10.0.pow(27) * (1/s)

/**
* ronnahertz, 10^27 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val ronnahertz = RHz
    

/**
* YHz, 10^24 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.YHz : Hertz
    @JvmName("getYHz_prop")
    /**
    * Returns YHz, 10^24 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(24))

/**
* yottahertz, 10^24 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.yottahertz : Hertz
    /**
    * Returns yottahertz, 10^24 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YHz, 10^24 of hertz, derived SI-Unit for measurement of frequency
*/        
val YHz = 10.0.pow(24) * (1/s)

/**
* yottahertz, 10^24 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val yottahertz = YHz
    

/**
* ZHz, 10^21 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.ZHz : Hertz
    @JvmName("getZHz_prop")
    /**
    * Returns ZHz, 10^21 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(21))

/**
* zettahertz, 10^21 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.zettahertz : Hertz
    /**
    * Returns zettahertz, 10^21 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZHz, 10^21 of hertz, derived SI-Unit for measurement of frequency
*/        
val ZHz = 10.0.pow(21) * (1/s)

/**
* zettahertz, 10^21 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val zettahertz = ZHz
    

/**
* EHz, 10^18 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.EHz : Hertz
    @JvmName("getEHz_prop")
    /**
    * Returns EHz, 10^18 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(18))

/**
* exahertz, 10^18 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.exahertz : Hertz
    /**
    * Returns exahertz, 10^18 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EHz, 10^18 of hertz, derived SI-Unit for measurement of frequency
*/        
val EHz = 10.0.pow(18) * (1/s)

/**
* exahertz, 10^18 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val exahertz = EHz
    

/**
* PHz, 10^15 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.PHz : Hertz
    @JvmName("getPHz_prop")
    /**
    * Returns PHz, 10^15 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(15))

/**
* petahertz, 10^15 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.petahertz : Hertz
    /**
    * Returns petahertz, 10^15 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PHz, 10^15 of hertz, derived SI-Unit for measurement of frequency
*/        
val PHz = 10.0.pow(15) * (1/s)

/**
* petahertz, 10^15 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val petahertz = PHz
    

/**
* THz, 10^12 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.THz : Hertz
    @JvmName("getTHz_prop")
    /**
    * Returns THz, 10^12 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(12))

/**
* terahertz, 10^12 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.terahertz : Hertz
    /**
    * Returns terahertz, 10^12 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* THz, 10^12 of hertz, derived SI-Unit for measurement of frequency
*/        
val THz = 10.0.pow(12) * (1/s)

/**
* terahertz, 10^12 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val terahertz = THz
    

/**
* GHz, 10^9 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.GHz : Hertz
    @JvmName("getGHz_prop")
    /**
    * Returns GHz, 10^9 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(9))

/**
* gigahertz, 10^9 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.gigahertz : Hertz
    /**
    * Returns gigahertz, 10^9 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GHz, 10^9 of hertz, derived SI-Unit for measurement of frequency
*/        
val GHz = 10.0.pow(9) * (1/s)

/**
* gigahertz, 10^9 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val gigahertz = GHz
    

/**
* MHz, 10^6 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.MHz : Hertz
    @JvmName("getMHz_prop")
    /**
    * Returns MHz, 10^6 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(6))

/**
* megahertz, 10^6 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.megahertz : Hertz
    /**
    * Returns megahertz, 10^6 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MHz, 10^6 of hertz, derived SI-Unit for measurement of frequency
*/        
val MHz = 10.0.pow(6) * (1/s)

/**
* megahertz, 10^6 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val megahertz = MHz
    

/**
* kHz, 10^3 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.kHz : Hertz
    @JvmName("getkHz_prop")
    /**
    * Returns kHz, 10^3 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(3))

/**
* kilohertz, 10^3 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.kilohertz : Hertz
    /**
    * Returns kilohertz, 10^3 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kHz, 10^3 of hertz, derived SI-Unit for measurement of frequency
*/        
val kHz = 10.0.pow(3) * (1/s)

/**
* kilohertz, 10^3 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val kilohertz = kHz
    

/**
* hHz, 10^2 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.hHz : Hertz
    @JvmName("gethHz_prop")
    /**
    * Returns hHz, 10^2 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(2))

/**
* hectohertz, 10^2 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.hectohertz : Hertz
    /**
    * Returns hectohertz, 10^2 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hHz, 10^2 of hertz, derived SI-Unit for measurement of frequency
*/        
val hHz = 10.0.pow(2) * (1/s)

/**
* hectohertz, 10^2 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val hectohertz = hHz
    

/**
* daHz, 10^1 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.daHz : Hertz
    @JvmName("getdaHz_prop")
    /**
    * Returns daHz, 10^1 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(1))

/**
* decahertz, 10^1 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.decahertz : Hertz
    /**
    * Returns decahertz, 10^1 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daHz, 10^1 of hertz, derived SI-Unit for measurement of frequency
*/        
val daHz = 10.0.pow(1) * (1/s)

/**
* decahertz, 10^1 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val decahertz = daHz
    

/**
* dHz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.dHz : Hertz
    @JvmName("getdHz_prop")
    /**
    * Returns dHz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-1))

/**
* decihertz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.decihertz : Hertz
    /**
    * Returns decihertz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dHz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
*/        
val dHz = 10.0.pow(-1) * (1/s)

/**
* decihertz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val decihertz = dHz
    

/**
* cHz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.cHz : Hertz
    @JvmName("getcHz_prop")
    /**
    * Returns cHz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-2))

/**
* centihertz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.centihertz : Hertz
    /**
    * Returns centihertz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cHz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
*/        
val cHz = 10.0.pow(-2) * (1/s)

/**
* centihertz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val centihertz = cHz
    

/**
* mHz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.mHz : Hertz
    @JvmName("getmHz_prop")
    /**
    * Returns mHz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-3))

/**
* millihertz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.millihertz : Hertz
    /**
    * Returns millihertz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mHz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
*/        
val mHz = 10.0.pow(-3) * (1/s)

/**
* millihertz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val millihertz = mHz
    

/**
* μHz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.μHz : Hertz
    @JvmName("getμHz_prop")
    /**
    * Returns μHz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-6))

/**
* microhertz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.microhertz : Hertz
    /**
    * Returns microhertz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μHz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
*/        
val μHz = 10.0.pow(-6) * (1/s)

/**
* microhertz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val microhertz = μHz
    

/**
* nHz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.nHz : Hertz
    @JvmName("getnHz_prop")
    /**
    * Returns nHz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-9))

/**
* nanohertz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.nanohertz : Hertz
    /**
    * Returns nanohertz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nHz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
*/        
val nHz = 10.0.pow(-9) * (1/s)

/**
* nanohertz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val nanohertz = nHz
    

/**
* pHz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.pHz : Hertz
    @JvmName("getpHz_prop")
    /**
    * Returns pHz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-12))

/**
* picohertz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.picohertz : Hertz
    /**
    * Returns picohertz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pHz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
*/        
val pHz = 10.0.pow(-12) * (1/s)

/**
* picohertz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val picohertz = pHz
    

/**
* fHz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.fHz : Hertz
    @JvmName("getfHz_prop")
    /**
    * Returns fHz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-15))

/**
* femtohertz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.femtohertz : Hertz
    /**
    * Returns femtohertz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fHz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
*/        
val fHz = 10.0.pow(-15) * (1/s)

/**
* femtohertz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val femtohertz = fHz
    

/**
* aHz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.aHz : Hertz
    @JvmName("getaHz_prop")
    /**
    * Returns aHz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-18))

/**
* attohertz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.attohertz : Hertz
    /**
    * Returns attohertz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aHz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
*/        
val aHz = 10.0.pow(-18) * (1/s)

/**
* attohertz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val attohertz = aHz
    

/**
* zHz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.zHz : Hertz
    @JvmName("getzHz_prop")
    /**
    * Returns zHz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-21))

/**
* zeptohertz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.zeptohertz : Hertz
    /**
    * Returns zeptohertz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zHz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
*/        
val zHz = 10.0.pow(-21) * (1/s)

/**
* zeptohertz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val zeptohertz = zHz
    

/**
* yHz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.yHz : Hertz
    @JvmName("getyHz_prop")
    /**
    * Returns yHz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-24))

/**
* yoctohertz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.yoctohertz : Hertz
    /**
    * Returns yoctohertz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yHz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
*/        
val yHz = 10.0.pow(-24) * (1/s)

/**
* yoctohertz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val yoctohertz = yHz
    

/**
* rHz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.rHz : Hertz
    @JvmName("getrHz_prop")
    /**
    * Returns rHz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-27))

/**
* rontohertz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.rontohertz : Hertz
    /**
    * Returns rontohertz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rHz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
*/        
val rHz = 10.0.pow(-27) * (1/s)

/**
* rontohertz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val rontohertz = rHz
    

/**
* qHz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.qHz : Hertz
    @JvmName("getqHz_prop")
    /**
    * Returns qHz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-30))

/**
* quectohertz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.quectohertz : Hertz
    /**
    * Returns quectohertz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = Hertz(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qHz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
*/        
val qHz = 10.0.pow(-30) * (1/s)

/**
* quectohertz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
*/ 

@JsExport
@JvmField
val quectohertz = qHz
    