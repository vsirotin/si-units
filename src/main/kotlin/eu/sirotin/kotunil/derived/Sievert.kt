
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.*
import eu.sirotin.kotunil.base.*
import eu.sirotin.kotunil.specialunits.*
import kotlin.math.pow

private val unit =  (m2)*(s `^` -2)

/**
* System International Unit for equivalent dose (of ionising radiation).
*/
val Sv = unit

/**
* Creates Sievert-Object for current number value. Sievert is a System International Unit for equivalent dose (of ionising radiation).
*/
val Number.Sv : Expression
   /**
   * Returns Sievert-Object for current number value. Sievert is a System International Unit for equivalent dose (of ionising radiation).
   */
    get() = this.toDouble() * unit

    
/**
* QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.QSv : Expression
    @JvmName("getQSv_prop")
    /**
    * Returns QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit

/**
* quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.quettasievert : Expression
    /**
    * Returns quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(30) * unit


@JvmField  
/**
* QSv, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val QSv = 10.0.pow(30) * ((m2)*(s `^` -2))

/**
* quettasievert, 10^30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val quettasievert = QSv
    

/**
* RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.RSv : Expression
    @JvmName("getRSv_prop")
    /**
    * Returns RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit

/**
* ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.ronnasievert : Expression
    /**
    * Returns ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(27) * unit


@JvmField  
/**
* RSv, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val RSv = 10.0.pow(27) * ((m2)*(s `^` -2))

/**
* ronnasievert, 10^27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val ronnasievert = RSv
    

/**
* YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.YSv : Expression
    @JvmName("getYSv_prop")
    /**
    * Returns YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit

/**
* yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.yottasievert : Expression
    /**
    * Returns yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(24) * unit


@JvmField  
/**
* YSv, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val YSv = 10.0.pow(24) * ((m2)*(s `^` -2))

/**
* yottasievert, 10^24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val yottasievert = YSv
    

/**
* ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ZSv : Expression
    @JvmName("getZSv_prop")
    /**
    * Returns ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit

/**
* zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.zettasievert : Expression
    /**
    * Returns zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(21) * unit


@JvmField  
/**
* ZSv, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ZSv = 10.0.pow(21) * ((m2)*(s `^` -2))

/**
* zettasievert, 10^21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val zettasievert = ZSv
    

/**
* ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ESv : Expression
    @JvmName("getESv_prop")
    /**
    * Returns ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit

/**
* exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.exasievert : Expression
    /**
    * Returns exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(18) * unit


@JvmField  
/**
* ESv, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ESv = 10.0.pow(18) * ((m2)*(s `^` -2))

/**
* exasievert, 10^18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val exasievert = ESv
    

/**
* PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.PSv : Expression
    @JvmName("getPSv_prop")
    /**
    * Returns PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit

/**
* petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.petasievert : Expression
    /**
    * Returns petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(15) * unit


@JvmField  
/**
* PSv, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val PSv = 10.0.pow(15) * ((m2)*(s `^` -2))

/**
* petasievert, 10^15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val petasievert = PSv
    

/**
* TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.TSv : Expression
    @JvmName("getTSv_prop")
    /**
    * Returns TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit

/**
* terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.terasievert : Expression
    /**
    * Returns terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(12) * unit


@JvmField  
/**
* TSv, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val TSv = 10.0.pow(12) * ((m2)*(s `^` -2))

/**
* terasievert, 10^12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val terasievert = TSv
    

/**
* GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.GSv : Expression
    @JvmName("getGSv_prop")
    /**
    * Returns GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit

/**
* gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.gigasievert : Expression
    /**
    * Returns gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(9) * unit


@JvmField  
/**
* GSv, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val GSv = 10.0.pow(9) * ((m2)*(s `^` -2))

/**
* gigasievert, 10^9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val gigasievert = GSv
    

/**
* MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.MSv : Expression
    @JvmName("getMSv_prop")
    /**
    * Returns MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit

/**
* megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.megasievert : Expression
    /**
    * Returns megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(6) * unit


@JvmField  
/**
* MSv, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val MSv = 10.0.pow(6) * ((m2)*(s `^` -2))

/**
* megasievert, 10^6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val megasievert = MSv
    

/**
* kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.kSv : Expression
    @JvmName("getkSv_prop")
    /**
    * Returns kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit

/**
* kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.kilosievert : Expression
    /**
    * Returns kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(3) * unit


@JvmField  
/**
* kSv, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val kSv = 10.0.pow(3) * ((m2)*(s `^` -2))

/**
* kilosievert, 10^3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val kilosievert = kSv
    

/**
* hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.hSv : Expression
    @JvmName("gethSv_prop")
    /**
    * Returns hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit

/**
* hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.hectosievert : Expression
    /**
    * Returns hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(2) * unit


@JvmField  
/**
* hSv, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val hSv = 10.0.pow(2) * ((m2)*(s `^` -2))

/**
* hectosievert, 10^2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val hectosievert = hSv
    

/**
* daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.daSv : Expression
    @JvmName("getdaSv_prop")
    /**
    * Returns daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit

/**
* decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.decasievert : Expression
    /**
    * Returns decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(1) * unit


@JvmField  
/**
* daSv, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val daSv = 10.0.pow(1) * ((m2)*(s `^` -2))

/**
* decasievert, 10^1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val decasievert = daSv
    

/**
* dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.dSv : Expression
    @JvmName("getdSv_prop")
    /**
    * Returns dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit

/**
* decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.decisievert : Expression
    /**
    * Returns decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-1) * unit


@JvmField  
/**
* dSv, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val dSv = 10.0.pow(-1) * ((m2)*(s `^` -2))

/**
* decisievert, 10^-1 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val decisievert = dSv
    

/**
* cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.cSv : Expression
    @JvmName("getcSv_prop")
    /**
    * Returns cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit

/**
* centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.centisievert : Expression
    /**
    * Returns centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-2) * unit


@JvmField  
/**
* cSv, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val cSv = 10.0.pow(-2) * ((m2)*(s `^` -2))

/**
* centisievert, 10^-2 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val centisievert = cSv
    

/**
* mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.mSv : Expression
    @JvmName("getmSv_prop")
    /**
    * Returns mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit

/**
* millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.millisievert : Expression
    /**
    * Returns millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-3) * unit


@JvmField  
/**
* mSv, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val mSv = 10.0.pow(-3) * ((m2)*(s `^` -2))

/**
* millisievert, 10^-3 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val millisievert = mSv
    

/**
* μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.μSv : Expression
    @JvmName("getμSv_prop")
    /**
    * Returns μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit

/**
* microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.microsievert : Expression
    /**
    * Returns microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-6) * unit


@JvmField  
/**
* μSv, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val μSv = 10.0.pow(-6) * ((m2)*(s `^` -2))

/**
* microsievert, 10^-6 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val microsievert = μSv
    

/**
* nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.nSv : Expression
    @JvmName("getnSv_prop")
    /**
    * Returns nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit

/**
* nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.nanosievert : Expression
    /**
    * Returns nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-9) * unit


@JvmField  
/**
* nSv, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val nSv = 10.0.pow(-9) * ((m2)*(s `^` -2))

/**
* nanosievert, 10^-9 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val nanosievert = nSv
    

/**
* pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.pSv : Expression
    @JvmName("getpSv_prop")
    /**
    * Returns pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit

/**
* picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.picosievert : Expression
    /**
    * Returns picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-12) * unit


@JvmField  
/**
* pSv, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val pSv = 10.0.pow(-12) * ((m2)*(s `^` -2))

/**
* picosievert, 10^-12 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val picosievert = pSv
    

/**
* fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.fSv : Expression
    @JvmName("getfSv_prop")
    /**
    * Returns fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit

/**
* femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.femtosievert : Expression
    /**
    * Returns femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-15) * unit


@JvmField  
/**
* fSv, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val fSv = 10.0.pow(-15) * ((m2)*(s `^` -2))

/**
* femtosievert, 10^-15 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val femtosievert = fSv
    

/**
* aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.aSv : Expression
    @JvmName("getaSv_prop")
    /**
    * Returns aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit

/**
* attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.attosievert : Expression
    /**
    * Returns attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-18) * unit


@JvmField  
/**
* aSv, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val aSv = 10.0.pow(-18) * ((m2)*(s `^` -2))

/**
* attosievert, 10^-18 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val attosievert = aSv
    

/**
* zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.zSv : Expression
    @JvmName("getzSv_prop")
    /**
    * Returns zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit

/**
* zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.zeptosievert : Expression
    /**
    * Returns zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-21) * unit


@JvmField  
/**
* zSv, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val zSv = 10.0.pow(-21) * ((m2)*(s `^` -2))

/**
* zeptosievert, 10^-21 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val zeptosievert = zSv
    

/**
* ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.ySv : Expression
    @JvmName("getySv_prop")
    /**
    * Returns ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit

/**
* yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.yoctosievert : Expression
    /**
    * Returns yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-24) * unit


@JvmField  
/**
* ySv, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val ySv = 10.0.pow(-24) * ((m2)*(s `^` -2))

/**
* yoctosievert, 10^-24 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val yoctosievert = ySv
    

/**
* rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.rSv : Expression
    @JvmName("getrSv_prop")
    /**
    * Returns rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit

/**
* rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.rontosievert : Expression
    /**
    * Returns rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-27) * unit


@JvmField  
/**
* rSv, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val rSv = 10.0.pow(-27) * ((m2)*(s `^` -2))

/**
* rontosievert, 10^-27 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val rontosievert = rSv
    

/**
* qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/    
val Number.qSv : Expression
    @JvmName("getqSv_prop")
    /**
    * Returns qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit

/**
* quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val Number.quectosievert : Expression
    /**
    * Returns quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
    */  
    get() = this.toDouble() * 10.0.pow(-30) * unit


@JvmField  
/**
* qSv, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/        
val qSv = 10.0.pow(-30) * ((m2)*(s `^` -2))

/**
* quectosievert, 10^-30 of sievert, derived SI-Unit for measurement of equivalent dose (of ionising radiation)
*/ 
val quectosievert = qSv
    