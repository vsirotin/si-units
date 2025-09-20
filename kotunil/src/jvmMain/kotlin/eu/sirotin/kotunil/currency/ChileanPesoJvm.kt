package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Chilean peso
*/
val Number.`CLP$` : ChileanPeso
    /**
    * Returns the value of the object holding Chilean peso
    */
    get() = ChileanPeso(this.toDouble())

/**
* One unit of Chilean peso
*/
val `CLP$` = ChileanPeso()
