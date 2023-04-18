
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val unit =  s*A

@JsExport
/**
* System International Unit for electric charge.
*/
class Coulomb(value: Double){
    val expression: Expression = unit*value
}

/**
* System International Unit for electric charge.
*/
@JsExport
@JvmField
val C = unit

/**
* Creates Coulomb-Object for current number value. Coulomb is a System International Unit for electric charge.
*/
val Number.C : Expression
   /**
   * Returns Coulomb-Object for current number value. Coulomb is a System International Unit for electric charge.
   */
    get() = this.toDouble() * unit

    
/**
* QC, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.QC : Expression
    @JvmName("getQC_prop")
    /**
    * Returns QC, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettacoulomb, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.quettacoulomb : Expression
    /**
    * Returns quettacoulomb, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

@JsExport
@JvmField
/**
* QC, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val QC = 10.0.pow(30) * (s*A)

/**
* quettacoulomb, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val quettacoulomb = QC
    

/**
* RC, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.RC : Expression
    @JvmName("getRC_prop")
    /**
    * Returns RC, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnacoulomb, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.ronnacoulomb : Expression
    /**
    * Returns ronnacoulomb, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

@JsExport
@JvmField
/**
* RC, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val RC = 10.0.pow(27) * (s*A)

/**
* ronnacoulomb, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val ronnacoulomb = RC
    

/**
* YC, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.YC : Expression
    @JvmName("getYC_prop")
    /**
    * Returns YC, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottacoulomb, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.yottacoulomb : Expression
    /**
    * Returns yottacoulomb, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

@JsExport
@JvmField
/**
* YC, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val YC = 10.0.pow(24) * (s*A)

/**
* yottacoulomb, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val yottacoulomb = YC
    

/**
* ZC, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.ZC : Expression
    @JvmName("getZC_prop")
    /**
    * Returns ZC, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettacoulomb, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.zettacoulomb : Expression
    /**
    * Returns zettacoulomb, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

@JsExport
@JvmField
/**
* ZC, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val ZC = 10.0.pow(21) * (s*A)

/**
* zettacoulomb, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val zettacoulomb = ZC
    

/**
* EC, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.EC : Expression
    @JvmName("getEC_prop")
    /**
    * Returns EC, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exacoulomb, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.exacoulomb : Expression
    /**
    * Returns exacoulomb, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

@JsExport
@JvmField
/**
* EC, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val EC = 10.0.pow(18) * (s*A)

/**
* exacoulomb, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val exacoulomb = EC
    

/**
* PC, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.PC : Expression
    @JvmName("getPC_prop")
    /**
    * Returns PC, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petacoulomb, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.petacoulomb : Expression
    /**
    * Returns petacoulomb, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

@JsExport
@JvmField
/**
* PC, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val PC = 10.0.pow(15) * (s*A)

/**
* petacoulomb, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val petacoulomb = PC
    

/**
* TC, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.TC : Expression
    @JvmName("getTC_prop")
    /**
    * Returns TC, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* teracoulomb, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.teracoulomb : Expression
    /**
    * Returns teracoulomb, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

@JsExport
@JvmField
/**
* TC, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val TC = 10.0.pow(12) * (s*A)

/**
* teracoulomb, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val teracoulomb = TC
    

/**
* GC, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.GC : Expression
    @JvmName("getGC_prop")
    /**
    * Returns GC, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigacoulomb, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.gigacoulomb : Expression
    /**
    * Returns gigacoulomb, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

@JsExport
@JvmField
/**
* GC, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val GC = 10.0.pow(9) * (s*A)

/**
* gigacoulomb, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val gigacoulomb = GC
    

/**
* MC, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.MC : Expression
    @JvmName("getMC_prop")
    /**
    * Returns MC, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megacoulomb, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.megacoulomb : Expression
    /**
    * Returns megacoulomb, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

@JsExport
@JvmField
/**
* MC, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val MC = 10.0.pow(6) * (s*A)

/**
* megacoulomb, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val megacoulomb = MC
    

/**
* kC, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.kC : Expression
    @JvmName("getkC_prop")
    /**
    * Returns kC, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilocoulomb, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.kilocoulomb : Expression
    /**
    * Returns kilocoulomb, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

@JsExport
@JvmField
/**
* kC, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val kC = 10.0.pow(3) * (s*A)

/**
* kilocoulomb, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val kilocoulomb = kC
    

/**
* hC, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.hC : Expression
    @JvmName("gethC_prop")
    /**
    * Returns hC, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectocoulomb, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.hectocoulomb : Expression
    /**
    * Returns hectocoulomb, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

@JsExport
@JvmField
/**
* hC, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val hC = 10.0.pow(2) * (s*A)

/**
* hectocoulomb, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val hectocoulomb = hC
    

/**
* daC, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.daC : Expression
    @JvmName("getdaC_prop")
    /**
    * Returns daC, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decacoulomb, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.decacoulomb : Expression
    /**
    * Returns decacoulomb, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

@JsExport
@JvmField
/**
* daC, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val daC = 10.0.pow(1) * (s*A)

/**
* decacoulomb, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val decacoulomb = daC
    

/**
* dC, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.dC : Expression
    @JvmName("getdC_prop")
    /**
    * Returns dC, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decicoulomb, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.decicoulomb : Expression
    /**
    * Returns decicoulomb, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

@JsExport
@JvmField
/**
* dC, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val dC = 10.0.pow(-1) * (s*A)

/**
* decicoulomb, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val decicoulomb = dC
    

/**
* cC, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.cC : Expression
    @JvmName("getcC_prop")
    /**
    * Returns cC, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centicoulomb, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.centicoulomb : Expression
    /**
    * Returns centicoulomb, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

@JsExport
@JvmField
/**
* cC, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val cC = 10.0.pow(-2) * (s*A)

/**
* centicoulomb, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val centicoulomb = cC
    

/**
* mC, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.mC : Expression
    @JvmName("getmC_prop")
    /**
    * Returns mC, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millicoulomb, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.millicoulomb : Expression
    /**
    * Returns millicoulomb, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField
/**
* mC, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val mC = 10.0.pow(-3) * (s*A)

/**
* millicoulomb, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val millicoulomb = mC
    

/**
* μC, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.μC : Expression
    @JvmName("getμC_prop")
    /**
    * Returns μC, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microcoulomb, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.microcoulomb : Expression
    /**
    * Returns microcoulomb, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

@JsExport
@JvmField
/**
* μC, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val μC = 10.0.pow(-6) * (s*A)

/**
* microcoulomb, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val microcoulomb = μC
    

/**
* nC, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.nC : Expression
    @JvmName("getnC_prop")
    /**
    * Returns nC, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanocoulomb, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.nanocoulomb : Expression
    /**
    * Returns nanocoulomb, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

@JsExport
@JvmField
/**
* nC, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val nC = 10.0.pow(-9) * (s*A)

/**
* nanocoulomb, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val nanocoulomb = nC
    

/**
* pC, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.pC : Expression
    @JvmName("getpC_prop")
    /**
    * Returns pC, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picocoulomb, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.picocoulomb : Expression
    /**
    * Returns picocoulomb, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField
/**
* pC, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val pC = 10.0.pow(-12) * (s*A)

/**
* picocoulomb, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val picocoulomb = pC
    

/**
* fC, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.fC : Expression
    @JvmName("getfC_prop")
    /**
    * Returns fC, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtocoulomb, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.femtocoulomb : Expression
    /**
    * Returns femtocoulomb, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

@JsExport
@JvmField
/**
* fC, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val fC = 10.0.pow(-15) * (s*A)

/**
* femtocoulomb, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val femtocoulomb = fC
    

/**
* aC, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.aC : Expression
    @JvmName("getaC_prop")
    /**
    * Returns aC, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attocoulomb, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.attocoulomb : Expression
    /**
    * Returns attocoulomb, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

@JsExport
@JvmField
/**
* aC, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val aC = 10.0.pow(-18) * (s*A)

/**
* attocoulomb, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val attocoulomb = aC
    

/**
* zC, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.zC : Expression
    @JvmName("getzC_prop")
    /**
    * Returns zC, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptocoulomb, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.zeptocoulomb : Expression
    /**
    * Returns zeptocoulomb, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField
/**
* zC, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val zC = 10.0.pow(-21) * (s*A)

/**
* zeptocoulomb, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val zeptocoulomb = zC
    

/**
* yC, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.yC : Expression
    @JvmName("getyC_prop")
    /**
    * Returns yC, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctocoulomb, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.yoctocoulomb : Expression
    /**
    * Returns yoctocoulomb, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField
/**
* yC, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val yC = 10.0.pow(-24) * (s*A)

/**
* yoctocoulomb, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val yoctocoulomb = yC
    

/**
* rC, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.rC : Expression
    @JvmName("getrC_prop")
    /**
    * Returns rC, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontocoulomb, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.rontocoulomb : Expression
    /**
    * Returns rontocoulomb, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField
/**
* rC, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val rC = 10.0.pow(-27) * (s*A)

/**
* rontocoulomb, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val rontocoulomb = rC
    

/**
* qC, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.qC : Expression
    @JvmName("getqC_prop")
    /**
    * Returns qC, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectocoulomb, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.quectocoulomb : Expression
    /**
    * Returns quectocoulomb, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField
/**
* qC, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
*/        
val qC = 10.0.pow(-30) * (s*A)

/**
* quectocoulomb, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
*/ 

@JsExport
@JvmField
val quectocoulomb = qC
    