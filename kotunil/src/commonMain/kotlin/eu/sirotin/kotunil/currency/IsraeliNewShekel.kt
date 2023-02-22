
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionIsraeliNewShekel = UnitSpecification(
    "ILS",
    "`₪`"
) { v: Double -> IsraeliNewShekel(v) }

/**
* Class for hold of Israeli new shekel
* @constructor Creates a class for hold of Israeli new shekel with given [value]
*/
class IsraeliNewShekel(value : Double = 1.0) : Expression(value, description = descriptionIsraeliNewShekel)
    
    /**
    * Creates object for hold of Israeli new shekel
    */
    val Number.ILS : IsraeliNewShekel
        /**
        * Returns value of object for hold of Israeli new shekel
        */
        get() = IsraeliNewShekel(this.toDouble())

    /**
    * Holder for  of Israeli new shekel
    */
    val ILS = IsraeliNewShekel()

    
    
    