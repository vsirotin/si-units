
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionSaudiRiyal = UnitSpecification(
    "SAR",
    "`﷼ `"
) { v: Double -> SaudiRiyal(v) }

class SaudiRiyal(value : Double = 1.0) : TermUnit(value, description = descriptionSaudiRiyal)
    val Number.SAR : SaudiRiyal
        get() = SaudiRiyal(this.toDouble())
    
    val SAR = SaudiRiyal()

    val Number.`﷼ ` : SaudiRiyal
        get() = SaudiRiyal(this.toDouble())

    val `﷼ ` = SaudiRiyal()
    