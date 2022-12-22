
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionUAEDirham = UnitSpecification(
    "AED",
    "Dh"
) { v: Double -> UAEDirham(v) }

/**
* Class for hold of UAE dirham
* @constructor Creates a class for hold of UAE dirham with given [value]
*/
class UAEDirham(value : Double = 1.0) : TermUnit(value, description = descriptionUAEDirham)
    
    /**
    * Creates object for hold of UAE dirham
    */
    val Number.AED : UAEDirham
        /**
        * Returns value of object for hold of UAE dirham
        */
        get() = UAEDirham(this.toDouble())

    /**
    * Holder for  of UAE dirham
    */
    val AED = UAEDirham()

    /**
    * Creates object for hold of UAE dirham
    */
    val Number.Dh : UAEDirham
        /**
        * Returns value of object for hold of UAE dirham
        */
        get() = UAEDirham(this.toDouble())

    /**
    * Holder for  of UAE dirham
    */
    val Dh = UAEDirham()
    