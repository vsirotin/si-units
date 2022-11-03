
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionColombianPeso = UnitSpecification(
    "COP",
    "`COL$`"
) { v: Double -> ColombianPeso(v) }

class ColombianPeso(value : Double = 1.0) : TermUnit(value, description = descriptionColombianPeso)
    val Number.COP : ColombianPeso
        get() = ColombianPeso(this.toDouble())
    
    val COP = ColombianPeso()

    val Number.`COL$` : ColombianPeso
        get() = ColombianPeso(this.toDouble())

    val `COL$` = ColombianPeso()
    