
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionNorwegianKrone = UnitSpecification(
    "NOK",
    "nkr"
) { v: Double -> NorwegianKrone(v) }

class NorwegianKrone(value : Double = 1.0) : TermUnit(value, description = descriptionNorwegianKrone)
    val Number.NOK : NorwegianKrone
        get() = NorwegianKrone(this.toDouble())
    
    val NOK = NorwegianKrone()

    val Number.nkr : NorwegianKrone
        get() = NorwegianKrone(this.toDouble())

    val nkr = NorwegianKrone()
    