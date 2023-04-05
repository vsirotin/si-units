
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  1/s

/**
* System International Unit for frequency.
*/
@JsExport
@JvmField
val Hz = unit

/**
* Creates Hertz-Object for current number value. Hertz is a System International Unit for frequency.
*/
val Number.Hz : Expression
   /**
   * Returns Hertz-Object for current number value. Hertz is a System International Unit for frequency.
   */
    get() = this.toDouble() * unit

    
/**
* QHz, 10^30 of hertz, derived SI-Unit for measurement of frequency
*/    
val Number.QHz : Expression
    @JvmName("getQHz_prop")
    /**
    * Returns QHz, 10^30 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettahertz, 10^30 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.quettahertz : Expression
    /**
    * Returns quettahertz, 10^30 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

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
val Number.RHz : Expression
    @JvmName("getRHz_prop")
    /**
    * Returns RHz, 10^27 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnahertz, 10^27 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.ronnahertz : Expression
    /**
    * Returns ronnahertz, 10^27 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

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
val Number.YHz : Expression
    @JvmName("getYHz_prop")
    /**
    * Returns YHz, 10^24 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottahertz, 10^24 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.yottahertz : Expression
    /**
    * Returns yottahertz, 10^24 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

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
val Number.ZHz : Expression
    @JvmName("getZHz_prop")
    /**
    * Returns ZHz, 10^21 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettahertz, 10^21 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.zettahertz : Expression
    /**
    * Returns zettahertz, 10^21 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

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
val Number.EHz : Expression
    @JvmName("getEHz_prop")
    /**
    * Returns EHz, 10^18 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exahertz, 10^18 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.exahertz : Expression
    /**
    * Returns exahertz, 10^18 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

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
val Number.PHz : Expression
    @JvmName("getPHz_prop")
    /**
    * Returns PHz, 10^15 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petahertz, 10^15 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.petahertz : Expression
    /**
    * Returns petahertz, 10^15 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

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
val Number.THz : Expression
    @JvmName("getTHz_prop")
    /**
    * Returns THz, 10^12 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* terahertz, 10^12 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.terahertz : Expression
    /**
    * Returns terahertz, 10^12 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

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
val Number.GHz : Expression
    @JvmName("getGHz_prop")
    /**
    * Returns GHz, 10^9 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigahertz, 10^9 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.gigahertz : Expression
    /**
    * Returns gigahertz, 10^9 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

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
val Number.MHz : Expression
    @JvmName("getMHz_prop")
    /**
    * Returns MHz, 10^6 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megahertz, 10^6 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.megahertz : Expression
    /**
    * Returns megahertz, 10^6 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

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
val Number.kHz : Expression
    @JvmName("getkHz_prop")
    /**
    * Returns kHz, 10^3 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilohertz, 10^3 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.kilohertz : Expression
    /**
    * Returns kilohertz, 10^3 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

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
val Number.hHz : Expression
    @JvmName("gethHz_prop")
    /**
    * Returns hHz, 10^2 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectohertz, 10^2 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.hectohertz : Expression
    /**
    * Returns hectohertz, 10^2 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

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
val Number.daHz : Expression
    @JvmName("getdaHz_prop")
    /**
    * Returns daHz, 10^1 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decahertz, 10^1 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.decahertz : Expression
    /**
    * Returns decahertz, 10^1 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

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
val Number.dHz : Expression
    @JvmName("getdHz_prop")
    /**
    * Returns dHz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decihertz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.decihertz : Expression
    /**
    * Returns decihertz, 10^-1 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

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
val Number.cHz : Expression
    @JvmName("getcHz_prop")
    /**
    * Returns cHz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centihertz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.centihertz : Expression
    /**
    * Returns centihertz, 10^-2 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

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
val Number.mHz : Expression
    @JvmName("getmHz_prop")
    /**
    * Returns mHz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millihertz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.millihertz : Expression
    /**
    * Returns millihertz, 10^-3 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


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
val Number.μHz : Expression
    @JvmName("getμHz_prop")
    /**
    * Returns μHz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microhertz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.microhertz : Expression
    /**
    * Returns microhertz, 10^-6 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

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
val Number.nHz : Expression
    @JvmName("getnHz_prop")
    /**
    * Returns nHz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanohertz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.nanohertz : Expression
    /**
    * Returns nanohertz, 10^-9 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

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
val Number.pHz : Expression
    @JvmName("getpHz_prop")
    /**
    * Returns pHz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picohertz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.picohertz : Expression
    /**
    * Returns picohertz, 10^-12 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


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
val Number.fHz : Expression
    @JvmName("getfHz_prop")
    /**
    * Returns fHz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtohertz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.femtohertz : Expression
    /**
    * Returns femtohertz, 10^-15 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

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
val Number.aHz : Expression
    @JvmName("getaHz_prop")
    /**
    * Returns aHz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attohertz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.attohertz : Expression
    /**
    * Returns attohertz, 10^-18 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

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
val Number.zHz : Expression
    @JvmName("getzHz_prop")
    /**
    * Returns zHz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptohertz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.zeptohertz : Expression
    /**
    * Returns zeptohertz, 10^-21 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


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
val Number.yHz : Expression
    @JvmName("getyHz_prop")
    /**
    * Returns yHz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctohertz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.yoctohertz : Expression
    /**
    * Returns yoctohertz, 10^-24 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


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
val Number.rHz : Expression
    @JvmName("getrHz_prop")
    /**
    * Returns rHz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontohertz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.rontohertz : Expression
    /**
    * Returns rontohertz, 10^-27 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


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
val Number.qHz : Expression
    @JvmName("getqHz_prop")
    /**
    * Returns qHz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectohertz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
*/ 
val Number.quectohertz : Expression
    /**
    * Returns quectohertz, 10^-30 of hertz, derived SI-Unit for measurement of frequency
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


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
    