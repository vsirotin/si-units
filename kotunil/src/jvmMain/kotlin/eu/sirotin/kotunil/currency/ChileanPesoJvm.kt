package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Chilean peso
*/
val Number.`CLP$` : ChileanPeso
    /**
    * Returns value of object for hold of Chilean peso
    */
    get() = ChileanPeso(this.toDouble())

/**
* One unit of Chilean peso
*/
val `CLP$` = ChileanPeso()
