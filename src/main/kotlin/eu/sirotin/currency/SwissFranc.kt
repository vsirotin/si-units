
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionSwissFranc = UnitSpecification(
    "CHF",
    "SCHF"
) { v: Double -> SwissFranc(v) }

class SwissFranc(value : Double = 1.0) : TermUnit(value, description = descriptionSwissFranc)
    val Number.CHF : SwissFranc
        get() = SwissFranc(this.toDouble())

    val CHF = SwissFranc()

    val Number.SCHF : SwissFranc
        get() = SwissFranc(this.toDouble())

    val SCHF = SwissFranc()
    