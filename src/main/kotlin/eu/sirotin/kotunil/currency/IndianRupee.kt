
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionIndianRupee = UnitSpecification(
    "INR",
    "`₹`"
) { v: Double -> IndianRupee(v) }

/**
* Class for hold of Indian rupee
* @constructor Creates a class for hold of Indian rupee with given [value]
*/
class IndianRupee(value : Double = 1.0) : Expression(value, description = descriptionIndianRupee)
    
    /**
    * Creates object for hold of Indian rupee
    */
    val Number.INR : IndianRupee
        /**
        * Returns value of object for hold of Indian rupee
        */
        get() = IndianRupee(this.toDouble())

    /**
    * Holder for  of Indian rupee
    */
    val INR = IndianRupee()

    /**
    * Creates object for hold of Indian rupee
    */
    val Number.`₹` : IndianRupee
        /**
        * Returns value of object for hold of Indian rupee
        */
        get() = IndianRupee(this.toDouble())

    /**
    * Holder for  of Indian rupee
    */
    val `₹` = IndianRupee()
    