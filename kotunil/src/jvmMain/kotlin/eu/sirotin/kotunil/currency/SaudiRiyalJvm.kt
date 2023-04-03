package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Saudi riyal
*/
val Number.`﷼ ` : SaudiRiyal
    /**
    * Returns value of object for hold of Saudi riyal
    */
    get() = SaudiRiyal(this.toDouble())

/**
* One unit of Saudi riyal
*/
@JvmField
val `﷼ ` = SaudiRiyal()
