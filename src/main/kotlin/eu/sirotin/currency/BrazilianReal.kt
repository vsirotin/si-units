
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionBrazilianReal = UnitSpecification(
    "BRL",
    "`R$`"
) { v: Double -> BrazilianReal(v) }

class BrazilianReal(value : Double = 1.0) : TermUnit(value, description = descriptionBrazilianReal)
    val Number.BRL : BrazilianReal
        get() = BrazilianReal(this.toDouble())
    
    val BRL = BrazilianReal()

    val Number.`R$` : BrazilianReal
        get() = BrazilianReal(this.toDouble())

    val `R$` = BrazilianReal()
    