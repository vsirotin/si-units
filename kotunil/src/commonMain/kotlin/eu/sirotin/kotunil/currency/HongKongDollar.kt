
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionHongKongDollar = UnitSpecification(
    "HKD",
    "`HK$`"
) { v: Double -> HongKongDollar(v) }

/**
* Class for hold of Hong Kong dollar
* @constructor Creates a class for hold of Hong Kong dollar with given [value]
*/
class HongKongDollar(value : Double = 1.0) : Expression(value, description = descriptionHongKongDollar)
    
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
    