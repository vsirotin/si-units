
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionRenminbi = UnitSpecification(
    "CNY",
    "`人民币`"
) { v: Double -> Renminbi(v) }

/**
* Class for hold of Renminbi
* @constructor Creates a class for hold of Renminbi with given [value]
*/
class Renminbi(value : Double = 1.0) : Expression(value, description = descriptionRenminbi)
    
    /**
    * Creates object for hold of Renminbi
    */
    val Number.CNY : Renminbi
        /**
        * Returns value of object for hold of Renminbi
        */
        get() = Renminbi(this.toDouble())

    /**
    * Holder for  of Renminbi
    */
    val CNY = Renminbi()

    /**
    * Creates object for hold of Renminbi
    */
    val Number.`人民币` : Renminbi
        /**
        * Returns value of object for hold of Renminbi
        */
        get() = Renminbi(this.toDouble())

    /**
    * Holder for  of Renminbi
    */
    val `人民币` = Renminbi()
    