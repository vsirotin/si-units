
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionIndianRupee = UnitSpecification(
    "INR",
    "`₹`"
) { v: Double -> IndianRupee(v) }

/**
* Class for hold of Indian rupee
* @constructor Creates a class for hold of Indian rupee with given [value]
*/
@JsExport
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
    @JsExport
    @JvmField()
    val INR = IndianRupee()   
    