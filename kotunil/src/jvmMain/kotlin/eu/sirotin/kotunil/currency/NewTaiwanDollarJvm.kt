package eu.sirotin.kotunil.currency


/**
* Creates an object to hold New Taiwan dollar
*/
val Number.`NT$` : NewTaiwanDollar
    /**
    * Returns the value of the object holding New Taiwan dollar
    */
    get() = NewTaiwanDollar(this.toDouble())

/**
* One unit of New Taiwan dollar
*/
val `NT$` = NewTaiwanDollar()
