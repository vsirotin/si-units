
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val descriptionHungarianForint = UnitSpecification(
    "HUF",
    "Ft"
) { v: Double -> HungarianForint(v) }

/**
* Class for hold of Hungarian forint
* @constructor Creates a class for hold of Hungarian forint with given [value]
*/
@JsExport
class HungarianForint(value : Double = 1.0) : Expression(value, description = descriptionHungarianForint)
    
    /**
    * Creates object for hold of Hungarian forint
    */
    val Number.HUF : HungarianForint
        /**
        * Returns value of object for hold of Hungarian forint
        */
        get() = HungarianForint(this.toDouble())

    /**
    * Holder for  of Hungarian forint
    */
    @JsExport
    @JsName("HUF")
    @JvmField
    val HUF = HungarianForint()   
    

/**
* Creates an object to hold Hungarian forint
*/
val Number.Ft : HungarianForint
    /**
    * Returns the value of the object holding Hungarian forint
    */
    get() = HungarianForint(this.toDouble())

/**
* One unit of Hungarian forint
*/
val Ft = HungarianForint()
