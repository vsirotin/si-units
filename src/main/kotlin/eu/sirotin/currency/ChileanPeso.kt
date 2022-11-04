
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionChileanPeso = UnitSpecification(
    "CLP",
    "`CLP$`"
) { v: Double -> ChileanPeso(v) }

class ChileanPeso(value : Double = 1.0) : TermUnit(value, description = descriptionChileanPeso)
    val Number.CLP : ChileanPeso
        get() = ChileanPeso(this.toDouble())

    val CLP = ChileanPeso()

    val Number.`CLP$` : ChileanPeso
        get() = ChileanPeso(this.toDouble())

    val `CLP$` = ChileanPeso()
    