
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionPhilippinePeso = UnitSpecification(
    "PHP",
    "`₱`"
) { v: Double -> PhilippinePeso(v) }

/**
* Class for hold of Philippine peso
* @constructor Creates a class for hold of Philippine peso with given [value]
*/
class PhilippinePeso(value : Double = 1.0) : TermUnit(value, description = descriptionPhilippinePeso)
    
    /**
    * Creates object for hold of Philippine peso
    */
    val Number.PHP : PhilippinePeso
        /**
        * Returns value of object for hold of Philippine peso
        */
        get() = PhilippinePeso(this.toDouble())

    /**
    * Holder for  of Philippine peso
    */
    val PHP = PhilippinePeso()

    /**
    * Creates object for hold of Philippine peso
    */
    val Number.`₱` : PhilippinePeso
        /**
        * Returns value of object for hold of Philippine peso
        */
        get() = PhilippinePeso(this.toDouble())

    /**
    * Holder for  of Philippine peso
    */
    val `₱` = PhilippinePeso()
    