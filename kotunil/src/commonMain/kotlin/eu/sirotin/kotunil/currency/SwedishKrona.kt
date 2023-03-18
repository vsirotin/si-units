
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField

private val descriptionSwedishKrona = UnitSpecification(
    "SEK",
    "skr"
) { v: Double -> SwedishKrona(v) }

/**
* Class for hold of Swedish krona
* @constructor Creates a class for hold of Swedish krona with given [value]
*/
class SwedishKrona(value : Double = 1.0) : Expression(value, description = descriptionSwedishKrona)
    
    /**
    * Creates object for hold of Swedish krona
    */
    val Number.SEK : SwedishKrona
        /**
        * Returns value of object for hold of Swedish krona
        */
        get() = SwedishKrona(this.toDouble())

    /**
    * Holder for  of Swedish krona
    */
    @JvmField()
    val SEK = SwedishKrona()   
    

/**
* Creates object for hold of Swedish krona
*/
val Number.skr : SwedishKrona
    /**
    * Returns value of object for hold of Swedish krona
    */
    get() = SwedishKrona(this.toDouble())

/**
* One unit of Swedish krona
*/
@JvmField()
val skr = SwedishKrona()
