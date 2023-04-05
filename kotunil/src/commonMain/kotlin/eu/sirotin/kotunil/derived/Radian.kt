
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  m/m

/**
* System International Unit for plane angle.
*/
@JsExport
@JvmField
val rad = unit

/**
* Creates Radian-Object for current number value. Radian is a System International Unit for plane angle.
*/
val Number.rad : Expression
   /**
   * Returns Radian-Object for current number value. Radian is a System International Unit for plane angle.
   */
    get() = this.toDouble() * unit

    
/**
* Qrad, 10^30 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Qrad : Expression
    @JvmName("getQrad_prop")
    /**
    * Returns Qrad, 10^30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettaradian, 10^30 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.quettaradian : Expression
    /**
    * Returns quettaradian, 10^30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

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
val Number.Rrad : Expression
    @JvmName("getRrad_prop")
    /**
    * Returns Rrad, 10^27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnaradian, 10^27 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.ronnaradian : Expression
    /**
    * Returns ronnaradian, 10^27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

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
val Number.Yrad : Expression
    @JvmName("getYrad_prop")
    /**
    * Returns Yrad, 10^24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottaradian, 10^24 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.yottaradian : Expression
    /**
    * Returns yottaradian, 10^24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

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
val Number.Zrad : Expression
    @JvmName("getZrad_prop")
    /**
    * Returns Zrad, 10^21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettaradian, 10^21 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.zettaradian : Expression
    /**
    * Returns zettaradian, 10^21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

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
val Number.Erad : Expression
    @JvmName("getErad_prop")
    /**
    * Returns Erad, 10^18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exaradian, 10^18 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.exaradian : Expression
    /**
    * Returns exaradian, 10^18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

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
val Number.Prad : Expression
    @JvmName("getPrad_prop")
    /**
    * Returns Prad, 10^15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petaradian, 10^15 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.petaradian : Expression
    /**
    * Returns petaradian, 10^15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

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
val Number.Trad : Expression
    @JvmName("getTrad_prop")
    /**
    * Returns Trad, 10^12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* teraradian, 10^12 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.teraradian : Expression
    /**
    * Returns teraradian, 10^12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

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
val Number.Grad : Expression
    @JvmName("getGrad_prop")
    /**
    * Returns Grad, 10^9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigaradian, 10^9 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.gigaradian : Expression
    /**
    * Returns gigaradian, 10^9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

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
val Number.Mrad : Expression
    @JvmName("getMrad_prop")
    /**
    * Returns Mrad, 10^6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megaradian, 10^6 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.megaradian : Expression
    /**
    * Returns megaradian, 10^6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

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
val Number.krad : Expression
    @JvmName("getkrad_prop")
    /**
    * Returns krad, 10^3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kiloradian, 10^3 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.kiloradian : Expression
    /**
    * Returns kiloradian, 10^3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

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
val Number.hrad : Expression
    @JvmName("gethrad_prop")
    /**
    * Returns hrad, 10^2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectoradian, 10^2 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.hectoradian : Expression
    /**
    * Returns hectoradian, 10^2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

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
val Number.darad : Expression
    @JvmName("getdarad_prop")
    /**
    * Returns darad, 10^1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decaradian, 10^1 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.decaradian : Expression
    /**
    * Returns decaradian, 10^1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

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
val Number.drad : Expression
    @JvmName("getdrad_prop")
    /**
    * Returns drad, 10^-1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* deciradian, 10^-1 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.deciradian : Expression
    /**
    * Returns deciradian, 10^-1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

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
val Number.crad : Expression
    @JvmName("getcrad_prop")
    /**
    * Returns crad, 10^-2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centiradian, 10^-2 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.centiradian : Expression
    /**
    * Returns centiradian, 10^-2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

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
val Number.mrad : Expression
    @JvmName("getmrad_prop")
    /**
    * Returns mrad, 10^-3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* milliradian, 10^-3 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.milliradian : Expression
    /**
    * Returns milliradian, 10^-3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


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
val Number.μrad : Expression
    @JvmName("getμrad_prop")
    /**
    * Returns μrad, 10^-6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microradian, 10^-6 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.microradian : Expression
    /**
    * Returns microradian, 10^-6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

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
val Number.nrad : Expression
    @JvmName("getnrad_prop")
    /**
    * Returns nrad, 10^-9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanoradian, 10^-9 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.nanoradian : Expression
    /**
    * Returns nanoradian, 10^-9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

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
val Number.prad : Expression
    @JvmName("getprad_prop")
    /**
    * Returns prad, 10^-12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picoradian, 10^-12 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.picoradian : Expression
    /**
    * Returns picoradian, 10^-12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


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
val Number.frad : Expression
    @JvmName("getfrad_prop")
    /**
    * Returns frad, 10^-15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtoradian, 10^-15 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.femtoradian : Expression
    /**
    * Returns femtoradian, 10^-15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

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
val Number.arad : Expression
    @JvmName("getarad_prop")
    /**
    * Returns arad, 10^-18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attoradian, 10^-18 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.attoradian : Expression
    /**
    * Returns attoradian, 10^-18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

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
val Number.zrad : Expression
    @JvmName("getzrad_prop")
    /**
    * Returns zrad, 10^-21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptoradian, 10^-21 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.zeptoradian : Expression
    /**
    * Returns zeptoradian, 10^-21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


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
val Number.yrad : Expression
    @JvmName("getyrad_prop")
    /**
    * Returns yrad, 10^-24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctoradian, 10^-24 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.yoctoradian : Expression
    /**
    * Returns yoctoradian, 10^-24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


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
val Number.rrad : Expression
    @JvmName("getrrad_prop")
    /**
    * Returns rrad, 10^-27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontoradian, 10^-27 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.rontoradian : Expression
    /**
    * Returns rontoradian, 10^-27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


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
val Number.qrad : Expression
    @JvmName("getqrad_prop")
    /**
    * Returns qrad, 10^-30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectoradian, 10^-30 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.quectoradian : Expression
    /**
    * Returns quectoradian, 10^-30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


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
    