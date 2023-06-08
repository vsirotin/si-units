
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.math.pow
import kotlin.jvm.JvmName

private val formula =  s*A

@JsExport
/**
* System International Unit for electric charge.
*/
class Coulomb(value: Number): DerivedUnit(value, formula)

/**
* System International Unit for electric charge.
*/
@JsExport
@JvmField
val C = Coulomb(1.0)

/**
* Creates Coulomb-Object for current number value. Coulomb is a System International Unit for electric charge.
*/
val Number.C : Coulomb
   /**
   * Returns Coulomb-Object for current number value. Coulomb is a System International Unit for electric charge.
   */
    get() = Coulomb(this.toDouble())

    
/**
* QC, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
*/    
val Number.QC : Coulomb
    @JvmName("getQC_prop")
    /**
    * Returns QC, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(30))

/**
* quettacoulomb, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.quettacoulomb : Coulomb
    /**
    * Returns quettacoulomb, 10^30 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(30))

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
val Number.RC : Coulomb
    @JvmName("getRC_prop")
    /**
    * Returns RC, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(27))

/**
* ronnacoulomb, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.ronnacoulomb : Coulomb
    /**
    * Returns ronnacoulomb, 10^27 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(27))

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
val Number.YC : Coulomb
    @JvmName("getYC_prop")
    /**
    * Returns YC, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(24))

/**
* yottacoulomb, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.yottacoulomb : Coulomb
    /**
    * Returns yottacoulomb, 10^24 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(24))

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
val Number.ZC : Coulomb
    @JvmName("getZC_prop")
    /**
    * Returns ZC, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(21))

/**
* zettacoulomb, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.zettacoulomb : Coulomb
    /**
    * Returns zettacoulomb, 10^21 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(21))

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
val Number.EC : Coulomb
    @JvmName("getEC_prop")
    /**
    * Returns EC, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(18))

/**
* exacoulomb, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.exacoulomb : Coulomb
    /**
    * Returns exacoulomb, 10^18 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(18))

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
val Number.PC : Coulomb
    @JvmName("getPC_prop")
    /**
    * Returns PC, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(15))

/**
* petacoulomb, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.petacoulomb : Coulomb
    /**
    * Returns petacoulomb, 10^15 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(15))

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
val Number.TC : Coulomb
    @JvmName("getTC_prop")
    /**
    * Returns TC, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(12))

/**
* teracoulomb, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.teracoulomb : Coulomb
    /**
    * Returns teracoulomb, 10^12 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(12))

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
val Number.GC : Coulomb
    @JvmName("getGC_prop")
    /**
    * Returns GC, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(9))

/**
* gigacoulomb, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.gigacoulomb : Coulomb
    /**
    * Returns gigacoulomb, 10^9 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(9))

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
val Number.MC : Coulomb
    @JvmName("getMC_prop")
    /**
    * Returns MC, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(6))

/**
* megacoulomb, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.megacoulomb : Coulomb
    /**
    * Returns megacoulomb, 10^6 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(6))

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
val Number.kC : Coulomb
    @JvmName("getkC_prop")
    /**
    * Returns kC, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(3))

/**
* kilocoulomb, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.kilocoulomb : Coulomb
    /**
    * Returns kilocoulomb, 10^3 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(3))

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
val Number.hC : Coulomb
    @JvmName("gethC_prop")
    /**
    * Returns hC, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(2))

/**
* hectocoulomb, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.hectocoulomb : Coulomb
    /**
    * Returns hectocoulomb, 10^2 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(2))

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
val Number.daC : Coulomb
    @JvmName("getdaC_prop")
    /**
    * Returns daC, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(1))

/**
* decacoulomb, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.decacoulomb : Coulomb
    /**
    * Returns decacoulomb, 10^1 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(1))

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
val Number.dC : Coulomb
    @JvmName("getdC_prop")
    /**
    * Returns dC, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-1))

/**
* decicoulomb, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.decicoulomb : Coulomb
    /**
    * Returns decicoulomb, 10^-1 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-1))

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
val Number.cC : Coulomb
    @JvmName("getcC_prop")
    /**
    * Returns cC, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-2))

/**
* centicoulomb, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.centicoulomb : Coulomb
    /**
    * Returns centicoulomb, 10^-2 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-2))

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
val Number.mC : Coulomb
    @JvmName("getmC_prop")
    /**
    * Returns mC, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-3))

/**
* millicoulomb, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.millicoulomb : Coulomb
    /**
    * Returns millicoulomb, 10^-3 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-3))


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
val Number.μC : Coulomb
    @JvmName("getμC_prop")
    /**
    * Returns μC, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-6))

/**
* microcoulomb, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.microcoulomb : Coulomb
    /**
    * Returns microcoulomb, 10^-6 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-6))

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
val Number.nC : Coulomb
    @JvmName("getnC_prop")
    /**
    * Returns nC, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-9))

/**
* nanocoulomb, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.nanocoulomb : Coulomb
    /**
    * Returns nanocoulomb, 10^-9 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-9))

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
val Number.pC : Coulomb
    @JvmName("getpC_prop")
    /**
    * Returns pC, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-12))

/**
* picocoulomb, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.picocoulomb : Coulomb
    /**
    * Returns picocoulomb, 10^-12 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-12))


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
val Number.fC : Coulomb
    @JvmName("getfC_prop")
    /**
    * Returns fC, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-15))

/**
* femtocoulomb, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.femtocoulomb : Coulomb
    /**
    * Returns femtocoulomb, 10^-15 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-15))

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
val Number.aC : Coulomb
    @JvmName("getaC_prop")
    /**
    * Returns aC, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-18))

/**
* attocoulomb, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.attocoulomb : Coulomb
    /**
    * Returns attocoulomb, 10^-18 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-18))

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
val Number.zC : Coulomb
    @JvmName("getzC_prop")
    /**
    * Returns zC, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-21))

/**
* zeptocoulomb, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.zeptocoulomb : Coulomb
    /**
    * Returns zeptocoulomb, 10^-21 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-21))


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
val Number.yC : Coulomb
    @JvmName("getyC_prop")
    /**
    * Returns yC, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-24))

/**
* yoctocoulomb, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.yoctocoulomb : Coulomb
    /**
    * Returns yoctocoulomb, 10^-24 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-24))


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
val Number.rC : Coulomb
    @JvmName("getrC_prop")
    /**
    * Returns rC, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-27))

/**
* rontocoulomb, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.rontocoulomb : Coulomb
    /**
    * Returns rontocoulomb, 10^-27 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-27))


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
val Number.qC : Coulomb
    @JvmName("getqC_prop")
    /**
    * Returns qC, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-30))

/**
* quectocoulomb, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
*/ 
val Number.quectocoulomb : Coulomb
    /**
    * Returns quectocoulomb, 10^-30 of coulomb, derived SI-Unit for measurement of electric charge
    */  
    get() = Coulomb(this.toDouble() * 10.0.pow(-30))


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
    