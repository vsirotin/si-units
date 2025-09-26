package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Mexican peso
*/
val Number.`$` : MexicanPeso
    /**
    * Returns the value of the object holding Mexican peso
    */
    get() = MexicanPeso(this.toDouble())

/**
* One unit of Mexican peso
*/
val `$` = MexicanPeso()
