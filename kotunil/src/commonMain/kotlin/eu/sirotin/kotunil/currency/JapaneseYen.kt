
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionJapaneseYen = UnitSpecification(
    "JPY",
    "`¥`"
) { v: Double -> JapaneseYen(v) }

/**
* Class for hold of Japanese yen
* @constructor Creates a class for hold of Japanese yen with given [value]
*/
//@JsExport
class JapaneseYen(value : Double = 1.0) : Expression(value, description = descriptionJapaneseYen)
    
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
    //@JsExport
    @JvmField
    val JPY = JapaneseYen()   
    