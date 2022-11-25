
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionHongKongDollar = UnitSpecification(
    "HKD",
    "`HK$`"
) { v: Double -> HongKongDollar(v) }

/**
* Class for hold of Hong Kong dollar
* @constructor Creates a class for hold of Hong Kong dollar
*/
class HongKongDollar(value : Double = 1.0) : TermUnit(value, description = descriptionHongKongDollar)
    
    /**
    * Creates object for hold of Hong Kong dollar
    */
    val Number.HKD : HongKongDollar
        /**
        * Returns value of object for hold of Hong Kong dollar
        */
        get() = HongKongDollar(this.toDouble())

    /**
    * Holder for  of Hong Kong dollar
    */
    val HKD = HongKongDollar()

    /**
    * Creates object for hold of Hong Kong dollar
    */
    val Number.`HK$` : HongKongDollar
        /**
        * Returns value of object for hold of Hong Kong dollar
        */
        get() = HongKongDollar(this.toDouble())

    /**
    * Holder for  of Hong Kong dollar
    */
    val `HK$` = HongKongDollar()
    