
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionPoundSterling = UnitSpecification(
    "GBP",
    "`£`"
) { v: Double -> PoundSterling(v) }

/**
* Class for hold of Sterling
* @constructor Creates a class for hold of Sterling
*/
class PoundSterling(value : Double = 1.0) : TermUnit(value, description = descriptionPoundSterling)
    
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

    /**
    * Creates object for hold of Sterling
    */
    val Number.`£` : PoundSterling
        /**
        * Returns value of object for hold of Sterling
        */
        get() = PoundSterling(this.toDouble())

    /**
    * Holder for  of Sterling
    */
    val `£` = PoundSterling()
    