
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  cd*sr*(m `^` -2)

/**
* System International Unit for illuminance.
*/
@JsExport
@JvmField()
val lx = unit

/**
* Creates Lux-Object for current number value. Lux is a System International Unit for illuminance.
*/
val Number.lx : Expression
   /**
   * Returns Lux-Object for current number value. Lux is a System International Unit for illuminance.
   */
    get() = this.toDouble() * unit

    
/**
* Qlx, 10^30 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Qlx : Expression
    @JvmName("getQlx_prop")
    /**
    * Returns Qlx, 10^30 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettalux, 10^30 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.quettalux : Expression
    /**
    * Returns quettalux, 10^30 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

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
@JvmField()
val quettalux = Qlx
    

/**
* Rlx, 10^27 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Rlx : Expression
    @JvmName("getRlx_prop")
    /**
    * Returns Rlx, 10^27 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnalux, 10^27 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.ronnalux : Expression
    /**
    * Returns ronnalux, 10^27 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

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
@JvmField()
val ronnalux = Rlx
    

/**
* Ylx, 10^24 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Ylx : Expression
    @JvmName("getYlx_prop")
    /**
    * Returns Ylx, 10^24 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottalux, 10^24 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.yottalux : Expression
    /**
    * Returns yottalux, 10^24 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

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
@JvmField()
val yottalux = Ylx
    

/**
* Zlx, 10^21 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Zlx : Expression
    @JvmName("getZlx_prop")
    /**
    * Returns Zlx, 10^21 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettalux, 10^21 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.zettalux : Expression
    /**
    * Returns zettalux, 10^21 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

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
@JvmField()
val zettalux = Zlx
    

/**
* Elx, 10^18 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Elx : Expression
    @JvmName("getElx_prop")
    /**
    * Returns Elx, 10^18 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exalux, 10^18 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.exalux : Expression
    /**
    * Returns exalux, 10^18 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

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
@JvmField()
val exalux = Elx
    

/**
* Plx, 10^15 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Plx : Expression
    @JvmName("getPlx_prop")
    /**
    * Returns Plx, 10^15 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petalux, 10^15 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.petalux : Expression
    /**
    * Returns petalux, 10^15 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

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
@JvmField()
val petalux = Plx
    

/**
* Tlx, 10^12 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Tlx : Expression
    @JvmName("getTlx_prop")
    /**
    * Returns Tlx, 10^12 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* teralux, 10^12 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.teralux : Expression
    /**
    * Returns teralux, 10^12 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

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
@JvmField()
val teralux = Tlx
    

/**
* Glx, 10^9 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Glx : Expression
    @JvmName("getGlx_prop")
    /**
    * Returns Glx, 10^9 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigalux, 10^9 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.gigalux : Expression
    /**
    * Returns gigalux, 10^9 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

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
@JvmField()
val gigalux = Glx
    

/**
* Mlx, 10^6 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.Mlx : Expression
    @JvmName("getMlx_prop")
    /**
    * Returns Mlx, 10^6 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megalux, 10^6 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.megalux : Expression
    /**
    * Returns megalux, 10^6 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

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
@JvmField()
val megalux = Mlx
    

/**
* klx, 10^3 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.klx : Expression
    @JvmName("getklx_prop")
    /**
    * Returns klx, 10^3 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilolux, 10^3 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.kilolux : Expression
    /**
    * Returns kilolux, 10^3 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

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
@JvmField()
val kilolux = klx
    

/**
* hlx, 10^2 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.hlx : Expression
    @JvmName("gethlx_prop")
    /**
    * Returns hlx, 10^2 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectolux, 10^2 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.hectolux : Expression
    /**
    * Returns hectolux, 10^2 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

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
@JvmField()
val hectolux = hlx
    

/**
* dalx, 10^1 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.dalx : Expression
    @JvmName("getdalx_prop")
    /**
    * Returns dalx, 10^1 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decalux, 10^1 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.decalux : Expression
    /**
    * Returns decalux, 10^1 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

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
@JvmField()
val decalux = dalx
    

/**
* dlx, 10^-1 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.dlx : Expression
    @JvmName("getdlx_prop")
    /**
    * Returns dlx, 10^-1 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decilux, 10^-1 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.decilux : Expression
    /**
    * Returns decilux, 10^-1 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

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
@JvmField()
val decilux = dlx
    

/**
* clx, 10^-2 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.clx : Expression
    @JvmName("getclx_prop")
    /**
    * Returns clx, 10^-2 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centilux, 10^-2 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.centilux : Expression
    /**
    * Returns centilux, 10^-2 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

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
@JvmField()
val centilux = clx
    

/**
* mlx, 10^-3 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.mlx : Expression
    @JvmName("getmlx_prop")
    /**
    * Returns mlx, 10^-3 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millilux, 10^-3 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.millilux : Expression
    /**
    * Returns millilux, 10^-3 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

@JsExport
@JvmField  
/**
* mlx, 10^-3 of lux, derived SI-Unit for measurement of illuminance
*/        
val mlx = 10.0.pow(-3) * (cd*sr*(m `^` -2))

