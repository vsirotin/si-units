
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionHungarianForint = UnitSpecification(
    "HUF",
    "Ft"
) { v: Double -> HungarianForint(v) }

class HungarianForint(value : Double = 1.0) : TermUnit(value, description = descriptionHungarianForint)
    val Number.HUF : HungarianForint
        get() = HungarianForint(this.toDouble())
    
    val HUF = HungarianForint()

    val Number.Ft : HungarianForint
        get() = HungarianForint(this.toDouble())

    val Ft = HungarianForint()
    