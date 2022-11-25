
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionAustralianDollar = UnitSpecification(
    "AUD",
    "`A$`"
) { v: Double -> AustralianDollar(v) }

/**
* Class for hold of Australian dollar
* @constructor Creates a class for hold of Australian dollar
*/
class AustralianDollar(value : Double = 1.0) : TermUnit(value, description = descriptionAustralianDollar)
    
    /**
    * Creates object for hold of Australian dollar
    */
    val Number.AUD : AustralianDollar
        /**
        * Returns value of object for hold of Australian dollar
        */
        get() = AustralianDollar(this.toDouble())

    /**
    * Holder for  of Australian dollar
    */
    val AUD = AustralianDollar()

    /**
    * Creates object for hold of Australian dollar
    */
    val Number.`A$` : AustralianDollar
        /**
        * Returns value of object for hold of Australian dollar
        */
        get() = AustralianDollar(this.toDouble())

    /**
    * Holder for  of Australian dollar
    */
    val `A$` = AustralianDollar()
    