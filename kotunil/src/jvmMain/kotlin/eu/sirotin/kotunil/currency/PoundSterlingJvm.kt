package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Sterling
*/
val Number.`£` : PoundSterling
    /**
    * Returns value of object for hold of Sterling
    */
    get() = PoundSterling(this.toDouble())

/**
* One unit of Sterling
*/
@JvmField()
val `£` = PoundSterling()
