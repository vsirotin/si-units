
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.math.pow

private val unit =  kg*m2*(s `^` -3) * (A `^` -1)

/**
* System International Unit for electric potential, voltage, emf.
*/
val V = unit

/**
* Creates Volt-Object for current number value. Volt is a System International Unit for electric potential, voltage, emf.
*/
val Number.V : Expression
   /**
   * Returns Volt-Object for current number value. Volt is a System International Unit for electric potential, voltage, emf.
   */
    get() = this.toDouble() * unit

    
/**
* QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.QV : Expression
    @JvmName("getQV_prop")
    /**
    * Returns QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettavolt, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.quettavolt : Expression
    /**
    * Returns quettavolt, 10^30 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit


@JvmField()  
/**
* QV, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val QV = 10.0.pow(30) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* quettavolt, 10^30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val quettavolt = QV
    

/**
* RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.RV : Expression
    @JvmName("getRV_prop")
    /**
    * Returns RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnavolt, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.ronnavolt : Expression
    /**
    * Returns ronnavolt, 10^27 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit


@JvmField()  
/**
* RV, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val RV = 10.0.pow(27) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* ronnavolt, 10^27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val ronnavolt = RV
    

/**
* YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.YV : Expression
    @JvmName("getYV_prop")
    /**
    * Returns YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottavolt, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.yottavolt : Expression
    /**
    * Returns yottavolt, 10^24 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit


@JvmField()  
/**
* YV, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val YV = 10.0.pow(24) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* yottavolt, 10^24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val yottavolt = YV
    

/**
* ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.ZV : Expression
    @JvmName("getZV_prop")
    /**
    * Returns ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettavolt, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.zettavolt : Expression
    /**
    * Returns zettavolt, 10^21 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit


@JvmField()  
/**
* ZV, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val ZV = 10.0.pow(21) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* zettavolt, 10^21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val zettavolt = ZV
    

/**
* EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.EV : Expression
    @JvmName("getEV_prop")
    /**
    * Returns EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exavolt, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.exavolt : Expression
    /**
    * Returns exavolt, 10^18 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit


@JvmField()  
/**
* EV, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val EV = 10.0.pow(18) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* exavolt, 10^18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val exavolt = EV
    

/**
* PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.PV : Expression
    @JvmName("getPV_prop")
    /**
    * Returns PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petavolt, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.petavolt : Expression
    /**
    * Returns petavolt, 10^15 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit


@JvmField()  
/**
* PV, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val PV = 10.0.pow(15) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* petavolt, 10^15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val petavolt = PV
    

/**
* TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.TV : Expression
    @JvmName("getTV_prop")
    /**
    * Returns TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* teravolt, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.teravolt : Expression
    /**
    * Returns teravolt, 10^12 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit


@JvmField()  
/**
* TV, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val TV = 10.0.pow(12) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* teravolt, 10^12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val teravolt = TV
    

/**
* GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.GV : Expression
    @JvmName("getGV_prop")
    /**
    * Returns GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigavolt, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.gigavolt : Expression
    /**
    * Returns gigavolt, 10^9 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit


@JvmField()  
/**
* GV, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val GV = 10.0.pow(9) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* gigavolt, 10^9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val gigavolt = GV
    

/**
* MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.MV : Expression
    @JvmName("getMV_prop")
    /**
    * Returns MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megavolt, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.megavolt : Expression
    /**
    * Returns megavolt, 10^6 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit


@JvmField()  
/**
* MV, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val MV = 10.0.pow(6) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* megavolt, 10^6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val megavolt = MV
    

/**
* kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.kV : Expression
    @JvmName("getkV_prop")
    /**
    * Returns kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilovolt, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.kilovolt : Expression
    /**
    * Returns kilovolt, 10^3 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit


@JvmField()  
/**
* kV, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val kV = 10.0.pow(3) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* kilovolt, 10^3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val kilovolt = kV
    

/**
* hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.hV : Expression
    @JvmName("gethV_prop")
    /**
    * Returns hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectovolt, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.hectovolt : Expression
    /**
    * Returns hectovolt, 10^2 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit


@JvmField()  
/**
* hV, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val hV = 10.0.pow(2) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* hectovolt, 10^2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val hectovolt = hV
    

/**
* daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.daV : Expression
    @JvmName("getdaV_prop")
    /**
    * Returns daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decavolt, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.decavolt : Expression
    /**
    * Returns decavolt, 10^1 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit


@JvmField()  
/**
* daV, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val daV = 10.0.pow(1) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* decavolt, 10^1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val decavolt = daV
    

/**
* dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.dV : Expression
    @JvmName("getdV_prop")
    /**
    * Returns dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decivolt, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.decivolt : Expression
    /**
    * Returns decivolt, 10^-1 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit


@JvmField()  
/**
* dV, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val dV = 10.0.pow(-1) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* decivolt, 10^-1 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val decivolt = dV
    

/**
* cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.cV : Expression
    @JvmName("getcV_prop")
    /**
    * Returns cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centivolt, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.centivolt : Expression
    /**
    * Returns centivolt, 10^-2 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit


@JvmField()  
/**
* cV, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val cV = 10.0.pow(-2) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* centivolt, 10^-2 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val centivolt = cV
    

/**
* mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.mV : Expression
    @JvmName("getmV_prop")
    /**
    * Returns mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millivolt, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.millivolt : Expression
    /**
    * Returns millivolt, 10^-3 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField()  
/**
* mV, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val mV = 10.0.pow(-3) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* millivolt, 10^-3 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val millivolt = mV
    

/**
* ??V, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.??V : Expression
    @JvmName("get??V_prop")
    /**
    * Returns ??V, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microvolt, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.microvolt : Expression
    /**
    * Returns microvolt, 10^-6 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit


@JvmField()  
/**
* ??V, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val ??V = 10.0.pow(-6) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* microvolt, 10^-6 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val microvolt = ??V
    

/**
* nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.nV : Expression
    @JvmName("getnV_prop")
    /**
    * Returns nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanovolt, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.nanovolt : Expression
    /**
    * Returns nanovolt, 10^-9 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit


@JvmField()  
/**
* nV, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val nV = 10.0.pow(-9) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* nanovolt, 10^-9 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val nanovolt = nV
    

/**
* pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.pV : Expression
    @JvmName("getpV_prop")
    /**
    * Returns pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picovolt, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.picovolt : Expression
    /**
    * Returns picovolt, 10^-12 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField()  
/**
* pV, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val pV = 10.0.pow(-12) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* picovolt, 10^-12 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val picovolt = pV
    

/**
* fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.fV : Expression
    @JvmName("getfV_prop")
    /**
    * Returns fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtovolt, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.femtovolt : Expression
    /**
    * Returns femtovolt, 10^-15 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit


@JvmField()  
/**
* fV, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val fV = 10.0.pow(-15) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* femtovolt, 10^-15 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val femtovolt = fV
    

/**
* aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.aV : Expression
    @JvmName("getaV_prop")
    /**
    * Returns aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attovolt, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.attovolt : Expression
    /**
    * Returns attovolt, 10^-18 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit


@JvmField()  
/**
* aV, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val aV = 10.0.pow(-18) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* attovolt, 10^-18 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val attovolt = aV
    

/**
* zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.zV : Expression
    @JvmName("getzV_prop")
    /**
    * Returns zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptovolt, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.zeptovolt : Expression
    /**
    * Returns zeptovolt, 10^-21 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField()  
/**
* zV, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val zV = 10.0.pow(-21) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* zeptovolt, 10^-21 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val zeptovolt = zV
    

/**
* yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.yV : Expression
    @JvmName("getyV_prop")
    /**
    * Returns yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctovolt, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.yoctovolt : Expression
    /**
    * Returns yoctovolt, 10^-24 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField()  
/**
* yV, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val yV = 10.0.pow(-24) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* yoctovolt, 10^-24 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val yoctovolt = yV
    

/**
* rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.rV : Expression
    @JvmName("getrV_prop")
    /**
    * Returns rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontovolt, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.rontovolt : Expression
    /**
    * Returns rontovolt, 10^-27 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField()  
/**
* rV, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val rV = 10.0.pow(-27) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* rontovolt, 10^-27 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val rontovolt = rV
    

/**
* qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/    
val Number.qV : Expression
    @JvmName("getqV_prop")
    /**
    * Returns qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectovolt, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val Number.quectovolt : Expression
    /**
    * Returns quectovolt, 10^-30 of of volt, derived SI-Unit for measurement of electric potential, voltage, emf
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField()  
/**
* qV, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/        
val qV = 10.0.pow(-30) * (kg*m2*(s `^` -3) * (A `^` -1))

/**
* quectovolt, 10^-30 of volt, derived SI-Unit for measurement of electric potential, voltage, emf
*/ 
val quectovolt = qV
    