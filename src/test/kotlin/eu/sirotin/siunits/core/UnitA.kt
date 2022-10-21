package eu.sirotin.siunits.core


private val descriptionUnitA = DimensionSpecification("unit-a",
    "a",
    "A",
    "unit-a-a",
    1,
) { v: Double -> UnitA(v) }


class UnitA(value: Double) : TermUnit(value, description = descriptionUnitA)
val Number.a : UnitA
    get() = UnitA(this.toDouble())

val a = UnitA(1.0)

val UnitA.aa : Double
    get() = this.value * 1000.0

val Expression.aa : Double
    get() = (this.toTermUnit() as UnitA).aa
