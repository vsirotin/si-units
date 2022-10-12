package eu.sirotin.siunits.core


private val descriptionUnitA = SiUnitDescription("unit-a",
    "a",
    "UA",
    "unit-a-a"
) { v: Double -> UnitA(v) }


class UnitA(value: Double) : SiUnit(value, description = descriptionUnitA)
val Number.a : UnitA
    get() = UnitA(this.toDouble())


operator fun UnitA.plus(x: UnitA): UnitA = UnitA(this.value + x.value)
operator fun UnitA.minus(x: UnitA): UnitA = UnitA(this.value - x.value)

@Suppress("UNCHECKED_CAST")
operator fun UnitA.times(x: Number): UnitA = (this.description as SiUnitDescription<UnitA>).creator(this.value * x.toDouble())
operator fun Number.times(x: UnitA): UnitA = x.times(this)
@Suppress("UNCHECKED_CAST")
operator fun UnitA.div(x: Number): UnitA = (this.description as SiUnitDescription<UnitA>).creator(this.value / x.toDouble())


