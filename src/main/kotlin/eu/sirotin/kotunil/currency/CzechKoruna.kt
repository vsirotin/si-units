
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.TermUnit
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionCzechKoruna = UnitSpecification(
    "CZK",
    "`Kč`"
) { v: Double -> CzechKoruna(v) }

/**
* Class for hold of  Czech koruna
* @constructor Creates a class for hold of  Czech koruna with given [value]
*/
class CzechKoruna(value : Double = 1.0) : TermUnit(value, description = descriptionCzechKoruna)
    
    /**
    * Creates object for hold of  Czech koruna
    */
    val Number.CZK : CzechKoruna
        /**
        * Returns value of object for hold of  Czech koruna
        */
        get() = CzechKoruna(this.toDouble())

    /**
    * Holder for  of  Czech koruna
    */
    val CZK = CzechKoruna()

    /**
    * Creates object for hold of  Czech koruna
    */
    val Number.`Kč` : CzechKoruna
        /**
        * Returns value of object for hold of  Czech koruna
        */
        get() = CzechKoruna(this.toDouble())

    /**
    * Holder for  of  Czech koruna
    */
    val `Kč` = CzechKoruna()
    