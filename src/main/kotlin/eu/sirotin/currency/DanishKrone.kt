
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionDanishKrone = UnitSpecification(
    "DKK",
    "dkr"
) { v: Double -> DanishKrone(v) }

/**
* Class for hold of Danish krone
* @constructor Creates a class for hold of Danish krone
*/
class DanishKrone(value : Double = 1.0) : TermUnit(value, description = descriptionDanishKrone)
    
    /**
    * Creates object for hold of Danish krone
    */
    val Number.DKK : DanishKrone
        /**
        * Returns value of object for hold of Danish krone
        */
        get() = DanishKrone(this.toDouble())

    /**
    * Holder for  of Danish krone
    */
    val DKK = DanishKrone()

    /**
    * Creates object for hold of Danish krone
    */
    val Number.dkr : DanishKrone
        /**
        * Returns value of object for hold of Danish krone
        */
        get() = DanishKrone(this.toDouble())

    /**
    * Holder for  of Danish krone
    */
    val dkr = DanishKrone()
    