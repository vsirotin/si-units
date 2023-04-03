package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Hong Kong dollar
*/
val Number.`HK$` : HongKongDollar
    /**
    * Returns value of object for hold of Hong Kong dollar
    */
    get() = HongKongDollar(this.toDouble())

/**
* One unit of Hong Kong dollar
*/
@JvmField
val `HK$` = HongKongDollar()
