
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField

private val descriptionRomanianLeu = UnitSpecification(
    "RON",
    "RL"
) { v: Double -> RomanianLeu(v) }

/**
* Class for hold of Romanian leu
* @constructor Creates a class for hold of Romanian leu with given [value]
*/
class RomanianLeu(value : Double = 1.0) : Expression(value, description = descriptionRomanianLeu)
    
    /**
    * Creates object for hold of Romanian leu
    */
    val Number.RON : RomanianLeu
        /**
        * Returns value of object for hold of Romanian leu
        */
        get() = RomanianLeu(this.toDouble())

    /**
    * Holder for  of Romanian leu
    */
    @JvmField()
    val RON = RomanianLeu()   
    

/**
* Creates object for hold of Romanian leu
*/
val Number.RL : RomanianLeu
    /**
    * Returns value of object for hold of Romanian leu
    */
    get() = RomanianLeu(this.toDouble())

/**
* One unit of Romanian leu
*/
@JvmField()
val RL = RomanianLeu()
