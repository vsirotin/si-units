
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val descriptionThaiBaht = UnitSpecification(
    "THB",
    "`฿`"
) { v: Double -> ThaiBaht(v) }

/**
* Class for hold of Thai baht
* @constructor Creates a class for hold of Thai baht with given [value]
*/
@JsExport
class ThaiBaht(value : Double = 1.0) : Expression(value, description = descriptionThaiBaht)
    
    /**
    * Creates object for hold of Thai baht
    */
    val Number.THB : ThaiBaht
        /**
        * Returns value of object for hold of Thai baht
        */
        get() = ThaiBaht(this.toDouble())

    /**
    * Holder for  of Thai baht
    */
    @JsExport
    @JsName("THB")
    @JvmField
    val THB = ThaiBaht()   
    