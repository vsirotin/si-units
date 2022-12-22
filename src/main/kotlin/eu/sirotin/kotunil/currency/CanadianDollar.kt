
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionCanadianDollar = UnitSpecification(
    "CAD",
    "`C$`"
) { v: Double -> CanadianDollar(v) }

/**
* Class for hold of Canadian dollar
* @constructor Creates a class for hold of Canadian dollar with given [value]
*/
class CanadianDollar(value : Double = 1.0) : TermUnit(value, description = descriptionCanadianDollar)
    
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
    val CAD = CanadianDollar()

    /**
    * Creates object for hold of Canadian dollar
    */
    val Number.`C$` : CanadianDollar
        /**
        * Returns value of object for hold of Canadian dollar
        */
        get() = CanadianDollar(this.toDouble())

    /**
    * Holder for  of Canadian dollar
    */
    val `C$` = CanadianDollar()
    