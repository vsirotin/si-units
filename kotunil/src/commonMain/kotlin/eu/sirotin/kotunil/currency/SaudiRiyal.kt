
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionSaudiRiyal = UnitSpecification(
    "SAR",
    "`﷼ `"
) { v: Double -> SaudiRiyal(v) }

/**
* Class for hold of Saudi riyal
* @constructor Creates a class for hold of Saudi riyal with given [value]
*/
class SaudiRiyal(value : Double = 1.0) : Expression(value, description = descriptionSaudiRiyal)
    
    /**
    * Creates object for hold of Saudi riyal
    */
    val Number.SAR : SaudiRiyal
        /**
        * Returns value of object for hold of Saudi riyal
        */
        get() = SaudiRiyal(this.toDouble())

    /**
    * Holder for  of Saudi riyal
    */
    val SAR = SaudiRiyal()

    /**
    * Creates object for hold of Saudi riyal
    */
    val Number.`﷼ ` : SaudiRiyal
        /**
        * Returns value of object for hold of Saudi riyal
        */
        get() = SaudiRiyal(this.toDouble())

    /**
    * Holder for  of Saudi riyal
    */
    val `﷼ ` = SaudiRiyal()
    