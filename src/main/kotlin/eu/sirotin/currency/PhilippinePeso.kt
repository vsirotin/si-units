
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionPhilippinePeso = UnitSpecification(
    "PHP",
    "`₱`"
) { v: Double -> PhilippinePeso(v) }

class PhilippinePeso(value : Double = 1.0) : TermUnit(value, description = descriptionPhilippinePeso)
    val Number.PHP : PhilippinePeso
        get() = PhilippinePeso(this.toDouble())
    
    val PHP = PhilippinePeso()

    val Number.`₱` : PhilippinePeso
        get() = PhilippinePeso(this.toDouble())

    val `₱` = PhilippinePeso()
    