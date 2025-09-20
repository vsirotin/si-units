
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (mol * (s `^` -1))

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for catalytic activity.
*/
class Katal(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for catalytic activity.
*/
@JsExport
@JvmField
val kat = Katal(1.0)

/**
* Creates a Katal object for the current number value. Katal is a System International Unit for catalytic activity.
*/
val Number.kat : Katal
   /**
   * Returns a Katal object for the current number value. Katal is a System International Unit for catalytic activity.
   */
    get() = Katal(this.toDouble())

    
/**
* Qkat, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Qkat : Katal
    @JvmName("getQkat_prop")
    /**
    * Returns Qkat, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(30))

/**
* quettakatal, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.quettakatal : Katal
    /**
    * Returns quettakatal, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* Qkat, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Qkat = 10.0.pow(30) * ((mol * (s `^` -1)))

/**
* quettakatal, 10^30 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val quettakatal = Qkat
    

/**
* Rkat, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Rkat : Katal
    @JvmName("getRkat_prop")
    /**
    * Returns Rkat, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(27))

/**
* ronnakatal, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.ronnakatal : Katal
    /**
    * Returns ronnakatal, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* Rkat, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Rkat = 10.0.pow(27) * ((mol * (s `^` -1)))

/**
* ronnakatal, 10^27 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val ronnakatal = Rkat
    

/**
* Ykat, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Ykat : Katal
    @JvmName("getYkat_prop")
    /**
    * Returns Ykat, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(24))

/**
* yottakatal, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.yottakatal : Katal
    /**
    * Returns yottakatal, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* Ykat, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Ykat = 10.0.pow(24) * ((mol * (s `^` -1)))

/**
* yottakatal, 10^24 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val yottakatal = Ykat
    

/**
* Zkat, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Zkat : Katal
    @JvmName("getZkat_prop")
    /**
    * Returns Zkat, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(21))

/**
* zettakatal, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.zettakatal : Katal
    /**
    * Returns zettakatal, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* Zkat, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Zkat = 10.0.pow(21) * ((mol * (s `^` -1)))

/**
* zettakatal, 10^21 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val zettakatal = Zkat
    

/**
* Ekat, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Ekat : Katal
    @JvmName("getEkat_prop")
    /**
    * Returns Ekat, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(18))

/**
* exakatal, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.exakatal : Katal
    /**
    * Returns exakatal, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* Ekat, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Ekat = 10.0.pow(18) * ((mol * (s `^` -1)))

/**
* exakatal, 10^18 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val exakatal = Ekat
    

/**
* Pkat, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Pkat : Katal
    @JvmName("getPkat_prop")
    /**
    * Returns Pkat, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(15))

/**
* petakatal, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.petakatal : Katal
    /**
    * Returns petakatal, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* Pkat, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Pkat = 10.0.pow(15) * ((mol * (s `^` -1)))

/**
* petakatal, 10^15 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val petakatal = Pkat
    

/**
* Tkat, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Tkat : Katal
    @JvmName("getTkat_prop")
    /**
    * Returns Tkat, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(12))

/**
* terakatal, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.terakatal : Katal
    /**
    * Returns terakatal, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* Tkat, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Tkat = 10.0.pow(12) * ((mol * (s `^` -1)))

/**
* terakatal, 10^12 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val terakatal = Tkat
    

/**
* Gkat, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Gkat : Katal
    @JvmName("getGkat_prop")
    /**
    * Returns Gkat, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(9))

/**
* gigakatal, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.gigakatal : Katal
    /**
    * Returns gigakatal, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* Gkat, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Gkat = 10.0.pow(9) * ((mol * (s `^` -1)))

/**
* gigakatal, 10^9 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val gigakatal = Gkat
    

/**
* Mkat, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.Mkat : Katal
    @JvmName("getMkat_prop")
    /**
    * Returns Mkat, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(6))

/**
* megakatal, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.megakatal : Katal
    /**
    * Returns megakatal, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* Mkat, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val Mkat = 10.0.pow(6) * ((mol * (s `^` -1)))

/**
* megakatal, 10^6 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val megakatal = Mkat
    

/**
* kkat, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.kkat : Katal
    @JvmName("getkkat_prop")
    /**
    * Returns kkat, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(3))

/**
* kilokatal, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.kilokatal : Katal
    /**
    * Returns kilokatal, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kkat, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val kkat = 10.0.pow(3) * ((mol * (s `^` -1)))

/**
* kilokatal, 10^3 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val kilokatal = kkat
    

/**
* hkat, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.hkat : Katal
    @JvmName("gethkat_prop")
    /**
    * Returns hkat, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(2))

/**
* hectokatal, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.hectokatal : Katal
    /**
    * Returns hectokatal, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hkat, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val hkat = 10.0.pow(2) * ((mol * (s `^` -1)))

/**
* hectokatal, 10^2 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val hectokatal = hkat
    

/**
* dakat, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.dakat : Katal
    @JvmName("getdakat_prop")
    /**
    * Returns dakat, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(1))

/**
* decakatal, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.decakatal : Katal
    /**
    * Returns decakatal, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* dakat, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val dakat = 10.0.pow(1) * ((mol * (s `^` -1)))

/**
* decakatal, 10^1 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val decakatal = dakat
    

/**
* dkat, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.dkat : Katal
    @JvmName("getdkat_prop")
    /**
    * Returns dkat, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-1))

/**
* decikatal, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.decikatal : Katal
    /**
    * Returns decikatal, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dkat, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val dkat = 10.0.pow(-1) * ((mol * (s `^` -1)))

/**
* decikatal, 10^-1 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val decikatal = dkat
    

/**
* ckat, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.ckat : Katal
    @JvmName("getckat_prop")
    /**
    * Returns ckat, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-2))

/**
* centikatal, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.centikatal : Katal
    /**
    * Returns centikatal, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* ckat, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val ckat = 10.0.pow(-2) * ((mol * (s `^` -1)))

/**
* centikatal, 10^-2 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val centikatal = ckat
    

/**
* mkat, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.mkat : Katal
    @JvmName("getmkat_prop")
    /**
    * Returns mkat, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-3))

/**
* millikatal, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.millikatal : Katal
    /**
    * Returns millikatal, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mkat, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val mkat = 10.0.pow(-3) * ((mol * (s `^` -1)))

/**
* millikatal, 10^-3 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val millikatal = mkat
    

/**
* μkat, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.μkat : Katal
    @JvmName("getμkat_prop")
    /**
    * Returns μkat, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-6))

/**
* microkatal, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.microkatal : Katal
    /**
    * Returns microkatal, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μkat, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val μkat = 10.0.pow(-6) * ((mol * (s `^` -1)))

/**
* microkatal, 10^-6 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val microkatal = μkat
    

/**
* nkat, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.nkat : Katal
    @JvmName("getnkat_prop")
    /**
    * Returns nkat, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-9))

/**
* nanokatal, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.nanokatal : Katal
    /**
    * Returns nanokatal, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nkat, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val nkat = 10.0.pow(-9) * ((mol * (s `^` -1)))

/**
* nanokatal, 10^-9 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val nanokatal = nkat
    

/**
* pkat, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.pkat : Katal
    @JvmName("getpkat_prop")
    /**
    * Returns pkat, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-12))

/**
* picokatal, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.picokatal : Katal
    /**
    * Returns picokatal, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pkat, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val pkat = 10.0.pow(-12) * ((mol * (s `^` -1)))

/**
* picokatal, 10^-12 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val picokatal = pkat
    

/**
* fkat, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.fkat : Katal
    @JvmName("getfkat_prop")
    /**
    * Returns fkat, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-15))

/**
* femtokatal, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.femtokatal : Katal
    /**
    * Returns femtokatal, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fkat, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val fkat = 10.0.pow(-15) * ((mol * (s `^` -1)))

/**
* femtokatal, 10^-15 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val femtokatal = fkat
    

/**
* akat, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.akat : Katal
    @JvmName("getakat_prop")
    /**
    * Returns akat, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-18))

/**
* attokatal, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.attokatal : Katal
    /**
    * Returns attokatal, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* akat, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val akat = 10.0.pow(-18) * ((mol * (s `^` -1)))

/**
* attokatal, 10^-18 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val attokatal = akat
    

/**
* zkat, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.zkat : Katal
    @JvmName("getzkat_prop")
    /**
    * Returns zkat, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-21))

/**
* zeptokatal, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.zeptokatal : Katal
    /**
    * Returns zeptokatal, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zkat, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val zkat = 10.0.pow(-21) * ((mol * (s `^` -1)))

/**
* zeptokatal, 10^-21 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val zeptokatal = zkat
    

/**
* ykat, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.ykat : Katal
    @JvmName("getykat_prop")
    /**
    * Returns ykat, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-24))

/**
* yoctokatal, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.yoctokatal : Katal
    /**
    * Returns yoctokatal, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* ykat, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val ykat = 10.0.pow(-24) * ((mol * (s `^` -1)))

/**
* yoctokatal, 10^-24 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val yoctokatal = ykat
    

/**
* rkat, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.rkat : Katal
    @JvmName("getrkat_prop")
    /**
    * Returns rkat, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-27))

/**
* rontokatal, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.rontokatal : Katal
    /**
    * Returns rontokatal, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rkat, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val rkat = 10.0.pow(-27) * ((mol * (s `^` -1)))

/**
* rontokatal, 10^-27 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val rontokatal = rkat
    

/**
* qkat, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
*/    
val Number.qkat : Katal
    @JvmName("getqkat_prop")
    /**
    * Returns qkat, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-30))

/**
* quectokatal, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
*/ 
val Number.quectokatal : Katal
    /**
    * Returns quectokatal, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
    */  
    get() = Katal(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qkat, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
*/        
val qkat = 10.0.pow(-30) * ((mol * (s `^` -1)))

/**
* quectokatal, 10^-30 of katal, derived SI-Unit for measurement of catalytic activity
*/ 

@JsExport
@JvmField
val quectokatal = qkat
    