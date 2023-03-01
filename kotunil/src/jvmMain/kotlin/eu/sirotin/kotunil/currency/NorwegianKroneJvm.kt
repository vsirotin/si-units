
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Norwegian krone
*/
val Number.nkr : NorwegianKrone
    /**
    * Returns value of object for hold of Norwegian krone
    */
    get() = NorwegianKrone(this.toDouble())

/**
* One unit of Norwegian krone
*/
val nkr = NorwegianKrone() 
    