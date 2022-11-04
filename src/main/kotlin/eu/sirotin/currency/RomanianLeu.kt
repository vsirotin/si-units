
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionRomanianLeu = UnitSpecification(
    "RON",
    "L"
) { v: Double -> RomanianLeu(v) }

class RomanianLeu(value : Double = 1.0) : TermUnit(value, description = descriptionRomanianLeu)
    val Number.RON : RomanianLeu
        get() = RomanianLeu(this.toDouble())

    val RON = RomanianLeu()

    val Number.L : RomanianLeu
        get() = RomanianLeu(this.toDouble())

    val L = RomanianLeu()
    