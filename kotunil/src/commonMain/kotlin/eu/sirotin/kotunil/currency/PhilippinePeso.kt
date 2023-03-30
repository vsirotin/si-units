
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionPhilippinePeso = UnitSpecification(
    "PHP",
    "`₱`"
) { v: Double -> PhilippinePeso(v) }

/**
* Class for hold of Philippine peso
* @constructor Creates a class for hold of Philippine peso with given [value]
*/
@JsExport
class PhilippinePeso(value : Double = 1.0) : Expression(value, description = descriptionPhilippinePeso)
    
    /**
    * Creates object for hold of Philippine peso
    */
    val Number.PHP : PhilippinePeso
        /**
        * Returns value of object for hold of Philippine peso
        */
        get() = PhilippinePeso(this.toDouble())

    /**
    * Holder for  of Philippine peso
    */
    @JsExport
    @JvmField()
    val PHP = PhilippinePeso()   
    