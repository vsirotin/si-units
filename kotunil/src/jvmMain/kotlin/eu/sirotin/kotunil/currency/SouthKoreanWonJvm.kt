package eu.sirotin.kotunil.currency


/**
* Creates an object to hold  South Korean won
*/
val Number.`₩` : SouthKoreanWon
    /**
    * Returns the value of the object holding  South Korean won
    */
    get() = SouthKoreanWon(this.toDouble())

/**
* One unit of  South Korean won
*/
val `₩` = SouthKoreanWon()
