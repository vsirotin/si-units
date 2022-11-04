
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionSingaporeDollar = UnitSpecification(
    "SGD",
    "`S$`"
) { v: Double -> SingaporeDollar(v) }

class SingaporeDollar(value : Double = 1.0) : TermUnit(value, description = descriptionSingaporeDollar)
    val Number.SGD : SingaporeDollar
        get() = SingaporeDollar(this.toDouble())

    val SGD = SingaporeDollar()

    val Number.`S$` : SingaporeDollar
        get() = SingaporeDollar(this.toDouble())

    val `S$` = SingaporeDollar()
    