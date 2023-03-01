
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionNewTaiwanDollar = UnitSpecification(
    "TWD",
    "`NT$`"
) { v: Double -> NewTaiwanDollar(v) }

/**
* Class for hold of New Taiwan dollar
* @constructor Creates a class for hold of New Taiwan dollar with given [value]
*/
class NewTaiwanDollar(value : Double = 1.0) : Expression(value, description = descriptionNewTaiwanDollar)
    
    /**
    * Creates object for hold of New Taiwan dollar
    */
    val Number.TWD : NewTaiwanDollar
        /**
        * Returns value of object for hold of New Taiwan dollar
        */
        get() = NewTaiwanDollar(this.toDouble())

    /**
    * Holder for  of New Taiwan dollar
    */
    val TWD = NewTaiwanDollar()   
    