package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Mexican peso
*/
val Number.`$` : MexicanPeso
    /**
    * Returns value of object for hold of Mexican peso
    */
    get() = MexicanPeso(this.toDouble())

/**
* One unit of Mexican peso
*/
val `$` = MexicanPeso()
