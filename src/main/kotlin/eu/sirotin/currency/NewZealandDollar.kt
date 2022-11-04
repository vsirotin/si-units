
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionNewZealandDollar = UnitSpecification(
    "NZD",
    "`NZ$`"
) { v: Double -> NewZealandDollar(v) }

class NewZealandDollar(value : Double = 1.0) : TermUnit(value, description = descriptionNewZealandDollar)
    val Number.NZD : NewZealandDollar
        get() = NewZealandDollar(this.toDouble())

    val NZD = NewZealandDollar()

    val Number.`NZ$` : NewZealandDollar
        get() = NewZealandDollar(this.toDouble())

    val `NZ$` = NewZealandDollar()
    