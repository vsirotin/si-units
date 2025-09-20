package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Sterling
*/
val Number.`£` : PoundSterling
    /**
    * Returns the value of the object holding Sterling
    */
    get() = PoundSterling(this.toDouble())

/**
* One unit of Sterling
*/
val `£` = PoundSterling()
