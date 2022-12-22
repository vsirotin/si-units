
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionSwissFranc = UnitSpecification(
    "CHF",
    "SCHF"
) { v: Double -> SwissFranc(v) }

/**
* Class for hold of Swiss franc
* @constructor Creates a class for hold of Swiss franc with given [value]
*/
class SwissFranc(value : Double = 1.0) : TermUnit(value, description = descriptionSwissFranc)
    
    /**
    * Creates object for hold of Swiss franc
    */
    val Number.CHF : SwissFranc
        /**
        * Returns value of object for hold of Swiss franc
        */
        get() = SwissFranc(this.toDouble())

    /**
    * Holder for  of Swiss franc
    */
    val CHF = SwissFranc()

    /**
    * Creates object for hold of Swiss franc
    */
    val Number.SCHF : SwissFranc
        /**
        * Returns value of object for hold of Swiss franc
        */
        get() = SwissFranc(this.toDouble())

    /**
    * Holder for  of Swiss franc
    */
    val SCHF = SwissFranc()
    