package eu.sirotin.kotunil.currency


/**
* Creates an object to hold New Zealand dollar
*/
val Number.`NZ$` : NewZealandDollar
    /**
    * Returns the value of the object holding New Zealand dollar
    */
    get() = NewZealandDollar(this.toDouble())

/**
* One unit of New Zealand dollar
*/
val `NZ$` = NewZealandDollar()
