
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Romanian leu
*/
val Number.L : RomanianLeu
    /**
    * Returns value of object for hold of Romanian leu
    */
    get() = RomanianLeu(this.toDouble())

/**
* One unit of Romanian leu
*/
val L = RomanianLeu() 
    