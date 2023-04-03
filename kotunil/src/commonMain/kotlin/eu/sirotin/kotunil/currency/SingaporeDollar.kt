
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionSingaporeDollar = UnitSpecification(
    "SGD",
    "`S$`"
) { v: Double -> SingaporeDollar(v) }

/**
* Class for hold of Singapore dollar
* @constructor Creates a class for hold of Singapore dollar with given [value]
*/
//@JsExport
class SingaporeDollar(value : Double = 1.0) : Expression(value, description = descriptionSingaporeDollar)
    
    /**
    * Creates object for hold of Singapore dollar
    */
    val Number.SGD : SingaporeDollar
        /**
        * Returns value of object for hold of Singapore dollar
        */
        get() = SingaporeDollar(this.toDouble())

    /**
    * Holder for  of Singapore dollar
    */
    //@JsExport
    @JvmField
    val SGD = SingaporeDollar()   
    