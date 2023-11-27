
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*(m*m) * (s `^` -2) * (A `^` -1)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for magnetic flux.
*/
class Weber(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for magnetic flux.
*/
@JsExport
@JvmField
val Wb = Weber(1.0)

/**
* Creates Weber-Object for current number value. Weber is a System International Unit for magnetic flux.
*/
val Number.Wb : Weber
   /**
   * Returns Weber-Object for current number value. Weber is a System International Unit for magnetic flux.
   */
    get() = Weber(this.toDouble())

    
/**
* QWb, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.QWb : Weber
    @JvmName("getQWb_prop")
    /**
    * Returns QWb, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(30))

/**
* quettaweber, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.quettaweber : Weber
    /**
    * Returns quettaweber, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QWb, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val QWb = 10.0.pow(30) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* quettaweber, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val quettaweber = QWb
    

/**
* RWb, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.RWb : Weber
    @JvmName("getRWb_prop")
    /**
    * Returns RWb, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(27))

/**
* ronnaweber, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.ronnaweber : Weber
    /**
    * Returns ronnaweber, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RWb, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val RWb = 10.0.pow(27) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* ronnaweber, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val ronnaweber = RWb
    

/**
* YWb, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.YWb : Weber
    @JvmName("getYWb_prop")
    /**
    * Returns YWb, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(24))

/**
* yottaweber, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.yottaweber : Weber
    /**
    * Returns yottaweber, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YWb, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val YWb = 10.0.pow(24) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* yottaweber, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val yottaweber = YWb
    

/**
* ZWb, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.ZWb : Weber
    @JvmName("getZWb_prop")
    /**
    * Returns ZWb, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(21))

/**
* zettaweber, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.zettaweber : Weber
    /**
    * Returns zettaweber, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZWb, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val ZWb = 10.0.pow(21) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* zettaweber, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val zettaweber = ZWb
    

/**
* EWb, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.EWb : Weber
    @JvmName("getEWb_prop")
    /**
    * Returns EWb, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(18))

/**
* exaweber, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.exaweber : Weber
    /**
    * Returns exaweber, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EWb, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val EWb = 10.0.pow(18) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* exaweber, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val exaweber = EWb
    

/**
* PWb, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.PWb : Weber
    @JvmName("getPWb_prop")
    /**
    * Returns PWb, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(15))

/**
* petaweber, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.petaweber : Weber
    /**
    * Returns petaweber, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PWb, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val PWb = 10.0.pow(15) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* petaweber, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val petaweber = PWb
    

/**
* TWb, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.TWb : Weber
    @JvmName("getTWb_prop")
    /**
    * Returns TWb, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(12))

/**
* teraweber, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.teraweber : Weber
    /**
    * Returns teraweber, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TWb, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val TWb = 10.0.pow(12) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* teraweber, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val teraweber = TWb
    

/**
* GWb, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.GWb : Weber
    @JvmName("getGWb_prop")
    /**
    * Returns GWb, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(9))

/**
* gigaweber, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.gigaweber : Weber
    /**
    * Returns gigaweber, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GWb, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val GWb = 10.0.pow(9) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* gigaweber, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val gigaweber = GWb
    

/**
* MWb, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.MWb : Weber
    @JvmName("getMWb_prop")
    /**
    * Returns MWb, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(6))

/**
* megaweber, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.megaweber : Weber
    /**
    * Returns megaweber, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MWb, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val MWb = 10.0.pow(6) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* megaweber, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val megaweber = MWb
    

/**
* kWb, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.kWb : Weber
    @JvmName("getkWb_prop")
    /**
    * Returns kWb, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(3))

/**
* kiloweber, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.kiloweber : Weber
    /**
    * Returns kiloweber, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kWb, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val kWb = 10.0.pow(3) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* kiloweber, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val kiloweber = kWb
    

/**
* hWb, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.hWb : Weber
    @JvmName("gethWb_prop")
    /**
    * Returns hWb, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(2))

/**
* hectoweber, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.hectoweber : Weber
    /**
    * Returns hectoweber, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hWb, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val hWb = 10.0.pow(2) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* hectoweber, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val hectoweber = hWb
    

/**
* daWb, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.daWb : Weber
    @JvmName("getdaWb_prop")
    /**
    * Returns daWb, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(1))

/**
* decaweber, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.decaweber : Weber
    /**
    * Returns decaweber, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daWb, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val daWb = 10.0.pow(1) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* decaweber, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val decaweber = daWb
    

/**
* dWb, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.dWb : Weber
    @JvmName("getdWb_prop")
    /**
    * Returns dWb, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-1))

/**
* deciweber, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.deciweber : Weber
    /**
    * Returns deciweber, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dWb, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val dWb = 10.0.pow(-1) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* deciweber, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val deciweber = dWb
    

/**
* cWb, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.cWb : Weber
    @JvmName("getcWb_prop")
    /**
    * Returns cWb, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-2))

/**
* centiweber, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.centiweber : Weber
    /**
    * Returns centiweber, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cWb, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val cWb = 10.0.pow(-2) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* centiweber, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val centiweber = cWb
    

/**
* mWb, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.mWb : Weber
    @JvmName("getmWb_prop")
    /**
    * Returns mWb, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-3))

/**
* milliweber, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.milliweber : Weber
    /**
    * Returns milliweber, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mWb, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val mWb = 10.0.pow(-3) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* milliweber, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val milliweber = mWb
    

/**
* μWb, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.μWb : Weber
    @JvmName("getμWb_prop")
    /**
    * Returns μWb, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-6))

/**
* microweber, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.microweber : Weber
    /**
    * Returns microweber, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μWb, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val μWb = 10.0.pow(-6) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* microweber, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val microweber = μWb
    

/**
* nWb, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.nWb : Weber
    @JvmName("getnWb_prop")
    /**
    * Returns nWb, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-9))

/**
* nanoweber, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.nanoweber : Weber
    /**
    * Returns nanoweber, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nWb, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val nWb = 10.0.pow(-9) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* nanoweber, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val nanoweber = nWb
    

/**
* pWb, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.pWb : Weber
    @JvmName("getpWb_prop")
    /**
    * Returns pWb, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-12))

/**
* picoweber, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.picoweber : Weber
    /**
    * Returns picoweber, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pWb, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val pWb = 10.0.pow(-12) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* picoweber, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val picoweber = pWb
    

/**
* fWb, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.fWb : Weber
    @JvmName("getfWb_prop")
    /**
    * Returns fWb, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-15))

/**
* femtoweber, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.femtoweber : Weber
    /**
    * Returns femtoweber, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fWb, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val fWb = 10.0.pow(-15) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* femtoweber, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val femtoweber = fWb
    

/**
* aWb, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.aWb : Weber
    @JvmName("getaWb_prop")
    /**
    * Returns aWb, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-18))

/**
* attoweber, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.attoweber : Weber
    /**
    * Returns attoweber, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aWb, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val aWb = 10.0.pow(-18) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* attoweber, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val attoweber = aWb
    

/**
* zWb, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.zWb : Weber
    @JvmName("getzWb_prop")
    /**
    * Returns zWb, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-21))

/**
* zeptoweber, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.zeptoweber : Weber
    /**
    * Returns zeptoweber, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zWb, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val zWb = 10.0.pow(-21) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* zeptoweber, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val zeptoweber = zWb
    

/**
* yWb, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.yWb : Weber
    @JvmName("getyWb_prop")
    /**
    * Returns yWb, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-24))

/**
* yoctoweber, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.yoctoweber : Weber
    /**
    * Returns yoctoweber, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yWb, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val yWb = 10.0.pow(-24) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* yoctoweber, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val yoctoweber = yWb
    

/**
* rWb, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.rWb : Weber
    @JvmName("getrWb_prop")
    /**
    * Returns rWb, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-27))

/**
* rontoweber, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.rontoweber : Weber
    /**
    * Returns rontoweber, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rWb, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val rWb = 10.0.pow(-27) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* rontoweber, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val rontoweber = rWb
    

/**
* qWb, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.qWb : Weber
    @JvmName("getqWb_prop")
    /**
    * Returns qWb, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-30))

/**
* quectoweber, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.quectoweber : Weber
    /**
    * Returns quectoweber, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = Weber(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qWb, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val qWb = 10.0.pow(-30) * (kg*(m*m) * (s `^` -2) * (A `^` -1))

/**
* quectoweber, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
*/ 

@JsExport
@JvmField
val quectoweber = qWb
    