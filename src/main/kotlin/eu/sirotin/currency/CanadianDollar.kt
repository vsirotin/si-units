
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionCanadianDollar = UnitSpecification(
    "CAD",
    "`C$`"
) { v: Double -> CanadianDollar(v) }

class CanadianDollar(value : Double = 1.0) : TermUnit(value, description = descriptionCanadianDollar)
    val Number.CAD : CanadianDollar
        get() = CanadianDollar(this.toDouble())
    
    val CAD = CanadianDollar()

    val Number.`C$` : CanadianDollar
        get() = CanadianDollar(this.toDouble())

    val `C$` = CanadianDollar()
    