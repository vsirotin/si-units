
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionMexicanPeso = UnitSpecification(
    "MXN",
    "`$`"
) { v: Double -> MexicanPeso(v) }

/**
* Class for hold of Mexican peso
* @constructor Creates a class for hold of Mexican peso with given [value]
*/
class MexicanPeso(value : Double = 1.0) : TermUnit(value, description = descriptionMexicanPeso)
    
    /**
    * Creates object for hold of Mexican peso
    */
    val Number.MXN : MexicanPeso
        /**
        * Returns value of object for hold of Mexican peso
        */
        get() = MexicanPeso(this.toDouble())

    /**
    * Holder for  of Mexican peso
    */
    val MXN = MexicanPeso()

    /**
    * Creates object for hold of Mexican peso
    */
    val Number.`$` : MexicanPeso
        /**
        * Returns value of object for hold of Mexican peso
        */
        get() = MexicanPeso(this.toDouble())

    /**
    * Holder for  of Mexican peso
    */
    val `$` = MexicanPeso()
    