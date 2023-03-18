
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField

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
    @JvmField()
    val CNY = Renminbi()   
    