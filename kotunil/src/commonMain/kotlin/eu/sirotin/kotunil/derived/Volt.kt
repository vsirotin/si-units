
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*m*m*(s `^` -3) * (A `^` -1)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for electric potential, voltage, emf.
*/
class Volt(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for electric potential, voltage, emf.
*/
@JsExport
@JvmField
val V = Volt(1.0)

/**
* Creates a Volt object for the current number value. Volt is a System International Unit for electric potential, voltage, emf.
*/
val Number.V : Volt
   /**
   * Returns a Volt object for the current number value. Volt is a System International Unit for electric potential, voltage, emf.
   */
    get() = Volt(this.toDouble())

    
/**
* QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.QV : Volt
    @JvmName("getQV_prop")
    /**
    * Returns QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(30))

/**
* quettavolt, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.quettavolt : Volt
    /**
    * Returns quettavolt, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val QV = 10.0.pow(30) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* quettavolt, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val quettavolt = QV
    

/**
* RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.RV : Volt
    @JvmName("getRV_prop")
    /**
    * Returns RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(27))

/**
* ronnavolt, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.ronnavolt : Volt
    /**
    * Returns ronnavolt, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val RV = 10.0.pow(27) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* ronnavolt, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val ronnavolt = RV
    

/**
* YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.YV : Volt
    @JvmName("getYV_prop")
    /**
    * Returns YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(24))

/**
* yottavolt, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.yottavolt : Volt
    /**
    * Returns yottavolt, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val YV = 10.0.pow(24) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* yottavolt, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val yottavolt = YV
    

/**
* ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.ZV : Volt
    @JvmName("getZV_prop")
    /**
    * Returns ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(21))

/**
* zettavolt, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.zettavolt : Volt
    /**
    * Returns zettavolt, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val ZV = 10.0.pow(21) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* zettavolt, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val zettavolt = ZV
    

/**
* EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.EV : Volt
    @JvmName("getEV_prop")
    /**
    * Returns EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(18))

/**
* exavolt, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.exavolt : Volt
    /**
    * Returns exavolt, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val EV = 10.0.pow(18) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* exavolt, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val exavolt = EV
    

/**
* PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.PV : Volt
    @JvmName("getPV_prop")
    /**
    * Returns PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(15))

/**
* petavolt, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.petavolt : Volt
    /**
    * Returns petavolt, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val PV = 10.0.pow(15) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* petavolt, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val petavolt = PV
    

/**
* TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.TV : Volt
    @JvmName("getTV_prop")
    /**
    * Returns TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(12))

/**
* teravolt, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.teravolt : Volt
    /**
    * Returns teravolt, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val TV = 10.0.pow(12) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* teravolt, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val teravolt = TV
    

/**
* GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.GV : Volt
    @JvmName("getGV_prop")
    /**
    * Returns GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(9))

/**
* gigavolt, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.gigavolt : Volt
    /**
    * Returns gigavolt, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val GV = 10.0.pow(9) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* gigavolt, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val gigavolt = GV
    

/**
* MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.MV : Volt
    @JvmName("getMV_prop")
    /**
    * Returns MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(6))

/**
* megavolt, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.megavolt : Volt
    /**
    * Returns megavolt, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val MV = 10.0.pow(6) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* megavolt, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val megavolt = MV
    

/**
* kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.kV : Volt
    @JvmName("getkV_prop")
    /**
    * Returns kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(3))

/**
* kilovolt, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.kilovolt : Volt
    /**
    * Returns kilovolt, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val kV = 10.0.pow(3) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* kilovolt, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val kilovolt = kV
    

/**
* hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.hV : Volt
    @JvmName("gethV_prop")
    /**
    * Returns hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(2))

/**
* hectovolt, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.hectovolt : Volt
    /**
    * Returns hectovolt, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val hV = 10.0.pow(2) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* hectovolt, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val hectovolt = hV
    

/**
* daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.daV : Volt
    @JvmName("getdaV_prop")
    /**
    * Returns daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(1))

/**
* decavolt, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.decavolt : Volt
    /**
    * Returns decavolt, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val daV = 10.0.pow(1) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* decavolt, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val decavolt = daV
    

/**
* dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.dV : Volt
    @JvmName("getdV_prop")
    /**
    * Returns dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-1))

/**
* decivolt, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.decivolt : Volt
    /**
    * Returns decivolt, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val dV = 10.0.pow(-1) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* decivolt, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val decivolt = dV
    

/**
* cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.cV : Volt
    @JvmName("getcV_prop")
    /**
    * Returns cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-2))

/**
* centivolt, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.centivolt : Volt
    /**
    * Returns centivolt, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val cV = 10.0.pow(-2) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* centivolt, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val centivolt = cV
    

/**
* mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.mV : Volt
    @JvmName("getmV_prop")
    /**
    * Returns mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-3))

/**
* millivolt, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.millivolt : Volt
    /**
    * Returns millivolt, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val mV = 10.0.pow(-3) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* millivolt, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val millivolt = mV
    

/**
* μV, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.μV : Volt
    @JvmName("getμV_prop")
    /**
    * Returns μV, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-6))

/**
* microvolt, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.microvolt : Volt
    /**
    * Returns microvolt, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μV, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val μV = 10.0.pow(-6) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* microvolt, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val microvolt = μV
    

/**
* nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.nV : Volt
    @JvmName("getnV_prop")
    /**
    * Returns nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-9))

/**
* nanovolt, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.nanovolt : Volt
    /**
    * Returns nanovolt, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val nV = 10.0.pow(-9) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* nanovolt, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val nanovolt = nV
    

/**
* pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.pV : Volt
    @JvmName("getpV_prop")
    /**
    * Returns pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-12))

/**
* picovolt, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.picovolt : Volt
    /**
    * Returns picovolt, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val pV = 10.0.pow(-12) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* picovolt, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val picovolt = pV
    

/**
* fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.fV : Volt
    @JvmName("getfV_prop")
    /**
    * Returns fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-15))

/**
* femtovolt, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.femtovolt : Volt
    /**
    * Returns femtovolt, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val fV = 10.0.pow(-15) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* femtovolt, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val femtovolt = fV
    

/**
* aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.aV : Volt
    @JvmName("getaV_prop")
    /**
    * Returns aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-18))

/**
* attovolt, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.attovolt : Volt
    /**
    * Returns attovolt, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val aV = 10.0.pow(-18) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* attovolt, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val attovolt = aV
    

/**
* zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.zV : Volt
    @JvmName("getzV_prop")
    /**
    * Returns zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-21))

/**
* zeptovolt, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.zeptovolt : Volt
    /**
    * Returns zeptovolt, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val zV = 10.0.pow(-21) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* zeptovolt, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val zeptovolt = zV
    

/**
* yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.yV : Volt
    @JvmName("getyV_prop")
    /**
    * Returns yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-24))

/**
* yoctovolt, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.yoctovolt : Volt
    /**
    * Returns yoctovolt, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val yV = 10.0.pow(-24) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* yoctovolt, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val yoctovolt = yV
    

/**
* rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.rV : Volt
    @JvmName("getrV_prop")
    /**
    * Returns rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-27))

/**
* rontovolt, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.rontovolt : Volt
    /**
    * Returns rontovolt, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val rV = 10.0.pow(-27) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* rontovolt, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val rontovolt = rV
    

/**
* qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.qV : Volt
    @JvmName("getqV_prop")
    /**
    * Returns qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-30))

/**
* quectovolt, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.quectovolt : Volt
    /**
    * Returns quectovolt, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = Volt(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val qV = 10.0.pow(-30) * (kg*m*m*(s `^` -3) * (A `^` -1))

/**
* quectovolt, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val quectovolt = qV
    