package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Philippine peso
*/
val Number.`₱` : PhilippinePeso
    /**
    * Returns the value of the object holding Philippine peso
    */
    get() = PhilippinePeso(this.toDouble())

/**
* One unit of Philippine peso
*/
val `₱` = PhilippinePeso()
