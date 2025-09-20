package eu.sirotin.kotunil.currency


/**
* Creates an object to hold  Czech koruna
*/
val Number.`Kč` : CzechKoruna
    /**
    * Returns the value of the object holding  Czech koruna
    */
    get() = CzechKoruna(this.toDouble())

/**
* One unit of  Czech koruna
*/
val `Kč` = CzechKoruna()
