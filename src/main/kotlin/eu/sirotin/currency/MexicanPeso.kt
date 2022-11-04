
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionMexicanPeso = UnitSpecification(
    "MXN",
    "`$`"
) { v: Double -> MexicanPeso(v) }

class MexicanPeso(value : Double = 1.0) : TermUnit(value, description = descriptionMexicanPeso)
    val Number.MXN : MexicanPeso
        get() = MexicanPeso(this.toDouble())

    val MXN = MexicanPeso()

    val Number.`$` : MexicanPeso
        get() = MexicanPeso(this.toDouble())

    val `$` = MexicanPeso()
    