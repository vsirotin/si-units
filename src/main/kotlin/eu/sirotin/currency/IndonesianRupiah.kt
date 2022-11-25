
package eu.sirotin.currency

import eu.sirotin.siunits.core.TermUnit
import eu.sirotin.siunits.core.UnitSpecification

private val descriptionIndonesianRupiah = UnitSpecification(
    "IDR",
    "Rp"
) { v: Double -> IndonesianRupiah(v) }

/**
* Class for hold of Indonesian rupiah
* @constructor Creates a class for hold of Indonesian rupiah
*/
class IndonesianRupiah(value : Double = 1.0) : TermUnit(value, description = descriptionIndonesianRupiah)
    
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

    /**
    * Creates object for hold of Indonesian rupiah
    */
    val Number.Rp : IndonesianRupiah
        /**
        * Returns value of object for hold of Indonesian rupiah
        */
        get() = IndonesianRupiah(this.toDouble())

    /**
    * Holder for  of Indonesian rupiah
    */
    val Rp = IndonesianRupiah()
    