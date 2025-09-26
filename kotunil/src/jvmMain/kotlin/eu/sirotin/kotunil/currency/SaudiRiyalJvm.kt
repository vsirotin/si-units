package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Saudi riyal
*/
val Number.`﷼ ` : SaudiRiyal
    /**
    * Returns the value of the object holding Saudi riyal
    */
    get() = SaudiRiyal(this.toDouble())

/**
* One unit of Saudi riyal
*/
val `﷼ ` = SaudiRiyal()
