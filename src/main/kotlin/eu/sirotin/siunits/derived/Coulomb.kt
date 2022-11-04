
package eu.sirotin.siunits.derived

import eu.sirotin.siunits.core.Expression
import eu.sirotin.siunits.core.*
import eu.sirotin.siunits.base.*
import eu.sirotin.specialunits.*
import kotlin.math.pow

    val C = s*A

    val Number.C : Expression
        get() = this.toDouble() * (s*A)

    
    val Number.YC : Expression
        @JvmName("getYC_prop")
        get() = this.toDouble() * 10.0.pow(24) * (s*A)

    val Number.yottacoulomb : Expression
        get() = this.toDouble() * 10.0.pow(24) * (s*A)


    @JvmField()         
    val YC = 10.0.pow(24) * (s*A)
    val yottacoulomb = YC
    

    val Number.ZC : Expression
        @JvmName("getZC_prop")
        get() = this.toDouble() * 10.0.pow(21) * (s*A)

    val Number.zettacoulomb : Expression
        get() = this.toDouble() * 10.0.pow(21) * (s*A)


    @JvmField()         
    val ZC = 10.0.pow(21) * (s*A)
    val zettacoulomb = ZC
    

    val Number.EC : Expression
        @JvmName("getEC_prop")
        get() = this.toDouble() * 10.0.pow(18) * (s*A)

    val Number.exacoulomb : Expression
        get() = this.toDouble() * 10.0.pow(18) * (s*A)


    @JvmField()         
    val EC = 10.0.pow(18) * (s*A)
    val exacoulomb = EC
    

    val Number.PC : Expression
        @JvmName("getPC_prop")
        get() = this.toDouble() * 10.0.pow(15) * (s*A)

    val Number.petacoulomb : Expression
        get() = this.toDouble() * 10.0.pow(15) * (s*A)


    @JvmField()         
    val PC = 10.0.pow(15) * (s*A)
    val petacoulomb = PC
    

    val Number.TC : Expression
        @JvmName("getTC_prop")
        get() = this.toDouble() * 10.0.pow(12) * (s*A)

    val Number.teracoulomb : Expression
        get() = this.toDouble() * 10.0.pow(12) * (s*A)


    @JvmField()         
    val TC = 10.0.pow(12) * (s*A)
    val teracoulomb = TC
    

    val Number.GC : Expression
        @JvmName("getGC_prop")
        get() = this.toDouble() * 10.0.pow(9) * (s*A)

    val Number.gigacoulomb : Expression
        get() = this.toDouble() * 10.0.pow(9) * (s*A)


    @JvmField()         
    val GC = 10.0.pow(9) * (s*A)
    val gigacoulomb = GC
    

    val Number.MC : Expression
        @JvmName("getMC_prop")
        get() = this.toDouble() * 10.0.pow(6) * (s*A)

    val Number.megacoulomb : Expression
        get() = this.toDouble() * 10.0.pow(6) * (s*A)


    @JvmField()         
    val MC = 10.0.pow(6) * (s*A)
    val megacoulomb = MC
    

    val Number.kC : Expression
        @JvmName("getkC_prop")
        get() = this.toDouble() * 10.0.pow(3) * (s*A)

    val Number.kilocoulomb : Expression
        get() = this.toDouble() * 10.0.pow(3) * (s*A)


    @JvmField()         
    val kC = 10.0.pow(3) * (s*A)
    val kilocoulomb = kC
    

    val Number.hC : Expression
        @JvmName("gethC_prop")
        get() = this.toDouble() * 10.0.pow(2) * (s*A)

    val Number.hectocoulomb : Expression
        get() = this.toDouble() * 10.0.pow(2) * (s*A)


    @JvmField()         
    val hC = 10.0.pow(2) * (s*A)
    val hectocoulomb = hC
    

    val Number.daC : Expression
        @JvmName("getdaC_prop")
        get() = this.toDouble() * 10.0.pow(1) * (s*A)

    val Number.decacoulomb : Expression
        get() = this.toDouble() * 10.0.pow(1) * (s*A)


    @JvmField()         
    val daC = 10.0.pow(1) * (s*A)
    val decacoulomb = daC
    

    val Number.dC : Expression
        @JvmName("getdC_prop")
        get() = this.toDouble() * 10.0.pow(-1) * (s*A)

    val Number.decicoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-1) * (s*A)


    @JvmField()         
    val dC = 10.0.pow(-1) * (s*A)
    val decicoulomb = dC
    

    val Number.cC : Expression
        @JvmName("getcC_prop")
        get() = this.toDouble() * 10.0.pow(-2) * (s*A)

    val Number.centicoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-2) * (s*A)


    @JvmField()         
    val cC = 10.0.pow(-2) * (s*A)
    val centicoulomb = cC
    

    val Number.mC : Expression
        @JvmName("getmC_prop")
        get() = this.toDouble() * 10.0.pow(-3) * (s*A)

    val Number.millicoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-3) * (s*A)


    @JvmField()         
    val mC = 10.0.pow(-3) * (s*A)
    val millicoulomb = mC
    

    val Number.μC : Expression
        @JvmName("getμC_prop")
        get() = this.toDouble() * 10.0.pow(-6) * (s*A)

    val Number.microcoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-6) * (s*A)


    @JvmField()         
    val μC = 10.0.pow(-6) * (s*A)
    val microcoulomb = μC
    

    val Number.nC : Expression
        @JvmName("getnC_prop")
        get() = this.toDouble() * 10.0.pow(-9) * (s*A)

    val Number.nanocoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-9) * (s*A)


    @JvmField()         
    val nC = 10.0.pow(-9) * (s*A)
    val nanocoulomb = nC
    

    val Number.pC : Expression
        @JvmName("getpC_prop")
        get() = this.toDouble() * 10.0.pow(-12) * (s*A)

    val Number.picocoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-12) * (s*A)


    @JvmField()         
    val pC = 10.0.pow(-12) * (s*A)
    val picocoulomb = pC
    

    val Number.fC : Expression
        @JvmName("getfC_prop")
        get() = this.toDouble() * 10.0.pow(-15) * (s*A)

    val Number.femtocoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-15) * (s*A)


    @JvmField()         
    val fC = 10.0.pow(-15) * (s*A)
    val femtocoulomb = fC
    

    val Number.aC : Expression
        @JvmName("getaC_prop")
        get() = this.toDouble() * 10.0.pow(-18) * (s*A)

    val Number.attocoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-18) * (s*A)


    @JvmField()         
    val aC = 10.0.pow(-18) * (s*A)
    val attocoulomb = aC
    

    val Number.zC : Expression
        @JvmName("getzC_prop")
        get() = this.toDouble() * 10.0.pow(-21) * (s*A)

    val Number.zeptocoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-21) * (s*A)


    @JvmField()         
    val zC = 10.0.pow(-21) * (s*A)
    val zeptocoulomb = zC
    

    val Number.yC : Expression
        @JvmName("getyC_prop")
        get() = this.toDouble() * 10.0.pow(-24) * (s*A)

    val Number.yoctocoulomb : Expression
        get() = this.toDouble() * 10.0.pow(-24) * (s*A)


    @JvmField()         
    val yC = 10.0.pow(-24) * (s*A)
    val yoctocoulomb = yC
    