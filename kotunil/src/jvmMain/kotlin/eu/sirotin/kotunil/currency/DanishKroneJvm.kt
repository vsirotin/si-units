
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Danish krone
*/
val Number.dkr : DanishKrone
    /**
    * Returns value of object for hold of Danish krone
    */
    get() = DanishKrone(this.toDouble())

/**
* One unit of Danish krone
*/
val dkr = DanishKrone() 
    