
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionAustralianDollar = UnitSpecification(
    "AUD",
    "`A$`"
) { v: Double -> AustralianDollar(v) }

/**
* Class for hold of Australian dollar
* @constructor Creates a class for hold of Australian dollar with given [value]
*/
//@JsExport
class AustralianDollar(value : Double = 1.0) : Expression(value, description = descriptionAustralianDollar)
    
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
    //@JsExport
    @JvmField
    val AUD = AustralianDollar()   
    