
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField

private val descriptionBrazilianReal = UnitSpecification(
    "BRL",
    "`R$`"
) { v: Double -> BrazilianReal(v) }

/**
* Class for hold of Brazilian real
* @constructor Creates a class for hold of Brazilian real with given [value]
*/
class BrazilianReal(value : Double = 1.0) : Expression(value, description = descriptionBrazilianReal)
    
    /**
    * Creates object for hold of Brazilian real
    */
    val Number.BRL : BrazilianReal
        /**
        * Returns value of object for hold of Brazilian real
        */
        get() = BrazilianReal(this.toDouble())

    /**
    * Holder for  of Brazilian real
    */
    @JvmField()
    val BRL = BrazilianReal()   
    