
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  kg*(m2)/(s `^` 3)

@JsExport
/**
* System International Unit for power, radiant flux.
*/
class Watt(value: Double){
    val expression: Expression = unit*value
}

/**
* System International Unit for power, radiant flux.
*/
@JsExport
@JvmField
val W = unit

/**
* Creates Watt-Object for current number value. Watt is a System International Unit for power, radiant flux.
*/
val Number.W : Expression
   /**
   * Returns Watt-Object for current number value. Watt is a System International Unit for power, radiant flux.
   */
    get() = this.toDouble() * unit

    
/**
* QW, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.QW : Expression
    @JvmName("getQW_prop")
    /**
    * Returns QW, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettawatt, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.quettawatt : Expression
    /**
    * Returns quettawatt, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

@JsExport
@JvmField
/**
* QW, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val QW = 10.0.pow(30) * (kg*(m2)/(s `^` 3))

/**
* quettawatt, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val quettawatt = QW
    

/**
* RW, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.RW : Expression
    @JvmName("getRW_prop")
    /**
    * Returns RW, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnawatt, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.ronnawatt : Expression
    /**
    * Returns ronnawatt, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

@JsExport
@JvmField
/**
* RW, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val RW = 10.0.pow(27) * (kg*(m2)/(s `^` 3))

/**
* ronnawatt, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val ronnawatt = RW
    

/**
* YW, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.YW : Expression
    @JvmName("getYW_prop")
    /**
    * Returns YW, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottawatt, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.yottawatt : Expression
    /**
    * Returns yottawatt, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

@JsExport
@JvmField
/**
* YW, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val YW = 10.0.pow(24) * (kg*(m2)/(s `^` 3))

/**
* yottawatt, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val yottawatt = YW
    

/**
* ZW, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.ZW : Expression
    @JvmName("getZW_prop")
    /**
    * Returns ZW, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettawatt, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.zettawatt : Expression
    /**
    * Returns zettawatt, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

@JsExport
@JvmField
/**
* ZW, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val ZW = 10.0.pow(21) * (kg*(m2)/(s `^` 3))

/**
* zettawatt, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val zettawatt = ZW
    

/**
* EW, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.EW : Expression
    @JvmName("getEW_prop")
    /**
    * Returns EW, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exawatt, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.exawatt : Expression
    /**
    * Returns exawatt, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

@JsExport
@JvmField
/**
* EW, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val EW = 10.0.pow(18) * (kg*(m2)/(s `^` 3))

/**
* exawatt, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val exawatt = EW
    

/**
* PW, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.PW : Expression
    @JvmName("getPW_prop")
    /**
    * Returns PW, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petawatt, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.petawatt : Expression
    /**
    * Returns petawatt, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

@JsExport
@JvmField
/**
* PW, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val PW = 10.0.pow(15) * (kg*(m2)/(s `^` 3))

/**
* petawatt, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val petawatt = PW
    

/**
* TW, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.TW : Expression
    @JvmName("getTW_prop")
    /**
    * Returns TW, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* terawatt, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.terawatt : Expression
    /**
    * Returns terawatt, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

@JsExport
@JvmField
/**
* TW, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val TW = 10.0.pow(12) * (kg*(m2)/(s `^` 3))

/**
* terawatt, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val terawatt = TW
    

/**
* GW, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.GW : Expression
    @JvmName("getGW_prop")
    /**
    * Returns GW, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigawatt, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.gigawatt : Expression
    /**
    * Returns gigawatt, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

@JsExport
@JvmField
/**
* GW, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val GW = 10.0.pow(9) * (kg*(m2)/(s `^` 3))

/**
* gigawatt, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val gigawatt = GW
    

/**
* MW, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.MW : Expression
    @JvmName("getMW_prop")
    /**
    * Returns MW, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megawatt, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.megawatt : Expression
    /**
    * Returns megawatt, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

@JsExport
@JvmField
/**
* MW, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val MW = 10.0.pow(6) * (kg*(m2)/(s `^` 3))

/**
* megawatt, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val megawatt = MW
    

/**
* kW, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.kW : Expression
    @JvmName("getkW_prop")
    /**
    * Returns kW, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilowatt, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.kilowatt : Expression
    /**
    * Returns kilowatt, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

@JsExport
@JvmField
/**
* kW, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val kW = 10.0.pow(3) * (kg*(m2)/(s `^` 3))

/**
* kilowatt, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val kilowatt = kW
    

/**
* hW, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.hW : Expression
    @JvmName("gethW_prop")
    /**
    * Returns hW, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectowatt, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.hectowatt : Expression
    /**
    * Returns hectowatt, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

@JsExport
@JvmField
/**
* hW, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val hW = 10.0.pow(2) * (kg*(m2)/(s `^` 3))

/**
* hectowatt, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val hectowatt = hW
    

/**
* daW, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.daW : Expression
    @JvmName("getdaW_prop")
    /**
    * Returns daW, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decawatt, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.decawatt : Expression
    /**
    * Returns decawatt, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

@JsExport
@JvmField
/**
* daW, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val daW = 10.0.pow(1) * (kg*(m2)/(s `^` 3))

/**
* decawatt, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val decawatt = daW
    

/**
* dW, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.dW : Expression
    @JvmName("getdW_prop")
    /**
    * Returns dW, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* deciwatt, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.deciwatt : Expression
    /**
    * Returns deciwatt, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

@JsExport
@JvmField
/**
* dW, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val dW = 10.0.pow(-1) * (kg*(m2)/(s `^` 3))

/**
* deciwatt, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val deciwatt = dW
    

/**
* cW, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.cW : Expression
    @JvmName("getcW_prop")
    /**
    * Returns cW, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centiwatt, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.centiwatt : Expression
    /**
    * Returns centiwatt, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

@JsExport
@JvmField
/**
* cW, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val cW = 10.0.pow(-2) * (kg*(m2)/(s `^` 3))

/**
* centiwatt, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val centiwatt = cW
    

/**
* mW, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.mW : Expression
    @JvmName("getmW_prop")
    /**
    * Returns mW, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* milliwatt, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.milliwatt : Expression
    /**
    * Returns milliwatt, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField
/**
* mW, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val mW = 10.0.pow(-3) * (kg*(m2)/(s `^` 3))

/**
* milliwatt, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val milliwatt = mW
    

/**
* μW, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.μW : Expression
    @JvmName("getμW_prop")
    /**
    * Returns μW, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microwatt, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.microwatt : Expression
    /**
    * Returns microwatt, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

@JsExport
@JvmField
/**
* μW, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val μW = 10.0.pow(-6) * (kg*(m2)/(s `^` 3))

/**
* microwatt, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val microwatt = μW
    

/**
* nW, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.nW : Expression
    @JvmName("getnW_prop")
    /**
    * Returns nW, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanowatt, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.nanowatt : Expression
    /**
    * Returns nanowatt, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

@JsExport
@JvmField
/**
* nW, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val nW = 10.0.pow(-9) * (kg*(m2)/(s `^` 3))

/**
* nanowatt, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val nanowatt = nW
    

/**
* pW, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.pW : Expression
    @JvmName("getpW_prop")
    /**
    * Returns pW, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picowatt, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.picowatt : Expression
    /**
    * Returns picowatt, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField
/**
* pW, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val pW = 10.0.pow(-12) * (kg*(m2)/(s `^` 3))

/**
* picowatt, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val picowatt = pW
    

/**
* fW, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.fW : Expression
    @JvmName("getfW_prop")
    /**
    * Returns fW, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtowatt, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.femtowatt : Expression
    /**
    * Returns femtowatt, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

@JsExport
@JvmField
/**
* fW, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val fW = 10.0.pow(-15) * (kg*(m2)/(s `^` 3))

/**
* femtowatt, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val femtowatt = fW
    

/**
* aW, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.aW : Expression
    @JvmName("getaW_prop")
    /**
    * Returns aW, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attowatt, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.attowatt : Expression
    /**
    * Returns attowatt, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

@JsExport
@JvmField
/**
* aW, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val aW = 10.0.pow(-18) * (kg*(m2)/(s `^` 3))

/**
* attowatt, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val attowatt = aW
    

/**
* zW, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.zW : Expression
    @JvmName("getzW_prop")
    /**
    * Returns zW, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptowatt, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.zeptowatt : Expression
    /**
    * Returns zeptowatt, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField
/**
* zW, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val zW = 10.0.pow(-21) * (kg*(m2)/(s `^` 3))

/**
* zeptowatt, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val zeptowatt = zW
    

/**
* yW, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.yW : Expression
    @JvmName("getyW_prop")
    /**
    * Returns yW, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctowatt, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.yoctowatt : Expression
    /**
    * Returns yoctowatt, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField
/**
* yW, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val yW = 10.0.pow(-24) * (kg*(m2)/(s `^` 3))

/**
* yoctowatt, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val yoctowatt = yW
    

/**
* rW, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.rW : Expression
    @JvmName("getrW_prop")
    /**
    * Returns rW, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontowatt, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.rontowatt : Expression
    /**
    * Returns rontowatt, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField
/**
* rW, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val rW = 10.0.pow(-27) * (kg*(m2)/(s `^` 3))

/**
* rontowatt, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val rontowatt = rW
    

/**
* qW, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.qW : Expression
    @JvmName("getqW_prop")
    /**
    * Returns qW, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectowatt, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.quectowatt : Expression
    /**
    * Returns quectowatt, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField
/**
* qW, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val qW = 10.0.pow(-30) * (kg*(m2)/(s `^` 3))

/**
* quectowatt, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val quectowatt = qW
    