
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
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
val rad = formula

/**
* Creates Radian-Object for current number value. Radian is a System International Unit for plane angle.
*/
val Number.rad : Expression
   /**
   * Returns Radian-Object for current number value. Radian is a System International Unit for plane angle.
   */
    get() = this.toDouble() * formula

    
/**
* Qrad, 10^30 of radian, derived SI-Unit for measurement of plane angle
*/    
val Number.Qrad : Expression
    @JvmName("getQrad_prop")
    /**
    * Returns Qrad, 10^30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

/**
* quettaradian, 10^30 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.quettaradian : Expression
    /**
    * Returns quettaradian, 10^30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(30) * formula

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
    get() = this.toDouble() * 10.0.pow(27) * formula

/**
* ronnaradian, 10^27 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.ronnaradian : Expression
    /**
    * Returns ronnaradian, 10^27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(27) * formula

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
    get() = this.toDouble() * 10.0.pow(24) * formula

/**
* yottaradian, 10^24 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.yottaradian : Expression
    /**
    * Returns yottaradian, 10^24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(24) * formula

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
    get() = this.toDouble() * 10.0.pow(21) * formula

/**
* zettaradian, 10^21 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.zettaradian : Expression
    /**
    * Returns zettaradian, 10^21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(21) * formula

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
    get() = this.toDouble() * 10.0.pow(18) * formula

/**
* exaradian, 10^18 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.exaradian : Expression
    /**
    * Returns exaradian, 10^18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(18) * formula

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
    get() = this.toDouble() * 10.0.pow(15) * formula

/**
* petaradian, 10^15 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.petaradian : Expression
    /**
    * Returns petaradian, 10^15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(15) * formula

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
    get() = this.toDouble() * 10.0.pow(12) * formula

/**
* teraradian, 10^12 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.teraradian : Expression
    /**
    * Returns teraradian, 10^12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(12) * formula

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
    get() = this.toDouble() * 10.0.pow(9) * formula

/**
* gigaradian, 10^9 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.gigaradian : Expression
    /**
    * Returns gigaradian, 10^9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(9) * formula

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
    get() = this.toDouble() * 10.0.pow(6) * formula

/**
* megaradian, 10^6 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.megaradian : Expression
    /**
    * Returns megaradian, 10^6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(6) * formula

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
    get() = this.toDouble() * 10.0.pow(3) * formula

/**
* kiloradian, 10^3 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.kiloradian : Expression
    /**
    * Returns kiloradian, 10^3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(3) * formula

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
    get() = this.toDouble() * 10.0.pow(2) * formula

/**
* hectoradian, 10^2 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.hectoradian : Expression
    /**
    * Returns hectoradian, 10^2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(2) * formula

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
    get() = this.toDouble() * 10.0.pow(1) * formula

/**
* decaradian, 10^1 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.decaradian : Expression
    /**
    * Returns decaradian, 10^1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(1) * formula

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
    get() = this.toDouble() * 10.0.pow(-1) * formula

/**
* deciradian, 10^-1 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.deciradian : Expression
    /**
    * Returns deciradian, 10^-1 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-1) * formula

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
    get() = this.toDouble() * 10.0.pow(-2) * formula

/**
* centiradian, 10^-2 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.centiradian : Expression
    /**
    * Returns centiradian, 10^-2 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-2) * formula

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
    get() = this.toDouble() * 10.0.pow(-3) * formula

/**
* milliradian, 10^-3 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.milliradian : Expression
    /**
    * Returns milliradian, 10^-3 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-3) * formula


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
    get() = this.toDouble() * 10.0.pow(-6) * formula

/**
* microradian, 10^-6 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.microradian : Expression
    /**
    * Returns microradian, 10^-6 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-6) * formula

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
    get() = this.toDouble() * 10.0.pow(-9) * formula

/**
* nanoradian, 10^-9 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.nanoradian : Expression
    /**
    * Returns nanoradian, 10^-9 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-9) * formula

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
    get() = this.toDouble() * 10.0.pow(-12) * formula

/**
* picoradian, 10^-12 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.picoradian : Expression
    /**
    * Returns picoradian, 10^-12 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-12) * formula


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
    get() = this.toDouble() * 10.0.pow(-15) * formula

/**
* femtoradian, 10^-15 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.femtoradian : Expression
    /**
    * Returns femtoradian, 10^-15 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-15) * formula

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
    get() = this.toDouble() * 10.0.pow(-18) * formula

/**
* attoradian, 10^-18 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.attoradian : Expression
    /**
    * Returns attoradian, 10^-18 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-18) * formula

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
    get() = this.toDouble() * 10.0.pow(-21) * formula

/**
* zeptoradian, 10^-21 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.zeptoradian : Expression
    /**
    * Returns zeptoradian, 10^-21 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-21) * formula


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
    get() = this.toDouble() * 10.0.pow(-24) * formula

/**
* yoctoradian, 10^-24 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.yoctoradian : Expression
    /**
    * Returns yoctoradian, 10^-24 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-24) * formula


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
    get() = this.toDouble() * 10.0.pow(-27) * formula

/**
* rontoradian, 10^-27 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.rontoradian : Expression
    /**
    * Returns rontoradian, 10^-27 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-27) * formula


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
    get() = this.toDouble() * 10.0.pow(-30) * formula

/**
* quectoradian, 10^-30 of radian, derived SI-Unit for measurement of plane angle
*/ 
val Number.quectoradian : Expression
    /**
    * Returns quectoradian, 10^-30 of radian, derived SI-Unit for measurement of plane angle
    */  
    get() = this.toDouble() * 10.0.pow(-30) * formula


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
    