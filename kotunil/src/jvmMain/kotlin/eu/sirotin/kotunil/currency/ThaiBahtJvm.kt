package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Thai baht
*/
val Number.`฿` : ThaiBaht
    /**
    * Returns the value of the object holding Thai baht
    */
    get() = ThaiBaht(this.toDouble())

/**
* One unit of Thai baht
*/
val `฿` = ThaiBaht()
