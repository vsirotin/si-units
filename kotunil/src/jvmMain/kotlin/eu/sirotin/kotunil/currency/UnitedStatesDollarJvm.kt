
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of United States dollar
*/
val Number.`US$` : UnitedStatesDollar
    /**
    * Returns value of object for hold of United States dollar
    */
    get() = UnitedStatesDollar(this.toDouble())

/**
* One unit of United States dollar
*/
val `US$` = UnitedStatesDollar() 
    