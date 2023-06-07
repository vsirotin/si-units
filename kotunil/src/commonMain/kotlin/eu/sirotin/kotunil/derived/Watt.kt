
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
//import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  kg*(m*m)/(s `^` 3)

@JsExport
/**
* System International Unit for power, radiant flux.
*/
class Watt(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for power, radiant flux.
*/
@JsExport
@JvmField
val W = Watt(1.0)

/**
* Creates Watt-Object for current number value. Watt is a System International Unit for power, radiant flux.
*/
val Number.W : Watt
   /**
   * Returns Watt-Object for current number value. Watt is a System International Unit for power, radiant flux.
   */
    get() = Watt(this.toDouble())

    
/**
* QW, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.QW : Watt
    @JvmName("getQW_prop")
    /**
    * Returns QW, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(30))

/**
* quettawatt, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.quettawatt : Watt
    /**
    * Returns quettawatt, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QW, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val QW = 10.0.pow(30) * (kg*(m*m)/(s `^` 3))

/**
* quettawatt, 10^30 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val quettawatt = QW
    

/**
* RW, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.RW : Watt
    @JvmName("getRW_prop")
    /**
    * Returns RW, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(27))

/**
* ronnawatt, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.ronnawatt : Watt
    /**
    * Returns ronnawatt, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RW, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val RW = 10.0.pow(27) * (kg*(m*m)/(s `^` 3))

/**
* ronnawatt, 10^27 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val ronnawatt = RW
    

/**
* YW, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.YW : Watt
    @JvmName("getYW_prop")
    /**
    * Returns YW, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(24))

/**
* yottawatt, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.yottawatt : Watt
    /**
    * Returns yottawatt, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YW, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val YW = 10.0.pow(24) * (kg*(m*m)/(s `^` 3))

/**
* yottawatt, 10^24 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val yottawatt = YW
    

/**
* ZW, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.ZW : Watt
    @JvmName("getZW_prop")
    /**
    * Returns ZW, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(21))

/**
* zettawatt, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.zettawatt : Watt
    /**
    * Returns zettawatt, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZW, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val ZW = 10.0.pow(21) * (kg*(m*m)/(s `^` 3))

/**
* zettawatt, 10^21 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val zettawatt = ZW
    

/**
* EW, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.EW : Watt
    @JvmName("getEW_prop")
    /**
    * Returns EW, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(18))

/**
* exawatt, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.exawatt : Watt
    /**
    * Returns exawatt, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EW, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val EW = 10.0.pow(18) * (kg*(m*m)/(s `^` 3))

/**
* exawatt, 10^18 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val exawatt = EW
    

/**
* PW, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.PW : Watt
    @JvmName("getPW_prop")
    /**
    * Returns PW, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(15))

/**
* petawatt, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.petawatt : Watt
    /**
    * Returns petawatt, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PW, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val PW = 10.0.pow(15) * (kg*(m*m)/(s `^` 3))

/**
* petawatt, 10^15 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val petawatt = PW
    

/**
* TW, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.TW : Watt
    @JvmName("getTW_prop")
    /**
    * Returns TW, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(12))

/**
* terawatt, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.terawatt : Watt
    /**
    * Returns terawatt, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TW, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val TW = 10.0.pow(12) * (kg*(m*m)/(s `^` 3))

/**
* terawatt, 10^12 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val terawatt = TW
    

/**
* GW, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.GW : Watt
    @JvmName("getGW_prop")
    /**
    * Returns GW, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(9))

/**
* gigawatt, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.gigawatt : Watt
    /**
    * Returns gigawatt, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GW, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val GW = 10.0.pow(9) * (kg*(m*m)/(s `^` 3))

/**
* gigawatt, 10^9 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val gigawatt = GW
    

/**
* MW, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.MW : Watt
    @JvmName("getMW_prop")
    /**
    * Returns MW, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(6))

/**
* megawatt, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.megawatt : Watt
    /**
    * Returns megawatt, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MW, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val MW = 10.0.pow(6) * (kg*(m*m)/(s `^` 3))

/**
* megawatt, 10^6 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val megawatt = MW
    

/**
* kW, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.kW : Watt
    @JvmName("getkW_prop")
    /**
    * Returns kW, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(3))

/**
* kilowatt, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.kilowatt : Watt
    /**
    * Returns kilowatt, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kW, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val kW = 10.0.pow(3) * (kg*(m*m)/(s `^` 3))

/**
* kilowatt, 10^3 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val kilowatt = kW
    

/**
* hW, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.hW : Watt
    @JvmName("gethW_prop")
    /**
    * Returns hW, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(2))

/**
* hectowatt, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.hectowatt : Watt
    /**
    * Returns hectowatt, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hW, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val hW = 10.0.pow(2) * (kg*(m*m)/(s `^` 3))

/**
* hectowatt, 10^2 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val hectowatt = hW
    

/**
* daW, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.daW : Watt
    @JvmName("getdaW_prop")
    /**
    * Returns daW, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(1))

/**
* decawatt, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.decawatt : Watt
    /**
    * Returns decawatt, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daW, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val daW = 10.0.pow(1) * (kg*(m*m)/(s `^` 3))

/**
* decawatt, 10^1 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val decawatt = daW
    

/**
* dW, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.dW : Watt
    @JvmName("getdW_prop")
    /**
    * Returns dW, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-1))

/**
* deciwatt, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.deciwatt : Watt
    /**
    * Returns deciwatt, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dW, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val dW = 10.0.pow(-1) * (kg*(m*m)/(s `^` 3))

/**
* deciwatt, 10^-1 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val deciwatt = dW
    

/**
* cW, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.cW : Watt
    @JvmName("getcW_prop")
    /**
    * Returns cW, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-2))

/**
* centiwatt, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.centiwatt : Watt
    /**
    * Returns centiwatt, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cW, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val cW = 10.0.pow(-2) * (kg*(m*m)/(s `^` 3))

/**
* centiwatt, 10^-2 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val centiwatt = cW
    

/**
* mW, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.mW : Watt
    @JvmName("getmW_prop")
    /**
    * Returns mW, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-3))

/**
* milliwatt, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.milliwatt : Watt
    /**
    * Returns milliwatt, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mW, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val mW = 10.0.pow(-3) * (kg*(m*m)/(s `^` 3))

/**
* milliwatt, 10^-3 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val milliwatt = mW
    

/**
* μW, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.μW : Watt
    @JvmName("getμW_prop")
    /**
    * Returns μW, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-6))

/**
* microwatt, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.microwatt : Watt
    /**
    * Returns microwatt, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μW, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val μW = 10.0.pow(-6) * (kg*(m*m)/(s `^` 3))

/**
* microwatt, 10^-6 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val microwatt = μW
    

/**
* nW, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.nW : Watt
    @JvmName("getnW_prop")
    /**
    * Returns nW, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-9))

/**
* nanowatt, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.nanowatt : Watt
    /**
    * Returns nanowatt, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nW, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val nW = 10.0.pow(-9) * (kg*(m*m)/(s `^` 3))

/**
* nanowatt, 10^-9 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val nanowatt = nW
    

/**
* pW, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.pW : Watt
    @JvmName("getpW_prop")
    /**
    * Returns pW, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-12))

/**
* picowatt, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.picowatt : Watt
    /**
    * Returns picowatt, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pW, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val pW = 10.0.pow(-12) * (kg*(m*m)/(s `^` 3))

/**
* picowatt, 10^-12 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val picowatt = pW
    

/**
* fW, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.fW : Watt
    @JvmName("getfW_prop")
    /**
    * Returns fW, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-15))

/**
* femtowatt, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.femtowatt : Watt
    /**
    * Returns femtowatt, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fW, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val fW = 10.0.pow(-15) * (kg*(m*m)/(s `^` 3))

/**
* femtowatt, 10^-15 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val femtowatt = fW
    

/**
* aW, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.aW : Watt
    @JvmName("getaW_prop")
    /**
    * Returns aW, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-18))

/**
* attowatt, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.attowatt : Watt
    /**
    * Returns attowatt, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aW, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val aW = 10.0.pow(-18) * (kg*(m*m)/(s `^` 3))

/**
* attowatt, 10^-18 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val attowatt = aW
    

/**
* zW, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.zW : Watt
    @JvmName("getzW_prop")
    /**
    * Returns zW, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-21))

/**
* zeptowatt, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.zeptowatt : Watt
    /**
    * Returns zeptowatt, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zW, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val zW = 10.0.pow(-21) * (kg*(m*m)/(s `^` 3))

/**
* zeptowatt, 10^-21 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val zeptowatt = zW
    

/**
* yW, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.yW : Watt
    @JvmName("getyW_prop")
    /**
    * Returns yW, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-24))

/**
* yoctowatt, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.yoctowatt : Watt
    /**
    * Returns yoctowatt, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yW, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val yW = 10.0.pow(-24) * (kg*(m*m)/(s `^` 3))

/**
* yoctowatt, 10^-24 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val yoctowatt = yW
    

/**
* rW, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.rW : Watt
    @JvmName("getrW_prop")
    /**
    * Returns rW, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-27))

/**
* rontowatt, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.rontowatt : Watt
    /**
    * Returns rontowatt, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rW, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val rW = 10.0.pow(-27) * (kg*(m*m)/(s `^` 3))

/**
* rontowatt, 10^-27 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val rontowatt = rW
    

/**
* qW, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
*/    
val Number.qW : Watt
    @JvmName("getqW_prop")
    /**
    * Returns qW, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-30))

/**
* quectowatt, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 
val Number.quectowatt : Watt
    /**
    * Returns quectowatt, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
    */  
    get() = Watt(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qW, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
*/        
val qW = 10.0.pow(-30) * (kg*(m*m)/(s `^` 3))

/**
* quectowatt, 10^-30 of watt, derived SI-Unit for measurement of power, radiant flux
*/ 

@JsExport
@JvmField
val quectowatt = qW
    