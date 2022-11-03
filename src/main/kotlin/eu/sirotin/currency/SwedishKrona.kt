
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionSwedishKrona = UnitSpecification(
    "SEK",
    "skr"
) { v: Double -> SwedishKrona(v) }

class SwedishKrona(value : Double = 1.0) : TermUnit(value, description = descriptionSwedishKrona)
    val Number.SEK : SwedishKrona
        get() = SwedishKrona(this.toDouble())
    
    val SEK = SwedishKrona()

    val Number.skr : SwedishKrona
        get() = SwedishKrona(this.toDouble())

    val skr = SwedishKrona()
    