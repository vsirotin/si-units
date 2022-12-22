
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionSwedishKrona = UnitSpecification(
    "SEK",
    "skr"
) { v: Double -> SwedishKrona(v) }

/**
* Class for hold of Swedish krona
* @constructor Creates a class for hold of Swedish krona with given [value]
*/
class SwedishKrona(value : Double = 1.0) : TermUnit(value, description = descriptionSwedishKrona)
    
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
    * Holder for  of Swedish krona
    */
    val skr = SwedishKrona()
    