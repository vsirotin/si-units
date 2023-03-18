
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField

private val descriptionPolishZłoty = UnitSpecification(
    "PLN",
    "`zł`"
) { v: Double -> PolishZłoty(v) }

/**
* Class for hold of Polish złoty
* @constructor Creates a class for hold of Polish złoty with given [value]
*/
class PolishZłoty(value : Double = 1.0) : Expression(value, description = descriptionPolishZłoty)
    
    /**
    * Creates object for hold of Polish złoty
    */
    val Number.PLN : PolishZłoty
        /**
        * Returns value of object for hold of Polish złoty
        */
        get() = PolishZłoty(this.toDouble())

    /**
    * Holder for  of Polish złoty
    */
    @JvmField()
    val PLN = PolishZłoty()   
    