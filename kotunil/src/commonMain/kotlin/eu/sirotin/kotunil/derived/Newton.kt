
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*m/(s `^` 2)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for force, weight.
*/
class Newton(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for force, weight.
*/
@JsExport
@JvmField
val N = Newton(1.0)

/**
* Creates Newton-Object for current number value. Newton is a System International Unit for force, weight.
*/
val Number.N : Newton
   /**
   * Returns Newton-Object for current number value. Newton is a System International Unit for force, weight.
   */
    get() = Newton(this.toDouble())

    
/**
* QN, 10^30 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.QN : Newton
    @JvmName("getQN_prop")
    /**
    * Returns QN, 10^30 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(30))

/**
* quettanewton, 10^30 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.quettanewton : Newton
    /**
    * Returns quettanewton, 10^30 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QN, 10^30 of newton, derived SI-Unit for measurement of force, weight
*/        
val QN = 10.0.pow(30) * (kg*m/(s `^` 2))

/**
* quettanewton, 10^30 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val quettanewton = QN
    

/**
* RN, 10^27 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.RN : Newton
    @JvmName("getRN_prop")
    /**
    * Returns RN, 10^27 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(27))

/**
* ronnanewton, 10^27 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.ronnanewton : Newton
    /**
    * Returns ronnanewton, 10^27 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RN, 10^27 of newton, derived SI-Unit for measurement of force, weight
*/        
val RN = 10.0.pow(27) * (kg*m/(s `^` 2))

/**
* ronnanewton, 10^27 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val ronnanewton = RN
    

/**
* YN, 10^24 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.YN : Newton
    @JvmName("getYN_prop")
    /**
    * Returns YN, 10^24 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(24))

/**
* yottanewton, 10^24 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.yottanewton : Newton
    /**
    * Returns yottanewton, 10^24 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YN, 10^24 of newton, derived SI-Unit for measurement of force, weight
*/        
val YN = 10.0.pow(24) * (kg*m/(s `^` 2))

/**
* yottanewton, 10^24 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val yottanewton = YN
    

/**
* ZN, 10^21 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.ZN : Newton
    @JvmName("getZN_prop")
    /**
    * Returns ZN, 10^21 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(21))

/**
* zettanewton, 10^21 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.zettanewton : Newton
    /**
    * Returns zettanewton, 10^21 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZN, 10^21 of newton, derived SI-Unit for measurement of force, weight
*/        
val ZN = 10.0.pow(21) * (kg*m/(s `^` 2))

/**
* zettanewton, 10^21 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val zettanewton = ZN
    

/**
* EN, 10^18 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.EN : Newton
    @JvmName("getEN_prop")
    /**
    * Returns EN, 10^18 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(18))

/**
* exanewton, 10^18 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.exanewton : Newton
    /**
    * Returns exanewton, 10^18 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EN, 10^18 of newton, derived SI-Unit for measurement of force, weight
*/        
val EN = 10.0.pow(18) * (kg*m/(s `^` 2))

/**
* exanewton, 10^18 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val exanewton = EN
    

/**
* PN, 10^15 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.PN : Newton
    @JvmName("getPN_prop")
    /**
    * Returns PN, 10^15 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(15))

/**
* petanewton, 10^15 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.petanewton : Newton
    /**
    * Returns petanewton, 10^15 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PN, 10^15 of newton, derived SI-Unit for measurement of force, weight
*/        
val PN = 10.0.pow(15) * (kg*m/(s `^` 2))

/**
* petanewton, 10^15 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val petanewton = PN
    

/**
* TN, 10^12 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.TN : Newton
    @JvmName("getTN_prop")
    /**
    * Returns TN, 10^12 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(12))

/**
* teranewton, 10^12 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.teranewton : Newton
    /**
    * Returns teranewton, 10^12 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TN, 10^12 of newton, derived SI-Unit for measurement of force, weight
*/        
val TN = 10.0.pow(12) * (kg*m/(s `^` 2))

/**
* teranewton, 10^12 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val teranewton = TN
    

/**
* GN, 10^9 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.GN : Newton
    @JvmName("getGN_prop")
    /**
    * Returns GN, 10^9 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(9))

/**
* giganewton, 10^9 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.giganewton : Newton
    /**
    * Returns giganewton, 10^9 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GN, 10^9 of newton, derived SI-Unit for measurement of force, weight
*/        
val GN = 10.0.pow(9) * (kg*m/(s `^` 2))

/**
* giganewton, 10^9 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val giganewton = GN
    

/**
* MN, 10^6 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.MN : Newton
    @JvmName("getMN_prop")
    /**
    * Returns MN, 10^6 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(6))

/**
* meganewton, 10^6 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.meganewton : Newton
    /**
    * Returns meganewton, 10^6 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MN, 10^6 of newton, derived SI-Unit for measurement of force, weight
*/        
val MN = 10.0.pow(6) * (kg*m/(s `^` 2))

/**
* meganewton, 10^6 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val meganewton = MN
    

/**
* kN, 10^3 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.kN : Newton
    @JvmName("getkN_prop")
    /**
    * Returns kN, 10^3 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(3))

/**
* kilonewton, 10^3 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.kilonewton : Newton
    /**
    * Returns kilonewton, 10^3 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kN, 10^3 of newton, derived SI-Unit for measurement of force, weight
*/        
val kN = 10.0.pow(3) * (kg*m/(s `^` 2))

/**
* kilonewton, 10^3 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val kilonewton = kN
    

/**
* hN, 10^2 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.hN : Newton
    @JvmName("gethN_prop")
    /**
    * Returns hN, 10^2 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(2))

/**
* hectonewton, 10^2 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.hectonewton : Newton
    /**
    * Returns hectonewton, 10^2 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hN, 10^2 of newton, derived SI-Unit for measurement of force, weight
*/        
val hN = 10.0.pow(2) * (kg*m/(s `^` 2))

/**
* hectonewton, 10^2 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val hectonewton = hN
    

/**
* daN, 10^1 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.daN : Newton
    @JvmName("getdaN_prop")
    /**
    * Returns daN, 10^1 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(1))

/**
* decanewton, 10^1 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.decanewton : Newton
    /**
    * Returns decanewton, 10^1 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daN, 10^1 of newton, derived SI-Unit for measurement of force, weight
*/        
val daN = 10.0.pow(1) * (kg*m/(s `^` 2))

/**
* decanewton, 10^1 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val decanewton = daN
    

/**
* dN, 10^-1 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.dN : Newton
    @JvmName("getdN_prop")
    /**
    * Returns dN, 10^-1 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-1))

/**
* decinewton, 10^-1 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.decinewton : Newton
    /**
    * Returns decinewton, 10^-1 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dN, 10^-1 of newton, derived SI-Unit for measurement of force, weight
*/        
val dN = 10.0.pow(-1) * (kg*m/(s `^` 2))

/**
* decinewton, 10^-1 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val decinewton = dN
    

/**
* cN, 10^-2 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.cN : Newton
    @JvmName("getcN_prop")
    /**
    * Returns cN, 10^-2 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-2))

/**
* centinewton, 10^-2 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.centinewton : Newton
    /**
    * Returns centinewton, 10^-2 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cN, 10^-2 of newton, derived SI-Unit for measurement of force, weight
*/        
val cN = 10.0.pow(-2) * (kg*m/(s `^` 2))

/**
* centinewton, 10^-2 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val centinewton = cN
    

/**
* mN, 10^-3 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.mN : Newton
    @JvmName("getmN_prop")
    /**
    * Returns mN, 10^-3 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-3))

/**
* millinewton, 10^-3 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.millinewton : Newton
    /**
    * Returns millinewton, 10^-3 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mN, 10^-3 of newton, derived SI-Unit for measurement of force, weight
*/        
val mN = 10.0.pow(-3) * (kg*m/(s `^` 2))

/**
* millinewton, 10^-3 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val millinewton = mN
    

/**
* μN, 10^-6 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.μN : Newton
    @JvmName("getμN_prop")
    /**
    * Returns μN, 10^-6 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-6))

/**
* micronewton, 10^-6 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.micronewton : Newton
    /**
    * Returns micronewton, 10^-6 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μN, 10^-6 of newton, derived SI-Unit for measurement of force, weight
*/        
val μN = 10.0.pow(-6) * (kg*m/(s `^` 2))

/**
* micronewton, 10^-6 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val micronewton = μN
    

/**
* nN, 10^-9 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.nN : Newton
    @JvmName("getnN_prop")
    /**
    * Returns nN, 10^-9 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-9))

/**
* nanonewton, 10^-9 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.nanonewton : Newton
    /**
    * Returns nanonewton, 10^-9 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nN, 10^-9 of newton, derived SI-Unit for measurement of force, weight
*/        
val nN = 10.0.pow(-9) * (kg*m/(s `^` 2))

/**
* nanonewton, 10^-9 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val nanonewton = nN
    

/**
* pN, 10^-12 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.pN : Newton
    @JvmName("getpN_prop")
    /**
    * Returns pN, 10^-12 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-12))

/**
* piconewton, 10^-12 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.piconewton : Newton
    /**
    * Returns piconewton, 10^-12 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pN, 10^-12 of newton, derived SI-Unit for measurement of force, weight
*/        
val pN = 10.0.pow(-12) * (kg*m/(s `^` 2))

/**
* piconewton, 10^-12 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val piconewton = pN
    

/**
* fN, 10^-15 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.fN : Newton
    @JvmName("getfN_prop")
    /**
    * Returns fN, 10^-15 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-15))

/**
* femtonewton, 10^-15 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.femtonewton : Newton
    /**
    * Returns femtonewton, 10^-15 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fN, 10^-15 of newton, derived SI-Unit for measurement of force, weight
*/        
val fN = 10.0.pow(-15) * (kg*m/(s `^` 2))

/**
* femtonewton, 10^-15 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val femtonewton = fN
    

/**
* aN, 10^-18 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.aN : Newton
    @JvmName("getaN_prop")
    /**
    * Returns aN, 10^-18 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-18))

/**
* attonewton, 10^-18 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.attonewton : Newton
    /**
    * Returns attonewton, 10^-18 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aN, 10^-18 of newton, derived SI-Unit for measurement of force, weight
*/        
val aN = 10.0.pow(-18) * (kg*m/(s `^` 2))

/**
* attonewton, 10^-18 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val attonewton = aN
    

/**
* zN, 10^-21 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.zN : Newton
    @JvmName("getzN_prop")
    /**
    * Returns zN, 10^-21 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-21))

/**
* zeptonewton, 10^-21 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.zeptonewton : Newton
    /**
    * Returns zeptonewton, 10^-21 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zN, 10^-21 of newton, derived SI-Unit for measurement of force, weight
*/        
val zN = 10.0.pow(-21) * (kg*m/(s `^` 2))

/**
* zeptonewton, 10^-21 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val zeptonewton = zN
    

/**
* yN, 10^-24 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.yN : Newton
    @JvmName("getyN_prop")
    /**
    * Returns yN, 10^-24 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-24))

/**
* yoctonewton, 10^-24 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.yoctonewton : Newton
    /**
    * Returns yoctonewton, 10^-24 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yN, 10^-24 of newton, derived SI-Unit for measurement of force, weight
*/        
val yN = 10.0.pow(-24) * (kg*m/(s `^` 2))

/**
* yoctonewton, 10^-24 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val yoctonewton = yN
    

/**
* rN, 10^-27 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.rN : Newton
    @JvmName("getrN_prop")
    /**
    * Returns rN, 10^-27 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-27))

/**
* rontonewton, 10^-27 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.rontonewton : Newton
    /**
    * Returns rontonewton, 10^-27 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rN, 10^-27 of newton, derived SI-Unit for measurement of force, weight
*/        
val rN = 10.0.pow(-27) * (kg*m/(s `^` 2))

/**
* rontonewton, 10^-27 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val rontonewton = rN
    

/**
* qN, 10^-30 of newton, derived SI-Unit for measurement of force, weight
*/    
val Number.qN : Newton
    @JvmName("getqN_prop")
    /**
    * Returns qN, 10^-30 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-30))

/**
* quectonewton, 10^-30 of newton, derived SI-Unit for measurement of force, weight
*/ 
val Number.quectonewton : Newton
    /**
    * Returns quectonewton, 10^-30 of newton, derived SI-Unit for measurement of force, weight
    */  
    get() = Newton(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qN, 10^-30 of newton, derived SI-Unit for measurement of force, weight
*/        
val qN = 10.0.pow(-30) * (kg*m/(s `^` 2))

/**
* quectonewton, 10^-30 of newton, derived SI-Unit for measurement of force, weight
*/ 

@JsExport
@JvmField
val quectonewton = qN
    