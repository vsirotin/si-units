
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionSouthAfricanRand = UnitSpecification(
    "ZAR",
    "R"
) { v: Double -> SouthAfricanRand(v) }

/**
* Class for hold of South African rand
* @constructor Creates a class for hold of South African rand with given [value]
*/
class SouthAfricanRand(value : Double = 1.0) : TermUnit(value, description = descriptionSouthAfricanRand)
    
    /**
    * Creates object for hold of South African rand
    */
    val Number.ZAR : SouthAfricanRand
        /**
        * Returns value of object for hold of South African rand
        */
        get() = SouthAfricanRand(this.toDouble())

    /**
    * Holder for  of South African rand
    */
    val ZAR = SouthAfricanRand()

    /**
    * Creates object for hold of South African rand
    */
    val Number.R : SouthAfricanRand
        /**
        * Returns value of object for hold of South African rand
        */
        get() = SouthAfricanRand(this.toDouble())

    /**
    * Holder for  of South African rand
    */
    val R = SouthAfricanRand()
    