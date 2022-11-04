
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionUnitedStatesDollar = UnitSpecification(
    "USD",
    "`US$`"
) { v: Double -> UnitedStatesDollar(v) }

class UnitedStatesDollar(value : Double = 1.0) : TermUnit(value, description = descriptionUnitedStatesDollar)
    val Number.USD : UnitedStatesDollar
        get() = UnitedStatesDollar(this.toDouble())

    val USD = UnitedStatesDollar()

    val Number.`US$` : UnitedStatesDollar
        get() = UnitedStatesDollar(this.toDouble())

    val `US$` = UnitedStatesDollar()
    