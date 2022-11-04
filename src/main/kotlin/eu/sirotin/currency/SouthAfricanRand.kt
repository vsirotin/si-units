
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionSouthAfricanRand = UnitSpecification(
    "ZAR",
    "R"
) { v: Double -> SouthAfricanRand(v) }

class SouthAfricanRand(value : Double = 1.0) : TermUnit(value, description = descriptionSouthAfricanRand)
    val Number.ZAR : SouthAfricanRand
        get() = SouthAfricanRand(this.toDouble())

    val ZAR = SouthAfricanRand()

    val Number.R : SouthAfricanRand
        get() = SouthAfricanRand(this.toDouble())

    val R = SouthAfricanRand()
    