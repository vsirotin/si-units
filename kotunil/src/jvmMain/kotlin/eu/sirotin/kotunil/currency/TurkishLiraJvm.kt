
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Turkish lira
*/
val Number.`₺` : TurkishLira
    /**
    * Returns value of object for hold of Turkish lira
    */
    get() = TurkishLira(this.toDouble())

/**
* One unit of Turkish lira
*/
val `₺` = TurkishLira() 
    