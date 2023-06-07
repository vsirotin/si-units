
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
//import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  (m*m)*(s `^` -2)

@JsExport
/**
* System International Unit for absorbed dose (of ionising radiation).
*/
class Gray(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for absorbed dose (of ionising radiation).
*/
@JsExport
@JvmField
val Gy = Gray(1.0)

/**
* Creates Gray-Object for current number value. Gray is a System International Unit for absorbed dose (of ionising radiation).
*/
val Number.Gy : Gray
   /**
   * Returns Gray-Object for current number value. Gray is a System International Unit for absorbed dose (of ionising radiation).
   */
    get() = Gray(this.toDouble())

    
/**
* QGy, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.QGy : Gray
    @JvmName("getQGy_prop")
    /**
    * Returns QGy, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(30))

/**
* quettagray, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.quettagray : Gray
    /**
    * Returns quettagray, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* QGy, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val QGy = 10.0.pow(30) * ((m*m)*(s `^` -2))

/**
* quettagray, 10^30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val quettagray = QGy
    

/**
* RGy, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.RGy : Gray
    @JvmName("getRGy_prop")
    /**
    * Returns RGy, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(27))

/**
* ronnagray, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.ronnagray : Gray
    /**
    * Returns ronnagray, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* RGy, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val RGy = 10.0.pow(27) * ((m*m)*(s `^` -2))

/**
* ronnagray, 10^27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val ronnagray = RGy
    

/**
* YGy, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.YGy : Gray
    @JvmName("getYGy_prop")
    /**
    * Returns YGy, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(24))

/**
* yottagray, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.yottagray : Gray
    /**
    * Returns yottagray, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* YGy, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val YGy = 10.0.pow(24) * ((m*m)*(s `^` -2))

/**
* yottagray, 10^24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val yottagray = YGy
    

/**
* ZGy, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.ZGy : Gray
    @JvmName("getZGy_prop")
    /**
    * Returns ZGy, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(21))

/**
* zettagray, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.zettagray : Gray
    /**
    * Returns zettagray, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* ZGy, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val ZGy = 10.0.pow(21) * ((m*m)*(s `^` -2))

/**
* zettagray, 10^21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val zettagray = ZGy
    

/**
* EGy, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.EGy : Gray
    @JvmName("getEGy_prop")
    /**
    * Returns EGy, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(18))

/**
* exagray, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.exagray : Gray
    /**
    * Returns exagray, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* EGy, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val EGy = 10.0.pow(18) * ((m*m)*(s `^` -2))

/**
* exagray, 10^18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val exagray = EGy
    

/**
* PGy, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.PGy : Gray
    @JvmName("getPGy_prop")
    /**
    * Returns PGy, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(15))

/**
* petagray, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.petagray : Gray
    /**
    * Returns petagray, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* PGy, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val PGy = 10.0.pow(15) * ((m*m)*(s `^` -2))

/**
* petagray, 10^15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val petagray = PGy
    

/**
* TGy, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.TGy : Gray
    @JvmName("getTGy_prop")
    /**
    * Returns TGy, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(12))

/**
* teragray, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.teragray : Gray
    /**
    * Returns teragray, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* TGy, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val TGy = 10.0.pow(12) * ((m*m)*(s `^` -2))

/**
* teragray, 10^12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val teragray = TGy
    

/**
* GGy, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.GGy : Gray
    @JvmName("getGGy_prop")
    /**
    * Returns GGy, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(9))

/**
* gigagray, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.gigagray : Gray
    /**
    * Returns gigagray, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* GGy, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val GGy = 10.0.pow(9) * ((m*m)*(s `^` -2))

/**
* gigagray, 10^9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val gigagray = GGy
    

/**
* MGy, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.MGy : Gray
    @JvmName("getMGy_prop")
    /**
    * Returns MGy, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(6))

/**
* megagray, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.megagray : Gray
    /**
    * Returns megagray, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* MGy, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val MGy = 10.0.pow(6) * ((m*m)*(s `^` -2))

/**
* megagray, 10^6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val megagray = MGy
    

/**
* kGy, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.kGy : Gray
    @JvmName("getkGy_prop")
    /**
    * Returns kGy, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(3))

/**
* kilogray, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.kilogray : Gray
    /**
    * Returns kilogray, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* kGy, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val kGy = 10.0.pow(3) * ((m*m)*(s `^` -2))

/**
* kilogray, 10^3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val kilogray = kGy
    

/**
* hGy, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.hGy : Gray
    @JvmName("gethGy_prop")
    /**
    * Returns hGy, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(2))

/**
* hectogray, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.hectogray : Gray
    /**
    * Returns hectogray, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hGy, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val hGy = 10.0.pow(2) * ((m*m)*(s `^` -2))

/**
* hectogray, 10^2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val hectogray = hGy
    

/**
* daGy, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.daGy : Gray
    @JvmName("getdaGy_prop")
    /**
    * Returns daGy, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(1))

/**
* decagray, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.decagray : Gray
    /**
    * Returns decagray, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* daGy, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val daGy = 10.0.pow(1) * ((m*m)*(s `^` -2))

/**
* decagray, 10^1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val decagray = daGy
    

/**
* dGy, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.dGy : Gray
    @JvmName("getdGy_prop")
    /**
    * Returns dGy, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-1))

/**
* decigray, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.decigray : Gray
    /**
    * Returns decigray, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dGy, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val dGy = 10.0.pow(-1) * ((m*m)*(s `^` -2))

/**
* decigray, 10^-1 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val decigray = dGy
    

/**
* cGy, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.cGy : Gray
    @JvmName("getcGy_prop")
    /**
    * Returns cGy, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-2))

/**
* centigray, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.centigray : Gray
    /**
    * Returns centigray, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* cGy, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val cGy = 10.0.pow(-2) * ((m*m)*(s `^` -2))

/**
* centigray, 10^-2 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val centigray = cGy
    

/**
* mGy, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.mGy : Gray
    @JvmName("getmGy_prop")
    /**
    * Returns mGy, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-3))

/**
* milligray, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.milligray : Gray
    /**
    * Returns milligray, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mGy, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val mGy = 10.0.pow(-3) * ((m*m)*(s `^` -2))

/**
* milligray, 10^-3 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val milligray = mGy
    

/**
* μGy, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.μGy : Gray
    @JvmName("getμGy_prop")
    /**
    * Returns μGy, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-6))

/**
* microgray, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.microgray : Gray
    /**
    * Returns microgray, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μGy, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val μGy = 10.0.pow(-6) * ((m*m)*(s `^` -2))

/**
* microgray, 10^-6 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val microgray = μGy
    

/**
* nGy, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.nGy : Gray
    @JvmName("getnGy_prop")
    /**
    * Returns nGy, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-9))

/**
* nanogray, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.nanogray : Gray
    /**
    * Returns nanogray, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nGy, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val nGy = 10.0.pow(-9) * ((m*m)*(s `^` -2))

/**
* nanogray, 10^-9 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val nanogray = nGy
    

/**
* pGy, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.pGy : Gray
    @JvmName("getpGy_prop")
    /**
    * Returns pGy, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-12))

/**
* picogray, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.picogray : Gray
    /**
    * Returns picogray, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* pGy, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val pGy = 10.0.pow(-12) * ((m*m)*(s `^` -2))

/**
* picogray, 10^-12 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val picogray = pGy
    

/**
* fGy, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.fGy : Gray
    @JvmName("getfGy_prop")
    /**
    * Returns fGy, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-15))

/**
* femtogray, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.femtogray : Gray
    /**
    * Returns femtogray, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* fGy, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val fGy = 10.0.pow(-15) * ((m*m)*(s `^` -2))

/**
* femtogray, 10^-15 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val femtogray = fGy
    

/**
* aGy, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.aGy : Gray
    @JvmName("getaGy_prop")
    /**
    * Returns aGy, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-18))

/**
* attogray, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.attogray : Gray
    /**
    * Returns attogray, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* aGy, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val aGy = 10.0.pow(-18) * ((m*m)*(s `^` -2))

/**
* attogray, 10^-18 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val attogray = aGy
    

/**
* zGy, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.zGy : Gray
    @JvmName("getzGy_prop")
    /**
    * Returns zGy, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-21))

/**
* zeptogray, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.zeptogray : Gray
    /**
    * Returns zeptogray, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zGy, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val zGy = 10.0.pow(-21) * ((m*m)*(s `^` -2))

/**
* zeptogray, 10^-21 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val zeptogray = zGy
    

/**
* yGy, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.yGy : Gray
    @JvmName("getyGy_prop")
    /**
    * Returns yGy, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-24))

/**
* yoctogray, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.yoctogray : Gray
    /**
    * Returns yoctogray, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* yGy, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val yGy = 10.0.pow(-24) * ((m*m)*(s `^` -2))

/**
* yoctogray, 10^-24 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val yoctogray = yGy
    

/**
* rGy, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.rGy : Gray
    @JvmName("getrGy_prop")
    /**
    * Returns rGy, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-27))

/**
* rontogray, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.rontogray : Gray
    /**
    * Returns rontogray, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rGy, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val rGy = 10.0.pow(-27) * ((m*m)*(s `^` -2))

/**
* rontogray, 10^-27 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val rontogray = rGy
    

/**
* qGy, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/    
val Number.qGy : Gray
    @JvmName("getqGy_prop")
    /**
    * Returns qGy, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-30))

/**
* quectogray, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 
val Number.quectogray : Gray
    /**
    * Returns quectogray, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
    */  
    get() = Gray(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qGy, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/        
val qGy = 10.0.pow(-30) * ((m*m)*(s `^` -2))

/**
* quectogray, 10^-30 of gray, derived SI-Unit for measurement of absorbed dose (of ionising radiation)
*/ 

@JsExport
@JvmField
val quectogray = qGy
    