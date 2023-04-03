package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Indian rupee
*/
val Number.`₹` : IndianRupee
    /**
    * Returns value of object for hold of Indian rupee
    */
    get() = IndianRupee(this.toDouble())

/**
* One unit of Indian rupee
*/
@JvmField
val `₹` = IndianRupee()
