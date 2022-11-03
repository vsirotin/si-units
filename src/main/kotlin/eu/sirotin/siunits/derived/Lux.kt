
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import kotlin.math.pow

    //Unit of illuminance
    val lx = cd*sr*(m `^` -2)

    val Number.lx : Expression
        get() = this.toDouble() * (cd*sr*(m `^` -2))

    
    val Number.Ylx : Expression
        @JvmName("getYlx_prop")
        get() = this.toDouble() * 10.0.pow(24) * (cd*sr*(m `^` -2))

    val Number.yottalux : Expression
        get() = this.toDouble() * 10.0.pow(24) * (cd*sr*(m `^` -2))


    @JvmField()         
    val Ylx = 10.0.pow(24) * (cd*sr*(m `^` -2))
    val yottalux = Ylx
    

    val Number.Zlx : Expression
        @JvmName("getZlx_prop")
        get() = this.toDouble() * 10.0.pow(21) * (cd*sr*(m `^` -2))

    val Number.zettalux : Expression
        get() = this.toDouble() * 10.0.pow(21) * (cd*sr*(m `^` -2))


    @JvmField()         
    val Zlx = 10.0.pow(21) * (cd*sr*(m `^` -2))
    val zettalux = Zlx
    

    val Number.Elx : Expression
        @JvmName("getElx_prop")
        get() = this.toDouble() * 10.0.pow(18) * (cd*sr*(m `^` -2))

    val Number.exalux : Expression
        get() = this.toDouble() * 10.0.pow(18) * (cd*sr*(m `^` -2))


    @JvmField()         
    val Elx = 10.0.pow(18) * (cd*sr*(m `^` -2))
    val exalux = Elx
    

    val Number.Plx : Expression
        @JvmName("getPlx_prop")
        get() = this.toDouble() * 10.0.pow(15) * (cd*sr*(m `^` -2))

    val Number.petalux : Expression
        get() = this.toDouble() * 10.0.pow(15) * (cd*sr*(m `^` -2))


    @JvmField()         
    val Plx = 10.0.pow(15) * (cd*sr*(m `^` -2))
    val petalux = Plx
    

    val Number.Tlx : Expression
        @JvmName("getTlx_prop")
        get() = this.toDouble() * 10.0.pow(12) * (cd*sr*(m `^` -2))

    val Number.teralux : Expression
        get() = this.toDouble() * 10.0.pow(12) * (cd*sr*(m `^` -2))


    @JvmField()         
    val Tlx = 10.0.pow(12) * (cd*sr*(m `^` -2))
    val teralux = Tlx
    

    val Number.Glx : Expression
        @JvmName("getGlx_prop")
        get() = this.toDouble() * 10.0.pow(9) * (cd*sr*(m `^` -2))

    val Number.gigalux : Expression
        get() = this.toDouble() * 10.0.pow(9) * (cd*sr*(m `^` -2))


    @JvmField()         
    val Glx = 10.0.pow(9) * (cd*sr*(m `^` -2))
    val gigalux = Glx
    

    val Number.Mlx : Expression
        @JvmName("getMlx_prop")
        get() = this.toDouble() * 10.0.pow(6) * (cd*sr*(m `^` -2))

    val Number.megalux : Expression
        get() = this.toDouble() * 10.0.pow(6) * (cd*sr*(m `^` -2))


    @JvmField()         
    val Mlx = 10.0.pow(6) * (cd*sr*(m `^` -2))
    val megalux = Mlx
    

    val Number.klx : Expression
        @JvmName("getklx_prop")
        get() = this.toDouble() * 10.0.pow(3) * (cd*sr*(m `^` -2))

    val Number.kilolux : Expression
        get() = this.toDouble() * 10.0.pow(3) * (cd*sr*(m `^` -2))


    @JvmField()         
    val klx = 10.0.pow(3) * (cd*sr*(m `^` -2))
    val kilolux = klx
    

    val Number.hlx : Expression
        @JvmName("gethlx_prop")
        get() = this.toDouble() * 10.0.pow(2) * (cd*sr*(m `^` -2))

    val Number.hectolux : Expression
        get() = this.toDouble() * 10.0.pow(2) * (cd*sr*(m `^` -2))


    @JvmField()         
    val hlx = 10.0.pow(2) * (cd*sr*(m `^` -2))
    val hectolux = hlx
    

    val Number.dalx : Expression
        @JvmName("getdalx_prop")
        get() = this.toDouble() * 10.0.pow(1) * (cd*sr*(m `^` -2))

    val Number.decalux : Expression
        get() = this.toDouble() * 10.0.pow(1) * (cd*sr*(m `^` -2))


    @JvmField()         
    val dalx = 10.0.pow(1) * (cd*sr*(m `^` -2))
    val decalux = dalx
    

    val Number.dlx : Expression
        @JvmName("getdlx_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (cd*sr*(m `^` -2))

    val Number.decilux : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (cd*sr*(m `^` -2))


    @JvmField()         
    val dlx = 10.0.pow(-1) * (cd*sr*(m `^` -2))
    val decilux = dlx
    

    val Number.clx : Expression
        @JvmName("getclx_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (cd*sr*(m `^` -2))

    val Number.centilux : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (cd*sr*(m `^` -2))


    @JvmField()         
    val clx = 10.0.pow(-2) * (cd*sr*(m `^` -2))
    val centilux = clx
    

    val Number.mlx : Expression
        @JvmName("getmlx_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (cd*sr*(m `^` -2))

    val Number.millilux : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (cd*sr*(m `^` -2))


    @JvmField()         
    val mlx = 10.0.pow(-3) * (cd*sr*(m `^` -2))
    val millilux = mlx
    

    val Number.μlx : Expression
        @JvmName("getμlx_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (cd*sr*(m `^` -2))

    val Number.microlux : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (cd*sr*(m `^` -2))


    @JvmField()         
    val μlx = 10.0.pow(-6) * (cd*sr*(m `^` -2))
    val microlux = μlx
    

    val Number.nlx : Expression
        @JvmName("getnlx_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (cd*sr*(m `^` -2))

    val Number.nanolux : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (cd*sr*(m `^` -2))


    @JvmField()         
    val nlx = 10.0.pow(-9) * (cd*sr*(m `^` -2))
    val nanolux = nlx
    

    val Number.plx : Expression
        @JvmName("getplx_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (cd*sr*(m `^` -2))

    val Number.picolux : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (cd*sr*(m `^` -2))


    @JvmField()         
    val plx = 10.0.pow(-12) * (cd*sr*(m `^` -2))
    val picolux = plx
    

    val Number.flx : Expression
        @JvmName("getflx_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (cd*sr*(m `^` -2))

    val Number.femtolux : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (cd*sr*(m `^` -2))


    @JvmField()         
    val flx = 10.0.pow(-15) * (cd*sr*(m `^` -2))
    val femtolux = flx
    

    val Number.alx : Expression
        @JvmName("getalx_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (cd*sr*(m `^` -2))

    val Number.attolux : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (cd*sr*(m `^` -2))


    @JvmField()         
    val alx = 10.0.pow(-18) * (cd*sr*(m `^` -2))
    val attolux = alx
    

    val Number.zlx : Expression
        @JvmName("getzlx_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (cd*sr*(m `^` -2))

    val Number.zeptolux : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (cd*sr*(m `^` -2))


    @JvmField()         
    val zlx = 10.0.pow(-21) * (cd*sr*(m `^` -2))
    val zeptolux = zlx
    

    val Number.ylx : Expression
        @JvmName("getylx_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (cd*sr*(m `^` -2))

    val Number.yoctolux : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (cd*sr*(m `^` -2))


    @JvmField()         
    val ylx = 10.0.pow(-24) * (cd*sr*(m `^` -2))
    val yoctolux = ylx
    