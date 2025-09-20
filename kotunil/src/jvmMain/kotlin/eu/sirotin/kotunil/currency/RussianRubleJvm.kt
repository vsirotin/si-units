package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Russian ruble
*/
val Number.`₽` : RussianRuble
    /**
    * Returns the value of the object holding Russian ruble
    */
    get() = RussianRuble(this.toDouble())

/**
* One unit of Russian ruble
*/
val `₽` = RussianRuble()
