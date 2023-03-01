
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of UAE dirham
*/
val Number.Dh : UAEDirham
    /**
    * Returns value of object for hold of UAE dirham
    */
    get() = UAEDirham(this.toDouble())

/**
* One unit of UAE dirham
*/
val Dh = UAEDirham() 
    