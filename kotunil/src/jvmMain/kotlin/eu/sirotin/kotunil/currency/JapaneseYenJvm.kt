package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Japanese yen
*/
val Number.`¥` : JapaneseYen
    /**
    * Returns the value of the object holding Japanese yen
    */
    get() = JapaneseYen(this.toDouble())

/**
* One unit of Japanese yen
*/
val `¥` = JapaneseYen()
