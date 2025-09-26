package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Renminbi
*/
val Number.`人民币` : Renminbi
    /**
    * Returns the value of the object holding Renminbi
    */
    get() = Renminbi(this.toDouble())

/**
* One unit of Renminbi
*/
val `人民币` = Renminbi()