/**
* millilux, 10^-3 of lux, derived SI-Unit for measurement of illuminance
*/ 
@JsExport
@JvmField()
val millilux = mlx
    

/**
* μlx, 10^-6 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.μlx : Expression
    @JvmName("getμlx_prop")
    /**
    * Returns μlx, 10^-6 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microlux, 10^-6 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.microlux : Expression
    /**
    * Returns microlux, 10^-6 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

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
@JvmField()
val microlux = μlx
    

/**
* nlx, 10^-9 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.nlx : Expression
    @JvmName("getnlx_prop")
    /**
    * Returns nlx, 10^-9 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanolux, 10^-9 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.nanolux : Expression
    /**
    * Returns nanolux, 10^-9 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

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
@JvmField()
val nanolux = nlx
    

/**
* plx, 10^-12 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.plx : Expression
    @JvmName("getplx_prop")
    /**
    * Returns plx, 10^-12 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picolux, 10^-12 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.picolux : Expression
    /**
    * Returns picolux, 10^-12 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

@JsExport
@JvmField  
/**
* plx, 10^-12 of lux, derived SI-Unit for measurement of illuminance
*/        
val plx = 10.0.pow(-12) * (cd*sr*(m `^` -2))

/**
* picolux, 10^-12 of lux, derived SI-Unit for measurement of illuminance
*/ 
@JsExport
@JvmField()
val picolux = plx
    

/**
* flx, 10^-15 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.flx : Expression
    @JvmName("getflx_prop")
    /**
    * Returns flx, 10^-15 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtolux, 10^-15 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.femtolux : Expression
    /**
    * Returns femtolux, 10^-15 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

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
@JvmField()
val femtolux = flx
    

/**
* alx, 10^-18 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.alx : Expression
    @JvmName("getalx_prop")
    /**
    * Returns alx, 10^-18 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attolux, 10^-18 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.attolux : Expression
    /**
    * Returns attolux, 10^-18 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

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
@JvmField()
val attolux = alx
    

/**
* zlx, 10^-21 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.zlx : Expression
    @JvmName("getzlx_prop")
    /**
    * Returns zlx, 10^-21 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptolux, 10^-21 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.zeptolux : Expression
    /**
    * Returns zeptolux, 10^-21 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

@JsExport
@JvmField  
/**
* zlx, 10^-21 of lux, derived SI-Unit for measurement of illuminance
*/        
val zlx = 10.0.pow(-21) * (cd*sr*(m `^` -2))

/**
* zeptolux, 10^-21 of lux, derived SI-Unit for measurement of illuminance
*/ 
@JsExport
@JvmField()
val zeptolux = zlx
    

/**
* ylx, 10^-24 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.ylx : Expression
    @JvmName("getylx_prop")
    /**
    * Returns ylx, 10^-24 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctolux, 10^-24 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.yoctolux : Expression
    /**
    * Returns yoctolux, 10^-24 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

@JsExport
@JvmField  
/**
* ylx, 10^-24 of lux, derived SI-Unit for measurement of illuminance
*/        
val ylx = 10.0.pow(-24) * (cd*sr*(m `^` -2))

/**
* yoctolux, 10^-24 of lux, derived SI-Unit for measurement of illuminance
*/ 
@JsExport
@JvmField()
val yoctolux = ylx
    

/**
* rlx, 10^-27 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.rlx : Expression
    @JvmName("getrlx_prop")
    /**
    * Returns rlx, 10^-27 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontolux, 10^-27 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.rontolux : Expression
    /**
    * Returns rontolux, 10^-27 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

@JsExport
@JvmField  
/**
* rlx, 10^-27 of lux, derived SI-Unit for measurement of illuminance
*/        
val rlx = 10.0.pow(-27) * (cd*sr*(m `^` -2))

/**
* rontolux, 10^-27 of lux, derived SI-Unit for measurement of illuminance
*/ 
@JsExport
@JvmField()
val rontolux = rlx
    

/**
* qlx, 10^-30 of lux, derived SI-Unit for measurement of illuminance
*/    
val Number.qlx : Expression
    @JvmName("getqlx_prop")
    /**
    * Returns qlx, 10^-30 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectolux, 10^-30 of lux, derived SI-Unit for measurement of illuminance
*/ 
val Number.quectolux : Expression
    /**
    * Returns quectolux, 10^-30 of lux, derived SI-Unit for measurement of illuminance
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

@JsExport
@JvmField  
/**
* qlx, 10^-30 of lux, derived SI-Unit for measurement of illuminance
*/        
val qlx = 10.0.pow(-30) * (cd*sr*(m `^` -2))

/**
* quectolux, 10^-30 of lux, derived SI-Unit for measurement of illuminance
*/ 
@JsExport
@JvmField()
val quectolux = qlx
    