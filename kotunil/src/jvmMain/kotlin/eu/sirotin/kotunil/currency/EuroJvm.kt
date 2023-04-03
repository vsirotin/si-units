package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Euro
*/
val Number.`€` : Euro
    /**
    * Returns value of object for hold of Euro
    */
    get() = Euro(this.toDouble())

/**
* One unit of Euro
*/
@JvmField
val `€` = Euro()
