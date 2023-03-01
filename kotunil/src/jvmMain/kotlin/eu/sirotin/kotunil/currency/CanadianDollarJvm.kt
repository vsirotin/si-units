package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Canadian dollar
*/
val Number.`C$` : CanadianDollar
    /**
    * Returns value of object for hold of Canadian dollar
    */
    get() = CanadianDollar(this.toDouble())

/**
* One unit of Canadian dollar
*/
val `C$` = CanadianDollar()
