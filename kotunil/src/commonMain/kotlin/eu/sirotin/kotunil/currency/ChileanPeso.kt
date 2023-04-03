
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionChileanPeso = UnitSpecification(
    "CLP",
    "`CLP$`"
) { v: Double -> ChileanPeso(v) }

/**
* Class for hold of Chilean peso
* @constructor Creates a class for hold of Chilean peso with given [value]
*/
//@JsExport
class ChileanPeso(value : Double = 1.0) : Expression(value, description = descriptionChileanPeso)
    
    /**
    * Creates object for hold of Chilean peso
    */
    val Number.CLP : ChileanPeso
        /**
        * Returns value of object for hold of Chilean peso
        */
        get() = ChileanPeso(this.toDouble())

    /**
    * Holder for  of Chilean peso
    */
    //@JsExport
    @JvmField
    val CLP = ChileanPeso()   
    