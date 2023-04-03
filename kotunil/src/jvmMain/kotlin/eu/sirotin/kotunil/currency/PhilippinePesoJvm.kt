package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Philippine peso
*/
val Number.`₱` : PhilippinePeso
    /**
    * Returns value of object for hold of Philippine peso
    */
    get() = PhilippinePeso(this.toDouble())

/**
* One unit of Philippine peso
*/
@JvmField
val `₱` = PhilippinePeso()
