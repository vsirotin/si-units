
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionMalaysianRinggit = UnitSpecification(
    "MYR",
    "RM"
) { v: Double -> MalaysianRinggit(v) }

/**
* Class for hold of Malaysian ringgit
* @constructor Creates a class for hold of Malaysian ringgit with given [value]
*/
class MalaysianRinggit(value : Double = 1.0) : Expression(value, description = descriptionMalaysianRinggit)
    
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
* One unit of Malaysian ringgit
*/
val RM = MalaysianRinggit()
