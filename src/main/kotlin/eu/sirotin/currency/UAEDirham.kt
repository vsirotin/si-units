
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionUAEDirham = UnitSpecification(
    "AED",
    "Dh"
) { v: Double -> UAEDirham(v) }

class UAEDirham(value : Double = 1.0) : TermUnit(value, description = descriptionUAEDirham)
    val Number.AED : UAEDirham
        get() = UAEDirham(this.toDouble())

    val AED = UAEDirham()

    val Number.Dh : UAEDirham
        get() = UAEDirham(this.toDouble())

    val Dh = UAEDirham()
    