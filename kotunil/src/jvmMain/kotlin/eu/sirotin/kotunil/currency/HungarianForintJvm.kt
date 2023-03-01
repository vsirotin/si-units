
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Hungarian forint
*/
val Number.Ft : HungarianForint
    /**
    * Returns value of object for hold of Hungarian forint
    */
    get() = HungarianForint(this.toDouble())

/**
* One unit of Hungarian forint
*/
val Ft = HungarianForint() 
    