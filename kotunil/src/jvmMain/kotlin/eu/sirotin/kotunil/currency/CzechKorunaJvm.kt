
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of  Czech koruna
*/
val Number.`Kč` : CzechKoruna
    /**
    * Returns value of object for hold of  Czech koruna
    */
    get() = CzechKoruna(this.toDouble())

/**
* One unit of  Czech koruna
*/
val `Kč` = CzechKoruna() 
    