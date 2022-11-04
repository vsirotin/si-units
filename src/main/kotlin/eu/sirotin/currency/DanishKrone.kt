
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionDanishKrone = UnitSpecification(
    "DKK",
    "dkr"
) { v: Double -> DanishKrone(v) }

class DanishKrone(value : Double = 1.0) : TermUnit(value, description = descriptionDanishKrone)
    val Number.DKK : DanishKrone
        get() = DanishKrone(this.toDouble())

    val DKK = DanishKrone()

    val Number.dkr : DanishKrone
        get() = DanishKrone(this.toDouble())

    val dkr = DanishKrone()
    