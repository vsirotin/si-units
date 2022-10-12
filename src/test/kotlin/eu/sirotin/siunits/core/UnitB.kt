
package eu.sirotin.siunits.core

private val descriptionUnitB = SiUnitDescription("unit-b",
    "b",
    "BB",
    "unit-b-b",
    ){v:Double->UnitB(v)}
class UnitB(value: Double) : SiUnit(value, descriptionUnitB)

val b = UnitB(1.0)

val Number.b : UnitB
    get() = UnitB(this.toDouble())