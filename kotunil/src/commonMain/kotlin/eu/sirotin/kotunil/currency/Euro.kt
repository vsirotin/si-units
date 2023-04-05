
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val descriptionEuro = UnitSpecification(
    "EUR",
    "`€`"
) { v: Double -> Euro(v) }

/**
* Class for hold of Euro
* @constructor Creates a class for hold of Euro with given [value]
*/
@JsExport
class Euro(value : Double = 1.0) : Expression(value, description = descriptionEuro)
    
    /**
    * Creates object for hold of Euro
    */
    val Number.EUR : Euro
        /**
        * Returns value of object for hold of Euro
        */
        get() = Euro(this.toDouble())

    /**
    * Holder for  of Euro
    */
    @JsExport
    @JsName("EUR")
    @JvmField
    val EUR = Euro()   
    