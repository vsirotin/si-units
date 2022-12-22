
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionNorwegianKrone = UnitSpecification(
    "NOK",
    "nkr"
) { v: Double -> NorwegianKrone(v) }

/**
* Class for hold of Norwegian krone
* @constructor Creates a class for hold of Norwegian krone with given [value]
*/
class NorwegianKrone(value : Double = 1.0) : TermUnit(value, description = descriptionNorwegianKrone)
    
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
    * Holder for  of Norwegian krone
    */
    val nkr = NorwegianKrone()
    