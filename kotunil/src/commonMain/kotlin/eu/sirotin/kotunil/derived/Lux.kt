
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  cd*sr*(m `^` -2)

@JsExport
@Suppress("NON_EXPORTABLE_TYPE")
/**
* System International Unit for illuminance.
*/
class Lux(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for illuminance.
*/
@JsExport
@JvmField
val lx = Lux(1.0)

/**
* Creates Lux-Object for current number value. Lux is a System International Unit for illuminance.
*/
val Number.lx : Lux
   /**
   * Returns Lux-Object for current number value. Lux is a System International Unit for illuminance.
   */
    get() = Lux(this.toDouble())

    
/**
* Qlx, 10^30 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Qlx : Lux
    @JvmName("getQlx_prop")
    /**
    * Returns Qlx, 10^30 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(30))

/**
* quettalux, 10^30 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.quettalux : Lux
    /**
    * Returns quettalux, 10^30 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(30))

@JsExport
@JvmField
/**
* Qlx, 10^30 of lux, derived SI-Unit for measurement of illuminance
*/        
val Qlx = 10.0.pow(30) * (cd*sr*(m `^` -2))

/**
* quettalux, 10^30 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val quettalux = Qlx
    

/**
* Rlx, 10^27 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Rlx : Lux
    @JvmName("getRlx_prop")
    /**
    * Returns Rlx, 10^27 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(27))

/**
* ronnalux, 10^27 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.ronnalux : Lux
    /**
    * Returns ronnalux, 10^27 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(27))

@JsExport
@JvmField
/**
* Rlx, 10^27 of lux, derived SI-Unit for measurement of illuminance
*/        
val Rlx = 10.0.pow(27) * (cd*sr*(m `^` -2))

/**
* ronnalux, 10^27 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val ronnalux = Rlx
    

/**
* Ylx, 10^24 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Ylx : Lux
    @JvmName("getYlx_prop")
    /**
    * Returns Ylx, 10^24 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(24))

/**
* yottalux, 10^24 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.yottalux : Lux
    /**
    * Returns yottalux, 10^24 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(24))

@JsExport
@JvmField
/**
* Ylx, 10^24 of lux, derived SI-Unit for measurement of illuminance
*/        
val Ylx = 10.0.pow(24) * (cd*sr*(m `^` -2))

/**
* yottalux, 10^24 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val yottalux = Ylx
    

/**
* Zlx, 10^21 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Zlx : Lux
    @JvmName("getZlx_prop")
    /**
    * Returns Zlx, 10^21 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(21))

/**
* zettalux, 10^21 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.zettalux : Lux
    /**
    * Returns zettalux, 10^21 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(21))

@JsExport
@JvmField
/**
* Zlx, 10^21 of lux, derived SI-Unit for measurement of illuminance
*/        
val Zlx = 10.0.pow(21) * (cd*sr*(m `^` -2))

/**
* zettalux, 10^21 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val zettalux = Zlx
    

/**
* Elx, 10^18 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Elx : Lux
    @JvmName("getElx_prop")
    /**
    * Returns Elx, 10^18 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(18))

/**
* exalux, 10^18 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.exalux : Lux
    /**
    * Returns exalux, 10^18 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(18))

@JsExport
@JvmField
/**
* Elx, 10^18 of lux, derived SI-Unit for measurement of illuminance
*/        
val Elx = 10.0.pow(18) * (cd*sr*(m `^` -2))

/**
* exalux, 10^18 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val exalux = Elx
    

/**
* Plx, 10^15 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Plx : Lux
    @JvmName("getPlx_prop")
    /**
    * Returns Plx, 10^15 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(15))

/**
* petalux, 10^15 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.petalux : Lux
    /**
    * Returns petalux, 10^15 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(15))

@JsExport
@JvmField
/**
* Plx, 10^15 of lux, derived SI-Unit for measurement of illuminance
*/        
val Plx = 10.0.pow(15) * (cd*sr*(m `^` -2))

/**
* petalux, 10^15 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val petalux = Plx
    

/**
* Tlx, 10^12 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Tlx : Lux
    @JvmName("getTlx_prop")
    /**
    * Returns Tlx, 10^12 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(12))

/**
* teralux, 10^12 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.teralux : Lux
    /**
    * Returns teralux, 10^12 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(12))

@JsExport
@JvmField
/**
* Tlx, 10^12 of lux, derived SI-Unit for measurement of illuminance
*/        
val Tlx = 10.0.pow(12) * (cd*sr*(m `^` -2))

/**
* teralux, 10^12 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val teralux = Tlx
    

/**
* Glx, 10^9 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Glx : Lux
    @JvmName("getGlx_prop")
    /**
    * Returns Glx, 10^9 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(9))

/**
* gigalux, 10^9 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.gigalux : Lux
    /**
    * Returns gigalux, 10^9 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(9))

@JsExport
@JvmField
/**
* Glx, 10^9 of lux, derived SI-Unit for measurement of illuminance
*/        
val Glx = 10.0.pow(9) * (cd*sr*(m `^` -2))

/**
* gigalux, 10^9 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val gigalux = Glx
    

/**
* Mlx, 10^6 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Mlx : Lux
    @JvmName("getMlx_prop")
    /**
    * Returns Mlx, 10^6 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(6))

/**
* megalux, 10^6 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.megalux : Lux
    /**
    * Returns megalux, 10^6 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(6))

@JsExport
@JvmField
/**
* Mlx, 10^6 of lux, derived SI-Unit for measurement of illuminance
*/        
val Mlx = 10.0.pow(6) * (cd*sr*(m `^` -2))

/**
* megalux, 10^6 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val megalux = Mlx
    

/**
* klx, 10^3 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.klx : Lux
    @JvmName("getklx_prop")
    /**
    * Returns klx, 10^3 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(3))

/**
* kilolux, 10^3 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.kilolux : Lux
    /**
    * Returns kilolux, 10^3 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(3))

@JsExport
@JvmField
/**
* klx, 10^3 of lux, derived SI-Unit for measurement of illuminance
*/        
val klx = 10.0.pow(3) * (cd*sr*(m `^` -2))

/**
* kilolux, 10^3 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val kilolux = klx
    

/**
* hlx, 10^2 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.hlx : Lux
    @JvmName("gethlx_prop")
    /**
    * Returns hlx, 10^2 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(2))

/**
* hectolux, 10^2 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.hectolux : Lux
    /**
    * Returns hectolux, 10^2 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(2))

@JsExport
@JvmField
/**
* hlx, 10^2 of lux, derived SI-Unit for measurement of illuminance
*/        
val hlx = 10.0.pow(2) * (cd*sr*(m `^` -2))

/**
* hectolux, 10^2 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val hectolux = hlx
    

/**
* dalx, 10^1 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.dalx : Lux
    @JvmName("getdalx_prop")
    /**
    * Returns dalx, 10^1 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(1))

/**
* decalux, 10^1 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.decalux : Lux
    /**
    * Returns decalux, 10^1 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(1))

@JsExport
@JvmField
/**
* dalx, 10^1 of lux, derived SI-Unit for measurement of illuminance
*/        
val dalx = 10.0.pow(1) * (cd*sr*(m `^` -2))

/**
* decalux, 10^1 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val decalux = dalx
    

/**
* dlx, 10^-1 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.dlx : Lux
    @JvmName("getdlx_prop")
    /**
    * Returns dlx, 10^-1 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-1))

/**
* decilux, 10^-1 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.decilux : Lux
    /**
    * Returns decilux, 10^-1 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-1))

@JsExport
@JvmField
/**
* dlx, 10^-1 of lux, derived SI-Unit for measurement of illuminance
*/        
val dlx = 10.0.pow(-1) * (cd*sr*(m `^` -2))

/**
* decilux, 10^-1 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val decilux = dlx
    

/**
* clx, 10^-2 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.clx : Lux
    @JvmName("getclx_prop")
    /**
    * Returns clx, 10^-2 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-2))

/**
* centilux, 10^-2 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.centilux : Lux
    /**
    * Returns centilux, 10^-2 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-2))

@JsExport
@JvmField
/**
* clx, 10^-2 of lux, derived SI-Unit for measurement of illuminance
*/        
val clx = 10.0.pow(-2) * (cd*sr*(m `^` -2))

/**
* centilux, 10^-2 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val centilux = clx
    

/**
* mlx, 10^-3 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.mlx : Lux
    @JvmName("getmlx_prop")
    /**
    * Returns mlx, 10^-3 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-3))

/**
* millilux, 10^-3 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.millilux : Lux
    /**
    * Returns millilux, 10^-3 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-3))


@JvmField
/**
* mlx, 10^-3 of lux, derived SI-Unit for measurement of illuminance
*/        
val mlx = 10.0.pow(-3) * (cd*sr*(m `^` -2))

/**
* millilux, 10^-3 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val millilux = mlx
    

/**
* μlx, 10^-6 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.μlx : Lux
    @JvmName("getμlx_prop")
    /**
    * Returns μlx, 10^-6 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-6))

/**
* microlux, 10^-6 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.microlux : Lux
    /**
    * Returns microlux, 10^-6 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-6))

@JsExport
@JvmField
/**
* μlx, 10^-6 of lux, derived SI-Unit for measurement of illuminance
*/        
val μlx = 10.0.pow(-6) * (cd*sr*(m `^` -2))

/**
* microlux, 10^-6 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val microlux = μlx
    

/**
* nlx, 10^-9 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.nlx : Lux
    @JvmName("getnlx_prop")
    /**
    * Returns nlx, 10^-9 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-9))

/**
* nanolux, 10^-9 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.nanolux : Lux
    /**
    * Returns nanolux, 10^-9 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-9))

@JsExport
@JvmField
/**
* nlx, 10^-9 of lux, derived SI-Unit for measurement of illuminance
*/        
val nlx = 10.0.pow(-9) * (cd*sr*(m `^` -2))

/**
* nanolux, 10^-9 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val nanolux = nlx
    

/**
* plx, 10^-12 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.plx : Lux
    @JvmName("getplx_prop")
    /**
    * Returns plx, 10^-12 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-12))

/**
* picolux, 10^-12 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.picolux : Lux
    /**
    * Returns picolux, 10^-12 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-12))


@JvmField
/**
* plx, 10^-12 of lux, derived SI-Unit for measurement of illuminance
*/        
val plx = 10.0.pow(-12) * (cd*sr*(m `^` -2))

/**
* picolux, 10^-12 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val picolux = plx
    

/**
* flx, 10^-15 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.flx : Lux
    @JvmName("getflx_prop")
    /**
    * Returns flx, 10^-15 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-15))

/**
* femtolux, 10^-15 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.femtolux : Lux
    /**
    * Returns femtolux, 10^-15 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-15))

@JsExport
@JvmField
/**
* flx, 10^-15 of lux, derived SI-Unit for measurement of illuminance
*/        
val flx = 10.0.pow(-15) * (cd*sr*(m `^` -2))

/**
* femtolux, 10^-15 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val femtolux = flx
    

/**
* alx, 10^-18 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.alx : Lux
    @JvmName("getalx_prop")
    /**
    * Returns alx, 10^-18 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-18))

/**
* attolux, 10^-18 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.attolux : Lux
    /**
    * Returns attolux, 10^-18 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-18))

@JsExport
@JvmField
/**
* alx, 10^-18 of lux, derived SI-Unit for measurement of illuminance
*/        
val alx = 10.0.pow(-18) * (cd*sr*(m `^` -2))

/**
* attolux, 10^-18 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val attolux = alx
    

/**
* zlx, 10^-21 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.zlx : Lux
    @JvmName("getzlx_prop")
    /**
    * Returns zlx, 10^-21 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-21))

/**
* zeptolux, 10^-21 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.zeptolux : Lux
    /**
    * Returns zeptolux, 10^-21 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-21))


@JvmField
/**
* zlx, 10^-21 of lux, derived SI-Unit for measurement of illuminance
*/        
val zlx = 10.0.pow(-21) * (cd*sr*(m `^` -2))

/**
* zeptolux, 10^-21 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val zeptolux = zlx
    

/**
* ylx, 10^-24 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.ylx : Lux
    @JvmName("getylx_prop")
    /**
    * Returns ylx, 10^-24 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-24))

/**
* yoctolux, 10^-24 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.yoctolux : Lux
    /**
    * Returns yoctolux, 10^-24 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-24))


@JvmField
/**
* ylx, 10^-24 of lux, derived SI-Unit for measurement of illuminance
*/        
val ylx = 10.0.pow(-24) * (cd*sr*(m `^` -2))

/**
* yoctolux, 10^-24 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val yoctolux = ylx
    

/**
* rlx, 10^-27 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.rlx : Lux
    @JvmName("getrlx_prop")
    /**
    * Returns rlx, 10^-27 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-27))

/**
* rontolux, 10^-27 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.rontolux : Lux
    /**
    * Returns rontolux, 10^-27 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-27))


@JvmField
/**
* rlx, 10^-27 of lux, derived SI-Unit for measurement of illuminance
*/        
val rlx = 10.0.pow(-27) * (cd*sr*(m `^` -2))

/**
* rontolux, 10^-27 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val rontolux = rlx
    

/**
* qlx, 10^-30 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.qlx : Lux
    @JvmName("getqlx_prop")
    /**
    * Returns qlx, 10^-30 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-30))

/**
* quectolux, 10^-30 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.quectolux : Lux
    /**
    * Returns quectolux, 10^-30 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = Lux(this.toDouble() * 10.0.pow(-30))


@JvmField
/**
* qlx, 10^-30 of lux, derived SI-Unit for measurement of illuminance
*/        
val qlx = 10.0.pow(-30) * (cd*sr*(m `^` -2))

/**
* quectolux, 10^-30 of lux, derived SI-Unit for measurement of illuminance
*/ 

@JsExport
@JvmField
val quectolux = qlx
    