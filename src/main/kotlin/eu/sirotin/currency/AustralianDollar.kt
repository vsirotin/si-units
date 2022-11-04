
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionAustralianDollar = UnitSpecification(
    "AUD",
    "`A$`"
) { v: Double -> AustralianDollar(v) }

class AustralianDollar(value : Double = 1.0) : TermUnit(value, description = descriptionAustralianDollar)
    val Number.AUD : AustralianDollar
        get() = AustralianDollar(this.toDouble())

    val AUD = AustralianDollar()

    val Number.`A$` : AustralianDollar
        get() = AustralianDollar(this.toDouble())

    val `A$` = AustralianDollar()
    