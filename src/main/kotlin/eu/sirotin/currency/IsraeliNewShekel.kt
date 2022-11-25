
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionIsraeliNewShekel = UnitSpecification(
    "ILS",
    "`₪`"
) { v: Double -> IsraeliNewShekel(v) }

/**
* Class for hold of Israeli new shekel
* @constructor Creates a class for hold of Israeli new shekel
*/
class IsraeliNewShekel(value : Double = 1.0) : TermUnit(value, description = descriptionIsraeliNewShekel)
    
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

    /**
    * Creates object for hold of Israeli new shekel
    */
    val Number.`₪` : IsraeliNewShekel
        /**
        * Returns value of object for hold of Israeli new shekel
        */
        get() = IsraeliNewShekel(this.toDouble())

    /**
    * Holder for  of Israeli new shekel
    */
    val `₪` = IsraeliNewShekel()
    