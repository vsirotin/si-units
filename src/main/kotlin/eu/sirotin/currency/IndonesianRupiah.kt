
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionIndonesianRupiah = UnitSpecification(
    "IDR",
    "Rp"
) { v: Double -> IndonesianRupiah(v) }

class IndonesianRupiah(value : Double = 1.0) : TermUnit(value, description = descriptionIndonesianRupiah)
    val Number.IDR : IndonesianRupiah
        get() = IndonesianRupiah(this.toDouble())

    val IDR = IndonesianRupiah()

    val Number.Rp : IndonesianRupiah
        get() = IndonesianRupiah(this.toDouble())

    val Rp = IndonesianRupiah()
    