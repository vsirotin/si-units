
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionColombianPeso = UnitSpecification(
    "COP",
    "`COL$`"
) { v: Double -> ColombianPeso(v) }

/**
* Class for hold of Colombian peso
* @constructor Creates a class for hold of Colombian peso with given [value]
*/
class ColombianPeso(value : Double = 1.0) : Expression(value, description = descriptionColombianPeso)
    
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

    
    
    