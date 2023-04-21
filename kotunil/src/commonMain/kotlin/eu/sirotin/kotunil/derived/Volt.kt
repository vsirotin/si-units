
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*m2*(s `^` -3) * (A `^` -1)

@JsExport
/**
* System International Unit for electric potential, voltage, emf.
*/
class Volt(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for electric potential, voltage, emf.
*/
@JsExport
@JvmField
val V = formula

/**
* Creates Volt-Object for current number value. Volt is a System International Unit for electric potential, voltage, emf.
*/
val Number.V : Expression
   /**
   * Returns Volt-Object for current number value. Volt is a System International Unit for electric potential, voltage, emf.
   */
    get() = this.toDouble() * formula

    
/**
* QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.QV : Expression
    @JvmName("getQV_prop")
    /**
    * Returns QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettavolt, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.quettavolt : Expression
    /**
    * Returns quettavolt, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

@JsExport
@JvmField
/**
* QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val QV = 10.0.pow(30) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* quettavolt, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val quettavolt = QV
    

/**
* RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.RV : Expression
    @JvmName("getRV_prop")
    /**
    * Returns RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnavolt, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.ronnavolt : Expression
    /**
    * Returns ronnavolt, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

@JsExport
@JvmField
/**
* RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val RV = 10.0.pow(27) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* ronnavolt, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val ronnavolt = RV
    

/**
* YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.YV : Expression
    @JvmName("getYV_prop")
    /**
    * Returns YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottavolt, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.yottavolt : Expression
    /**
    * Returns yottavolt, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

@JsExport
@JvmField
/**
* YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val YV = 10.0.pow(24) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* yottavolt, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val yottavolt = YV
    

/**
* ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.ZV : Expression
    @JvmName("getZV_prop")
    /**
    * Returns ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettavolt, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.zettavolt : Expression
    /**
    * Returns zettavolt, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

@JsExport
@JvmField
/**
* ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val ZV = 10.0.pow(21) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* zettavolt, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val zettavolt = ZV
    

/**
* EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.EV : Expression
    @JvmName("getEV_prop")
    /**
    * Returns EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exavolt, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.exavolt : Expression
    /**
    * Returns exavolt, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

@JsExport
@JvmField
/**
* EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val EV = 10.0.pow(18) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* exavolt, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val exavolt = EV
    

/**
* PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.PV : Expression
    @JvmName("getPV_prop")
    /**
    * Returns PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petavolt, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.petavolt : Expression
    /**
    * Returns petavolt, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

@JsExport
@JvmField
/**
* PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val PV = 10.0.pow(15) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* petavolt, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val petavolt = PV
    

/**
* TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.TV : Expression
    @JvmName("getTV_prop")
    /**
    * Returns TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* teravolt, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.teravolt : Expression
    /**
    * Returns teravolt, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

@JsExport
@JvmField
/**
* TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val TV = 10.0.pow(12) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* teravolt, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val teravolt = TV
    

/**
* GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.GV : Expression
    @JvmName("getGV_prop")
    /**
    * Returns GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigavolt, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.gigavolt : Expression
    /**
    * Returns gigavolt, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

@JsExport
@JvmField
/**
* GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val GV = 10.0.pow(9) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* gigavolt, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val gigavolt = GV
    

/**
* MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.MV : Expression
    @JvmName("getMV_prop")
    /**
    * Returns MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megavolt, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.megavolt : Expression
    /**
    * Returns megavolt, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

@JsExport
@JvmField
/**
* MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val MV = 10.0.pow(6) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* megavolt, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val megavolt = MV
    

/**
* kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.kV : Expression
    @JvmName("getkV_prop")
    /**
    * Returns kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kilovolt, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.kilovolt : Expression
    /**
    * Returns kilovolt, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

@JsExport
@JvmField
/**
* kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val kV = 10.0.pow(3) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* kilovolt, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val kilovolt = kV
    

/**
* hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.hV : Expression
    @JvmName("gethV_prop")
    /**
    * Returns hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectovolt, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.hectovolt : Expression
    /**
    * Returns hectovolt, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

@JsExport
@JvmField
/**
* hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val hV = 10.0.pow(2) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* hectovolt, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val hectovolt = hV
    

/**
* daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.daV : Expression
    @JvmName("getdaV_prop")
    /**
    * Returns daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decavolt, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.decavolt : Expression
    /**
    * Returns decavolt, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

@JsExport
@JvmField
/**
* daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val daV = 10.0.pow(1) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* decavolt, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val decavolt = daV
    

/**
* dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.dV : Expression
    @JvmName("getdV_prop")
    /**
    * Returns dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* decivolt, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.decivolt : Expression
    /**
    * Returns decivolt, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

@JsExport
@JvmField
/**
* dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val dV = 10.0.pow(-1) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* decivolt, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val decivolt = dV
    

/**
* cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.cV : Expression
    @JvmName("getcV_prop")
    /**
    * Returns cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centivolt, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.centivolt : Expression
    /**
    * Returns centivolt, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

@JsExport
@JvmField
/**
* cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val cV = 10.0.pow(-2) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* centivolt, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val centivolt = cV
    

/**
* mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.mV : Expression
    @JvmName("getmV_prop")
    /**
    * Returns mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* millivolt, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.millivolt : Expression
    /**
    * Returns millivolt, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


@JvmField
/**
* mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val mV = 10.0.pow(-3) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* millivolt, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val millivolt = mV
    

/**
* μV, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.μV : Expression
    @JvmName("getμV_prop")
    /**
    * Returns μV, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* microvolt, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.microvolt : Expression
    /**
    * Returns microvolt, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

@JsExport
@JvmField
/**
* μV, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val μV = 10.0.pow(-6) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* microvolt, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val microvolt = μV
    

/**
* nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.nV : Expression
    @JvmName("getnV_prop")
    /**
    * Returns nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanovolt, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.nanovolt : Expression
    /**
    * Returns nanovolt, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

@JsExport
@JvmField
/**
* nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val nV = 10.0.pow(-9) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* nanovolt, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val nanovolt = nV
    

/**
* pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.pV : Expression
    @JvmName("getpV_prop")
    /**
    * Returns pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picovolt, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.picovolt : Expression
    /**
    * Returns picovolt, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


@JvmField
/**
* pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val pV = 10.0.pow(-12) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* picovolt, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val picovolt = pV
    

/**
* fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.fV : Expression
    @JvmName("getfV_prop")
    /**
    * Returns fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtovolt, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.femtovolt : Expression
    /**
    * Returns femtovolt, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

@JsExport
@JvmField
/**
* fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val fV = 10.0.pow(-15) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* femtovolt, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val femtovolt = fV
    

/**
* aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.aV : Expression
    @JvmName("getaV_prop")
    /**
    * Returns aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attovolt, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.attovolt : Expression
    /**
    * Returns attovolt, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

@JsExport
@JvmField
/**
* aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val aV = 10.0.pow(-18) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* attovolt, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val attovolt = aV
    

/**
* zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.zV : Expression
    @JvmName("getzV_prop")
    /**
    * Returns zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptovolt, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.zeptovolt : Expression
    /**
    * Returns zeptovolt, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


@JvmField
/**
* zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val zV = 10.0.pow(-21) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* zeptovolt, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val zeptovolt = zV
    

/**
* yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.yV : Expression
    @JvmName("getyV_prop")
    /**
    * Returns yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctovolt, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.yoctovolt : Expression
    /**
    * Returns yoctovolt, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


@JvmField
/**
* yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val yV = 10.0.pow(-24) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* yoctovolt, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val yoctovolt = yV
    

/**
* rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.rV : Expression
    @JvmName("getrV_prop")
    /**
    * Returns rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontovolt, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.rontovolt : Expression
    /**
    * Returns rontovolt, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


@JvmField
/**
* rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val rV = 10.0.pow(-27) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* rontovolt, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val rontovolt = rV
    

/**
* qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.qV : Expression
    @JvmName("getqV_prop")
    /**
    * Returns qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectovolt, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.quectovolt : Expression
    /**
    * Returns quectovolt, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


@JvmField
/**
* qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val qV = 10.0.pow(-30) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* quectovolt, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 

@JsExport
@JvmField
val quectovolt = qV
    