package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Australian dollar
*/
val Number.`A$` : AustralianDollar
    /**
    * Returns the value of the object holding Australian dollar
    */
    get() = AustralianDollar(this.toDouble())

/**
* One unit of Australian dollar
*/
val `A$` = AustralianDollar()
