
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionJapaneseYen = UnitSpecification(
    "JPY",
    "`¥`"
) { v: Double -> JapaneseYen(v) }

class JapaneseYen(value : Double = 1.0) : TermUnit(value, description = descriptionJapaneseYen)
    val Number.JPY : JapaneseYen
        get() = JapaneseYen(this.toDouble())
    
    val JPY = JapaneseYen()

    val Number.`¥` : JapaneseYen
        get() = JapaneseYen(this.toDouble())

    val `¥` = JapaneseYen()
    