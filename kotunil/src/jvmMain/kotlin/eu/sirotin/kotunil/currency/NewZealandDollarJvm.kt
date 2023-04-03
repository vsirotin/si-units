package eu.sirotin.kotunil.currency


/**
* Creates object for hold of New Zealand dollar
*/
val Number.`NZ$` : NewZealandDollar
    /**
    * Returns value of object for hold of New Zealand dollar
    */
    get() = NewZealandDollar(this.toDouble())

/**
* One unit of New Zealand dollar
*/
@JvmField
val `NZ$` = NewZealandDollar()
