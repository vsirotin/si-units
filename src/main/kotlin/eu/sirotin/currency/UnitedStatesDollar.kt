
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionUnitedStatesDollar = UnitSpecification(
    "USD",
    "`US$`"
) { v: Double -> UnitedStatesDollar(v) }

/**
* Class for hold of United States dollar
* @constructor Creates a class for hold of United States dollar
*/
class UnitedStatesDollar(value : Double = 1.0) : TermUnit(value, description = descriptionUnitedStatesDollar)
    
    /**
    * Creates object for hold of United States dollar
    */
    val Number.USD : UnitedStatesDollar
        /**
        * Returns value of object for hold of United States dollar
        */
        get() = UnitedStatesDollar(this.toDouble())

    /**
    * Holder for  of United States dollar
    */
    val USD = UnitedStatesDollar()

    /**
    * Creates object for hold of United States dollar
    */
    val Number.`US$` : UnitedStatesDollar
        /**
        * Returns value of object for hold of United States dollar
        */
        get() = UnitedStatesDollar(this.toDouble())

    /**
    * Holder for  of United States dollar
    */
    val `US$` = UnitedStatesDollar()
    