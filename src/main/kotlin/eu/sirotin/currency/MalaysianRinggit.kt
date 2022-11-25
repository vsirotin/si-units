
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionMalaysianRinggit = UnitSpecification(
    "MYR",
    "RM"
) { v: Double -> MalaysianRinggit(v) }

/**
* Class for hold of Malaysian ringgit
* @constructor Creates a class for hold of Malaysian ringgit
*/
class MalaysianRinggit(value : Double = 1.0) : TermUnit(value, description = descriptionMalaysianRinggit)
    
    /**
    * Creates object for hold of Malaysian ringgit
    */
    val Number.MYR : MalaysianRinggit
        /**
        * Returns value of object for hold of Malaysian ringgit
        */
        get() = MalaysianRinggit(this.toDouble())

    /**
    * Holder for  of Malaysian ringgit
    */
    val MYR = MalaysianRinggit()

    /**
    * Creates object for hold of Malaysian ringgit
    */
    val Number.RM : MalaysianRinggit
        /**
        * Returns value of object for hold of Malaysian ringgit
        */
        get() = MalaysianRinggit(this.toDouble())

    /**
    * Holder for  of Malaysian ringgit
    */
    val RM = MalaysianRinggit()
    