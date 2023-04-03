
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionMexicanPeso = UnitSpecification(
    "MXN",
    "`$`"
) { v: Double -> MexicanPeso(v) }

/**
* Class for hold of Mexican peso
* @constructor Creates a class for hold of Mexican peso with given [value]
*/
//@JsExport
class MexicanPeso(value : Double = 1.0) : Expression(value, description = descriptionMexicanPeso)
    
    /**
    * Creates object for hold of Mexican peso
    */
    val Number.MXN : MexicanPeso
        /**
        * Returns value of object for hold of Mexican peso
        */
        get() = MexicanPeso(this.toDouble())

    /**
    * Holder for  of Mexican peso
    */
    //@JsExport
    @JvmField
    val MXN = MexicanPeso()   
    