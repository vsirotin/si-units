
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Singapore dollar
*/
val Number.`S$` : SingaporeDollar
    /**
    * Returns value of object for hold of Singapore dollar
    */
    get() = SingaporeDollar(this.toDouble())

/**
* One unit of Singapore dollar
*/
val `S$` = SingaporeDollar() 
    