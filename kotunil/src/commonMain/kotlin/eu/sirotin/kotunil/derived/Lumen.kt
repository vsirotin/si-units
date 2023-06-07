
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
//import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  ((cd `^` 1)*sr)

@JsExport
/**
* System International Unit for luminous flux.
*/
class Lumen(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for luminous flux.
*/
@JsExport
@JvmField
val lm = Lumen(1.0)

/**
* Creates Lumen-Object for current number value. Lumen is a System International Unit for luminous flux.
*/
val Number.lm : Lumen
   /**
   * Returns Lumen-Object for current number value. Lumen is a System International Unit for luminous flux.
   */
    get() = Lumen(this.toDouble())

    
/**
* Qlm, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Qlm : Lumen
    @JvmName("getQlm_prop")
    /**
    * Returns Qlm, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(30))

/**
* quettalumen, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.quettalumen : Lumen
    /**
    * Returns quettalumen, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* Qlm, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Qlm = 10.0.pow(30) * (((cd `^` 1)*sr))

/**
* quettalumen, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val quettalumen = Qlm
    

/**
* Rlm, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Rlm : Lumen
    @JvmName("getRlm_prop")
    /**
    * Returns Rlm, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(27))

/**
* ronnalumen, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.ronnalumen : Lumen
    /**
    * Returns ronnalumen, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* Rlm, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Rlm = 10.0.pow(27) * (((cd `^` 1)*sr))

/**
* ronnalumen, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val ronnalumen = Rlm
    

/**
* Ylm, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Ylm : Lumen
    @JvmName("getYlm_prop")
    /**
    * Returns Ylm, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(24))

/**
* yottalumen, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.yottalumen : Lumen
    /**
    * Returns yottalumen, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* Ylm, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Ylm = 10.0.pow(24) * (((cd `^` 1)*sr))

/**
* yottalumen, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val yottalumen = Ylm
    

/**
* Zlm, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Zlm : Lumen
    @JvmName("getZlm_prop")
    /**
    * Returns Zlm, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(21))

/**
* zettalumen, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.zettalumen : Lumen
    /**
    * Returns zettalumen, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* Zlm, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Zlm = 10.0.pow(21) * (((cd `^` 1)*sr))

/**
* zettalumen, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val zettalumen = Zlm
    

/**
* Elm, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Elm : Lumen
    @JvmName("getElm_prop")
    /**
    * Returns Elm, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(18))

/**
* exalumen, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.exalumen : Lumen
    /**
    * Returns exalumen, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* Elm, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Elm = 10.0.pow(18) * (((cd `^` 1)*sr))

/**
* exalumen, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val exalumen = Elm
    

/**
* Plm, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Plm : Lumen
    @JvmName("getPlm_prop")
    /**
    * Returns Plm, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(15))

/**
* petalumen, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.petalumen : Lumen
    /**
    * Returns petalumen, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* Plm, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Plm = 10.0.pow(15) * (((cd `^` 1)*sr))

/**
* petalumen, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val petalumen = Plm
    

/**
* Tlm, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Tlm : Lumen
    @JvmName("getTlm_prop")
    /**
    * Returns Tlm, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(12))

/**
* teralumen, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.teralumen : Lumen
    /**
    * Returns teralumen, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* Tlm, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Tlm = 10.0.pow(12) * (((cd `^` 1)*sr))

/**
* teralumen, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val teralumen = Tlm
    

/**
* Glm, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Glm : Lumen
    @JvmName("getGlm_prop")
    /**
    * Returns Glm, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(9))

/**
* gigalumen, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.gigalumen : Lumen
    /**
    * Returns gigalumen, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* Glm, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Glm = 10.0.pow(9) * (((cd `^` 1)*sr))

/**
* gigalumen, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val gigalumen = Glm
    

/**
* Mlm, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Mlm : Lumen
    @JvmName("getMlm_prop")
    /**
    * Returns Mlm, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(6))

/**
* megalumen, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.megalumen : Lumen
    /**
    * Returns megalumen, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* Mlm, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Mlm = 10.0.pow(6) * (((cd `^` 1)*sr))

/**
* megalumen, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val megalumen = Mlm
    

/**
* klm, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.klm : Lumen
    @JvmName("getklm_prop")
    /**
    * Returns klm, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(3))

/**
* kilolumen, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.kilolumen : Lumen
    /**
    * Returns kilolumen, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* klm, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val klm = 10.0.pow(3) * (((cd `^` 1)*sr))

/**
* kilolumen, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val kilolumen = klm
    

/**
* hlm, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.hlm : Lumen
    @JvmName("gethlm_prop")
    /**
    * Returns hlm, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(2))

/**
* hectolumen, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.hectolumen : Lumen
    /**
    * Returns hectolumen, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hlm, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val hlm = 10.0.pow(2) * (((cd `^` 1)*sr))

/**
* hectolumen, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val hectolumen = hlm
    

/**
* dalm, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.dalm : Lumen
    @JvmName("getdalm_prop")
    /**
    * Returns dalm, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(1))

/**
* decalumen, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.decalumen : Lumen
    /**
    * Returns decalumen, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* dalm, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val dalm = 10.0.pow(1) * (((cd `^` 1)*sr))

/**
* decalumen, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val decalumen = dalm
    

/**
* dlm, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.dlm : Lumen
    @JvmName("getdlm_prop")
    /**
    * Returns dlm, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-1))

/**
* decilumen, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.decilumen : Lumen
    /**
    * Returns decilumen, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dlm, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val dlm = 10.0.pow(-1) * (((cd `^` 1)*sr))

/**
* decilumen, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val decilumen = dlm
    

/**
* clm, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.clm : Lumen
    @JvmName("getclm_prop")
    /**
    * Returns clm, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-2))

/**
* centilumen, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.centilumen : Lumen
    /**
    * Returns centilumen, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* clm, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val clm = 10.0.pow(-2) * (((cd `^` 1)*sr))

/**
* centilumen, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val centilumen = clm
    

/**
* mlm, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.mlm : Lumen
    @JvmName("getmlm_prop")
    /**
    * Returns mlm, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-3))

/**
* millilumen, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.millilumen : Lumen
    /**
    * Returns millilumen, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mlm, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val mlm = 10.0.pow(-3) * (((cd `^` 1)*sr))

/**
* millilumen, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val millilumen = mlm
    

/**
* μlm, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.μlm : Lumen
    @JvmName("getμlm_prop")
    /**
    * Returns μlm, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-6))

/**
* microlumen, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.microlumen : Lumen
    /**
    * Returns microlumen, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μlm, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val μlm = 10.0.pow(-6) * (((cd `^` 1)*sr))

/**
* microlumen, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val microlumen = μlm
    

/**
* nlm, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.nlm : Lumen
    @JvmName("getnlm_prop")
    /**
    * Returns nlm, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-9))

/**
* nanolumen, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.nanolumen : Lumen
    /**
    * Returns nanolumen, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nlm, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val nlm = 10.0.pow(-9) * (((cd `^` 1)*sr))

/**
* nanolumen, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val nanolumen = nlm
    

/**
* plm, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.plm : Lumen
    @JvmName("getplm_prop")
    /**
    * Returns plm, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-12))

/**
* picolumen, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.picolumen : Lumen
    /**
    * Returns picolumen, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* plm, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val plm = 10.0.pow(-12) * (((cd `^` 1)*sr))

/**
* picolumen, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val picolumen = plm
    

/**
* flm, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.flm : Lumen
    @JvmName("getflm_prop")
    /**
    * Returns flm, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-15))

/**
* femtolumen, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.femtolumen : Lumen
    /**
    * Returns femtolumen, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* flm, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val flm = 10.0.pow(-15) * (((cd `^` 1)*sr))

/**
* femtolumen, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val femtolumen = flm
    

/**
* alm, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.alm : Lumen
    @JvmName("getalm_prop")
    /**
    * Returns alm, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-18))

/**
* attolumen, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.attolumen : Lumen
    /**
    * Returns attolumen, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* alm, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val alm = 10.0.pow(-18) * (((cd `^` 1)*sr))

/**
* attolumen, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val attolumen = alm
    

/**
* zlm, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.zlm : Lumen
    @JvmName("getzlm_prop")
    /**
    * Returns zlm, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-21))

/**
* zeptolumen, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.zeptolumen : Lumen
    /**
    * Returns zeptolumen, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zlm, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val zlm = 10.0.pow(-21) * (((cd `^` 1)*sr))

/**
* zeptolumen, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val zeptolumen = zlm
    

/**
* ylm, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.ylm : Lumen
    @JvmName("getylm_prop")
    /**
    * Returns ylm, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-24))

/**
* yoctolumen, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.yoctolumen : Lumen
    /**
    * Returns yoctolumen, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* ylm, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val ylm = 10.0.pow(-24) * (((cd `^` 1)*sr))

/**
* yoctolumen, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val yoctolumen = ylm
    

/**
* rlm, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.rlm : Lumen
    @JvmName("getrlm_prop")
    /**
    * Returns rlm, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-27))

/**
* rontolumen, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.rontolumen : Lumen
    /**
    * Returns rontolumen, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rlm, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val rlm = 10.0.pow(-27) * (((cd `^` 1)*sr))

/**
* rontolumen, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val rontolumen = rlm
    

/**
* qlm, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.qlm : Lumen
    @JvmName("getqlm_prop")
    /**
    * Returns qlm, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-30))

/**
* quectolumen, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.quectolumen : Lumen
    /**
    * Returns quectolumen, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = Lumen(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qlm, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val qlm = 10.0.pow(-30) * (((cd `^` 1)*sr))

/**
* quectolumen, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
*/ 

@JsExport
@JvmField
val quectolumen = qlm
    