
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionEuro = UnitSpecification(
    "EUR",
    "`€`"
) { v: Double -> Euro(v) }

class Euro(value : Double = 1.0) : TermUnit(value, description = descriptionEuro)
    val Number.EUR : Euro
        get() = Euro(this.toDouble())

    val EUR = Euro()

    val Number.`€` : Euro
        get() = Euro(this.toDouble())

    val `€` = Euro()
    