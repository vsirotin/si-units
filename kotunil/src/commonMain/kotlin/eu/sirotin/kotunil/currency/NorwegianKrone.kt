
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val descriptionNorwegianKrone = UnitSpecification(
    "NOK",
    "nkr"
) { v: Double -> NorwegianKrone(v) }

/**
* Class for hold of Norwegian krone
* @constructor Creates a class for hold of Norwegian krone with given [value]
*/
@JsExport
class NorwegianKrone(value : Double = 1.0) : Expression(value, description = descriptionNorwegianKrone)
    
    /**
    * Creates object for hold of Norwegian krone
    */
    val Number.NOK : NorwegianKrone
        /**
        * Returns value of object for hold of Norwegian krone
        */
        get() = NorwegianKrone(this.toDouble())

    /**
    * Holder for  of Norwegian krone
    */
    @JsExport
    @JsName("NOK")
    @JvmField
    val NOK = NorwegianKrone()   
    

/**
* Creates an object to hold Norwegian krone
*/
val Number.nkr : NorwegianKrone
    /**
    * Returns the value of the object holding Norwegian krone
    */
    get() = NorwegianKrone(this.toDouble())

/**
* One unit of Norwegian krone
*/
val nkr = NorwegianKrone()
