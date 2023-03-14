package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Thai baht
*/
val Number.`฿` : ThaiBaht
    /**
    * Returns value of object for hold of Thai baht
    */
    get() = ThaiBaht(this.toDouble())

/**
* One unit of Thai baht
*/
@JvmField()
val `฿` = ThaiBaht()
