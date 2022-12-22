
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionSouthKoreanWon = UnitSpecification(
    "KRW",
    "`₩`"
) { v: Double -> SouthKoreanWon(v) }

/**
* Class for hold of  South Korean won
* @constructor Creates a class for hold of  South Korean won with given [value]
*/
class SouthKoreanWon(value : Double = 1.0) : TermUnit(value, description = descriptionSouthKoreanWon)
    
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
    val KRW = SouthKoreanWon()

    /**
    * Creates object for hold of  South Korean won
    */
    val Number.`₩` : SouthKoreanWon
        /**
        * Returns value of object for hold of  South Korean won
        */
        get() = SouthKoreanWon(this.toDouble())

    /**
    * Holder for  of  South Korean won
    */
    val `₩` = SouthKoreanWon()
    