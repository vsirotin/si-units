
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField

private val descriptionNorwegianKrone = UnitSpecification(
    "NOK",
    "nkr"
) { v: Double -> NorwegianKrone(v) }

/**
* Class for hold of Norwegian krone
* @constructor Creates a class for hold of Norwegian krone with given [value]
*/
class NorwegianKrone(value : Double = 1.0) : Expression(value, description = descriptionNorwegianKrone)
    
    /**
    * Creates object for hold of Norwegian krone
    */
    val Number.NOK : NorwegianKrone
        /**
        * Returns value of object for hold of Norwegian krone
        */
        get() = NorwegianKrone(this.toDouble())

    /**
    * Holder for  of Norwegian krone
    */
    @JvmField()
    val NOK = NorwegianKrone()   
    

/**
* Creates object for hold of Norwegian krone
*/
val Number.nkr : NorwegianKrone
    /**
    * Returns value of object for hold of Norwegian krone
    */
    get() = NorwegianKrone(this.toDouble())

/**
* One unit of Norwegian krone
*/
@JvmField()
val nkr = NorwegianKrone()
