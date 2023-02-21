
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionPhilippinePeso = UnitSpecification(
    "PHP",
    "`₱`"
) { v: Double -> PhilippinePeso(v) }

/**
* Class for hold of Philippine peso
* @constructor Creates a class for hold of Philippine peso with given [value]
*/
class PhilippinePeso(value : Double = 1.0) : Expression(value, description = descriptionPhilippinePeso)
    
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

    
    
    