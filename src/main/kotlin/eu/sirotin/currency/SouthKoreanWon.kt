
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionSouthKoreanWon = UnitSpecification(
    "KRW",
    "`₩`"
) { v: Double -> SouthKoreanWon(v) }

class SouthKoreanWon(value : Double = 1.0) : TermUnit(value, description = descriptionSouthKoreanWon)
    val Number.KRW : SouthKoreanWon
        get() = SouthKoreanWon(this.toDouble())

    val KRW = SouthKoreanWon()

    val Number.`₩` : SouthKoreanWon
        get() = SouthKoreanWon(this.toDouble())

    val `₩` = SouthKoreanWon()
    