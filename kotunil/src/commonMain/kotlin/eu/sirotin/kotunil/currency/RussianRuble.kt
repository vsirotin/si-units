
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val descriptionRussianRuble = UnitSpecification(
    "RUB",
    "`₽`"
) { v: Double -> RussianRuble(v) }

/**
* Class for hold of Russian ruble
* @constructor Creates a class for hold of Russian ruble with given [value]
*/
@JsExport
class RussianRuble(value : Double = 1.0) : Expression(value, description = descriptionRussianRuble)
    
    /**
    * Creates object for hold of Russian ruble
    */
    val Number.RUB : RussianRuble
        /**
        * Returns value of object for hold of Russian ruble
        */
        get() = RussianRuble(this.toDouble())

    /**
    * Holder for  of Russian ruble
    */
    @JsExport
    @JsName("RUB")
    @JvmField
    val RUB = RussianRuble()   
    