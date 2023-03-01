
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Swedish krona
*/
val Number.skr : SwedishKrona
    /**
    * Returns value of object for hold of Swedish krona
    */
    get() = SwedishKrona(this.toDouble())

/**
* One unit of Swedish krona
*/
val skr = SwedishKrona() 
    