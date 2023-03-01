
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Brazilian real
*/
val Number.`R$` : BrazilianReal
    /**
    * Returns value of object for hold of Brazilian real
    */
    get() = BrazilianReal(this.toDouble())

/**
* One unit of Brazilian real
*/
val `R$` = BrazilianReal() 
    