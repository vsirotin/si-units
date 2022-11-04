
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionHongKongDollar = UnitSpecification(
    "HKD",
    "`HK$`"
) { v: Double -> HongKongDollar(v) }

class HongKongDollar(value : Double = 1.0) : TermUnit(value, description = descriptionHongKongDollar)
    val Number.HKD : HongKongDollar
        get() = HongKongDollar(this.toDouble())

    val HKD = HongKongDollar()

    val Number.`HK$` : HongKongDollar
        get() = HongKongDollar(this.toDouble())

    val `HK$` = HongKongDollar()
    