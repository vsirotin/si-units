
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Indonesian rupiah
*/
val Number.Rp : IndonesianRupiah
    /**
    * Returns value of object for hold of Indonesian rupiah
    */
    get() = IndonesianRupiah(this.toDouble())

/**
* One unit of Indonesian rupiah
*/
val Rp = IndonesianRupiah() 
    