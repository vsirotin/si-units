
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionMalaysianRinggit = UnitSpecification(
    "MYR",
    "RM"
) { v: Double -> MalaysianRinggit(v) }

class MalaysianRinggit(value : Double = 1.0) : TermUnit(value, description = descriptionMalaysianRinggit)
    val Number.MYR : MalaysianRinggit
        get() = MalaysianRinggit(this.toDouble())

    val MYR = MalaysianRinggit()

    val Number.RM : MalaysianRinggit
        get() = MalaysianRinggit(this.toDouble())

    val RM = MalaysianRinggit()
    