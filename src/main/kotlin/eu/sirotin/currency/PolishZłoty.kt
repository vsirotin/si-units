
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionPolishZłoty = UnitSpecification(
    "PLN",
    "`zł`"
) { v: Double -> PolishZłoty(v) }

class PolishZłoty(value : Double = 1.0) : TermUnit(value, description = descriptionPolishZłoty)
    val Number.PLN : PolishZłoty
        get() = PolishZłoty(this.toDouble())

    val PLN = PolishZłoty()

    val Number.`zł` : PolishZłoty
        get() = PolishZłoty(this.toDouble())

    val `zł` = PolishZłoty()
    