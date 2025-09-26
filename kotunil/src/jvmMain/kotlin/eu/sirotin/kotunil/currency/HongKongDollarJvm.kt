package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Hong Kong dollar
*/
val Number.`HK$` : HongKongDollar
    /**
    * Returns the value of the object holding Hong Kong dollar
    */
    get() = HongKongDollar(this.toDouble())

/**
* One unit of Hong Kong dollar
*/
val `HK$` = HongKongDollar()
