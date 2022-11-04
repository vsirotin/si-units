
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionIndianRupee = UnitSpecification(
    "INR",
    "`₹`"
) { v: Double -> IndianRupee(v) }

class IndianRupee(value : Double = 1.0) : TermUnit(value, description = descriptionIndianRupee)
    val Number.INR : IndianRupee
        get() = IndianRupee(this.toDouble())

    val INR = IndianRupee()

    val Number.`₹` : IndianRupee
        get() = IndianRupee(this.toDouble())

    val `₹` = IndianRupee()
    