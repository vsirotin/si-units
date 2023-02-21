
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionPoundSterling = UnitSpecification(
    "GBP",
    "`£`"
) { v: Double -> PoundSterling(v) }

/**
* Class for hold of Sterling
* @constructor Creates a class for hold of Sterling with given [value]
*/
class PoundSterling(value : Double = 1.0) : Expression(value, description = descriptionPoundSterling)
    
    /**
    * Creates object for hold of Sterling
    */
    val Number.GBP : PoundSterling
        /**
        * Returns value of object for hold of Sterling
        */
        get() = PoundSterling(this.toDouble())

    /**
    * Holder for  of Sterling
    */
    val GBP = PoundSterling()

    
    
    