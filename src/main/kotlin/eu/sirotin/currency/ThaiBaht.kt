
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionThaiBaht = UnitSpecification(
    "THB",
    "`฿`"
) { v: Double -> ThaiBaht(v) }

class ThaiBaht(value : Double = 1.0) : TermUnit(value, description = descriptionThaiBaht)
    val Number.THB : ThaiBaht
        get() = ThaiBaht(this.toDouble())
    
    val THB = ThaiBaht()

    val Number.`฿` : ThaiBaht
        get() = ThaiBaht(this.toDouble())

    val `฿` = ThaiBaht()
    