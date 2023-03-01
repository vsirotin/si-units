package eu.sirotin.kotunil.currency


/**
* Creates object for hold of Polish złoty
*/
val Number.`zł` : PolishZłoty
    /**
    * Returns value of object for hold of Polish złoty
    */
    get() = PolishZłoty(this.toDouble())

/**
* One unit of Polish złoty
*/
val `zł` = PolishZłoty()
