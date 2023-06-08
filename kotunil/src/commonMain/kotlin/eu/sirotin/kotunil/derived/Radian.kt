
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  m/m

@JsExport
/**
* System International Unit for plane angle.
*/
class Radian(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for plane angle.
*/
@JsExport
@JvmField
val rad = Radian(1.0)

/**
* Creates Radian-Object for current number value. Radian is a System International Unit for plane angle.
*/
val Number.rad : Radian
   /**
   * Returns Radian-Object for current number value. Radian is a System International Unit for plane angle.
   */
    get() = Radian(this.toDouble())

    
/**
* Qrad, 10^30 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Qrad : Radian
    @JvmName("getQrad_prop")
    /**
    * Returns Qrad, 10^30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(30))

/**
* quettaradian, 10^30 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.quettaradian : Radian
    /**
    * Returns quettaradian, 10^30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* Qrad, 10^30 of radian, derived SI-Unit for measurement of plane angle
*/        
val Qrad = 10.0.pow(30) * (m/m)

/**
* quettaradian, 10^30 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val quettaradian = Qrad
    

/**
* Rrad, 10^27 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Rrad : Radian
    @JvmName("getRrad_prop")
    /**
    * Returns Rrad, 10^27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(27))

/**
* ronnaradian, 10^27 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.ronnaradian : Radian
    /**
    * Returns ronnaradian, 10^27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* Rrad, 10^27 of radian, derived SI-Unit for measurement of plane angle
*/        
val Rrad = 10.0.pow(27) * (m/m)

/**
* ronnaradian, 10^27 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val ronnaradian = Rrad
    

/**
* Yrad, 10^24 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Yrad : Radian
    @JvmName("getYrad_prop")
    /**
    * Returns Yrad, 10^24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(24))

/**
* yottaradian, 10^24 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.yottaradian : Radian
    /**
    * Returns yottaradian, 10^24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* Yrad, 10^24 of radian, derived SI-Unit for measurement of plane angle
*/        
val Yrad = 10.0.pow(24) * (m/m)

/**
* yottaradian, 10^24 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val yottaradian = Yrad
    

/**
* Zrad, 10^21 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Zrad : Radian
    @JvmName("getZrad_prop")
    /**
    * Returns Zrad, 10^21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(21))

/**
* zettaradian, 10^21 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.zettaradian : Radian
    /**
    * Returns zettaradian, 10^21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* Zrad, 10^21 of radian, derived SI-Unit for measurement of plane angle
*/        
val Zrad = 10.0.pow(21) * (m/m)

/**
* zettaradian, 10^21 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val zettaradian = Zrad
    

/**
* Erad, 10^18 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Erad : Radian
    @JvmName("getErad_prop")
    /**
    * Returns Erad, 10^18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(18))

/**
* exaradian, 10^18 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.exaradian : Radian
    /**
    * Returns exaradian, 10^18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* Erad, 10^18 of radian, derived SI-Unit for measurement of plane angle
*/        
val Erad = 10.0.pow(18) * (m/m)

/**
* exaradian, 10^18 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val exaradian = Erad
    

/**
* Prad, 10^15 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Prad : Radian
    @JvmName("getPrad_prop")
    /**
    * Returns Prad, 10^15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(15))

/**
* petaradian, 10^15 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.petaradian : Radian
    /**
    * Returns petaradian, 10^15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* Prad, 10^15 of radian, derived SI-Unit for measurement of plane angle
*/        
val Prad = 10.0.pow(15) * (m/m)

/**
* petaradian, 10^15 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val petaradian = Prad
    

/**
* Trad, 10^12 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Trad : Radian
    @JvmName("getTrad_prop")
    /**
    * Returns Trad, 10^12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(12))

/**
* teraradian, 10^12 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.teraradian : Radian
    /**
    * Returns teraradian, 10^12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* Trad, 10^12 of radian, derived SI-Unit for measurement of plane angle
*/        
val Trad = 10.0.pow(12) * (m/m)

/**
* teraradian, 10^12 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val teraradian = Trad
    

/**
* Grad, 10^9 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Grad : Radian
    @JvmName("getGrad_prop")
    /**
    * Returns Grad, 10^9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(9))

/**
* gigaradian, 10^9 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.gigaradian : Radian
    /**
    * Returns gigaradian, 10^9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* Grad, 10^9 of radian, derived SI-Unit for measurement of plane angle
*/        
val Grad = 10.0.pow(9) * (m/m)

/**
* gigaradian, 10^9 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val gigaradian = Grad
    

/**
* Mrad, 10^6 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Mrad : Radian
    @JvmName("getMrad_prop")
    /**
    * Returns Mrad, 10^6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(6))

/**
* megaradian, 10^6 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.megaradian : Radian
    /**
    * Returns megaradian, 10^6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* Mrad, 10^6 of radian, derived SI-Unit for measurement of plane angle
*/        
val Mrad = 10.0.pow(6) * (m/m)

/**
* megaradian, 10^6 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val megaradian = Mrad
    

/**
* krad, 10^3 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.krad : Radian
    @JvmName("getkrad_prop")
    /**
    * Returns krad, 10^3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(3))

/**
* kiloradian, 10^3 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.kiloradian : Radian
    /**
    * Returns kiloradian, 10^3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* krad, 10^3 of radian, derived SI-Unit for measurement of plane angle
*/        
val krad = 10.0.pow(3) * (m/m)

/**
* kiloradian, 10^3 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val kiloradian = krad
    

/**
* hrad, 10^2 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.hrad : Radian
    @JvmName("gethrad_prop")
    /**
    * Returns hrad, 10^2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(2))

/**
* hectoradian, 10^2 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.hectoradian : Radian
    /**
    * Returns hectoradian, 10^2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hrad, 10^2 of radian, derived SI-Unit for measurement of plane angle
*/        
val hrad = 10.0.pow(2) * (m/m)

/**
* hectoradian, 10^2 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val hectoradian = hrad
    

/**
* darad, 10^1 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.darad : Radian
    @JvmName("getdarad_prop")
    /**
    * Returns darad, 10^1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(1))

/**
* decaradian, 10^1 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.decaradian : Radian
    /**
    * Returns decaradian, 10^1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* darad, 10^1 of radian, derived SI-Unit for measurement of plane angle
*/        
val darad = 10.0.pow(1) * (m/m)

/**
* decaradian, 10^1 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val decaradian = darad
    

/**
* drad, 10^-1 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.drad : Radian
    @JvmName("getdrad_prop")
    /**
    * Returns drad, 10^-1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-1))

/**
* deciradian, 10^-1 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.deciradian : Radian
    /**
    * Returns deciradian, 10^-1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* drad, 10^-1 of radian, derived SI-Unit for measurement of plane angle
*/        
val drad = 10.0.pow(-1) * (m/m)

/**
* deciradian, 10^-1 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val deciradian = drad
    

/**
* crad, 10^-2 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.crad : Radian
    @JvmName("getcrad_prop")
    /**
    * Returns crad, 10^-2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-2))

/**
* centiradian, 10^-2 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.centiradian : Radian
    /**
    * Returns centiradian, 10^-2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* crad, 10^-2 of radian, derived SI-Unit for measurement of plane angle
*/        
val crad = 10.0.pow(-2) * (m/m)

/**
* centiradian, 10^-2 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val centiradian = crad
    

/**
* mrad, 10^-3 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.mrad : Radian
    @JvmName("getmrad_prop")
    /**
    * Returns mrad, 10^-3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-3))

/**
* milliradian, 10^-3 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.milliradian : Radian
    /**
    * Returns milliradian, 10^-3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mrad, 10^-3 of radian, derived SI-Unit for measurement of plane angle
*/        
val mrad = 10.0.pow(-3) * (m/m)

/**
* milliradian, 10^-3 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val milliradian = mrad
    

/**
* μrad, 10^-6 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.μrad : Radian
    @JvmName("getμrad_prop")
    /**
    * Returns μrad, 10^-6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-6))

/**
* microradian, 10^-6 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.microradian : Radian
    /**
    * Returns microradian, 10^-6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μrad, 10^-6 of radian, derived SI-Unit for measurement of plane angle
*/        
val μrad = 10.0.pow(-6) * (m/m)

/**
* microradian, 10^-6 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val microradian = μrad
    

/**
* nrad, 10^-9 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.nrad : Radian
    @JvmName("getnrad_prop")
    /**
    * Returns nrad, 10^-9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-9))

/**
* nanoradian, 10^-9 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.nanoradian : Radian
    /**
    * Returns nanoradian, 10^-9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nrad, 10^-9 of radian, derived SI-Unit for measurement of plane angle
*/        
val nrad = 10.0.pow(-9) * (m/m)

/**
* nanoradian, 10^-9 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val nanoradian = nrad
    

/**
* prad, 10^-12 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.prad : Radian
    @JvmName("getprad_prop")
    /**
    * Returns prad, 10^-12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-12))

/**
* picoradian, 10^-12 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.picoradian : Radian
    /**
    * Returns picoradian, 10^-12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* prad, 10^-12 of radian, derived SI-Unit for measurement of plane angle
*/        
val prad = 10.0.pow(-12) * (m/m)

/**
* picoradian, 10^-12 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val picoradian = prad
    

/**
* frad, 10^-15 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.frad : Radian
    @JvmName("getfrad_prop")
    /**
    * Returns frad, 10^-15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-15))

/**
* femtoradian, 10^-15 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.femtoradian : Radian
    /**
    * Returns femtoradian, 10^-15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* frad, 10^-15 of radian, derived SI-Unit for measurement of plane angle
*/        
val frad = 10.0.pow(-15) * (m/m)

/**
* femtoradian, 10^-15 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val femtoradian = frad
    

/**
* arad, 10^-18 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.arad : Radian
    @JvmName("getarad_prop")
    /**
    * Returns arad, 10^-18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-18))

/**
* attoradian, 10^-18 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.attoradian : Radian
    /**
    * Returns attoradian, 10^-18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* arad, 10^-18 of radian, derived SI-Unit for measurement of plane angle
*/        
val arad = 10.0.pow(-18) * (m/m)

/**
* attoradian, 10^-18 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val attoradian = arad
    

/**
* zrad, 10^-21 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.zrad : Radian
    @JvmName("getzrad_prop")
    /**
    * Returns zrad, 10^-21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-21))

/**
* zeptoradian, 10^-21 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.zeptoradian : Radian
    /**
    * Returns zeptoradian, 10^-21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zrad, 10^-21 of radian, derived SI-Unit for measurement of plane angle
*/        
val zrad = 10.0.pow(-21) * (m/m)

/**
* zeptoradian, 10^-21 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val zeptoradian = zrad
    

/**
* yrad, 10^-24 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.yrad : Radian
    @JvmName("getyrad_prop")
    /**
    * Returns yrad, 10^-24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-24))

/**
* yoctoradian, 10^-24 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.yoctoradian : Radian
    /**
    * Returns yoctoradian, 10^-24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yrad, 10^-24 of radian, derived SI-Unit for measurement of plane angle
*/        
val yrad = 10.0.pow(-24) * (m/m)

/**
* yoctoradian, 10^-24 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val yoctoradian = yrad
    

/**
* rrad, 10^-27 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.rrad : Radian
    @JvmName("getrrad_prop")
    /**
    * Returns rrad, 10^-27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-27))

/**
* rontoradian, 10^-27 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.rontoradian : Radian
    /**
    * Returns rontoradian, 10^-27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rrad, 10^-27 of radian, derived SI-Unit for measurement of plane angle
*/        
val rrad = 10.0.pow(-27) * (m/m)

/**
* rontoradian, 10^-27 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val rontoradian = rrad
    

/**
* qrad, 10^-30 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.qrad : Radian
    @JvmName("getqrad_prop")
    /**
    * Returns qrad, 10^-30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-30))

/**
* quectoradian, 10^-30 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.quectoradian : Radian
    /**
    * Returns quectoradian, 10^-30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = Radian(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qrad, 10^-30 of radian, derived SI-Unit for measurement of plane angle
*/        
val qrad = 10.0.pow(-30) * (m/m)

/**
* quectoradian, 10^-30 of radian, derived SI-Unit for measurement of plane angle
*/ 

@JsExport
@JvmField
val quectoradian = qrad
    