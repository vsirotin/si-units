package eu.sirotin.kotunil.currency


/**
* Creates an object to hold Brazilian real
*/
val Number.`R$` : BrazilianReal
    /**
    * Returns the value of the object holding Brazilian real
    */
    get() = BrazilianReal(this.toDouble())

/**
* One unit of Brazilian real
*/
val `R$` = BrazilianReal()
