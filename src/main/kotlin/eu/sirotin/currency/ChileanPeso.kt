
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionChileanPeso = UnitSpecification(
    "CLP",
    "`CLP$`"
) { v: Double -> ChileanPeso(v) }

/**
* Class for hold of Chilean peso
* @constructor Creates a class for hold of Chilean peso
*/
class ChileanPeso(value : Double = 1.0) : TermUnit(value, description = descriptionChileanPeso)
    
    /**
    * Creates object for hold of Chilean peso
    */
    val Number.CLP : ChileanPeso
        /**
        * Returns value of object for hold of Chilean peso
        */
        get() = ChileanPeso(this.toDouble())

    /**
    * Holder for  of Chilean peso
    */
    val CLP = ChileanPeso()

    /**
    * Creates object for hold of Chilean peso
    */
    val Number.`CLP$` : ChileanPeso
        /**
        * Returns value of object for hold of Chilean peso
        */
        get() = ChileanPeso(this.toDouble())

    /**
    * Holder for  of Chilean peso
    */
    val `CLP$` = ChileanPeso()
    