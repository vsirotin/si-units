
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.math.pow

private val unit =  ((cd `^` 1)*sr)

/**
* System International Unit for luminous flux.
*/
val lm = unit

/**
* Creates Lumen-Object for current number value. Lumen is a System International Unit for luminous flux.
*/
val Number.lm : Expression
   /**
   * Returns Lumen-Object for current number value. Lumen is a System International Unit for luminous flux.
   */
    get() = this.toDouble() * unit

    
/**
* Qlm, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Qlm : Expression
    @JvmName("getQlm_prop")
    /**
    * Returns Qlm, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettalumen, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.quettalumen : Expression
    /**
    * Returns quettalumen, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit


@JvmField  
/**
* Qlm, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Qlm = 10.0.pow(30) * (((cd `^` 1)*sr))

/**
* quettalumen, 10^30 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val quettalumen = Qlm
    

/**
* Rlm, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Rlm : Expression
    @JvmName("getRlm_prop")
    /**
    * Returns Rlm, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnalumen, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.ronnalumen : Expression
    /**
    * Returns ronnalumen, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit


@JvmField  
/**
* Rlm, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Rlm = 10.0.pow(27) * (((cd `^` 1)*sr))

/**
* ronnalumen, 10^27 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val ronnalumen = Rlm
    

/**
* Ylm, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Ylm : Expression
    @JvmName("getYlm_prop")
    /**
    * Returns Ylm, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottalumen, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.yottalumen : Expression
    /**
    * Returns yottalumen, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit


@JvmField  
/**
* Ylm, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Ylm = 10.0.pow(24) * (((cd `^` 1)*sr))

/**
* yottalumen, 10^24 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val yottalumen = Ylm
    

/**
* Zlm, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Zlm : Expression
    @JvmName("getZlm_prop")
    /**
    * Returns Zlm, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettalumen, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.zettalumen : Expression
    /**
    * Returns zettalumen, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit


@JvmField  
/**
* Zlm, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Zlm = 10.0.pow(21) * (((cd `^` 1)*sr))

/**
* zettalumen, 10^21 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val zettalumen = Zlm
    

/**
* Elm, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Elm : Expression
    @JvmName("getElm_prop")
    /**
    * Returns Elm, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exalumen, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.exalumen : Expression
    /**
    * Returns exalumen, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit


@JvmField  
/**
* Elm, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Elm = 10.0.pow(18) * (((cd `^` 1)*sr))

/**
* exalumen, 10^18 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val exalumen = Elm
    

/**
* Plm, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Plm : Expression
    @JvmName("getPlm_prop")
    /**
    * Returns Plm, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petalumen, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.petalumen : Expression
    /**
    * Returns petalumen, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit


@JvmField  
/**
* Plm, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Plm = 10.0.pow(15) * (((cd `^` 1)*sr))

/**
* petalumen, 10^15 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val petalumen = Plm
    

/**
* Tlm, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Tlm : Expression
    @JvmName("getTlm_prop")
    /**
    * Returns Tlm, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* teralumen, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.teralumen : Expression
    /**
    * Returns teralumen, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit


@JvmField  
/**
* Tlm, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Tlm = 10.0.pow(12) * (((cd `^` 1)*sr))

/**
* teralumen, 10^12 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val teralumen = Tlm
    

/**
* Glm, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Glm : Expression
    @JvmName("getGlm_prop")
    /**
    * Returns Glm, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigalumen, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.gigalumen : Expression
    /**
    * Returns gigalumen, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit


@JvmField  
/**
* Glm, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Glm = 10.0.pow(9) * (((cd `^` 1)*sr))

/**
* gigalumen, 10^9 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val gigalumen = Glm
    

/**
* Mlm, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.Mlm : Expression
    @JvmName("getMlm_prop")
    /**
    * Returns Mlm, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megalumen, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.megalumen : Expression
    /**
    * Returns megalumen, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit


@JvmField  
/**
* Mlm, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val Mlm = 10.0.pow(6) * (((cd `^` 1)*sr))

/**
* megalumen, 10^6 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val megalumen = Mlm
    

/**
* klm, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.klm : Expression
    @JvmName("getklm_prop")
    /**
    * Returns klm, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilolumen, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.kilolumen : Expression
    /**
    * Returns kilolumen, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit


@JvmField  
/**
* klm, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val klm = 10.0.pow(3) * (((cd `^` 1)*sr))

/**
* kilolumen, 10^3 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val kilolumen = klm
    

/**
* hlm, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.hlm : Expression
    @JvmName("gethlm_prop")
    /**
    * Returns hlm, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectolumen, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.hectolumen : Expression
    /**
    * Returns hectolumen, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit


@JvmField  
/**
* hlm, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val hlm = 10.0.pow(2) * (((cd `^` 1)*sr))

/**
* hectolumen, 10^2 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val hectolumen = hlm
    

/**
* dalm, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.dalm : Expression
    @JvmName("getdalm_prop")
    /**
    * Returns dalm, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decalumen, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.decalumen : Expression
    /**
    * Returns decalumen, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit


@JvmField  
/**
* dalm, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val dalm = 10.0.pow(1) * (((cd `^` 1)*sr))

/**
* decalumen, 10^1 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val decalumen = dalm
    

/**
* dlm, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.dlm : Expression
    @JvmName("getdlm_prop")
    /**
    * Returns dlm, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decilumen, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.decilumen : Expression
    /**
    * Returns decilumen, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit


@JvmField  
/**
* dlm, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val dlm = 10.0.pow(-1) * (((cd `^` 1)*sr))

/**
* decilumen, 10^-1 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val decilumen = dlm
    

/**
* clm, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.clm : Expression
    @JvmName("getclm_prop")
    /**
    * Returns clm, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centilumen, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.centilumen : Expression
    /**
    * Returns centilumen, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit


@JvmField  
/**
* clm, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val clm = 10.0.pow(-2) * (((cd `^` 1)*sr))

/**
* centilumen, 10^-2 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val centilumen = clm
    

/**
* mlm, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.mlm : Expression
    @JvmName("getmlm_prop")
    /**
    * Returns mlm, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millilumen, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.millilumen : Expression
    /**
    * Returns millilumen, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField  
/**
* mlm, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val mlm = 10.0.pow(-3) * (((cd `^` 1)*sr))

/**
* millilumen, 10^-3 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val millilumen = mlm
    

/**
* μlm, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.μlm : Expression
    @JvmName("getμlm_prop")
    /**
    * Returns μlm, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microlumen, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.microlumen : Expression
    /**
    * Returns microlumen, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit


@JvmField  
/**
* μlm, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val μlm = 10.0.pow(-6) * (((cd `^` 1)*sr))

/**
* microlumen, 10^-6 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val microlumen = μlm
    

/**
* nlm, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.nlm : Expression
    @JvmName("getnlm_prop")
    /**
    * Returns nlm, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanolumen, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.nanolumen : Expression
    /**
    * Returns nanolumen, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit


@JvmField  
/**
* nlm, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val nlm = 10.0.pow(-9) * (((cd `^` 1)*sr))

/**
* nanolumen, 10^-9 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val nanolumen = nlm
    

/**
* plm, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.plm : Expression
    @JvmName("getplm_prop")
    /**
    * Returns plm, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picolumen, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.picolumen : Expression
    /**
    * Returns picolumen, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField  
/**
* plm, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val plm = 10.0.pow(-12) * (((cd `^` 1)*sr))

/**
* picolumen, 10^-12 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val picolumen = plm
    

/**
* flm, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.flm : Expression
    @JvmName("getflm_prop")
    /**
    * Returns flm, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtolumen, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.femtolumen : Expression
    /**
    * Returns femtolumen, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit


@JvmField  
/**
* flm, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val flm = 10.0.pow(-15) * (((cd `^` 1)*sr))

/**
* femtolumen, 10^-15 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val femtolumen = flm
    

/**
* alm, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.alm : Expression
    @JvmName("getalm_prop")
    /**
    * Returns alm, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attolumen, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.attolumen : Expression
    /**
    * Returns attolumen, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit


@JvmField  
/**
* alm, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val alm = 10.0.pow(-18) * (((cd `^` 1)*sr))

/**
* attolumen, 10^-18 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val attolumen = alm
    

/**
* zlm, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.zlm : Expression
    @JvmName("getzlm_prop")
    /**
    * Returns zlm, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptolumen, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.zeptolumen : Expression
    /**
    * Returns zeptolumen, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField  
/**
* zlm, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val zlm = 10.0.pow(-21) * (((cd `^` 1)*sr))

/**
* zeptolumen, 10^-21 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val zeptolumen = zlm
    

/**
* ylm, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.ylm : Expression
    @JvmName("getylm_prop")
    /**
    * Returns ylm, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctolumen, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.yoctolumen : Expression
    /**
    * Returns yoctolumen, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField  
/**
* ylm, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val ylm = 10.0.pow(-24) * (((cd `^` 1)*sr))

/**
* yoctolumen, 10^-24 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val yoctolumen = ylm
    

/**
* rlm, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.rlm : Expression
    @JvmName("getrlm_prop")
    /**
    * Returns rlm, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontolumen, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.rontolumen : Expression
    /**
    * Returns rontolumen, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField  
/**
* rlm, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val rlm = 10.0.pow(-27) * (((cd `^` 1)*sr))

/**
* rontolumen, 10^-27 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val rontolumen = rlm
    

/**
* qlm, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
*/    
val Number.qlm : Expression
    @JvmName("getqlm_prop")
    /**
    * Returns qlm, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectolumen, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val Number.quectolumen : Expression
    /**
    * Returns quectolumen, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField  
/**
* qlm, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
*/        
val qlm = 10.0.pow(-30) * (((cd `^` 1)*sr))

/**
* quectolumen, 10^-30 of lumen, derived SI-Unit for measurement of luminous flux
*/ 
val quectolumen = qlm
    