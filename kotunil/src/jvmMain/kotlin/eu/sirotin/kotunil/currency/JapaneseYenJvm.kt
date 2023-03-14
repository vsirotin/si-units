package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Japanese yen
*/
val Number.`¥` : JapaneseYen
    /**
    * Returns value of object for hold of Japanese yen
    */
    get() = JapaneseYen(this.toDouble())

/**
* One unit of Japanese yen
*/
@JvmField()
val `¥` = JapaneseYen()
