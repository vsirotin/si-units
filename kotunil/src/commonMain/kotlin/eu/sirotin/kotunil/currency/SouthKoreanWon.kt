
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val descriptionSouthKoreanWon = UnitSpecification(
    "KRW",
    "`₩`"
) { v: Double -> SouthKoreanWon(v) }

/**
* Class for hold of  South Korean won
* @constructor Creates a class for hold of  South Korean won with given [value]
*/
@JsExport
class SouthKoreanWon(value : Double = 1.0) : Expression(value, description = descriptionSouthKoreanWon)
    
    /**
    * Creates object for hold of  South Korean won
    */
    val Number.KRW : SouthKoreanWon
        /**
        * Returns value of object for hold of  South Korean won
        */
        get() = SouthKoreanWon(this.toDouble())

    /**
    * Holder for  of  South Korean won
    */
    @JsExport
    @JsName("KRW")
    @JvmField
    val KRW = SouthKoreanWon()   
    