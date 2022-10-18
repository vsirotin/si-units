package eu.sirotin.siunits.core


private val descriptionUnitA = DimensionSpecification("unit-a",
    "a",
    "UA",
    "unit-a-a",
    1,
) { v: Double -> UnitA(v) }


class UnitA(value: Double) : TermUnit(value, description = descriptionUnitA)
val Number.a : UnitA
    get() = UnitA(this.toDouble())

//
//operator fun UnitA.plus(x: UnitA): UnitA = UnitA(this.value + x.value)
//operator fun UnitA.minus(x: UnitA): UnitA = UnitA(this.value - x.value)
//
//operator fun UnitA.times(x: Number): UnitA = UnitA(this.value * x.toDouble())
//operator fun Number.times(x: UnitA): UnitA = x * this
//
//operator fun UnitA.div(x: Number): UnitA = this * (1.0 / x.toDouble())
//operator fun Number.div(u: UnitA): UnitA = 1 /(u / this)


