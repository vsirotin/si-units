
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionColombianPeso = UnitSpecification(
    "COP",
    "`COL$`"
) { v: Double -> ColombianPeso(v) }

/**
* Class for hold of Colombian peso
* @constructor Creates a class for hold of Colombian peso
*/
class ColombianPeso(value : Double = 1.0) : TermUnit(value, description = descriptionColombianPeso)
    
    /**
    * Creates object for hold of Colombian peso
    */
    val Number.COP : ColombianPeso
        /**
        * Returns value of object for hold of Colombian peso
        */
        get() = ColombianPeso(this.toDouble())

    /**
    * Holder for  of Colombian peso
    */
    val COP = ColombianPeso()

    /**
    * Creates object for hold of Colombian peso
    */
    val Number.`COL$` : ColombianPeso
        /**
        * Returns value of object for hold of Colombian peso
        */
        get() = ColombianPeso(this.toDouble())

    /**
    * Holder for  of Colombian peso
    */
    val `COL$` = ColombianPeso()
    