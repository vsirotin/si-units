
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionPoundSterling = UnitSpecification(
    "GBP",
    "`£`"
) { v: Double -> PoundSterling(v) }

class PoundSterling(value : Double = 1.0) : TermUnit(value, description = descriptionPoundSterling)
    val Number.GBP : PoundSterling
        get() = PoundSterling(this.toDouble())

    val GBP = PoundSterling()

    val Number.`£` : PoundSterling
        get() = PoundSterling(this.toDouble())

    val `£` = PoundSterling()
    