package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Turkish lira
*/
val Number.`₺` : TurkishLira
    /**
    * Returns the value of the object holding Turkish lira
    */
    get() = TurkishLira(this.toDouble())

/**
* One unit of Turkish lira
*/
val `₺` = TurkishLira()
