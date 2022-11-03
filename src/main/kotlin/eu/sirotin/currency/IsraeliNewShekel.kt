
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionIsraeliNewShekel = UnitSpecification(
    "ILS",
    "`₪`"
) { v: Double -> IsraeliNewShekel(v) }

class IsraeliNewShekel(value : Double = 1.0) : TermUnit(value, description = descriptionIsraeliNewShekel)
    val Number.ILS : IsraeliNewShekel
        get() = IsraeliNewShekel(this.toDouble())
    
    val ILS = IsraeliNewShekel()

    val Number.`₪` : IsraeliNewShekel
        get() = IsraeliNewShekel(this.toDouble())

    val `₪` = IsraeliNewShekel()
    