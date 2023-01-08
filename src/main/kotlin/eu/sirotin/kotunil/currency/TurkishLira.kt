
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionTurkishLira = UnitSpecification(
    "TRY",
    "`₺`"
) { v: Double -> TurkishLira(v) }

/**
* Class for hold of Turkish lira
* @constructor Creates a class for hold of Turkish lira with given [value]
*/
class TurkishLira(value : Double = 1.0) : Expression(value, description = descriptionTurkishLira)
    
    /**
    * Creates object for hold of Turkish lira
    */
    val Number.TRY : TurkishLira
        /**
        * Returns value of object for hold of Turkish lira
        */
        get() = TurkishLira(this.toDouble())

    /**
    * Holder for  of Turkish lira
    */
    val TRY = TurkishLira()

    /**
    * Creates object for hold of Turkish lira
    */
    val Number.`₺` : TurkishLira
        /**
        * Returns value of object for hold of Turkish lira
        */
        get() = TurkishLira(this.toDouble())

    /**
    * Holder for  of Turkish lira
    */
    val `₺` = TurkishLira()
    