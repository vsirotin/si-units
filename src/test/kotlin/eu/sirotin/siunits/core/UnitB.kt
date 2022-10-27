package eu.sirotin.siunits.core

private val descriptionUnitB = DimensionSpecification(
    "b",
    "B",
    "unit-b-b",
    ){v:Double->UnitB(v)}
class UnitB(value: Double) : TermUnit(value, descriptionUnitB)

val b = UnitB(1.0)

val Number.b : UnitB
    get() = UnitB(this.toDouble())
