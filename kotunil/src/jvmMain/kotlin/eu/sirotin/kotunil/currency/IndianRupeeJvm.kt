package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Indian rupee
*/
val Number.`₹` : IndianRupee
    /**
    * Returns the value of the object holding Indian rupee
    */
    get() = IndianRupee(this.toDouble())

/**
* One unit of Indian rupee
*/
val `₹` = IndianRupee()
