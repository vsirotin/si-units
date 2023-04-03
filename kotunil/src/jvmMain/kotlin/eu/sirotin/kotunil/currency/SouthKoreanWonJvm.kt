package eu.sirotin.kotunil.currency


/**
* Creates object for hold of  South Korean won
*/
val Number.`₩` : SouthKoreanWon
    /**
    * Returns value of object for hold of  South Korean won
    */
    get() = SouthKoreanWon(this.toDouble())

/**
* One unit of  South Korean won
*/
@JvmField
val `₩` = SouthKoreanWon()
