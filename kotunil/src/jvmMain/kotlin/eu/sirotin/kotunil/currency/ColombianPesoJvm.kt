package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Colombian peso
*/
val Number.`COL$` : ColombianPeso
    /**
    * Returns the value of the object holding Colombian peso
    */
    get() = ColombianPeso(this.toDouble())

/**
* One unit of Colombian peso
*/
val `COL$` = ColombianPeso()
