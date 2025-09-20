package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Israeli new shekel
*/
val Number.`₪` : IsraeliNewShekel
    /**
    * Returns the value of the object holding Israeli new shekel
    */
    get() = IsraeliNewShekel(this.toDouble())

/**
* One unit of Israeli new shekel
*/
val `₪` = IsraeliNewShekel()
