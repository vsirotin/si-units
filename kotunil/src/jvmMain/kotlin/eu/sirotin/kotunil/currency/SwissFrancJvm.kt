
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Swiss franc
*/
val Number.SCHF : SwissFranc
    /**
    * Returns value of object for hold of Swiss franc
    */
    get() = SwissFranc(this.toDouble())

/**
* One unit of Swiss franc
*/
val SCHF = SwissFranc() 
    