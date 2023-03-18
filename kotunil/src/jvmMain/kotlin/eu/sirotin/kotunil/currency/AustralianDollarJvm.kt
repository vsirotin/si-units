package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Australian dollar
*/
val Number.`A$` : AustralianDollar
    /**
    * Returns value of object for hold of Australian dollar
    */
    get() = AustralianDollar(this.toDouble())

/**
* One unit of Australian dollar
*/
@JvmField()
val `A$` = AustralianDollar()
