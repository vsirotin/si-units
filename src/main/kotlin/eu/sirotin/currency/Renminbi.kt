
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionRenminbi = UnitSpecification(
    "CNY",
    "`人民币`"
) { v: Double -> Renminbi(v) }

class Renminbi(value : Double = 1.0) : TermUnit(value, description = descriptionRenminbi)
    val Number.CNY : Renminbi
        get() = Renminbi(this.toDouble())

    val CNY = Renminbi()

    val Number.`人民币` : Renminbi
        get() = Renminbi(this.toDouble())

    val `人民币` = Renminbi()
    