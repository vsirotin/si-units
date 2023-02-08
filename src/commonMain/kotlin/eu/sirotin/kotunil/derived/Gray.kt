
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.math.pow

private val unit =  (m2)*(s `^` -2)

/**
* System International Unit for absorbed dose (of ionising radiation).
*/
val Gy = unit

/**
* Creates Gray-Object for current number value. Gray is a System International Unit for absorbed dose (of ionising radiation).
*/
val Number.Gy : Expression
   /**
   * Returns Gray-Object for current number value. Gray is a System International Unit for absorbed dose (of ionising radiation).
   */
    get() = this.toDouble() * unit

    
/**
* QGy, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.QGy : Expression
    @JvmName("getQGy_prop")
    /**
    * Returns QGy, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettagray, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.quettagray : Expression
    /**
    * Returns quettagray, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit


@JvmField  
/**
* QGy, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val QGy = 10.0.pow(30) * ((m2)*(s `^` -2))

/**
* quettagray, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val quettagray = QGy
    

/**
* RGy, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.RGy : Expression
    @JvmName("getRGy_prop")
    /**
    * Returns RGy, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnagray, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.ronnagray : Expression
    /**
    * Returns ronnagray, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit


@JvmField  
/**
* RGy, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val RGy = 10.0.pow(27) * ((m2)*(s `^` -2))

/**
* ronnagray, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val ronnagray = RGy
    

/**
* YGy, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.YGy : Expression
    @JvmName("getYGy_prop")
    /**
    * Returns YGy, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottagray, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.yottagray : Expression
    /**
    * Returns yottagray, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit


@JvmField  
/**
* YGy, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val YGy = 10.0.pow(24) * ((m2)*(s `^` -2))

/**
* yottagray, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val yottagray = YGy
    

/**
* ZGy, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.ZGy : Expression
    @JvmName("getZGy_prop")
    /**
    * Returns ZGy, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettagray, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.zettagray : Expression
    /**
    * Returns zettagray, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit


@JvmField  
/**
* ZGy, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val ZGy = 10.0.pow(21) * ((m2)*(s `^` -2))

/**
* zettagray, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val zettagray = ZGy
    

/**
* EGy, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.EGy : Expression
    @JvmName("getEGy_prop")
    /**
    * Returns EGy, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exagray, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.exagray : Expression
    /**
    * Returns exagray, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit


@JvmField  
/**
* EGy, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val EGy = 10.0.pow(18) * ((m2)*(s `^` -2))

/**
* exagray, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val exagray = EGy
    

/**
* PGy, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.PGy : Expression
    @JvmName("getPGy_prop")
    /**
    * Returns PGy, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petagray, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.petagray : Expression
    /**
    * Returns petagray, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit


@JvmField  
/**
* PGy, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val PGy = 10.0.pow(15) * ((m2)*(s `^` -2))

/**
* petagray, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val petagray = PGy
    

/**
* TGy, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.TGy : Expression
    @JvmName("getTGy_prop")
    /**
    * Returns TGy, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* teragray, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.teragray : Expression
    /**
    * Returns teragray, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit


@JvmField  
/**
* TGy, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val TGy = 10.0.pow(12) * ((m2)*(s `^` -2))

/**
* teragray, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val teragray = TGy
    

/**
* GGy, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.GGy : Expression
    @JvmName("getGGy_prop")
    /**
    * Returns GGy, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigagray, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.gigagray : Expression
    /**
    * Returns gigagray, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit


@JvmField  
/**
* GGy, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val GGy = 10.0.pow(9) * ((m2)*(s `^` -2))

/**
* gigagray, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val gigagray = GGy
    

/**
* MGy, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.MGy : Expression
    @JvmName("getMGy_prop")
    /**
    * Returns MGy, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megagray, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.megagray : Expression
    /**
    * Returns megagray, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit


@JvmField  
/**
* MGy, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val MGy = 10.0.pow(6) * ((m2)*(s `^` -2))

/**
* megagray, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val megagray = MGy
    

/**
* kGy, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.kGy : Expression
    @JvmName("getkGy_prop")
    /**
    * Returns kGy, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilogray, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.kilogray : Expression
    /**
    * Returns kilogray, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit


@JvmField  
/**
* kGy, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val kGy = 10.0.pow(3) * ((m2)*(s `^` -2))

/**
* kilogray, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val kilogray = kGy
    

/**
* hGy, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.hGy : Expression
    @JvmName("gethGy_prop")
    /**
    * Returns hGy, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectogray, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.hectogray : Expression
    /**
    * Returns hectogray, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit


@JvmField  
/**
* hGy, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val hGy = 10.0.pow(2) * ((m2)*(s `^` -2))

/**
* hectogray, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val hectogray = hGy
    

/**
* daGy, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.daGy : Expression
    @JvmName("getdaGy_prop")
    /**
    * Returns daGy, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decagray, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.decagray : Expression
    /**
    * Returns decagray, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit


@JvmField  
/**
* daGy, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val daGy = 10.0.pow(1) * ((m2)*(s `^` -2))

/**
* decagray, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val decagray = daGy
    

/**
* dGy, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.dGy : Expression
    @JvmName("getdGy_prop")
    /**
    * Returns dGy, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decigray, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.decigray : Expression
    /**
    * Returns decigray, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit


@JvmField  
/**
* dGy, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val dGy = 10.0.pow(-1) * ((m2)*(s `^` -2))

/**
* decigray, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val decigray = dGy
    

/**
* cGy, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.cGy : Expression
    @JvmName("getcGy_prop")
    /**
    * Returns cGy, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centigray, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.centigray : Expression
    /**
    * Returns centigray, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit


@JvmField  
/**
* cGy, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val cGy = 10.0.pow(-2) * ((m2)*(s `^` -2))

/**
* centigray, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val centigray = cGy
    

/**
* mGy, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.mGy : Expression
    @JvmName("getmGy_prop")
    /**
    * Returns mGy, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* milligray, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.milligray : Expression
    /**
    * Returns milligray, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField  
/**
* mGy, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val mGy = 10.0.pow(-3) * ((m2)*(s `^` -2))

/**
* milligray, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val milligray = mGy
    

/**
* μGy, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.μGy : Expression
    @JvmName("getμGy_prop")
    /**
    * Returns μGy, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microgray, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.microgray : Expression
    /**
    * Returns microgray, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit


@JvmField  
/**
* μGy, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val μGy = 10.0.pow(-6) * ((m2)*(s `^` -2))

/**
* microgray, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val microgray = μGy
    

/**
* nGy, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.nGy : Expression
    @JvmName("getnGy_prop")
    /**
    * Returns nGy, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanogray, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.nanogray : Expression
    /**
    * Returns nanogray, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit


@JvmField  
/**
* nGy, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val nGy = 10.0.pow(-9) * ((m2)*(s `^` -2))

/**
* nanogray, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val nanogray = nGy
    

/**
* pGy, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.pGy : Expression
    @JvmName("getpGy_prop")
    /**
    * Returns pGy, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picogray, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.picogray : Expression
    /**
    * Returns picogray, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField  
/**
* pGy, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val pGy = 10.0.pow(-12) * ((m2)*(s `^` -2))

/**
* picogray, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val picogray = pGy
    

/**
* fGy, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.fGy : Expression
    @JvmName("getfGy_prop")
    /**
    * Returns fGy, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtogray, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.femtogray : Expression
    /**
    * Returns femtogray, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit


@JvmField  
/**
* fGy, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val fGy = 10.0.pow(-15) * ((m2)*(s `^` -2))

/**
* femtogray, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val femtogray = fGy
    

/**
* aGy, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.aGy : Expression
    @JvmName("getaGy_prop")
    /**
    * Returns aGy, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attogray, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.attogray : Expression
    /**
    * Returns attogray, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit


@JvmField  
/**
* aGy, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val aGy = 10.0.pow(-18) * ((m2)*(s `^` -2))

/**
* attogray, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val attogray = aGy
    

/**
* zGy, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.zGy : Expression
    @JvmName("getzGy_prop")
    /**
    * Returns zGy, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptogray, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.zeptogray : Expression
    /**
    * Returns zeptogray, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField  
/**
* zGy, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val zGy = 10.0.pow(-21) * ((m2)*(s `^` -2))

/**
* zeptogray, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val zeptogray = zGy
    

/**
* yGy, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.yGy : Expression
    @JvmName("getyGy_prop")
    /**
    * Returns yGy, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctogray, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.yoctogray : Expression
    /**
    * Returns yoctogray, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField  
/**
* yGy, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val yGy = 10.0.pow(-24) * ((m2)*(s `^` -2))

/**
* yoctogray, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val yoctogray = yGy
    

/**
* rGy, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.rGy : Expression
    @JvmName("getrGy_prop")
    /**
    * Returns rGy, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontogray, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.rontogray : Expression
    /**
    * Returns rontogray, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField  
/**
* rGy, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val rGy = 10.0.pow(-27) * ((m2)*(s `^` -2))

/**
* rontogray, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val rontogray = rGy
    

/**
* qGy, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.qGy : Expression
    @JvmName("getqGy_prop")
    /**
    * Returns qGy, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectogray, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.quectogray : Expression
    /**
    * Returns quectogray, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField  
/**
* qGy, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val qGy = 10.0.pow(-30) * ((m2)*(s `^` -2))

/**
* quectogray, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val quectogray = qGy
    