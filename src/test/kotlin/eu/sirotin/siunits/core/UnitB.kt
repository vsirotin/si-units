
package eu.sirotin.siunits.core

private val descriptionUnitB = DimensionSpecification("unit-b",
    "b",
    "BB",
    "unit-b-b",
    ){v:Double->UnitB(v)}
class UnitB(value: Double) : TermUnit(value, descriptionUnitB)

val b = UnitB(1.0)

val Number.b : UnitB
    get() = UnitB(this.toDouble())

//operator fun UnitB.plus(x: UnitB): UnitB = UnitB(this.value + x.value)
//operator fun UnitB.minus(x: UnitB): UnitB = UnitB(this.value - x.value)
//
//operator fun UnitB.times(x: Number): UnitB = UnitB(this.value * x.toDouble())
//operator fun Number.times(x: UnitB): UnitB = x.times(this)
//
//operator fun UnitB.div(x: Number): UnitB = this * (1.0 / x.toDouble())
//operator fun Number.div(u: UnitB): UnitB = 1 /(u / this)