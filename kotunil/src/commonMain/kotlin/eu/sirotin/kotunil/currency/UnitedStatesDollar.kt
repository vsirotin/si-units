
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionUnitedStatesDollar = UnitSpecification(
    "USD",
    "`US$`"
) { v: Double -> UnitedStatesDollar(v) }

/**
* Class for hold of United States dollar
* @constructor Creates a class for hold of United States dollar with given [value]
*/
@JsExport
class UnitedStatesDollar(value : Double = 1.0) : Expression(value, description = descriptionUnitedStatesDollar)
    
    /**
    * Creates object for hold of United States dollar
    */
    val Number.USD : UnitedStatesDollar
        /**
        * Returns value of object for hold of United States dollar
        */
        get() = UnitedStatesDollar(this.toDouble())

    /**
    * Holder for  of United States dollar
    */
    @JsExport
    @JvmField()
    val USD = UnitedStatesDollar()   
    