package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Euro
*/
val Number.`€` : Euro
    /**
    * Returns the value of the object holding Euro
    */
    get() = Euro(this.toDouble())

/**
* One unit of Euro
*/
val `€` = Euro()
