
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of South African rand
*/
val Number.R : SouthAfricanRand
    /**
    * Returns value of object for hold of South African rand
    */
    get() = SouthAfricanRand(this.toDouble())

/**
* One unit of South African rand
*/
val R = SouthAfricanRand() 
    