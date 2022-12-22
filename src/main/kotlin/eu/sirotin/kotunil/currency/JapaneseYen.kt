
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionJapaneseYen = UnitSpecification(
    "JPY",
    "`¥`"
) { v: Double -> JapaneseYen(v) }

/**
* Class for hold of Japanese yen
* @constructor Creates a class for hold of Japanese yen with given [value]
*/
class JapaneseYen(value : Double = 1.0) : TermUnit(value, description = descriptionJapaneseYen)
    
    /**
    * Creates object for hold of Japanese yen
    */
    val Number.JPY : JapaneseYen
        /**
        * Returns value of object for hold of Japanese yen
        */
        get() = JapaneseYen(this.toDouble())

    /**
    * Holder for  of Japanese yen
    */
    val JPY = JapaneseYen()

    /**
    * Creates object for hold of Japanese yen
    */
    val Number.`¥` : JapaneseYen
        /**
        * Returns value of object for hold of Japanese yen
        */
        get() = JapaneseYen(this.toDouble())

    /**
    * Holder for  of Japanese yen
    */
    val `¥` = JapaneseYen()
    