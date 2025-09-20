package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Singapore dollar
*/
val Number.`S$` : SingaporeDollar
    /**
    * Returns the value of the object holding Singapore dollar
    */
    get() = SingaporeDollar(this.toDouble())

/**
* One unit of Singapore dollar
*/
val `S$` = SingaporeDollar()
