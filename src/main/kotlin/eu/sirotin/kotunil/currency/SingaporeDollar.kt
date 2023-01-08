
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionSingaporeDollar = UnitSpecification(
    "SGD",
    "`S$`"
) { v: Double -> SingaporeDollar(v) }

/**
* Class for hold of Singapore dollar
* @constructor Creates a class for hold of Singapore dollar with given [value]
*/
class SingaporeDollar(value : Double = 1.0) : Expression(value, description = descriptionSingaporeDollar)
    
    /**
    * Creates object for hold of Singapore dollar
    */
    val Number.SGD : SingaporeDollar
        /**
        * Returns value of object for hold of Singapore dollar
        */
        get() = SingaporeDollar(this.toDouble())

    /**
    * Holder for  of Singapore dollar
    */
    val SGD = SingaporeDollar()

    /**
    * Creates object for hold of Singapore dollar
    */
    val Number.`S$` : SingaporeDollar
        /**
        * Returns value of object for hold of Singapore dollar
        */
        get() = SingaporeDollar(this.toDouble())

    /**
    * Holder for  of Singapore dollar
    */
    val `S$` = SingaporeDollar()
    