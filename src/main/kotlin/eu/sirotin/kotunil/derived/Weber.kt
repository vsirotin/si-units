
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.math.pow

private val unit =  kg*(m2) * (s `^` -2) * (A `^` -1)

/**
* System International Unit for magnetic flux.
*/
val Wb = unit

/**
* Creates Weber-Object for current number value. Weber is a System International Unit for magnetic flux.
*/
val Number.Wb : Expression
   /**
   * Returns Weber-Object for current number value. Weber is a System International Unit for magnetic flux.
   */
    get() = this.toDouble() * unit

    
/**
* QWb, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.QWb : Expression
    @JvmName("getQWb_prop")
    /**
    * Returns QWb, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettaweber, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.quettaweber : Expression
    /**
    * Returns quettaweber, 10^30 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit


@JvmField()  
/**
* QWb, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val QWb = 10.0.pow(30) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* quettaweber, 10^30 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val quettaweber = QWb
    

/**
* RWb, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.RWb : Expression
    @JvmName("getRWb_prop")
    /**
    * Returns RWb, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnaweber, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.ronnaweber : Expression
    /**
    * Returns ronnaweber, 10^27 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit


@JvmField()  
/**
* RWb, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val RWb = 10.0.pow(27) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* ronnaweber, 10^27 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val ronnaweber = RWb
    

/**
* YWb, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.YWb : Expression
    @JvmName("getYWb_prop")
    /**
    * Returns YWb, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottaweber, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.yottaweber : Expression
    /**
    * Returns yottaweber, 10^24 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit


@JvmField()  
/**
* YWb, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val YWb = 10.0.pow(24) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* yottaweber, 10^24 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val yottaweber = YWb
    

/**
* ZWb, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.ZWb : Expression
    @JvmName("getZWb_prop")
    /**
    * Returns ZWb, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettaweber, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.zettaweber : Expression
    /**
    * Returns zettaweber, 10^21 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit


@JvmField()  
/**
* ZWb, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val ZWb = 10.0.pow(21) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* zettaweber, 10^21 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val zettaweber = ZWb
    

/**
* EWb, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.EWb : Expression
    @JvmName("getEWb_prop")
    /**
    * Returns EWb, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exaweber, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.exaweber : Expression
    /**
    * Returns exaweber, 10^18 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit


@JvmField()  
/**
* EWb, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val EWb = 10.0.pow(18) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* exaweber, 10^18 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val exaweber = EWb
    

/**
* PWb, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.PWb : Expression
    @JvmName("getPWb_prop")
    /**
    * Returns PWb, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petaweber, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.petaweber : Expression
    /**
    * Returns petaweber, 10^15 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit


@JvmField()  
/**
* PWb, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val PWb = 10.0.pow(15) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* petaweber, 10^15 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val petaweber = PWb
    

/**
* TWb, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.TWb : Expression
    @JvmName("getTWb_prop")
    /**
    * Returns TWb, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* teraweber, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.teraweber : Expression
    /**
    * Returns teraweber, 10^12 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit


@JvmField()  
/**
* TWb, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val TWb = 10.0.pow(12) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* teraweber, 10^12 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val teraweber = TWb
    

/**
* GWb, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.GWb : Expression
    @JvmName("getGWb_prop")
    /**
    * Returns GWb, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigaweber, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.gigaweber : Expression
    /**
    * Returns gigaweber, 10^9 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit


@JvmField()  
/**
* GWb, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val GWb = 10.0.pow(9) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* gigaweber, 10^9 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val gigaweber = GWb
    

/**
* MWb, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.MWb : Expression
    @JvmName("getMWb_prop")
    /**
    * Returns MWb, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megaweber, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.megaweber : Expression
    /**
    * Returns megaweber, 10^6 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit


@JvmField()  
/**
* MWb, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val MWb = 10.0.pow(6) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* megaweber, 10^6 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val megaweber = MWb
    

/**
* kWb, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.kWb : Expression
    @JvmName("getkWb_prop")
    /**
    * Returns kWb, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kiloweber, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.kiloweber : Expression
    /**
    * Returns kiloweber, 10^3 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit


@JvmField()  
/**
* kWb, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val kWb = 10.0.pow(3) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* kiloweber, 10^3 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val kiloweber = kWb
    

/**
* hWb, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.hWb : Expression
    @JvmName("gethWb_prop")
    /**
    * Returns hWb, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectoweber, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.hectoweber : Expression
    /**
    * Returns hectoweber, 10^2 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit


@JvmField()  
/**
* hWb, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val hWb = 10.0.pow(2) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* hectoweber, 10^2 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val hectoweber = hWb
    

/**
* daWb, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.daWb : Expression
    @JvmName("getdaWb_prop")
    /**
    * Returns daWb, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decaweber, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.decaweber : Expression
    /**
    * Returns decaweber, 10^1 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit


@JvmField()  
/**
* daWb, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val daWb = 10.0.pow(1) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* decaweber, 10^1 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val decaweber = daWb
    

/**
* dWb, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.dWb : Expression
    @JvmName("getdWb_prop")
    /**
    * Returns dWb, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* deciweber, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.deciweber : Expression
    /**
    * Returns deciweber, 10^-1 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit


@JvmField()  
/**
* dWb, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val dWb = 10.0.pow(-1) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* deciweber, 10^-1 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val deciweber = dWb
    

/**
* cWb, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.cWb : Expression
    @JvmName("getcWb_prop")
    /**
    * Returns cWb, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centiweber, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.centiweber : Expression
    /**
    * Returns centiweber, 10^-2 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit


@JvmField()  
/**
* cWb, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val cWb = 10.0.pow(-2) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* centiweber, 10^-2 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val centiweber = cWb
    

/**
* mWb, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.mWb : Expression
    @JvmName("getmWb_prop")
    /**
    * Returns mWb, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* milliweber, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.milliweber : Expression
    /**
    * Returns milliweber, 10^-3 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField()  
/**
* mWb, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val mWb = 10.0.pow(-3) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* milliweber, 10^-3 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val milliweber = mWb
    

/**
* ??Wb, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.??Wb : Expression
    @JvmName("get??Wb_prop")
    /**
    * Returns ??Wb, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microweber, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.microweber : Expression
    /**
    * Returns microweber, 10^-6 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit


@JvmField()  
/**
* ??Wb, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val ??Wb = 10.0.pow(-6) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* microweber, 10^-6 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val microweber = ??Wb
    

/**
* nWb, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.nWb : Expression
    @JvmName("getnWb_prop")
    /**
    * Returns nWb, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanoweber, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.nanoweber : Expression
    /**
    * Returns nanoweber, 10^-9 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit


@JvmField()  
/**
* nWb, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val nWb = 10.0.pow(-9) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* nanoweber, 10^-9 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val nanoweber = nWb
    

/**
* pWb, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.pWb : Expression
    @JvmName("getpWb_prop")
    /**
    * Returns pWb, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picoweber, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.picoweber : Expression
    /**
    * Returns picoweber, 10^-12 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField()  
/**
* pWb, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val pWb = 10.0.pow(-12) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* picoweber, 10^-12 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val picoweber = pWb
    

/**
* fWb, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.fWb : Expression
    @JvmName("getfWb_prop")
    /**
    * Returns fWb, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtoweber, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.femtoweber : Expression
    /**
    * Returns femtoweber, 10^-15 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit


@JvmField()  
/**
* fWb, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val fWb = 10.0.pow(-15) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* femtoweber, 10^-15 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val femtoweber = fWb
    

/**
* aWb, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.aWb : Expression
    @JvmName("getaWb_prop")
    /**
    * Returns aWb, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attoweber, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.attoweber : Expression
    /**
    * Returns attoweber, 10^-18 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit


@JvmField()  
/**
* aWb, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val aWb = 10.0.pow(-18) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* attoweber, 10^-18 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val attoweber = aWb
    

/**
* zWb, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.zWb : Expression
    @JvmName("getzWb_prop")
    /**
    * Returns zWb, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptoweber, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.zeptoweber : Expression
    /**
    * Returns zeptoweber, 10^-21 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField()  
/**
* zWb, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val zWb = 10.0.pow(-21) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* zeptoweber, 10^-21 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val zeptoweber = zWb
    

/**
* yWb, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.yWb : Expression
    @JvmName("getyWb_prop")
    /**
    * Returns yWb, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctoweber, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.yoctoweber : Expression
    /**
    * Returns yoctoweber, 10^-24 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField()  
/**
* yWb, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val yWb = 10.0.pow(-24) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* yoctoweber, 10^-24 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val yoctoweber = yWb
    

/**
* rWb, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.rWb : Expression
    @JvmName("getrWb_prop")
    /**
    * Returns rWb, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontoweber, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.rontoweber : Expression
    /**
    * Returns rontoweber, 10^-27 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField()  
/**
* rWb, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val rWb = 10.0.pow(-27) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* rontoweber, 10^-27 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val rontoweber = rWb
    

/**
* qWb, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
*/    
val Number.qWb : Expression
    @JvmName("getqWb_prop")
    /**
    * Returns qWb, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectoweber, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val Number.quectoweber : Expression
    /**
    * Returns quectoweber, 10^-30 of of weber, derived SI-Unit for measurement of magnetic flux
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField()  
/**
* qWb, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
*/        
val qWb = 10.0.pow(-30) * (kg*(m2) * (s `^` -2) * (A `^` -1))

/**
* quectoweber, 10^-30 of weber, derived SI-Unit for measurement of magnetic flux
*/ 
val quectoweber = qWb
    