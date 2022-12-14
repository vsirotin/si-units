
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionUnitedStatesDollar = UnitSpecification(
    "USD",
    "`US$`"
) { v: Double -> UnitedStatesDollar(v) }

/**
* Class for hold of United States dollar
* @constructor Creates a class for hold of United States dollar with given [value]
*/
class UnitedStatesDollar(value : Double = 1.0) : Expression(value, description = descriptionUnitedStatesDollar)
    
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
    