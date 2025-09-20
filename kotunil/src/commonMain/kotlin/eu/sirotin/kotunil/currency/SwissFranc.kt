
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val descriptionSwissFranc = UnitSpecification(
    "CHF",
    "SCHF"
) { v: Double -> SwissFranc(v) }

/**
* Class for hold of Swiss franc
* @constructor Creates a class for hold of Swiss franc with given [value]
*/
@JsExport
class SwissFranc(value : Double = 1.0) : Expression(value, description = descriptionSwissFranc)
    
    /**
    * Creates object for hold of Swiss franc
    */
    val Number.CHF : SwissFranc
        /**
        * Returns value of object for hold of Swiss franc
        */
        get() = SwissFranc(this.toDouble())

    /**
    * Holder for  of Swiss franc
    */
    @JsExport
    @JsName("CHF")
    @JvmField
    val CHF = SwissFranc()   
    

/**
* Creates an object to hold Swiss franc
*/
val Number.SCHF : SwissFranc
    /**
    * Returns the value of the object holding Swiss franc
    */
    get() = SwissFranc(this.toDouble())

/**
* One unit of Swiss franc
*/
val SCHF = SwissFranc()
