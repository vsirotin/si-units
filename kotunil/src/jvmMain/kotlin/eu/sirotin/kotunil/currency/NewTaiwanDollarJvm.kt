package eu.sirotin.kotunil.currency


/**
* Creates object for hold of New Taiwan dollar
*/
val Number.`NT$` : NewTaiwanDollar
    /**
    * Returns value of object for hold of New Taiwan dollar
    */
    get() = NewTaiwanDollar(this.toDouble())

/**
* One unit of New Taiwan dollar
*/
@JvmField()
val `NT$` = NewTaiwanDollar()
