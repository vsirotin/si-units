package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Polish złoty
*/
val Number.`zł` : PolishZłoty
    /**
    * Returns the value of the object holding Polish złoty
    */
    get() = PolishZłoty(this.toDouble())

/**
* One unit of Polish złoty
*/
val `zł` = PolishZłoty()
