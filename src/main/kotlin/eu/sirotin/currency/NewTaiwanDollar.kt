
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionNewTaiwanDollar = UnitSpecification(
    "TWD",
    "`NT$`"
) { v: Double -> NewTaiwanDollar(v) }

class NewTaiwanDollar(value : Double = 1.0) : TermUnit(value, description = descriptionNewTaiwanDollar)
    val Number.TWD : NewTaiwanDollar
        get() = NewTaiwanDollar(this.toDouble())
    
    val TWD = NewTaiwanDollar()

    val Number.`NT$` : NewTaiwanDollar
        get() = NewTaiwanDollar(this.toDouble())

    val `NT$` = NewTaiwanDollar()
    