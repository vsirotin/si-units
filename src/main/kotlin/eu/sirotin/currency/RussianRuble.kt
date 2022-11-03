
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionRussianRuble = UnitSpecification(
    "RUB",
    "`₽`"
) { v: Double -> RussianRuble(v) }

class RussianRuble(value : Double = 1.0) : TermUnit(value, description = descriptionRussianRuble)
    val Number.RUB : RussianRuble
        get() = RussianRuble(this.toDouble())
    
    val RUB = RussianRuble()

    val Number.`₽` : RussianRuble
        get() = RussianRuble(this.toDouble())

    val `₽` = RussianRuble()
    