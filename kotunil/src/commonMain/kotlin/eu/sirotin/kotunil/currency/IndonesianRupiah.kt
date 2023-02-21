
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification

private val descriptionIndonesianRupiah = UnitSpecification(
    "IDR",
    "Rp"
) { v: Double -> IndonesianRupiah(v) }

/**
* Class for hold of Indonesian rupiah
* @constructor Creates a class for hold of Indonesian rupiah with given [value]
*/
class IndonesianRupiah(value : Double = 1.0) : Expression(value, description = descriptionIndonesianRupiah)
    
    /**
    * Creates object for hold of Indonesian rupiah
    */
    val Number.IDR : IndonesianRupiah
        /**
        * Returns value of object for hold of Indonesian rupiah
        */
        get() = IndonesianRupiah(this.toDouble())

    /**
    * Holder for  of Indonesian rupiah
    */
    val IDR = IndonesianRupiah()

    
    
    