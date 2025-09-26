package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Canadian dollar
*/
val Number.`C$` : CanadianDollar
    /**
    * Returns the value of the object holding Canadian dollar
    */
    get() = CanadianDollar(this.toDouble())

/**
* One unit of Canadian dollar
*/
val `C$` = CanadianDollar()
