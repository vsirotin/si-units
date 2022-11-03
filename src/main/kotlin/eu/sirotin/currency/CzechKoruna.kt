
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionCzechKoruna = UnitSpecification(
    "CZK",
    "`Kč`"
) { v: Double -> CzechKoruna(v) }

class CzechKoruna(value : Double = 1.0) : TermUnit(value, description = descriptionCzechKoruna)
    val Number.CZK : CzechKoruna
        get() = CzechKoruna(this.toDouble())
    
    val CZK = CzechKoruna()

    val Number.`Kč` : CzechKoruna
        get() = CzechKoruna(this.toDouble())

    val `Kč` = CzechKoruna()
    