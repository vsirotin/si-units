
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Colombian peso
*/
val Number.`COL$` : ColombianPeso
    /**
    * Returns value of object for hold of Colombian peso
    */
    get() = ColombianPeso(this.toDouble())

/**
* One unit of Colombian peso
*/
val `COL$` = ColombianPeso() 
    