
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val lm = ((cd `^` 1)*sr)

    val Number.lm : Expression
        get() = this.toDouble() * (((cd `^` 1)*sr))

    
    val Number.Ylm : Expression
        @JvmName("getYlm_prop")
        get() = this.toDouble() * 10.0.pow(24) * (((cd `^` 1)*sr))

    val Number.yottalumen : Expression
        get() = this.toDouble() * 10.0.pow(24) * (((cd `^` 1)*sr))


    @JvmField()         
    val Ylm = 10.0.pow(24) * (((cd `^` 1)*sr))
    val yottalumen = Ylm
    

    val Number.Zlm : Expression
        @JvmName("getZlm_prop")
        get() = this.toDouble() * 10.0.pow(21) * (((cd `^` 1)*sr))

    val Number.zettalumen : Expression
        get() = this.toDouble() * 10.0.pow(21) * (((cd `^` 1)*sr))


    @JvmField()         
    val Zlm = 10.0.pow(21) * (((cd `^` 1)*sr))
    val zettalumen = Zlm
    

    val Number.Elm : Expression
        @JvmName("getElm_prop")
        get() = this.toDouble() * 10.0.pow(18) * (((cd `^` 1)*sr))

    val Number.exalumen : Expression
        get() = this.toDouble() * 10.0.pow(18) * (((cd `^` 1)*sr))


    @JvmField()         
    val Elm = 10.0.pow(18) * (((cd `^` 1)*sr))
    val exalumen = Elm
    

    val Number.Plm : Expression
        @JvmName("getPlm_prop")
        get() = this.toDouble() * 10.0.pow(15) * (((cd `^` 1)*sr))

    val Number.petalumen : Expression
        get() = this.toDouble() * 10.0.pow(15) * (((cd `^` 1)*sr))


    @JvmField()         
    val Plm = 10.0.pow(15) * (((cd `^` 1)*sr))
    val petalumen = Plm
    

    val Number.Tlm : Expression
        @JvmName("getTlm_prop")
        get() = this.toDouble() * 10.0.pow(12) * (((cd `^` 1)*sr))

    val Number.teralumen : Expression
        get() = this.toDouble() * 10.0.pow(12) * (((cd `^` 1)*sr))


    @JvmField()         
    val Tlm = 10.0.pow(12) * (((cd `^` 1)*sr))
    val teralumen = Tlm
    

    val Number.Glm : Expression
        @JvmName("getGlm_prop")
        get() = this.toDouble() * 10.0.pow(9) * (((cd `^` 1)*sr))

    val Number.gigalumen : Expression
        get() = this.toDouble() * 10.0.pow(9) * (((cd `^` 1)*sr))


    @JvmField()         
    val Glm = 10.0.pow(9) * (((cd `^` 1)*sr))
    val gigalumen = Glm
    

    val Number.Mlm : Expression
        @JvmName("getMlm_prop")
        get() = this.toDouble() * 10.0.pow(6) * (((cd `^` 1)*sr))

    val Number.megalumen : Expression
        get() = this.toDouble() * 10.0.pow(6) * (((cd `^` 1)*sr))


    @JvmField()         
    val Mlm = 10.0.pow(6) * (((cd `^` 1)*sr))
    val megalumen = Mlm
    

    val Number.klm : Expression
        @JvmName("getklm_prop")
        get() = this.toDouble() * 10.0.pow(3) * (((cd `^` 1)*sr))

    val Number.kilolumen : Expression
        get() = this.toDouble() * 10.0.pow(3) * (((cd `^` 1)*sr))


    @JvmField()         
    val klm = 10.0.pow(3) * (((cd `^` 1)*sr))
    val kilolumen = klm
    

    val Number.hlm : Expression
        @JvmName("gethlm_prop")
        get() = this.toDouble() * 10.0.pow(2) * (((cd `^` 1)*sr))

    val Number.hectolumen : Expression
        get() = this.toDouble() * 10.0.pow(2) * (((cd `^` 1)*sr))


    @JvmField()         
    val hlm = 10.0.pow(2) * (((cd `^` 1)*sr))
    val hectolumen = hlm
    

    val Number.dalm : Expression
        @JvmName("getdalm_prop")
        get() = this.toDouble() * 10.0.pow(1) * (((cd `^` 1)*sr))

    val Number.decalumen : Expression
        get() = this.toDouble() * 10.0.pow(1) * (((cd `^` 1)*sr))


    @JvmField()         
    val dalm = 10.0.pow(1) * (((cd `^` 1)*sr))
    val decalumen = dalm
    

    val Number.dlm : Expression
        @JvmName("getdlm_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (((cd `^` 1)*sr))

    val Number.decilumen : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (((cd `^` 1)*sr))


    @JvmField()         
    val dlm = 10.0.pow(-1) * (((cd `^` 1)*sr))
    val decilumen = dlm
    

    val Number.clm : Expression
        @JvmName("getclm_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (((cd `^` 1)*sr))

    val Number.centilumen : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (((cd `^` 1)*sr))


    @JvmField()         
    val clm = 10.0.pow(-2) * (((cd `^` 1)*sr))
    val centilumen = clm
    

    val Number.mlm : Expression
        @JvmName("getmlm_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (((cd `^` 1)*sr))

    val Number.millilumen : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (((cd `^` 1)*sr))


    @JvmField()         
    val mlm = 10.0.pow(-3) * (((cd `^` 1)*sr))
    val millilumen = mlm
    

    val Number.μlm : Expression
        @JvmName("getμlm_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (((cd `^` 1)*sr))

    val Number.microlumen : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (((cd `^` 1)*sr))


    @JvmField()         
    val μlm = 10.0.pow(-6) * (((cd `^` 1)*sr))
    val microlumen = μlm
    

    val Number.nlm : Expression
        @JvmName("getnlm_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (((cd `^` 1)*sr))

    val Number.nanolumen : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (((cd `^` 1)*sr))


    @JvmField()         
    val nlm = 10.0.pow(-9) * (((cd `^` 1)*sr))
    val nanolumen = nlm
    

    val Number.plm : Expression
        @JvmName("getplm_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (((cd `^` 1)*sr))

    val Number.picolumen : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (((cd `^` 1)*sr))


    @JvmField()         
    val plm = 10.0.pow(-12) * (((cd `^` 1)*sr))
    val picolumen = plm
    

    val Number.flm : Expression
        @JvmName("getflm_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (((cd `^` 1)*sr))

    val Number.femtolumen : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (((cd `^` 1)*sr))


    @JvmField()         
    val flm = 10.0.pow(-15) * (((cd `^` 1)*sr))
    val femtolumen = flm
    

    val Number.alm : Expression
        @JvmName("getalm_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (((cd `^` 1)*sr))

    val Number.attolumen : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (((cd `^` 1)*sr))


    @JvmField()         
    val alm = 10.0.pow(-18) * (((cd `^` 1)*sr))
    val attolumen = alm
    

    val Number.zlm : Expression
        @JvmName("getzlm_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (((cd `^` 1)*sr))

    val Number.zeptolumen : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (((cd `^` 1)*sr))


    @JvmField()         
    val zlm = 10.0.pow(-21) * (((cd `^` 1)*sr))
    val zeptolumen = zlm
    

    val Number.ylm : Expression
        @JvmName("getylm_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (((cd `^` 1)*sr))

    val Number.yoctolumen : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (((cd `^` 1)*sr))


    @JvmField()         
    val ylm = 10.0.pow(-24) * (((cd `^` 1)*sr))
    val yoctolumen = ylm
    