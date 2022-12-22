
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionHungarianForint = UnitSpecification(
    "HUF",
    "Ft"
) { v: Double -> HungarianForint(v) }

/**
* Class for hold of Hungarian forint
* @constructor Creates a class for hold of Hungarian forint with given [value]
*/
class HungarianForint(value : Double = 1.0) : TermUnit(value, description = descriptionHungarianForint)
    
    /**
    * Creates object for hold of Hungarian forint
    */
    val Number.HUF : HungarianForint
        /**
        * Returns value of object for hold of Hungarian forint
        */
        get() = HungarianForint(this.toDouble())

    /**
    * Holder for  of Hungarian forint
    */
    val HUF = HungarianForint()

    /**
    * Creates object for hold of Hungarian forint
    */
    val Number.Ft : HungarianForint
        /**
        * Returns value of object for hold of Hungarian forint
        */
        get() = HungarianForint(this.toDouble())

    /**
    * Holder for  of Hungarian forint
    */
    val Ft = HungarianForint()
    