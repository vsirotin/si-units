
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionNewZealandDollar = UnitSpecification(
    "NZD",
    "`NZ$`"
) { v: Double -> NewZealandDollar(v) }

/**
* Class for hold of New Zealand dollar
* @constructor Creates a class for hold of New Zealand dollar with given [value]
*/
class NewZealandDollar(value : Double = 1.0) : Expression(value, description = descriptionNewZealandDollar)
    
    /**
    * Creates object for hold of New Zealand dollar
    */
    val Number.NZD : NewZealandDollar
        /**
        * Returns value of object for hold of New Zealand dollar
        */
        get() = NewZealandDollar(this.toDouble())

    /**
    * Holder for  of New Zealand dollar
    */
    val NZD = NewZealandDollar()

    /**
    * Creates object for hold of New Zealand dollar
    */
    val Number.`NZ$` : NewZealandDollar
        /**
        * Returns value of object for hold of New Zealand dollar
        */
        get() = NewZealandDollar(this.toDouble())

    /**
    * Holder for  of New Zealand dollar
    */
    val `NZ$` = NewZealandDollar()
    