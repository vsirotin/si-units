package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Renminbi
*/
val Number.`人民币` : Renminbi
    /**
    * Returns value of object for hold of Renminbi
    */
    get() = Renminbi(this.toDouble())

/**
* One unit of Renminbi
*/
@JvmField()
val `人民币` = Renminbi()
