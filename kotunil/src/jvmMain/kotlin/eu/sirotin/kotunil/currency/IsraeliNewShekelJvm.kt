
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Israeli new shekel
*/
val Number.`₪` : IsraeliNewShekel
    /**
    * Returns value of object for hold of Israeli new shekel
    */
    get() = IsraeliNewShekel(this.toDouble())

/**
* One unit of Israeli new shekel
*/
val `₪` = IsraeliNewShekel() 
    