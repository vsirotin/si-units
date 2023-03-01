package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Russian ruble
*/
val Number.`₽` : RussianRuble
    /**
    * Returns value of object for hold of Russian ruble
    */
    get() = RussianRuble(this.toDouble())

/**
* One unit of Russian ruble
*/
val `₽` = RussianRuble()
