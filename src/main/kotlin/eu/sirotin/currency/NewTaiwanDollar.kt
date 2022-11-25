
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionNewTaiwanDollar = UnitSpecification(
    "TWD",
    "`NT$`"
) { v: Double -> NewTaiwanDollar(v) }

/**
* Class for hold of New Taiwan dollar
* @constructor Creates a class for hold of New Taiwan dollar
*/
class NewTaiwanDollar(value : Double = 1.0) : TermUnit(value, description = descriptionNewTaiwanDollar)
    
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

    /**
    * Creates object for hold of New Taiwan dollar
    */
    val Number.`NT$` : NewTaiwanDollar
        /**
        * Returns value of object for hold of New Taiwan dollar
        */
        get() = NewTaiwanDollar(this.toDouble())

    /**
    * Holder for  of New Taiwan dollar
    */
    val `NT$` = NewTaiwanDollar()
    