
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport

private val descriptionCanadianDollar = UnitSpecification(
    "CAD",
    "`C$`"
) { v: Double -> CanadianDollar(v) }

/**
* Class for hold of Canadian dollar
* @constructor Creates a class for hold of Canadian dollar with given [value]
*/
@JsExport
class CanadianDollar(value : Double = 1.0) : Expression(value, description = descriptionCanadianDollar)
    
    /**
    * Creates object for hold of Canadian dollar
    */
    val Number.CAD : CanadianDollar
        /**
        * Returns value of object for hold of Canadian dollar
        */
        get() = CanadianDollar(this.toDouble())

    /**
    * Holder for  of Canadian dollar
    */
    @JsExport
    @JvmField()
    val CAD = CanadianDollar()   
    