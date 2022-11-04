
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionTurkishLira = UnitSpecification(
    "TRY",
    "`₺`"
) { v: Double -> TurkishLira(v) }

class TurkishLira(value : Double = 1.0) : TermUnit(value, description = descriptionTurkishLira)
    val Number.TRY : TurkishLira
        get() = TurkishLira(this.toDouble())

    val TRY = TurkishLira()

    val Number.`₺` : TurkishLira
        get() = TurkishLira(this.toDouble())

    val `₺` = TurkishLira()
    