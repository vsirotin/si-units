
package eu.sirotin.kotunil.currency

import eu.sirotin.kotunil.core.Expression
import eu.sirotin.kotunil.core.UnitSpecification
import kotlin.jvm.JvmField
import kotlin.js.JsExport
import kotlin.js.JsName

private val descriptionIndonesianRupiah = UnitSpecification(
    "IDR",
    "Rp"
) { v: Double -> IndonesianRupiah(v) }

/**
* Class for hold of Indonesian rupiah
* @constructor Creates a class for hold of Indonesian rupiah with given [value]
*/
@JsExport
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
    @JsExport
    @JsName("IDR")
    @JvmField
    val IDR = IndonesianRupiah()   
    

/**
* Creates an object to hold Indonesian rupiah
*/
val Number.Rp : IndonesianRupiah
    /**
    * Returns the value of the object holding Indonesian rupiah
    */
    get() = IndonesianRupiah(this.toDouble())

/**
* One unit of Indonesian rupiah
*/
val Rp = IndonesianRupiah()
